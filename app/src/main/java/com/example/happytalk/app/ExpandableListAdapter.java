package com.example.happytalk.app;

import android.widget.BaseExpandableListAdapter;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import java.util.Map;


/**
 * Created by oVANILLAz on 6/9/14 AD.
 */
public class ExpandableListAdapter extends BaseExpandableListAdapter {
    private Activity context;
    private Map<String, List<String>> group;
    private List<String> child;

    public ExpandableListAdapter(Activity context, List<String> child,
                                 Map<String, List<String>> group) {
        this.context = context;
        this.group = group;
        this.child = child;
    }

    public Object getChild(int groupPosition, int childPosition) {
        return group.get(child.get(groupPosition)).get(childPosition);
    }

    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }


    public View getChildView(final int groupPosition, final int childPosition,
                             boolean isLastChild, View convertView, ViewGroup parent) {
        final String wordFrom = (String) getChild(groupPosition, childPosition);
        final String wordTo = (String) getChild(groupPosition, childPosition);
        final String karaokeTH = (String) getChild(groupPosition, childPosition);
        final String karaokeEN = (String) getChild(groupPosition, childPosition);

        LayoutInflater inflater = context.getLayoutInflater();

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.child_item, null);
        }

        TextView txtwordFrom = (TextView) convertView.findViewById(R.id.txtWordFrom);
        TextView txtwordTo = (TextView) convertView.findViewById(R.id.txtWordTo);
        TextView txtkaraokeTH = (TextView) convertView.findViewById(R.id.txtKaraokeTH);
        TextView txtkaraokeEN = (TextView) convertView.findViewById(R.id.txtKaraokeEN);
        ImageView imgSound = (ImageView) convertView.findViewById(R.id.sound);
        imgSound.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        ImageView imgFavorite = (ImageView)convertView.findViewById(R.id.favorite);
        imgFavorite.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        txtwordFrom.setText(wordFrom);
        txtwordTo.setText(wordTo);
        txtkaraokeTH.setText(karaokeTH);
        txtkaraokeEN.setText(karaokeEN);
        return convertView;


    }

    public int getChildrenCount(int groupPosition) {
        return group.get(child.get(groupPosition)).size();
    }

    public Object getGroup(int groupPosition) {
        return child.get(groupPosition);
    }

    public int getGroupCount() {
        return child.size();
    }

    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    public View getGroupView(int groupPosition, boolean isExpanded,
                             View convertView, ViewGroup parent) {
        String wordFrom = (String) getGroup(groupPosition);
        String wordEN = (String) getGroup(groupPosition);
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.group_listview,
                    null);
        }
        TextView txtwordFrom = (TextView) convertView.findViewById(R.id.wordFrom);
        TextView txtwordEN = (TextView) convertView.findViewById(R.id.wordEN);

        txtwordFrom.setTypeface(null, Typeface.BOLD);
        txtwordFrom.setText(wordFrom);
        txtwordEN.setText(wordEN);
        return convertView;
    }

    public boolean hasStableIds() {
        return true;
    }

    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
