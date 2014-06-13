package com.example.happytalk.app.Database;

import com.example.happytalk.app.Child;
import com.example.happytalk.app.GroupHeader;

import java.util.ArrayList;

/**
 * Created by oVANILLAz on 6/10/14 AD.
 */
public class EmergencyDAL {
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
        Child
                child = new Child("Help me! I�ve been robbed.","","Tolong , saya telah disamun","","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Tolong , saya telah disamun", "", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("Help me! I've been attacked.","","Tolong , saya telah dicederakan orang","","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong , saya telah dicederakan orang", "", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("I am Thai. Does anyone speak Thai?","","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?","","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?", "", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("My car has broken down, can you help me?","","Kereta saya rosak. Bolehkah anda tolong saya?","","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Kereta saya rosak. Bolehkah anda tolong saya?", "", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("I�ve got a temperature.","","Saya deman","","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya deman", "", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("I've been having headaches.","","Saya sakit kepala","","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit kepala", "", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("I've been having stomachache.","","Saya sakit perut (tidak sihat)","","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (tidak sihat)", "", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("I would like to go to the toilet.","","Saya sakit perut (hendak ke tandas)","","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (hendak ke tandas)", "", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("I need to charge up my phone.","","Saya mahu mengecaj bateri ","","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu mengecaj bateri ", "", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("I would like to call an insurance.","","Saya mahu panggil insuren","","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu panggil insuren", "", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("Could you take me to the hospital?","","Tolong hantarkan saya ke hospital","","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong hantarkan saya ke hospital", "", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("I�ve been having an accident, could you help me?","","Saya mengalami kemalangan Tolonglah saya","","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mengalami kemalangan Tolonglah saya", "", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToCambodia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("juay-phong-khyom-treuw-joe-plon","","Tolong , saya telah disamun","Help me! I�ve been robbed.","�????? ???????????????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Tolong , saya telah disamun", "Help me! I�ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("juay -phong-khyom- treuw -gay-thwer-barb","","Tolong , saya telah dicederakan orang","Help me! I've been attacked.","�??????????????? ?????????????? ?????????????????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong , saya telah dicederakan orang", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("khyom-jia-juan-jiad-thai-ter-mian- niah-na-art-ni-yiay-phia-sa-thai-barn-khlah-tay","","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?","I am Thai. Does anyone speak Thai?","�????????? ???????????????????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("ruad-yuan-khoat-ter-niah-art-juay- khyom-barn-tay","","Kereta saya rosak. Bolehkah anda tolong saya?","My car has broken down, can you help me?","�????????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Kereta saya rosak. Bolehkah anda tolong saya?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("khyom-phda-sai","","Saya deman","I�ve got a temperature.","�????????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya deman", "I�ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("khyom-cheu-kbal","","Saya sakit kepala","I've been having headaches.","????????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit kepala", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("khyom-cheu-puah (doat-jia-meun-sruan-puah-sauh)","","Saya sakit perut (tidak sihat)","I've been having stomachache.","�??????????(???????????????????)",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (tidak sihat)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("khyom-cheu- puah  (joen-bon-toop-tuek)","","Saya sakit perut (hendak ke tandas)","I would like to go to the toilet.","�??????????(????????????)",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (hendak ke tandas)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("�khyom -treuw-ga-bon-joen-phlerng","","Saya mahu mengecaj bateri ","I need to charge up my phone.","�????????????????????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu mengecaj bateri ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("�khyom-treuw-ga-how-groam-hoon-thia-nia-rub-roang","","Saya mahu panggil insuren","I would like to call an insurance.","�???????????????????????????????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu panggil insuren", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("�soam-juay-nuam-khyom -teuw-muan-tee-paed-bon-tert","","Tolong hantarkan saya ke hospital","Could you take me to the hospital?","?????????????????????????????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong hantarkan saya ke hospital", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("khyom -barn-juab-ou-pud-wah-hed-soam- juay- khyom -phong","","Saya mengalami kemalangan Tolonglah saya","I�ve been having an accident, could you help me?","?????????????????????? ?????????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mengalami kemalangan Tolonglah saya", "I�ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToIndonesia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("to-long-sar-yar-bar-ru-sar-jar-dee- ram-pok","","Tolong , saya telah disamun","Help me! I�ve been robbed.","Tolong, Saya baru saja  dirampok.",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Tolong , saya telah disamun", "Help me! I�ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("to-long-sar-yar-bar-ru-sar-jar-dee-pu-gu-lee","","Tolong , saya telah dicederakan orang","Help me! I've been attacked.","Tolong, Saya baru saja dipukuli.",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong , saya telah dicederakan orang", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("sar-yar-o-rang-tai ar-par-ar-dar-yang-bee-sar-bee-jar-rar-bar-har-sar-tai","","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?","I am Thai. Does anyone speak Thai?","Saya orang Thai. Apa ada yang bisa bicara bahasa Thai?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("mo-bil-sar-yar-ru-sak-ar-par-an-dar-bee-sar-ban-tu-sar-yar","","Kereta saya rosak. Bolehkah anda tolong saya?","My car has broken down, can you help me?","Mobil saya rusak. Apa anda bisa bantu saya?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Kereta saya rosak. Bolehkah anda tolong saya?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("sar-yar-meun-der-ree-tar-deu-mam","","Saya deman","I�ve got a temperature.","Saya menderita demam",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya deman", "I�ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("sar-yar-sar-git-geu-par-lar","","Saya sakit kepala","I've been having headaches.","Saya sakit kepala",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit kepala", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("sar-yar-sar-git-peu-root","","Saya sakit perut (tidak sihat)","I've been having stomachache.","Saya sakit perut",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (tidak sihat)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("sar-yar- mu-las","","Saya sakit perut (hendak ke tandas)","I would like to go to the toilet.","Saya mulas",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (hendak ke tandas)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("sar-yar-ee-ngin-char-ger -tey -ley-pon-sar-yar","","Saya mahu mengecaj bateri ","I need to charge up my phone.","Saya ingin charger telepon saya",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu mengecaj bateri ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("sar-yar-ee-ngin-pang-keel-ar-gen-ar-soo-ran-see","","Saya mahu panggil insuren","I would like to call an insurance.","Saya ingin panggil agen asuransi",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu panggil insuren", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("to-long-an-tar-sar-yar-per-kee-ger-ru-mah-sar-git","","Tolong hantarkan saya ke hospital","Could you take me to the hospital?","Tolong antar saya pergi ke rumah sakit.",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong hantarkan saya ke hospital", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("sar-yar-bar-ru-sar-jar-mer-nga-lar-mee-ger-jeu-lar-kar-an-lar-lu-lin-tas, tor-long-ban-tu-sar-yar","","Saya mengalami kemalangan Tolonglah saya","I�ve been having an accident, could you help me?","Saya baru saja mengalami  kecelakaan lalu lintas, Tolong bantu saya. ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mengalami kemalangan Tolonglah saya", "I�ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToLaos(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("soi-dae-khoy-teuk-poon","","Tolong , saya telah disamun","Help me! I�ve been robbed.","�??????????????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Tolong , saya telah disamun", "Help me! I�ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("soi-dae-khoy-teuk-tum-hai","","Tolong , saya telah dicederakan orang","Help me! I've been attacked.","�????????????????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong , saya telah dicederakan orang", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("khoy-pen-khon-thai-mee-phai-wao-pha-sa- thai-dai-dae","","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?","I am Thai. Does anyone speak Thai?","�????????????? ?????????????????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("load-phe-jao-soi-dai-bor","","Kereta saya rosak. Bolehkah anda tolong saya?","My car has broken down, can you help me?","�???????????????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Kereta saya rosak. Bolehkah anda tolong saya?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("khoy-pen-khai","","Saya deman","I�ve got a temperature.","�???????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya deman", "I�ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("khoy-jeb-hua","","Saya sakit kepala","I've been having headaches.","�???????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit kepala", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("khoy-jeb-thong (bor-sa-bai)","","Saya sakit perut (tidak sihat)","I've been having stomachache.","�???????????? (????????)",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (tidak sihat)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("khoy-jeb-thong (hong-num)","","Saya sakit perut (hendak ke tandas)","I would like to go to the toilet.","�???????????? (???????)",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (hendak ke tandas)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("khoy-tong-garn-sark-fai","","Saya mahu mengecaj bateri ","I need to charge up my phone.","�????????????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu mengecaj bateri ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("khoy-tong-garn-earn-pa-gun","","Saya mahu panggil insuren","I would like to call an insurance.","�?????????????????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu panggil insuren", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("soi-pha-khoy-pai-hong-mor-dae","","Tolong hantarkan saya ke hospital","Could you take me to the hospital?","�????????????????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong hantarkan saya ke hospital", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("khoy-dai-hub-u-bud-ti-hed-soi-khoy-dae","","Saya mengalami kemalangan Tolonglah saya","I�ve been having an accident, could you help me?","�???????????????????????????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mengalami kemalangan Tolonglah saya", "I�ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToMalaysia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("to-long-sa-ya-ter-la-dee-sa-moon","","Tolong , saya telah disamun","Help me! I�ve been robbed.","Tolong , saya telah disamun",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Tolong , saya telah disamun", "Help me! I�ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("to-long-sa-ya-ter-la-dee-jer-der-ra-gun-o-rung","","Tolong , saya telah dicederakan orang","Help me! I've been attacked.","Tolong , saya telah dicederakan orang",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong , saya telah dicederakan orang", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("sa-ya-o-rung-thai-ar-dar-o-rung-yung-bo-leh-bern-ba-ha-sa-thai-gah","","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?","I am Thai. Does anyone speak Thai?","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("ger-ray-ta-sa-ya-ro-suk-bo-leh-gah- an-da-to-long-sa-ya","","Kereta saya rosak. Bolehkah anda tolong saya?","My car has broken down, can you help me?","Kereta saya rosak. Bolehkah anda tolong saya?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Kereta saya rosak. Bolehkah anda tolong saya?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("sa-ya-der-mun","","Saya deman","I�ve got a temperature.","Saya deman",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya deman", "I�ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("sa-ya-sa-git-ger-pa-la","","Saya sakit kepala","I've been having headaches.","Saya sakit kepala",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit kepala", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("sa-ya-sa-git-per-rut  (tee-duk-see-hut)","","Saya sakit perut (tidak sihat)","I've been having stomachache.","Saya sakit perut (tidak sihat)",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (tidak sihat)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("sa-ya-sa-git-per-rut (hurn-duk-ger-tun-dus)","","Saya sakit perut (hendak ke tandas)","I would like to go to the toilet.","Saya sakit perut (hendak ke tandas)",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (hendak ke tandas)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("sa-ya-ma-hoo-mer-nger-jard-ba-ter-ree","","Saya mahu mengecaj bateri ","I need to charge up my phone.","Saya mahu mengecaj bateri ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu mengecaj bateri ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("sa-ya-ma-hoo-pung-kil-in-soo-run","","Saya mahu panggil insuren","I would like to call an insurance.","Saya mahu panggil insuren",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu panggil insuren", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("to-long-hun-tal-gun-sa-ya-ger-hos-pi-tal","","Tolong hantarkan saya ke hospital","Could you take me to the hospital?","Tolong hantarkan saya ke hospital",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong hantarkan saya ke hospital", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("sa-ya-mer-nga-la-mee-ger-ma-la-ngun- to-long-lah-sa-ya","","Saya mengalami kemalangan Tolonglah saya","I�ve been having an accident, could you help me?","Saya mengalami kemalangan Tolonglah saya",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mengalami kemalangan Tolonglah saya", "I�ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToMyanmar(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("kae-ba-ong/ja-nor/ja-ma a-nuh-jan-see-kan-ya-dae","","Tolong , saya telah disamun","Help me! I�ve been robbed.","?????????? ???????????????? ???????????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Tolong , saya telah disamun", "Help me! I�ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("kae ba ong/ ja-nor/ja-ma laeh-yaw mu- joo-loon -kan-ya-dae","","Tolong , saya telah dicederakan orang","Help me! I've been attacked.","?????????? ???????????????? ???????? ?????????????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong , saya telah dicederakan orang", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("mu- joo-loon -kan-ya-dae  bae-too- thai-sa-ka-pyor-tat- ta-lae","","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?","I am Thai. Does anyone speak Thai?","???????????????? ????????????????????? ??????????????????????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("ka-piah-loh-kha-mia/sheen ku-nyi- pe-loh-ya-ta-la","","Kereta saya rosak. Bolehkah anda tolong saya?","My car has broken down, can you help me?","??????????? ???????????? ?????????????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Kereta saya rosak. Bolehkah anda tolong saya?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("ja-nor/ja-ma-phia-ne-dae","","Saya deman","I�ve got a temperature.","???????????????? ??????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya deman", "I�ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("ja-nor/ja-ma-gaw-kai-dae","","Saya sakit kepala","I've been having headaches.","???????????????? ???????????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit kepala", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("ja-nor/ja-ma-pai-na-dae(ne-ma-gaw-boo)","","Saya sakit perut (tidak sihat)","I've been having stomachache.","???????????????? ??????????? (????????????)",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (tidak sihat)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("ja-nor/ja-ma pai-na-dae  (eng-ta-twa-jin-dae/a-le- twa-jin-dae)","","Saya sakit perut (hendak ke tandas)","I would like to go to the toilet.","????????????????  ??????????? (?????????????????)",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (hendak ke tandas)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("ja-nor/ja-ma-mee-ar-twin- jin-dae","","Saya mahu mengecaj bateri ","I need to charge up my phone.","???????????????? ???????????????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu mengecaj bateri ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("ja-nor/ja-ma ah-makan-khor-jin- dae","","Saya mahu panggil insuren","I would like to call an insurance.","???????????????? ?????????????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu panggil insuren", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("ja-nor/ja-ma-koe-se-yong- lai-poh- pe-ba","","Tolong hantarkan saya ke hospital","Could you take me to the hospital?","???????????????? ??? ?????????????? ???????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong hantarkan saya ke hospital", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("ja-nor-ma-tor-ta-sa-phit- loh-koo- nyi-pe-ba","","Saya mengalami kemalangan Tolonglah saya","I�ve been having an accident, could you help me?","??????????????????????????????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mengalami kemalangan Tolonglah saya", "I�ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToPhilippines(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("tu-lu-ngan-nin-yo-ar-go-nar-nar-gar-wan-ar-go","","Tolong , saya telah disamun","Help me! I�ve been robbed.","Tulungan ninyo ako! Nanakawan ako! ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Tolong , saya telah disamun", "Help me! I�ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("tu-lu-ngan-nin-yo-ar-go-nar-sak-tan-ar-go","","Tolong , saya telah dicederakan orang","Help me! I've been attacked.","Tulungan ninyo ako! Nasaktan ako!",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong , saya telah dicederakan orang", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("ar-go-ai-thai-mey-ron-bar-di-tong-mar-ru-nong-mak-thai","","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?","I am Thai. Does anyone speak Thai?","Ako ay Thai. Meron ba ditong marunong mag- thai?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("nar-si-rar-an-ang-got-sey-go-pu-wey-dey-ni-yo-bar-ar-gong-tu-lu-ngan","","Kereta saya rosak. Bolehkah anda tolong saya?","My car has broken down, can you help me?","Nasiraan ang kotse ko. Puwede niyo ba akong tulungan?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Kereta saya rosak. Bolehkah anda tolong saya?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("mai-sar-git-ar-go","","Saya deman","I�ve got a temperature.","May sakit ako.",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya deman", "I�ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("mai-sar-git-u-lo-ar-go","","Saya sakit kepala","I've been having headaches.","May sakit ulo ako.",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit kepala", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("mar-sar-git-ang-ti-yan-go","","Saya sakit perut (tidak sihat)","I've been having stomachache.","Masakit ang tiyan ko.",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (tidak sihat)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("mar-sar-git-ang-ti-yan-go-kai-lar-ngan-gong-gar-mi-tin-ang-ban-yo","","Saya sakit perut (hendak ke tandas)","I would like to go to the toilet.","Masakit ang tiyan ko. Kailangan kong gamitin ang banyo.",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (hendak ke tandas)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("kai-lar-ngan-gong-i-rey-charch-ang-bat-tar-ri-yar","","Saya mahu mengecaj bateri ","I need to charge up my phone.","Kailangan kong i re-charge ang batteriya.",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu mengecaj bateri ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("kai-lar-ngan-gong-tar-war-gan-ang-ar-hen-tey-go-sar-in-chu-rans","","Saya mahu panggil insuren","I would like to call an insurance.","Kailangan kong tawagan ang ahente ko sa insurance.",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu panggil insuren", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("par-gi-dar-lar-nin-yo-ar-go-sar-os-pi-tal","","Tolong hantarkan saya ke hospital","Could you take me to the hospital?","Paki dala ninyo ako sa ospital.",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong hantarkan saya ke hospital", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("nar-ak-si-en-tey-ar-go-tu-lu-ngan-ni-yo-po-ar-go","","Saya mengalami kemalangan Tolonglah saya","I�ve been having an accident, could you help me?","Na-aksidente ako. Tulungan niyo po ako.",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mengalami kemalangan Tolonglah saya", "I�ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToSingapore(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("Help me! I�ve been robbed.","","Tolong , saya telah disamun","","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Tolong , saya telah disamun", "", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("Help me! I've been attacked.","","Tolong , saya telah dicederakan orang","","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong , saya telah dicederakan orang", "", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("I am Thai. Does anyone speak Thai?","","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?","","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?", "", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("My car has broken down, can you help me?","","Kereta saya rosak. Bolehkah anda tolong saya?","","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Kereta saya rosak. Bolehkah anda tolong saya?", "", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("I�ve got a temperature.","","Saya deman","","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya deman", "", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("I've been having headaches.","","Saya sakit kepala","","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit kepala", "", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("I've been having stomachache.","","Saya sakit perut (tidak sihat)","","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (tidak sihat)", "", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("I would like to go to the toilet.","","Saya sakit perut (hendak ke tandas)","","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (hendak ke tandas)", "", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("I need to charge up my phone.","","Saya mahu mengecaj bateri ","","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu mengecaj bateri ", "", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("I would like to call an insurance.","","Saya mahu panggil insuren","","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu panggil insuren", "", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("Could you take me to the hospital?","","Tolong hantarkan saya ke hospital","","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong hantarkan saya ke hospital", "", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("I�ve been having an accident, could you help me?","","Saya mengalami kemalangan Tolonglah saya","","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mengalami kemalangan Tolonglah saya", "", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToVietnam(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("kew-toay, toay-bi-kueap-yerd","","Tolong , saya telah disamun","Help me! I�ve been robbed.","c??u t?i, t?i bi? c???p gi??t",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Tolong , saya telah disamun", "Help me! I�ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("kew-toay, toay-bi-hun-hung","","Tolong , saya telah dicederakan orang","Help me! I've been attacked.","c??u t?i, t?i bi? ha?nh hung",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong , saya telah dicederakan orang", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("toay-laa-ngeu-thai, kor-eye-biat-noi-teung-thai-khong","","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?","I am Thai. Does anyone speak Thai?","t?i la? ng???i Tha?i, co? ai bi??t no?i ti??ng Tha?i kh?ng?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("sae-bi-hong, ban-yoop-hoe-deuak- khong","","Kereta saya rosak. Bolehkah anda tolong saya?","My car has broken down, can you help me?","xe bi? ho?ng, ba?n giu?p h?? ????c kh?ng?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Kereta saya rosak. Bolehkah anda tolong saya?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("toay-bi-karm","","Saya deman","I�ve got a temperature.","t?i bi? ca?m",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya deman", "I�ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("toay-bi-yuek-deaw","","Saya sakit kepala","I've been having headaches.","t?i bi? nh??c ???u",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit kepala", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("toay-bi-deaw-bung","","Saya sakit perut (tidak sihat)","I've been having stomachache.","t?i bi? ?au bu?ng",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (tidak sihat)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("toay-muan-dee-koeu","","Saya sakit perut (hendak ke tandas)","I would like to go to the toilet.","t?i mu??n ?i c??u",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (hendak ke tandas)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("toay-muan-koeu-dien","","Saya mahu mengecaj bateri ","I need to charge up my phone.","t?i mu??n c?u ?i??n",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu mengecaj bateri ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("toay-muan-koi-bow-hiem","","Saya mahu panggil insuren","I would like to call an insurance.","t?i mu??n go?i ba?o hi??m",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu panggil insuren", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("larm-earn-deau-toi-dee-beng-wien","","Tolong hantarkan saya ke hospital","Could you take me to the hospital?","la?m ?n ??a t?i ?i b??nh vi??n",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong hantarkan saya ke hospital", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("toay-bi-tai-nun, larm-earn-yup-toi-wuai","","Saya mengalami kemalangan Tolonglah saya","I�ve been having an accident, could you help me?","t?i bi? tai na?n, la?m ?n giu?p t?i v??i",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mengalami kemalangan Tolonglah saya", "I�ve been having an accident, could you help me?", childList);
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
