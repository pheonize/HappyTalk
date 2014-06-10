package com.example.happytalk.app.Database;

import android.app.Activity;
import android.widget.ExpandableListView;
import android.widget.SearchView;

import com.example.happytalk.app.Child;
import com.example.happytalk.app.GroupHeader;
import com.example.happytalk.app.MyListAdapter;
import com.example.happytalk.app.R;

import java.util.ArrayList;

/**
 * Created by oVANILLAz on 6/10/14 AD.
 */
public class ConversationDAL {



    private ArrayList<GroupHeader> groupHeaderList = new ArrayList<GroupHeader>();

    public void loadThaiToBrunei(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("Test1","Test2","Test3","Test4","Test5",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("TEST","SUB",childList);
        groupHeaderList.add(groupHeader);


    }

    public void loadThaiToChina(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("Test6","Test7","Test8","Test9","Test10",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("TEST1","SUB1",childList);
        groupHeaderList.add(groupHeader);


    }

    public void loadThaiToThai(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("ไทย","Thai",childList);
        groupHeaderList.add(groupHeader);

        //------------------------------------//
        childList = new ArrayList<Child>();
        child = new Child("ไทย1","ไทย2","ไทย3","ไทย4","ไทย5",null,null);
        childList.add(child);

        groupHeader = new GroupHeader("ไทยครัช","Thai",childList);
        groupHeaderList.add(groupHeader);



    }

    public void loadThaiToCambodia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("ไทย","Cambodia",childList);
        groupHeaderList.add(groupHeader);

    }

    public void loadThaiToIndonesia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("ไทย","Indo",childList);
        groupHeaderList.add(groupHeader);

    }


    public void loadThaiToLaos(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("ไทย","Laos",childList);
        groupHeaderList.add(groupHeader);

    }

    public void loadThaiToMalaysia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("ไทย","Malaysia",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadThaiToMyanmar(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("ไทย","Myanmar",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadThaiToPhilippines(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("ไทย","Phi",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadThaiToSingapore(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("ไทย","Sing",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadThaiToVietnam(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("ไทย","Viet",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadBruneiToChina(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Brunei","Chi",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadBruneiToThai(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Brunei","ไทย",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadBruneiToBrunei(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Brunei","Brunei",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadBruneiToCambodia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Brunei","Cambodia",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadBruneiToIndonesia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Brunei","Indonesia",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadBruneiToLaos(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Brunei","Laos",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadBruneiToMalaysia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Brunei","Malaysia",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadBruneiToMyanmar(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Brunei","Myanmar",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadBruneiToPhilippines(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Brunei","Philippines",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadBruneiToSingapore(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Brunei","Singapore",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadBruneiToVietnam(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Brunei","Singapore",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadCambodiaToChina(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Cambodia","Singapore",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadCambodiaToThai(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Cambodia","ไทย",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadCambodiaToBrunei(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Cambodia","Brunei",childList);
        groupHeaderList.add(groupHeader);
    }
    public void loadCambodiaToCambodia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Cambodia","Cambodia",childList);
        groupHeaderList.add(groupHeader);
    }
    public void loadCambodiaToIndonesia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Cambodia","Indonesia",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadCambodiaToLaos(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Cambodia","Laos",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadCambodiaToMalaysia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Cambodia","Malaysia",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadCambodiaToMyanmar(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Cambodia","Myanmar",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadCambodiaToPhilippines(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Cambodia","Philippines",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadCambodiaToSingapore(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Cambodia","Singapore",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadCambodiaToVietnam(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Cambodia","Vietnam",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadChinaToChina(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("China","China",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadChinaToThai(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("China","Thai",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadChinaToBrunei(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("China","Brunei",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadChinaToCambodia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("China","Cambodia",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadChinaToIndonesia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("China","Indonesia",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadChinaToLaos(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("China","Laos",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadChinaToMalaysia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("China","Laos",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadChinaToMyanmar(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("China","Myanmar",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadChinaToPhilippines(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("China","Philippines",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadChinaToSingapore(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("China","Singapore",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadChinaToVietnam(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("China","Vietnam",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadIndonesiaToChina(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Indonesia","China",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadIndonesiaToThai(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Indonesia","Thai",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadIndonesiaToBrunei(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Indonesia","Brunei",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadIndonesiaToCambodia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Indonesia","Cambodia",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadIndonesiaToIndonesia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Indonesia","Indonesia",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadIndonesiaToLaos(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Indonesia","Laos",childList);
        groupHeaderList.add(groupHeader);
    }


    public void loadIndonesiaToMalaysia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Indonesia","Malaysia",childList);
        groupHeaderList.add(groupHeader);
    }


    public void loadIndonesiaToMyanmar(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Indonesia","Myanmar",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadIndonesiaToPhilippines(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Indonesia","Philippines",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadIndonesiaToSingapore(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Indonesia","Singapore",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadIndonesiaToVietnam(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Indonesia","Vietnam",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadLaosToChina(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Laos","China",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadLaosToThai(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Laos","Thai",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadLaosToBrunei(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Laos","Thai",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadLaosToCambodia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Laos","Cambodia",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadLaosToIndonesia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Laos","Indonesia",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadLaosToLaos(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Laos","Laos",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadLaosToMalaysia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Laos","Malaysia",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadLaosToMyanmar(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Laos","Myanmar",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadLaosToPhilippines(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Laos","Philippines",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadLaosToSingapore(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Laos","Singapore",childList);
        groupHeaderList.add(groupHeader);
    }


    public void loadLaosToVietnam(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Laos","Vietnam",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadMalaysiaToChina(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Malaysia","China",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadMalaysiaToThai(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Malaysia","Thai",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadMalaysiaToBrunei(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Malaysia","Brunei",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadMalaysiaToCambodia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Malaysia","Cambodia",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadMalaysiaToIndonesia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Malaysia","Indonesia",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadMalaysiaToLaos(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Malaysia","Laos",childList);
        groupHeaderList.add(groupHeader);
    }
    public void loadMalaysiaToMalaysia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Malaysia","Malaysia",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadMalaysiaToMyanmar(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Malaysia","Myanmar",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadMalaysiaToPhilippines(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Malaysia","Philippines",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadMalaysiaToVietnam(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Malaysia","Vietnam",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadMyanmarToChina(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Myanmar","China",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadMyanmarToThai(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Myanmar","Thai",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadMyanmarToBrunei(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Myanmar","Brunei",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadMyanmarToCambodia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Myanmar","Cambodia",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadMyanmarToIndonesia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Myanmar","Indonesia",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadMyanmarToMalaysia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Myanmar","Indonesia",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadMyanmarToMyanmar(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Myanmar","Myanmar",childList);
        groupHeaderList.add(groupHeader);
    }
    public void loadMyanmarToPhilippines(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Myanmar","Philippines",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadMyanmarToSingapore(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Myanmar","Singapore",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadMyanmarToVietnam(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Myanmar","Vietnam",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadPhilippinesToChina(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Philippines","China",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadPhilippinesToThai(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Philippines","Thai",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadPhilippinesToBrunei(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Philippines","Brunei",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadPhilippinesToCambodia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Philippines","Cambodia",childList);
        groupHeaderList.add(groupHeader);
    }







    public ArrayList<GroupHeader> getGroupHeaderList()
    {
        return groupHeaderList;
    }
}
