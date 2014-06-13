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
        Child child = new Child("jiw-ming-ar-wor-puai-chiang-jia-ler","","Tolong , saya telah disamun","Help me! I’ve been robbed."," 救命啊，我被抢劫了",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Tolong , saya telah disamun", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jiw-ming-ar-wor-puai-saing-hai-ler","","Tolong , saya telah dicederakan orang","Help me! I've been attacked."," 救命啊，我被伤害了",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong , saya telah dicederakan orang", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-seu-thai-gua-yern-sui-hui-sua-thai-awee","","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?","I am Thai. Does anyone speak Thai?"," 我是泰国人，谁会说泰语",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("cher-hwai-ler-nee-nerng-pung-wor-ma","","Kereta saya rosak. Bolehkah anda tolong saya?","My car has broken down, can you help me?"," 车坏了，你能帮我吗",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Kereta saya rosak. Bolehkah anda tolong saya?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-fa-sao-ler","","Saya deman","I’ve got a temperature."," 我发烧了",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya deman", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-thow-therng","","Saya sakit kepala","I've been having headaches."," 我头疼",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit kepala", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-too-jeu-therng (poo-soo-foo)","","Saya sakit perut (tidak sihat)","I've been having stomachache."," 我肚子疼 （不舒服）",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (tidak sihat)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-too-jeu-therng (see-sow-jian)","","Saya sakit perut (hendak ke tandas)","I would like to go to the toilet."," 我肚子疼（洗手间）",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (hendak ke tandas)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-chong-tian","","Saya mahu mengecaj bateri ","I need to charge up my phone."," 我要充电",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu mengecaj bateri ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-jaw-paw-sian-gong-seu","","Saya mahu panggil insuren","I would like to call an insurance."," 我要找保险公司",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu panggil insuren", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ching-song-wor-chwee-ee-awian","","Tolong hantarkan saya ke hospital","Could you take me to the hospital?"," 请送我去医院",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong hantarkan saya ke hospital", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-choo-seu-goo-ler-ching-pung-wor","","Saya mengalami kemalangan Tolonglah saya","I’ve been having an accident, could you help me?"," 我出事故了，请帮我",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mengalami kemalangan Tolonglah saya", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------

    }

    public void loadBruneiToThai(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("chuai-duai-chan-don-plon","","Tolong , saya telah disamun","Help me! I’ve been robbed.","ช่วยด้วย ฉันโดนปล้น",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Tolong , saya telah disamun", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chuai-duai-chan-don-tham-rai","","Tolong , saya telah dicederakan orang","Help me! I've been attacked.","ช่วยด้วย ฉันโดนทำร้าย",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong , saya telah dicederakan orang", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-pen-kon-thai-mee-khrai-phut-pha-sa-thai-dai-bang","","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?","I am Thai. Does anyone speak Thai?","ฉันเป็นคนไทยมีใครพูดภาษาไทยได้บ้าง",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("rot-sia-khun-chuai-dai-mai","","Kereta saya rosak. Bolehkah anda tolong saya?","My car has broken down, can you help me?","รถเสีย คุณช่วยได้ไหม",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Kereta saya rosak. Bolehkah anda tolong saya?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-pen-khai","","Saya deman","I’ve got a temperature.","ฉันเป็นไข้",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya deman", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-puad-hua","","Saya sakit kepala","I've been having headaches.","ฉันปวดหัว",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit kepala", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-puad-thong(mai sa-bai)","","Saya sakit perut (tidak sihat)","I've been having stomachache.","ฉันปวดท้อง(ไม่สบาย)",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (tidak sihat)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-puad-thong(hong-nam)","","Saya sakit perut (hendak ke tandas)","I would like to go to the toilet.","ฉันปวดท้อง(ห้องน้ำ)",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (hendak ke tandas)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-charge-fai","","Saya mahu mengecaj bateri ","I need to charge up my phone.","ฉันต้องการชาร์ตไฟ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu mengecaj bateri ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-riak-pra-kan","","Saya mahu panggil insuren","I would like to call an insurance.","ฉันต้องการเรียกประกัน",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu panggil insuren", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chuai-pha-chan-pai-rong-pha-ya-ban-tee","","Tolong hantarkan saya ke hospital","Could you take me to the hospital?","ช่วยพาฉันไปโรงพยาบาลที",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong hantarkan saya ke hospital", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pom-dai-rap-ubat-ti-het","","Saya mengalami kemalangan Tolonglah saya","I’ve been having an accident, could you help me?","ผมได้รับอุบัติเหตุ ช่วยผมด้วย",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mengalami kemalangan Tolonglah saya", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToBrunei(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("to-long-sa-ya-ter-la-dee-sa-moon","","Tolong , saya telah disamun","Help me! I’ve been robbed.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Tolong , saya telah disamun", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-sa-ya-ter-la-dee-jer-der-ra-gun-o-rung","","Tolong , saya telah dicederakan orang","Help me! I've been attacked.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong , saya telah dicederakan orang", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-o-rung-thai-ar-dar-o-rung-yung-bo-leh-bern-ba-ha-sa-thai-gah","","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?","I am Thai. Does anyone speak Thai?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-ray-ta-sa-ya-ro-suk-bo-leh-gah- an-da-to-long-sa-ya","","Kereta saya rosak. Bolehkah anda tolong saya?","My car has broken down, can you help me?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Kereta saya rosak. Bolehkah anda tolong saya?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-der-mun","","Saya deman","I’ve got a temperature.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya deman", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-ger-pa-la","","Saya sakit kepala","I've been having headaches.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit kepala", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-per-rut  (tee-duk-see-hut)","","Saya sakit perut (tidak sihat)","I've been having stomachache.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (tidak sihat)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-per-rut (hurn-duk-ger-tun-dus)","","Saya sakit perut (hendak ke tandas)","I would like to go to the toilet.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (hendak ke tandas)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-ma-hoo-mer-nger-jard-ba-ter-ree","","Saya mahu mengecaj bateri ","I need to charge up my phone.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu mengecaj bateri ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-ma-hoo-pung-kil-in-soo-run","","Saya mahu panggil insuren","I would like to call an insurance.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu panggil insuren", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-hun-tal-gun-sa-ya-ger-hos-pi-tal","","Tolong hantarkan saya ke hospital","Could you take me to the hospital?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong hantarkan saya ke hospital", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-mer-nga-la-mee-ger-ma-la-ngun- to-long-lah-sa-ya","","Saya mengalami kemalangan Tolonglah saya","I’ve been having an accident, could you help me?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mengalami kemalangan Tolonglah saya", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToCambodia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("juay-phong-khyom-treuw-joe-plon","","Tolong , saya telah disamun","Help me! I’ve been robbed."," ជួយផង ខ្ញុំត្រូវគេធ្វើបាប",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Tolong , saya telah disamun", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("juay -phong-khyom- treuw -gay-thwer-barb","","Tolong , saya telah dicederakan orang","Help me! I've been attacked."," ខ្ញុំជាជនជាតិថៃ តើមានអ្នកណាអាច និយាយភាសាថៃបានខ្លះទេ?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong , saya telah dicederakan orang", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-jia-juan-jiad-thai-ter-mian- niah-na-art-ni-yiay-phia-sa-thai-barn-khlah-tay","","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?","I am Thai. Does anyone speak Thai?"," រថយន្តខូច តើអ្នកអាចជួយខ្ញុំបានទេ?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ruad-yuan-khoat-ter-niah-art-juay- khyom-barn-tay","","Kereta saya rosak. Bolehkah anda tolong saya?","My car has broken down, can you help me?"," ខ្ញុំផ្តាសាយ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Kereta saya rosak. Bolehkah anda tolong saya?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-phda-sai","","Saya deman","I’ve got a temperature."," ខ្ញុំផ្តាសាយ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya deman", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-cheu-kbal","","Saya sakit kepala","I've been having headaches.","ខ្ញុំឈឺក្បាល",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit kepala", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-cheu-puah (doat-jia-meun-sruan-puah-sauh)","","Saya sakit perut (tidak sihat)","I've been having stomachache."," ខ្ញុំឈឺពោះ(ដូចជាមិនស្រួលពោះសោះ)",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (tidak sihat)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-cheu- puah  (joen-bon-toop-tuek)","","Saya sakit perut (hendak ke tandas)","I would like to go to the toilet."," ខ្ញុំឈឺពោះ(ចូលបន្ទប់ទឹក)",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (hendak ke tandas)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" khyom -treuw-ga-bon-joen-phlerng","","Saya mahu mengecaj bateri ","I need to charge up my phone."," ខ្ញុំត្រូវការបញ្ចូលភ្លើង",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu mengecaj bateri ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" khyom-treuw-ga-how-groam-hoon-thia-nia-rub-roang","","Saya mahu panggil insuren","I would like to call an insurance."," ខ្ញុំត្រូវការហៅក្រុមហ៊ុនធានារ៉ាប់រង",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu panggil insuren", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" soam-juay-nuam-khyom -teuw-muan-tee-paed-bon-tert","","Tolong hantarkan saya ke hospital","Could you take me to the hospital?","សួមជួយនាំខ្ញុំទៅមន្ទីរពេទ្យបន្តិច",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong hantarkan saya ke hospital", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom -barn-juab-ou-pud-wah-hed-soam- juay- khyom -phong","","Saya mengalami kemalangan Tolonglah saya","I’ve been having an accident, could you help me?","ខ្ញុំបានជួបឧបទ្ទវហេតុ​ សូមជួយខ្ញុំផង",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mengalami kemalangan Tolonglah saya", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToIndonesia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("to-long-sar-yar-bar-ru-sar-jar-dee- ram-pok","","Tolong , saya telah disamun","Help me! I’ve been robbed.","Tolong, Saya baru saja  dirampok.",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Tolong , saya telah disamun", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-sar-yar-bar-ru-sar-jar-dee-pu-gu-lee","","Tolong , saya telah dicederakan orang","Help me! I've been attacked.","Tolong, Saya baru saja dipukuli.",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong , saya telah dicederakan orang", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-o-rang-tai ar-par-ar-dar-yang-bee-sar-bee-jar-rar-bar-har-sar-tai","","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?","I am Thai. Does anyone speak Thai?","Saya orang Thai. Apa ada yang bisa bicara bahasa Thai?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mo-bil-sar-yar-ru-sak-ar-par-an-dar-bee-sar-ban-tu-sar-yar","","Kereta saya rosak. Bolehkah anda tolong saya?","My car has broken down, can you help me?","Mobil saya rusak. Apa anda bisa bantu saya?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Kereta saya rosak. Bolehkah anda tolong saya?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-meun-der-ree-tar-deu-mam","","Saya deman","I’ve got a temperature.","Saya menderita demam",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya deman", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-sar-git-geu-par-lar","","Saya sakit kepala","I've been having headaches.","Saya sakit kepala",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit kepala", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-sar-git-peu-root","","Saya sakit perut (tidak sihat)","I've been having stomachache.","Saya sakit perut",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (tidak sihat)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar- mu-las","","Saya sakit perut (hendak ke tandas)","I would like to go to the toilet.","Saya mulas",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (hendak ke tandas)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-char-ger -tey -ley-pon-sar-yar","","Saya mahu mengecaj bateri ","I need to charge up my phone.","Saya ingin charger telepon saya",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu mengecaj bateri ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-pang-keel-ar-gen-ar-soo-ran-see","","Saya mahu panggil insuren","I would like to call an insurance.","Saya ingin panggil agen asuransi",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu panggil insuren", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-an-tar-sar-yar-per-kee-ger-ru-mah-sar-git","","Tolong hantarkan saya ke hospital","Could you take me to the hospital?","Tolong antar saya pergi ke rumah sakit.",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong hantarkan saya ke hospital", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-bar-ru-sar-jar-mer-nga-lar-mee-ger-jeu-lar-kar-an-lar-lu-lin-tas, tor-long-ban-tu-sar-yar","","Saya mengalami kemalangan Tolonglah saya","I’ve been having an accident, could you help me?","Saya baru saja mengalami  kecelakaan lalu lintas, Tolong bantu saya. ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mengalami kemalangan Tolonglah saya", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToLaos(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("soi-dae-khoy-teuk-poon","","Tolong , saya telah disamun","Help me! I’ve been robbed."," ຊ່ອຍແດ່ຂ້ອຍຖືກປຸ້ນ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Tolong , saya telah disamun", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soi-dae-khoy-teuk-tum-hai","","Tolong , saya telah dicederakan orang","Help me! I've been attacked."," ຊ່ອຍແດ່ຂ້ອຍຖືກທຳຮ້າຍ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong , saya telah dicederakan orang", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-pen-khon-thai-mee-phai-wao-pha-sa- thai-dai-dae","","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?","I am Thai. Does anyone speak Thai?"," ຂ້ອຍເປັນຄົນໄທ ມີໃຜເວົ້າພາສາໄທໄດ້ແດ່",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("load-phe-jao-soi-dai-bor","","Kereta saya rosak. Bolehkah anda tolong saya?","My car has broken down, can you help me?"," ລົດເພເຈົ້າຊ່ອຍໄດ້ບໍ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Kereta saya rosak. Bolehkah anda tolong saya?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-pen-khai","","Saya deman","I’ve got a temperature."," ຂ້ອຍເປັນໄຂ້",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya deman", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-jeb-hua","","Saya sakit kepala","I've been having headaches."," ຂ້ອຍເຈັບຫົວ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit kepala", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-jeb-thong (bor-sa-bai)","","Saya sakit perut (tidak sihat)","I've been having stomachache."," ຂ້ອຍເຈັບທ້ອງ (ບໍ່ສະບາຍ)",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (tidak sihat)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-jeb-thong (hong-num)","","Saya sakit perut (hendak ke tandas)","I would like to go to the toilet."," ຂ້ອຍເຈັບທ້ອງ (ຫ້ອງນ້ຳ)",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (hendak ke tandas)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-sark-fai","","Saya mahu mengecaj bateri ","I need to charge up my phone."," ຂ້ອຍຕ້ອງການສາກໄຟ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu mengecaj bateri ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-earn-pa-gun","","Saya mahu panggil insuren","I would like to call an insurance."," ຂ້ອຍຕ້ອງການເອິ້ນປະກັນ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu panggil insuren", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soi-pha-khoy-pai-hong-mor-dae","","Tolong hantarkan saya ke hospital","Could you take me to the hospital?"," ຊ່ອຍພາຂ້ອຍໄປໂຮງໝໍແດ່",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong hantarkan saya ke hospital", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-dai-hub-u-bud-ti-hed-soi-khoy-dae","","Saya mengalami kemalangan Tolonglah saya","I’ve been having an accident, could you help me?"," ຂ້ອຍໄດ້ຮັບອຸບັດຕິເຫດຊ່ອຍຂ້ອຍແດ່",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mengalami kemalangan Tolonglah saya", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToMalaysia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("to-long-sa-ya-ter-la-dee-sa-moon","","Tolong , saya telah disamun","Help me! I’ve been robbed.","Tolong , saya telah disamun",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Tolong , saya telah disamun", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-sa-ya-ter-la-dee-jer-der-ra-gun-o-rung","","Tolong , saya telah dicederakan orang","Help me! I've been attacked.","Tolong , saya telah dicederakan orang",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong , saya telah dicederakan orang", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-o-rung-thai-ar-dar-o-rung-yung-bo-leh-bern-ba-ha-sa-thai-gah","","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?","I am Thai. Does anyone speak Thai?","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-ray-ta-sa-ya-ro-suk-bo-leh-gah- an-da-to-long-sa-ya","","Kereta saya rosak. Bolehkah anda tolong saya?","My car has broken down, can you help me?","Kereta saya rosak. Bolehkah anda tolong saya?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Kereta saya rosak. Bolehkah anda tolong saya?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-der-mun","","Saya deman","I’ve got a temperature.","Saya deman",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya deman", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-ger-pa-la","","Saya sakit kepala","I've been having headaches.","Saya sakit kepala",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit kepala", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-per-rut  (tee-duk-see-hut)","","Saya sakit perut (tidak sihat)","I've been having stomachache.","Saya sakit perut (tidak sihat)",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (tidak sihat)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-per-rut (hurn-duk-ger-tun-dus)","","Saya sakit perut (hendak ke tandas)","I would like to go to the toilet.","Saya sakit perut (hendak ke tandas)",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (hendak ke tandas)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-ma-hoo-mer-nger-jard-ba-ter-ree","","Saya mahu mengecaj bateri ","I need to charge up my phone.","Saya mahu mengecaj bateri ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu mengecaj bateri ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-ma-hoo-pung-kil-in-soo-run","","Saya mahu panggil insuren","I would like to call an insurance.","Saya mahu panggil insuren",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu panggil insuren", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-hun-tal-gun-sa-ya-ger-hos-pi-tal","","Tolong hantarkan saya ke hospital","Could you take me to the hospital?","Tolong hantarkan saya ke hospital",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong hantarkan saya ke hospital", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-mer-nga-la-mee-ger-ma-la-ngun- to-long-lah-sa-ya","","Saya mengalami kemalangan Tolonglah saya","I’ve been having an accident, could you help me?","Saya mengalami kemalangan Tolonglah saya",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mengalami kemalangan Tolonglah saya", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToMyanmar(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("kae-ba-ong/ja-nor/ja-ma a-nuh-jan-see-kan-ya-dae","","Tolong , saya telah disamun","Help me! I’ve been robbed.","ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ အႏုၾကမ္းခံရတယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Tolong , saya telah disamun", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kae ba ong/ ja-nor/ja-ma laeh-yaw mu- joo-loon -kan-ya-dae","","Tolong , saya telah dicederakan orang","Help me! I've been attacked.","ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ လက္ေရာက္ မႈက်ဴးလြန္ခံရတယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong , saya telah dicederakan orang", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mu- joo-loon -kan-ya-dae  bae-too- thai-sa-ka-pyor-tat- ta-lae","","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?","I am Thai. Does anyone speak Thai?","ကြ်န္ေတာ္⁄ကြ်န္မ ထိုင္းလူမ်ိဴးျဖစ္တယ္။ ဘယ္သူထိုင္းစကားေျပာတတ္သလဲ။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ka-piah-loh-kha-mia/sheen ku-nyi- pe-loh-ya-ta-la","","Kereta saya rosak. Bolehkah anda tolong saya?","My car has broken down, can you help me?","ကားပ်က္လို႔ ခင္ဗ်ား∕ရွင္ ကူညီေပးလို႔ရသလား။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Kereta saya rosak. Bolehkah anda tolong saya?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-phia-ne-dae","","Saya deman","I’ve got a temperature.","ကြ်န္ေတာ္⁄ကြ်န္မ ဖ်ားေနတယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya deman", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-gaw-kai-dae","","Saya sakit kepala","I've been having headaches.","ကြ်န္ေတာ္⁄ကြ်န္မ ေခါင္းကိုက္တယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit kepala", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-pai-na-dae(ne-ma-gaw-boo)","","Saya sakit perut (tidak sihat)","I've been having stomachache.","ကြ်န္ေတာ္⁄ကြ်န္မ ဗိုက္နာတယ္။ (ေနမေကာင္းဘူး)",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (tidak sihat)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma pai-na-dae  (eng-ta-twa-jin-dae/a-le- twa-jin-dae)","","Saya sakit perut (hendak ke tandas)","I would like to go to the toilet.","ကြ်န္ေတာ္⁄ကြ်န္မ  ဗိုက္နာတယ္။ (အိမ္သာသြားခ်င္တယ္)",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (hendak ke tandas)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-mee-ar-twin- jin-dae","","Saya mahu mengecaj bateri ","I need to charge up my phone.","ကြ်န္ေတာ္⁄ကြ်န္မ မီးအားတြင္းခ်င္တယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu mengecaj bateri ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma ah-makan-khor-jin- dae","","Saya mahu panggil insuren","I would like to call an insurance.","ကြ်န္ေတာ္⁄ကြ်န္မ အားမခံေခၚခ်င္တယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu panggil insuren", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-koe-se-yong- lai-poh- pe-ba","","Tolong hantarkan saya ke hospital","Could you take me to the hospital?","ကြ်န္ေတာ္⁄ကြ်န္မ ကို ေဆး႐ုံလိုက္ပုိ ့ေပးပါ။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong hantarkan saya ke hospital", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor-ma-tor-ta-sa-phit- loh-koo- nyi-pe-ba","","Saya mengalami kemalangan Tolonglah saya","I’ve been having an accident, could you help me?","ကြ်န္ေတာ္မေတာ္တဆျဖစ္လို႔ကူညီေပးပါ။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mengalami kemalangan Tolonglah saya", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToPhilippines(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("tu-lu-ngan-nin-yo-ar-go-nar-nar-gar-wan-ar-go","","Tolong , saya telah disamun","Help me! I’ve been robbed.","Tulungan ninyo ako! Nanakawan ako! ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Tolong , saya telah disamun", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tu-lu-ngan-nin-yo-ar-go-nar-sak-tan-ar-go","","Tolong , saya telah dicederakan orang","Help me! I've been attacked.","Tulungan ninyo ako! Nasaktan ako!",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong , saya telah dicederakan orang", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ar-go-ai-thai-mey-ron-bar-di-tong-mar-ru-nong-mak-thai","","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?","I am Thai. Does anyone speak Thai?","Ako ay Thai. Meron ba ditong marunong mag- thai?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-si-rar-an-ang-got-sey-go-pu-wey-dey-ni-yo-bar-ar-gong-tu-lu-ngan","","Kereta saya rosak. Bolehkah anda tolong saya?","My car has broken down, can you help me?","Nasiraan ang kotse ko. Puwede niyo ba akong tulungan?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Kereta saya rosak. Bolehkah anda tolong saya?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mai-sar-git-ar-go","","Saya deman","I’ve got a temperature.","May sakit ako.",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya deman", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mai-sar-git-u-lo-ar-go","","Saya sakit kepala","I've been having headaches.","May sakit ulo ako.",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit kepala", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mar-sar-git-ang-ti-yan-go","","Saya sakit perut (tidak sihat)","I've been having stomachache.","Masakit ang tiyan ko.",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (tidak sihat)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mar-sar-git-ang-ti-yan-go-kai-lar-ngan-gong-gar-mi-tin-ang-ban-yo","","Saya sakit perut (hendak ke tandas)","I would like to go to the toilet.","Masakit ang tiyan ko. Kailangan kong gamitin ang banyo.",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (hendak ke tandas)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kai-lar-ngan-gong-i-rey-charch-ang-bat-tar-ri-yar","","Saya mahu mengecaj bateri ","I need to charge up my phone.","Kailangan kong i re-charge ang batteriya.",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu mengecaj bateri ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kai-lar-ngan-gong-tar-war-gan-ang-ar-hen-tey-go-sar-in-chu-rans","","Saya mahu panggil insuren","I would like to call an insurance.","Kailangan kong tawagan ang ahente ko sa insurance.",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu panggil insuren", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("par-gi-dar-lar-nin-yo-ar-go-sar-os-pi-tal","","Tolong hantarkan saya ke hospital","Could you take me to the hospital?","Paki dala ninyo ako sa ospital.",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong hantarkan saya ke hospital", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-ak-si-en-tey-ar-go-tu-lu-ngan-ni-yo-po-ar-go","","Saya mengalami kemalangan Tolonglah saya","I’ve been having an accident, could you help me?","Na-aksidente ako. Tulungan niyo po ako.",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mengalami kemalangan Tolonglah saya", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToSingapore(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("help-mee-ai-haf-been-rob","","Tolong , saya telah disamun","Help me! I’ve been robbed.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Tolong , saya telah disamun", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("help-mee-ai-haf-been-at-tak","","Tolong , saya telah dicederakan orang","Help me! I've been attacked.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong , saya telah dicederakan orang", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-am-thai-das-en-nee-wan-speek-thai","","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?","I am Thai. Does anyone speak Thai?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mai-kar-has-brok-ken-dao-kan-yu-help-mee","","Kereta saya rosak. Bolehkah anda tolong saya?","My car has broken down, can you help me?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Kereta saya rosak. Bolehkah anda tolong saya?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-haf-got-a-tem-per-re-jer","","Saya deman","I’ve got a temperature.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya deman", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-haf-been-haf-fing-hed-eks","","Saya sakit kepala","I've been having headaches.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit kepala", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-haf-been-haf-fing-sto-mak-ek","","Saya sakit perut (tidak sihat)","I've been having stomachache.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (tidak sihat)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-tu-go-tu-der-toi-let","","Saya sakit perut (hendak ke tandas)","I would like to go to the toilet.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (hendak ke tandas)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-need-tu-charch-ap-mai-fon","","Saya mahu mengecaj bateri ","I need to charge up my phone.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu mengecaj bateri ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-tu-col-an-in-chua-rans","","Saya mahu panggil insuren","I would like to call an insurance.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu panggil insuren", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kood-yu-tek-mee-tu-der-hos-pi-tol","","Tolong hantarkan saya ke hospital","Could you take me to the hospital?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong hantarkan saya ke hospital", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-haf-been-haf-fing-an-ak-si-dent- kood-yu-help-mee","","Saya mengalami kemalangan Tolonglah saya","I’ve been having an accident, could you help me?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mengalami kemalangan Tolonglah saya", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToVietnam(){
        ArrayList<Child> childList = new ArrayList<Child>();

        Child child = new Child("kew-toay, toay-bi-kueap-yerd","","Tolong , saya telah disamun","Help me! I’ve been robbed.","cứu tôi, tôi bị cướp giật",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Tolong , saya telah disamun", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kew-toay, toay-bi-hun-hung","","Tolong , saya telah dicederakan orang","Help me! I've been attacked.","cứu tôi, tôi bị hành hung",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong , saya telah dicederakan orang", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-laa-ngeu-thai, kor-eye-biat-noi-teung-thai-khong","","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?","I am Thai. Does anyone speak Thai?","tôi là người Thái, có ai biết nói tiếng Thái không?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sae-bi-hong, ban-yoop-hoe-deuak- khong","","Kereta saya rosak. Bolehkah anda tolong saya?","My car has broken down, can you help me?","xe bị hỏng, bạn giúp hộ được không?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Kereta saya rosak. Bolehkah anda tolong saya?", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-bi-karm","","Saya deman","I’ve got a temperature.","tôi bị cảm",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya deman", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-bi-yuek-deaw","","Saya sakit kepala","I've been having headaches.","tôi bị nhức đầu",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit kepala", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-bi-deaw-bung","","Saya sakit perut (tidak sihat)","I've been having stomachache.","tôi bị đau bụng",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (tidak sihat)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-dee-koeu","","Saya sakit perut (hendak ke tandas)","I would like to go to the toilet.","tôi muốn đi cầu",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya sakit perut (hendak ke tandas)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-koeu-dien","","Saya mahu mengecaj bateri ","I need to charge up my phone.","tôi muốn câu điện",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu mengecaj bateri ", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-koi-bow-hiem","","Saya mahu panggil insuren","I would like to call an insurance.","tôi muốn gọi bảo hiểm",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mahu panggil insuren", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("larm-earn-deau-toi-dee-beng-wien","","Tolong hantarkan saya ke hospital","Could you take me to the hospital?","làm ơn đưa tôi đi bệnh viện",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tolong hantarkan saya ke hospital", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-bi-tai-nun, larm-earn-yup-toi-wuai","","Saya mengalami kemalangan Tolonglah saya","I’ve been having an accident, could you help me?","tôi bị tai nạn, làm ơn giúp tôi với",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya mengalami kemalangan Tolonglah saya", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadCambodiaToChina(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("jiw-ming-ar-wor-puai-chiang-jia-ler",""," ជួយផង ខ្ញុំត្រូវគេធ្វើបាប","Help me! I’ve been robbed."," 救命啊，我被抢劫了",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" ជួយផង ខ្ញុំត្រូវគេធ្វើបាប", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jiw-ming-ar-wor-puai-saing-hai-ler",""," ខ្ញុំជាជនជាតិថៃ តើមានអ្នកណាអាច និយាយភាសាថៃបានខ្លះទេ?","Help me! I've been attacked."," 救命啊，我被伤害了",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំជាជនជាតិថៃ តើមានអ្នកណាអាច និយាយភាសាថៃបានខ្លះទេ?", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-seu-thai-gua-yern-sui-hui-sua-thai-awee",""," រថយន្តខូច តើអ្នកអាចជួយខ្ញុំបានទេ?","I am Thai. Does anyone speak Thai?"," 我是泰国人，谁会说泰语",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" រថយន្តខូច តើអ្នកអាចជួយខ្ញុំបានទេ?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("cher-hwai-ler-nee-nerng-pung-wor-ma",""," ខ្ញុំផ្តាសាយ","My car has broken down, can you help me?"," 车坏了，你能帮我吗",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំផ្តាសាយ", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-fa-sao-ler",""," ខ្ញុំផ្តាសាយ","I’ve got a temperature."," 我发烧了",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំផ្តាសាយ", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-thow-therng","","ខ្ញុំឈឺក្បាល","I've been having headaches."," 我头疼",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ខ្ញុំឈឺក្បាល", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-too-jeu-therng (poo-soo-foo)",""," ខ្ញុំឈឺពោះ(ដូចជាមិនស្រួលពោះសោះ)","I've been having stomachache."," 我肚子疼 （不舒服）",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំឈឺពោះ(ដូចជាមិនស្រួលពោះសោះ)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-too-jeu-therng (see-sow-jian)",""," ខ្ញុំឈឺពោះ(ចូលបន្ទប់ទឹក)","I would like to go to the toilet."," 我肚子疼（洗手间）",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំឈឺពោះ(ចូលបន្ទប់ទឹក)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-chong-tian",""," ខ្ញុំត្រូវការបញ្ចូលភ្លើង","I need to charge up my phone."," 我要充电",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការបញ្ចូលភ្លើង", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-yao-jaw-paw-sian-gong-seu",""," ខ្ញុំត្រូវការហៅក្រុមហ៊ុនធានារ៉ាប់រង","I would like to call an insurance."," 我要找保险公司",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការហៅក្រុមហ៊ុនធានារ៉ាប់រង", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ching-song-wor-chwee-ee-awian","","សួមជួយនាំខ្ញុំទៅមន្ទីរពេទ្យបន្តិច","Could you take me to the hospital?"," 请送我去医院",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("សួមជួយនាំខ្ញុំទៅមន្ទីរពេទ្យបន្តិច", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-choo-seu-goo-ler-ching-pung-wor","","ខ្ញុំបានជួបឧបទ្ទវហេតុ​ សូមជួយខ្ញុំផង","I’ve been having an accident, could you help me?"," 我出事故了，请帮我",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ខ្ញុំបានជួបឧបទ្ទវហេតុ​ សូមជួយខ្ញុំផង", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadCambodiaToThai(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("chuai-duai-chan-don-plon",""," ជួយផង ខ្ញុំត្រូវគេធ្វើបាប","Help me! I’ve been robbed.","ช่วยด้วย ฉันโดนปล้น",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" ជួយផង ខ្ញុំត្រូវគេធ្វើបាប", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chuai-duai-chan-don-tham-rai",""," ខ្ញុំជាជនជាតិថៃ តើមានអ្នកណាអាច និយាយភាសាថៃបានខ្លះទេ?","Help me! I've been attacked.","ช่วยด้วย ฉันโดนทำร้าย",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំជាជនជាតិថៃ តើមានអ្នកណាអាច និយាយភាសាថៃបានខ្លះទេ?", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-pen-kon-thai-mee-khrai-phut-pha-sa-thai-dai-bang",""," រថយន្តខូច តើអ្នកអាចជួយខ្ញុំបានទេ?","I am Thai. Does anyone speak Thai?","ฉันเป็นคนไทยมีใครพูดภาษาไทยได้บ้าง",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" រថយន្តខូច តើអ្នកអាចជួយខ្ញុំបានទេ?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("rot-sia-khun-chuai-dai-mai",""," ខ្ញុំផ្តាសាយ","My car has broken down, can you help me?","รถเสีย คุณช่วยได้ไหม",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំផ្តាសាយ", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-pen-khai",""," ខ្ញុំផ្តាសាយ","I’ve got a temperature.","ฉันเป็นไข้",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំផ្តាសាយ", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-puad-hua","","ខ្ញុំឈឺក្បាល","I've been having headaches.","ฉันปวดหัว",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ខ្ញុំឈឺក្បាល", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-puad-thong(mai sa-bai)",""," ខ្ញុំឈឺពោះ(ដូចជាមិនស្រួលពោះសោះ)","I've been having stomachache.","ฉันปวดท้อง(ไม่สบาย)",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំឈឺពោះ(ដូចជាមិនស្រួលពោះសោះ)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-puad-thong(hong-nam)",""," ខ្ញុំឈឺពោះ(ចូលបន្ទប់ទឹក)","I would like to go to the toilet.","ฉันปวดท้อง(ห้องน้ำ)",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំឈឺពោះ(ចូលបន្ទប់ទឹក)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-charge-fai",""," ខ្ញុំត្រូវការបញ្ចូលភ្លើង","I need to charge up my phone.","ฉันต้องการชาร์ตไฟ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការបញ្ចូលភ្លើង", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-tong-kan-riak-pra-kan",""," ខ្ញុំត្រូវការហៅក្រុមហ៊ុនធានារ៉ាប់រង","I would like to call an insurance.","ฉันต้องการเรียกประกัน",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការហៅក្រុមហ៊ុនធានារ៉ាប់រង", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chuai-pha-chan-pai-rong-pha-ya-ban-tee","","សួមជួយនាំខ្ញុំទៅមន្ទីរពេទ្យបន្តិច","Could you take me to the hospital?","ช่วยพาฉันไปโรงพยาบาลที",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("សួមជួយនាំខ្ញុំទៅមន្ទីរពេទ្យបន្តិច", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pom-dai-rap-ubat-ti-het","","ខ្ញុំបានជួបឧបទ្ទវហេតុ​ សូមជួយខ្ញុំផង","I’ve been having an accident, could you help me?","ผมได้รับอุบัติเหตุ ช่วยผมด้วย",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ខ្ញុំបានជួបឧបទ្ទវហេតុ​ សូមជួយខ្ញុំផង", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadCambodiaToBrunei(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("to-long-sa-ya-ter-la-dee-sa-moon",""," ជួយផង ខ្ញុំត្រូវគេធ្វើបាប","Help me! I’ve been robbed.","Tolong , saya telah disamun",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" ជួយផង ខ្ញុំត្រូវគេធ្វើបាប", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-sa-ya-ter-la-dee-jer-der-ra-gun-o-rung",""," ខ្ញុំជាជនជាតិថៃ តើមានអ្នកណាអាច និយាយភាសាថៃបានខ្លះទេ?","Help me! I've been attacked.","Tolong , saya telah dicederakan orang",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំជាជនជាតិថៃ តើមានអ្នកណាអាច និយាយភាសាថៃបានខ្លះទេ?", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-o-rung-thai-ar-dar-o-rung-yung-bo-leh-bern-ba-ha-sa-thai-gah",""," រថយន្តខូច តើអ្នកអាចជួយខ្ញុំបានទេ?","I am Thai. Does anyone speak Thai?","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" រថយន្តខូច តើអ្នកអាចជួយខ្ញុំបានទេ?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-ray-ta-sa-ya-ro-suk-bo-leh-gah- an-da-to-long-sa-ya",""," ខ្ញុំផ្តាសាយ","My car has broken down, can you help me?","Kereta saya rosak. Bolehkah anda tolong saya?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំផ្តាសាយ", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-der-mun",""," ខ្ញុំផ្តាសាយ","I’ve got a temperature.","Saya deman",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំផ្តាសាយ", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-ger-pa-la","","ខ្ញុំឈឺក្បាល","I've been having headaches.","Saya sakit kepala",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ខ្ញុំឈឺក្បាល", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-per-rut  (tee-duk-see-hut)",""," ខ្ញុំឈឺពោះ(ដូចជាមិនស្រួលពោះសោះ)","I've been having stomachache.","Saya sakit perut (tidak sihat)",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំឈឺពោះ(ដូចជាមិនស្រួលពោះសោះ)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-per-rut (hurn-duk-ger-tun-dus)",""," ខ្ញុំឈឺពោះ(ចូលបន្ទប់ទឹក)","I would like to go to the toilet.","Saya sakit perut (hendak ke tandas)",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំឈឺពោះ(ចូលបន្ទប់ទឹក)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-ma-hoo-mer-nger-jard-ba-ter-ree",""," ខ្ញុំត្រូវការបញ្ចូលភ្លើង","I need to charge up my phone.","Saya mahu mengecaj bateri ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការបញ្ចូលភ្លើង", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-ma-hoo-pung-kil-in-soo-run",""," ខ្ញុំត្រូវការហៅក្រុមហ៊ុនធានារ៉ាប់រង","I would like to call an insurance.","Saya mahu panggil insuren",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការហៅក្រុមហ៊ុនធានារ៉ាប់រង", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-hun-tal-gun-sa-ya-ger-hos-pi-tal","","សួមជួយនាំខ្ញុំទៅមន្ទីរពេទ្យបន្តិច","Could you take me to the hospital?","Tolong hantarkan saya ke hospital",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("សួមជួយនាំខ្ញុំទៅមន្ទីរពេទ្យបន្តិច", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-mer-nga-la-mee-ger-ma-la-ngun- to-long-lah-sa-ya","","ខ្ញុំបានជួបឧបទ្ទវហេតុ​ សូមជួយខ្ញុំផង","I’ve been having an accident, could you help me?","Saya mengalami kemalangan Tolonglah saya",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ខ្ញុំបានជួបឧបទ្ទវហេតុ​ សូមជួយខ្ញុំផង", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }
    public void loadCambodiaToCambodia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("juay-phong-khyom-treuw-joe-plon",""," ជួយផង ខ្ញុំត្រូវគេធ្វើបាប","Help me! I’ve been robbed.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" ជួយផង ខ្ញុំត្រូវគេធ្វើបាប", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("juay -phong-khyom- treuw -gay-thwer-barb",""," ខ្ញុំជាជនជាតិថៃ តើមានអ្នកណាអាច និយាយភាសាថៃបានខ្លះទេ?","Help me! I've been attacked.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំជាជនជាតិថៃ តើមានអ្នកណាអាច និយាយភាសាថៃបានខ្លះទេ?", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-jia-juan-jiad-thai-ter-mian- niah-na-art-ni-yiay-phia-sa-thai-barn-khlah-tay",""," រថយន្តខូច តើអ្នកអាចជួយខ្ញុំបានទេ?","I am Thai. Does anyone speak Thai?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" រថយន្តខូច តើអ្នកអាចជួយខ្ញុំបានទេ?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ruad-yuan-khoat-ter-niah-art-juay- khyom-barn-tay",""," ខ្ញុំផ្តាសាយ","My car has broken down, can you help me?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំផ្តាសាយ", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-phda-sai",""," ខ្ញុំផ្តាសាយ","I’ve got a temperature.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំផ្តាសាយ", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-cheu-kbal","","ខ្ញុំឈឺក្បាល","I've been having headaches.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ខ្ញុំឈឺក្បាល", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-cheu-puah (doat-jia-meun-sruan-puah-sauh)",""," ខ្ញុំឈឺពោះ(ដូចជាមិនស្រួលពោះសោះ)","I've been having stomachache.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំឈឺពោះ(ដូចជាមិនស្រួលពោះសោះ)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-cheu- puah  (joen-bon-toop-tuek)",""," ខ្ញុំឈឺពោះ(ចូលបន្ទប់ទឹក)","I would like to go to the toilet.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំឈឺពោះ(ចូលបន្ទប់ទឹក)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" khyom -treuw-ga-bon-joen-phlerng",""," ខ្ញុំត្រូវការបញ្ចូលភ្លើង","I need to charge up my phone.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការបញ្ចូលភ្លើង", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" khyom-treuw-ga-how-groam-hoon-thia-nia-rub-roang",""," ខ្ញុំត្រូវការហៅក្រុមហ៊ុនធានារ៉ាប់រង","I would like to call an insurance.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការហៅក្រុមហ៊ុនធានារ៉ាប់រង", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" soam-juay-nuam-khyom -teuw-muan-tee-paed-bon-tert","","សួមជួយនាំខ្ញុំទៅមន្ទីរពេទ្យបន្តិច","Could you take me to the hospital?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("សួមជួយនាំខ្ញុំទៅមន្ទីរពេទ្យបន្តិច", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom -barn-juab-ou-pud-wah-hed-soam- juay- khyom -phong","","ខ្ញុំបានជួបឧបទ្ទវហេតុ​ សូមជួយខ្ញុំផង","I’ve been having an accident, could you help me?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ខ្ញុំបានជួបឧបទ្ទវហេតុ​ សូមជួយខ្ញុំផង", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }
    public void loadCambodiaToIndonesia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("to-long-sar-yar-bar-ru-sar-jar-dee- ram-pok",""," ជួយផង ខ្ញុំត្រូវគេធ្វើបាប","Help me! I’ve been robbed.","Tolong, Saya baru saja  dirampok.",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" ជួយផង ខ្ញុំត្រូវគេធ្វើបាប", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-sar-yar-bar-ru-sar-jar-dee-pu-gu-lee",""," ខ្ញុំជាជនជាតិថៃ តើមានអ្នកណាអាច និយាយភាសាថៃបានខ្លះទេ?","Help me! I've been attacked.","Tolong, Saya baru saja dipukuli.",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំជាជនជាតិថៃ តើមានអ្នកណាអាច និយាយភាសាថៃបានខ្លះទេ?", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-o-rang-tai ar-par-ar-dar-yang-bee-sar-bee-jar-rar-bar-har-sar-tai",""," រថយន្តខូច តើអ្នកអាចជួយខ្ញុំបានទេ?","I am Thai. Does anyone speak Thai?","Saya orang Thai. Apa ada yang bisa bicara bahasa Thai?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" រថយន្តខូច តើអ្នកអាចជួយខ្ញុំបានទេ?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mo-bil-sar-yar-ru-sak-ar-par-an-dar-bee-sar-ban-tu-sar-yar",""," ខ្ញុំផ្តាសាយ","My car has broken down, can you help me?","Mobil saya rusak. Apa anda bisa bantu saya?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំផ្តាសាយ", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-meun-der-ree-tar-deu-mam",""," ខ្ញុំផ្តាសាយ","I’ve got a temperature.","Saya menderita demam",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំផ្តាសាយ", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-sar-git-geu-par-lar","","ខ្ញុំឈឺក្បាល","I've been having headaches.","Saya sakit kepala",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ខ្ញុំឈឺក្បាល", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-sar-git-peu-root",""," ខ្ញុំឈឺពោះ(ដូចជាមិនស្រួលពោះសោះ)","I've been having stomachache.","Saya sakit perut",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំឈឺពោះ(ដូចជាមិនស្រួលពោះសោះ)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar- mu-las",""," ខ្ញុំឈឺពោះ(ចូលបន្ទប់ទឹក)","I would like to go to the toilet.","Saya mulas",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំឈឺពោះ(ចូលបន្ទប់ទឹក)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-char-ger -tey -ley-pon-sar-yar",""," ខ្ញុំត្រូវការបញ្ចូលភ្លើង","I need to charge up my phone.","Saya ingin charger telepon saya",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការបញ្ចូលភ្លើង", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-pang-keel-ar-gen-ar-soo-ran-see",""," ខ្ញុំត្រូវការហៅក្រុមហ៊ុនធានារ៉ាប់រង","I would like to call an insurance.","Saya ingin panggil agen asuransi",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការហៅក្រុមហ៊ុនធានារ៉ាប់រង", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-an-tar-sar-yar-per-kee-ger-ru-mah-sar-git","","សួមជួយនាំខ្ញុំទៅមន្ទីរពេទ្យបន្តិច","Could you take me to the hospital?","Tolong antar saya pergi ke rumah sakit.",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("សួមជួយនាំខ្ញុំទៅមន្ទីរពេទ្យបន្តិច", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-bar-ru-sar-jar-mer-nga-lar-mee-ger-jeu-lar-kar-an-lar-lu-lin-tas, tor-long-ban-tu-sar-yar","","ខ្ញុំបានជួបឧបទ្ទវហេតុ​ សូមជួយខ្ញុំផង","I’ve been having an accident, could you help me?","Saya baru saja mengalami  kecelakaan lalu lintas, Tolong bantu saya. ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ខ្ញុំបានជួបឧបទ្ទវហេតុ​ សូមជួយខ្ញុំផង", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadCambodiaToLaos(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("soi-dae-khoy-teuk-poon",""," ជួយផង ខ្ញុំត្រូវគេធ្វើបាប","Help me! I’ve been robbed."," ຊ່ອຍແດ່ຂ້ອຍຖືກປຸ້ນ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" ជួយផង ខ្ញុំត្រូវគេធ្វើបាប", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soi-dae-khoy-teuk-tum-hai",""," ខ្ញុំជាជនជាតិថៃ តើមានអ្នកណាអាច និយាយភាសាថៃបានខ្លះទេ?","Help me! I've been attacked."," ຊ່ອຍແດ່ຂ້ອຍຖືກທຳຮ້າຍ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំជាជនជាតិថៃ តើមានអ្នកណាអាច និយាយភាសាថៃបានខ្លះទេ?", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-pen-khon-thai-mee-phai-wao-pha-sa- thai-dai-dae",""," រថយន្តខូច តើអ្នកអាចជួយខ្ញុំបានទេ?","I am Thai. Does anyone speak Thai?"," ຂ້ອຍເປັນຄົນໄທ ມີໃຜເວົ້າພາສາໄທໄດ້ແດ່",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" រថយន្តខូច តើអ្នកអាចជួយខ្ញុំបានទេ?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("load-phe-jao-soi-dai-bor",""," ខ្ញុំផ្តាសាយ","My car has broken down, can you help me?"," ລົດເພເຈົ້າຊ່ອຍໄດ້ບໍ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំផ្តាសាយ", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-pen-khai",""," ខ្ញុំផ្តាសាយ","I’ve got a temperature."," ຂ້ອຍເປັນໄຂ້",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំផ្តាសាយ", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-jeb-hua","","ខ្ញុំឈឺក្បាល","I've been having headaches."," ຂ້ອຍເຈັບຫົວ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ខ្ញុំឈឺក្បាល", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-jeb-thong (bor-sa-bai)",""," ខ្ញុំឈឺពោះ(ដូចជាមិនស្រួលពោះសោះ)","I've been having stomachache."," ຂ້ອຍເຈັບທ້ອງ (ບໍ່ສະບາຍ)",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំឈឺពោះ(ដូចជាមិនស្រួលពោះសោះ)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-jeb-thong (hong-num)",""," ខ្ញុំឈឺពោះ(ចូលបន្ទប់ទឹក)","I would like to go to the toilet."," ຂ້ອຍເຈັບທ້ອງ (ຫ້ອງນ້ຳ)",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំឈឺពោះ(ចូលបន្ទប់ទឹក)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-sark-fai",""," ខ្ញុំត្រូវការបញ្ចូលភ្លើង","I need to charge up my phone."," ຂ້ອຍຕ້ອງການສາກໄຟ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការបញ្ចូលភ្លើង", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-tong-garn-earn-pa-gun",""," ខ្ញុំត្រូវការហៅក្រុមហ៊ុនធានារ៉ាប់រង","I would like to call an insurance."," ຂ້ອຍຕ້ອງການເອິ້ນປະກັນ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការហៅក្រុមហ៊ុនធានារ៉ាប់រង", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soi-pha-khoy-pai-hong-mor-dae","","សួមជួយនាំខ្ញុំទៅមន្ទីរពេទ្យបន្តិច","Could you take me to the hospital?"," ຊ່ອຍພາຂ້ອຍໄປໂຮງໝໍແດ່",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("សួមជួយនាំខ្ញុំទៅមន្ទីរពេទ្យបន្តិច", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-dai-hub-u-bud-ti-hed-soi-khoy-dae","","ខ្ញុំបានជួបឧបទ្ទវហេតុ​ សូមជួយខ្ញុំផង","I’ve been having an accident, could you help me?"," ຂ້ອຍໄດ້ຮັບອຸບັດຕິເຫດຊ່ອຍຂ້ອຍແດ່",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ខ្ញុំបានជួបឧបទ្ទវហេតុ​ សូមជួយខ្ញុំផង", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadCambodiaToMalaysia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("to-long-sa-ya-ter-la-dee-sa-moon",""," ជួយផង ខ្ញុំត្រូវគេធ្វើបាប","Help me! I’ve been robbed.","Tolong , saya telah disamun",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" ជួយផង ខ្ញុំត្រូវគេធ្វើបាប", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-sa-ya-ter-la-dee-jer-der-ra-gun-o-rung",""," ខ្ញុំជាជនជាតិថៃ តើមានអ្នកណាអាច និយាយភាសាថៃបានខ្លះទេ?","Help me! I've been attacked.","Tolong , saya telah dicederakan orang",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំជាជនជាតិថៃ តើមានអ្នកណាអាច និយាយភាសាថៃបានខ្លះទេ?", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-o-rung-thai-ar-dar-o-rung-yung-bo-leh-bern-ba-ha-sa-thai-gah",""," រថយន្តខូច តើអ្នកអាចជួយខ្ញុំបានទេ?","I am Thai. Does anyone speak Thai?","Saya orang Thai. Ada orang yang boleh berbahasa Thai kah?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" រថយន្តខូច តើអ្នកអាចជួយខ្ញុំបានទេ?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ger-ray-ta-sa-ya-ro-suk-bo-leh-gah- an-da-to-long-sa-ya",""," ខ្ញុំផ្តាសាយ","My car has broken down, can you help me?","Kereta saya rosak. Bolehkah anda tolong saya?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំផ្តាសាយ", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-der-mun",""," ខ្ញុំផ្តាសាយ","I’ve got a temperature.","Saya deman",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំផ្តាសាយ", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-ger-pa-la","","ខ្ញុំឈឺក្បាល","I've been having headaches.","Saya sakit kepala",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ខ្ញុំឈឺក្បាល", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-per-rut  (tee-duk-see-hut)",""," ខ្ញុំឈឺពោះ(ដូចជាមិនស្រួលពោះសោះ)","I've been having stomachache.","Saya sakit perut (tidak sihat)",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំឈឺពោះ(ដូចជាមិនស្រួលពោះសោះ)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-sa-git-per-rut (hurn-duk-ger-tun-dus)",""," ខ្ញុំឈឺពោះ(ចូលបន្ទប់ទឹក)","I would like to go to the toilet.","Saya sakit perut (hendak ke tandas)",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំឈឺពោះ(ចូលបន្ទប់ទឹក)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-ma-hoo-mer-nger-jard-ba-ter-ree",""," ខ្ញុំត្រូវការបញ្ចូលភ្លើង","I need to charge up my phone.","Saya mahu mengecaj bateri ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការបញ្ចូលភ្លើង", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-ma-hoo-pung-kil-in-soo-run",""," ខ្ញុំត្រូវការហៅក្រុមហ៊ុនធានារ៉ាប់រង","I would like to call an insurance.","Saya mahu panggil insuren",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការហៅក្រុមហ៊ុនធានារ៉ាប់រង", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("to-long-hun-tal-gun-sa-ya-ger-hos-pi-tal","","សួមជួយនាំខ្ញុំទៅមន្ទីរពេទ្យបន្តិច","Could you take me to the hospital?","Tolong hantarkan saya ke hospital",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("សួមជួយនាំខ្ញុំទៅមន្ទីរពេទ្យបន្តិច", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-mer-nga-la-mee-ger-ma-la-ngun- to-long-lah-sa-ya","","ខ្ញុំបានជួបឧបទ្ទវហេតុ​ សូមជួយខ្ញុំផង","I’ve been having an accident, could you help me?","Saya mengalami kemalangan Tolonglah saya",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ខ្ញុំបានជួបឧបទ្ទវហេតុ​ សូមជួយខ្ញុំផង", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadCambodiaToMyanmar(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("kae-ba-ong/ja-nor/ja-ma a-nuh-jan-see-kan-ya-dae",""," ជួយផង ខ្ញុំត្រូវគេធ្វើបាប","Help me! I’ve been robbed.","ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ အႏုၾကမ္းခံရတယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" ជួយផង ខ្ញុំត្រូវគេធ្វើបាប", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kae ba ong/ ja-nor/ja-ma laeh-yaw mu- joo-loon -kan-ya-dae",""," ខ្ញុំជាជនជាតិថៃ តើមានអ្នកណាអាច និយាយភាសាថៃបានខ្លះទេ?","Help me! I've been attacked.","ကယ္ပါအုံး၊ ကြ်န္ေတာ္⁄ကြ်န္မ လက္ေရာက္ မႈက်ဴးလြန္ခံရတယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំជាជនជាតិថៃ តើមានអ្នកណាអាច និយាយភាសាថៃបានខ្លះទេ?", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mu- joo-loon -kan-ya-dae  bae-too- thai-sa-ka-pyor-tat- ta-lae",""," រថយន្តខូច តើអ្នកអាចជួយខ្ញុំបានទេ?","I am Thai. Does anyone speak Thai?","ကြ်န္ေတာ္⁄ကြ်န္မ ထိုင္းလူမ်ိဴးျဖစ္တယ္။ ဘယ္သူထိုင္းစကားေျပာတတ္သလဲ။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" រថយន្តខូច តើអ្នកអាចជួយខ្ញុំបានទេ?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ka-piah-loh-kha-mia/sheen ku-nyi- pe-loh-ya-ta-la",""," ខ្ញុំផ្តាសាយ","My car has broken down, can you help me?","ကားပ်က္လို႔ ခင္ဗ်ား∕ရွင္ ကူညီေပးလို႔ရသလား။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំផ្តាសាយ", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-phia-ne-dae",""," ខ្ញុំផ្តាសាយ","I’ve got a temperature.","ကြ်န္ေတာ္⁄ကြ်န္မ ဖ်ားေနတယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំផ្តាសាយ", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-gaw-kai-dae","","ខ្ញុំឈឺក្បាល","I've been having headaches.","ကြ်န္ေတာ္⁄ကြ်န္မ ေခါင္းကိုက္တယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ខ្ញុំឈឺក្បាល", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-pai-na-dae(ne-ma-gaw-boo)",""," ខ្ញុំឈឺពោះ(ដូចជាមិនស្រួលពោះសោះ)","I've been having stomachache.","ကြ်န္ေတာ္⁄ကြ်န္မ ဗိုက္နာတယ္။ (ေနမေကာင္းဘူး)",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំឈឺពោះ(ដូចជាមិនស្រួលពោះសោះ)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma pai-na-dae  (eng-ta-twa-jin-dae/a-le- twa-jin-dae)",""," ខ្ញុំឈឺពោះ(ចូលបន្ទប់ទឹក)","I would like to go to the toilet.","ကြ်န္ေတာ္⁄ကြ်န္မ  ဗိုက္နာတယ္။ (အိမ္သာသြားခ်င္တယ္)",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំឈឺពោះ(ចូលបន្ទប់ទឹក)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-mee-ar-twin- jin-dae",""," ខ្ញុំត្រូវការបញ្ចូលភ្លើង","I need to charge up my phone.","ကြ်န္ေတာ္⁄ကြ်န္မ မီးအားတြင္းခ်င္တယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការបញ្ចូលភ្លើង", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma ah-makan-khor-jin- dae",""," ខ្ញុំត្រូវការហៅក្រុមហ៊ុនធានារ៉ាប់រង","I would like to call an insurance.","ကြ်န္ေတာ္⁄ကြ်န္မ အားမခံေခၚခ်င္တယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការហៅក្រុមហ៊ុនធានារ៉ាប់រង", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma-koe-se-yong- lai-poh- pe-ba","","សួមជួយនាំខ្ញុំទៅមន្ទីរពេទ្យបន្តិច","Could you take me to the hospital?","ကြ်န္ေတာ္⁄ကြ်န္မ ကို ေဆး႐ုံလိုက္ပုိ ့ေပးပါ။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("សួមជួយនាំខ្ញុំទៅមន្ទីរពេទ្យបន្តិច", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor-ma-tor-ta-sa-phit- loh-koo- nyi-pe-ba","","ខ្ញុំបានជួបឧបទ្ទវហេតុ​ សូមជួយខ្ញុំផង","I’ve been having an accident, could you help me?","ကြ်န္ေတာ္မေတာ္တဆျဖစ္လို႔ကူညီေပးပါ။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ខ្ញុំបានជួបឧបទ្ទវហេតុ​ សូមជួយខ្ញុំផង", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadCambodiaToPhilippines(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("tu-lu-ngan-nin-yo-ar-go-nar-nar-gar-wan-ar-go",""," ជួយផង ខ្ញុំត្រូវគេធ្វើបាប","Help me! I’ve been robbed.","Tulungan ninyo ako! Nanakawan ako! ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" ជួយផង ខ្ញុំត្រូវគេធ្វើបាប", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tu-lu-ngan-nin-yo-ar-go-nar-sak-tan-ar-go",""," ខ្ញុំជាជនជាតិថៃ តើមានអ្នកណាអាច និយាយភាសាថៃបានខ្លះទេ?","Help me! I've been attacked.","Tulungan ninyo ako! Nasaktan ako!",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំជាជនជាតិថៃ តើមានអ្នកណាអាច និយាយភាសាថៃបានខ្លះទេ?", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ar-go-ai-thai-mey-ron-bar-di-tong-mar-ru-nong-mak-thai",""," រថយន្តខូច តើអ្នកអាចជួយខ្ញុំបានទេ?","I am Thai. Does anyone speak Thai?","Ako ay Thai. Meron ba ditong marunong mag- thai?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" រថយន្តខូច តើអ្នកអាចជួយខ្ញុំបានទេ?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-si-rar-an-ang-got-sey-go-pu-wey-dey-ni-yo-bar-ar-gong-tu-lu-ngan",""," ខ្ញុំផ្តាសាយ","My car has broken down, can you help me?","Nasiraan ang kotse ko. Puwede niyo ba akong tulungan?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំផ្តាសាយ", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mai-sar-git-ar-go",""," ខ្ញុំផ្តាសាយ","I’ve got a temperature.","May sakit ako.",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំផ្តាសាយ", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mai-sar-git-u-lo-ar-go","","ខ្ញុំឈឺក្បាល","I've been having headaches.","May sakit ulo ako.",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ខ្ញុំឈឺក្បាល", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mar-sar-git-ang-ti-yan-go",""," ខ្ញុំឈឺពោះ(ដូចជាមិនស្រួលពោះសោះ)","I've been having stomachache.","Masakit ang tiyan ko.",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំឈឺពោះ(ដូចជាមិនស្រួលពោះសោះ)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mar-sar-git-ang-ti-yan-go-kai-lar-ngan-gong-gar-mi-tin-ang-ban-yo",""," ខ្ញុំឈឺពោះ(ចូលបន្ទប់ទឹក)","I would like to go to the toilet.","Masakit ang tiyan ko. Kailangan kong gamitin ang banyo.",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំឈឺពោះ(ចូលបន្ទប់ទឹក)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kai-lar-ngan-gong-i-rey-charch-ang-bat-tar-ri-yar",""," ខ្ញុំត្រូវការបញ្ចូលភ្លើង","I need to charge up my phone.","Kailangan kong i re-charge ang batteriya.",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការបញ្ចូលភ្លើង", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kai-lar-ngan-gong-tar-war-gan-ang-ar-hen-tey-go-sar-in-chu-rans",""," ខ្ញុំត្រូវការហៅក្រុមហ៊ុនធានារ៉ាប់រង","I would like to call an insurance.","Kailangan kong tawagan ang ahente ko sa insurance.",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការហៅក្រុមហ៊ុនធានារ៉ាប់រង", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("par-gi-dar-lar-nin-yo-ar-go-sar-os-pi-tal","","សួមជួយនាំខ្ញុំទៅមន្ទីរពេទ្យបន្តិច","Could you take me to the hospital?","Paki dala ninyo ako sa ospital.",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("សួមជួយនាំខ្ញុំទៅមន្ទីរពេទ្យបន្តិច", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-ak-si-en-tey-ar-go-tu-lu-ngan-ni-yo-po-ar-go","","ខ្ញុំបានជួបឧបទ្ទវហេតុ​ សូមជួយខ្ញុំផង","I’ve been having an accident, could you help me?","Na-aksidente ako. Tulungan niyo po ako.",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ខ្ញុំបានជួបឧបទ្ទវហេតុ​ សូមជួយខ្ញុំផង", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadCambodiaToSingapore(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("help-mee-ai-haf-been-rob",""," ជួយផង ខ្ញុំត្រូវគេធ្វើបាប","Help me! I’ve been robbed.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" ជួយផង ខ្ញុំត្រូវគេធ្វើបាប", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("help-mee-ai-haf-been-at-tak",""," ខ្ញុំជាជនជាតិថៃ តើមានអ្នកណាអាច និយាយភាសាថៃបានខ្លះទេ?","Help me! I've been attacked.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំជាជនជាតិថៃ តើមានអ្នកណាអាច និយាយភាសាថៃបានខ្លះទេ?", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-am-thai-das-en-nee-wan-speek-thai",""," រថយន្តខូច តើអ្នកអាចជួយខ្ញុំបានទេ?","I am Thai. Does anyone speak Thai?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" រថយន្តខូច តើអ្នកអាចជួយខ្ញុំបានទេ?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mai-kar-has-brok-ken-dao-kan-yu-help-mee",""," ខ្ញុំផ្តាសាយ","My car has broken down, can you help me?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំផ្តាសាយ", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-haf-got-a-tem-per-re-jer",""," ខ្ញុំផ្តាសាយ","I’ve got a temperature.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំផ្តាសាយ", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-haf-been-haf-fing-hed-eks","","ខ្ញុំឈឺក្បាល","I've been having headaches.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ខ្ញុំឈឺក្បាល", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-haf-been-haf-fing-sto-mak-ek",""," ខ្ញុំឈឺពោះ(ដូចជាមិនស្រួលពោះសោះ)","I've been having stomachache.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំឈឺពោះ(ដូចជាមិនស្រួលពោះសោះ)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-tu-go-tu-der-toi-let",""," ខ្ញុំឈឺពោះ(ចូលបន្ទប់ទឹក)","I would like to go to the toilet.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំឈឺពោះ(ចូលបន្ទប់ទឹក)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-need-tu-charch-ap-mai-fon",""," ខ្ញុំត្រូវការបញ្ចូលភ្លើង","I need to charge up my phone.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការបញ្ចូលភ្លើង", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-like-tu-col-an-in-chua-rans",""," ខ្ញុំត្រូវការហៅក្រុមហ៊ុនធានារ៉ាប់រង","I would like to call an insurance.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការហៅក្រុមហ៊ុនធានារ៉ាប់រង", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kood-yu-tek-mee-tu-der-hos-pi-tol","","សួមជួយនាំខ្ញុំទៅមន្ទីរពេទ្យបន្តិច","Could you take me to the hospital?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("សួមជួយនាំខ្ញុំទៅមន្ទីរពេទ្យបន្តិច", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-haf-been-haf-fing-an-ak-si-dent- kood-yu-help-mee","","ខ្ញុំបានជួបឧបទ្ទវហេតុ​ សូមជួយខ្ញុំផង","I’ve been having an accident, could you help me?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ខ្ញុំបានជួបឧបទ្ទវហេតុ​ សូមជួយខ្ញុំផង", "I’ve been having an accident, could you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadCambodiaToVietnam(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("kew-toay, toay-bi-kueap-yerd",""," ជួយផង ខ្ញុំត្រូវគេធ្វើបាប","Help me! I’ve been robbed.","cứu tôi, tôi bị cướp giật",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" ជួយផង ខ្ញុំត្រូវគេធ្វើបាប", "Help me! I’ve been robbed.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kew-toay, toay-bi-hun-hung",""," ខ្ញុំជាជនជាតិថៃ តើមានអ្នកណាអាច និយាយភាសាថៃបានខ្លះទេ?","Help me! I've been attacked.","cứu tôi, tôi bị hành hung",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំជាជនជាតិថៃ តើមានអ្នកណាអាច និយាយភាសាថៃបានខ្លះទេ?", "Help me! I've been attacked.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-laa-ngeu-thai, kor-eye-biat-noi-teung-thai-khong",""," រថយន្តខូច តើអ្នកអាចជួយខ្ញុំបានទេ?","I am Thai. Does anyone speak Thai?","tôi là người Thái, có ai biết nói tiếng Thái không?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" រថយន្តខូច តើអ្នកអាចជួយខ្ញុំបានទេ?", "I am Thai. Does anyone speak Thai?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sae-bi-hong, ban-yoop-hoe-deuak- khong",""," ខ្ញុំផ្តាសាយ","My car has broken down, can you help me?","xe bị hỏng, bạn giúp hộ được không?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំផ្តាសាយ", "My car has broken down, can you help me?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-bi-karm",""," ខ្ញុំផ្តាសាយ","I’ve got a temperature.","tôi bị cảm",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំផ្តាសាយ", "I’ve got a temperature.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-bi-yuek-deaw","","ខ្ញុំឈឺក្បាល","I've been having headaches.","tôi bị nhức đầu",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ខ្ញុំឈឺក្បាល", "I've been having headaches.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-bi-deaw-bung",""," ខ្ញុំឈឺពោះ(ដូចជាមិនស្រួលពោះសោះ)","I've been having stomachache.","tôi bị đau bụng",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំឈឺពោះ(ដូចជាមិនស្រួលពោះសោះ)", "I've been having stomachache.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-dee-koeu",""," ខ្ញុំឈឺពោះ(ចូលបន្ទប់ទឹក)","I would like to go to the toilet.","tôi muốn đi cầu",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំឈឺពោះ(ចូលបន្ទប់ទឹក)", "I would like to go to the toilet.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-koeu-dien",""," ខ្ញុំត្រូវការបញ្ចូលភ្លើង","I need to charge up my phone.","tôi muốn câu điện",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការបញ្ចូលភ្លើង", "I need to charge up my phone.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-muan-koi-bow-hiem",""," ខ្ញុំត្រូវការហៅក្រុមហ៊ុនធានារ៉ាប់រង","I would like to call an insurance.","tôi muốn gọi bảo hiểm",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំត្រូវការហៅក្រុមហ៊ុនធានារ៉ាប់រង", "I would like to call an insurance.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("larm-earn-deau-toi-dee-beng-wien","","សួមជួយនាំខ្ញុំទៅមន្ទីរពេទ្យបន្តិច","Could you take me to the hospital?","làm ơn đưa tôi đi bệnh viện",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("សួមជួយនាំខ្ញុំទៅមន្ទីរពេទ្យបន្តិច", "Could you take me to the hospital?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-bi-tai-nun, larm-earn-yup-toi-wuai","","ខ្ញុំបានជួបឧបទ្ទវហេតុ​ សូមជួយខ្ញុំផង","I’ve been having an accident, could you help me?","tôi bị tai nạn, làm ơn giúp tôi với",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ខ្ញុំបានជួបឧបទ្ទវហេតុ​ សូមជួយខ្ញុំផង", "I’ve been having an accident, could you help me?", childList);
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
