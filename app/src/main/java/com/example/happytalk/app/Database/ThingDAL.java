package com.example.happytalk.app.Database;

import com.example.happytalk.app.Child;
import com.example.happytalk.app.GroupHeader;

import java.util.ArrayList;

/**
 * Created by oVANILLAz on 6/10/14 AD.
 */
public class ThingDAL {
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
        Child child = new Child("wor-jew-ter-er-ler","","Saya rasa lapar","I  feel hungry."," 我觉得饿了",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Saya rasa lapar", "I  feel hungry.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-cheu-fun","","Saya hendak makan nasi","I would like some food."," 我要吃饭",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya hendak makan nasi", "I would like some food.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chig-un-jao-jer-ming-jeu-her-tee-jeu-khai-tun","","Tolong keluarkan resit mengikut nama dan alamat ini","Could you please give me a receipt following by these name and address."," 请按照这名字和 地址开单",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong keluarkan resit mengikut nama dan alamat ini", "Could you please give me a receipt following by these name and address.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-wuai-seng-jeu","","Saya perlukan kertas tisu","I would like some toilet paper."," 我要卫生纸",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan kertas tisu", "I would like some toilet paper.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-mao-jin","","Saya perlukankain tuala","I would like a towel."," 我要毛巾",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukankain tuala", "I would like a towel.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-choon-sui","","Saya mahu air minuman","I would like some drinking water."," 我要纯水",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu air minuman", "I would like some drinking water.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-tee-thoo","","Saya perlukan peta","I would like a map."," 我要地图",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan peta", "I would like a map.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-thui-sao-yao","","Saya perlukan  ubat deman","I would like the aspirin."," 我要退烧药",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan  ubat deman", "I would like the aspirin.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-jeu-kher-thung-jiang","","Saya perlukan ubat batuk","I would like the cough mixture."," 我要止咳糖浆",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan ubat batuk", "I would like the cough mixture.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-jeu-sia-yao","","Saya perlukan ubat sakit perut","I would like the stomach ache medicine."," 我要止泻药",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan ubat sakit perut", "I would like the stomach ache medicine.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-kha-fuai","","Saya mahu kopi","I would like a coffee."," 我要咖啡",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu kopi", "I would like a coffee.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-chee-yow","","Saya perlukan  minyak","I would like to get the fuel oil."," 我要汽油",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan  minyak", "I would like to get the fuel oil.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-jerng-liw-sui","","Saya perlukan air suling","I would like a distilled water."," 我要蒸馏水",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan air suling", "I would like a distilled water.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-tian-cheu","","Saya perlukan bateri","I would like a battery."," 我要电池",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan bateri", "I would like a battery.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-lua-seu-tao","","Saya perlukan pemutar skru","I would like a screw driver."," 我要螺丝刀",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan pemutar skru", "I would like a screw driver.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-pun-sow","","Saya perlukan sepana","I would like a wrench."," 我要扳手",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan sepana", "I would like a wrench.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-chian-jin-ting","","Saya perlukan jek","I would like a jack."," 我要千斤顶",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan jek", "I would like a jack.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-puai-thai","","Saya perlukan  tayar ganti","I would like a spare wheel."," 我要备胎",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan  tayar ganti", "I would like a spare wheel.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-sow-tian-thong","","Saya perlukan lampu suluh","I would like a  flashlight."," 我要手电筒",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan lampu suluh", "I would like a  flashlight.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-sao-jeu-her-cha-jeu","","Saya perlukan sudu/garpu","I would like a fork."," 我要勺子和叉子",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan sudu/garpu", "I would like a fork.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-khwai-jeu","","Saya perlukan kayu pengepit","I would like a chopstick."," 我要筷子",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan kayu pengepit", "I would like a chopstick.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-chuang-tian-chuang-tian-tian-jeu","","Saya perlukan katil/ tilam/lapik","I would like a bed / mattress."," 我要床垫/床垫/垫子",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan katil/ tilam/lapik", "I would like a bed / mattress.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-puai-jeu","","Saya perlukan kain selimut","I would like a blanket."," 我要被子",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan kain selimut", "I would like a blanket.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-jerng-thow","","Saya perlukan bantal","I would like a pillow."," 我要枕头",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan bantal", "I would like a pillow.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-taa-tian-hwa","","Saya perlukan telefon","I would like to get a phone."," 我要打电话",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan telefon", "I would like to get a phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------

    }

    public void loadBruneiToThai(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("chan-ru-suek-hiw","","Saya rasa lapar","I  feel hungry.","ฉันรู้สึกหิว",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Saya rasa lapar", "I  feel hungry.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-ar-han","","Saya hendak makan nasi","I would like some food.","ฉันต้องการอาหาร",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya hendak makan nasi", "I would like some food.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("karuna-ork-bai-set-tam-chue-lae-tee-yu-ni-duai","","Tolong keluarkan resit mengikut nama dan alamat ini","Could you please give me a receipt following by these name and address.","กรุณาออกใบเสร็จตามชื่อและที่อยู่นี้ด้วย",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong keluarkan resit mengikut nama dan alamat ini", "Could you please give me a receipt following by these name and address.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-kra-dat-cham-ra","","Saya perlukan kertas tisu","I would like some toilet paper.","ฉันต้องการกระดาษชำระ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan kertas tisu", "I would like some toilet paper.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-pha-khon-nu","","Saya perlukankain tuala","I would like a towel.","ฉันต้องการผ้าขนหนู",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukankain tuala", "I would like a towel.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-nam-duem","","Saya mahu air minuman","I would like some drinking water.","ฉันต้องการน้ำดื่ม",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu air minuman", "I would like some drinking water.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-phaen-thi","","Saya perlukan peta","I would like a map.","ฉันต้องการแผนที่",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan peta", "I would like a map.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-ya-kae-khai","","Saya perlukan  ubat deman","I would like the aspirin.","ฉันต้องการยาแก้ไข้",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan  ubat deman", "I would like the aspirin.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-ya-kae-ai","","Saya perlukan ubat batuk","I would like the cough mixture.","ฉันต้องการยาแก้ไอ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan ubat batuk", "I would like the cough mixture.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-ya-kae-puad-thong","","Saya perlukan ubat sakit perut","I would like the stomach ache medicine.","ฉันต้องการยาแก้ปวดท้อง",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan ubat sakit perut", "I would like the stomach ache medicine.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-ka-fae","","Saya mahu kopi","I would like a coffee.","ฉันต้องการกาแฟ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu kopi", "I would like a coffee.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-nam-man","","Saya perlukan  minyak","I would like to get the fuel oil.","ฉันต้องการน้ำมัน",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan  minyak", "I would like to get the fuel oil.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-nam-klan","","Saya perlukan air suling","I would like a distilled water.","ฉันต้องการน้ำกลั่น",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan air suling", "I would like a distilled water.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-battery","","Saya perlukan bateri","I would like a battery.","ฉันต้องการแบตเตอรี่",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan bateri", "I would like a battery.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-khai-khuang","","Saya perlukan pemutar skru","I would like a screw driver.","ฉันต้องการไขควง",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan pemutar skru", "I would like a screw driver.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-pra-chae","","Saya perlukan sepana","I would like a wrench.","ฉันต้องการประแจ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan sepana", "I would like a wrench.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-maeraeng","","Saya perlukan jek","I would like a jack.","ฉันต้องการแม่แรง",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan jek", "I would like a jack.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-a-lai","","Saya perlukan  tayar ganti","I would like a spare wheel.","ฉันต้องการยางอะไหล่",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan  tayar ganti", "I would like a spare wheel.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-fai-chai","","Saya perlukan lampu suluh","I would like a  flashlight.","ฉันต้องการไฟฉาย",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan lampu suluh", "I would like a  flashlight.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-chon-som","","Saya perlukan sudu/garpu","I would like a fork.","ฉันต้องการช้อนส้อม",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan sudu/garpu", "I would like a fork.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-ta-kiap","","Saya perlukan kayu pengepit","I would like a chopstick.","ฉันต้องการตะเกียบ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan kayu pengepit", "I would like a chopstick.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-(tee-norn/fook/bo)","","Saya perlukan katil/ tilam/lapik","I would like a bed / mattress.","ฉันต้องการที่นอน/ฟูก/เบาะ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan katil/ tilam/lapik", "I would like a bed / mattress.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-pha-hom","","Saya perlukan kain selimut","I would like a blanket.","ฉันต้องการผ้าห่ม",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan kain selimut", "I would like a blanket.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-mon","","Saya perlukan bantal","I would like a pillow.","ฉันต้องการหมอน",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan bantal", "I would like a pillow.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-tho-ra-sap","","Saya perlukan telefon","I would like to get a phone.","ฉันต้องการโทรศัพท์",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan telefon", "I would like to get a phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToBrunei(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("sa-ya-ra-sa-la-pul","","Saya rasa lapar","I  feel hungry.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Saya rasa lapar", "I  feel hungry.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-hern-duk-ma-gun-na-si","","Saya hendak makan nasi","I would like some food.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya hendak makan nasi", "I would like some food.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-ger-loo-wul-gun-rer-sit-mer- ngee-goot-na-ma-darn-ar-la-mud-ee-nee","","Tolong keluarkan resit mengikut nama dan alamat ini","Could you please give me a receipt following by these name and address.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong keluarkan resit mengikut nama dan alamat ini", "Could you please give me a receipt following by these name and address.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-ger-tas-tee-soo","","Saya perlukan kertas tisu","I would like some toilet paper.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan kertas tisu", "I would like some toilet paper.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-gai-too-wa-la","","Saya perlukankain tuala","I would like a towel.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukankain tuala", "I would like a towel.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-ma-hoo-ai-mee-noo-mun","","Saya mahu air minuman","I would like some drinking water.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu air minuman", "I would like some drinking water.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-per-ta","","Saya perlukan peta","I would like a map.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan peta", "I would like a map.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-oo-bud-der-mun","","Saya perlukan  ubat deman","I would like the aspirin.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan  ubat deman", "I would like the aspirin.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-oo-bud-ba-took","","Saya perlukan ubat batuk","I would like the cough mixture.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan ubat batuk", "I would like the cough mixture.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-oo-bud-sa-git-per-root","","Saya perlukan ubat sakit perut","I would like the stomach ache medicine.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan ubat sakit perut", "I would like the stomach ache medicine.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-ma-hoo-go-pee","","Saya mahu kopi","I would like a coffee.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu kopi", "I would like a coffee.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-mee-yuk","","Saya perlukan  minyak","I would like to get the fuel oil.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan  minyak", "I would like to get the fuel oil.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-ai-soo-ling","","Saya perlukan air suling","I would like a distilled water.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan air suling", "I would like a distilled water.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-ba-ter-ree","","Saya perlukan bateri","I would like a battery.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan bateri", "I would like a battery.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-per-moo-tul-sgroo","","Saya perlukan pemutar skru","I would like a screw driver.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan pemutar skru", "I would like a screw driver.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-ser-pa-na","","Saya perlukan sepana","I would like a wrench.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan sepana", "I would like a wrench.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-yek","","Saya perlukan jek","I would like a jack.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan jek", "I would like a jack.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-ta-yul-kun-tee","","Saya perlukan  tayar ganti","I would like a spare wheel.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan  tayar ganti", "I would like a spare wheel.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-lum-poo-soo-luh","","Saya perlukan lampu suluh","I would like a  flashlight.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan lampu suluh", "I would like a  flashlight.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-soo-doo/ kul-poo","","Saya perlukan sudu/garpu","I would like a fork.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan sudu/garpu", "I would like a fork.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-ga-yoo-per-nger-pit","","Saya perlukan kayu pengepit","I would like a chopstick.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan kayu pengepit", "I would like a chopstick.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-ga-til/ tee-lum/ la-pik","","Saya perlukan katil/ tilam/lapik","I would like a bed / mattress.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan katil/ tilam/lapik", "I would like a bed / mattress.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-gai-ser-lee-mut","","Saya perlukan kain selimut","I would like a blanket.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan kain selimut", "I would like a blanket.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-bun-tal","","Saya perlukan bantal","I would like a pillow.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan bantal", "I would like a pillow.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-tay-lay-fon","","Saya perlukan telefon","I would like to get a phone.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan telefon", "I would like to get a phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToCambodia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("khyom-mian-ar-rom-tha-doac-jia-klian-huai","","Saya rasa lapar","I  feel hungry."," ខ្ញុំមានអារម្មណ៍ថា ដូចជាឃ្លានហើយ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Saya rasa lapar", "I  feel hungry.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-treuw-ga-hope-bai","","Saya hendak makan nasi","I would like some food."," ខ្ញុំត្រូវការហូបបាយ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya hendak makan nasi", "I would like some food.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soam-juai-sor-say-neuw-wi-gai-but-tarm-chmuah-nueng-tee-gon-laeng-nih-phong","","Tolong keluarkan resit mengikut nama dan alamat ini","Could you please give me a receipt following by these name and address."," សូមជួយសរសេរនូវវិក័យបត្រតាម ឈ្មោះ និងទីកន្លែងនេះផង",null,null);
                child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong keluarkan resit mengikut nama dan alamat ini", "Could you please give me a receipt following by these name and address.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-treuw-ga-graw-dah- a-na-mai","","Saya perlukan kertas tisu","I would like some toilet paper."," ខ្ញុំត្រូវការក្រដាសអនាម័យ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan kertas tisu", "I would like some toilet paper.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-treuw-ga-gon-saeng-puah-go","","Saya perlukankain tuala","I would like a towel."," ខ្ញុំត្រូវការកន្សែងពោះគោ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukankain tuala", "I would like a towel.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-treuw-ga-tuek-soat","","Saya mahu air minuman","I would like some drinking water.","  ខ្ញុំត្រូវការទឹកសុទ្ធ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu air minuman", "I would like some drinking water.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-treuw-ga-phaen-tee","","Saya perlukan peta","I would like a map.","  ខ្ញុំត្រូវការផែនទី",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan peta", "I would like a map.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-treuw-ga-thnam- pda-sai","","Saya perlukan  ubat deman","I would like the aspirin.","  ខ្ញុំត្រូវការថ្នាំផ្តាសាយ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan  ubat deman", "I would like the aspirin.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-treuw-ga-thnam-cheu-gaw","","Saya perlukan ubat batuk","I would like the cough mixture.","  ខ្ញុំត្រូវការថ្នាំឈឺក",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan ubat batuk", "I would like the cough mixture.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-treuw-ga-thnam-cheu-puah","","Saya perlukan ubat sakit perut","I would like the stomach ache medicine.","  ខ្ញុំត្រូវការថ្នាំឈឺពោះ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan ubat sakit perut", "I would like the stomach ache medicine.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-treuw-ga-ga-fe","","Saya mahu kopi","I would like a coffee.","  ខ្ញុំត្រូវការកាហ្វេ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu kopi", "I would like a coffee.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-treuw-ga-preng-sung","","Saya perlukan  minyak","I would like to get the fuel oil.","  ខ្ញុំត្រូវការប្រេងសាំង",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan  minyak", "I would like to get the fuel oil.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-treuw-ga-tuek-jom-run","","Saya perlukan air suling","I would like a distilled water.","  ខ្ញុំត្រូវការទឹកចម្រាញ់",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan air suling", "I would like a distilled water.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-treuw-ga-thmor-puel","","Saya perlukan bateri","I would like a battery.","  ខ្ញុំត្រូវការថ្មពិល",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan bateri", "I would like a battery.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-treuw-ga-too-rah-weeh","","Saya perlukan pemutar skru","I would like a screw driver.","  ខ្ញុំត្រូវការទុរវីស",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan pemutar skru", "I would like a screw driver.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-treuw-ga-pror-dub-mual","","Saya perlukan sepana","I would like a wrench.","  ខ្ញុំត្រូវការប្រដាប់មួល",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan sepana", "I would like a wrench.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-treuw-ga-pror-dub-doey","","Saya perlukan jek","I would like a jack.","  ខ្ញុំត្រូវការប្រដាប់ដូយ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan jek", "I would like a jack.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-treuw-ga-som-bok-gong-dough","","Saya perlukan  tayar ganti","I would like a spare wheel.","  ខ្ញុំត្រូវការសំបកកង់ដូរ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan  tayar ganti", "I would like a spare wheel.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-treuw-ga-puel","","Saya perlukan lampu suluh","I would like a  flashlight.","  ខ្ញុំត្រូវការពិល",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan lampu suluh", "I would like a  flashlight.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-treuw-ga-slarb-pria-som","","Saya perlukan sudu/garpu","I would like a fork.","  ខ្ញុំត្រូវការស្លាបព្រាសម",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan sudu/garpu", "I would like a fork.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-treuw-ga-jong-geh ","","Saya perlukan kayu pengepit","I would like a chopstick.","  ខ្ញុំត្រូវការចង្កឹះ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan kayu pengepit", "I would like a chopstick.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-treuw-ga-krae / pook / trow-nuab-grai","","Saya perlukan katil/ tilam/lapik","I would like a bed / mattress.","  ខ្ញុំត្រូវការគ្រែ/ពូក/ទ្រនាប់ក្រាល",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan katil/ tilam/lapik", "I would like a bed / mattress.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-treuw-ga-phuai","","Saya perlukan kain selimut","I would like a blanket.","  ខ្ញុំត្រូវការភួយ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan kain selimut", "I would like a blanket.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-treuw-ga-khnery","","Saya perlukan bantal","I would like a pillow.","  ខ្ញុំត្រូវការខ្នើយ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan bantal", "I would like a pillow.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-treuw-ga-too-ra-sub","","Saya perlukan telefon","I would like to get a phone.","  ខ្ញុំត្រូវការទូរសព្ទ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan telefon", "I would like to get a phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToIndonesia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("sar-yar-lar-par","","Saya rasa lapar","I  feel hungry.","Saya lapar",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Saya rasa lapar", "I  feel hungry.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-mar-gan","","Saya hendak makan nasi","I would like some food.","Saya ingin makan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya hendak makan nasi", "I would like some food.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mor-hon-beu-ree-gan-tan-dar-teu-ree-mar-seu-su-wai-nar-mar-dan-ar- lar-mat-ee-nee","","Tolong keluarkan resit mengikut nama dan alamat ini","Could you please give me a receipt following by these name and address.","Mohon berikan tanda terima sesuai nama dan alamat ini",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong keluarkan resit mengikut nama dan alamat ini", "Could you please give me a receipt following by these name and address.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-geur-tas-toi-let","","Saya perlukan kertas tisu","I would like some toilet paper.","Saya ingin kertas toilet",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan kertas tisu", "I would like some toilet paper.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-han-dook","","Saya perlukankain tuala","I would like a towel.","Saya ingin handuk",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukankain tuala", "I would like a towel.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-mee-nu-man","","Saya mahu air minuman","I would like some drinking water.","Saya ingin minuman",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu air minuman", "I would like some drinking water.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-peu-tar","","Saya perlukan peta","I would like a map.","Saya ingin peta",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan peta", "I would like a map.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-o-bat-per-nu-roon-par-nas","","Saya perlukan  ubat deman","I would like the aspirin.","Saya ingin obat penurun panas",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan  ubat deman", "I would like the aspirin.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-o-bat-bar-took","","Saya perlukan ubat batuk","I would like the cough mixture.","Saya ingin obat batuk",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan ubat batuk", "I would like the cough mixture.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-o-bat-sar-kit-peu-root","","Saya perlukan ubat sakit perut","I would like the stomach ache medicine.","Saya ingin obat sakit perut",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan ubat sakit perut", "I would like the stomach ache medicine.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-mee-noom-go-pee","","Saya mahu kopi","I would like a coffee.","Saya ingin minum kopi",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu kopi", "I would like a coffee.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-bar-han-bar-gar (oon-took-mo-bil-sar-yar)","","Saya perlukan  minyak","I would like to get the fuel oil.","Saya ingin bahan bakar (untuk mobil saya)",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan  minyak", "I would like to get the fuel oil.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-ayer- su-ring","","Saya perlukan air suling","I would like a distilled water.","Saya ingin air suling",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan air suling", "I would like a distilled water.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-bar-ter- rai","","Saya perlukan bateri","I would like a battery.","Saya ingin baterai",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan bateri", "I would like a battery.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-o-beng","","Saya perlukan pemutar skru","I would like a screw driver.","Saya ingin obeng",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan pemutar skru", "I would like a screw driver.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-gun-jee-ing-gris","","Saya perlukan sepana","I would like a wrench.","Saya ingin kunci inggris",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan sepana", "I would like a wrench.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-dong-krak","","Saya perlukan jek","I would like a jack.","Saya ingin dongkrak",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan jek", "I would like a jack.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-ban-jar-dar-ngan","","Saya perlukan  tayar ganti","I would like a spare wheel.","Saya ingin ban cadangan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan  tayar ganti", "I would like a spare wheel.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-lam-pu-sen-ter","","Saya perlukan lampu suluh","I would like a  flashlight.","Saya ingin lampu senter",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan lampu suluh", "I would like a  flashlight.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-sen-dork-kar-pu","","Saya perlukan sudu/garpu","I would like a fork.","Saya ingin sendok garpu ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan sudu/garpu", "I would like a fork.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-sum-pit","","Saya perlukan kayu pengepit","I would like a chopstick.","Saya ingin sumpit",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan kayu pengepit", "I would like a chopstick.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-teum-pat-tee-dur/gar-sur","","Saya perlukan katil/ tilam/lapik","I would like a bed / mattress.","Saya ingin tempat tidur/kasur",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan katil/ tilam/lapik", "I would like a bed / mattress.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-ser-lee-mut","","Saya perlukan kain selimut","I would like a blanket.","Saya ingin selimut",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan kain selimut", "I would like a blanket.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-ban-tal","","Saya perlukan bantal","I would like a pillow.","Saya ingin bantal ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan bantal", "I would like a pillow.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-tey-ley-pon","","Saya perlukan telefon","I would like to get a phone.","Saya ingin telepon ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan telefon", "I would like to get a phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToLaos(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("khoy-hoo-suek-hiw ","","Saya rasa lapar","I  feel hungry."," ຂ້ອຍຮູ້ສຶກຫິວ  ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Saya rasa lapar", "I  feel hungry.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-ar-harn","","Saya hendak makan nasi","I would like some food."," ຂ້ອຍຕ້ອງການອາຫານ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya hendak makan nasi", "I would like some food.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ga-lu-na-org-bin-tarm-cheu-lae-thee-yoo-nee-num","","Tolong keluarkan resit mengikut nama dan alamat ini","Could you please give me a receipt following by these name and address."," ກະລຸນາອອກບິນຕາມຊື່ແລະທີ່ຢູ່ນີ້ນຳ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong keluarkan resit mengikut nama dan alamat ini", "Could you please give me a receipt following by these name and address.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-jia-a-na-mai","","Saya perlukan kertas tisu","I would like some toilet paper."," ຂ້ອຍຕ້ອງການເຈັ້ຍອະນາໄມ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan kertas tisu", "I would like some toilet paper.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-phar-phae","","Saya perlukankain tuala","I would like a towel."," ຂ້ອຍຕ້ອງການຜ້າແພ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukankain tuala", "I would like a towel.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-num-deum","","Saya mahu air minuman","I would like some drinking water."," ຂ້ອຍຕ້ອງການນ້ຳດື່ມ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu air minuman", "I would like some drinking water.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-phaen-thee","","Saya perlukan peta","I would like a map."," ຂ້ອຍຕ້ອງການແຜນທີ່",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan peta", "I would like a map.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-ya-kae-khai","","Saya perlukan  ubat deman","I would like the aspirin."," ຂ້ອຍຕ້ອງການຢາແກ້ໄຂ້",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan  ubat deman", "I would like the aspirin.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-ya-kae-ai","","Saya perlukan ubat batuk","I would like the cough mixture."," ຂ້ອຍຕ້ອງການຢາແກ້ໄອ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan ubat batuk", "I would like the cough mixture.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-ya-kae-jeb-thong","","Saya perlukan ubat sakit perut","I would like the stomach ache medicine."," ຂ້ອຍຕ້ອງການຢາແກ້ເຈັບທ້ອງ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan ubat sakit perut", "I would like the stomach ache medicine.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-ga-fe","","Saya mahu kopi","I would like a coffee."," ຂ້ອຍຕ້ອງການກາເຟ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu kopi", "I would like a coffee.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-num-mun","","Saya perlukan  minyak","I would like to get the fuel oil."," ຂ້ອຍຕ້ອງການນ້ຳມັນ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan  minyak", "I would like to get the fuel oil.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-num-gun","","Saya perlukan air suling","I would like a distilled water."," ຂ້ອຍຕ້ອງການນ້ຳກັ່ນ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan air suling", "I would like a distilled water.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-mor-fai","","Saya perlukan bateri","I would like a battery."," ຂ້ອຍຕ້ອງການໝໍ້ໄຟ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan bateri", "I would like a battery.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-ta-lah-bid","","Saya perlukan pemutar skru","I would like a screw driver."," ຂ້ອຍຕ້ອງການຕາລະບິດ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan pemutar skru", "I would like a screw driver.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-kheem-lok","","Saya perlukan sepana","I would like a wrench."," ຂ້ອຍຕ້ອງການຄີມລ໊ອກ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan sepana", "I would like a wrench.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-ga-lik","","Saya perlukan jek","I would like a jack."," ຂ້ອຍຕ້ອງການກະລິກ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan jek", "I would like a jack.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-lor-load-sum-hong","","Saya perlukan  tayar ganti","I would like a spare wheel."," ຂ້ອຍຕ້ອງການລໍ້ລົດສຳຮອງ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan  tayar ganti", "I would like a spare wheel.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-fai-sai","","Saya perlukan lampu suluh","I would like a  flashlight."," ຂ້ອຍຕ້ອງການໄຟສາຍ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan lampu suluh", "I would like a  flashlight.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-buang-som","","Saya perlukan sudu/garpu","I would like a fork."," ຂ້ອຍຕ້ອງການບ່ວງສ້ອມ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan sudu/garpu", "I would like a fork.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-mai-too","","Saya perlukan kayu pengepit","I would like a chopstick."," ຂ້ອຍຕ້ອງການໄມ້ຖູ່",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan kayu pengepit", "I would like a chopstick.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-suea-fook-boh","","Saya perlukan katil/ tilam/lapik","I would like a bed / mattress."," ຂ້ອຍຕ້ອງການເສື່ອ ຟູກ ເບາະ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan katil/ tilam/lapik", "I would like a bed / mattress.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-pha-hom","","Saya perlukan kain selimut","I would like a blanket."," ຂ້ອຍຕ້ອງການຜ້າຫົ່ມ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan kain selimut", "I would like a blanket.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-morn","","Saya perlukan bantal","I would like a pillow."," ຂ້ອຍຕ້ອງການໝອນ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan bantal", "I would like a pillow.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-toe-la-sub","","Saya perlukan telefon","I would like to get a phone."," ຂ້ອຍຕ້ອງການໂທລະສັບ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan telefon", "I would like to get a phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------


    }

    public void loadBruneiToMalaysia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("sa-ya-ra-sa-la-pul","","Saya rasa lapar","I  feel hungry.","Saya rasa lapar",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Saya rasa lapar", "I  feel hungry.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-hern-duk-ma-gun-na-si","","Saya hendak makan nasi","I would like some food.","Saya hendak makan nasi",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya hendak makan nasi", "I would like some food.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-ger-loo-wul-gun-rer-sit-mer- ngee-goot-na-ma-darn-ar-la-mud-ee-nee","","Tolong keluarkan resit mengikut nama dan alamat ini","Could you please give me a receipt following by these name and address.","Tolong keluarkan resit mengikut nama dan alamat ini",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong keluarkan resit mengikut nama dan alamat ini", "Could you please give me a receipt following by these name and address.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-ger-tas-tee-soo","","Saya perlukan kertas tisu","I would like some toilet paper.","Saya perlukan kertas tisu",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan kertas tisu", "I would like some toilet paper.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-gai-too-wa-la","","Saya perlukankain tuala","I would like a towel.","Saya perlukankain tuala",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukankain tuala", "I would like a towel.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-ma-hoo-ai-mee-noo-mun","","Saya mahu air minuman","I would like some drinking water.","Saya mahu air minuman",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu air minuman", "I would like some drinking water.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-per-ta","","Saya perlukan peta","I would like a map.","Saya perlukan peta",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan peta", "I would like a map.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-oo-bud-der-mun","","Saya perlukan  ubat deman","I would like the aspirin.","Saya perlukan  ubat deman",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan  ubat deman", "I would like the aspirin.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-oo-bud-ba-took","","Saya perlukan ubat batuk","I would like the cough mixture.","Saya perlukan ubat batuk",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan ubat batuk", "I would like the cough mixture.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-oo-bud-sa-git-per-root","","Saya perlukan ubat sakit perut","I would like the stomach ache medicine.","Saya perlukan ubat sakit perut",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan ubat sakit perut", "I would like the stomach ache medicine.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-ma-hoo-go-pee","","Saya mahu kopi","I would like a coffee.","Saya mahu kopi",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu kopi", "I would like a coffee.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-mee-yuk","","Saya perlukan  minyak","I would like to get the fuel oil.","Saya perlukan  minyak",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan  minyak", "I would like to get the fuel oil.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-ai-soo-ling","","Saya perlukan air suling","I would like a distilled water.","Saya perlukan air suling",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan air suling", "I would like a distilled water.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-ba-ter-ree","","Saya perlukan bateri","I would like a battery.","Saya perlukan bateri",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan bateri", "I would like a battery.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-per-moo-tul-sgroo","","Saya perlukan pemutar skru","I would like a screw driver.","Saya perlukan pemutar skru",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan pemutar skru", "I would like a screw driver.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-ser-pa-na","","Saya perlukan sepana","I would like a wrench.","Saya perlukan sepana",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan sepana", "I would like a wrench.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-yek","","Saya perlukan jek","I would like a jack.","Saya perlukan jek",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan jek", "I would like a jack.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-ta-yul-kun-tee","","Saya perlukan  tayar ganti","I would like a spare wheel.","Saya perlukan  tayar ganti",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan  tayar ganti", "I would like a spare wheel.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-lum-poo-soo-luh","","Saya perlukan lampu suluh","I would like a  flashlight.","Saya perlukan lampu suluh",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan lampu suluh", "I would like a  flashlight.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-soo-doo/ kul-poo","","Saya perlukan sudu/garpu","I would like a fork.","Saya perlukan sudu/garpu",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan sudu/garpu", "I would like a fork.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-ga-yoo-per-nger-pit","","Saya perlukan kayu pengepit","I would like a chopstick.","Saya perlukan kayu pengepit",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan kayu pengepit", "I would like a chopstick.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-ga-til/ tee-lum/ la-pik","","Saya perlukan katil/ tilam/lapik","I would like a bed / mattress.","Saya perlukan katil/ tilam/lapik",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan katil/ tilam/lapik", "I would like a bed / mattress.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-gai-ser-lee-mut","","Saya perlukan kain selimut","I would like a blanket.","Saya perlukan kain selimut",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan kain selimut", "I would like a blanket.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-bun-tal","","Saya perlukan bantal","I would like a pillow.","Saya perlukan bantal",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan bantal", "I would like a pillow.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-tay-lay-fon","","Saya perlukan telefon","I would like to get a phone.","Saya perlukan telefon",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan telefon", "I would like to get a phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToMyanmar(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ja-nor/ja-ma-bai-sa-dae","","Saya rasa lapar","I  feel hungry.","ကြ်န္ေတာ္⁄ကြ်န္မ ဗိုက္ဆာတယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Saya rasa lapar", "I  feel hungry.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-a-sa-a-sa-sa-jin-dae ","","Saya hendak makan nasi","I would like some food.","ကြ်န္ေတာ္⁄ကြ်န္မ အစားအစာစားခ်င္တယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya hendak makan nasi", "I would like some food.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("je-zoo-pue-ywe -paw-cha-mana-mae-naeh, ne- ya-le-sa-ko, ye-pe-ba","","Tolong keluarkan resit mengikut nama dan alamat ini","Could you please give me a receipt following by these name and address.","ေက်းဇူးျပဳ၍ ေဘာက္ခ်ာမွာနာမည္နဲ႔ ေနရပ္လိပ္စာကိုေရးေပးပါ။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong keluarkan resit mengikut nama dan alamat ini", "Could you please give me a receipt following by these name and address.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja- nor/ja-ma tissue-loe-jin-dae","","Saya perlukan kertas tisu","I would like some toilet paper.","ကြ်န္ေတာ္⁄ကြ်န္မ တစ္ရွဴးလိုခ်င္တယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan kertas tisu", "I would like some toilet paper.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma koe-toh-pa-wa-loe- jin-dae","","Saya perlukankain tuala","I would like a towel.","ကြ်န္ေတာ္⁄ကြ်န္မ ကိုယ္သုတ္ပဝါလိုခ်င္တယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukankain tuala", "I would like a towel.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma taw-ye-loe- jin-dae","","Saya mahu air minuman","I would like some drinking water.","ကြ်န္ေတာ္⁄ကြ်န္မ ေသာက္ေရလိုခ်င္တယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu air minuman", "I would like some drinking water.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma mye-pong- loe-jin-dae","","Saya perlukan peta","I would like a map.","ကြ်န္ေတာ္⁄ကြ်န္မ ေျမပံုလိုခ်င္တယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan peta", "I would like a map.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma a-phia-jah-se-loe-jin-dae","","Saya perlukan  ubat deman","I would like the aspirin.","ကြ်န္ေတာ္⁄ကြ်န္မ အဖ်ားက်ေဆးလိုခ်င္တယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan  ubat deman", "I would like the aspirin.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma chaw-so- pyaw-se-loe- in-dae","","Saya perlukan ubat batuk","I would like the cough mixture.","ကြ်န္ေတာ္⁄ကြ်န္မ ေခ်ာင္းဆိုးေပ်ာက္ေဆးလိုခ်င္တယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan ubat batuk", "I would like the cough mixture.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-bai-na- pyaw-se-loe- jin-dae","","Saya perlukan ubat sakit perut","I would like the stomach ache medicine.","ကြ်န္ေတာ္⁄ကြ်န္မ ပိုက္နာေပ်ာက္ေဆးလိုခ်င္တယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan ubat sakit perut", "I would like the stomach ache medicine.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma kor-phee-loe- jin-dae","","Saya mahu kopi","I would like a coffee.","ကြ်န္ေတာ္⁄ကြ်န္မ ေကာ္ဖီလိုခ်င္တယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu kopi", "I would like a coffee.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja nor/ja-ma dat-see-loe- jin-dae","","Saya perlukan  minyak","I would like to get the fuel oil.","ကြ်န္ေတာ္⁄ကြ်န္မ ဓာတ္ဆီလိုခ်င္တယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan  minyak", "I would like to get the fuel oil.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma mo-ye-loe-jin-dae","","Saya perlukan air suling","I would like a distilled water.","ကြ်န္ေတာ္⁄ကြ်န္မ မိုးေရလိုခ်င္တယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan air suling", "I would like a distilled water.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma battery-loe- jin-dae","","Saya perlukan bateri","I would like a battery.","ကြ်န္ေတာ္⁄ကြ်န္မ ဘက္ထရီလိုခ်င္တယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan bateri", "I would like a battery.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-waeh -o-laeh- loe-jin-dae","","Saya perlukan pemutar skru","I would like a screw driver.","ကြ်န္ေတာ္⁄ကြ်န္မ ၀က္အူလွည့္လိုခ်င္တယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan pemutar skru", "I would like a screw driver.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma gwah- loe -jin dae","","Saya perlukan sepana","I would like a wrench.","ကြ်န္ေတာ္⁄ကြ်န္မ ဂြလိုခ်င္တယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan sepana", "I would like a wrench.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma jai-loe-jin- dae","","Saya perlukan jek","I would like a jack.","ja-nor/ja-ma mo-ye-loe-jin-dae",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan jek", "I would like a jack.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma sa-pae-ya a-po-bee-loe-jin-dae","","Saya perlukan  tayar ganti","I would like a spare wheel.","ja-nor/ja-ma battery-loe- jin-dae",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan  tayar ganti", "I would like a spare wheel.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma dat-mee-loe-jin-dae","","Saya perlukan lampu suluh","I would like a  flashlight.","ja-nor/ja-ma-waeh -o-laeh- loe-jin-dae",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan lampu suluh", "I would like a  flashlight.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma zoon-kha-yeen-loe-jin-dae","","Saya perlukan sudu/garpu","I would like a fork.","ja-nor/ja-ma gwah- loe -jin dae",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan sudu/garpu", "I would like a fork.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma too-loe-jin- dae","","Saya perlukan kayu pengepit","I would like a chopstick.","ကြ်န္ေတာ္⁄ကြ်န္မ တူလိုခ်င္တယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan kayu pengepit", "I would like a chopstick.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma mwe-ya- koo-shin-loe-jin-dae","","Saya perlukan katil/ tilam/lapik","I would like a bed / mattress.","ကြ်န္ေတာ္⁄ကြ်န္မ ေမြ႕ရာ၊ ကူရွင္ လိုခ်င္တယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan katil/ tilam/lapik", "I would like a bed / mattress.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma chong-saw loe-jin-dae","","Saya perlukan kain selimut","I would like a blanket.","ကြ်န္ေတာ္⁄ကြ်န္မ ျခံဳေစာင္လိုခ်င္တယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan kain selimut", "I would like a blanket.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma gaw-ong-loe- jin-dae","","Saya perlukan bantal","I would like a pillow.","ကြ်န္ေတာ္⁄ကြ်န္မ ေခါင္းအံုးလိုခ်င္တယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan bantal", "I would like a pillow.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma phong-saeh- jin-dae","","Saya perlukan telefon","I would like to get a phone.","ကြ်န္ေတာ္⁄ကြ်န္မ ဖုန္းဆက္လိုခ်င္တယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan telefon", "I would like to get a phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToPhilippines(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("gu-tom-ar-go","","Saya rasa lapar","I  feel hungry.","Gutom ako",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Saya rasa lapar", "I  feel hungry.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gai-lar-ngan-ar-gong-gu-mar-in","","Saya hendak makan nasi","I would like some food.","Kailangan akong kumain",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya hendak makan nasi", "I would like some food.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mang-yar-ring-mak-bi-gai-nang-rey-si-bo-ar-yorn-sar-par-ngar-lan-nar-i-to-at-ad-dres","","Tolong keluarkan resit mengikut nama dan alamat ini","Could you please give me a receipt following by these name and address.","Mangyaring magbigay ng resibo ayon sa pangalan na ito at address",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong keluarkan resit mengikut nama dan alamat ini", "Could you please give me a receipt following by these name and address.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("go-lar-ngan-go-nang-tich-chu-pey-per","","Saya perlukan kertas tisu","I would like some toilet paper.","Kailangan ko ng tissue paper",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan kertas tisu", "I would like some toilet paper.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gai-lar-ngan-go-nang-tu-warl-yar","","Saya perlukankain tuala","I would like a towel.","Kailangan ko ng tuwalya",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukankain tuala", "I would like a towel.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gai-lar-ngan-go-nang-tu-bik-nar-mar-i-nom","","Saya mahu air minuman","I would like some drinking water.","Kailangan ko ng tubig na mainom",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu air minuman", "I would like some drinking water.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gai-lar-ngan-go-nang-mar-par","","Saya perlukan peta","I would like a map.","Kailangan ko ng mapa",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan peta", "I would like a map.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gai-lar-ngan-go-nang-gar-mot-sar-lak-nat","","Saya perlukan  ubat deman","I would like the aspirin.","Kailangan ko ng gamot sa lagnat.",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan  ubat deman", "I would like the aspirin.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gai-lar-ngan-go-nang-gar-mot-sar-u-bo","","Saya perlukan ubat batuk","I would like the cough mixture.","Kailangan ko ng gamot sa ubo.",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan ubat batuk", "I would like the cough mixture.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gai-lar-ngan-go-nang-gar-mot-sar-sar-git-nar-ti-jan","","Saya perlukan ubat sakit perut","I would like the stomach ache medicine.","Kailangan ko ng gamut sa sakit na tiyan.",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan ubat sakit perut", "I would like the stomach ache medicine.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gai-lar-ngan-go-nang-gar-pey","","Saya mahu kopi","I would like a coffee.","Kailangan ko ng kape",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu kopi", "I would like a coffee.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gai-lar-ngan-go-nang-gar-cho-li-nar","","Saya perlukan  minyak","I would like to get the fuel oil.","Kailangan ko ng gasolina",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan  minyak", "I would like to get the fuel oil.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gai-lar-ngan-go-nang-dis-til-nar-tu-bik","","Saya perlukan air suling","I would like a distilled water.","Kailangan ko ng distilled na tubig",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan air suling", "I would like a distilled water.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gai-lar-ngan-go-nang-bat-ter-ri-yar","","Saya perlukan bateri","I would like a battery.","Kailangan ko ng batteriya",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan bateri", "I would like a battery.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gai-lar-ngan-go-nang-dis-tor-nil-yar-dor","","Saya perlukan pemutar skru","I would like a screw driver.","Kailangan ko ng distornilyador",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan pemutar skru", "I would like a screw driver.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gai-lar-ngan-go-nang-rench","","Saya perlukan sepana","I would like a wrench.","Kailangan ko ng wrench",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan sepana", "I would like a wrench.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gai-lar-ngan-go-nang-kren","","Saya perlukan jek","I would like a jack.","Kailangan ko ng crane",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan jek", "I would like a jack.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gai-lar-ngan-go-nang-spare-na-gu-long","","Saya perlukan  tayar ganti","I would like a spare wheel.","Kailangan ko ng spare na gulong",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan  tayar ganti", "I would like a spare wheel.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gai-lar-ngan-go-nang-flash-light","","Saya perlukan lampu suluh","I would like a  flashlight.","Kailangan ko ng flashlight",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan lampu suluh", "I would like a  flashlight.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gai-lar-ngan-go-nang-ti-ni-dor","","Saya perlukan sudu/garpu","I would like a fork.","Kailangan ko ng tinidor",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan sudu/garpu", "I would like a fork.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gai-lar-ngan-go-nang-chop-stiks","","Saya perlukan kayu pengepit","I would like a chopstick.","Kailangan ko ng chopsticks",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan kayu pengepit", "I would like a chopstick.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gai-lar-ngan-go-nang-goot-sorn","","Saya perlukan katil/ tilam/lapik","I would like a bed / mattress.","Kailangan ko ng kutson",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan katil/ tilam/lapik", "I would like a bed / mattress.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gai-lar-ngan-go-nang-gu-mort","","Saya perlukan kain selimut","I would like a blanket.","Kailangan ko ng kumot",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan kain selimut", "I would like a blanket.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gai-lar-ngan-go-nang-u-nan","","Saya perlukan bantal","I would like a pillow.","Kailangan ko ng unan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan bantal", "I would like a pillow.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gai-lar-ngan-gong-tu-mar-wak-sar-tey-ley-po-no","","Saya perlukan telefon","I would like to get a phone.","Kailangan kong tumawag sa telepono",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan telefon", "I would like to get a phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToSingapore(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ai-feel-hang-gree","","Saya rasa lapar","I  feel hungry.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Saya rasa lapar", "I  feel hungry.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-sam-food","","Saya hendak makan nasi","I would like some food.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya hendak makan nasi", "I would like some food.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kood-yu-plees-gif-mee-a-ree-seet-fol-lo-wing-bai-dis-nem-an-ad-dres","","Tolong keluarkan resit mengikut nama dan alamat ini","Could you please give me a receipt following by these name and address.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong keluarkan resit mengikut nama dan alamat ini", "Could you please give me a receipt following by these name and address.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-sam-toi-let-pey-per","","Saya perlukan kertas tisu","I would like some toilet paper.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan kertas tisu", "I would like some toilet paper.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-a-tao-wel","","Saya perlukankain tuala","I would like a towel.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukankain tuala", "I would like a towel.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-sam-drink-ging-wor-ter","","Saya mahu air minuman","I would like some drinking water.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu air minuman", "I would like some drinking water.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-a-map","","Saya perlukan peta","I would like a map.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan peta", "I would like a map.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-di-as-pai-rin","","Saya perlukan  ubat deman","I would like the aspirin.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan  ubat deman", "I would like the aspirin.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-der-kof-mix-cher","","Saya perlukan ubat batuk","I would like the cough mixture.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan ubat batuk", "I would like the cough mixture.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-der-sto-mak-ek- med-di-sin","","Saya perlukan ubat sakit perut","I would like the stomach ache medicine.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan ubat sakit perut", "I would like the stomach ache medicine.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-a-cof-fee","","Saya mahu kopi","I would like a coffee.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu kopi", "I would like a coffee.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-tu-get-der- fi-el-oil","","Saya perlukan  minyak","I would like to get the fuel oil.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan  minyak", "I would like to get the fuel oil.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-a-dis-til-wor-ter","","Saya perlukan air suling","I would like a distilled water.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan air suling", "I would like a distilled water.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-a-bat-ter-ree","","Saya perlukan bateri","I would like a battery.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan bateri", "I would like a battery.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-a-skru-drai-wer","","Saya perlukan pemutar skru","I would like a screw driver.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan pemutar skru", "I would like a screw driver.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-a-wrench","","Saya perlukan sepana","I would like a wrench.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan sepana", "I would like a wrench.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-a-jak","","Saya perlukan jek","I would like a jack.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan jek", "I would like a jack.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-a-spare-weel","","Saya perlukan  tayar ganti","I would like a spare wheel.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan  tayar ganti", "I would like a spare wheel.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-a-flash-light","","Saya perlukan lampu suluh","I would like a  flashlight.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan lampu suluh", "I would like a  flashlight.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-a-fok","","Saya perlukan sudu/garpu","I would like a fork.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan sudu/garpu", "I would like a fork.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-a-chop-stik","","Saya perlukan kayu pengepit","I would like a chopstick.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan kayu pengepit", "I would like a chopstick.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-a-bed/mat-tres","","Saya perlukan katil/ tilam/lapik","I would like a bed / mattress.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan katil/ tilam/lapik", "I would like a bed / mattress.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-a-blang-ket","","Saya perlukan kain selimut","I would like a blanket.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan kain selimut", "I would like a blanket.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-a-pil-lo","","Saya perlukan bantal","I would like a pillow.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan bantal", "I would like a pillow.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-tu-get-a-fon","","Saya perlukan telefon","I would like to get a phone.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan telefon", "I would like to get a phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToVietnam(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("toay-thuai-doi","","Saya rasa lapar","I  feel hungry.","tôi thấy đói",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Saya rasa lapar", "I  feel hungry.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-un","","Saya hendak makan nasi","I would like some food.","tôi muốn ăn",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya hendak makan nasi", "I would like some food.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sin-wiet-hwa-dern-twae-ten-wa-dea- jee-nai","","Tolong keluarkan resit mengikut nama dan alamat ini","Could you please give me a receipt following by these name and address.","xin viết hóa đơn theo tên và địa chỉ này",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong keluarkan resit mengikut nama dan alamat ini", "Could you please give me a receipt following by these name and address.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-maun-yeai-wae-sing","","Saya perlukan kertas tisu","I would like some toilet paper.","tôi muốn giấy vệ sinh",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan kertas tisu", "I would like some toilet paper.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-khan-tum","","Saya perlukankain tuala","I would like a towel.","tôi muốn khăn tắm",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukankain tuala", "I would like a towel.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-neuak-uang","","Saya mahu air minuman","I would like some drinking water.","tôi muốn nước uống",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu air minuman", "I would like some drinking water.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-ban-doe","","Saya perlukan peta","I would like a map.","tôi muốn bản đồ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan peta", "I would like a map.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-thuak-kam","","Saya perlukan  ubat deman","I would like the aspirin.","tôi muốn thuốc cảm",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan  ubat deman", "I would like the aspirin.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-thuak-haw","","Saya perlukan ubat batuk","I would like the cough mixture.","tôi muốn thuốc ho",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan ubat batuk", "I would like the cough mixture.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-thuak-doa-boong","","Saya perlukan ubat sakit perut","I would like the stomach ache medicine.","tôi muốn thuốc đau bụng",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan ubat sakit perut", "I would like the stomach ache medicine.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-ka-fe","","Saya mahu kopi","I would like a coffee.","tôi muốn  cà phê",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu kopi", "I would like a coffee.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-yao-sung","","Saya perlukan  minyak","I would like to get the fuel oil.","tôi muốn dầu xăng",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan  minyak", "I would like to get the fuel oil.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-neuak-log","","Saya perlukan air suling","I would like a distilled water.","tôi muốn nước lọc",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan air suling", "I would like a distilled water.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-maun-bing-ug-kwui","","Saya perlukan bateri","I would like a battery.","tôi muốn bình ắc quy",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan bateri", "I would like a battery.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-kai-tung-wit","","Saya perlukan pemutar skru","I would like a screw driver.","tôi muốn cái tung vít",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan pemutar skru", "I would like a screw driver.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-kai-jia-kwa","","Saya perlukan sepana","I would like a wrench.","tôi muốn cái chìa khóa",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan sepana", "I would like a wrench.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-kai-neung-sae","","Saya perlukan jek","I would like a jack.","tôi muốn cái nâng xe",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan jek", "I would like a jack.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-bun-sae-yue-fong","","Saya perlukan  tayar ganti","I would like a spare wheel.","tôi muốn bánh xe dự phòng",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan  tayar ganti", "I would like a spare wheel.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-daen-bin","","Saya perlukan lampu suluh","I would like a  flashlight.","tôi muốn đèn pin",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan lampu suluh", "I would like a  flashlight.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-kai-near","","Saya perlukan sudu/garpu","I would like a fork.","tôi muốn cái nĩa",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan sudu/garpu", "I would like a fork.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-doi-dua","","Saya perlukan kayu pengepit","I would like a chopstick.","tôi muốn đôi đũa",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan kayu pengepit", "I would like a chopstick.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan -term-nem / term-nem / term-nem ","","Saya perlukan katil/ tilam/lapik","I would like a bed / mattress.","tôi muốn tấm nệm tấm nệm",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan katil/ tilam/lapik", "I would like a bed / mattress.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-kai-jan","","Saya perlukan kain selimut","I would like a blanket.","tôi muốn cái chăn",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan kain selimut", "I would like a blanket.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-kai-koai","","Saya perlukan bantal","I would like a pillow.","tôi muốn cái gối",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan bantal", "I would like a pillow.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-dien-twai","","Saya perlukan telefon","I would like to get a phone.","tôi muốn điện thoại",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya perlukan telefon", "I would like to get a phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadCambodiaToChina(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("wor-jew-ter-er-ler",""," ខ្ញុំមានអារម្មណ៍ថា ដូចជាឃ្លានហើយ","I  feel hungry."," 我觉得饿了",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" ខ្ញុំមានអារម្មណ៍ថា ដូចជាឃ្លានហើយ", "I  feel hungry.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-cheu-fun",""," ខ្ញុំត្រូវការហូបបាយ","I would like some food."," 我要吃饭",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការហូបបាយ", "I would like some food.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chig-un-jao-jer-ming-jeu-her-tee-jeu-khai-tun",""," សូមជួយសរសេរនូវវិក័យបត្រតាម ឈ្មោះ និងទីកន្លែងនេះផង","Could you please give me a receipt following by these name and address."," 请按照这名字和 地址开单",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" សូមជួយសរសេរនូវវិក័យបត្រតាម ឈ្មោះ និងទីកន្លែងនេះផង", "Could you please give me a receipt following by these name and address.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-wuai-seng-jeu",""," ខ្ញុំត្រូវការក្រដាសអនាម័យ","I would like some toilet paper."," 我要卫生纸",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការក្រដាសអនាម័យ", "I would like some toilet paper.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-mao-jin",""," ខ្ញុំត្រូវការកន្សែងពោះគោ","I would like a towel."," 我要毛巾",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការកន្សែងពោះគោ", "I would like a towel.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-choon-sui","","  ខ្ញុំត្រូវការទឹកសុទ្ធ","I would like some drinking water."," 我要纯水",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការទឹកសុទ្ធ", "I would like some drinking water.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-tee-thoo","","  ខ្ញុំត្រូវការផែនទី","I would like a map."," 我要地图",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការផែនទី", "I would like a map.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-thui-sao-yao","","  ខ្ញុំត្រូវការថ្នាំផ្តាសាយ","I would like the aspirin."," 我要退烧药",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការថ្នាំផ្តាសាយ", "I would like the aspirin.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-jeu-kher-thung-jiang","","  ខ្ញុំត្រូវការថ្នាំឈឺក","I would like the cough mixture."," 我要止咳糖浆",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការថ្នាំឈឺក", "I would like the cough mixture.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-jeu-sia-yao","","  ខ្ញុំត្រូវការថ្នាំឈឺពោះ","I would like the stomach ache medicine."," 我要止泻药",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការថ្នាំឈឺពោះ", "I would like the stomach ache medicine.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-kha-fuai","","  ខ្ញុំត្រូវការកាហ្វេ","I would like a coffee."," 我要咖啡",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការកាហ្វេ", "I would like a coffee.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-chee-yow","","  ខ្ញុំត្រូវការប្រេងសាំង","I would like to get the fuel oil."," 我要汽油",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការប្រេងសាំង", "I would like to get the fuel oil.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-jerng-liw-sui","","  ខ្ញុំត្រូវការទឹកចម្រាញ់","I would like a distilled water."," 我要蒸馏水",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការទឹកចម្រាញ់", "I would like a distilled water.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-tian-cheu","","  ខ្ញុំត្រូវការថ្មពិល","I would like a battery."," 我要电池",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការថ្មពិល", "I would like a battery.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-lua-seu-tao","","  ខ្ញុំត្រូវការទុរវីស","I would like a screw driver."," 我要螺丝刀",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការទុរវីស", "I would like a screw driver.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-pun-sow","","  ខ្ញុំត្រូវការប្រដាប់មួល","I would like a wrench."," 我要扳手",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការប្រដាប់មួល", "I would like a wrench.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-chian-jin-ting","","  ខ្ញុំត្រូវការប្រដាប់ដូយ","I would like a jack."," 我要千斤顶",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការប្រដាប់ដូយ", "I would like a jack.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-puai-thai","","  ខ្ញុំត្រូវការសំបកកង់ដូរ","I would like a spare wheel."," 我要备胎",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការសំបកកង់ដូរ", "I would like a spare wheel.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-sow-tian-thong","","  ខ្ញុំត្រូវការពិល","I would like a  flashlight."," 我要手电筒",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការពិល", "I would like a  flashlight.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-sao-jeu-her-cha-jeu","","  ខ្ញុំត្រូវការស្លាបព្រាសម","I would like a fork."," 我要勺子和叉子",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការស្លាបព្រាសម", "I would like a fork.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-khwai-jeu","","  ខ្ញុំត្រូវការចង្កឹះ","I would like a chopstick."," 我要筷子",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការចង្កឹះ", "I would like a chopstick.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-chuang-tian-chuang-tian-tian-jeu","","  ខ្ញុំត្រូវការគ្រែ/ពូក/ទ្រនាប់ក្រាល","I would like a bed / mattress."," 我要床垫/床垫/垫子",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការគ្រែ/ពូក/ទ្រនាប់ក្រាល", "I would like a bed / mattress.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-puai-jeu","","  ខ្ញុំត្រូវការភួយ","I would like a blanket."," 我要被子",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការភួយ", "I would like a blanket.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-jerng-thow","","  ខ្ញុំត្រូវការខ្នើយ","I would like a pillow."," 我要枕头",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការខ្នើយ", "I would like a pillow.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-taa-tian-hwa","","  ខ្ញុំត្រូវការទូរសព្ទ","I would like to get a phone."," 我要打电话",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការទូរសព្ទ", "I would like to get a phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------



    }

    public void loadCambodiaToThai(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("chan-ru-suek-hiw",""," ខ្ញុំមានអារម្មណ៍ថា ដូចជាឃ្លានហើយ","I  feel hungry.","ฉันรู้สึกหิว",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" ខ្ញុំមានអារម្មណ៍ថា ដូចជាឃ្លានហើយ", "I  feel hungry.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-ar-han",""," ខ្ញុំត្រូវការហូបបាយ","I would like some food.","ฉันต้องการอาหาร",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការហូបបាយ", "I would like some food.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("karuna-ork-bai-set-tam-chue-lae-tee-yu-ni-duai",""," សូមជួយសរសេរនូវវិក័យបត្រតាម ឈ្មោះ និងទីកន្លែងនេះផង","Could you please give me a receipt following by these name and address.","กรุณาออกใบเสร็จตามชื่อและที่อยู่นี้ด้วย",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" សូមជួយសរសេរនូវវិក័យបត្រតាម ឈ្មោះ និងទីកន្លែងនេះផង", "Could you please give me a receipt following by these name and address.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-kra-dat-cham-ra",""," ខ្ញុំត្រូវការក្រដាសអនាម័យ","I would like some toilet paper.","ฉันต้องการกระดาษชำระ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការក្រដាសអនាម័យ", "I would like some toilet paper.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-pha-khon-nu",""," ខ្ញុំត្រូវការកន្សែងពោះគោ","I would like a towel.","ฉันต้องการผ้าขนหนู",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការកន្សែងពោះគោ", "I would like a towel.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-nam-duem","","  ខ្ញុំត្រូវការទឹកសុទ្ធ","I would like some drinking water.","ฉันต้องการน้ำดื่ม",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការទឹកសុទ្ធ", "I would like some drinking water.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-phaen-thi","","  ខ្ញុំត្រូវការផែនទី","I would like a map.","ฉันต้องการแผนที่",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការផែនទី", "I would like a map.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-ya-kae-khai","","  ខ្ញុំត្រូវការថ្នាំផ្តាសាយ","I would like the aspirin.","ฉันต้องการยาแก้ไข้",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការថ្នាំផ្តាសាយ", "I would like the aspirin.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-ya-kae-ai","","  ខ្ញុំត្រូវការថ្នាំឈឺក","I would like the cough mixture.","ฉันต้องการยาแก้ไอ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការថ្នាំឈឺក", "I would like the cough mixture.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-ya-kae-puad-thong","","  ខ្ញុំត្រូវការថ្នាំឈឺពោះ","I would like the stomach ache medicine.","ฉันต้องการยาแก้ปวดท้อง",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការថ្នាំឈឺពោះ", "I would like the stomach ache medicine.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-ka-fae","","  ខ្ញុំត្រូវការកាហ្វេ","I would like a coffee.","ฉันต้องการกาแฟ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការកាហ្វេ", "I would like a coffee.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-nam-man","","  ខ្ញុំត្រូវការប្រេងសាំង","I would like to get the fuel oil.","ฉันต้องการน้ำมัน",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការប្រេងសាំង", "I would like to get the fuel oil.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-nam-klan","","  ខ្ញុំត្រូវការទឹកចម្រាញ់","I would like a distilled water.","ฉันต้องการน้ำกลั่น",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការទឹកចម្រាញ់", "I would like a distilled water.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-battery","","  ខ្ញុំត្រូវការថ្មពិល","I would like a battery.","ฉันต้องการแบตเตอรี่",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការថ្មពិល", "I would like a battery.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-khai-khuang","","  ខ្ញុំត្រូវការទុរវីស","I would like a screw driver.","ฉันต้องการไขควง",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការទុរវីស", "I would like a screw driver.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-pra-chae","","  ខ្ញុំត្រូវការប្រដាប់មួល","I would like a wrench.","ฉันต้องการประแจ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការប្រដាប់មួល", "I would like a wrench.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-maeraeng","","  ខ្ញុំត្រូវការប្រដាប់ដូយ","I would like a jack.","ฉันต้องการแม่แรง",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការប្រដាប់ដូយ", "I would like a jack.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-a-lai","","  ខ្ញុំត្រូវការសំបកកង់ដូរ","I would like a spare wheel.","ฉันต้องการยางอะไหล่",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការសំបកកង់ដូរ", "I would like a spare wheel.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-fai-chai","","  ខ្ញុំត្រូវការពិល","I would like a  flashlight.","ฉันต้องการไฟฉาย",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការពិល", "I would like a  flashlight.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-chon-som","","  ខ្ញុំត្រូវការស្លាបព្រាសម","I would like a fork.","ฉันต้องการช้อนส้อม",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការស្លាបព្រាសម", "I would like a fork.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-ta-kiap","","  ខ្ញុំត្រូវការចង្កឹះ","I would like a chopstick.","ฉันต้องการตะเกียบ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការចង្កឹះ", "I would like a chopstick.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-(tee-norn/fook/bo)","","  ខ្ញុំត្រូវការគ្រែ/ពូក/ទ្រនាប់ក្រាល","I would like a bed / mattress.","ฉันต้องการที่นอน/ฟูก/เบาะ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការគ្រែ/ពូក/ទ្រនាប់ក្រាល", "I would like a bed / mattress.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-pha-hom","","  ខ្ញុំត្រូវការភួយ","I would like a blanket.","ฉันต้องการผ้าห่ม",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការភួយ", "I would like a blanket.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-mon","","  ខ្ញុំត្រូវការខ្នើយ","I would like a pillow.","ฉันต้องการหมอน",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការខ្នើយ", "I would like a pillow.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-tho-ra-sap","","  ខ្ញុំត្រូវការទូរសព្ទ","I would like to get a phone.","ฉันต้องการโทรศัพท์",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការទូរសព្ទ", "I would like to get a phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadCambodiaToBrunei(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("sa-ya-ra-sa-la-pul",""," ខ្ញុំមានអារម្មណ៍ថា ដូចជាឃ្លានហើយ","I  feel hungry.","Saya rasa lapar",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" ខ្ញុំមានអារម្មណ៍ថា ដូចជាឃ្លានហើយ", "I  feel hungry.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-hern-duk-ma-gun-na-si",""," ខ្ញុំត្រូវការហូបបាយ","I would like some food.","Saya hendak makan nasi",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការហូបបាយ", "I would like some food.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-ger-loo-wul-gun-rer-sit-mer- ngee-goot-na-ma-darn-ar-la-mud-ee-nee",""," សូមជួយសរសេរនូវវិក័យបត្រតាម ឈ្មោះ និងទីកន្លែងនេះផង","Could you please give me a receipt following by these name and address.","Tolong keluarkan resit mengikut nama dan alamat ini",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" សូមជួយសរសេរនូវវិក័យបត្រតាម ឈ្មោះ និងទីកន្លែងនេះផង", "Could you please give me a receipt following by these name and address.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-ger-tas-tee-soo",""," ខ្ញុំត្រូវការក្រដាសអនាម័យ","I would like some toilet paper.","Saya perlukan kertas tisu",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការក្រដាសអនាម័យ", "I would like some toilet paper.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-gai-too-wa-la",""," ខ្ញុំត្រូវការកន្សែងពោះគោ","I would like a towel.","Saya perlukankain tuala",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការកន្សែងពោះគោ", "I would like a towel.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-ma-hoo-ai-mee-noo-mun","","  ខ្ញុំត្រូវការទឹកសុទ្ធ","I would like some drinking water.","Saya mahu air minuman",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការទឹកសុទ្ធ", "I would like some drinking water.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-per-ta","","  ខ្ញុំត្រូវការផែនទី","I would like a map.","Saya perlukan peta",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការផែនទី", "I would like a map.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-oo-bud-der-mun","","  ខ្ញុំត្រូវការថ្នាំផ្តាសាយ","I would like the aspirin.","Saya perlukan  ubat deman",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការថ្នាំផ្តាសាយ", "I would like the aspirin.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-oo-bud-ba-took","","  ខ្ញុំត្រូវការថ្នាំឈឺក","I would like the cough mixture.","Saya perlukan ubat batuk",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការថ្នាំឈឺក", "I would like the cough mixture.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-oo-bud-sa-git-per-root","","  ខ្ញុំត្រូវការថ្នាំឈឺពោះ","I would like the stomach ache medicine.","Saya perlukan ubat sakit perut",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការថ្នាំឈឺពោះ", "I would like the stomach ache medicine.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-ma-hoo-go-pee","","  ខ្ញុំត្រូវការកាហ្វេ","I would like a coffee.","Saya mahu kopi",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការកាហ្វេ", "I would like a coffee.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-mee-yuk","","  ខ្ញុំត្រូវការប្រេងសាំង","I would like to get the fuel oil.","Saya perlukan  minyak",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការប្រេងសាំង", "I would like to get the fuel oil.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-ai-soo-ling","","  ខ្ញុំត្រូវការទឹកចម្រាញ់","I would like a distilled water.","Saya perlukan air suling",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការទឹកចម្រាញ់", "I would like a distilled water.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-ba-ter-ree","","  ខ្ញុំត្រូវការថ្មពិល","I would like a battery.","Saya perlukan bateri",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការថ្មពិល", "I would like a battery.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-per-moo-tul-sgroo","","  ខ្ញុំត្រូវការទុរវីស","I would like a screw driver.","Saya perlukan pemutar skru",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការទុរវីស", "I would like a screw driver.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-ser-pa-na","","  ខ្ញុំត្រូវការប្រដាប់មួល","I would like a wrench.","Saya perlukan sepana",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការប្រដាប់មួល", "I would like a wrench.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-yek","","  ខ្ញុំត្រូវការប្រដាប់ដូយ","I would like a jack.","Saya perlukan jek",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការប្រដាប់ដូយ", "I would like a jack.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-ta-yul-kun-tee","","  ខ្ញុំត្រូវការសំបកកង់ដូរ","I would like a spare wheel.","Saya perlukan  tayar ganti",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការសំបកកង់ដូរ", "I would like a spare wheel.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-lum-poo-soo-luh","","  ខ្ញុំត្រូវការពិល","I would like a  flashlight.","Saya perlukan lampu suluh",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការពិល", "I would like a  flashlight.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-soo-doo/ kul-poo","","  ខ្ញុំត្រូវការស្លាបព្រាសម","I would like a fork.","Saya perlukan sudu/garpu",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការស្លាបព្រាសម", "I would like a fork.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-ga-yoo-per-nger-pit","","  ខ្ញុំត្រូវការចង្កឹះ","I would like a chopstick.","Saya perlukan kayu pengepit",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការចង្កឹះ", "I would like a chopstick.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-ga-til/ tee-lum/ la-pik","","  ខ្ញុំត្រូវការគ្រែ/ពូក/ទ្រនាប់ក្រាល","I would like a bed / mattress.","Saya perlukan katil/ tilam/lapik",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការគ្រែ/ពូក/ទ្រនាប់ក្រាល", "I would like a bed / mattress.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-gai-ser-lee-mut","","  ខ្ញុំត្រូវការភួយ","I would like a blanket.","Saya perlukan kain selimut",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការភួយ", "I would like a blanket.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-bun-tal","","  ខ្ញុំត្រូវការខ្នើយ","I would like a pillow.","Saya perlukan bantal",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការខ្នើយ", "I would like a pillow.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-tay-lay-fon","","  ខ្ញុំត្រូវការទូរសព្ទ","I would like to get a phone.","Saya perlukan telefon",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការទូរសព្ទ", "I would like to get a phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }
    public void loadCambodiaToCambodia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("khyom-mian-ar-rom-tha-doac-jia-klian-huai",""," ខ្ញុំមានអារម្មណ៍ថា ដូចជាឃ្លានហើយ","I  feel hungry.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" ខ្ញុំមានអារម្មណ៍ថា ដូចជាឃ្លានហើយ", "I  feel hungry.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-treuw-ga-hope-bai",""," ខ្ញុំត្រូវការហូបបាយ","I would like some food.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការហូបបាយ", "I would like some food.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soam-juai-sor-say-neuw-wi-gai-but-tarm-chmuah-nueng-tee-gon-laeng-nih-phong",""," សូមជួយសរសេរនូវវិក័យបត្រតាម ឈ្មោះ និងទីកន្លែងនេះផង","Could you please give me a receipt following by these name and address.","",null,null);
                child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" សូមជួយសរសេរនូវវិក័យបត្រតាម ឈ្មោះ និងទីកន្លែងនេះផង", "Could you please give me a receipt following by these name and address.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-treuw-ga-graw-dah- a-na-mai",""," ខ្ញុំត្រូវការក្រដាសអនាម័យ","I would like some toilet paper.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការក្រដាសអនាម័យ", "I would like some toilet paper.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-treuw-ga-gon-saeng-puah-go",""," ខ្ញុំត្រូវការកន្សែងពោះគោ","I would like a towel.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការកន្សែងពោះគោ", "I would like a towel.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-treuw-ga-tuek-soat","","  ខ្ញុំត្រូវការទឹកសុទ្ធ","I would like some drinking water.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការទឹកសុទ្ធ", "I would like some drinking water.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-treuw-ga-phaen-tee","","  ខ្ញុំត្រូវការផែនទី","I would like a map.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការផែនទី", "I would like a map.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-treuw-ga-thnam- pda-sai","","  ខ្ញុំត្រូវការថ្នាំផ្តាសាយ","I would like the aspirin.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការថ្នាំផ្តាសាយ", "I would like the aspirin.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-treuw-ga-thnam-cheu-gaw","","  ខ្ញុំត្រូវការថ្នាំឈឺក","I would like the cough mixture.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការថ្នាំឈឺក", "I would like the cough mixture.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-treuw-ga-thnam-cheu-puah","","  ខ្ញុំត្រូវការថ្នាំឈឺពោះ","I would like the stomach ache medicine.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការថ្នាំឈឺពោះ", "I would like the stomach ache medicine.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-treuw-ga-ga-fe","","  ខ្ញុំត្រូវការកាហ្វេ","I would like a coffee.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការកាហ្វេ", "I would like a coffee.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-treuw-ga-preng-sung","","  ខ្ញុំត្រូវការប្រេងសាំង","I would like to get the fuel oil.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការប្រេងសាំង", "I would like to get the fuel oil.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-treuw-ga-tuek-jom-run","","  ខ្ញុំត្រូវការទឹកចម្រាញ់","I would like a distilled water.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការទឹកចម្រាញ់", "I would like a distilled water.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-treuw-ga-thmor-puel","","  ខ្ញុំត្រូវការថ្មពិល","I would like a battery.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការថ្មពិល", "I would like a battery.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-treuw-ga-too-rah-weeh","","  ខ្ញុំត្រូវការទុរវីស","I would like a screw driver.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការទុរវីស", "I would like a screw driver.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-treuw-ga-pror-dub-mual","","  ខ្ញុំត្រូវការប្រដាប់មួល","I would like a wrench.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការប្រដាប់មួល", "I would like a wrench.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-treuw-ga-pror-dub-doey","","  ខ្ញុំត្រូវការប្រដាប់ដូយ","I would like a jack.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការប្រដាប់ដូយ", "I would like a jack.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-treuw-ga-som-bok-gong-dough","","  ខ្ញុំត្រូវការសំបកកង់ដូរ","I would like a spare wheel.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការសំបកកង់ដូរ", "I would like a spare wheel.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-treuw-ga-puel","","  ខ្ញុំត្រូវការពិល","I would like a  flashlight.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការពិល", "I would like a  flashlight.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-treuw-ga-slarb-pria-som","","  ខ្ញុំត្រូវការស្លាបព្រាសម","I would like a fork.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការស្លាបព្រាសម", "I would like a fork.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-treuw-ga-jong-geh ","","  ខ្ញុំត្រូវការចង្កឹះ","I would like a chopstick.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការចង្កឹះ", "I would like a chopstick.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-treuw-ga-krae / pook / trow-nuab-grai","","  ខ្ញុំត្រូវការគ្រែ/ពូក/ទ្រនាប់ក្រាល","I would like a bed / mattress.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការគ្រែ/ពូក/ទ្រនាប់ក្រាល", "I would like a bed / mattress.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-treuw-ga-phuai","","  ខ្ញុំត្រូវការភួយ","I would like a blanket.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការភួយ", "I would like a blanket.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-treuw-ga-khnery","","  ខ្ញុំត្រូវការខ្នើយ","I would like a pillow.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការខ្នើយ", "I would like a pillow.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-treuw-ga-too-ra-sub","","  ខ្ញុំត្រូវការទូរសព្ទ","I would like to get a phone.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការទូរសព្ទ", "I would like to get a phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }
    public void loadCambodiaToIndonesia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("sar-yar-lar-par",""," ខ្ញុំមានអារម្មណ៍ថា ដូចជាឃ្លានហើយ","I  feel hungry.","Saya lapar",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" ខ្ញុំមានអារម្មណ៍ថា ដូចជាឃ្លានហើយ", "I  feel hungry.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-mar-gan",""," ខ្ញុំត្រូវការហូបបាយ","I would like some food.","Saya ingin makan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការហូបបាយ", "I would like some food.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mor-hon-beu-ree-gan-tan-dar-teu-ree-mar-seu-su-wai-nar-mar-dan-ar- lar-mat-ee-nee",""," សូមជួយសរសេរនូវវិក័យបត្រតាម ឈ្មោះ និងទីកន្លែងនេះផង","Could you please give me a receipt following by these name and address.","Mohon berikan tanda terima sesuai nama dan alamat ini",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" សូមជួយសរសេរនូវវិក័យបត្រតាម ឈ្មោះ និងទីកន្លែងនេះផង", "Could you please give me a receipt following by these name and address.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-geur-tas-toi-let",""," ខ្ញុំត្រូវការក្រដាសអនាម័យ","I would like some toilet paper.","Saya ingin kertas toilet",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការក្រដាសអនាម័យ", "I would like some toilet paper.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-han-dook",""," ខ្ញុំត្រូវការកន្សែងពោះគោ","I would like a towel.","Saya ingin handuk",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការកន្សែងពោះគោ", "I would like a towel.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-mee-nu-man","","  ខ្ញុំត្រូវការទឹកសុទ្ធ","I would like some drinking water.","Saya ingin minuman",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការទឹកសុទ្ធ", "I would like some drinking water.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-peu-tar","","  ខ្ញុំត្រូវការផែនទី","I would like a map.","Saya ingin peta",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការផែនទី", "I would like a map.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-o-bat-per-nu-roon-par-nas","","  ខ្ញុំត្រូវការថ្នាំផ្តាសាយ","I would like the aspirin.","Saya ingin obat penurun panas",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការថ្នាំផ្តាសាយ", "I would like the aspirin.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-o-bat-bar-took","","  ខ្ញុំត្រូវការថ្នាំឈឺក","I would like the cough mixture.","Saya ingin obat batuk",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការថ្នាំឈឺក", "I would like the cough mixture.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-o-bat-sar-kit-peu-root","","  ខ្ញុំត្រូវការថ្នាំឈឺពោះ","I would like the stomach ache medicine.","Saya ingin obat sakit perut",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការថ្នាំឈឺពោះ", "I would like the stomach ache medicine.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-mee-noom-go-pee","","  ខ្ញុំត្រូវការកាហ្វេ","I would like a coffee.","Saya ingin minum kopi",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការកាហ្វេ", "I would like a coffee.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-bar-han-bar-gar (oon-took-mo-bil-sar-yar)","","  ខ្ញុំត្រូវការប្រេងសាំង","I would like to get the fuel oil.","Saya ingin bahan bakar (untuk mobil saya)",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការប្រេងសាំង", "I would like to get the fuel oil.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-ayer- su-ring","","  ខ្ញុំត្រូវការទឹកចម្រាញ់","I would like a distilled water.","Saya ingin air suling",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការទឹកចម្រាញ់", "I would like a distilled water.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-bar-ter- rai","","  ខ្ញុំត្រូវការថ្មពិល","I would like a battery.","Saya ingin baterai",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការថ្មពិល", "I would like a battery.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-o-beng","","  ខ្ញុំត្រូវការទុរវីស","I would like a screw driver.","Saya ingin obeng",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការទុរវីស", "I would like a screw driver.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-gun-jee-ing-gris","","  ខ្ញុំត្រូវការប្រដាប់មួល","I would like a wrench.","Saya ingin kunci inggris",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការប្រដាប់មួល", "I would like a wrench.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-dong-krak","","  ខ្ញុំត្រូវការប្រដាប់ដូយ","I would like a jack.","Saya ingin dongkrak",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការប្រដាប់ដូយ", "I would like a jack.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-ban-jar-dar-ngan","","  ខ្ញុំត្រូវការសំបកកង់ដូរ","I would like a spare wheel.","Saya ingin ban cadangan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការសំបកកង់ដូរ", "I would like a spare wheel.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-lam-pu-sen-ter","","  ខ្ញុំត្រូវការពិល","I would like a  flashlight.","Saya ingin lampu senter",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការពិល", "I would like a  flashlight.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-sen-dork-kar-pu","","  ខ្ញុំត្រូវការស្លាបព្រាសម","I would like a fork.","Saya ingin sendok garpu ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការស្លាបព្រាសម", "I would like a fork.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-sum-pit","","  ខ្ញុំត្រូវការចង្កឹះ","I would like a chopstick.","Saya ingin sumpit",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការចង្កឹះ", "I would like a chopstick.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-teum-pat-tee-dur/gar-sur","","  ខ្ញុំត្រូវការគ្រែ/ពូក/ទ្រនាប់ក្រាល","I would like a bed / mattress.","Saya ingin tempat tidur/kasur",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការគ្រែ/ពូក/ទ្រនាប់ក្រាល", "I would like a bed / mattress.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-ser-lee-mut","","  ខ្ញុំត្រូវការភួយ","I would like a blanket.","Saya ingin selimut",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការភួយ", "I would like a blanket.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-ban-tal","","  ខ្ញុំត្រូវការខ្នើយ","I would like a pillow.","Saya ingin bantal ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការខ្នើយ", "I would like a pillow.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-tey-ley-pon","","  ខ្ញុំត្រូវការទូរសព្ទ","I would like to get a phone.","Saya ingin telepon ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការទូរសព្ទ", "I would like to get a phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadCambodiaToLaos(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("khoy-hoo-suek-hiw ",""," ខ្ញុំមានអារម្មណ៍ថា ដូចជាឃ្លានហើយ","I  feel hungry."," ຂ້ອຍຮູ້ສຶກຫິວ  ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" ខ្ញុំមានអារម្មណ៍ថា ដូចជាឃ្លានហើយ", "I  feel hungry.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-ar-harn",""," ខ្ញុំត្រូវការហូបបាយ","I would like some food."," ຂ້ອຍຕ້ອງການອາຫານ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការហូបបាយ", "I would like some food.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ga-lu-na-org-bin-tarm-cheu-lae-thee-yoo-nee-num",""," សូមជួយសរសេរនូវវិក័យបត្រតាម ឈ្មោះ និងទីកន្លែងនេះផង","Could you please give me a receipt following by these name and address."," ກະລຸນາອອກບິນຕາມຊື່ແລະທີ່ຢູ່ນີ້ນຳ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" សូមជួយសរសេរនូវវិក័យបត្រតាម ឈ្មោះ និងទីកន្លែងនេះផង", "Could you please give me a receipt following by these name and address.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-jia-a-na-mai",""," ខ្ញុំត្រូវការក្រដាសអនាម័យ","I would like some toilet paper."," ຂ້ອຍຕ້ອງການເຈັ້ຍອະນາໄມ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការក្រដាសអនាម័យ", "I would like some toilet paper.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-phar-phae",""," ខ្ញុំត្រូវការកន្សែងពោះគោ","I would like a towel."," ຂ້ອຍຕ້ອງການຜ້າແພ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការកន្សែងពោះគោ", "I would like a towel.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-num-deum","","  ខ្ញុំត្រូវការទឹកសុទ្ធ","I would like some drinking water."," ຂ້ອຍຕ້ອງການນ້ຳດື່ມ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការទឹកសុទ្ធ", "I would like some drinking water.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-phaen-thee","","  ខ្ញុំត្រូវការផែនទី","I would like a map."," ຂ້ອຍຕ້ອງການແຜນທີ່",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការផែនទី", "I would like a map.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-ya-kae-khai","","  ខ្ញុំត្រូវការថ្នាំផ្តាសាយ","I would like the aspirin."," ຂ້ອຍຕ້ອງການຢາແກ້ໄຂ້",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការថ្នាំផ្តាសាយ", "I would like the aspirin.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-ya-kae-ai","","  ខ្ញុំត្រូវការថ្នាំឈឺក","I would like the cough mixture."," ຂ້ອຍຕ້ອງການຢາແກ້ໄອ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការថ្នាំឈឺក", "I would like the cough mixture.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-ya-kae-jeb-thong","","  ខ្ញុំត្រូវការថ្នាំឈឺពោះ","I would like the stomach ache medicine."," ຂ້ອຍຕ້ອງການຢາແກ້ເຈັບທ້ອງ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការថ្នាំឈឺពោះ", "I would like the stomach ache medicine.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-ga-fe","","  ខ្ញុំត្រូវការកាហ្វេ","I would like a coffee."," ຂ້ອຍຕ້ອງການກາເຟ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការកាហ្វេ", "I would like a coffee.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-num-mun","","  ខ្ញុំត្រូវការប្រេងសាំង","I would like to get the fuel oil."," ຂ້ອຍຕ້ອງການນ້ຳມັນ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការប្រេងសាំង", "I would like to get the fuel oil.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-num-gun","","  ខ្ញុំត្រូវការទឹកចម្រាញ់","I would like a distilled water."," ຂ້ອຍຕ້ອງການນ້ຳກັ່ນ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការទឹកចម្រាញ់", "I would like a distilled water.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-mor-fai","","  ខ្ញុំត្រូវការថ្មពិល","I would like a battery."," ຂ້ອຍຕ້ອງການໝໍ້ໄຟ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការថ្មពិល", "I would like a battery.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-ta-lah-bid","","  ខ្ញុំត្រូវការទុរវីស","I would like a screw driver."," ຂ້ອຍຕ້ອງການຕາລະບິດ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការទុរវីស", "I would like a screw driver.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-kheem-lok","","  ខ្ញុំត្រូវការប្រដាប់មួល","I would like a wrench."," ຂ້ອຍຕ້ອງການຄີມລ໊ອກ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការប្រដាប់មួល", "I would like a wrench.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-ga-lik","","  ខ្ញុំត្រូវការប្រដាប់ដូយ","I would like a jack."," ຂ້ອຍຕ້ອງການກະລິກ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការប្រដាប់ដូយ", "I would like a jack.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-lor-load-sum-hong","","  ខ្ញុំត្រូវការសំបកកង់ដូរ","I would like a spare wheel."," ຂ້ອຍຕ້ອງການລໍ້ລົດສຳຮອງ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការសំបកកង់ដូរ", "I would like a spare wheel.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-fai-sai","","  ខ្ញុំត្រូវការពិល","I would like a  flashlight."," ຂ້ອຍຕ້ອງການໄຟສາຍ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការពិល", "I would like a  flashlight.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-buang-som","","  ខ្ញុំត្រូវការស្លាបព្រាសម","I would like a fork."," ຂ້ອຍຕ້ອງການບ່ວງສ້ອມ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការស្លាបព្រាសម", "I would like a fork.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-mai-too","","  ខ្ញុំត្រូវការចង្កឹះ","I would like a chopstick."," ຂ້ອຍຕ້ອງການໄມ້ຖູ່",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការចង្កឹះ", "I would like a chopstick.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-suea-fook-boh","","  ខ្ញុំត្រូវការគ្រែ/ពូក/ទ្រនាប់ក្រាល","I would like a bed / mattress."," ຂ້ອຍຕ້ອງການເສື່ອ ຟູກ ເບາະ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការគ្រែ/ពូក/ទ្រនាប់ក្រាល", "I would like a bed / mattress.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-pha-hom","","  ខ្ញុំត្រូវការភួយ","I would like a blanket."," ຂ້ອຍຕ້ອງການຜ້າຫົ່ມ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការភួយ", "I would like a blanket.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-morn","","  ខ្ញុំត្រូវការខ្នើយ","I would like a pillow."," ຂ້ອຍຕ້ອງການໝອນ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការខ្នើយ", "I would like a pillow.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-toe-la-sub","","  ខ្ញុំត្រូវការទូរសព្ទ","I would like to get a phone."," ຂ້ອຍຕ້ອງການໂທລະສັບ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការទូរសព្ទ", "I would like to get a phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadCambodiaToMalaysia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("sa-ya-ra-sa-la-pul",""," ខ្ញុំមានអារម្មណ៍ថា ដូចជាឃ្លានហើយ","I  feel hungry.","Saya rasa lapar",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" ខ្ញុំមានអារម្មណ៍ថា ដូចជាឃ្លានហើយ", "I  feel hungry.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-hern-duk-ma-gun-na-si",""," ខ្ញុំត្រូវការហូបបាយ","I would like some food.","Saya hendak makan nasi",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការហូបបាយ", "I would like some food.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-ger-loo-wul-gun-rer-sit-mer- ngee-goot-na-ma-darn-ar-la-mud-ee-nee",""," សូមជួយសរសេរនូវវិក័យបត្រតាម ឈ្មោះ និងទីកន្លែងនេះផង","Could you please give me a receipt following by these name and address.","Tolong keluarkan resit mengikut nama dan alamat ini",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" សូមជួយសរសេរនូវវិក័យបត្រតាម ឈ្មោះ និងទីកន្លែងនេះផង", "Could you please give me a receipt following by these name and address.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-ger-tas-tee-soo",""," ខ្ញុំត្រូវការក្រដាសអនាម័យ","I would like some toilet paper.","Saya perlukan kertas tisu",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការក្រដាសអនាម័យ", "I would like some toilet paper.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-gai-too-wa-la",""," ខ្ញុំត្រូវការកន្សែងពោះគោ","I would like a towel.","Saya perlukankain tuala",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការកន្សែងពោះគោ", "I would like a towel.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-ma-hoo-ai-mee-noo-mun","","  ខ្ញុំត្រូវការទឹកសុទ្ធ","I would like some drinking water.","Saya mahu air minuman",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការទឹកសុទ្ធ", "I would like some drinking water.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-per-ta","","  ខ្ញុំត្រូវការផែនទី","I would like a map.","Saya perlukan peta",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការផែនទី", "I would like a map.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-oo-bud-der-mun","","  ខ្ញុំត្រូវការថ្នាំផ្តាសាយ","I would like the aspirin.","Saya perlukan  ubat deman",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការថ្នាំផ្តាសាយ", "I would like the aspirin.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-oo-bud-ba-took","","  ខ្ញុំត្រូវការថ្នាំឈឺក","I would like the cough mixture.","Saya perlukan ubat batuk",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការថ្នាំឈឺក", "I would like the cough mixture.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-oo-bud-sa-git-per-root","","  ខ្ញុំត្រូវការថ្នាំឈឺពោះ","I would like the stomach ache medicine.","Saya perlukan ubat sakit perut",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការថ្នាំឈឺពោះ", "I would like the stomach ache medicine.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-ma-hoo-go-pee","","  ខ្ញុំត្រូវការកាហ្វេ","I would like a coffee.","Saya mahu kopi",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការកាហ្វេ", "I would like a coffee.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-mee-yuk","","  ខ្ញុំត្រូវការប្រេងសាំង","I would like to get the fuel oil.","Saya perlukan  minyak",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការប្រេងសាំង", "I would like to get the fuel oil.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-ai-soo-ling","","  ខ្ញុំត្រូវការទឹកចម្រាញ់","I would like a distilled water.","Saya perlukan air suling",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការទឹកចម្រាញ់", "I would like a distilled water.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-ba-ter-ree","","  ខ្ញុំត្រូវការថ្មពិល","I would like a battery.","Saya perlukan bateri",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការថ្មពិល", "I would like a battery.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-per-moo-tul-sgroo","","  ខ្ញុំត្រូវការទុរវីស","I would like a screw driver.","Saya perlukan pemutar skru",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការទុរវីស", "I would like a screw driver.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-ser-pa-na","","  ខ្ញុំត្រូវការប្រដាប់មួល","I would like a wrench.","Saya perlukan sepana",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការប្រដាប់មួល", "I would like a wrench.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-yek","","  ខ្ញុំត្រូវការប្រដាប់ដូយ","I would like a jack.","Saya perlukan jek",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការប្រដាប់ដូយ", "I would like a jack.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-ta-yul-kun-tee","","  ខ្ញុំត្រូវការសំបកកង់ដូរ","I would like a spare wheel.","Saya perlukan  tayar ganti",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការសំបកកង់ដូរ", "I would like a spare wheel.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-lum-poo-soo-luh","","  ខ្ញុំត្រូវការពិល","I would like a  flashlight.","Saya perlukan lampu suluh",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការពិល", "I would like a  flashlight.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-soo-doo/ kul-poo","","  ខ្ញុំត្រូវការស្លាបព្រាសម","I would like a fork.","Saya perlukan sudu/garpu",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការស្លាបព្រាសម", "I would like a fork.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-ga-yoo-per-nger-pit","","  ខ្ញុំត្រូវការចង្កឹះ","I would like a chopstick.","Saya perlukan kayu pengepit",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការចង្កឹះ", "I would like a chopstick.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-ga-til/ tee-lum/ la-pik","","  ខ្ញុំត្រូវការគ្រែ/ពូក/ទ្រនាប់ក្រាល","I would like a bed / mattress.","Saya perlukan katil/ tilam/lapik",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការគ្រែ/ពូក/ទ្រនាប់ក្រាល", "I would like a bed / mattress.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-gai-ser-lee-mut","","  ខ្ញុំត្រូវការភួយ","I would like a blanket.","Saya perlukan kain selimut",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការភួយ", "I would like a blanket.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-bun-tal","","  ខ្ញុំត្រូវការខ្នើយ","I would like a pillow.","Saya perlukan bantal",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការខ្នើយ", "I would like a pillow.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-pern-loo-gun-tay-lay-fon","","  ខ្ញុំត្រូវការទូរសព្ទ","I would like to get a phone.","Saya perlukan telefon",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការទូរសព្ទ", "I would like to get a phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadCambodiaToMyanmar(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ja-nor/ja-ma-bai-sa-dae",""," ខ្ញុំមានអារម្មណ៍ថា ដូចជាឃ្លានហើយ","I  feel hungry.","ကြ်န္ေတာ္⁄ကြ်န္မ ဗိုက္ဆာတယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" ខ្ញុំមានអារម្មណ៍ថា ដូចជាឃ្លានហើយ", "I  feel hungry.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-a-sa-a-sa-sa-jin-dae ",""," ខ្ញុំត្រូវការហូបបាយ","I would like some food.","ကြ်န္ေတာ္⁄ကြ်န္မ အစားအစာစားခ်င္တယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការហូបបាយ", "I would like some food.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("je-zoo-pue-ywe -paw-cha-mana-mae-naeh, ne- ya-le-sa-ko, ye-pe-ba",""," សូមជួយសរសេរនូវវិក័យបត្រតាម ឈ្មោះ និងទីកន្លែងនេះផង","Could you please give me a receipt following by these name and address.","ေက်းဇူးျပဳ၍ ေဘာက္ခ်ာမွာနာမည္နဲ႔ ေနရပ္လိပ္စာကိုေရးေပးပါ။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" សូមជួយសរសេរនូវវិក័យបត្រតាម ឈ្មោះ និងទីកន្លែងនេះផង", "Could you please give me a receipt following by these name and address.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja- nor/ja-ma tissue-loe-jin-dae",""," ខ្ញុំត្រូវការក្រដាសអនាម័យ","I would like some toilet paper.","ကြ်န္ေတာ္⁄ကြ်န္မ တစ္ရွဴးလိုခ်င္တယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការក្រដាសអនាម័យ", "I would like some toilet paper.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma koe-toh-pa-wa-loe- jin-dae",""," ខ្ញុំត្រូវការកន្សែងពោះគោ","I would like a towel.","ကြ်န္ေတာ္⁄ကြ်န္မ ကိုယ္သုတ္ပဝါလိုခ်င္တယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការកន្សែងពោះគោ", "I would like a towel.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma taw-ye-loe- jin-dae","","  ខ្ញុំត្រូវការទឹកសុទ្ធ","I would like some drinking water.","ကြ်န္ေတာ္⁄ကြ်န္မ ေသာက္ေရလိုခ်င္တယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការទឹកសុទ្ធ", "I would like some drinking water.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma mye-pong- loe-jin-dae","","  ខ្ញុំត្រូវការផែនទី","I would like a map.","ကြ်န္ေတာ္⁄ကြ်န္မ ေျမပံုလိုခ်င္တယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការផែនទី", "I would like a map.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma a-phia-jah-se-loe-jin-dae","","  ខ្ញុំត្រូវការថ្នាំផ្តាសាយ","I would like the aspirin.","ကြ်န္ေတာ္⁄ကြ်န္မ အဖ်ားက်ေဆးလိုခ်င္တယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការថ្នាំផ្តាសាយ", "I would like the aspirin.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma chaw-so- pyaw-se-loe- in-dae","","  ខ្ញុំត្រូវការថ្នាំឈឺក","I would like the cough mixture.","ကြ်န္ေတာ္⁄ကြ်န္မ ေခ်ာင္းဆိုးေပ်ာက္ေဆးလိုခ်င္တယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការថ្នាំឈឺក", "I would like the cough mixture.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-bai-na- pyaw-se-loe- jin-dae","","  ខ្ញុំត្រូវការថ្នាំឈឺពោះ","I would like the stomach ache medicine.","ကြ်န္ေတာ္⁄ကြ်န္မ ပိုက္နာေပ်ာက္ေဆးလိုခ်င္တယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការថ្នាំឈឺពោះ", "I would like the stomach ache medicine.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma kor-phee-loe- jin-dae","","  ខ្ញុំត្រូវការកាហ្វេ","I would like a coffee.","ကြ်န္ေတာ္⁄ကြ်န္မ ေကာ္ဖီလိုခ်င္တယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការកាហ្វេ", "I would like a coffee.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja nor/ja-ma dat-see-loe- jin-dae","","  ខ្ញុំត្រូវការប្រេងសាំង","I would like to get the fuel oil.","ကြ်န္ေတာ္⁄ကြ်န္မ ဓာတ္ဆီလိုခ်င္တယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការប្រេងសាំង", "I would like to get the fuel oil.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma mo-ye-loe-jin-dae","","  ខ្ញុំត្រូវការទឹកចម្រាញ់","I would like a distilled water.","ကြ်န္ေတာ္⁄ကြ်န္မ မိုးေရလိုခ်င္တယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការទឹកចម្រាញ់", "I would like a distilled water.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma battery-loe- jin-dae","","  ខ្ញុំត្រូវការថ្មពិល","I would like a battery.","ကြ်န္ေတာ္⁄ကြ်န္မ ဘက္ထရီလိုခ်င္တယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការថ្មពិល", "I would like a battery.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-waeh -o-laeh- loe-jin-dae","","  ខ្ញុំត្រូវការទុរវីស","I would like a screw driver.","ကြ်န္ေတာ္⁄ကြ်န္မ ၀က္အူလွည့္လိုခ်င္တယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការទុរវីស", "I would like a screw driver.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma gwah- loe -jin dae","","  ខ្ញុំត្រូវការប្រដាប់មួល","I would like a wrench.","ကြ်န္ေတာ္⁄ကြ်န္မ ဂြလိုခ်င္တယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការប្រដាប់មួល", "I would like a wrench.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma jai-loe-jin- dae","","  ខ្ញុំត្រូវការប្រដាប់ដូយ","I would like a jack.","ja-nor/ja-ma mo-ye-loe-jin-dae",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការប្រដាប់ដូយ", "I would like a jack.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma sa-pae-ya a-po-bee-loe-jin-dae","","  ខ្ញុំត្រូវការសំបកកង់ដូរ","I would like a spare wheel.","ja-nor/ja-ma battery-loe- jin-dae",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការសំបកកង់ដូរ", "I would like a spare wheel.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma dat-mee-loe-jin-dae","","  ខ្ញុំត្រូវការពិល","I would like a  flashlight.","ja-nor/ja-ma-waeh -o-laeh- loe-jin-dae",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការពិល", "I would like a  flashlight.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma zoon-kha-yeen-loe-jin-dae","","  ខ្ញុំត្រូវការស្លាបព្រាសម","I would like a fork.","ja-nor/ja-ma gwah- loe -jin dae",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការស្លាបព្រាសម", "I would like a fork.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma too-loe-jin- dae","","  ខ្ញុំត្រូវការចង្កឹះ","I would like a chopstick.","ကြ်န္ေတာ္⁄ကြ်န္မ တူလိုခ်င္တယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការចង្កឹះ", "I would like a chopstick.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma mwe-ya- koo-shin-loe-jin-dae","","  ខ្ញុំត្រូវការគ្រែ/ពូក/ទ្រនាប់ក្រាល","I would like a bed / mattress.","ကြ်န္ေတာ္⁄ကြ်န္မ ေမြ႕ရာ၊ ကူရွင္ လိုခ်င္တယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការគ្រែ/ពូក/ទ្រនាប់ក្រាល", "I would like a bed / mattress.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma chong-saw loe-jin-dae","","  ខ្ញុំត្រូវការភួយ","I would like a blanket.","ကြ်န္ေတာ္⁄ကြ်န္မ ျခံဳေစာင္လိုခ်င္တယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការភួយ", "I would like a blanket.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma gaw-ong-loe- jin-dae","","  ខ្ញុំត្រូវការខ្នើយ","I would like a pillow.","ကြ်န္ေတာ္⁄ကြ်န္မ ေခါင္းအံုးလိုခ်င္တယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការខ្នើយ", "I would like a pillow.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma phong-saeh- jin-dae","","  ខ្ញុំត្រូវការទូរសព្ទ","I would like to get a phone.","ကြ်န္ေတာ္⁄ကြ်န္မ ဖုန္းဆက္လိုခ်င္တယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការទូរសព្ទ", "I would like to get a phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadCambodiaToPhilippines(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("gu-tom-ar-go",""," ខ្ញុំមានអារម្មណ៍ថា ដូចជាឃ្លានហើយ","I  feel hungry.","Gutom ako",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" ខ្ញុំមានអារម្មណ៍ថា ដូចជាឃ្លានហើយ", "I  feel hungry.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gai-lar-ngan-ar-gong-gu-mar-in",""," ខ្ញុំត្រូវការហូបបាយ","I would like some food.","Kailangan akong kumain",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការហូបបាយ", "I would like some food.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mang-yar-ring-mak-bi-gai-nang-rey-si-bo-ar-yorn-sar-par-ngar-lan-nar-i-to-at-ad-dres",""," សូមជួយសរសេរនូវវិក័យបត្រតាម ឈ្មោះ និងទីកន្លែងនេះផង","Could you please give me a receipt following by these name and address.","Mangyaring magbigay ng resibo ayon sa pangalan na ito at address",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" សូមជួយសរសេរនូវវិក័យបត្រតាម ឈ្មោះ និងទីកន្លែងនេះផង", "Could you please give me a receipt following by these name and address.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("go-lar-ngan-go-nang-tich-chu-pey-per",""," ខ្ញុំត្រូវការក្រដាសអនាម័យ","I would like some toilet paper.","Kailangan ko ng tissue paper",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការក្រដាសអនាម័យ", "I would like some toilet paper.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gai-lar-ngan-go-nang-tu-warl-yar",""," ខ្ញុំត្រូវការកន្សែងពោះគោ","I would like a towel.","Kailangan ko ng tuwalya",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការកន្សែងពោះគោ", "I would like a towel.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gai-lar-ngan-go-nang-tu-bik-nar-mar-i-nom","","  ខ្ញុំត្រូវការទឹកសុទ្ធ","I would like some drinking water.","Kailangan ko ng tubig na mainom",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការទឹកសុទ្ធ", "I would like some drinking water.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gai-lar-ngan-go-nang-mar-par","","  ខ្ញុំត្រូវការផែនទី","I would like a map.","Kailangan ko ng mapa",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការផែនទី", "I would like a map.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gai-lar-ngan-go-nang-gar-mot-sar-lak-nat","","  ខ្ញុំត្រូវការថ្នាំផ្តាសាយ","I would like the aspirin.","Kailangan ko ng gamot sa lagnat.",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការថ្នាំផ្តាសាយ", "I would like the aspirin.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gai-lar-ngan-go-nang-gar-mot-sar-u-bo","","  ខ្ញុំត្រូវការថ្នាំឈឺក","I would like the cough mixture.","Kailangan ko ng gamot sa ubo.",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការថ្នាំឈឺក", "I would like the cough mixture.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gai-lar-ngan-go-nang-gar-mot-sar-sar-git-nar-ti-jan","","  ខ្ញុំត្រូវការថ្នាំឈឺពោះ","I would like the stomach ache medicine.","Kailangan ko ng gamut sa sakit na tiyan.",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការថ្នាំឈឺពោះ", "I would like the stomach ache medicine.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gai-lar-ngan-go-nang-gar-pey","","  ខ្ញុំត្រូវការកាហ្វេ","I would like a coffee.","Kailangan ko ng kape",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការកាហ្វេ", "I would like a coffee.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gai-lar-ngan-go-nang-gar-cho-li-nar","","  ខ្ញុំត្រូវការប្រេងសាំង","I would like to get the fuel oil.","Kailangan ko ng gasolina",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការប្រេងសាំង", "I would like to get the fuel oil.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gai-lar-ngan-go-nang-dis-til-nar-tu-bik","","  ខ្ញុំត្រូវការទឹកចម្រាញ់","I would like a distilled water.","Kailangan ko ng distilled na tubig",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការទឹកចម្រាញ់", "I would like a distilled water.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gai-lar-ngan-go-nang-bat-ter-ri-yar","","  ខ្ញុំត្រូវការថ្មពិល","I would like a battery.","Kailangan ko ng batteriya",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការថ្មពិល", "I would like a battery.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gai-lar-ngan-go-nang-dis-tor-nil-yar-dor","","  ខ្ញុំត្រូវការទុរវីស","I would like a screw driver.","Kailangan ko ng distornilyador",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការទុរវីស", "I would like a screw driver.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gai-lar-ngan-go-nang-rench","","  ខ្ញុំត្រូវការប្រដាប់មួល","I would like a wrench.","Kailangan ko ng wrench",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការប្រដាប់មួល", "I would like a wrench.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gai-lar-ngan-go-nang-kren","","  ខ្ញុំត្រូវការប្រដាប់ដូយ","I would like a jack.","Kailangan ko ng crane",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការប្រដាប់ដូយ", "I would like a jack.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gai-lar-ngan-go-nang-spare-na-gu-long","","  ខ្ញុំត្រូវការសំបកកង់ដូរ","I would like a spare wheel.","Kailangan ko ng spare na gulong",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការសំបកកង់ដូរ", "I would like a spare wheel.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gai-lar-ngan-go-nang-flash-light","","  ខ្ញុំត្រូវការពិល","I would like a  flashlight.","Kailangan ko ng flashlight",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការពិល", "I would like a  flashlight.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gai-lar-ngan-go-nang-ti-ni-dor","","  ខ្ញុំត្រូវការស្លាបព្រាសម","I would like a fork.","Kailangan ko ng tinidor",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការស្លាបព្រាសម", "I would like a fork.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gai-lar-ngan-go-nang-chop-stiks","","  ខ្ញុំត្រូវការចង្កឹះ","I would like a chopstick.","Kailangan ko ng chopsticks",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការចង្កឹះ", "I would like a chopstick.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gai-lar-ngan-go-nang-goot-sorn","","  ខ្ញុំត្រូវការគ្រែ/ពូក/ទ្រនាប់ក្រាល","I would like a bed / mattress.","Kailangan ko ng kutson",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការគ្រែ/ពូក/ទ្រនាប់ក្រាល", "I would like a bed / mattress.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gai-lar-ngan-go-nang-gu-mort","","  ខ្ញុំត្រូវការភួយ","I would like a blanket.","Kailangan ko ng kumot",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការភួយ", "I would like a blanket.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gai-lar-ngan-go-nang-u-nan","","  ខ្ញុំត្រូវការខ្នើយ","I would like a pillow.","Kailangan ko ng unan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការខ្នើយ", "I would like a pillow.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gai-lar-ngan-gong-tu-mar-wak-sar-tey-ley-po-no","","  ខ្ញុំត្រូវការទូរសព្ទ","I would like to get a phone.","Kailangan kong tumawag sa telepono",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការទូរសព្ទ", "I would like to get a phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadCambodiaToSingapore(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ai-feel-hang-gree",""," ខ្ញុំមានអារម្មណ៍ថា ដូចជាឃ្លានហើយ","I  feel hungry.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" ខ្ញុំមានអារម្មណ៍ថា ដូចជាឃ្លានហើយ", "I  feel hungry.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-sam-food",""," ខ្ញុំត្រូវការហូបបាយ","I would like some food.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការហូបបាយ", "I would like some food.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kood-yu-plees-gif-mee-a-ree-seet-fol-lo-wing-bai-dis-nem-an-ad-dres",""," សូមជួយសរសេរនូវវិក័យបត្រតាម ឈ្មោះ និងទីកន្លែងនេះផង","Could you please give me a receipt following by these name and address.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" សូមជួយសរសេរនូវវិក័យបត្រតាម ឈ្មោះ និងទីកន្លែងនេះផង", "Could you please give me a receipt following by these name and address.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-sam-toi-let-pey-per",""," ខ្ញុំត្រូវការក្រដាសអនាម័យ","I would like some toilet paper.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការក្រដាសអនាម័យ", "I would like some toilet paper.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-a-tao-wel",""," ខ្ញុំត្រូវការកន្សែងពោះគោ","I would like a towel.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការកន្សែងពោះគោ", "I would like a towel.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-sam-drink-ging-wor-ter","","  ខ្ញុំត្រូវការទឹកសុទ្ធ","I would like some drinking water.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការទឹកសុទ្ធ", "I would like some drinking water.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-a-map","","  ខ្ញុំត្រូវការផែនទី","I would like a map.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការផែនទី", "I would like a map.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-di-as-pai-rin","","  ខ្ញុំត្រូវការថ្នាំផ្តាសាយ","I would like the aspirin.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការថ្នាំផ្តាសាយ", "I would like the aspirin.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-der-kof-mix-cher","","  ខ្ញុំត្រូវការថ្នាំឈឺក","I would like the cough mixture.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការថ្នាំឈឺក", "I would like the cough mixture.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-der-sto-mak-ek- med-di-sin","","  ខ្ញុំត្រូវការថ្នាំឈឺពោះ","I would like the stomach ache medicine.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការថ្នាំឈឺពោះ", "I would like the stomach ache medicine.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-a-cof-fee","","  ខ្ញុំត្រូវការកាហ្វេ","I would like a coffee.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការកាហ្វេ", "I would like a coffee.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-tu-get-der- fi-el-oil","","  ខ្ញុំត្រូវការប្រេងសាំង","I would like to get the fuel oil.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការប្រេងសាំង", "I would like to get the fuel oil.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-a-dis-til-wor-ter","","  ខ្ញុំត្រូវការទឹកចម្រាញ់","I would like a distilled water.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការទឹកចម្រាញ់", "I would like a distilled water.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-a-bat-ter-ree","","  ខ្ញុំត្រូវការថ្មពិល","I would like a battery.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការថ្មពិល", "I would like a battery.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-a-skru-drai-wer","","  ខ្ញុំត្រូវការទុរវីស","I would like a screw driver.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការទុរវីស", "I would like a screw driver.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-a-wrench","","  ខ្ញុំត្រូវការប្រដាប់មួល","I would like a wrench.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការប្រដាប់មួល", "I would like a wrench.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-a-jak","","  ខ្ញុំត្រូវការប្រដាប់ដូយ","I would like a jack.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការប្រដាប់ដូយ", "I would like a jack.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-a-spare-weel","","  ខ្ញុំត្រូវការសំបកកង់ដូរ","I would like a spare wheel.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការសំបកកង់ដូរ", "I would like a spare wheel.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-a-flash-light","","  ខ្ញុំត្រូវការពិល","I would like a  flashlight.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការពិល", "I would like a  flashlight.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-a-fok","","  ខ្ញុំត្រូវការស្លាបព្រាសម","I would like a fork.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការស្លាបព្រាសម", "I would like a fork.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-a-chop-stik","","  ខ្ញុំត្រូវការចង្កឹះ","I would like a chopstick.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការចង្កឹះ", "I would like a chopstick.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-a-bed/mat-tres","","  ខ្ញុំត្រូវការគ្រែ/ពូក/ទ្រនាប់ក្រាល","I would like a bed / mattress.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការគ្រែ/ពូក/ទ្រនាប់ក្រាល", "I would like a bed / mattress.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-a-blang-ket","","  ខ្ញុំត្រូវការភួយ","I would like a blanket.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការភួយ", "I would like a blanket.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-a-pil-lo","","  ខ្ញុំត្រូវការខ្នើយ","I would like a pillow.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការខ្នើយ", "I would like a pillow.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-tu-get-a-fon","","  ខ្ញុំត្រូវការទូរសព្ទ","I would like to get a phone.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការទូរសព្ទ", "I would like to get a phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadCambodiaToVietnam(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("toay-thuai-doi",""," ខ្ញុំមានអារម្មណ៍ថា ដូចជាឃ្លានហើយ","I  feel hungry.","tôi thấy đói",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" ខ្ញុំមានអារម្មណ៍ថា ដូចជាឃ្លានហើយ", "I  feel hungry.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-un",""," ខ្ញុំត្រូវការហូបបាយ","I would like some food.","tôi muốn ăn",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការហូបបាយ", "I would like some food.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sin-wiet-hwa-dern-twae-ten-wa-dea- jee-nai",""," សូមជួយសរសេរនូវវិក័យបត្រតាម ឈ្មោះ និងទីកន្លែងនេះផង","Could you please give me a receipt following by these name and address.","xin viết hóa đơn theo tên và địa chỉ này",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" សូមជួយសរសេរនូវវិក័យបត្រតាម ឈ្មោះ និងទីកន្លែងនេះផង", "Could you please give me a receipt following by these name and address.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-maun-yeai-wae-sing",""," ខ្ញុំត្រូវការក្រដាសអនាម័យ","I would like some toilet paper.","tôi muốn giấy vệ sinh",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការក្រដាសអនាម័យ", "I would like some toilet paper.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-khan-tum",""," ខ្ញុំត្រូវការកន្សែងពោះគោ","I would like a towel.","tôi muốn khăn tắm",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការកន្សែងពោះគោ", "I would like a towel.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-neuak-uang","","  ខ្ញុំត្រូវការទឹកសុទ្ធ","I would like some drinking water.","tôi muốn nước uống",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការទឹកសុទ្ធ", "I would like some drinking water.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-ban-doe","","  ខ្ញុំត្រូវការផែនទី","I would like a map.","tôi muốn bản đồ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការផែនទី", "I would like a map.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-thuak-kam","","  ខ្ញុំត្រូវការថ្នាំផ្តាសាយ","I would like the aspirin.","tôi muốn thuốc cảm",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការថ្នាំផ្តាសាយ", "I would like the aspirin.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-thuak-haw","","  ខ្ញុំត្រូវការថ្នាំឈឺក","I would like the cough mixture.","tôi muốn thuốc ho",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការថ្នាំឈឺក", "I would like the cough mixture.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-thuak-doa-boong","","  ខ្ញុំត្រូវការថ្នាំឈឺពោះ","I would like the stomach ache medicine.","tôi muốn thuốc đau bụng",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការថ្នាំឈឺពោះ", "I would like the stomach ache medicine.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-ka-fe","","  ខ្ញុំត្រូវការកាហ្វេ","I would like a coffee.","tôi muốn  cà phê",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការកាហ្វេ", "I would like a coffee.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-yao-sung","","  ខ្ញុំត្រូវការប្រេងសាំង","I would like to get the fuel oil.","tôi muốn dầu xăng",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការប្រេងសាំង", "I would like to get the fuel oil.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-neuak-log","","  ខ្ញុំត្រូវការទឹកចម្រាញ់","I would like a distilled water.","tôi muốn nước lọc",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការទឹកចម្រាញ់", "I would like a distilled water.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-maun-bing-ug-kwui","","  ខ្ញុំត្រូវការថ្មពិល","I would like a battery.","tôi muốn bình ắc quy",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការថ្មពិល", "I would like a battery.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-kai-tung-wit","","  ខ្ញុំត្រូវការទុរវីស","I would like a screw driver.","tôi muốn cái tung vít",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការទុរវីស", "I would like a screw driver.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-kai-jia-kwa","","  ខ្ញុំត្រូវការប្រដាប់មួល","I would like a wrench.","tôi muốn cái chìa khóa",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការប្រដាប់មួល", "I would like a wrench.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-kai-neung-sae","","  ខ្ញុំត្រូវការប្រដាប់ដូយ","I would like a jack.","tôi muốn cái nâng xe",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការប្រដាប់ដូយ", "I would like a jack.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-bun-sae-yue-fong","","  ខ្ញុំត្រូវការសំបកកង់ដូរ","I would like a spare wheel.","tôi muốn bánh xe dự phòng",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការសំបកកង់ដូរ", "I would like a spare wheel.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-daen-bin","","  ខ្ញុំត្រូវការពិល","I would like a  flashlight.","tôi muốn đèn pin",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការពិល", "I would like a  flashlight.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-kai-near","","  ខ្ញុំត្រូវការស្លាបព្រាសម","I would like a fork.","tôi muốn cái nĩa",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការស្លាបព្រាសម", "I would like a fork.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-doi-dua","","  ខ្ញុំត្រូវការចង្កឹះ","I would like a chopstick.","tôi muốn đôi đũa",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការចង្កឹះ", "I would like a chopstick.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan -term-nem / term-nem / term-nem ","","  ខ្ញុំត្រូវការគ្រែ/ពូក/ទ្រនាប់ក្រាល","I would like a bed / mattress.","tôi muốn tấm nệm tấm nệm",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការគ្រែ/ពូក/ទ្រនាប់ក្រាល", "I would like a bed / mattress.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-kai-jan","","  ខ្ញុំត្រូវការភួយ","I would like a blanket.","tôi muốn cái chăn",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការភួយ", "I would like a blanket.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-kai-koai","","  ខ្ញុំត្រូវការខ្នើយ","I would like a pillow.","tôi muốn cái gối",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការខ្នើយ", "I would like a pillow.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-dien-twai","","  ខ្ញុំត្រូវការទូរសព្ទ","I would like to get a phone.","tôi muốn điện thoại",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("  ខ្ញុំត្រូវការទូរសព្ទ", "I would like to get a phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
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

