package com.example.happytalk.app.Database;

import android.app.Activity;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.widget.ExpandableListView;
import android.widget.SearchView;

import com.example.happytalk.app.Child;
import com.example.happytalk.app.GroupHeader;
import com.example.happytalk.app.MyListAdapter;
import com.example.happytalk.app.R;

import java.security.acl.Group;
import java.util.ArrayList;

/**
 * Created by oVANILLAz on 6/10/14 AD.
 */
public class ConversationDAL  {



    private ArrayList<GroupHeader> groupHeaderList = new ArrayList<GroupHeader>();

    public void loadThaiToBrunei(){
        ArrayList<Child> childList = new ArrayList<Child>();
        //karaokeEN, karaokeTH,wordFrom,wordEN,wordTo,sound,favorite
        Child child = new Child("Test1","Test2","Test3","Test4","Test5",null,null);
        child.setSoundPath(R.raw.hello_br);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Thai","Brunei",childList);
        groupHeaderList.add(groupHeader);



    }

    public void loadThaiToChina(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("Test6","Test7","Test8","Test9","Test10",null,null);
        child.setSoundPath(R.raw.hello_th);
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

        Child child = new Child("nee-hao","","Kumusta","Hello","你好",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Kumusta", "Hello", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jao-un","","Selamat pagi","Good Morning Sir/Madame","早安",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Selamat pagi", "Good Morning Sir/Madame", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("woo-un","","Selamat petang","Good Afternoon Sir/Madame."," 午安",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Selamat petang", "Good Afternoon Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wan-sung-hao","","Selamat petang","Good Evening Sir/Madame."," 晚上好",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Selamat petang", "Good Evening Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wan-an","","Selamat malam","Good Night Sir/Madame."," 晚安",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Selamat malam", "Good Night Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-jiaw","","Nama saya……","My name is…."," 我叫",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Nama saya……", "My name is….", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nee-gui-sing","","Siapakah nama anda","What is your name?"," 你贵姓",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Siapakah nama anda", "What is your name?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nee-hao-ma","","Apa khabar","How are you?"," 你好吗",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Apa khabar", "How are you?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yern-seu-nee-hern-gao-sing","","Gembira dapat berkenalan dengan anda","Nice to meet you."," 认识你很高兴",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Gembira dapat berkenalan dengan anda", "Nice to meet you.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-hern-hao","","Khabar baik","I’m fine."," 我很好",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Khabar baik", "I’m fine.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jai-jian","","Selamat tinggal","Good Bye."," 再见",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Selamat tinggal", "Good Bye.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pao-jong","","Jaga diri baik-baik ya","Take care of yourself."," 保重",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Jaga diri baik-baik ya", "Take care of yourself.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hui-thow-jian","","jumpa lagi","See you again."," 回头见",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("jumpa lagi", "See you again.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sia-sia","","terima kasih","Thank you Sir/Madame."," 谢谢",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("terima kasih", "Thank you Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tui-poo-chee","","Maafkan saya","Sorry Sir/Madame."," 对不起",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Maafkan saya", "Sorry Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("seu","","ya","Yes."," 是",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ya", "Yes.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("poo-seu","","bukan","No."," 不是",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("bukan", "No.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ee-ting","","sudah tentu","Of course"," 一定",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("sudah tentu", "Of course", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("poo-ee-ting","","tidak tentu","I’m not sure"," 不一定",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("tidak tentu", "I’m not sure", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("thong-ee","","setuju","Agree"," 同意",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("setuju", "Agree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("poo-thong-ee","","tidak setuju","Disagree"," 不同意",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("tidak setuju", "Disagree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sian-jai-jee-tian-ler (yao-khun-sow-piaw)","","Sekarang pukul berapa minta tengok jam sedikit ya","What time is it?(Could you tell me the time, please)"," 现在几点了（要看手表）",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Sekarang pukul berapa minta tengok jam sedikit ya", "What time is it?(Could you tell me the time, please)", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tua-sao-chian","","Harga berapa","How much does this cost?"," 多少钱",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Harga berapa", "How much does this cost?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jer-lee-nueng-yong-sin-yong-kha-foo-khuan-ma","","Di sini terima kad kridit kah?","Do you take credit cards?"," 这里能用信用卡付款吗",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Di sini terima kad kridit kah?", "Do you take credit cards?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kher-ee-huan-chian-ma","","Terima untuk menukar wang kah?","Can I change some money?"," 可以换钱吗",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Terima untuk menukar wang kah?", "Can I change some money?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------

    }


    public void loadBruneiToThai(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("sawasdee","","Kumusta","Hello","สวัสดี",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Kumusta", "Hello", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sawasdee-torn-chao-(khrap/kha)","","Selamat pagi","Good Morning Sir/Madame","สวัสดีตอนเช้าครับ/ค่ะ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Selamat pagi", "Good Morning Sir/Madame", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sawasdee-torn-bai-(khrap/kha)","","Selamat petang","Good Afternoon Sir/Madame.","สวัสดีตอนบ่ายครับ/ค่ะ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Selamat petang", "Good Afternoon Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sawasdee-torn-yen-(khrap/kha)","","Selamat petang","Good Evening Sir/Madame.","สวัสดีตอนเย็นครับ/ค่ะ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Selamat petang", "Good Evening Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ra-tri-sawad-(khrap/kha)","","Selamat malam","Good Night Sir/Madame.","ราตรีสวัสดิ์ครับ/ค่ะ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Selamat malam", "Good Night Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-chue","","Nama saya……","My name is….","ฉันชื่อ.....................",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Nama saya……", "My name is….", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khun-chue-arai","","Siapakah nama anda","What is your name?","คุณชื่ออะไร",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Siapakah nama anda", "What is your name?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khun-pen-yang-rai","","Apa khabar","How are you?","คุณเป็นอย่างไร",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Apa khabar", "How are you?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yin-dee-tee-dai-ru-chak","","Gembira dapat berkenalan dengan anda","Nice to meet you.","ยินดีที่ได้รู้จัก",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Gembira dapat berkenalan dengan anda", "Nice to meet you.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-sabai-dee","","Khabar baik","I’m fine.","ฉันสบายดี",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Khabar baik", "I’m fine.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("la-kon","","Selamat tinggal","Good Bye.","ลาก่อน",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Selamat tinggal", "Good Bye.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("du-lae-tua-eng-duai-na","","Jaga diri baik-baik ya","Take care of yourself.","ดูแลตัวเองด้วยนะ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Jaga diri baik-baik ya", "Take care of yourself.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("laew-jer-gun","","jumpa lagi","See you again.","แล้วเจอกัน",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("jumpa lagi", "See you again.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("korb-khun-(khrap/kha)","","terima kasih","Thank you Sir/Madame.","ขอบคุณครับ/ค่ะ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("terima kasih", "Thank you Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kho-thot","","Maafkan saya","Sorry Sir/Madame.","ขอโทษครับ/ค่ะ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Maafkan saya", "Sorry Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chai","","ya","Yes.","ใช่",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ya", "Yes.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mai-chai","","bukan","No.","ไม่ใช่",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("bukan", "No.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nae-norn","","sudah tentu","Of course","แน่นอน",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("sudah tentu", "Of course", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mai-nae-norn","","tidak tentu","I’m not sure","ไม่แน่นอน",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("tidak tentu", "I’m not sure", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hen-duai","","setuju","Agree","เห็นด้วย",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("setuju", "Agree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mai-hen-duai","","tidak setuju","Disagree","ไม่เห็นด้วย",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("tidak setuju", "Disagree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("torn-nee-pen-we-la-arai-kor-du-na-li-ka-noi","","Sekarang pukul berapa minta tengok jam sedikit ya","What time is it?(Could you tell me the time, please)","ตอนนี้เป็นเวลาอะไร (ขอดูนาฬิกาหน่อย)",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Sekarang pukul berapa minta tengok jam sedikit ya", "What time is it?(Could you tell me the time, please)", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("rakha-thao-rai","","Harga berapa","How much does this cost?","ราคาเท่าไร",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Harga berapa", "How much does this cost?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("thi-nee-rub-bud-credit-mai","","Di sini terima kad kridit kah?","Do you take credit cards?","ที่นี่รับบัตรเครดิตไหม",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Di sini terima kad kridit kah?", "Do you take credit cards?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("rub-laek-ngoen-mai","","Terima untuk menukar wang kah?","Can I change some money?","รับแลกเงินไหม",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Terima untuk menukar wang kah?", "Can I change some money?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToBrunei(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("gu-moos-tar","","Kumusta","Hello","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Kumusta", "Hello", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ser-la-mud-pa-kee","","Selamat pagi","Good Morning Sir/Madame","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Selamat pagi", "Good Morning Sir/Madame", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ser-la-mud-per-tung","","Selamat petang","Good Afternoon Sir/Madame.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Selamat petang", "Good Afternoon Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ser-la-mud-per-tung","","Selamat petang","Good Evening Sir/Madame.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Selamat petang", "Good Evening Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ser-la-mud-ma-lum","","Selamat malam","Good Night Sir/Madame.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Selamat malam", "Good Night Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("na-ma-sa-ya","","Nama saya……","My name is….","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Nama saya……", "My name is….", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("see-ya-pa-gah-na-ma-un-da","","Siapakah nama anda","What is your name?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Siapakah nama anda", "What is your name?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ar-pa-ka-bul","","Apa khabar","How are you?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Apa khabar", "How are you?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("koem-bee-ra-da-pud-burn-gur-na-lun- der-ngun-un-da","","Gembira dapat berkenalan dengan anda","Nice to meet you.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Gembira dapat berkenalan dengan anda", "Nice to meet you.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ka-bul-baik","","Khabar baik","I’m fine.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Khabar baik", "I’m fine.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ser-la-mud-ting-kul","","Selamat tinggal","Good Bye.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Selamat tinggal", "Good Bye.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ya-ka-dee-ree-baik-baik-ya","","Jaga diri baik-baik ya","Take care of yourself.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Jaga diri baik-baik ya", "Take care of yourself.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yoom-pa-la-kee","","jumpa lagi","See you again.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("jumpa lagi", "See you again.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ter-ree-ma-ga-seh","","terima kasih","Thank you Sir/Madame.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("terima kasih", "Thank you Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ma-af-gun-sa-ya","","Maafkan saya","Sorry Sir/Madame.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Maafkan saya", "Sorry Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ya","","ya","Yes.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ya", "Yes.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("boo-gun","","bukan","No.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("bukan", "No.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soo-da-tern-too","","sudah tentu","Of course","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("sudah tentu", "Of course", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tee-duk-tern-too","","tidak tentu","I’m not sure","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("tidak tentu", "I’m not sure", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ser-too-yoo","","setuju","Agree","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("setuju", "Agree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tee-duk-ser-too-yoo","","tidak setuju","Disagree","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("tidak setuju", "Disagree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ser-ga-rung-poo-goon-ber-ra-pa-min-ta-tay-ngoak-yum-ser-dee-kit-ya","","Sekarang pukul berapa minta tengok jam sedikit ya","What time is it?(Could you tell me the time, please)","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Sekarang pukul berapa minta tengok jam sedikit ya", "What time is it?(Could you tell me the time, please)", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hul-ka-ber-ra-pa gah","","Harga berapa","How much does this cost?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Harga berapa", "How much does this cost?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-see-nee-ter-ree-ma-gard-kray-dit-gah","","Di sini terima kad kridit kah?","Do you take credit cards?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Di sini terima kad kridit kah?", "Do you take credit cards?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ter-ree-ma-oon-took-mer-noo-gul-wang-","","Terima untuk menukar wang kah?","Can I change some money?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Terima untuk menukar wang kah?", "Can I change some money?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToCambodia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("joom-riab-sua","","Kumusta","Hello","ជ៓រាបសួរ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Kumusta", "Hello", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("a-roon-sua-sduai-baad / ja","","Selamat pagi","Good Morning Sir/Madame","អរុណសួស្តី បាទ/ចា ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Selamat pagi", "Good Morning Sir/Madame", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-yun-sua- sduai -baad / ja","","Selamat petang","Good Afternoon Sir/Madame.","សាយ័ណ្ណសួស្តី បាទ/ចា",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Selamat petang", "Good Afternoon Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ti-wia-sua- sduai -baad / ja","","Selamat petang","Good Evening Sir/Madame."," ទិវាសួស្តី បាទ/ចា",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Selamat petang", "Good Evening Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ria-truai-sua- sduai -baad / ja","","Selamat malam","Good Night Sir/Madame."," រាត្រីសួស្តី បាទ/ចា",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Selamat malam", "Good Night Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-chmuah…………….","","Nama saya……","My name is…."," ខ្ញុំឈ្មោះ........................",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Nama saya……", "My name is….", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("niah-chmuah-awuai-dae","","Siapakah nama anda","What is your name?"," អ្នកឈ្មោះអ្វីដែរ?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Siapakah nama anda", "What is your name?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("joh-loak-wuen-yang-merc-dae","","Apa khabar","How are you?"," ចុះលោកវិញ យ៉ាងម៉េចដែរ?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Apa khabar", "How are you?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("reek-riay-nah-dael-ban-skual","","Gembira dapat berkenalan dengan anda","Nice to meet you."," រីករាយណាស់ដែលបានស្គាល់",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Gembira dapat berkenalan dengan anda", "Nice to meet you.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-sok-sbai","","Khabar baik","I’m fine."," ខ្ញុំសុខសប្បាយ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Khabar baik", "I’m fine.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("lia-sern-huai","","Selamat tinggal","Good Bye."," លាសិនហើយ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Selamat tinggal", "Good Bye.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soam-merl-thae-riah-sa-khluan-phong- na","","Jaga diri baik-baik ya","Take care of yourself."," សូមមើលថែរក្សាខ្លួនផងហ្នា",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Jaga diri baik-baik ya", "Take care of yourself.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jum-juap-khnia-pel-groey-tiad","","jumpa lagi","See you again."," ចាំជួបគ្នាពេលក្រោយទៀត",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("jumpa lagi", "See you again.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("or-kun-baad / ja","","terima kasih","Thank you Sir/Madame."," អរគុណបាទ/ចា",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("terima kasih", "Thank you Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soam-toh-baad / ja","","Maafkan saya","Sorry Sir/Madame."," សូមទោសបាទ/ចា",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Maafkan saya", "Sorry Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("trerm-treuw","","ya","Yes."," ត្រឹមត្រូវ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ya", "Yes.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("muen-trerm-treuw-tay","","bukan","No."," មិនត្រឹមត្រូវទេ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("bukan", "No.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pra-god-nah","","sudah tentu","Of course"," ប្រាកដណាស់",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("sudah tentu", "Of course", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("muen-jbah-tay","","tidak tentu","I’m not sure"," មិនច្បាស់ទេ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("tidak tentu", "I’m not sure", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yual-srob","","setuju","Agree","យល់ស្រប",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("setuju", "Agree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("muen -yual-srob-tay","","tidak setuju","Disagree","មិនយល់ស្របទេ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("tidak setuju", "Disagree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pel-nih-moang-pon-marn (soam-mern-nia-leh-ka-bon-terd)","","Sekarang pukul berapa minta tengok jam sedikit ya","What time is it?(Could you tell me the time, please)","ពេលនេះ ម៉ោងប៉ុន្មាន? (សូមមើលនាឡិកាបន្តិច)",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Sekarang pukul berapa minta tengok jam sedikit ya", "What time is it?(Could you tell me the time, please)", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("thlay-pon-man","","Harga berapa","How much does this cost?","ថ្លៃប៉ុន្មាន?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Harga berapa", "How much does this cost?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nuew-tee-nih-toe-tual-yoak-gard-ern-tian-reu-tay","","Di sini terima kad kridit kah?","Do you take credit cards?","នៅទីនេះទទួលយកកាតឥណទានឬទេ?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Di sini terima kad kridit kah?", "Do you take credit cards?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toe-tual-dough-lui-reu-tay","","Terima untuk menukar wang kah?","Can I change some money?","ទទួលដូរលុយឬទេ?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Terima untuk menukar wang kah?", "Can I change some money?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToIndonesia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("Ha-lo","","Kumusta","Hello","Halo",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Kumusta", "Hello", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("seu-lar-mat-par-kee, bar-pak/ee-bu","","Selamat pagi","Good Morning Sir/Madame","Selamat pagi, Bapak/Ibu",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Selamat pagi", "Good Morning Sir/Madame", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("seu-lar-mat-see-yang, bar-pak/ee-bu","","Selamat petang","Good Afternoon Sir/Madame.","Selamat siang, Bapak/Ibu",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Selamat petang", "Good Afternoon Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("seu-lar-mat-sor-re- bar-pak/ee-bu","","Selamat petang","Good Evening Sir/Madame.","Selamat sore, Bapak/Ibu",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Selamat petang", "Good Evening Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("seu-lar-mat-mar-lam, bar-pak/ee-bu","","Selamat malam","Good Night Sir/Madame.","Selamat malam, Bapak/Ibu ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Selamat malam", "Good Night Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-mar-sar-yar","","Nama saya……","My name is….","Nama saya …….",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Nama saya……", "My name is….", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("see-yar-par-nar-mar-an-dar","","Siapakah nama anda","What is your name?","Siapa nama anda ?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Siapakah nama anda", "What is your name?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ar-par-kar-bar","","Apa khabar","How are you?","Apa kabar ?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Apa khabar", "How are you?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("seu-nang-ber-teu-mu-der-ngan-an-dar","","Gembira dapat berkenalan dengan anda","Nice to meet you.","Senang bertemu dengan anda",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Gembira dapat berkenalan dengan anda", "Nice to meet you.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-bar-ik-bar-ik-sar-jar","","Khabar baik","I’m fine.","Saya baik-baik saja.",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Khabar baik", "I’m fine.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("seu-lar-mat-jar-lan  seu-lar-mat-ting-gal","","Selamat tinggal","Good Bye.","Selamat jalan (for the person who stays)  Selamat tinggal (for the person who goes away)",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Selamat tinggal", "Good Bye.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jar-gar-lah-dee-ree-an-dar-bar-ik-bar-ik","","Jaga diri baik-baik ya","Take care of yourself.","Jagalah diri anda baik-baik",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Jaga diri baik-baik ya", "Take care of yourself.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sam-pai-ber-teu-mu-lar-kee","","jumpa lagi","See you again.","Sampai bertemu lagi",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("jumpa lagi", "See you again.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ter-ree-mar-gar-sih, bar-pak/ee-bu","","terima kasih","Thank you Sir/Madame.","Terima kasih, Bapak/Ibu",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("terima kasih", "Thank you Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mar-af, bar-pak/ee-bu","","Maafkan saya","Sorry Sir/Madame.","Maaf, Bapak/Ibu",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Maafkan saya", "Sorry Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yar","","ya","Yes.","Ya",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ya", "Yes.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tee-dak","","bukan","No.","Tidak",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("bukan", "No.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("teun-tu-sar-jar","","sudah tentu","Of course","Tentu saja",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("sudah tentu", "Of course", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tee-dak-teun-tu","","tidak tentu","I’m not sure","Tidak tentu",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("tidak tentu", "I’m not sure", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("seu-tu-ju","","setuju","Agree","Setuju",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("setuju", "Agree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tee-dak-seu-tu-ju","","tidak setuju","Disagree","Tidak setuju",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("tidak setuju", "Disagree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("seu-gar-rang-jam-beu-rar-par","","Sekarang pukul berapa minta tengok jam sedikit ya","What time is it?(Could you tell me the time, please)","Sekarang jam berapa?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Sekarang pukul berapa minta tengok jam sedikit ya", "What time is it?(Could you tell me the time, please)", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("beu-rar-par-har-kar-yar","","Harga berapa","How much does this cost?","Berapa harganya?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Harga berapa", "How much does this cost?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ar-pak-gah-meu-ner-ree-mar-kar-tu-krey-dit","","Di sini terima kad kridit kah?","Do you take credit cards?","Apakah menerima kartu kredit?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Di sini terima kad kridit kah?", "Do you take credit cards?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ar-par-bee-sar-tu-gar-u-wang","","Terima untuk menukar wang kah?","Can I change some money?","Apa bisa tukar uang?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Terima untuk menukar wang kah?", "Can I change some money?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToLaos(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("sa-bai-dee","","Kumusta","Hello"," ສະບາຍດີ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Kumusta", "Hello", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" sa-bai-dee-torn-chaw","","Selamat pagi","Good Morning Sir/Madame"," ສະບາຍດີຕອນເຊົ້າ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Selamat pagi", "Good Morning Sir/Madame", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" sa-bai-dee-torn-thiang","","Selamat petang","Good Afternoon Sir/Madame."," ສະບາຍດີຕອນທ່ຽງ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Selamat petang", "Good Afternoon Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" sa-bai-dee-torn-laeng","","Selamat petang","Good Evening Sir/Madame."," ສະບາຍດີຕອນແລງ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Selamat petang", "Good Evening Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" sa-bai-dee-torn-gang-keun","","Selamat malam","Good Night Sir/Madame."," ສະບາຍດີຕອນກາງຄືນ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Selamat malam", "Good Night Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" khoy-seu……….","","Nama saya……","My name is…."," ຂ້ອຍຊື່…………",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Nama saya……", "My name is….", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" jao-seu-yung","","Siapakah nama anda","What is your name?"," ເຈົ້າຊື່ຫຍັງ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Siapakah nama anda", "What is your name?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" jao-pen-jung-dai","","Apa khabar","How are you?"," ເຈົ້າເປັນຈັງໃດ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Apa khabar", "How are you?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" yin-dee-thee-dai-hoo-jak","","Gembira dapat berkenalan dengan anda","Nice to meet you."," ຍິນດີທີ່ໄດ້ຮູ້ຈັກ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Gembira dapat berkenalan dengan anda", "Nice to meet you.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" khoy-sa-bai-dee","","Khabar baik","I’m fine."," ຂ້ອຍສະບາຍດີ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Khabar baik", "I’m fine.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" la-korn","","Selamat tinggal","Good Bye."," ລາກ່ອນ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Selamat tinggal", "Good Bye.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" berng-yaeng-toe-eng-dae-der","","Jaga diri baik-baik ya","Take care of yourself."," ເບິ່ງແຍງໂຕເອງແດ່ເດີ້",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Jaga diri baik-baik ya", "Take care of yourself.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" laew-phop-gun","","jumpa lagi","See you again."," ແລ້ວພົບກັນ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("jumpa lagi", "See you again.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" khob-jai","","terima kasih","Thank you Sir/Madame."," ຂອບໃຈ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("terima kasih", "Thank you Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" khor-tote","","Maafkan saya","Sorry Sir/Madame."," ຂໍໂທດ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Maafkan saya", "Sorry Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" man","","ya","Yes."," ແມ່ນ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ya", "Yes.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" bor-man","","bukan","No."," ບໍ່ແມ່ນ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("bukan", "No.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" nae-norn","","sudah tentu","Of course"," ແນ່ນອນ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("sudah tentu", "Of course", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" bor-nae-norn","","tidak tentu","I’m not sure"," ບໍ່ແນ່ນອນ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("tidak tentu", "I’m not sure", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" hen-num","","setuju","Agree"," ເຫັນນຳ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("setuju", "Agree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" bor-hen-num","","tidak setuju","Disagree"," ບໍ່ເຫັນນຳ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("tidak setuju", "Disagree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" torn-nee-pen-way-lar-thao-dai (khor-berng-mong-dae)","","Sekarang pukul berapa minta tengok jam sedikit ya","What time is it?(Could you tell me the time, please)"," ຕອນນີ້ເປັນເວລາເທົ່າໃດ (ຂໍເບິ່ງໂມງແດ່)",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Sekarang pukul berapa minta tengok jam sedikit ya", "What time is it? (Could you tell me the time, please)", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("la-kha-thao-dai","","Harga berapa","How much does this cost?"," ລາຄາເທົ່າໃດ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Harga berapa", "How much does this cost?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bom-nee-hub-but-kray-dit-bor","","Di sini terima kad kridit kah?","Do you take credit cards?"," ບ່ອນນີ້ຮັບບັດເຄຣດິດບໍ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Di sini terima kad kridit kah?", "Do you take credit cards?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hub-lag-pian-ngern-bor","","Terima untuk menukar wang kah?","Can I change some money?"," ຮັບແລກປ່ຽນເງິນບໍ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Terima untuk menukar wang kah?", "Can I change some money?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToMalaysia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("gu-moos-tar","","Kumusta","Hello","Kumusta",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Kumusta", "Hello", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ser-la-mud-pa-kee","","Selamat pagi","Good Morning Sir/Madame","Selamat pagi",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Selamat pagi", "Good Morning Sir/Madame", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ser-la-mud-per-tung","","Selamat petang","Good Afternoon Sir/Madame.","Selamat petang",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Selamat petang", "Good Afternoon Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ser-la-mud-per-tung","","Selamat petang","Good Evening Sir/Madame.","Selamat petang",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Selamat petang", "Good Evening Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ser-la-mud-ma-lum","","Selamat malam","Good Night Sir/Madame.","Selamat malam",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Selamat malam", "Good Night Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("na-ma-sa-ya","","Nama saya……","My name is….","Nama saya……",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Nama saya……", "My name is….", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("see-ya-pa-gah-na-ma-un-da","","Siapakah nama anda","What is your name?","Siapakah nama anda",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Siapakah nama anda", "What is your name?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ar-pa-ka-bul","","Apa khabar","How are you?","Apa khabar",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Apa khabar", "How are you?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("koem-bee-ra-da-pud-burn-gur-na-lun- der-ngun-un-da","","Gembira dapat berkenalan dengan anda","Nice to meet you.","Gembira dapat berkenalan dengan anda",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Gembira dapat berkenalan dengan anda", "Nice to meet you.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ka-bul-baik","","Khabar baik","I’m fine.","Khabar baik",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Khabar baik", "I’m fine.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ser-la-mud-ting-kul","","Selamat tinggal","Good Bye.","Selamat tinggal",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Selamat tinggal", "Good Bye.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ya-ka-dee-ree-baik-baik-ya","","Jaga diri baik-baik ya","Take care of yourself.","Jaga diri baik-baik ya",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Jaga diri baik-baik ya", "Take care of yourself.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yoom-pa-la-kee","","jumpa lagi","See you again.","jumpa lagi",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("jumpa lagi", "See you again.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ter-ree-ma-ga-seh","","terima kasih","Thank you Sir/Madame.","terima kasih",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("terima kasih", "Thank you Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ma-af-gun-sa-ya","","Maafkan saya","Sorry Sir/Madame.","Maafkan saya",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Maafkan saya", "Sorry Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ya","","ya","Yes.","ya",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ya", "Yes.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("boo-gun","","bukan","No.","bukan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("bukan", "No.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soo-da-tern-too","","sudah tentu","Of course","sudah tentu",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("sudah tentu", "Of course", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tee-duk-tern-too","","tidak tentu","I’m not sure","tidak tentu",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("tidak tentu", "I’m not sure", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ser-too-yoo","","setuju","Agree","setuju",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("setuju", "Agree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tee-duk-ser-too-yoo","","tidak setuju","Disagree","tidak setuju",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("tidak setuju", "Disagree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ser-ga-rung-poo-goon-ber-ra-pa-min-ta-tay-ngoak-yum-ser-dee-kit-ya","","Sekarang pukul berapa minta tengok jam sedikit ya","What time is it?(Could you tell me the time, please)","Sekarang pukul berapa minta tengok jam sedikit ya",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Sekarang pukul berapa minta tengok jam sedikit ya", "What time is it?(Could you tell me the time, please)", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hul-ka-ber-ra-pa gah","","Harga berapa","How much does this cost?","Harga berapa",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Harga berapa", "How much does this cost?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-see-nee-ter-ree-ma-gard-kray-dit-gah","","Di sini terima kad kridit kah?","Do you take credit cards?","Di sini terima kad kridit kah?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Di sini terima kad kridit kah?", "Do you take credit cards?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ter-ree-ma-oon-took-mer-noo-gul-wang-","","Terima untuk menukar wang kah?","Can I change some money?","Terima untuk menukar wang kah?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Terima untuk menukar wang kah?", "Can I change some money?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToMyanmar(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ming-ga-la-ba","","Kumusta","Hello","မဂ๎လာပါ။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Kumusta", "Hello", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ming-ga-la-ma-naeh-kheen-ba-kha- mia/sheen","","Selamat pagi","Good Morning Sir/Madame","မဂ๎လာမနက္ခင္းပါ ခင္ဗ်ာ∕ရွင္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Selamat pagi", "Good Morning Sir/Madame", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ming-ga-la-neh-kheen-ba-kha-mia/sheen","","Selamat petang","Good Afternoon Sir/Madame.","မဂ๎လာေန႔ခင္းပါ ခင္ဗ်ာ∕ရွင္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Selamat petang", "Good Afternoon Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ming-ga-la-nya-ne-kheen ba-kha- mia/sheen","","Selamat petang","Good Evening Sir/Madame.","မဂ๎လာညေနခင္းပါ ခင္ဗ်ာ∕ရွင္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Selamat petang", "Good Evening Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("good-night.","","Selamat malam","Good Night Sir/Madame.","ဂြတ္ႏိုက္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Selamat malam", "Good Night Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma  na-mae …..ba","","Nama saya……","My name is….","ကြ်န္ေတာ္⁄ကြ်န္မ နာမည္........ ပါ။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Nama saya……", "My name is….", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kha-mia/sheen-na-mae-bae- loe-khor- ta-lae","","Siapakah nama anda","What is your name?","ခင္ဗ်ား∕ရွင္ နာမည္ဘယ္လိုေခၚသလဲ။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Siapakah nama anda", "What is your name?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kha-mia/sheen-ne-kaw-la","","Apa khabar","How are you?","ခင္ဗ်ား∕ရွင္ ေနေကာင္းလား။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Apa khabar", "How are you?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("twe-ya-da-wan-ta-ba-dae","","Gembira dapat berkenalan dengan anda","Nice to meet you.","ေတြ႕ရတာဝမ္းပါတယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Gembira dapat berkenalan dengan anda", "Nice to meet you.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma  ne-kaw- ba -dae","","Khabar baik","I’m fine.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Khabar baik", "I’m fine.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("twa-doh-mae ","","Selamat tinggal","Good Bye.","ကြ်န္ေတာ္⁄ကြ်န္မ ေနေကာင္းပါတယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Selamat tinggal", "Good Bye.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("koh-koe-koe-ga-yuh-sai-ba","","Jaga diri baik-baik ya","Take care of yourself.","သြားေတာ့မယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Jaga diri baik-baik ya", "Take care of yourself.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nao-ta-kha-twe-ba-ya-se","","jumpa lagi","See you again.","ကိုယ့္ကိုယ္ဂရုစိုက္ပါ။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("jumpa lagi", "See you again.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("je-zoo-tin-ba-dae-kha-mia/sheen","","terima kasih","Thank you Sir/Madame.","ေနာက္တစ္ခါေတြ႕ပါရေစ။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("terima kasih", "Thank you Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("taw-man-ba-dae-kha-mia/sheen","","Maafkan saya","Sorry Sir/Madame.","ေက်းဇူးတင္ပါတယ္ ခင္ဗ်ာ⁄ရွင္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Maafkan saya", "Sorry Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hoh-tae ","","ya","Yes.","ဟုတ္တယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ya", "Yes.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ma-hoh-phoo","","bukan","No.","မဟုတ္ဘူး။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("bukan", "No.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("te-ja-dae","","sudah tentu","Of course","ေသခ်ာတယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("sudah tentu", "Of course", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ma-te-ja-boo","","tidak tentu","I’m not sure","မေသခ်ာဘူး။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("tidak tentu", "I’m not sure", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ta-bor-too-dae","","setuju","Agree","သေဘာတူတယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("setuju", "Agree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ta-bor-ma-too-boo","","tidak setuju","Disagree","သေဘာမတူဘူး။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("tidak setuju", "Disagree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("a-khuh-bae-a-cheng-shi- bee-lae(na-yee-khah-nah-ji-ba)","","Sekarang pukul berapa minta tengok jam sedikit ya","What time is it?(Could you tell me the time, please)","အခုဘယ္အခ်ိန္ရွိၿပီလဲ။ (နာရီခဏၾကည့္ပါ။)",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Sekarang pukul berapa minta tengok jam sedikit ya", "What time is it? (Could you tell me the time, please)", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sc-bae-lao-lae","","Harga berapa","How much does this cost?","ေစ်းဘယ္ေလာက္လဲ။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Harga berapa", "How much does this cost?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("a-jwe-wae-khwin-kat- tong-loh-ya- la","","Di sini terima kad kridit kah?","Do you take credit cards?","အေႂကြးဝယ္ခြင့္ကဒ္သံုးလို႔ရလား။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Di sini terima kad kridit kah?", "Do you take credit cards?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ngwe-lae-loh-ya-la","","Terima untuk menukar wang kah?","Can I change some money?","ေငြလဲလို႔ရလား။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Terima untuk menukar wang kah?", "Can I change some money?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToPhilippines() {
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("gu-moos-tar", "", "Kumusta", "Hello", "Kumusta", null, null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Kumusta", "Hello", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mar-gan-dang-u-mar-gar", "", "Selamat pagi", "Good Morning Sir/Madame", "Magandang umaga", null, null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Selamat pagi", "Good Morning Sir/Madame", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mar-gan-dang-tang-har-lee", "", "Selamat petang", "Good Afternoon Sir/Madame.", "Magandang tanghali", null, null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Selamat petang", "Good Afternoon Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mar-gan-dang-gar-bi", "", "Selamat petang", "Good Evening Sir/Madame.", "Mangandang gabi", null, null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Selamat petang", "Good Evening Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mar-gan-dang-gar-bi", "", "Selamat malam", "Good Night Sir/Madame.", "Mangandang gabi", null, null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Selamat malam", "Good Night Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ang-par-ngar-lan-go-ai", "", "Nama saya……", "My name is….", "Ang pangalan ko ay…", null, null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Nama saya……", "My name is….", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ar-nong-par-ngar-lan-mo", "", "Siapakah nama anda", "What is your name?", "Anong pangalan mo?", null, null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Siapakah nama anda", "What is your name?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gu-moos-tar-gar", "", "Apa khabar", "How are you?", "Kumusta ka?", null, null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Apa khabar", "How are you?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-tu-tu-war-ar-gong-mar-gi-lar-lar-gar", "", "Gembira dapat berkenalan dengan anda", "Nice to meet you.", "Natutuwa akong makilala ka.", null, null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Gembira dapat berkenalan dengan anda", "Nice to meet you.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mar-bu-ti", "", "Khabar baik", "I’m fine.", "Mabuti", null, null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Khabar baik", "I’m fine.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("par-ar-lam", "", "Selamat tinggal", "Good Bye.", "Paalam", null, null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Selamat tinggal", "Good Bye.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ee-ngat", "", "Jaga diri baik-baik ya", "Take care of yourself.", "Ingat ", null, null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Jaga diri baik-baik ya", "Take care of yourself.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hang-gang-sar-su-sus-not", "", "jumpa lagi", "See you again.", "Hanggang sa susunod", null, null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("jumpa lagi", "See you again.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-lar-mat", "", "terima kasih", "Thank you Sir/Madame.", "Salamat", null, null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("terima kasih", "Thank you Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mar-ar-bar-lar", "", "Maafkan saya", "Sorry Sir/Madame.", "Maabala", null, null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Maafkan saya", "Sorry Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("o-o", "", "ya", "Yes.", "Oo", null, null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ya", "Yes.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hin-di", "", "bukan", "No.", "Hindi", null, null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("bukan", "No.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("si-gu-rar-do", "", "sudah tentu", "Of course", "Sigurado", null, null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("sudah tentu", "Of course", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hin-di-ar-go-si-gu-rar-do", "", "tidak tentu", "I’m not sure", "Hindi ako sigurado", null, null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("tidak tentu", "I’m not sure", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("su-mar-sang-ar-yorn-ar-go", "", "setuju", "Agree", "Sumasang-ayon ako", null, null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("setuju", "Agree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hin-di-ar-go-su-mar-sang-ar-yorn", "", "tidak setuju", "Disagree", "Hindi ako sumasang-ayon", null, null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("tidak setuju", "Disagree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ar-nong-o-ras-nar", "", "Sekarang pukul berapa minta tengok jam sedikit ya", "What time is it?                                          (Could you tell me the time, please)                                       ", "Anong oras na?", null, null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Sekarang pukul berapa minta tengok jam sedikit ya", "What time is it?                                          (Could you tell me the time, please)                                       ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mak-gar-no", "", "Harga berapa", "How much does this cost?", "Magkano?", null, null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Harga berapa", "How much does this cost?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ti-nar-tang-gap-bar-ang-krey-dit-kard-di-to", "", "Di sini terima kad kridit kah?", "Do you take credit cards?", "Tinatanggap ba ang credit card dito", null, null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Di sini terima kad kridit kah?", "Do you take credit cards?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mey-ron-bar-di-tong-man-nee-ex-chench", "", "Terima untuk menukar wang kah?", "Can I change some money?", "Meron ba ditong money exchange", null, null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Terima untuk menukar wang kah?", "Can I change some money?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToSingapore(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("hel-lo","","Kumusta","Hello","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Kumusta", "Hello", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("good –mor-ning- ser/mar-darm","","Selamat pagi","Good Morning Sir/Madame","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Selamat pagi", "Good Morning Sir/Madame", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("good-af-ter-noon  ser/mar-darm","","Selamat petang","Good Afternoon Sir/Madame.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Selamat petang", "Good Afternoon Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("good- if-ning- ser/mar-darm","","Selamat petang","Good Evening Sir/Madame.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Selamat petang", "Good Evening Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("good- night- ser/mar-darm","","Selamat malam","Good Night Sir/Madame.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Selamat malam", "Good Night Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mai- nem- is","","Nama saya……","My name is….","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Nama saya……", "My name is….", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wot-is-yua-nem","","Siapakah nama anda","What is your name?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Siapakah nama anda", "What is your name?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hao-ar- yu","","Apa khabar","How are you?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Apa khabar", "How are you?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nice-tu-meet-yu","","Gembira dapat berkenalan dengan anda","Nice to meet you.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Gembira dapat berkenalan dengan anda", "Nice to meet you.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai  am fai","","Khabar baik","I’m fine.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Khabar baik", "I’m fine.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("good-bai","","Selamat tinggal","Good Bye.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Selamat tinggal", "Good Bye.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tek-kare-of-yua-self","","Jaga diri baik-baik ya","Take care of yourself.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Jaga diri baik-baik ya", "Take care of yourself.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("see-yu-a-gen","","jumpa lagi","See you again.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("jumpa lagi", "See you again.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tank-kio – ser/mar-darm","","terima kasih","Thank you Sir/Madame.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("terima kasih", "Thank you Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sor-ree- ser/mar-darm","","Maafkan saya","Sorry Sir/Madame.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Maafkan saya", "Sorry Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yes","","ya","Yes.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ya", "Yes.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("no","","bukan","No.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("bukan", "No.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("of-cos","","sudah tentu","Of course","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("sudah tentu", "Of course", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai  am not  chua","","tidak tentu","I’m not sure","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("tidak tentu", "I’m not sure", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("a-gree","","setuju","Agree","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("setuju", "Agree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dis-a-gree","","tidak setuju","Disagree","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("tidak setuju", "Disagree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wot-time-is-it (kood-yu-tel-mee-der-time-plees)","","Sekarang pukul berapa minta tengok jam sedikit ya","What time is it?(Could you tell me the time, please)","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Sekarang pukul berapa minta tengok jam sedikit ya", "What time is it?(Could you tell me the time, please)", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hao-mach-das-dis-cos","","Harga berapa","How much does this cost?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Harga berapa", "How much does this cost?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("du- yu-tek-crey-dit-kard","","Di sini terima kad kridit kah?","Do you take credit cards?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Di sini terima kad kridit kah?", "Do you take credit cards?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kan-ai-chench-sam-man-nee","","Terima untuk menukar wang kah?","Can I change some money?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Terima untuk menukar wang kah?", "Can I change some money?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToVietnam(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("sin-jao","","Kumusta","Hello","xin chào",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Kumusta", "Hello", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sin-jao","","Selamat pagi","Good Morning Sir/Madame","xin chào",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Selamat pagi", "Good Morning Sir/Madame", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sin-jao","","Selamat petang","Good Afternoon Sir/Madame.","xin chào",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Selamat petang", "Good Afternoon Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sin-jao","","Selamat petang","Good Evening Sir/Madame.","xin chào",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Selamat petang", "Good Evening Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sin-jao","","Selamat malam","Good Night Sir/Madame.","xin chào",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Selamat malam", "Good Night Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-ten………….","","Nama saya……","My name is….","tôi tên  ..............",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Nama saya……", "My name is….", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ten-ban-la-yee","","Siapakah nama anda","What is your name?","tên bạn là gì?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Siapakah nama anda", "What is your name?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ban-the-nao","","Apa khabar","How are you?","bạn thế nào?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Apa khabar", "How are you?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("rert-wui-deuak-kab-ban","","Gembira dapat berkenalan dengan anda","Nice to meet you.","rất vui được gặp bạn",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Gembira dapat berkenalan dengan anda", "Nice to meet you.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-kwae","","Khabar baik","I’m fine.","tôi khỏe",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Khabar baik", "I’m fine.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tam-biat","","Selamat tinggal","Good Bye.","tạm biệt",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Selamat tinggal", "Good Bye.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yew-yin-seuk-kwae-yaeh","","Jaga diri baik-baik ya","Take care of yourself.","giữ gìn sức khỏe nhé",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Jaga diri baik-baik ya", "Take care of yourself.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("haen-kab-lai","","jumpa lagi","See you again.","hẹn gặp lại",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("jumpa lagi", "See you again.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sin-kam-earn","","terima kasih","Thank you Sir/Madame.","xin cám ơn",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("terima kasih", "Thank you Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sin-loi","","Maafkan saya","Sorry Sir/Madame.","xin lỗi",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Maafkan saya", "Sorry Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Fai","","ya","Yes.","phải",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ya", "Yes.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Khong-fai","","bukan","No.","không phải",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("bukan", "No.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jug-jun","","sudah tentu","Of course","chắc chắn",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("sudah tentu", "Of course", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Khong-jug","","tidak tentu","I’m not sure","không chắc",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("tidak tentu", "I’m not sure", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dong-ee","","setuju","Agree","đồng ý",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("setuju", "Agree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Khong-dong-ee","","tidak setuju","Disagree","không đồng ý",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("tidak setuju", "Disagree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("day-sam-dong-ho-koy-buai-yer-laa-muai-yer","","Sekarang pukul berapa minta tengok jam sedikit ya","What time is it? (Could you tell me the time, please)","để xem đồng hồ coi bây giờ (là mấy giờ)",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Sekarang pukul berapa minta tengok jam sedikit ya", "What time is it?(Could you tell me the time, please)", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ya-bao-yeaw","","Harga berapa","How much does this cost?","giá bao nhiêu",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Harga berapa", "How much does this cost?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("eer-duai-kor-yern-thae-tin-yoong-khong","","Di sini terima kad kridit kah?","Do you take credit cards?","ở đây có nhận thẻ tín dụng không?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Di sini terima kad kridit kah?", "Do you take credit cards?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kor-yern-doi-tien-khong","","Terima untuk menukar wang kah?","Can I change some money?","có nhận đổi tiền không?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Terima untuk menukar wang kah?", "Can I change some money?", childList);
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
        Child child = new Child("sawasdee","","ជ៓រាបសួរ","Hello","สวัสดี",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("ជ៓រាបសួរ", "Hello", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sawasdee-torn-chao-(khrap/kha)","","អរុណសួស្តី បាទ/ចា ","Good Morning Sir/Madame","สวัสดีตอนเช้าครับ/ค่ะ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("អរុណសួស្តី បាទ/ចា ", "Good Morning Sir/Madame", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sawasdee-torn-bai-(khrap/kha)","","សាយ័ណ្ណសួស្តី បាទ/ចា","Good Afternoon Sir/Madame.","สวัสดีตอนบ่ายครับ/ค่ะ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("សាយ័ណ្ណសួស្តី បាទ/ចា", "Good Afternoon Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sawasdee-torn-yen-(khrap/kha)",""," ទិវាសួស្តី បាទ/ចា","Good Evening Sir/Madame.","สวัสดีตอนเย็นครับ/ค่ะ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ទិវាសួស្តី បាទ/ចា", "Good Evening Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ra-tri-sawad-(khrap/kha)",""," រាត្រីសួស្តី បាទ/ចា","Good Night Sir/Madame.","ราตรีสวัสดิ์ครับ/ค่ะ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" រាត្រីសួស្តី បាទ/ចា", "Good Night Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-chue",""," ខ្ញុំឈ្មោះ........................","My name is….","ฉันชื่อ.....................",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំឈ្មោះ........................", "My name is….", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khun-chue-arai",""," អ្នកឈ្មោះអ្វីដែរ?","What is your name?","คุณชื่ออะไร",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកឈ្មោះអ្វីដែរ?", "What is your name?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khun-pen-yang-rai",""," ចុះលោកវិញ យ៉ាងម៉េចដែរ?","How are you?","คุณเป็นอย่างไร",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ចុះលោកវិញ យ៉ាងម៉េចដែរ?", "How are you?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yin-dee-tee-dai-ru-chak",""," រីករាយណាស់ដែលបានស្គាល់","Nice to meet you.","ยินดีที่ได้รู้จัก",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" រីករាយណាស់ដែលបានស្គាល់", "Nice to meet you.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-sabai-dee",""," ខ្ញុំសុខសប្បាយ","I’m fine.","ฉันสบายดี",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំសុខសប្បាយ", "I’m fine.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("la-kon",""," លាសិនហើយ","Good Bye.","ลาก่อน",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" លាសិនហើយ", "Good Bye.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("du-lae-tua-eng-duai-na",""," សូមមើលថែរក្សាខ្លួនផងហ្នា","Take care of yourself.","ดูแลตัวเองด้วยนะ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" សូមមើលថែរក្សាខ្លួនផងហ្នា", "Take care of yourself.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("laew-jer-gun",""," ចាំជួបគ្នាពេលក្រោយទៀត","See you again.","แล้วเจอกัน",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ចាំជួបគ្នាពេលក្រោយទៀត", "See you again.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("korb-khun-(khrap/kha)",""," អរគុណបាទ/ចា","Thank you Sir/Madame.","ขอบคุณครับ/ค่ะ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អរគុណបាទ/ចា", "Thank you Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kho-thot",""," សូមទោសបាទ/ចា","Sorry Sir/Madame.","ขอโทษครับ/ค่ะ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" សូមទោសបាទ/ចា", "Sorry Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chai",""," ត្រឹមត្រូវ","Yes.","ใช่",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ត្រឹមត្រូវ", "Yes.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mai-chai",""," មិនត្រឹមត្រូវទេ","No.","ไม่ใช่",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" មិនត្រឹមត្រូវទេ", "No.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nae-norn",""," ប្រាកដណាស់","Of course","แน่นอน",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ប្រាកដណាស់", "Of course", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mai-nae-norn",""," មិនច្បាស់ទេ","I’m not sure","ไม่แน่นอน",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" មិនច្បាស់ទេ", "I’m not sure", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hen-duai","","យល់ស្រប","Agree","เห็นด้วย",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("យល់ស្រប", "Agree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mai-hen-duai","","មិនយល់ស្របទេ","Disagree","ไม่เห็นด้วย",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("មិនយល់ស្របទេ", "Disagree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("torn-nee-pen-we-la-arai-kor-du-na-li-ka-noi","","ពេលនេះ ម៉ោងប៉ុន្មាន? (សូមមើលនាឡិកាបន្តិច)","What time is it? (Could you tell me the time, please)                                       ","ตอนนี้เป็นเวลาอะไร (ขอดูนาฬิกาหน่อย)",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ពេលនេះ ម៉ោងប៉ុន្មាន? (សូមមើលនាឡិកាបន្តិច)", "What time is it? (Could you tell me the time, please) ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("rakha-thao-rai","","ថ្លៃប៉ុន្មាន?","How much does this cost?","ราคาเท่าไร",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ថ្លៃប៉ុន្មាន?", "How much does this cost?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("thi-nee-rub-bud-credit-mai","","នៅទីនេះទទួលយកកាតឥណទានឬទេ?","Do you take credit cards?","ที่นี่รับบัตรเครดิตไหม",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("នៅទីនេះទទួលយកកាតឥណទានឬទេ?", "Do you take credit cards?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("rub-laek-ngoen-mai","","ទទួលដូរលុយឬទេ?","Can I change some money?","รับแลกเงินไหม",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ទទួលដូរលុយឬទេ?", "Can I change some money?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadCambodiaToBrunei(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("gu-moos-tar","","ជ៓រាបសួរ","Hello","Kumusta",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("ជ៓រាបសួរ", "Hello", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ser-la-mud-pa-kee","","អរុណសួស្តី បាទ/ចា ","Good Morning Sir/Madame","Selamat pagi",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("អរុណសួស្តី បាទ/ចា ", "Good Morning Sir/Madame", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ser-la-mud-per-tung","","សាយ័ណ្ណសួស្តី បាទ/ចា","Good Afternoon Sir/Madame.","Selamat petang",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("សាយ័ណ្ណសួស្តី បាទ/ចា", "Good Afternoon Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ser-la-mud-per-tung",""," ទិវាសួស្តី បាទ/ចា","Good Evening Sir/Madame.","Selamat petang",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ទិវាសួស្តី បាទ/ចា", "Good Evening Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ser-la-mud-ma-lum",""," រាត្រីសួស្តី បាទ/ចា","Good Night Sir/Madame.","Selamat malam",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" រាត្រីសួស្តី បាទ/ចា", "Good Night Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("na-ma-sa-ya",""," ខ្ញុំឈ្មោះ........................","My name is….","Nama saya……",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំឈ្មោះ........................", "My name is….", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("see-ya-pa-gah-na-ma-un-da",""," អ្នកឈ្មោះអ្វីដែរ?","What is your name?","Siapakah nama anda",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកឈ្មោះអ្វីដែរ?", "What is your name?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ar-pa-ka-bul",""," ចុះលោកវិញ យ៉ាងម៉េចដែរ?","How are you?","Apa khabar",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ចុះលោកវិញ យ៉ាងម៉េចដែរ?", "How are you?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("koem-bee-ra-da-pud-burn-gur-na-lun- der-ngun-un-da",""," រីករាយណាស់ដែលបានស្គាល់","Nice to meet you.","Gembira dapat berkenalan dengan anda",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" រីករាយណាស់ដែលបានស្គាល់", "Nice to meet you.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ka-bul-baik",""," ខ្ញុំសុខសប្បាយ","I’m fine.","Khabar baik",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំសុខសប្បាយ", "I’m fine.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ser-la-mud-ting-kul",""," លាសិនហើយ","Good Bye.","Selamat tinggal",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" លាសិនហើយ", "Good Bye.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ya-ka-dee-ree-baik-baik-ya",""," សូមមើលថែរក្សាខ្លួនផងហ្នា","Take care of yourself.","Jaga diri baik-baik ya",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" សូមមើលថែរក្សាខ្លួនផងហ្នា", "Take care of yourself.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yoom-pa-la-kee",""," ចាំជួបគ្នាពេលក្រោយទៀត","See you again.","jumpa lagi",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ចាំជួបគ្នាពេលក្រោយទៀត", "See you again.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ter-ree-ma-ga-seh",""," អរគុណបាទ/ចា","Thank you Sir/Madame.","terima kasih",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អរគុណបាទ/ចា", "Thank you Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ma-af-gun-sa-ya",""," សូមទោសបាទ/ចា","Sorry Sir/Madame.","Maafkan saya",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" សូមទោសបាទ/ចា", "Sorry Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ya",""," ត្រឹមត្រូវ","Yes.","ya",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ត្រឹមត្រូវ", "Yes.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("boo-gun",""," មិនត្រឹមត្រូវទេ","No.","bukan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" មិនត្រឹមត្រូវទេ", "No.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soo-da-tern-too",""," ប្រាកដណាស់","Of course","sudah tentu",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ប្រាកដណាស់", "Of course", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tee-duk-tern-too",""," មិនច្បាស់ទេ","I’m not sure","tidak tentu",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" មិនច្បាស់ទេ", "I’m not sure", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ser-too-yoo","","យល់ស្រប","Agree","setuju",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("យល់ស្រប", "Agree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tee-duk-ser-too-yoo","","មិនយល់ស្របទេ","Disagree","tidak setuju",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("មិនយល់ស្របទេ", "Disagree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ser-ga-rung-poo-goon-ber-ra-pa-min-ta-tay-ngoak-yum-ser-dee-kit-ya","","ពេលនេះ ម៉ោងប៉ុន្មាន? (សូមមើលនាឡិកាបន្តិច)","What time is it? (Could you tell me the time, please)","Sekarang pukul berapa minta tengok jam sedikit ya",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ពេលនេះ ម៉ោងប៉ុន្មាន? (សូមមើលនាឡិកាបន្តិច)", "What time is it? (Could you tell me the time, please)", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hul-ka-ber-ra-pa gah","","ថ្លៃប៉ុន្មាន?","How much does this cost?","Harga berapa",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ថ្លៃប៉ុន្មាន?", "How much does this cost?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-see-nee-ter-ree-ma-gard-kray-dit-gah","","នៅទីនេះទទួលយកកាតឥណទានឬទេ?","Do you take credit cards?","Di sini terima kad kridit kah?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("នៅទីនេះទទួលយកកាតឥណទានឬទេ?", "Do you take credit cards?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ter-ree-ma-oon-took-mer-noo-gul-wang-","","ទទួលដូរលុយឬទេ?","Can I change some money?","Terima untuk menukar wang kah?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ទទួលដូរលុយឬទេ?", "Can I change some money?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }
    public void loadCambodiaToCambodia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("joom-riab-sua","","ជ៓រាបសួរ","Hello","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("ជ៓រាបសួរ", "Hello", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("a-roon-sua-sduai-baad / ja","","អរុណសួស្តី បាទ/ចា ","Good Morning Sir/Madame","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("អរុណសួស្តី បាទ/ចា ", "Good Morning Sir/Madame", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-yun-sua- sduai -baad / ja","","សាយ័ណ្ណសួស្តី បាទ/ចា","Good Afternoon Sir/Madame.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("សាយ័ណ្ណសួស្តី បាទ/ចា", "Good Afternoon Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ti-wia-sua- sduai -baad / ja",""," ទិវាសួស្តី បាទ/ចា","Good Evening Sir/Madame.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ទិវាសួស្តី បាទ/ចា", "Good Evening Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ria-truai-sua- sduai -baad / ja",""," រាត្រីសួស្តី បាទ/ចា","Good Night Sir/Madame.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" រាត្រីសួស្តី បាទ/ចា", "Good Night Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-chmuah…………….",""," ខ្ញុំឈ្មោះ........................","My name is….","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំឈ្មោះ........................", "My name is….", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("niah-chmuah-awuai-dae",""," អ្នកឈ្មោះអ្វីដែរ?","What is your name?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកឈ្មោះអ្វីដែរ?", "What is your name?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("joh-loak-wuen-yang-merc-dae",""," ចុះលោកវិញ យ៉ាងម៉េចដែរ?","How are you?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ចុះលោកវិញ យ៉ាងម៉េចដែរ?", "How are you?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("reek-riay-nah-dael-ban-skual",""," រីករាយណាស់ដែលបានស្គាល់","Nice to meet you.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" រីករាយណាស់ដែលបានស្គាល់", "Nice to meet you.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-sok-sbai",""," ខ្ញុំសុខសប្បាយ","I’m fine.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំសុខសប្បាយ", "I’m fine.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("lia-sern-huai",""," លាសិនហើយ","Good Bye.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" លាសិនហើយ", "Good Bye.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soam-merl-thae-riah-sa-khluan-phong- na",""," សូមមើលថែរក្សាខ្លួនផងហ្នា","Take care of yourself.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" សូមមើលថែរក្សាខ្លួនផងហ្នា", "Take care of yourself.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jum-juap-khnia-pel-groey-tiad",""," ចាំជួបគ្នាពេលក្រោយទៀត","See you again.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ចាំជួបគ្នាពេលក្រោយទៀត", "See you again.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("or-kun-baad / ja",""," អរគុណបាទ/ចា","Thank you Sir/Madame.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អរគុណបាទ/ចា", "Thank you Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soam-toh-baad / ja",""," សូមទោសបាទ/ចា","Sorry Sir/Madame.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" សូមទោសបាទ/ចា", "Sorry Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("trerm-treuw",""," ត្រឹមត្រូវ","Yes.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ត្រឹមត្រូវ", "Yes.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("muen-trerm-treuw-tay",""," មិនត្រឹមត្រូវទេ","No.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" មិនត្រឹមត្រូវទេ", "No.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pra-god-nah",""," ប្រាកដណាស់","Of course","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ប្រាកដណាស់", "Of course", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("muen-jbah-tay",""," មិនច្បាស់ទេ","I’m not sure","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" មិនច្បាស់ទេ", "I’m not sure", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yual-srob","","យល់ស្រប","Agree","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("យល់ស្រប", "Agree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("muen -yual-srob-tay","","មិនយល់ស្របទេ","Disagree","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("មិនយល់ស្របទេ", "Disagree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pel-nih-moang-pon-marn (soam-mern-nia-leh-ka-bon-terd)","","ពេលនេះ ម៉ោងប៉ុន្មាន? (សូមមើលនាឡិកាបន្តិច)","What time is it? (Could you tell me the time, please)  ","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ពេលនេះ ម៉ោងប៉ុន្មាន? (សូមមើលនាឡិកាបន្តិច)", "What time is it?  (Could you tell me the time, please) ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("thlay-pon-man","","ថ្លៃប៉ុន្មាន?","How much does this cost?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ថ្លៃប៉ុន្មាន?", "How much does this cost?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nuew-tee-nih-toe-tual-yoak-gard-ern-tian-reu-tay","","នៅទីនេះទទួលយកកាតឥណទានឬទេ?","Do you take credit cards?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("នៅទីនេះទទួលយកកាតឥណទានឬទេ?", "Do you take credit cards?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toe-tual-dough-lui-reu-tay","","ទទួលដូរលុយឬទេ?","Can I change some money?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ទទួលដូរលុយឬទេ?", "Can I change some money?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }
    public void loadCambodiaToIndonesia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("Ha-lo","","ជ៓រាបសួរ","Hello","Halo",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("ជ៓រាបសួរ", "Hello", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("seu-lar-mat-par-kee, bar-pak/ee-bu","","អរុណសួស្តី បាទ/ចា ","Good Morning Sir/Madame","Selamat pagi, Bapak/Ibu",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("អរុណសួស្តី បាទ/ចា ", "Good Morning Sir/Madame", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("seu-lar-mat-see-yang, bar-pak/ee-bu","","សាយ័ណ្ណសួស្តី បាទ/ចា","Good Afternoon Sir/Madame.","Selamat siang, Bapak/Ibu",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("សាយ័ណ្ណសួស្តី បាទ/ចា", "Good Afternoon Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("seu-lar-mat-sor-re- bar-pak/ee-bu",""," ទិវាសួស្តី បាទ/ចា","Good Evening Sir/Madame.","Selamat sore, Bapak/Ibu",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ទិវាសួស្តី បាទ/ចា", "Good Evening Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("seu-lar-mat-mar-lam, bar-pak/ee-bu",""," រាត្រីសួស្តី បាទ/ចា","Good Night Sir/Madame.","Selamat malam, Bapak/Ibu ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" រាត្រីសួស្តី បាទ/ចា", "Good Night Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-mar-sar-yar",""," ខ្ញុំឈ្មោះ........................","My name is….","Nama saya …….",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំឈ្មោះ........................", "My name is….", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("see-yar-par-nar-mar-an-dar",""," អ្នកឈ្មោះអ្វីដែរ?","What is your name?","Siapa nama anda ?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកឈ្មោះអ្វីដែរ?", "What is your name?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ar-par-kar-bar",""," ចុះលោកវិញ យ៉ាងម៉េចដែរ?","How are you?","Apa kabar ?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ចុះលោកវិញ យ៉ាងម៉េចដែរ?", "How are you?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("seu-nang-ber-teu-mu-der-ngan-an-dar",""," រីករាយណាស់ដែលបានស្គាល់","Nice to meet you.","Senang bertemu dengan anda",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" រីករាយណាស់ដែលបានស្គាល់", "Nice to meet you.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-bar-ik-bar-ik-sar-jar",""," ខ្ញុំសុខសប្បាយ","I’m fine.","Saya baik-baik saja.",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំសុខសប្បាយ", "I’m fine.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("seu-lar-mat-jar-lan  seu-lar-mat-ting-gal",""," លាសិនហើយ","Good Bye.","Selamat jalan (for the person who stays)  Selamat tinggal (for the person who goes away)",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" លាសិនហើយ", "Good Bye.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jar-gar-lah-dee-ree-an-dar-bar-ik-bar-ik",""," សូមមើលថែរក្សាខ្លួនផងហ្នា","Take care of yourself.","Jagalah diri anda baik-baik",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" សូមមើលថែរក្សាខ្លួនផងហ្នា", "Take care of yourself.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sam-pai-ber-teu-mu-lar-kee",""," ចាំជួបគ្នាពេលក្រោយទៀត","See you again.","Sampai bertemu lagi",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ចាំជួបគ្នាពេលក្រោយទៀត", "See you again.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ter-ree-mar-gar-sih, bar-pak/ee-bu",""," អរគុណបាទ/ចា","Thank you Sir/Madame.","Terima kasih, Bapak/Ibu",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អរគុណបាទ/ចា", "Thank you Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mar-af, bar-pak/ee-bu",""," សូមទោសបាទ/ចា","Sorry Sir/Madame.","Maaf, Bapak/Ibu",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" សូមទោសបាទ/ចា", "Sorry Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yar",""," ត្រឹមត្រូវ","Yes.","Ya",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ត្រឹមត្រូវ", "Yes.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tee-dak",""," មិនត្រឹមត្រូវទេ","No.","Tidak",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" មិនត្រឹមត្រូវទេ", "No.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("teun-tu-sar-jar",""," ប្រាកដណាស់","Of course","Tentu saja",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ប្រាកដណាស់", "Of course", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tee-dak-teun-tu",""," មិនច្បាស់ទេ","I’m not sure","Tidak tentu",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" មិនច្បាស់ទេ", "I’m not sure", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("seu-tu-ju","","យល់ស្រប","Agree","Setuju",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("យល់ស្រប", "Agree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tee-dak-seu-tu-ju","","មិនយល់ស្របទេ","Disagree","Tidak setuju",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("មិនយល់ស្របទេ", "Disagree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("seu-gar-rang-jam-beu-rar-par","","ពេលនេះ ម៉ោងប៉ុន្មាន? (សូមមើលនាឡិកាបន្តិច)","What time is it?                                          (Could you tell me the time, please)                                       ","Sekarang jam berapa?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ពេលនេះ ម៉ោងប៉ុន្មាន? (សូមមើលនាឡិកាបន្តិច)", "What time is it?                                          (Could you tell me the time, please)                                       ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("beu-rar-par-har-kar-yar","","ថ្លៃប៉ុន្មាន?","How much does this cost?","Berapa harganya?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ថ្លៃប៉ុន្មាន?", "How much does this cost?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ar-pak-gah-meu-ner-ree-mar-kar-tu-krey-dit","","នៅទីនេះទទួលយកកាតឥណទានឬទេ?","Do you take credit cards?","Apakah menerima kartu kredit?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("នៅទីនេះទទួលយកកាតឥណទានឬទេ?", "Do you take credit cards?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ar-par-bee-sar-tu-gar-u-wang","","ទទួលដូរលុយឬទេ?","Can I change some money?","Apa bisa tukar uang?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ទទួលដូរលុយឬទេ?", "Can I change some money?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadCambodiaToLaos(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("sa-bai-dee","","ជ៓រាបសួរ","Hello"," ສະບາຍດີ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("ជ៓រាបសួរ", "Hello", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" sa-bai-dee-torn-chaw","","អរុណសួស្តី បាទ/ចា ","Good Morning Sir/Madame"," ສະບາຍດີຕອນເຊົ້າ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("អរុណសួស្តី បាទ/ចា ", "Good Morning Sir/Madame", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" sa-bai-dee-torn-thiang","","សាយ័ណ្ណសួស្តី បាទ/ចា","Good Afternoon Sir/Madame."," ສະບາຍດີຕອນທ່ຽງ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("សាយ័ណ្ណសួស្តី បាទ/ចា", "Good Afternoon Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" sa-bai-dee-torn-laeng",""," ទិវាសួស្តី បាទ/ចា","Good Evening Sir/Madame."," ສະບາຍດີຕອນແລງ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ទិវាសួស្តី បាទ/ចា", "Good Evening Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" sa-bai-dee-torn-gang-keun",""," រាត្រីសួស្តី បាទ/ចា","Good Night Sir/Madame."," ສະບາຍດີຕອນກາງຄືນ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" រាត្រីសួស្តី បាទ/ចា", "Good Night Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" khoy-seu……….",""," ខ្ញុំឈ្មោះ........................","My name is…."," ຂ້ອຍຊື່…………",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំឈ្មោះ........................", "My name is….", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" jao-seu-yung",""," អ្នកឈ្មោះអ្វីដែរ?","What is your name?"," ເຈົ້າຊື່ຫຍັງ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកឈ្មោះអ្វីដែរ?", "What is your name?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" jao-pen-jung-dai",""," ចុះលោកវិញ យ៉ាងម៉េចដែរ?","How are you?"," ເຈົ້າເປັນຈັງໃດ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ចុះលោកវិញ យ៉ាងម៉េចដែរ?", "How are you?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" yin-dee-thee-dai-hoo-jak",""," រីករាយណាស់ដែលបានស្គាល់","Nice to meet you."," ຍິນດີທີ່ໄດ້ຮູ້ຈັກ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" រីករាយណាស់ដែលបានស្គាល់", "Nice to meet you.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" khoy-sa-bai-dee",""," ខ្ញុំសុខសប្បាយ","I’m fine."," ຂ້ອຍສະບາຍດີ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំសុខសប្បាយ", "I’m fine.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" la-korn",""," លាសិនហើយ","Good Bye."," ລາກ່ອນ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" លាសិនហើយ", "Good Bye.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" berng-yaeng-toe-eng-dae-der",""," សូមមើលថែរក្សាខ្លួនផងហ្នា","Take care of yourself."," ເບິ່ງແຍງໂຕເອງແດ່ເດີ້",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" សូមមើលថែរក្សាខ្លួនផងហ្នា", "Take care of yourself.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" laew-phop-gun",""," ចាំជួបគ្នាពេលក្រោយទៀត","See you again."," ແລ້ວພົບກັນ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ចាំជួបគ្នាពេលក្រោយទៀត", "See you again.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" khob-jai",""," អរគុណបាទ/ចា","Thank you Sir/Madame."," ຂອບໃຈ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អរគុណបាទ/ចា", "Thank you Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" khor-tote",""," សូមទោសបាទ/ចា","Sorry Sir/Madame."," ຂໍໂທດ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" សូមទោសបាទ/ចា", "Sorry Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" man",""," ត្រឹមត្រូវ","Yes."," ແມ່ນ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ត្រឹមត្រូវ", "Yes.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" bor-man",""," មិនត្រឹមត្រូវទេ","No."," ບໍ່ແມ່ນ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" មិនត្រឹមត្រូវទេ", "No.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" nae-norn",""," ប្រាកដណាស់","Of course"," ແນ່ນອນ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ប្រាកដណាស់", "Of course", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" bor-nae-norn",""," មិនច្បាស់ទេ","I’m not sure"," ບໍ່ແນ່ນອນ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" មិនច្បាស់ទេ", "I’m not sure", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" hen-num","","យល់ស្រប","Agree"," ເຫັນນຳ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("យល់ស្រប", "Agree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" bor-hen-num","","មិនយល់ស្របទេ","Disagree"," ບໍ່ເຫັນນຳ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("មិនយល់ស្របទេ", "Disagree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" torn-nee-pen-way-lar-thao-dai (khor-berng-mong-dae)","","ពេលនេះ ម៉ោងប៉ុន្មាន? (សូមមើលនាឡិកាបន្តិច)","What time is it?(Could you tell me the time, please) "," ຕອນນີ້ເປັນເວລາເທົ່າໃດ (ຂໍເບິ່ງໂມງແດ່)",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ពេលនេះ ម៉ោងប៉ុន្មាន? (សូមមើលនាឡិកាបន្តិច)", "What time is it?(Could you tell me the time, please) ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("la-kha-thao-dai","","ថ្លៃប៉ុន្មាន?","How much does this cost?"," ລາຄາເທົ່າໃດ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ថ្លៃប៉ុន្មាន?", "How much does this cost?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bom-nee-hub-but-kray-dit-bor","","នៅទីនេះទទួលយកកាតឥណទានឬទេ?","Do you take credit cards?"," ບ່ອນນີ້ຮັບບັດເຄຣດິດບໍ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("នៅទីនេះទទួលយកកាតឥណទានឬទេ?", "Do you take credit cards?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hub-lag-pian-ngern-bor","","ទទួលដូរលុយឬទេ?","Can I change some money?"," ຮັບແລກປ່ຽນເງິນບໍ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ទទួលដូរលុយឬទេ?", "Can I change some money?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadCambodiaToMalaysia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("gu-moos-tar","","ជ៓រាបសួរ","Hello","Kumusta",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("ជ៓រាបសួរ", "Hello", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ser-la-mud-pa-kee","","អរុណសួស្តី បាទ/ចា ","Good Morning Sir/Madame","Selamat pagi",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("អរុណសួស្តី បាទ/ចា ", "Good Morning Sir/Madame", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ser-la-mud-per-tung","","សាយ័ណ្ណសួស្តី បាទ/ចា","Good Afternoon Sir/Madame.","Selamat petang",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("សាយ័ណ្ណសួស្តី បាទ/ចា", "Good Afternoon Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ser-la-mud-per-tung",""," ទិវាសួស្តី បាទ/ចា","Good Evening Sir/Madame.","Selamat petang",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ទិវាសួស្តី បាទ/ចា", "Good Evening Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ser-la-mud-ma-lum",""," រាត្រីសួស្តី បាទ/ចា","Good Night Sir/Madame.","Selamat malam",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" រាត្រីសួស្តី បាទ/ចា", "Good Night Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("na-ma-sa-ya",""," ខ្ញុំឈ្មោះ........................","My name is….","Nama saya……",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំឈ្មោះ........................", "My name is….", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("see-ya-pa-gah-na-ma-un-da",""," អ្នកឈ្មោះអ្វីដែរ?","What is your name?","Siapakah nama anda",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកឈ្មោះអ្វីដែរ?", "What is your name?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ar-pa-ka-bul",""," ចុះលោកវិញ យ៉ាងម៉េចដែរ?","How are you?","Apa khabar",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ចុះលោកវិញ យ៉ាងម៉េចដែរ?", "How are you?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("koem-bee-ra-da-pud-burn-gur-na-lun- der-ngun-un-da",""," រីករាយណាស់ដែលបានស្គាល់","Nice to meet you.","Gembira dapat berkenalan dengan anda",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" រីករាយណាស់ដែលបានស្គាល់", "Nice to meet you.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ka-bul-baik",""," ខ្ញុំសុខសប្បាយ","I’m fine.","Khabar baik",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំសុខសប្បាយ", "I’m fine.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ser-la-mud-ting-kul",""," លាសិនហើយ","Good Bye.","Selamat tinggal",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" លាសិនហើយ", "Good Bye.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ya-ka-dee-ree-baik-baik-ya",""," សូមមើលថែរក្សាខ្លួនផងហ្នា","Take care of yourself.","Jaga diri baik-baik ya",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" សូមមើលថែរក្សាខ្លួនផងហ្នា", "Take care of yourself.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yoom-pa-la-kee",""," ចាំជួបគ្នាពេលក្រោយទៀត","See you again.","jumpa lagi",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ចាំជួបគ្នាពេលក្រោយទៀត", "See you again.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ter-ree-ma-ga-seh",""," អរគុណបាទ/ចា","Thank you Sir/Madame.","terima kasih",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អរគុណបាទ/ចា", "Thank you Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ma-af-gun-sa-ya",""," សូមទោសបាទ/ចា","Sorry Sir/Madame.","Maafkan saya",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" សូមទោសបាទ/ចា", "Sorry Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ya",""," ត្រឹមត្រូវ","Yes.","ya",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ត្រឹមត្រូវ", "Yes.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("boo-gun",""," មិនត្រឹមត្រូវទេ","No.","bukan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" មិនត្រឹមត្រូវទេ", "No.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soo-da-tern-too",""," ប្រាកដណាស់","Of course","sudah tentu",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ប្រាកដណាស់", "Of course", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tee-duk-tern-too",""," មិនច្បាស់ទេ","I’m not sure","tidak tentu",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" មិនច្បាស់ទេ", "I’m not sure", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ser-too-yoo","","យល់ស្រប","Agree","setuju",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("យល់ស្រប", "Agree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tee-duk-ser-too-yoo","","មិនយល់ស្របទេ","Disagree","tidak setuju",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("មិនយល់ស្របទេ", "Disagree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ser-ga-rung-poo-goon-ber-ra-pa-min-ta-tay-ngoak-yum-ser-dee-kit-ya","","ពេលនេះ ម៉ោងប៉ុន្មាន? (សូមមើលនាឡិកាបន្តិច)","What time is it?                                          (Could you tell me the time, please)                                       ","Sekarang pukul berapa minta tengok jam sedikit ya",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ពេលនេះ ម៉ោងប៉ុន្មាន? (សូមមើលនាឡិកាបន្តិច)", "What time is it?                                          (Could you tell me the time, please)                                       ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hul-ka-ber-ra-pa gah","","ថ្លៃប៉ុន្មាន?","How much does this cost?","Harga berapa",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ថ្លៃប៉ុន្មាន?", "How much does this cost?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-see-nee-ter-ree-ma-gard-kray-dit-gah","","នៅទីនេះទទួលយកកាតឥណទានឬទេ?","Do you take credit cards?","Di sini terima kad kridit kah?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("នៅទីនេះទទួលយកកាតឥណទានឬទេ?", "Do you take credit cards?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ter-ree-ma-oon-took-mer-noo-gul-wang-","","ទទួលដូរលុយឬទេ?","Can I change some money?","Terima untuk menukar wang kah?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ទទួលដូរលុយឬទេ?", "Can I change some money?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadCambodiaToMyanmar(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ming-ga-la-ba","","ជ៓រាបសួរ","Hello","မဂ๎လာပါ။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("ជ៓រាបសួរ", "Hello", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ming-ga-la-ma-naeh-kheen-ba-kha- mia/sheen","","អរុណសួស្តី បាទ/ចា ","Good Morning Sir/Madame","မဂ๎လာမနက္ခင္းပါ ခင္ဗ်ာ∕ရွင္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("អរុណសួស្តី បាទ/ចា ", "Good Morning Sir/Madame", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ming-ga-la-neh-kheen-ba-kha-mia/sheen","","សាយ័ណ្ណសួស្តី បាទ/ចា","Good Afternoon Sir/Madame.","မဂ๎လာေန႔ခင္းပါ ခင္ဗ်ာ∕ရွင္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("សាយ័ណ្ណសួស្តី បាទ/ចា", "Good Afternoon Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ming-ga-la-nya-ne-kheen ba-kha- mia/sheen",""," ទិវាសួស្តី បាទ/ចា","Good Evening Sir/Madame.","မဂ๎လာညေနခင္းပါ ခင္ဗ်ာ∕ရွင္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ទិវាសួស្តី បាទ/ចា", "Good Evening Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("good-night.",""," រាត្រីសួស្តី បាទ/ចា","Good Night Sir/Madame.","ဂြတ္ႏိုက္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" រាត្រីសួស្តី បាទ/ចា", "Good Night Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma  na-mae …..ba",""," ខ្ញុំឈ្មោះ........................","My name is….","ကြ်န္ေတာ္⁄ကြ်န္မ နာမည္........ ပါ။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំឈ្មោះ........................", "My name is….", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kha-mia/sheen-na-mae-bae- loe-khor- ta-lae",""," អ្នកឈ្មោះអ្វីដែរ?","What is your name?","ခင္ဗ်ား∕ရွင္ နာမည္ဘယ္လိုေခၚသလဲ။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកឈ្មោះអ្វីដែរ?", "What is your name?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kha-mia/sheen-ne-kaw-la",""," ចុះលោកវិញ យ៉ាងម៉េចដែរ?","How are you?","ခင္ဗ်ား∕ရွင္ ေနေကာင္းလား။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ចុះលោកវិញ យ៉ាងម៉េចដែរ?", "How are you?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("twe-ya-da-wan-ta-ba-dae",""," រីករាយណាស់ដែលបានស្គាល់","Nice to meet you.","ေတြ႕ရတာဝမ္းပါတယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" រីករាយណាស់ដែលបានស្គាល់", "Nice to meet you.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma  ne-kaw- ba -dae",""," ខ្ញុំសុខសប្បាយ","I’m fine.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំសុខសប្បាយ", "I’m fine.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("twa-doh-mae ",""," លាសិនហើយ","Good Bye.","ကြ်န္ေတာ္⁄ကြ်န္မ ေနေကာင္းပါတယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" លាសិនហើយ", "Good Bye.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("koh-koe-koe-ga-yuh-sai-ba",""," សូមមើលថែរក្សាខ្លួនផងហ្នា","Take care of yourself.","သြားေတာ့မယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" សូមមើលថែរក្សាខ្លួនផងហ្នា", "Take care of yourself.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nao-ta-kha-twe-ba-ya-se",""," ចាំជួបគ្នាពេលក្រោយទៀត","See you again.","ကိုယ့္ကိုယ္ဂရုစိုက္ပါ။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ចាំជួបគ្នាពេលក្រោយទៀត", "See you again.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("je-zoo-tin-ba-dae-kha-mia/sheen",""," អរគុណបាទ/ចា","Thank you Sir/Madame.","ေနာက္တစ္ခါေတြ႕ပါရေစ။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អរគុណបាទ/ចា", "Thank you Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("taw-man-ba-dae-kha-mia/sheen",""," សូមទោសបាទ/ចា","Sorry Sir/Madame.","ေက်းဇူးတင္ပါတယ္ ခင္ဗ်ာ⁄ရွင္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" សូមទោសបាទ/ចា", "Sorry Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hoh-tae ",""," ត្រឹមត្រូវ","Yes.","ဟုတ္တယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ត្រឹមត្រូវ", "Yes.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ma-hoh-phoo",""," មិនត្រឹមត្រូវទេ","No.","မဟုတ္ဘူး။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" មិនត្រឹមត្រូវទេ", "No.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("te-ja-dae",""," ប្រាកដណាស់","Of course","ေသခ်ာတယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ប្រាកដណាស់", "Of course", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ma-te-ja-boo",""," មិនច្បាស់ទេ","I’m not sure","မေသခ်ာဘူး။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" មិនច្បាស់ទេ", "I’m not sure", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ta-bor-too-dae","","យល់ស្រប","Agree","သေဘာတူတယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("យល់ស្រប", "Agree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ta-bor-ma-too-boo","","មិនយល់ស្របទេ","Disagree","သေဘာမတူဘူး။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("មិនយល់ស្របទេ", "Disagree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("a-khuh-bae-a-cheng-shi- bee-lae(na-yee-khah-nah-ji-ba)","","ពេលនេះ ម៉ោងប៉ុន្មាន? (សូមមើលនាឡិកាបន្តិច)","What time is it? (Could you tell me the time, please) ","အခုဘယ္အခ်ိန္ရွိၿပီလဲ။ (နာရီခဏၾကည့္ပါ။)",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ពេលនេះ ម៉ោងប៉ុន្មាន? (សូមមើលនាឡិកាបន្តិច)", "What time is it?  (Could you tell me the time, please) ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sc-bae-lao-lae","","ថ្លៃប៉ុន្មាន?","How much does this cost?","ေစ်းဘယ္ေလာက္လဲ။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ថ្លៃប៉ុន្មាន?", "How much does this cost?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("a-jwe-wae-khwin-kat- tong-loh-ya- la","","នៅទីនេះទទួលយកកាតឥណទានឬទេ?","Do you take credit cards?","အေႂကြးဝယ္ခြင့္ကဒ္သံုးလို႔ရလား။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("នៅទីនេះទទួលយកកាតឥណទានឬទេ?", "Do you take credit cards?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ngwe-lae-loh-ya-la","","ទទួលដូរលុយឬទេ?","Can I change some money?","ေငြလဲလို႔ရလား။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ទទួលដូរលុយឬទេ?", "Can I change some money?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadCambodiaToPhilippines(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("gu-moos-tar","","ជ៓រាបសួរ","Hello","Kumusta",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("ជ៓រាបសួរ", "Hello", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mar-gan-dang-u-mar-gar","","អរុណសួស្តី បាទ/ចា ","Good Morning Sir/Madame","Magandang umaga",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("អរុណសួស្តី បាទ/ចា ", "Good Morning Sir/Madame", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mar-gan-dang-tang-har-lee","","សាយ័ណ្ណសួស្តី បាទ/ចា","Good Afternoon Sir/Madame.","Magandang tanghali",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("សាយ័ណ្ណសួស្តី បាទ/ចា", "Good Afternoon Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mar-gan-dang-gar-bi",""," ទិវាសួស្តី បាទ/ចា","Good Evening Sir/Madame.","Mangandang gabi",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ទិវាសួស្តី បាទ/ចា", "Good Evening Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mar-gan-dang-gar-bi",""," រាត្រីសួស្តី បាទ/ចា","Good Night Sir/Madame.","Mangandang gabi",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" រាត្រីសួស្តី បាទ/ចា", "Good Night Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ang-par-ngar-lan-go-ai",""," ខ្ញុំឈ្មោះ........................","My name is….","Ang pangalan ko ay…",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំឈ្មោះ........................", "My name is….", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ar-nong-par-ngar-lan-mo",""," អ្នកឈ្មោះអ្វីដែរ?","What is your name?","Anong pangalan mo?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកឈ្មោះអ្វីដែរ?", "What is your name?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gu-moos-tar-gar",""," ចុះលោកវិញ យ៉ាងម៉េចដែរ?","How are you?","Kumusta ka?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ចុះលោកវិញ យ៉ាងម៉េចដែរ?", "How are you?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-tu-tu-war-ar-gong-mar-gi-lar-lar-gar",""," រីករាយណាស់ដែលបានស្គាល់","Nice to meet you.","Natutuwa akong makilala ka.",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" រីករាយណាស់ដែលបានស្គាល់", "Nice to meet you.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mar-bu-ti",""," ខ្ញុំសុខសប្បាយ","I’m fine.","Mabuti",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំសុខសប្បាយ", "I’m fine.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("par-ar-lam",""," លាសិនហើយ","Good Bye.","Paalam",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" លាសិនហើយ", "Good Bye.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ee-ngat",""," សូមមើលថែរក្សាខ្លួនផងហ្នា","Take care of yourself.","Ingat ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" សូមមើលថែរក្សាខ្លួនផងហ្នា", "Take care of yourself.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hang-gang-sar-su-sus-not",""," ចាំជួបគ្នាពេលក្រោយទៀត","See you again.","Hanggang sa susunod",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ចាំជួបគ្នាពេលក្រោយទៀត", "See you again.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-lar-mat",""," អរគុណបាទ/ចា","Thank you Sir/Madame.","Salamat",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អរគុណបាទ/ចា", "Thank you Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mar-ar-bar-lar",""," សូមទោសបាទ/ចា","Sorry Sir/Madame.","Maabala",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" សូមទោសបាទ/ចា", "Sorry Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("o-o",""," ត្រឹមត្រូវ","Yes.","Oo",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ត្រឹមត្រូវ", "Yes.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hin-di",""," មិនត្រឹមត្រូវទេ","No.","Hindi",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" មិនត្រឹមត្រូវទេ", "No.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("si-gu-rar-do",""," ប្រាកដណាស់","Of course","Sigurado",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ប្រាកដណាស់", "Of course", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hin-di-ar-go-si-gu-rar-do",""," មិនច្បាស់ទេ","I’m not sure","Hindi ako sigurado",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" មិនច្បាស់ទេ", "I’m not sure", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("su-mar-sang-ar-yorn-ar-go","","យល់ស្រប","Agree","Sumasang-ayon ako",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("យល់ស្រប", "Agree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hin-di-ar-go-su-mar-sang-ar-yorn","","មិនយល់ស្របទេ","Disagree","Hindi ako sumasang-ayon",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("មិនយល់ស្របទេ", "Disagree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ar-nong-o-ras-nar","","ពេលនេះ ម៉ោងប៉ុន្មាន? (សូមមើលនាឡិកាបន្តិច)","What time is it?  (Could you tell me the time, please) ","Anong oras na?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ពេលនេះ ម៉ោងប៉ុន្មាន? (សូមមើលនាឡិកាបន្តិច)", "What time is it? (Could you tell me the time, please) ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mak-gar-no","","ថ្លៃប៉ុន្មាន?","How much does this cost?","Magkano?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ថ្លៃប៉ុន្មាន?", "How much does this cost?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ti-nar-tang-gap-bar-ang-krey-dit-kard-di-to","","នៅទីនេះទទួលយកកាតឥណទានឬទេ?","Do you take credit cards?","Tinatanggap ba ang credit card dito",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("នៅទីនេះទទួលយកកាតឥណទានឬទេ?", "Do you take credit cards?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mey-ron-bar-di-tong-man-nee-ex-chench","","ទទួលដូរលុយឬទេ?","Can I change some money?","Meron ba ditong money exchange",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ទទួលដូរលុយឬទេ?", "Can I change some money?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadCambodiaToSingapore(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("hel-lo","","ជ៓រាបសួរ","Hello","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("ជ៓រាបសួរ", "Hello", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("good –mor-ning- ser/mar-darm","","អរុណសួស្តី បាទ/ចា ","Good Morning Sir/Madame","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("អរុណសួស្តី បាទ/ចា ", "Good Morning Sir/Madame", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("good-af-ter-noon  ser/mar-darm","","សាយ័ណ្ណសួស្តី បាទ/ចា","Good Afternoon Sir/Madame.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("សាយ័ណ្ណសួស្តី បាទ/ចា", "Good Afternoon Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("good- if-ning- ser/mar-darm",""," ទិវាសួស្តី បាទ/ចា","Good Evening Sir/Madame.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ទិវាសួស្តី បាទ/ចា", "Good Evening Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("good- night- ser/mar-darm",""," រាត្រីសួស្តី បាទ/ចា","Good Night Sir/Madame.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" រាត្រីសួស្តី បាទ/ចា", "Good Night Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mai- nem- is",""," ខ្ញុំឈ្មោះ........................","My name is….","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំឈ្មោះ........................", "My name is….", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wot-is-yua-nem",""," អ្នកឈ្មោះអ្វីដែរ?","What is your name?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកឈ្មោះអ្វីដែរ?", "What is your name?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hao-ar- yu",""," ចុះលោកវិញ យ៉ាងម៉េចដែរ?","How are you?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ចុះលោកវិញ យ៉ាងម៉េចដែរ?", "How are you?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nice-tu-meet-yu",""," រីករាយណាស់ដែលបានស្គាល់","Nice to meet you.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" រីករាយណាស់ដែលបានស្គាល់", "Nice to meet you.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai  am fai",""," ខ្ញុំសុខសប្បាយ","I’m fine.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំសុខសប្បាយ", "I’m fine.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("good-bai",""," លាសិនហើយ","Good Bye.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" លាសិនហើយ", "Good Bye.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tek-kare-of-yua-self",""," សូមមើលថែរក្សាខ្លួនផងហ្នា","Take care of yourself.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" សូមមើលថែរក្សាខ្លួនផងហ្នា", "Take care of yourself.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("see-yu-a-gen",""," ចាំជួបគ្នាពេលក្រោយទៀត","See you again.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ចាំជួបគ្នាពេលក្រោយទៀត", "See you again.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tank-kio – ser/mar-darm",""," អរគុណបាទ/ចា","Thank you Sir/Madame.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អរគុណបាទ/ចា", "Thank you Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sor-ree- ser/mar-darm",""," សូមទោសបាទ/ចា","Sorry Sir/Madame.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" សូមទោសបាទ/ចា", "Sorry Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yes",""," ត្រឹមត្រូវ","Yes.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ត្រឹមត្រូវ", "Yes.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("no",""," មិនត្រឹមត្រូវទេ","No.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" មិនត្រឹមត្រូវទេ", "No.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("of-cos",""," ប្រាកដណាស់","Of course","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ប្រាកដណាស់", "Of course", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai  am not  chua",""," មិនច្បាស់ទេ","I’m not sure","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" មិនច្បាស់ទេ", "I’m not sure", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("a-gree","","យល់ស្រប","Agree","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("យល់ស្រប", "Agree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dis-a-gree","","មិនយល់ស្របទេ","Disagree","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("មិនយល់ស្របទេ", "Disagree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wot-time-is-it (kood-yu-tel-mee-der-time-plees)","","ពេលនេះ ម៉ោងប៉ុន្មាន? (សូមមើលនាឡិកាបន្តិច)","What time is it? (Could you tell me the time, please)","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ពេលនេះ ម៉ោងប៉ុន្មាន? (សូមមើលនាឡិកាបន្តិច)", "What time is it?  (Could you tell me the time, please)", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hao-mach-das-dis-cos","","ថ្លៃប៉ុន្មាន?","How much does this cost?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ថ្លៃប៉ុន្មាន?", "How much does this cost?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("du- yu-tek-crey-dit-kard","","នៅទីនេះទទួលយកកាតឥណទានឬទេ?","Do you take credit cards?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("នៅទីនេះទទួលយកកាតឥណទានឬទេ?", "Do you take credit cards?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kan-ai-chench-sam-man-nee","","ទទួលដូរលុយឬទេ?","Can I change some money?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ទទួលដូរលុយឬទេ?", "Can I change some money?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadCambodiaToVietnam(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("sin-jao","","ជ៓រាបសួរ","Hello","xin chào",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("ជ៓រាបសួរ", "Hello", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sin-jao","","អរុណសួស្តី បាទ/ចា ","Good Morning Sir/Madame","xin chào",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("អរុណសួស្តី បាទ/ចា ", "Good Morning Sir/Madame", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sin-jao","","សាយ័ណ្ណសួស្តី បាទ/ចា","Good Afternoon Sir/Madame.","xin chào",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("សាយ័ណ្ណសួស្តី បាទ/ចា", "Good Afternoon Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sin-jao",""," ទិវាសួស្តី បាទ/ចា","Good Evening Sir/Madame.","xin chào",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ទិវាសួស្តី បាទ/ចា", "Good Evening Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sin-jao",""," រាត្រីសួស្តី បាទ/ចា","Good Night Sir/Madame.","xin chào",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" រាត្រីសួស្តី បាទ/ចា", "Good Night Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-ten………….",""," ខ្ញុំឈ្មោះ........................","My name is….","tôi tên  ..............",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំឈ្មោះ........................", "My name is….", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ten-ban-la-yee",""," អ្នកឈ្មោះអ្វីដែរ?","What is your name?","tên bạn là gì?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកឈ្មោះអ្វីដែរ?", "What is your name?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ban-the-nao",""," ចុះលោកវិញ យ៉ាងម៉េចដែរ?","How are you?","bạn thế nào?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ចុះលោកវិញ យ៉ាងម៉េចដែរ?", "How are you?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("rert-wui-deuak-kab-ban",""," រីករាយណាស់ដែលបានស្គាល់","Nice to meet you.","rất vui được gặp bạn",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" រីករាយណាស់ដែលបានស្គាល់", "Nice to meet you.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-kwae",""," ខ្ញុំសុខសប្បាយ","I’m fine.","tôi khỏe",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ខ្ញុំសុខសប្បាយ", "I’m fine.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tam-biat",""," លាសិនហើយ","Good Bye.","tạm biệt",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" លាសិនហើយ", "Good Bye.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yew-yin-seuk-kwae-yaeh",""," សូមមើលថែរក្សាខ្លួនផងហ្នា","Take care of yourself.","giữ gìn sức khỏe nhé",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" សូមមើលថែរក្សាខ្លួនផងហ្នា", "Take care of yourself.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("haen-kab-lai",""," ចាំជួបគ្នាពេលក្រោយទៀត","See you again.","hẹn gặp lại",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ចាំជួបគ្នាពេលក្រោយទៀត", "See you again.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sin-kam-earn",""," អរគុណបាទ/ចា","Thank you Sir/Madame.","xin cám ơn",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អរគុណបាទ/ចា", "Thank you Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sin-loi",""," សូមទោសបាទ/ចា","Sorry Sir/Madame.","xin lỗi",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" សូមទោសបាទ/ចា", "Sorry Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Fai",""," ត្រឹមត្រូវ","Yes.","phải",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ត្រឹមត្រូវ", "Yes.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Khong-fai",""," មិនត្រឹមត្រូវទេ","No.","không phải",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" មិនត្រឹមត្រូវទេ", "No.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jug-jun",""," ប្រាកដណាស់","Of course","chắc chắn",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ប្រាកដណាស់", "Of course", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Khong-jug",""," មិនច្បាស់ទេ","I’m not sure","không chắc",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" មិនច្បាស់ទេ", "I’m not sure", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dong-ee","","យល់ស្រប","Agree","đồng ý",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("យល់ស្រប", "Agree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Khong-dong-ee","","មិនយល់ស្របទេ","Disagree","không đồng ý",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("មិនយល់ស្របទេ", "Disagree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("day-sam-dong-ho-koy-buai-yer-laa-muai-yer","","ពេលនេះ ម៉ោងប៉ុន្មាន? (សូមមើលនាឡិកាបន្តិច)","What time is it? (Could you tell me the time, please)","để xem đồng hồ coi bây giờ (là mấy giờ)",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ពេលនេះ ម៉ោងប៉ុន្មាន? (សូមមើលនាឡិកាបន្តិច)", "What time is it?(Could you tell me the time, please)", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ya-bao-yeaw","","ថ្លៃប៉ុន្មាន?","How much does this cost?","giá bao nhiêu",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ថ្លៃប៉ុន្មាន?", "How much does this cost?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("eer-duai-kor-yern-thae-tin-yoong-khong","","នៅទីនេះទទួលយកកាតឥណទានឬទេ?","Do you take credit cards?","ở đây có nhận thẻ tín dụng không?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("នៅទីនេះទទួលយកកាតឥណទានឬទេ?", "Do you take credit cards?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kor-yern-doi-tien-khong","","ទទួលដូរលុយឬទេ?","Can I change some money?","có nhận đổi tiền không?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ទទួលដូរលុយឬទេ?", "Can I change some money?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadChinaToChina(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("nee-hao","","你好","Hello","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("你好", "Hello", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jao-un","","早安","Good Morning Sir/Madame","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("早安", "Good Morning Sir/Madame", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("woo-un",""," 午安","Good Afternoon Sir/Madame.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 午安", "Good Afternoon Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wan-sung-hao",""," 晚上好","Good Evening Sir/Madame.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 晚上好", "Good Evening Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wan-an",""," 晚安","Good Night Sir/Madame.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 晚安", "Good Night Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-jiaw",""," 我叫","My name is….","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 我叫", "My name is….", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nee-gui-sing",""," 你贵姓","What is your name?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 你贵姓", "What is your name?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nee-hao-ma",""," 你好吗","How are you?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 你好吗", "How are you?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yern-seu-nee-hern-gao-sing",""," 认识你很高兴","Nice to meet you.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 认识你很高兴", "Nice to meet you.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-hern-hao",""," 我很好","I’m fine.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 我很好", "I’m fine.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jai-jian",""," 再见","Good Bye.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 再见", "Good Bye.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pao-jong",""," 保重","Take care of yourself.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 保重", "Take care of yourself.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hui-thow-jian",""," 回头见","See you again.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 回头见", "See you again.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sia-sia",""," 谢谢","Thank you Sir/Madame.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 谢谢", "Thank you Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tui-poo-chee",""," 对不起","Sorry Sir/Madame.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 对不起", "Sorry Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("seu",""," 是","Yes.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 是", "Yes.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("poo-seu",""," 不是","No.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 不是", "No.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ee-ting",""," 一定","Of course","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 一定", "Of course", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("poo-ee-ting",""," 不一定","I’m not sure","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 不一定", "I’m not sure", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("thong-ee",""," 同意","Agree","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 同意", "Agree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("poo-thong-ee",""," 不同意","Disagree","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 不同意", "Disagree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sian-jai-jee-tian-ler (yao-khun-sow-piaw)",""," 现在几点了（要看手表）","What time is it?(Could you tell me the time, please)","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 现在几点了（要看手表）", "What time is it?(Could you tell me the time, please)", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tua-sao-chian",""," 多少钱","How much does this cost?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 多少钱", "How much does this cost?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jer-lee-nueng-yong-sin-yong-kha-foo-khuan-ma",""," 这里能用信用卡付款吗","Do you take credit cards?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 这里能用信用卡付款吗", "Do you take credit cards?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kher-ee-huan-chian-ma",""," 可以换钱吗","Can I change some money?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 可以换钱吗", "Can I change some money?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadChinaToThai(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("sawasdee","","你好","Hello","สวัสดี",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("你好", "Hello", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sawasdee-torn-chao-(khrap/kha)","","早安","Good Morning Sir/Madame","สวัสดีตอนเช้าครับ/ค่ะ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("早安", "Good Morning Sir/Madame", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sawasdee-torn-bai-(khrap/kha)",""," 午安","Good Afternoon Sir/Madame.","สวัสดีตอนบ่ายครับ/ค่ะ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 午安", "Good Afternoon Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sawasdee-torn-yen-(khrap/kha)",""," 晚上好","Good Evening Sir/Madame.","สวัสดีตอนเย็นครับ/ค่ะ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 晚上好", "Good Evening Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ra-tri-sawad-(khrap/kha)",""," 晚安","Good Night Sir/Madame.","ราตรีสวัสดิ์ครับ/ค่ะ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 晚安", "Good Night Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-chue",""," 我叫","My name is….","ฉันชื่อ.....................",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 我叫", "My name is….", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khun-chue-arai",""," 你贵姓","What is your name?","คุณชื่ออะไร",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 你贵姓", "What is your name?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khun-pen-yang-rai",""," 你好吗","How are you?","คุณเป็นอย่างไร",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 你好吗", "How are you?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yin-dee-tee-dai-ru-chak",""," 认识你很高兴","Nice to meet you.","ยินดีที่ได้รู้จัก",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 认识你很高兴", "Nice to meet you.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chan-sabai-dee",""," 我很好","I’m fine.","ฉันสบายดี",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 我很好", "I’m fine.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("la-kon",""," 再见","Good Bye.","ลาก่อน",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 再见", "Good Bye.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("du-lae-tua-eng-duai-na",""," 保重","Take care of yourself.","ดูแลตัวเองด้วยนะ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 保重", "Take care of yourself.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("laew-jer-gun",""," 回头见","See you again.","แล้วเจอกัน",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 回头见", "See you again.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("korb-khun-(khrap/kha)",""," 谢谢","Thank you Sir/Madame.","ขอบคุณครับ/ค่ะ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 谢谢", "Thank you Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kho-thot",""," 对不起","Sorry Sir/Madame.","ขอโทษครับ/ค่ะ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 对不起", "Sorry Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chai",""," 是","Yes.","ใช่",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 是", "Yes.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mai-chai",""," 不是","No.","ไม่ใช่",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 不是", "No.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nae-norn",""," 一定","Of course","แน่นอน",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 一定", "Of course", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mai-nae-norn",""," 不一定","I’m not sure","ไม่แน่นอน",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 不一定", "I’m not sure", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hen-duai",""," 同意","Agree","เห็นด้วย",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 同意", "Agree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mai-hen-duai",""," 不同意","Disagree","ไม่เห็นด้วย",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 不同意", "Disagree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("torn-nee-pen-we-la-arai-kor-du-na-li-ka-noi",""," 现在几点了（要看手表）","What time is it? (Could you tell me the time, please)","ตอนนี้เป็นเวลาอะไร (ขอดูนาฬิกาหน่อย)",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 现在几点了（要看手表）", "What time is it? (Could you tell me the time, please)", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("rakha-thao-rai",""," 多少钱","How much does this cost?","ราคาเท่าไร",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 多少钱", "How much does this cost?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("thi-nee-rub-bud-credit-mai",""," 这里能用信用卡付款吗","Do you take credit cards?","ที่นี่รับบัตรเครดิตไหม",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 这里能用信用卡付款吗", "Do you take credit cards?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("rub-laek-ngoen-mai",""," 可以换钱吗","Can I change some money?","รับแลกเงินไหม",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 可以换钱吗", "Can I change some money?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadChinaToBrunei(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("gu-moos-tar","","你好","Hello","Kumusta",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("你好", "Hello", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ser-la-mud-pa-kee","","早安","Good Morning Sir/Madame","Selamat pagi",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("早安", "Good Morning Sir/Madame", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ser-la-mud-per-tung",""," 午安","Good Afternoon Sir/Madame.","Selamat petang",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 午安", "Good Afternoon Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ser-la-mud-per-tung",""," 晚上好","Good Evening Sir/Madame.","Selamat petang",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 晚上好", "Good Evening Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ser-la-mud-ma-lum",""," 晚安","Good Night Sir/Madame.","Selamat malam",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 晚安", "Good Night Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("na-ma-sa-ya",""," 我叫","My name is….","Nama saya……",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 我叫", "My name is….", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("see-ya-pa-gah-na-ma-un-da",""," 你贵姓","What is your name?","Siapakah nama anda",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 你贵姓", "What is your name?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ar-pa-ka-bul",""," 你好吗","How are you?","Apa khabar",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 你好吗", "How are you?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("koem-bee-ra-da-pud-burn-gur-na-lun- der-ngun-un-da",""," 认识你很高兴","Nice to meet you.","Gembira dapat berkenalan dengan anda",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 认识你很高兴", "Nice to meet you.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ka-bul-baik",""," 我很好","I’m fine.","Khabar baik",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 我很好", "I’m fine.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ser-la-mud-ting-kul",""," 再见","Good Bye.","Selamat tinggal",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 再见", "Good Bye.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ya-ka-dee-ree-baik-baik-ya",""," 保重","Take care of yourself.","Jaga diri baik-baik ya",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 保重", "Take care of yourself.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yoom-pa-la-kee",""," 回头见","See you again.","jumpa lagi",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 回头见", "See you again.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ter-ree-ma-ga-seh",""," 谢谢","Thank you Sir/Madame.","terima kasih",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 谢谢", "Thank you Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ma-af-gun-sa-ya",""," 对不起","Sorry Sir/Madame.","Maafkan saya",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 对不起", "Sorry Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ya",""," 是","Yes.","ya",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 是", "Yes.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("boo-gun",""," 不是","No.","bukan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 不是", "No.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soo-da-tern-too",""," 一定","Of course","sudah tentu",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 一定", "Of course", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tee-duk-tern-too",""," 不一定","I’m not sure","tidak tentu",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 不一定", "I’m not sure", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ser-too-yoo",""," 同意","Agree","setuju",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 同意", "Agree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tee-duk-ser-too-yoo",""," 不同意","Disagree","tidak setuju",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 不同意", "Disagree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ser-ga-rung-poo-goon-ber-ra-pa-min-ta-tay-ngoak-yum-ser-dee-kit-ya",""," 现在几点了（要看手表）","What time is it?(Could you tell me the time, please)","Sekarang pukul berapa minta tengok jam sedikit ya",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 现在几点了（要看手表）", "What time is it?(Could you tell me the time, please) ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hul-ka-ber-ra-pa gah",""," 多少钱","How much does this cost?","Harga berapa",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 多少钱", "How much does this cost?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-see-nee-ter-ree-ma-gard-kray-dit-gah",""," 这里能用信用卡付款吗","Do you take credit cards?","Di sini terima kad kridit kah?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 这里能用信用卡付款吗", "Do you take credit cards?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ter-ree-ma-oon-took-mer-noo-gul-wang-",""," 可以换钱吗","Can I change some money?","Terima untuk menukar wang kah?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 可以换钱吗", "Can I change some money?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadChinaToCambodia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("joom-riab-sua","","你好","Hello","ជ៓រាបសួរ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("你好", "Hello", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("a-roon-sua-sduai-baad / ja","","早安","Good Morning Sir/Madame","អរុណសួស្តី បាទ/ចា ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("早安", "Good Morning Sir/Madame", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-yun-sua- sduai -baad / ja",""," 午安","Good Afternoon Sir/Madame.","សាយ័ណ្ណសួស្តី បាទ/ចា",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 午安", "Good Afternoon Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ti-wia-sua- sduai -baad / ja",""," 晚上好","Good Evening Sir/Madame."," ទិវាសួស្តី បាទ/ចា",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 晚上好", "Good Evening Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ria-truai-sua- sduai -baad / ja",""," 晚安","Good Night Sir/Madame."," រាត្រីសួស្តី បាទ/ចា",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 晚安", "Good Night Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-chmuah…………….",""," 我叫","My name is…."," ខ្ញុំឈ្មោះ........................",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 我叫", "My name is….", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("niah-chmuah-awuai-dae",""," 你贵姓","What is your name?"," អ្នកឈ្មោះអ្វីដែរ?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 你贵姓", "What is your name?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("joh-loak-wuen-yang-merc-dae",""," 你好吗","How are you?"," ចុះលោកវិញ យ៉ាងម៉េចដែរ?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 你好吗", "How are you?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("reek-riay-nah-dael-ban-skual",""," 认识你很高兴","Nice to meet you."," រីករាយណាស់ដែលបានស្គាល់",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 认识你很高兴", "Nice to meet you.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khyom-sok-sbai",""," 我很好","I’m fine."," ខ្ញុំសុខសប្បាយ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 我很好", "I’m fine.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("lia-sern-huai",""," 再见","Good Bye."," លាសិនហើយ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 再见", "Good Bye.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soam-merl-thae-riah-sa-khluan-phong- na",""," 保重","Take care of yourself."," សូមមើលថែរក្សាខ្លួនផងហ្នា",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 保重", "Take care of yourself.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jum-juap-khnia-pel-groey-tiad",""," 回头见","See you again."," ចាំជួបគ្នាពេលក្រោយទៀត",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 回头见", "See you again.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("or-kun-baad / ja",""," 谢谢","Thank you Sir/Madame."," អរគុណបាទ/ចា",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 谢谢", "Thank you Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soam-toh-baad / ja",""," 对不起","Sorry Sir/Madame."," សូមទោសបាទ/ចា",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 对不起", "Sorry Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("trerm-treuw",""," 是","Yes."," ត្រឹមត្រូវ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 是", "Yes.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("muen-trerm-treuw-tay",""," 不是","No."," មិនត្រឹមត្រូវទេ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 不是", "No.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pra-god-nah",""," 一定","Of course"," ប្រាកដណាស់",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 一定", "Of course", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("muen-jbah-tay",""," 不一定","I’m not sure"," មិនច្បាស់ទេ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 不一定", "I’m not sure", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yual-srob",""," 同意","Agree","យល់ស្រប",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 同意", "Agree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("muen -yual-srob-tay",""," 不同意","Disagree","មិនយល់ស្របទេ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 不同意", "Disagree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pel-nih-moang-pon-marn (soam-mern-nia-leh-ka-bon-terd)",""," 现在几点了（要看手表）","What time is it?(Could you tell me the time, please)","ពេលនេះ ម៉ោងប៉ុន្មាន? (សូមមើលនាឡិកាបន្តិច)",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 现在几点了（要看手表）", "What time is it?(Could you tell me the time, please)", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("thlay-pon-man",""," 多少钱","How much does this cost?","ថ្លៃប៉ុន្មាន?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 多少钱", "How much does this cost?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nuew-tee-nih-toe-tual-yoak-gard-ern-tian-reu-tay",""," 这里能用信用卡付款吗","Do you take credit cards?","នៅទីនេះទទួលយកកាតឥណទានឬទេ?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 这里能用信用卡付款吗", "Do you take credit cards?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toe-tual-dough-lui-reu-tay",""," 可以换钱吗","Can I change some money?","ទទួលដូរលុយឬទេ?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 可以换钱吗", "Can I change some money?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadChinaToIndonesia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("Ha-lo","","你好","Hello","Halo",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("你好", "Hello", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("seu-lar-mat-par-kee, bar-pak/ee-bu","","早安","Good Morning Sir/Madame","Selamat pagi, Bapak/Ibu",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("早安", "Good Morning Sir/Madame", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("seu-lar-mat-see-yang, bar-pak/ee-bu",""," 午安","Good Afternoon Sir/Madame.","Selamat siang, Bapak/Ibu",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 午安", "Good Afternoon Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("seu-lar-mat-sor-re- bar-pak/ee-bu",""," 晚上好","Good Evening Sir/Madame.","Selamat sore, Bapak/Ibu",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 晚上好", "Good Evening Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("seu-lar-mat-mar-lam, bar-pak/ee-bu",""," 晚安","Good Night Sir/Madame.","Selamat malam, Bapak/Ibu ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 晚安", "Good Night Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-mar-sar-yar",""," 我叫","My name is….","Nama saya …….",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 我叫", "My name is….", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("see-yar-par-nar-mar-an-dar",""," 你贵姓","What is your name?","Siapa nama anda ?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 你贵姓", "What is your name?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ar-par-kar-bar",""," 你好吗","How are you?","Apa kabar ?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 你好吗", "How are you?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("seu-nang-ber-teu-mu-der-ngan-an-dar",""," 认识你很高兴","Nice to meet you.","Senang bertemu dengan anda",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 认识你很高兴", "Nice to meet you.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-bar-ik-bar-ik-sar-jar",""," 我很好","I’m fine.","Saya baik-baik saja.",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 我很好", "I’m fine.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("seu-lar-mat-jar-lan  seu-lar-mat-ting-gal",""," 再见","Good Bye.","Selamat jalan (for the person who stays)  Selamat tinggal (for the person who goes away)",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 再见", "Good Bye.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jar-gar-lah-dee-ree-an-dar-bar-ik-bar-ik",""," 保重","Take care of yourself.","Jagalah diri anda baik-baik",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 保重", "Take care of yourself.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sam-pai-ber-teu-mu-lar-kee",""," 回头见","See you again.","Sampai bertemu lagi",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 回头见", "See you again.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ter-ree-mar-gar-sih, bar-pak/ee-bu",""," 谢谢","Thank you Sir/Madame.","Terima kasih, Bapak/Ibu",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 谢谢", "Thank you Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mar-af, bar-pak/ee-bu",""," 对不起","Sorry Sir/Madame.","Maaf, Bapak/Ibu",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 对不起", "Sorry Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yar",""," 是","Yes.","Ya",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 是", "Yes.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tee-dak",""," 不是","No.","Tidak",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 不是", "No.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("teun-tu-sar-jar",""," 一定","Of course","Tentu saja",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 一定", "Of course", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tee-dak-teun-tu",""," 不一定","I’m not sure","Tidak tentu",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 不一定", "I’m not sure", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("seu-tu-ju",""," 同意","Agree","Setuju",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 同意", "Agree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tee-dak-seu-tu-ju",""," 不同意","Disagree","Tidak setuju",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 不同意", "Disagree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("seu-gar-rang-jam-beu-rar-par",""," 现在几点了（要看手表）","What time is it?                                          (Could you tell me the time, please)                                       ","Sekarang jam berapa?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 现在几点了（要看手表）", "What time is it?                                          (Could you tell me the time, please)                                       ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("beu-rar-par-har-kar-yar",""," 多少钱","How much does this cost?","Berapa harganya?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 多少钱", "How much does this cost?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ar-pak-gah-meu-ner-ree-mar-kar-tu-krey-dit",""," 这里能用信用卡付款吗","Do you take credit cards?","Apakah menerima kartu kredit?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 这里能用信用卡付款吗", "Do you take credit cards?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ar-par-bee-sar-tu-gar-u-wang",""," 可以换钱吗","Can I change some money?","Apa bisa tukar uang?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 可以换钱吗", "Can I change some money?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadChinaToLaos(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("sa-bai-dee","","你好","Hello"," ສະບາຍດີ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("你好", "Hello", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" sa-bai-dee-torn-chaw","","早安","Good Morning Sir/Madame"," ສະບາຍດີຕອນເຊົ້າ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("早安", "Good Morning Sir/Madame", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" sa-bai-dee-torn-thiang",""," 午安","Good Afternoon Sir/Madame."," ສະບາຍດີຕອນທ່ຽງ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 午安", "Good Afternoon Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" sa-bai-dee-torn-laeng",""," 晚上好","Good Evening Sir/Madame."," ສະບາຍດີຕອນແລງ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 晚上好", "Good Evening Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" sa-bai-dee-torn-gang-keun",""," 晚安","Good Night Sir/Madame."," ສະບາຍດີຕອນກາງຄືນ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 晚安", "Good Night Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" khoy-seu……….",""," 我叫","My name is…."," ຂ້ອຍຊື່…………",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 我叫", "My name is….", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" jao-seu-yung",""," 你贵姓","What is your name?"," ເຈົ້າຊື່ຫຍັງ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 你贵姓", "What is your name?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" jao-pen-jung-dai",""," 你好吗","How are you?"," ເຈົ້າເປັນຈັງໃດ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 你好吗", "How are you?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" yin-dee-thee-dai-hoo-jak",""," 认识你很高兴","Nice to meet you."," ຍິນດີທີ່ໄດ້ຮູ້ຈັກ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 认识你很高兴", "Nice to meet you.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" khoy-sa-bai-dee",""," 我很好","I’m fine."," ຂ້ອຍສະບາຍດີ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 我很好", "I’m fine.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" la-korn",""," 再见","Good Bye."," ລາກ່ອນ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 再见", "Good Bye.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" berng-yaeng-toe-eng-dae-der",""," 保重","Take care of yourself."," ເບິ່ງແຍງໂຕເອງແດ່ເດີ້",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 保重", "Take care of yourself.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" laew-phop-gun",""," 回头见","See you again."," ແລ້ວພົບກັນ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 回头见", "See you again.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" khob-jai",""," 谢谢","Thank you Sir/Madame."," ຂອບໃຈ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 谢谢", "Thank you Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" khor-tote",""," 对不起","Sorry Sir/Madame."," ຂໍໂທດ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 对不起", "Sorry Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" man",""," 是","Yes."," ແມ່ນ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 是", "Yes.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" bor-man",""," 不是","No."," ບໍ່ແມ່ນ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 不是", "No.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" nae-norn",""," 一定","Of course"," ແນ່ນອນ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 一定", "Of course", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" bor-nae-norn",""," 不一定","I’m not sure"," ບໍ່ແນ່ນອນ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 不一定", "I’m not sure", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" hen-num",""," 同意","Agree"," ເຫັນນຳ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 同意", "Agree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" bor-hen-num",""," 不同意","Disagree"," ບໍ່ເຫັນນຳ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 不同意", "Disagree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" torn-nee-pen-way-lar-thao-dai (khor-berng-mong-dae)",""," 现在几点了（要看手表）","What time is it? (Could you tell me the time, please) "," ຕອນນີ້ເປັນເວລາເທົ່າໃດ (ຂໍເບິ່ງໂມງແດ່)",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 现在几点了（要看手表）", "What time is it? (Could you tell me the time, please)", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("la-kha-thao-dai",""," 多少钱","How much does this cost?"," ລາຄາເທົ່າໃດ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 多少钱", "How much does this cost?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bom-nee-hub-but-kray-dit-bor",""," 这里能用信用卡付款吗","Do you take credit cards?"," ບ່ອນນີ້ຮັບບັດເຄຣດິດບໍ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 这里能用信用卡付款吗", "Do you take credit cards?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hub-lag-pian-ngern-bor",""," 可以换钱吗","Can I change some money?"," ຮັບແລກປ່ຽນເງິນບໍ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 可以换钱吗", "Can I change some money?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadChinaToMalaysia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("gu-moos-tar","","你好","Hello","Kumusta",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("你好", "Hello", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ser-la-mud-pa-kee","","早安","Good Morning Sir/Madame","Selamat pagi",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("早安", "Good Morning Sir/Madame", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ser-la-mud-per-tung",""," 午安","Good Afternoon Sir/Madame.","Selamat petang",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 午安", "Good Afternoon Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ser-la-mud-per-tung",""," 晚上好","Good Evening Sir/Madame.","Selamat petang",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 晚上好", "Good Evening Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ser-la-mud-ma-lum",""," 晚安","Good Night Sir/Madame.","Selamat malam",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 晚安", "Good Night Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("na-ma-sa-ya",""," 我叫","My name is….","Nama saya……",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 我叫", "My name is….", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("see-ya-pa-gah-na-ma-un-da",""," 你贵姓","What is your name?","Siapakah nama anda",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 你贵姓", "What is your name?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ar-pa-ka-bul",""," 你好吗","How are you?","Apa khabar",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 你好吗", "How are you?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("koem-bee-ra-da-pud-burn-gur-na-lun- der-ngun-un-da",""," 认识你很高兴","Nice to meet you.","Gembira dapat berkenalan dengan anda",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 认识你很高兴", "Nice to meet you.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ka-bul-baik",""," 我很好","I’m fine.","Khabar baik",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 我很好", "I’m fine.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ser-la-mud-ting-kul",""," 再见","Good Bye.","Selamat tinggal",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 再见", "Good Bye.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ya-ka-dee-ree-baik-baik-ya",""," 保重","Take care of yourself.","Jaga diri baik-baik ya",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 保重", "Take care of yourself.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yoom-pa-la-kee",""," 回头见","See you again.","jumpa lagi",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 回头见", "See you again.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ter-ree-ma-ga-seh",""," 谢谢","Thank you Sir/Madame.","terima kasih",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 谢谢", "Thank you Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ma-af-gun-sa-ya",""," 对不起","Sorry Sir/Madame.","Maafkan saya",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 对不起", "Sorry Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ya",""," 是","Yes.","ya",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 是", "Yes.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("boo-gun",""," 不是","No.","bukan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 不是", "No.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soo-da-tern-too",""," 一定","Of course","sudah tentu",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 一定", "Of course", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tee-duk-tern-too",""," 不一定","I’m not sure","tidak tentu",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 不一定", "I’m not sure", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ser-too-yoo",""," 同意","Agree","setuju",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 同意", "Agree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tee-duk-ser-too-yoo",""," 不同意","Disagree","tidak setuju",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 不同意", "Disagree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ser-ga-rung-poo-goon-ber-ra-pa-min-ta-tay-ngoak-yum-ser-dee-kit-ya",""," 现在几点了（要看手表）","What time is it? (Could you tell me the time, please) ","Sekarang pukul berapa minta tengok jam sedikit ya",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 现在几点了（要看手表）", "What time is it?(Could you tell me the time, please)", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hul-ka-ber-ra-pa gah",""," 多少钱","How much does this cost?","Harga berapa",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 多少钱", "How much does this cost?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-see-nee-ter-ree-ma-gard-kray-dit-gah",""," 这里能用信用卡付款吗","Do you take credit cards?","Di sini terima kad kridit kah?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 这里能用信用卡付款吗", "Do you take credit cards?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ter-ree-ma-oon-took-mer-noo-gul-wang-",""," 可以换钱吗","Can I change some money?","Terima untuk menukar wang kah?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 可以换钱吗", "Can I change some money?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadChinaToMyanmar(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ming-ga-la-ba","","你好","Hello","မဂ๎လာပါ။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("你好", "Hello", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ming-ga-la-ma-naeh-kheen-ba-kha- mia/sheen","","早安","Good Morning Sir/Madame","မဂ๎လာမနက္ခင္းပါ ခင္ဗ်ာ∕ရွင္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("早安", "Good Morning Sir/Madame", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ming-ga-la-neh-kheen-ba-kha-mia/sheen",""," 午安","Good Afternoon Sir/Madame.","မဂ๎လာေန႔ခင္းပါ ခင္ဗ်ာ∕ရွင္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 午安", "Good Afternoon Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ming-ga-la-nya-ne-kheen ba-kha- mia/sheen",""," 晚上好","Good Evening Sir/Madame.","မဂ๎လာညေနခင္းပါ ခင္ဗ်ာ∕ရွင္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 晚上好", "Good Evening Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("good-night.",""," 晚安","Good Night Sir/Madame.","ဂြတ္ႏိုက္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 晚安", "Good Night Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma  na-mae …..ba",""," 我叫","My name is….","ကြ်န္ေတာ္⁄ကြ်န္မ နာမည္........ ပါ။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 我叫", "My name is….", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kha-mia/sheen-na-mae-bae- loe-khor- ta-lae",""," 你贵姓","What is your name?","ခင္ဗ်ား∕ရွင္ နာမည္ဘယ္လိုေခၚသလဲ။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 你贵姓", "What is your name?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kha-mia/sheen-ne-kaw-la",""," 你好吗","How are you?","ခင္ဗ်ား∕ရွင္ ေနေကာင္းလား။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 你好吗", "How are you?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("twe-ya-da-wan-ta-ba-dae",""," 认识你很高兴","Nice to meet you.","ေတြ႕ရတာဝမ္းပါတယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 认识你很高兴", "Nice to meet you.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor/ja-ma  ne-kaw- ba -dae",""," 我很好","I’m fine.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 我很好", "I’m fine.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("twa-doh-mae ",""," 再见","Good Bye.","ကြ်န္ေတာ္⁄ကြ်န္မ ေနေကာင္းပါတယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 再见", "Good Bye.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("koh-koe-koe-ga-yuh-sai-ba",""," 保重","Take care of yourself.","သြားေတာ့မယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 保重", "Take care of yourself.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nao-ta-kha-twe-ba-ya-se",""," 回头见","See you again.","ကိုယ့္ကိုယ္ဂရုစိုက္ပါ။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 回头见", "See you again.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("je-zoo-tin-ba-dae-kha-mia/sheen",""," 谢谢","Thank you Sir/Madame.","ေနာက္တစ္ခါေတြ႕ပါရေစ။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 谢谢", "Thank you Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("taw-man-ba-dae-kha-mia/sheen",""," 对不起","Sorry Sir/Madame.","ေက်းဇူးတင္ပါတယ္ ခင္ဗ်ာ⁄ရွင္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 对不起", "Sorry Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hoh-tae ",""," 是","Yes.","ဟုတ္တယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 是", "Yes.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ma-hoh-phoo",""," 不是","No.","မဟုတ္ဘူး။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 不是", "No.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("te-ja-dae",""," 一定","Of course","ေသခ်ာတယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 一定", "Of course", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ma-te-ja-boo",""," 不一定","I’m not sure","မေသခ်ာဘူး။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 不一定", "I’m not sure", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ta-bor-too-dae",""," 同意","Agree","သေဘာတူတယ္။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 同意", "Agree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ta-bor-ma-too-boo",""," 不同意","Disagree","သေဘာမတူဘူး။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 不同意", "Disagree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("a-khuh-bae-a-cheng-shi- bee-lae(na-yee-khah-nah-ji-ba)",""," 现在几点了（要看手表）","What time is it?(Could you tell me the time, please)","အခုဘယ္အခ်ိန္ရွိၿပီလဲ။ (နာရီခဏၾကည့္ပါ။)",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 现在几点了（要看手表）", "What time is it? (Could you tell me the time, please) ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sc-bae-lao-lae",""," 多少钱","How much does this cost?","ေစ်းဘယ္ေလာက္လဲ။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 多少钱", "How much does this cost?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("a-jwe-wae-khwin-kat- tong-loh-ya- la",""," 这里能用信用卡付款吗","Do you take credit cards?","အေႂကြးဝယ္ခြင့္ကဒ္သံုးလို႔ရလား။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 这里能用信用卡付款吗", "Do you take credit cards?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ngwe-lae-loh-ya-la",""," 可以换钱吗","Can I change some money?","ေငြလဲလို႔ရလား။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 可以换钱吗", "Can I change some money?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadChinaToPhilippines(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("gu-moos-tar","","你好","Hello","Kumusta",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("你好", "Hello", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mar-gan-dang-u-mar-gar","","早安","Good Morning Sir/Madame","Magandang umaga",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("早安", "Good Morning Sir/Madame", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mar-gan-dang-tang-har-lee",""," 午安","Good Afternoon Sir/Madame.","Magandang tanghali",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 午安", "Good Afternoon Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mar-gan-dang-gar-bi",""," 晚上好","Good Evening Sir/Madame.","Mangandang gabi",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 晚上好", "Good Evening Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mar-gan-dang-gar-bi",""," 晚安","Good Night Sir/Madame.","Mangandang gabi",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 晚安", "Good Night Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ang-par-ngar-lan-go-ai",""," 我叫","My name is….","Ang pangalan ko ay…",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 我叫", "My name is….", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ar-nong-par-ngar-lan-mo",""," 你贵姓","What is your name?","Anong pangalan mo?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 你贵姓", "What is your name?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gu-moos-tar-gar",""," 你好吗","How are you?","Kumusta ka?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 你好吗", "How are you?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nar-tu-tu-war-ar-gong-mar-gi-lar-lar-gar",""," 认识你很高兴","Nice to meet you.","Natutuwa akong makilala ka.",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 认识你很高兴", "Nice to meet you.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mar-bu-ti",""," 我很好","I’m fine.","Mabuti",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 我很好", "I’m fine.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("par-ar-lam",""," 再见","Good Bye.","Paalam",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 再见", "Good Bye.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ee-ngat",""," 保重","Take care of yourself.","Ingat ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 保重", "Take care of yourself.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hang-gang-sar-su-sus-not",""," 回头见","See you again.","Hanggang sa susunod",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 回头见", "See you again.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-lar-mat",""," 谢谢","Thank you Sir/Madame.","Salamat",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 谢谢", "Thank you Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mar-ar-bar-lar",""," 对不起","Sorry Sir/Madame.","Maabala",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 对不起", "Sorry Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("o-o",""," 是","Yes.","Oo",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 是", "Yes.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hin-di",""," 不是","No.","Hindi",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 不是", "No.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("si-gu-rar-do",""," 一定","Of course","Sigurado",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 一定", "Of course", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hin-di-ar-go-si-gu-rar-do",""," 不一定","I’m not sure","Hindi ako sigurado",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 不一定", "I’m not sure", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("su-mar-sang-ar-yorn-ar-go",""," 同意","Agree","Sumasang-ayon ako",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 同意", "Agree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hin-di-ar-go-su-mar-sang-ar-yorn",""," 不同意","Disagree","Hindi ako sumasang-ayon",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 不同意", "Disagree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ar-nong-o-ras-nar",""," 现在几点了（要看手表）","What time is it?(Could you tell me the time, please)","Anong oras na?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 现在几点了（要看手表）", "What time is it?  (Could you tell me the time, please)", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mak-gar-no",""," 多少钱","How much does this cost?","Magkano?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 多少钱", "How much does this cost?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ti-nar-tang-gap-bar-ang-krey-dit-kard-di-to",""," 这里能用信用卡付款吗","Do you take credit cards?","Tinatanggap ba ang credit card dito",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 这里能用信用卡付款吗", "Do you take credit cards?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mey-ron-bar-di-tong-man-nee-ex-chench",""," 可以换钱吗","Can I change some money?","Meron ba ditong money exchange",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 可以换钱吗", "Can I change some money?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadChinaToSingapore(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("hel-lo","","你好","Hello","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("你好", "Hello", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("good –mor-ning- ser/mar-darm","","早安","Good Morning Sir/Madame","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("早安", "Good Morning Sir/Madame", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("good-af-ter-noon  ser/mar-darm",""," 午安","Good Afternoon Sir/Madame.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 午安", "Good Afternoon Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("good- if-ning- ser/mar-darm",""," 晚上好","Good Evening Sir/Madame.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 晚上好", "Good Evening Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("good- night- ser/mar-darm",""," 晚安","Good Night Sir/Madame.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 晚安", "Good Night Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mai- nem- is",""," 我叫","My name is….","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 我叫", "My name is….", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wot-is-yua-nem",""," 你贵姓","What is your name?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 你贵姓", "What is your name?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hao-ar- yu",""," 你好吗","How are you?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 你好吗", "How are you?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nice-tu-meet-yu",""," 认识你很高兴","Nice to meet you.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 认识你很高兴", "Nice to meet you.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai  am fai",""," 我很好","I’m fine.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 我很好", "I’m fine.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("good-bai",""," 再见","Good Bye.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 再见", "Good Bye.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tek-kare-of-yua-self",""," 保重","Take care of yourself.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 保重", "Take care of yourself.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("see-yu-a-gen",""," 回头见","See you again.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 回头见", "See you again.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tank-kio – ser/mar-darm",""," 谢谢","Thank you Sir/Madame.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 谢谢", "Thank you Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sor-ree- ser/mar-darm",""," 对不起","Sorry Sir/Madame.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 对不起", "Sorry Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yes",""," 是","Yes.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 是", "Yes.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("no",""," 不是","No.","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 不是", "No.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("of-cos",""," 一定","Of course","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 一定", "Of course", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai  am not  chua",""," 不一定","I’m not sure","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 不一定", "I’m not sure", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("a-gree",""," 同意","Agree","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 同意", "Agree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dis-a-gree",""," 不同意","Disagree","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 不同意", "Disagree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wot-time-is-it (kood-yu-tel-mee-der-time-plees)",""," 现在几点了（要看手表）","What time is it?(Could you tell me the time, please)","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 现在几点了（要看手表）", "What time is it?(Could you tell me the time, please)", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hao-mach-das-dis-cos",""," 多少钱","How much does this cost?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 多少钱", "How much does this cost?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("du- yu-tek-crey-dit-kard",""," 这里能用信用卡付款吗","Do you take credit cards?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 这里能用信用卡付款吗", "Do you take credit cards?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kan-ai-chench-sam-man-nee",""," 可以换钱吗","Can I change some money?","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 可以换钱吗", "Can I change some money?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadChinaToVietnam(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("sin-jao","","你好","Hello","xin chào",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("你好", "Hello", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sin-jao","","早安","Good Morning Sir/Madame","xin chào",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("早安", "Good Morning Sir/Madame", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sin-jao",""," 午安","Good Afternoon Sir/Madame.","xin chào",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 午安", "Good Afternoon Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sin-jao",""," 晚上好","Good Evening Sir/Madame.","xin chào",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 晚上好", "Good Evening Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sin-jao",""," 晚安","Good Night Sir/Madame.","xin chào",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 晚安", "Good Night Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-ten………….",""," 我叫","My name is….","tôi tên  ..............",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 我叫", "My name is….", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ten-ban-la-yee",""," 你贵姓","What is your name?","tên bạn là gì?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 你贵姓", "What is your name?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ban-the-nao",""," 你好吗","How are you?","bạn thế nào?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 你好吗", "How are you?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("rert-wui-deuak-kab-ban",""," 认识你很高兴","Nice to meet you.","rất vui được gặp bạn",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 认识你很高兴", "Nice to meet you.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-kwae",""," 我很好","I’m fine.","tôi khỏe",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 我很好", "I’m fine.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tam-biat",""," 再见","Good Bye.","tạm biệt",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 再见", "Good Bye.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yew-yin-seuk-kwae-yaeh",""," 保重","Take care of yourself.","giữ gìn sức khỏe nhé",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 保重", "Take care of yourself.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("haen-kab-lai",""," 回头见","See you again.","hẹn gặp lại",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 回头见", "See you again.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sin-kam-earn",""," 谢谢","Thank you Sir/Madame.","xin cám ơn",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 谢谢", "Thank you Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sin-loi",""," 对不起","Sorry Sir/Madame.","xin lỗi",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 对不起", "Sorry Sir/Madame.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Fai",""," 是","Yes.","phải",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 是", "Yes.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Khong-fai",""," 不是","No.","không phải",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 不是", "No.", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jug-jun",""," 一定","Of course","chắc chắn",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 一定", "Of course", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Khong-jug",""," 不一定","I’m not sure","không chắc",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 不一定", "I’m not sure", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dong-ee",""," 同意","Agree","đồng ý",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 同意", "Agree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Khong-dong-ee",""," 不同意","Disagree","không đồng ý",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 不同意", "Disagree", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("day-sam-dong-ho-koy-buai-yer-laa-muai-yer",""," 现在几点了（要看手表）","What time is it?(Could you tell me the time, please) ","để xem đồng hồ coi bây giờ (là mấy giờ)",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 现在几点了（要看手表）", "What time is it? (Could you tell me the time, please) ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ya-bao-yeaw",""," 多少钱","How much does this cost?","giá bao nhiêu",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 多少钱", "How much does this cost?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("eer-duai-kor-yern-thae-tin-yoong-khong",""," 这里能用信用卡付款吗","Do you take credit cards?","ở đây có nhận thẻ tín dụng không?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 这里能用信用卡付款吗", "Do you take credit cards?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kor-yern-doi-tien-khong",""," 可以换钱吗","Can I change some money?","có nhận đổi tiền không?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 可以换钱吗", "Can I change some money?", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
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
