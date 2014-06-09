package com.example.happytalk.app;

import android.content.Context;
import android.graphics.Typeface;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.HashMap;
import java.util.List;

/**
 * Created by oVANILLAz on 6/9/14 AD.
 */
public class ExpandableListAdapter extends BaseExpandableListAdapter {
    private Context _context;
    private List<String> _listDataHeader; // header titles
    // child data in format of header title, child title
    private HashMap<String, List<String>> _listDataChild;

    public ExpandableListAdapter(Context context, List<String> listDataHeader,
                                 HashMap<String, List<String>> listChildData) {
        this._context = context;
        this._listDataHeader = listDataHeader;
        this._listDataChild = listChildData;
    }

    @Override
    public Object getChild(int groupPosition, int childPosititon) {
        return this._listDataChild.get(this._listDataHeader.get(groupPosition))
                .get(childPosititon);
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public View getChildView(int groupPosition, final int childPosition,
                             boolean isLastChild, View convertView, ViewGroup parent) {

        final String wordFrom = (String) getChild(groupPosition, childPosition);
        final String wordTo = (String) getChild(groupPosition,childPosition);
        final String karaokeEN = (String) getChild(groupPosition,childPosition);
        final String karaokeTH = (String) getChild(groupPosition,childPosition);
        final ImageView sound = (ImageView)getChild(groupPosition,childPosition);
        final ImageView favorite = (ImageView) getChild(groupPosition,childPosition);


        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) this._context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.child_item, null);
        }

        TextView txtwordFrom = (TextView) convertView
                .findViewById(R.id.txtWordFrom);
        TextView txtwordTo =(TextView) convertView.findViewById(R.id.txtWordTo);
        TextView txtkaraokeTH = (TextView) convertView.findViewById(R.id.txtKaraokeTH);
        TextView txtkaraokeEN = (TextView) convertView.findViewById(R.id.txtKaraokeEN);
        ImageView btnSound = (ImageView) convertView.findViewById(R.id.sound);
        ImageView btnFavorite = (ImageView) convertView.findViewById(R.id.favorite);


        txtwordFrom.setText(wordFrom);
        txtwordTo.setText(wordTo);
        txtkaraokeTH.setText(karaokeTH);
        txtkaraokeEN.setText(karaokeEN);
        btnSound.setTag(sound);
        btnFavorite.setTag(favorite);

        return convertView;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return this._listDataChild.get(this._listDataHeader.get(groupPosition))
                .size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return this._listDataHeader.get(groupPosition);
    }

    @Override
    public int getGroupCount() {
        return this._listDataHeader.size();
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded,
                             View convertView, ViewGroup parent) {
        String wordFrom = (String) getGroup(groupPosition);
        String wordEN = (String) getGroup(groupPosition);
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) this._context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.group_listview, null);
        }

        TextView txtwordFrom = (TextView) convertView.findViewById(R.id.wordFrom);
        TextView txtwordEN = (TextView) convertView.findViewById(R.id.wordEN);

        txtwordFrom.setTypeface(null, Typeface.BOLD);
        txtwordFrom.setText(wordFrom);
        txtwordEN.setText(wordEN);

        return convertView;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }

    @Override
    public int getChildTypeCount() {
        return 2;
    }

    @Override
    public int getChildType(int groupPosition, int childPosition) {
        if (getChildId(groupPosition, childPosition)==3)
            return 0;

            //Not free
        else
            return 1;
    }
}
