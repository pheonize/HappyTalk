package com.example.happytalk.app.Database;

import com.example.happytalk.app.Child;
import com.example.happytalk.app.GroupHeader;

import java.util.ArrayList;

/**
 * Created by oVANILLAz on 6/10/14 AD.
 */
public class PlaceDAL {
    private ArrayList<GroupHeader> groupHeaderList = new ArrayList<GroupHeader>();

    public void loadThaiToBrunei(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("Test1","Test2","Test3","Test4","Test5",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Thai","Brunei",childList);
        groupHeaderList.add(groupHeader);


    }

    public void loadThaiToChina(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("Test6","Test7","Test8","Test9","Test10",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Thai","China",childList);
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

        Child child = new Child("see-sow-jian-jai-nar","","Tandas ke arah  mana","Where is the toilet?"," 洗手间在哪儿",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Tandas ke arah  mana", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ywii-seu-jai-nar","","Bilik mandi  ke arah mana","Where is the bathroom?"," 浴室在哪儿",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Bilik mandi  ke arah mana", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chun-thing-jai-nar","","Restoran ke arah mana","Where is the restaurant?"," 餐厅在哪儿",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Restoran ke arah mana", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sung-tian-jai-nar","","Kedai ke arah mana","Where is the shop?"," 商店在哪儿",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ke arah mana", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("siw-cher-hang-jai-nar","","Bengkel kereta ke arah mana","Where is the garage?"," 修车行在哪儿",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Bengkel kereta ke arah mana", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ee-awian-jai-nar","","Hospital ke arah mana","Where is the hospital?"," 医院在哪儿",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Hospital ke arah mana", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jern-sua-jai-nar","","Klinik ke arah mana","Where is the clinic?"," 诊所在哪儿",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Klinik ke arah mana", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yao-tian-jai-nar","","Kedai ubat ke arah mana","Where is the pharmacy?"," 药店在哪儿",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ubat ke arah mana", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jia-yow-jun-jai-nar","","Stesen minyak ke arah mana","Where is the gas station?"," 加油站在哪儿",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Stesen minyak ke arah mana", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fun-tian-jai-nar","","Hotel ke arah mana","Where is the hotel?"," 饭店在哪儿",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Hotel ke arah mana", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("seu-chang-jai-nar","","Pasar ke arah mana","Where is the market?"," 市场在哪儿",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Pasar ke arah mana", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("thing-cher-chang-jai-nar","","Tempat berhenti kereta ke arah mana","Where is the car rest area?"," 停车场在哪儿",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tempat berhenti kereta ke arah mana", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jing-char-jwee-jai-nar","","Balai polis ke arah mana","Where is the police station?"," 警察局在哪儿",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Balai polis ke arah mana", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jing-char-kung-thing-jai-nar","","Pondok polis ke arah mana","Where is the police booth?","警察岗亭在哪儿",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Pondok polis ke arah mana", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hwor-pee-toy-huan-choo-jai-nar","","Kedai pengurup ke arah mana","Where is the exchange bureau?"," 货币兑换处在哪儿",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai pengurup ke arah mana", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ma-thow-jai-nar","","Pelabuhan ke arah mana","Where is the pier?"," 码头在哪儿",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Pelabuhan ke arah mana", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chang-khoo-jai-nar","","Stor / Gudang barang dagangan ke arah mana","Where is the warehouse?"," 仓库在哪儿",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Stor / Gudang barang dagangan ke arah mana", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------



    }

    public void loadBruneiToThai(){
        ArrayList<Child> childList = new ArrayList<Child>();

        Child child = new Child("hongnam-pai-thang-nai","","Tandas ke arah  mana","Where is the toilet?","ห้องน้ำไปทางไหน",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Tandas ke arah  mana", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-ap-nam-pai-thang-nai","","Bilik mandi  ke arah mana","Where is the bathroom?","ห้องอาบน้ำไปทางไหน",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Bilik mandi  ke arah mana", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ran-ar-han-pai-thang-nai","","Restoran ke arah mana","Where is the restaurant?","ร้านอาหารไปทางไหน",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Restoran ke arah mana", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ran-kha-pai-thang-nai","","Kedai ke arah mana","Where is the shop?","ร้านค้าไปทางไหน",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ke arah mana", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("au-som-rot-pai-thang-nai","","Bengkel kereta ke arah mana","Where is the garage?","อู่ซ่อมรถไปทางไหน",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Bengkel kereta ke arah mana", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("rong-pha-ya-ban-pai-thang-nai","","Hospital ke arah mana","Where is the hospital?","โรงพยาบาลไปทางไหน",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Hospital ke arah mana", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("clinic-pai-thang-nai","","Klinik ke arah mana","Where is the clinic?","คลินิกไปทางไหน",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Klinik ke arah mana", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ran-khai-ya-pai-thang-nai","","Kedai ubat ke arah mana","Where is the pharmacy?","ร้านขายยาไปทางไหน",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ubat ke arah mana", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pam-nam-man-pai-thang-nai","","Stesen minyak ke arah mana","Where is the gas station?","ปั๊มน้ำมันไปทางไหน",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Stesen minyak ke arah mana", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("rong-raem-pai-thang-nai","","Hotel ke arah mana","Where is the hotel?","โรงแรมไปทางไหน",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Hotel ke arah mana", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("talad-pai-thang-nai","","Pasar ke arah mana","Where is the market?","ตลาดไปทางไหน",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Pasar ke arah mana", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chut-phak-rod-pai-thang-nai","","Tempat berhenti kereta ke arah mana","Where is the car rest area?","จุดพักรถไปทางไหน",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tempat berhenti kereta ke arah mana", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-tha-ni-tam-ruat-pai-thang-nai","","Balai polis ke arah mana","Where is the police station?","สถานีตำรวจไปทางไหน",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Balai polis ke arah mana", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pom-tam-ruat-pai-thang-nai","","Pondok polis ke arah mana","Where is the police booth?","ป้อมตำรวจไปทางไหน",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Pondok polis ke arah mana", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-than-thi-laek-ngoen-ra-wang-pra-thet-pai-thang-nai","","Kedai pengurup ke arah mana","Where is the exchange bureau?","สถานที่แลกเงินระหว่างประเทศไปทางไหน",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai pengurup ke arah mana", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tha-ruea-pai-thang-nai","","Pelabuhan ke arah mana","Where is the pier?","ท่าเรือไปทางไหน",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Pelabuhan ke arah mana", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ko-dang-phak-sinkha-pai-thang-nai","","Stor / Gudang barang dagangan ke arah mana","Where is the warehouse?","โกดังพักสินค้าไปทางไหน",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Stor / Gudang barang dagangan ke arah mana", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToBrunei(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("tun-das-ger-ar-rah-ma-na","","Tandas ke arah  mana","Where is the toilet?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Tandas ke arah  mana", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bee-lik-mun-dee-ger-ar-rah-ma-na","","Bilik mandi  ke arah mana","Where is the bathroom?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Bilik mandi  ke arah mana", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("res-to-run-ger-ar-rah-ma-na","","Restoran ke arah mana","Where is the restaurant?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Restoran ke arah mana", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-ger-ar-rah-ma-na","","Kedai ke arah mana","Where is the shop?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ke arah mana", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("beng-gail-ger-ray-ta-ger-ar-rah-ma-na","","Bengkel kereta ke arah mana","Where is the garage?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Bengkel kereta ke arah mana", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hos-pi-tal-ger-ar-rah-ma-na","","Hospital ke arah mana","Where is the hospital?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Hospital ke arah mana", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("glee-nik-ger-ar-rah-ma-na","","Klinik ke arah mana","Where is the clinic?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Klinik ke arah mana", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-oo-bud-ger-ar-rah-ma-na","","Kedai ubat ke arah mana","Where is the pharmacy?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ubat ke arah mana", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("stay-sen-mee-yuk-ger-ar-rah-ma-na","","Stesen minyak ke arah mana","Where is the gas station?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Stesen minyak ke arah mana", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ho-tel-ger-ar-rah-ma-na","","Hotel ke arah mana","Where is the hotel?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Hotel ke arah mana", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pa-sul-ger-ar-rah-ma-na","","Pasar ke arah mana","Where is the market?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Pasar ke arah mana", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("term-pud-bern-hern-tee-ger-ray-ta-ger-ar-rah-ma-na","","Tempat berhenti kereta ke arah mana","Where is the car rest area?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tempat berhenti kereta ke arah mana", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ba-lai-po-lis-ger-ar-rah-ma-na","","Balai polis ke arah mana","Where is the police station?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Balai polis ke arah mana", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pone-doke-po-lis-ger-ar-rah-ma-na","","Pondok polis ke arah mana","Where is the police booth?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Pondok polis ke arah mana", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-per-ngoo-roop-ger-ar-rah-ma-na","","Kedai pengurup ke arah mana","Where is the exchange bureau?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai pengurup ke arah mana", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("per-la-boo-hun-ger-ar-rah-ma-na","","Pelabuhan ke arah mana","Where is the pier?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Pelabuhan ke arah mana", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sto/ koo-dung-ba-rung-da-ka-ngun-ger-ar-rah-ma-na","","Stor / Gudang barang dagangan ke arah mana","Where is the warehouse?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Stor / Gudang barang dagangan ke arah mana", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToCambodia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("bon-toop-tuek-tuew-khang-na","","Tandas ke arah  mana","Where is the toilet?","  បន្ទប់ទឹកទៅខាងណា?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Tandas ke arah  mana", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bon-toop-ngood-tuek-tuew -khang-na","","Bilik mandi  ke arah mana","Where is the bathroom?"," បន្ទប់ងូតទឹកទៅខាងណា?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Bilik mandi  ke arah mana", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hang-bai-tuew-khang-na","","Restoran ke arah mana","Where is the restaurant?","ហាងបាយទៅខាងណា?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Restoran ke arah mana", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hang-luah-dough-tuew-khang-na","","Kedai ke arah mana","Where is the shop?"," ហាងលក់ដូរទៅខាងណា?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ke arah mana", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yian-than-juah-joon-lan-tuew-khang-na","","Bengkel kereta ke arah mana","Where is the garage?","មន្ទីរពេទ្យទៅខាងណា?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Bengkel kereta ke arah mana", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("muan-tee-paed-teuw-khang-na","","Hospital ke arah mana","Where is the hospital?","គ្លីនិកទៅខាងណា?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Hospital ke arah mana", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("klee-nik-tuew-khang-na","","Klinik ke arah mana","Where is the clinic?"," ហ្វាម៉ាស៊ីទៅខាងណា?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Klinik ke arah mana", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fa-ma-see-tuew-khang-na","","Kedai ubat ke arah mana","Where is the pharmacy?","ស្ថានីយ៍ប្រេងឥន្ទនៈទៅខាងណា?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ubat ke arah mana", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("stha-nee-preng-in-ta-niah- tuew-khang-na","","Stesen minyak ke arah mana","Where is the gas station?","សណ្ឋាគារទៅខាងណា?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Stesen minyak ke arah mana", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("son-tha-gia-tuew-khang-na","","Hotel ke arah mana","Where is the hotel?","ផ្សារទៅខាងណា?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Hotel ke arah mana", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("psa-tuew-khang-na","","Pasar ke arah mana","Where is the market?","កន្លែងឈប់ឡានទៅខាងណា?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Pasar ke arah mana", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gon-laeng-choop- larn- tuew-khang- na","","Tempat berhenti kereta ke arah mana","Where is the car rest area?"," ប៉ុស្តិ៍ប៉ូលីសទៅខាងណា?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tempat berhenti kereta ke arah mana", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("poh-po-leas-tuew-khang-na","","Balai polis ke arah mana","Where is the police station?","កន្លែងប៉ុស្តិ៍យាមប៉ូលីសទៅខាង ណា?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Balai polis ke arah mana", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gon-laeng-poh-yiam-po-leas-tuew- khang-na","","Pondok polis ke arah mana","Where is the police booth?","កន្លែងដូរលុយបរទេសទៅខាងណា?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Pondok polis ke arah mana", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gon-laeng-dough-luy-bor-ra-teh- tuew- khang-na","","Kedai pengurup ke arah mana","Where is the exchange bureau?","កំពង់ផែទៅខាងណា?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai pengurup ke arah mana", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gom-puang-phae-tuew-khang-na","","Pelabuhan ke arah mana","Where is the pier?"," ឃ្លាំងសម្រាប់ដាក់ឥវ៉ាន់ទៅខាងណា?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Pelabuhan ke arah mana", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kliang-som-rub-dah-uai-wun-tuew-khang-na","","Stor / Gudang barang dagangan ke arah mana","Where is the warehouse?"," ជួយផង ខ្ញុំត្រូវចោរប្លន់",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Stor / Gudang barang dagangan ke arah mana", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToIndonesia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("dee-mar-nar-gar-mar-geu-jeel (toi-let)","","Tandas ke arah  mana","Where is the toilet?","Di mana kamar kecil (toilet) ?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Tandas ke arah  mana", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-gar-mar-man-dee","","Bilik mandi  ke arah mana","Where is the bathroom?","Di mana kamar mandi ?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Bilik mandi  ke arah mana", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-res-to-ran","","Restoran ke arah mana","Where is the restaurant?","Di mana restoran ?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Restoran ke arah mana", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-to-go","","Kedai ke arah mana","Where is the shop?","Di mana toko ?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ke arah mana", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar beng-kel","","Bengkel kereta ke arah mana","Where is the garage?","Di mana bengkel ?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Bengkel kereta ke arah mana", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-ru-mah-sar-git","","Hospital ke arah mana","Where is the hospital?","Di mana rumah sakit ?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Hospital ke arah mana", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-glee-nik","","Klinik ke arah mana","Where is the clinic?","Di mana klinik ?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Klinik ke arah mana", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-ar-po-tek","","Kedai ubat ke arah mana","Where is the pharmacy?","Di mana apotek ?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ubat ke arah mana", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-pom-par-ben-sin","","Stesen minyak ke arah mana","Where is the gas station?","Di mana pompa bensin?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Stesen minyak ke arah mana", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-ho-tel","","Hotel ke arah mana","Where is the hotel?","Di mana hotel?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Hotel ke arah mana", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-par-sar","","Pasar ke arah mana","Where is the market?","Di mana pasar ?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Pasar ke arah mana", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-teum-pat-par-geer-mo-bil","","Tempat berhenti kereta ke arah mana","Where is the car rest area?","Di mana tempat parkir mobil ?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tempat berhenti kereta ke arah mana", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-gan-to-po-lee-see","","Balai polis ke arah mana","Where is the police station?","Di mana kantor polisi ?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Balai polis ke arah mana", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-pos-po-lee-see","","Pondok polis ke arah mana","Where is the police booth?","Di mana pos polisi ?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Pondok polis ke arah mana", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-teum-pat-tu-gar-u-wang","","Kedai pengurup ke arah mana","Where is the exchange bureau?","Di mana tempat tukar uang?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai pengurup ke arah mana", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-der-mar-kar","","Pelabuhan ke arah mana","Where is the pier?","Di mana dermaga ?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Pelabuhan ke arah mana", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-mar-nar-ku-dang-seem-pan-bar-rang","","Stor / Gudang barang dagangan ke arah mana","Where is the warehouse?","Di mana gudang simpan barang?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Stor / Gudang barang dagangan ke arah mana", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToLaos(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("hong-num-pai-tharng-dai","","Tandas ke arah  mana","Where is the toilet?"," ຫ້ອງນ້ຳໄປທາງໃດ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Tandas ke arah  mana", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-arb-num-pai-tharng-dai","","Bilik mandi  ke arah mana","Where is the bathroom?"," ຫ້ອງອາບນ້ຳໄປທາງໃດ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Bilik mandi  ke arah mana", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("harn-ar-harn-pai-tharng-dai","","Restoran ke arah mana","Where is the restaurant?"," ຮ້ານອາຫານໄປທາງໃດ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Restoran ke arah mana", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("harn-kai-khueang-pai-tharng-dai","","Kedai ke arah mana","Where is the shop?"," ຮ້ານຂາຍເຄື່ອງໄປທາງໃດ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ke arah mana", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ga-lar-paeng-load-pai-tharng-dai","","Bengkel kereta ke arah mana","Where is the garage?"," ກະລ່າແປງລົດໄປທາງໃດ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Bengkel kereta ke arah mana", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-mor-pai-tharng-dai","","Hospital ke arah mana","Where is the hospital?"," ໂຮງໝໍໄປທາງໃດ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Hospital ke arah mana", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("klee-nik-pai-tharng-dai","","Klinik ke arah mana","Where is the clinic?"," ຄລິນິກໄປທາງໃດ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Klinik ke arah mana", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("harn-khai-ya-pai-tharng-dai","","Kedai ubat ke arah mana","Where is the pharmacy?"," ຮ້ານຂາຍຢາໄປທາງໃດ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ubat ke arah mana", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pum-num-mun-pai-tharng-dai","","Stesen minyak ke arah mana","Where is the gas station?"," ປ້ຳນ້ຳມັນໄປທາງໃດ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Stesen minyak ke arah mana", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-haem-pai-tharng -dai","","Hotel ke arah mana","Where is the hotel?"," ໂຮງແຮມໄປທາງໃດ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Hotel ke arah mana", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ta-lard-pai-tharng -dai","","Pasar ke arah mana","Where is the market?"," ຕະຫຼາດໄປທາງໃດ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Pasar ke arah mana", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bon-jord-phuk-load- pai-tharng-dai","","Tempat berhenti kereta ke arah mana","Where is the car rest area?"," ບ່ອນຈອດພັກລົດໄປທາງໃດ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tempat berhenti kereta ke arah mana", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ta-nee-tum-luad- pai-tharng-dai","","Balai polis ke arah mana","Where is the police station?"," ສະຖານີຕຳຫຼວດໄປທາງໃດ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Balai polis ke arah mana", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pom-tum-luad- pai-tharng-dai","","Pondok polis ke arah mana","Where is the police booth?"," ປ້ອມຕຳຫຼວດໄປທາງໃດ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Pondok polis ke arah mana", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bon-laek-pian-ngern-ta-lah-wang-pa-thed- pai-tharng-dai","","Kedai pengurup ke arah mana","Where is the exchange bureau?"," ບ່ອນແລກປ່ຽນເງິນຕາລະຫວ່າງປະເທດ ໄປທາງໃດ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai pengurup ke arah mana", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tha-huea- pai-tharng-dai","","Pelabuhan ke arah mana","Where is the pier?"," ທ່າເຮືອໄປທາງໃດ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Pelabuhan ke arah mana", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-mian-sin-kha- pai-tharng-dai","","Stor / Gudang barang dagangan ke arah mana","Where is the warehouse?"," ຫ້ອງມ້ຽນສິນຄ້າໄປທາງໃດ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Stor / Gudang barang dagangan ke arah mana", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToMalaysia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("tun-das-ger-ar-rah-ma-na","","Tandas ke arah  mana","Where is the toilet?","Tandas ke arah  mana",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Tandas ke arah  mana", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bee-lik-mun-dee-ger-ar-rah-ma-na","","Bilik mandi  ke arah mana","Where is the bathroom?","Bilik mandi  ke arah mana",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Bilik mandi  ke arah mana", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("res-to-run-ger-ar-rah-ma-na","","Restoran ke arah mana","Where is the restaurant?","Restoran ke arah mana",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Restoran ke arah mana", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-ger-ar-rah-ma-na","","Kedai ke arah mana","Where is the shop?","Kedai ke arah mana",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ke arah mana", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("beng-gail-ger-ray-ta-ger-ar-rah-ma-na","","Bengkel kereta ke arah mana","Where is the garage?","Bengkel kereta ke arah mana",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Bengkel kereta ke arah mana", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hos-pi-tal-ger-ar-rah-ma-na","","Hospital ke arah mana","Where is the hospital?","Hospital ke arah mana",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Hospital ke arah mana", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("glee-nik-ger-ar-rah-ma-na","","Klinik ke arah mana","Where is the clinic?","Klinik ke arah mana",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Klinik ke arah mana", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-oo-bud-ger-ar-rah-ma-na","","Kedai ubat ke arah mana","Where is the pharmacy?","Kedai ubat ke arah mana",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ubat ke arah mana", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("stay-sen-mee-yuk-ger-ar-rah-ma-na","","Stesen minyak ke arah mana","Where is the gas station?","Stesen minyak ke arah mana",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Stesen minyak ke arah mana", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ho-tel-ger-ar-rah-ma-na","","Hotel ke arah mana","Where is the hotel?","Hotel ke arah mana",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Hotel ke arah mana", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pa-sul-ger-ar-rah-ma-na","","Pasar ke arah mana","Where is the market?","Pasar ke arah mana",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Pasar ke arah mana", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("term-pud-bern-hern-tee-ger-ray-ta-ger-ar-rah-ma-na","","Tempat berhenti kereta ke arah mana","Where is the car rest area?","Tempat berhenti kereta ke arah mana",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tempat berhenti kereta ke arah mana", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ba-lai-po-lis-ger-ar-rah-ma-na","","Balai polis ke arah mana","Where is the police station?","Balai polis ke arah mana",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Balai polis ke arah mana", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pone-doke-po-lis-ger-ar-rah-ma-na","","Pondok polis ke arah mana","Where is the police booth?","Pondok polis ke arah mana",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Pondok polis ke arah mana", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-dai-per-ngoo-roop-ger-ar-rah-ma-na","","Kedai pengurup ke arah mana","Where is the exchange bureau?","Kedai pengurup ke arah mana",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai pengurup ke arah mana", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("per-la-boo-hun-ger-ar-rah-ma-na","","Pelabuhan ke arah mana","Where is the pier?","Pelabuhan ke arah mana",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Pelabuhan ke arah mana", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sto/ koo-dung-ba-rung-da-ka-ngun-ger-ar-rah-ma-na","","Stor / Gudang barang dagangan ke arah mana","Where is the warehouse?","Stor / Gudang barang dagangan ke arah mana",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Stor / Gudang barang dagangan ke arah mana", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToMyanmar(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("eng-ta-bae-ma-shi-lae","","Tandas ke arah  mana","Where is the toilet?","အိမ္သာဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Tandas ke arah  mana", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ye-show-kan-bae-ma-shi- lae","","Bilik mandi  ke arah mana","Where is the bathroom?","ေရခ်ိဳးခန္းဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Bilik mandi  ke arah mana", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-taw-sai-bae-ma-shi- lae","","Restoran ke arah mana","Where is the restaurant?","စားေသာက္ဆိုင္ဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Restoran ke arah mana", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-sai-bae-ma-shi-lae","","Kedai ke arah mana","Where is the shop?","ေစ်းဆိုင္ဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ke arah mana", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ka-wa-choh-bae-ma-shi- lae","","Bengkel kereta ke arah mana","Where is the garage?","ကား၀ပ္ေရွာ့ဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Bengkel kereta ke arah mana", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-yong-bae-ma-shi-lae","","Hospital ke arah mana","Where is the hospital?","ေဆးရွံဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Hospital ke arah mana", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-kan-bae-ma-shi-lae","","Klinik ke arah mana","Where is the clinic?","ေဆးခန္းဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Klinik ke arah mana", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-sai-bae-ma-shi-lae","","Kedai ubat ke arah mana","Where is the pharmacy?","ေဆးဆိုင္ဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ubat ke arah mana", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dat-see-sai-bae-ma-shi- lae","","Stesen minyak ke arah mana","Where is the gas station?","ဓာတ္ဆီဆိုင္ဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Stesen minyak ke arah mana", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hoe-tae-bae-ma-shi-lae","","Hotel ke arah mana","Where is the hotel?","ဟိုတယ္ဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Hotel ke arah mana", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-bae-ma-shi-lae","","Pasar ke arah mana","Where is the market?","ေစ်းဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Pasar ke arah mana", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ka-yat-daeh-ne-ya-bae-ma-shi-lae","","Tempat berhenti kereta ke arah mana","Where is the car rest area?","ကားရပ္တဲ့ေနရာဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tempat berhenti kereta ke arah mana", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yae-sa-khan-bae-ma-shi- lae","","Balai polis ke arah mana","Where is the police station?","ရဲစခန္းဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Balai polis ke arah mana", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yae-ging-bae-ma-shi-lae","","Pondok polis ke arah mana","Where is the police booth?","ရဲကင္းဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Pondok polis ke arah mana", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("na-nai-ngan-ngwe-lae-daeh-ne-ya-bae-ma-shi-lae","","Kedai pengurup ke arah mana","Where is the exchange bureau?","ႏွစ္ႏိုင္ငံေငြလဲတဲ့ေနရာဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai pengurup ke arah mana", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("seh-kan-bae-ma-shi-lae","","Pelabuhan ke arah mana","Where is the pier?","ဆိပ္ကမ္းဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Pelabuhan ke arah mana", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kong -yong -bae -ma -shi -lae","","Stor / Gudang barang dagangan ke arah mana","Where is the warehouse?","ကုန္ရံုဘယ္မွာရွိလဲ။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Stor / Gudang barang dagangan ke arah mana", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToPhilippines(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("nar-sar-an-ang-ban-yo","","Tandas ke arah  mana","Where is the toilet?","Nasaan ang banyo?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Tandas ke arah  mana", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-par-li-gu-an","","Bilik mandi  ke arah mana","Where is the bathroom?","Nasaan ang paliguan?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Bilik mandi  ke arah mana", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-kar-rin-dey-ri-yar","","Restoran ke arah mana","Where is the restaurant?","Nasaan ang carinderiya?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Restoran ke arah mana", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-morl","","Kedai ke arah mana","Where is the shop?","Nasaan ang mall?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ke arah mana", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-gar-rar-hey","","Bengkel kereta ke arah mana","Where is the garage?","Nasaan ang garahe?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Bengkel kereta ke arah mana", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-os-pi-tal","","Hospital ke arah mana","Where is the hospital?","Nasaan ang ospital?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Hospital ke arah mana", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-gli-nik","","Klinik ke arah mana","Where is the clinic?","Nasaan ang klinik?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Klinik ke arah mana", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-bo-ti-gar","","Kedai ubat ke arah mana","Where is the pharmacy?","Nasaan ang botika?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ubat ke arah mana", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-gar-so-li-nar-han","","Stesen minyak ke arah mana","Where is the gas station?","Nasaan ang gasolinahan?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Stesen minyak ke arah mana", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-ho-tel","","Hotel ke arah mana","Where is the hotel?","Nasaan ang hotel?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Hotel ke arah mana", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-par-leng-gey","","Pasar ke arah mana","Where is the market?","Nasaan ang palengke?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Pasar ke arah mana", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-hin-tu-an-nang-boos","","Tempat berhenti kereta ke arah mana","Where is the car rest area?","Nasaan ang hintuan ng bus?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tempat berhenti kereta ke arah mana", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-him-pi-lan-nang-pu-lis","","Balai polis ke arah mana","Where is the police station?","Nasaan ang himpilan ng pulis?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Balai polis ke arah mana", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-chek-poit-nang-pu-lis","","Pondok polis ke arah mana","Where is the police booth?","Nasaan ang checkpoint ng pulis?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Pondok polis ke arah mana", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-lu-gar-rar-pang-par-lit-nang-pey-rar","","Kedai pengurup ke arah mana","Where is the exchange bureau?","Nasaan ang lugar pang palit ng pera?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai pengurup ke arah mana", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-pu-ey-rer-to","","Pelabuhan ke arah mana","Where is the pier?","Nasaan ang puerto?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Pelabuhan ke arah mana", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-sar-an-ang-bo-dey-gar","","Stor / Gudang barang dagangan ke arah mana","Where is the warehouse?","Nasaan ang bodega?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Stor / Gudang barang dagangan ke arah mana", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToSingapore(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ware-is-der-toi-let","","Tandas ke arah  mana","Where is the toilet?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Tandas ke arah  mana", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware -is-der-bat-room","","Bilik mandi  ke arah mana","Where is the bathroom?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Bilik mandi  ke arah mana", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware -is-der-res-ter-rong","","Restoran ke arah mana","Where is the restaurant?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Restoran ke arah mana", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-chop","","Kedai ke arah mana","Where is the shop?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ke arah mana", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-gar-rarch","","Bengkel kereta ke arah mana","Where is the garage?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Bengkel kereta ke arah mana", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-hos-pi-tol","","Hospital ke arah mana","Where is the hospital?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Hospital ke arah mana", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-klee-nik","","Klinik ke arah mana","Where is the clinic?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Klinik ke arah mana", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-far-mar-see","","Kedai ubat ke arah mana","Where is the pharmacy?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ubat ke arah mana", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-gas-stey-chan","","Stesen minyak ke arah mana","Where is the gas station?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Stesen minyak ke arah mana", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-ho-tel","","Hotel ke arah mana","Where is the hotel?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Hotel ke arah mana", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-mar-ket","","Pasar ke arah mana","Where is the market?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Pasar ke arah mana", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-kar-res-ae-ria","","Tempat berhenti kereta ke arah mana","Where is the car rest area?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tempat berhenti kereta ke arah mana", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-po-lis-stey-chan","","Balai polis ke arah mana","Where is the police station?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Balai polis ke arah mana", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-po-lis-boot","","Pondok polis ke arah mana","Where is the police booth?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Pondok polis ke arah mana", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-ex-chench-bio-ro","","Kedai pengurup ke arah mana","Where is the exchange bureau?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai pengurup ke arah mana", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der-pia","","Pelabuhan ke arah mana","Where is the pier?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Pelabuhan ke arah mana", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-is-der- ware-haus","","Stor / Gudang barang dagangan ke arah mana","Where is the warehouse?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Stor / Gudang barang dagangan ke arah mana", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToVietnam(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("fong-way-sin-dee-loi-now","","Tandas ke arah  mana","Where is the toilet?","phòng vệ sinh đi lối nào",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Tandas ke arah  mana", "Where is the toilet?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fong-tum-dee-loi-now","","Bilik mandi  ke arah mana","Where is the bathroom?","phòng tắm đi lối nào",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Bilik mandi  ke arah mana", "Where is the bathroom?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tiam-un-dee-loi-now","","Restoran ke arah mana","Where is the restaurant?","tiệm ăn đi lối nào",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Restoran ke arah mana", "Where is the restaurant?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("keur-tiam-dee-loi-now","","Kedai ke arah mana","Where is the shop?","cửa tiệm đi lối nào",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ke arah mana", "Where is the shop?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ka-ra-suea-sae-dee-loi-now","","Bengkel kereta ke arah mana","Where is the garage?","ga ra sửa xe đi lối nào",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Bengkel kereta ke arah mana", "Where is the garage?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("beng-wien-dee-loi-now","","Hospital ke arah mana","Where is the hospital?","bệnh viện đi lối nào?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Hospital ke arah mana", "Where is the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fong-mug-dee-loi-now","","Klinik ke arah mana","Where is the clinic?","phòng mạch đi lối nào?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Klinik ke arah mana", "Where is the clinic?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tiam-thuak-tuai-dee-loi-now","","Kedai ubat ke arah mana","Where is the pharmacy?","tiệm thuốc  tây đi lối nào?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai ubat ke arah mana", "Where is the pharmacy?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tram-sung-dee-loi-now","","Stesen minyak ke arah mana","Where is the gas station?","trạm xăng đi lối nào?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Stesen minyak ke arah mana", "Where is the gas station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Khuk-san-dee-loi-now","","Hotel ke arah mana","Where is the hotel?","khách sạn đi lối nào?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Hotel ke arah mana", "Where is the hotel?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("joe-dee-loi-now","","Pasar ke arah mana","Where is the market?","chợ đi lối nào?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Pasar ke arah mana", "Where is the market?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("noei-doe-sae-dee-loi-now","","Tempat berhenti kereta ke arah mana","Where is the car rest area?","nơi đậu xe đi lối nào?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tempat berhenti kereta ke arah mana", "Where is the car rest area?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("don-kong-arn-dee-loi-now","","Balai polis ke arah mana","Where is the police station?","đồn công an đi lối nào?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Balai polis ke arah mana", "Where is the police station?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Tram-kun-sard-dee-loi-now","","Pondok polis ke arah mana","Where is the police booth?","trạm cảnh sát đi lối nào?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Pondok polis ke arah mana", "Where is the police booth?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Tram-doi-why-tay-dee-loi-now","","Kedai pengurup ke arah mana","Where is the exchange bureau?","trạm đổi ngoại tệ đi lối nào?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Kedai pengurup ke arah mana", "Where is the exchange bureau?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ben-toa-dee-loi-now","","Pelabuhan ke arah mana","Where is the pier?","bến tàu đi lối nào?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Pelabuhan ke arah mana", "Where is the pier?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Khor-true-hang-dee-loi-now","","Stor / Gudang barang dagangan ke arah mana","Where is the warehouse?","kho trữ hàng đi lối nào?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Stor / Gudang barang dagangan ke arah mana", "Where is the warehouse?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
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

    public void loadPhilippinesToIndonesia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Philippines","Indonesia",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadPhilippinesToLaos(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Philippines","Laos",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadPhilippinesToMalaysia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Philippines","Malaysia",childList);
        groupHeaderList.add(groupHeader);
    }
    public void loadPhilippinesToMyanmar(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Philippines","Myanmar",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadPhilippinesToPhilippines(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Philippines","Philippines",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadPhilippinesToSingapore(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Philippines","Singapore",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadPhilippinesToVietnam(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Philippines","Vietnam",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadSingaporeToChina(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Singapore","China",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadSingaporeToThai(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Singapore","Thai",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadSingaporeToBrunei(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Singapore","Brunei",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadSingaporeToCambodia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Singapore","Cambodia",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadSingaporeToIndonesia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Singapore","Indonesia",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadSingaporeToLaos(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Singapore","Laos",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadSingaporeToMalaysia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Singapore","Laos",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadSingaporeToMyanmar(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Singapore","Myanmar",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadSingaporeToPhilippines(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Singapore","Philippines",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadSingaporeToSingapore(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Singapore","Singapore",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadSingaporeToVietnam(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Singapore","Vietnam",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadVietnamToChina(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Vietnam","China",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadVietnamToThai(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Vietnam","Thai",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadVietnamToBrunei(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Vietnam","Brunei",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadVietnamToCambodia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Vietnam","Cambodia",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadVietnamToIndonesia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Vietnam","Indonesia",childList);
        groupHeaderList.add(groupHeader);
    }


    public void loadVietnamToLaos(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Vietnam","Laos",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadVietnamToMalaysia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Vietnam","Malaysia",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadVietnamToMyanmar(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Vietnam","Myanmar",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadVietnamToPhilippines(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Vietnam","Philippines",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadVietnamToSingapore(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Vietnam","Singapore",childList);
        groupHeaderList.add(groupHeader);
    }

    public void loadVietnamToVietnam(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ไทย","ไทย","ไทย","ไทย","ไทย",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Vietnam","Vietnam",childList);
        groupHeaderList.add(groupHeader);
    }







    public ArrayList<GroupHeader> getGroupHeaderList()
    {
        return groupHeaderList;
    }
}
