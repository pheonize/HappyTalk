package com.example.happytalk.app;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by oVANILLAz on 6/9/14 AD.
 */
public class MyListAdapter extends BaseExpandableListAdapter {

    private Context context;
    private ArrayList<GroupHeader> groupHeadersList;
    private ArrayList<GroupHeader> originalList;

    public MyListAdapter(Context context,ArrayList<GroupHeader> groupHeadersList){
        this.context = context;
        this.groupHeadersList = new ArrayList<GroupHeader>();
        this.groupHeadersList.addAll(groupHeadersList);
        this.originalList = new ArrayList<GroupHeader>();
        this.originalList = new ArrayList<GroupHeader>();

    }

    @Override
    public Object getChild(int groupPosition,int childPosition){
        ArrayList<Child> childList = groupHeadersList.get(groupPosition).getChildList();
        return childList.get(childPosition);
    }

    @Override
    public long getChildId(int groupPosiion,int childPosition){
        return childPosition;
    }

    @Override
    public View getChildView(int groupPosition,int childPosition,boolean isLastChild,View view ,ViewGroup parent){
       Child child = (Child) getChild(groupPosition, childPosition);
        if(view==null){
           LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.child_item,null);
       }
        TextView txtwordFrom = (TextView) view.findViewById(R.id.txtWordFrom);
        TextView txtwordTo =(TextView) view.findViewById(R.id.txtWordTo);
        TextView txtkaraokeTH = (TextView) view.findViewById(R.id.txtKaraokeTH);
        TextView txtkaraokeEN = (TextView) view.findViewById(R.id.txtKaraokeEN);
        ImageView btnSound = (ImageView) view.findViewById(R.id.sound);
        ImageView btnFavorite = (ImageView) view.findViewById(R.id.favorite);


        txtwordFrom.setText(child.getWordFrom().trim());
        txtwordTo.setText(child.getWordTo().trim());
        txtkaraokeEN.setText(child.getKaraokeEN().trim());
        txtkaraokeTH.setText(child.getKaraokeTH().trim());
        return view;
    }

    @Override
    public int getChildrenCount(int groupPosition){
        ArrayList<Child> childList = groupHeadersList.get(groupPosition).getChildList();
        return childList.size();
    }

    @Override
    public Object getGroup(int groupPosition){
        return groupHeadersList.get(groupPosition);
    }

    @Override
    public int getGroupCount(){
        return groupHeadersList.size();
    }

    @Override
    public long getGroupId(int groupPosition){
        return groupPosition;
    }

    @Override
    public View getGroupView(int groupPosition,boolean isLastChild,View view,ViewGroup parent){

        GroupHeader groupHeader = (GroupHeader) getGroup(groupPosition);
        if(view == null){
            LayoutInflater layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.group_listview,null);
        }

        TextView wordFrom = (TextView)view.findViewById(R.id.wordFrom);
        TextView wordEN = (TextView)view.findViewById(R.id.wordEN);

        wordFrom.setText(groupHeader.getWordFrom().trim());
        //wordEN.setText(groupHeader.getWordEN().trim());

        return view;


    }

    @Override
    public boolean hasStableIds(){
        return true;
    }

    @Override
    public boolean isChildSelectable(int groupPosition,int childPosition){
        return true;
    }


    public void filterData(String qry){
        qry =qry.toLowerCase();

        Log.v("MyListAdapter",String.valueOf(groupHeadersList.size()));
        groupHeadersList.clear();

        if(qry.isEmpty()){
            groupHeadersList.addAll(originalList);
        }
        else{
            for(GroupHeader groupHeader:originalList){
                ArrayList<Child> groupHeaders = groupHeader.getChildList();
                ArrayList<Child> newList = new ArrayList<Child>();

                for(Child child : groupHeaders){
                    if(child.getWordFrom().toLowerCase().contains(qry) || child.getWordTo().toLowerCase().contains(qry)){
                        newList.add(child);
                    }
                }
                if(newList.size()>0){
                    GroupHeader nGroupHeader = new GroupHeader(groupHeader.getWordFrom(),newList);
                    groupHeadersList.add(nGroupHeader);
                }

            }
        }

        Log.v("MyListAdapter" ,String.valueOf(groupHeadersList.size()));
        notifyDataSetChanged();
    }



}
