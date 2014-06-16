package com.example.happytalk.app.Database;

import com.example.happytalk.app.Child;
import com.example.happytalk.app.GroupHeader;

import java.util.ArrayList;

/**
 * Created by oVANILLAz on 6/11/14 AD.
 */
public class DALconnection  {

    private ArrayList<GroupHeader> groupHeaderList = new ArrayList<GroupHeader>();

   



    //Th - Ch
    public void loadThaiToChinaConversation(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("Test6","Test7","Test8","Test9","Test10",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Thai","China",childList);
        groupHeaderList.add(groupHeader);

        //------------------------------------//

        childList = new ArrayList<Child>();
        child = new Child("ไทย1","ไทย2","ไทย3","ไทย4","ไทย5",null,null);
        childList.add(child);

        groupHeader = new GroupHeader("ไทยครัช","Thai",childList);
        groupHeaderList.add(groupHeader);


    }


    public void loadThaiToBrunei() {


    }


    public ArrayList<GroupHeader> getGroupHeaderList()
    {
        return groupHeaderList;
    }

    public void loadThaiToChina() {
    }

    public void loadThaiToThai() {
    }

    public void loadThaiToCambodia() {
    }

    public void loadThaiToIndonesia() {
    }

    public void loadThaiToLaos() {
    }

    public void loadThaiToMalaysia() {
    }

    public void loadThaiToMyanmar() {
    }

    public void loadThaiToPhilippines() {

    }

    public void loadThaiToSingapore() {
    }

    public void loadThaiToVietnam() {
    }

    public void loadBruneiToChina() {
    }

    public void loadBruneiToThai() {
    }

    public void loadBruneiToBrunei() {
    }

    public void loadBruneiToCambodia() {
    }

    public void loadBruneiToIndonesia() {
    }

    public void loadBruneiToLaos() {
    }

    public void loadBruneiToMalaysia() {
    }

    public void loadBruneiToMyanmar() {
    }

    public void loadBruneiToPhilippines() {
    }

    public void loadBruneiToSingapore() {
    }

    public void loadBruneiToVietnam() {
    }

    public void loadCambodiaToChina() {
    }

    public void loadCambodiaToThai() {
    }

    public void loadCambodiaToBrunei() {
    }

    public void loadCambodiaToCambodia() {
    }

    public void loadCambodiaToIndonesia() {
    }

    public void loadCambodiaToLaos() {
    }

    public void loadCambodiaToMalaysia() {
    }

    public void loadCambodiaToMyanmar() {
    }

    public void loadCambodiaToPhilippines() {
    }

    public void loadCambodiaToSingapore() {
    }

    public void loadCambodiaToVietnam() {
    }

    public void loadChinaToChina() {
    }

    public void loadChinaToThai() {
    }

    public void loadChinaToBrunei() {
    }

    public void loadChinaToCambodia() {
    }

    public void loadChinaToIndonesia() {
    }

    public void loadChinaToLaos() {
    }

    public void loadChinaToMalaysia() {
    }

    public void loadChinaToMyanmar() {
    }

    public void loadChinaToPhilippines() {
    }

    public void loadChinaToSingapore() {
    }

    public void loadChinaToVietnam() {
    }

    public void loadIndonesiaToChina() {
    }

    public void loadIndonesiaToThai() {
    }

    public void loadIndonesiaToBrunei() {
    }

    public void loadIndonesiaToCambodia() {
    }

    public void loadIndonesiaToIndonesia() {
    }

    public void loadIndonesiaToLaos() {
    }

    public void loadIndonesiaToMalaysia() {
    }

    public void loadIndonesiaToMyanmar() {
    }

    public void loadIndonesiaToPhilippines() {
    }

    public void loadIndonesiaToSingapore() {
    }

    public void loadIndonesiaToVietnam() {
    }

    public void loadLaosToChina() {
    }

    public void loadLaosToThai() {
    }

    public void loadLaosToBrunei() {
    }

    public void loadLaosToCambodia() {
    }

    public void loadLaosToIndonesia() {
    }

    public void loadLaosToLaos() {
    }

    public void loadLaosToMalaysia() {
    }

    public void loadLaosToMyanmar() {
    }

    public void loadLaosToPhilippines() {
    }

    public void loadLaosToSingapore() {
    }

    public void loadLaosToVietnam() {
    }

    public void loadMalaysiaToChina() {
    }

    public void loadMalaysiaToThai() {
    }

    public void loadMalaysiaToBrunei() {
    }

    public void loadMalaysiaToCambodia() {
    }

    public void loadMalaysiaToIndonesia() {
    }

    public void loadMalaysiaToLaos() {
    }

    public void loadMalaysiaToMalaysia() {
    }

    public void loadMalaysiaToMyanmar() {
    }

    public void loadMalaysiaToPhilippines() {
    }

    public void loadMalaysiaToSingapore() {
    }

    public void loadMalaysiaToVietnam() {
    }

    public void loadMyanmarToChina() {
    }

    public void loadMyanmarToThai() {
    }

    public void loadMyanmarToBrunei() {
    }

    public void loadMyanmarToCambodia() {
    }

    public void loadMyanmarToIndonesia() {
    }

    public void loadMyanmarToLaos() {
    }

    public void loadMyanmarToMalaysia() {
    }

    public void loadMyanmarToMyanmar() {
    }

    public void loadMyanmarToPhilippines() {
    }

    public void loadMyanmarToSingapore() {
    }

    public void loadMyanmarToVietnam() {
    }

    public void loadPhilippinesToChina() {
    }

    public void loadPhilippinesToThai() {
    }

    public void loadPhilippinesToBrunei() {
    }

    public void loadPhilippinesToCambodia() {
    }

    public void loadPhilippinesToIndonesia() {
    }

    public void loadPhilippinesToLaos() {
    }

    public void loadPhilippinesToMalaysia() {
    }

    public void loadPhilippinesToMyanmar() {
    }

    public void loadPhilippinesToPhilippines() {
    }

    public void loadPhilippinesToSingapore() {
    }

    public void loadPhilippinesToVietnam() {
    }

    public void loadSingaporeToChina() {
    }

    public void loadSingaporeToThai() {
    }

    public void loadSingaporeToBrunei() {
    }

    public void loadSingaporeToCambodia() {
    }

    public void loadSingaporeToIndonesia() {
    }

    public void loadSingaporeToLaos() {
    }

    public void loadSingaporeToMalaysia() {
    }

    public void loadSingaporeToMyanmar() {
    }

    public void loadSingaporeToPhilippines() {
    }

    public void loadSingaporeToSingapore() {
    }

    public void loadSingaporeToVietnam() {
    }

    public void loadVietnamToChina() {
    }

    public void loadVietnamToThai() {
    }

    public void loadVietnamToBrunei() {
    }

    public void loadVietnamToCambodia() {
    }

    public void loadVietnamToIndonesia() {
    }

    public void loadVietnamToLaos() {
    }

    public void loadVietnamToMalaysia() {
    }

    public void loadVietnamToMyanmar() {
    }

    public void loadVietnamToPhilippines() {
    }

    public void loadVietnamToSingapore() {
    }

    public void loadVietnamToVietnam() {

    }
}
