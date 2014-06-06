package com.example.happytalk.app;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.Map;

/**
 * Created by oVANILLAz on 6/5/14 AD.
 */
public class ExpandableListAdapter extends BaseExpandableListAdapter {

    private Activity context;
    private Map<String, List<String>> groupList;
    private List<String> childList;

    public ExpandableListAdapter(Activity context, List<String> childList, Map<String, List<String>> groupList){
        this.context = context;
        this.groupList = groupList;
        this.childList = childList;
    }

    public Object getChild(int groupPosition , int childPosition){
        return groupList.get(childList.get(groupPosition)).get(childPosition);
    }

    public long getChildId(int groupPosition,int childPosition){
        return childPosition;

    }

    public View getChildView(final int groupPosition,final int childPosition, boolean isLastChild,View convertView,ViewGroup parent){
        final String childList = (String) getChild(groupPosition,childPosition);
        LayoutInflater inflater = context.getLayoutInflater();

        if(convertView ==null){
            convertView = inflater.inflate(R.layout.child_item,null);
        }

        TextView wordFrom = (TextView) convertView.findViewById(R.id.txtWordFrom);
        TextView wordEN = (TextView) convertView.findViewById(R.id.txtWordEN);
        TextView karaokeTH = (TextView) convertView.findViewById(R.id.txtKaraokeTH);
        TextView karaokeEN = (TextView) convertView.findViewById(R.id.txtKaraokeEN);


        ImageView soundImg = (ImageView) convertView.findViewById(R.id.sound);
        soundImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        ImageView favoriteImg = (ImageView) convertView.findViewById(R.id.favorite);
        favoriteImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        wordFrom.setText(childList);
        wordEN.setText(childList);
        karaokeEN.setText(childList);
        karaokeTH.setText(childList);
        return convertView;
    }




    public Object getGroup(int groupPosition){
        return childList.get(groupPosition);
    }

    public int getGroupCount(){
        return childList.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return groupList.get(childList.get(groupPosition)).size();
    }

    public long getGroupId(int groupPosition){
        return groupPosition;
    }


    public View getGroupView(int groupPosition, boolean isExpanded,
                             View convertView, ViewGroup parent) {
        String groupName = (String) getGroup(groupPosition);
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.group_listview,
                    null);
        }
        TextView wordFrom = (TextView) convertView.findViewById(R.id.wordFrom);
        TextView wordEN = (TextView) convertView.findViewById(R.id.wordEN);


        wordFrom.setTypeface(null, Typeface.BOLD);
        wordFrom.setText(groupName);
        wordEN.setText(groupName);
        return convertView;
    }

    public boolean hasStableIds() {
        return true;
    }

    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
