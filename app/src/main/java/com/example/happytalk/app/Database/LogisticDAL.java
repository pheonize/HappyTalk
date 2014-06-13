package com.example.happytalk.app.Database;

import com.example.happytalk.app.Child;
import com.example.happytalk.app.GroupHeader;

import java.util.ArrayList;

/**
 * Created by oVANILLAz on 6/10/14 AD.
 */
public class LogisticDAL {
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

        Child child = new Child("hai-gwan","","Imigresen","Custom house"," 海关",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Imigresen", "Custom house", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hwor","","barangan  dagangan","Goods"," 货",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("barangan  dagangan", "Goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ma-thow","","Pelabuhan ","Dock warehouse"," 码头",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Pelabuhan ", "Dock warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jerng-soo","","Surat jaminan","Certificate"," 证书",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat jaminan", "Certificate", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Jin-khow","","Impot","Import"," 进口",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Impot", "Import", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("choo-khow","","Ekspot","Export"," 出口",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Ekspot", "Export", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fuai-yong","","Yuran","Charge"," 费用",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Yuran", "Charge", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fa-hwor-jer","","Penghantar barang","Goods deliverer"," 发货者",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Penghantar barang", "Goods deliverer", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sow-hwor-jer","","Penerima barang","Goods receiver","收货者",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Penerima barang", "Goods receiver", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chang-khoo","","Gudang / Gudang barangan","Warehouse"," 仓库",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Gudang / Gudang barangan", "Warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pao-sian","","Insuren","Insurance"," 保险",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Insuren", "Insurance", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tai-lee","","Wakil","Shipping agent"," 代理",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Wakil", "Shipping agent", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("thee-tun-jer","","Penerima barang kiriman","Consignee "," 提单者",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Penerima barang kiriman", "Consignee ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jee-juang-siang-haw-ma","","Nombor kontena dan nombor cap materai kontena","Container and seal number"," 集装箱号码",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Nombor kontena dan nombor cap materai kontena", "Container and seal number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fa-hwor-tun","","Surat perintah penghantaran barangan","Delivery order"," 发货单",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat perintah penghantaran barangan", "Delivery order", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ching-tun","","Senarai barangan","Description of goods"," 清单",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Senarai barangan", "Description of goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jee-juang-siang-yian-chee-fuai-yong","","Bayaran memulangkan  kontena  terlewat dari  masa   yang ditetapkan","Detention"," 集装箱延期费用",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Bayaran memulangkan  kontena  terlewat dari  masa   yang ditetapkan", "Detention", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("foo-in-fuay","","Yuran dokumen","Document fee"," 复印费",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Yuran dokumen", "Document fee", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hwor-awin-tay-lee","","Wakil penerima pengangkutan barangan","Freight forwarder"," 货运代理",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Wakil penerima pengangkutan barangan", "Freight forwarder", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wuai-sian-phin","","Barangan merbahaya","Dangerous goods"," 危险品",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Barangan merbahaya", "Dangerous goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("woo-phin-ming-cherng-her-woo-phin-pian-hao","","Tanda dan nombor peti barangan","Shipping mark and number"," 物品名称和物品编号",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tanda dan nombor peti barangan", "Shipping mark and number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("song-hwor-tan","","Surat hantar barangan","Invoice","送货单",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat hantar barangan", "Invoice", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sow-hwor-tan","","Surat terima barangan","Bill of lading"," 收货单",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat terima barangan", "Bill of lading", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("loo-khow-choo-khow","","Jalan masuk-jalan keluar","Entrance - Exit"," 入口- 出口",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Jalan masuk-jalan keluar", "Entrance - Exit", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-naa-sow-hwor-chew-yern-soo-lai/ wor- sian-jai-kher-yee-soe-hwa-ma","","Saya datang untuk mengambil  barang bersama dengan surat  perintah penghantaranbarangan saya boleh terimabarang kah?","I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? "," 我拿售货确认书来，我现在可以收货吗",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya datang untuk mengambil  barang bersama dengan surat  perintah penghantaranbarangan saya boleh terimabarang kah?", "I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToThai(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("dan-sun-la-ka-kon","","Imigresen","Custom house","ด่านศุลกากร",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Imigresen", "Custom house", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sin-kha","","barangan  dagangan","Goods","สินค้า",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("barangan  dagangan", "Goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tha","","Pelabuhan ","Dock warehouse","ท่า",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Pelabuhan ", "Dock warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nang-sue-rap-rong","","Surat jaminan","Certificate","หนังสือรับรอง",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat jaminan", "Certificate", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nam-khao","","Impot","Import","นำเข้า",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Impot", "Import", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("song-ork","","Ekspot","Export","ส่งออก",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Ekspot", "Export", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kha-tham-niam","","Yuran","Charge","ค่าธรรมเนียม",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Yuran", "Charge", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("phu-song-ork","","Penghantar barang","Goods deliverer","ผู้ส่งสินค้า",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Penghantar barang", "Goods deliverer", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("phu-rub-sin-kha","","Penerima barang","Goods receiver","ผู้รับสินค้า",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Penerima barang", "Goods receiver", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ko-dang/khlang-sin-kha","","Gudang / Gudang barangan","Warehouse","โกดัง/คลังสินค้า",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Gudang / Gudang barangan", "Warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pra-kan-phai","","Insuren","Insurance","ประกันภัย",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Insuren", "Insurance", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tua-thaen","","Wakil","Shipping agent","ตัวแทน",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Wakil", "Shipping agent", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("phu-rub-tra-song-sin-kha","","Penerima barang kiriman","Consignee ","ผู้รับตราส่งสินค้า",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Penerima barang kiriman", "Consignee ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mai-lek-tu-sin-kha-lae-mai-lek-thaep-pha-nuek-tu-sinkha","","Nombor kontena dan nombor cap materai kontena","Container and seal number","หมายเลขตู้สินค้าและหมายเลขแถบผนึกตู้สินค้า",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Nombor kontena dan nombor cap materai kontena", "Container and seal number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ba-isang-ploi-sin-kha","","Surat perintah penghantaran barangan","Delivery order","ใบสั่งปล่อยสินค้า",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat perintah penghantaran barangan", "Delivery order", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("rai-kan-sin-kha","","Senarai barangan","Description of goods","รายการสินค้า",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Senarai barangan", "Description of goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kha-khuen-tu-sin-kha-tee-cha-koen-kwa-tee-kam-not","","Bayaran memulangkan  kontena  terlewat dari  masa   yang ditetapkan","Detention","ค่าคืนตู้สินค้าที่ช้าเกินกว่าเวลาที่กำหนด",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Bayaran memulangkan  kontena  terlewat dari  masa   yang ditetapkan", "Detention", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kha-ek-ka-san","","Yuran dokumen","Document fee","ค่าเอกสาร",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Yuran dokumen", "Document fee", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tua-thaen-phu-rap-khon-song-sin-kha","","Wakil penerima pengangkutan barangan","Freight forwarder","ตัวแทนผู้รับขนส่งสินค้า",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Wakil penerima pengangkutan barangan", "Freight forwarder", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sin-kha-an-ta-rai","","Barangan merbahaya","Dangerous goods","สินค้าอันตราย",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Barangan merbahaya", "Dangerous goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khrueang-mai-lae-mai-hipho-khong-sin-kha","","Tanda dan nombor peti barangan","Shipping mark and number","เครื่องหมายและเลขหมายหีบห่อของสินค้า",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tanda dan nombor peti barangan", "Shipping mark and number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bai-song-sin-kha","","Surat hantar barangan","Invoice","ใบส่งสินค้า",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat hantar barangan", "Invoice", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bai-rub-sin-kha","","Surat terima barangan","Bill of lading","ใบรับสินค้า",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat terima barangan", "Bill of lading", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("thang-khao - thang-ork","","Jalan masuk-jalan keluar","Entrance - Exit","ทางเข้า -ทางออก",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Jalan masuk-jalan keluar", "Entrance - Exit", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("phom-ma-rap-sin-kha-lae-aow-bai-song-ploi-sin-kha-ma-yuen-yan-pom-rup-sin-kha-dai-loei-mai-khrap","","Saya datang untuk mengambil  barang bersama dengan surat  perintah penghantaranbarangan saya boleh terimabarang kah?","I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ","ผมมารับสินค้าและเอาใบส่งปล่อยสินค้ามายืนยัน ผมรับสินค้าได้เลยไหมครับ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya datang untuk mengambil  barang bersama dengan surat  perintah penghantaranbarangan saya boleh terimabarang kah?", "I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToBrunei(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ee-mee-kray-sen","","Imigresen","Custom house","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Imigresen", "Custom house", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ba-ra-ngun-da-ka-ngun","","barangan  dagangan","Goods","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("barangan  dagangan", "Goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("per-la-boo-hun","","Pelabuhan ","Dock warehouse","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Pelabuhan ", "Dock warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soo-rut-ya-mee-nun","","Surat jaminan","Certificate","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat jaminan", "Certificate", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("im-pot","","Impot","Import","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Impot", "Import", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ex-pot","","Ekspot","Export","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Ekspot", "Export", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yoo-run","","Yuran","Charge","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Yuran", "Charge", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("perng-hun-tul-ba-rung","","Penghantar barang","Goods deliverer","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Penghantar barang", "Goods deliverer", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("per-ner-ree-ma-ba-rung","","Penerima barang","Goods receiver","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Penerima barang", "Goods receiver", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("koo-dung / koo-dung- ba-rung-gun","","Gudang / Gudang barangan","Warehouse","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Gudang / Gudang barangan", "Warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("in-soo-rern","","Insuren","Insurance","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Insuren", "Insurance", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wa-geel","","Wakil","Shipping agent","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Wakil", "Shipping agent", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("per-ner-ree-ma-ba-rung-gee-ree-mun","","Penerima barang kiriman","Consignee ","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Penerima barang kiriman", "Consignee ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("noam-bol-goan-tay-na-darn-noam-bol-jub-mer-ter-ray-goan-tay-na","","Nombor kontena dan nombor cap materai kontena","Container and seal number","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Nombor kontena dan nombor cap materai kontena", "Container and seal number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soo-rut-per-rin-tah-perng-hun-ta-run ba-ra-ngun","","Surat perintah penghantaran barangan","Delivery order","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat perintah penghantaran barangan", "Delivery order", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ser-na-rai-ba-ra-ngun","","Senarai barangan","Description of goods","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Senarai barangan", "Description of goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ba-ya-run-mer-moo-lung-gun- goan-tay-na-tern-lay-wat-da-ree-ma-sa-yong-dee-ter-tub-gun","","Bayaran memulangkan  kontena  terlewat dari  masa   yang ditetapkan","Detention","",null,null);
                child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Bayaran memulangkan  kontena  terlewat dari  masa   yang ditetapkan", "Detention", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yoo-run-doe-goo-mern","","Yuran dokumen","Document fee","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Yuran dokumen", "Document fee", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wa-geel-per-ner-ree-ma-per-ngung-goo-tun-ba-ra-ngun","","Wakil penerima pengangkutan barangan","Freight forwarder","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Wakil penerima pengangkutan barangan", "Freight forwarder", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ba-ra-ngun-mern-ba-ha-ya","","Barangan merbahaya","Dangerous goods","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Barangan merbahaya", "Dangerous goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tun-da-darn-noam-bol-per-tee-ba-ra-ngun","","Tanda dan nombor peti barangan","Shipping mark and number","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tanda dan nombor peti barangan", "Shipping mark and number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soo-rut-hun-tan-ba-ra-ngun","","Surat hantar barangan","Invoice","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat hantar barangan", "Invoice", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soo-rut-ter-ree-ma-ba-ra-ngun","","Surat terima barangan","Bill of lading","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat terima barangan", "Bill of lading", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ya-lun-ma-sook-ya-lun-ger-loo-wal","","Jalan masuk-jalan keluar","Entrance - Exit","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Jalan masuk-jalan keluar", "Entrance - Exit", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-da-tung-oon-took-mer-ngum-beel-ba-rang-bern-sa-ma-der-ngun-soo-rut-per-rin-tah-perng-hun-ta-run-ba-ra-ngun-sa-ya-boe-leh-ter-ree-ma-ba-rung-gah","","Saya datang untuk mengambil  barang bersama dengan surat  perintah penghantaranbarangan saya boleh terimabarang kah?","I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ","",null,null);
                child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya datang untuk mengambil  barang bersama dengan surat  perintah penghantaranbarangan saya boleh terimabarang kah?", "I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToCambodia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("�phnaek-goai","","Imigresen","Custom house","�???????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Imigresen", "Custom house", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("�toom-neun","","barangan  dagangan","Goods","?????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("barangan  dagangan", "Goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("�gom-puang-phae","","Pelabuhan ","Dock warehouse","�???????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Pelabuhan ", "Dock warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("�aek-gah-sa-bon-jiah","","Surat jaminan","Certificate","�????????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat jaminan", "Certificate", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("nuam-joen","","Impot","Import","�??????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Impot", "Import", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("nuam-jern","","Ekspot","Export","�??????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Ekspot", "Export", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("thlai-joh-bon-jee","","Yuran","Charge","�????????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Yuran", "Charge", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("niah-bon-joon-toom-neun","","Penghantar barang","Goods deliverer","�???????????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Penghantar barang", "Goods deliverer", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("niah-tao-tual-toom-neun","","Penerima barang","Goods receiver","�?????????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Penerima barang", "Goods receiver", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("kliang/kliang-toom-neun","","Gudang / Gudang barangan","Warehouse","�??????/???????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Gudang / Gudang barangan", "Warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("thia-nia-rub-roang","","Insuren","Insurance","�???????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Insuren", "Insurance", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("niah-dom-narng","","Wakil","Shipping agent","�?????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Wakil", "Shipping agent", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("�niah-tao-tual-bon-took-phnaek-trar-toom-neun","","Penerima barang kiriman","Consignee ","�????????????????????????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Penerima barang kiriman", "Consignee ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("�lake-too-gong-teu-nui-toom-neun-neung-lake-trar-jua-too-gong-teu- nui-toom-neun","","Nombor kontena dan nombor cap materai kontena","Container and seal number","??????????????????????????????????????????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Nombor kontena dan nombor cap materai kontena", "Container and seal number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("aek-gah-sa-bon-jia-oay-bon-jern-toom-neun","","Surat perintah penghantaran barangan","Delivery order","�????????????????????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat perintah penghantaran barangan", "Delivery order", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("�mook-toom-neun","","Senarai barangan","Description of goods","�????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Senarai barangan", "Description of goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("thlai-gong-teu-nui-dael-bon- joon-groey-pel-way-lia-gom-nord","","Bayaran memulangkan  kontena  terlewat dari  masa   yang ditetapkan","Detention","�??????????????????????????????? ?????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Bayaran memulangkan  kontena  terlewat dari  masa   yang ditetapkan", "Detention", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("thlai -aek-gah-sa","","Yuran dokumen","Document fee","�?????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Yuran dokumen", "Document fee", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("�niah-dorm-narng-khang-toa-tual-bon-took-bon-joon-toom-neun","","Wakil penerima pengangkutan barangan","Freight forwarder","�???????????????????????????? ?????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Wakil penerima pengangkutan barangan", "Freight forwarder", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("�toom-neun-gruah-thnah","","Barangan merbahaya","Dangerous goods","�????????????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Barangan merbahaya", "Dangerous goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("�slark-sun-ya-neung-lake-goat-geh-toom-neun","","Tanda dan nombor peti barangan","Shipping mark and number","�???????????????????????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tanda dan nombor peti barangan", "Shipping mark and number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("aek-gah-sa-bon-joon-toom-neun","","Surat hantar barangan","Invoice","�????????????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat hantar barangan", "Invoice", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("�aek-gah-sa-tao-tual-toom-neun","","Surat terima barangan","Bill of lading","�??????????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat terima barangan", "Bill of lading", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("�phleuw-joen-phleuw-jern","","Jalan masuk-jalan keluar","Entrance - Exit","�???????? ????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Jalan masuk-jalan keluar", "Entrance - Exit", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("kyom-moak-tao-tual-yoak-toom- neun-neung-yoak-neau-aek-gah-sa-bon- jern-toom-neun-moak-bon-jiah- khyom-art- tao-tual-yoak-toom-neun- barn-eui-leuw-tay","","Saya datang untuk mengambil  barang bersama dengan surat  perintah penghantaranbarangan saya boleh terimabarang kah?","I would like to pick up goods. I�m with a delivery order to confirm. Could I receive goods? ","?????????????????? ????????    ????????????????????????? ?????    ???????????????????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya datang untuk mengambil  barang bersama dengan surat  perintah penghantaranbarangan saya boleh terimabarang kah?", "I would like to pick up goods. I�m with a delivery order to confirm. Could I receive goods? ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToIndonesia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("gan-tor- ber-ya-ju-gai","","Imigresen","Custom house","Kantor bea cukai",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Imigresen", "Custom house", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("bar-rang-bar-rang","","barangan  dagangan","Goods","Barang-barang",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("barangan  dagangan", "Goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("peu-lar- bu-han","","Pelabuhan ","Dock warehouse","Pelabuhan ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Pelabuhan ", "Dock warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("soo-rat-peu-ngan-tar","","Surat jaminan","Certificate","Surat pengantar",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat jaminan", "Certificate", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("im-por","","Impot","Import","Impor",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Impot", "Import", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("ex-por","","Ekspot","Export","Ekspor",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Ekspot", "Export", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("bee-yar-yar-ad-mi-nis-tra-see","","Yuran","Charge","Biaya administrasi ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Yuran", "Charge", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("peu-ngee-rim-bar-rang-bar-rang","","Penghantar barang","Goods deliverer","Pengirim barang-barang",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Penghantar barang", "Goods deliverer", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("peu-ner-ree-mar-bar-rang-bar-rang","","Penerima barang","Goods receiver","Penerima barang-barang",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Penerima barang", "Goods receiver", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("gu-dang","","Gudang / Gudang barangan","Warehouse","Gudang",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Gudang / Gudang barangan", "Warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("ar-su-ran-see","","Insuren","Insurance","Asuransi",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Insuren", "Insurance", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("ar-gen-gar-pal","","Wakil","Shipping agent","Agen kapal",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Wakil", "Shipping agent", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("per-ner-ree-mar-bar-rang-bar-rang","","Penerima barang kiriman","Consignee ","Penerima barang-barang",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Penerima barang kiriman", "Consignee ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("no-mor-peu-tee-bar-rang-bar-rang-dan no-mor-seu-gel-peu-tee-bar-rang-bar-rang","","Nombor kontena dan nombor cap materai kontena","Container and seal number","Nomor peti barang-barang dan nomor segel peti barang-barang",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Nombor kontena dan nombor cap materai kontena", "Container and seal number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("su-rat-peu-leu-par-san-bar-rang-bar-rang","","Surat perintah penghantaran barangan","Delivery order","Surat pelepasan barang-barang",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat perintah penghantaran barangan", "Delivery order", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("daf-tar-bar-rang-bar-rang","","Senarai barangan","Description of goods","Daftar barang-barang",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Senarai barangan", "Description of goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("bee-yar-yar-peu-ngeum-bar-lee-yan-peu-tee-bar-rang-bar-rang-yang-ter-lat-mer-ler-bee-hee-wak-tu-yang-dee-teun-tu-kan","","Bayaran memulangkan  kontena  terlewat dari  masa   yang ditetapkan","Detention","Biaya pengembalian peti barang-barang yang telat melebihi waktu yang ditentukan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Bayaran memulangkan  kontena  terlewat dari  masa   yang ditetapkan", "Detention", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("bee-yar-yar -dork-gu-men","","Yuran dokumen","Document fee","Biaya dokumen ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Yuran dokumen", "Document fee", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("ar-gen-peu-ngee-rim-bar-rang","","Wakil penerima pengangkutan barangan","Freight forwarder","Agen pengirim barang ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Wakil penerima pengangkutan barangan", "Freight forwarder", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("bar-rang-bar-rang-ber-bar-har-yar","","Barangan merbahaya","Dangerous goods","Barang-barang berbahaya",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Barangan merbahaya", "Dangerous goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("tan-dar-dan-no-mor-peu-tee-bar-rang-bar-rang","","Tanda dan nombor peti barangan","Shipping mark and number","Tanda dan nomor peti barang-barang",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tanda dan nombor peti barangan", "Shipping mark and number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("fak-tur","","Surat hantar barangan","Invoice","Faktur",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat hantar barangan", "Invoice", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("daf-tar-mu-war-tan-gar-pal","","Surat terima barangan","Bill of lading","Daftar muatan kapal",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat terima barangan", "Bill of lading", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("mar-sook-ger-lu-war","","Jalan masuk-jalan keluar","Entrance - Exit","Masuk � Keluar ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Jalan masuk-jalan keluar", "Entrance - Exit", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("sar-yar-ee-ngin-am-pil-bar-rang-bar-rang   sar-yar-bar-war-su-rat-per-ngan-tar-ser-bar-kai-book-tee  ar-par-sar-yar-bee-sar-am-bil-bar-rang-bar-rang-ter-seu-but-seu-gar-rang","","Saya datang untuk mengambil  barang bersama dengan surat  perintah penghantaranbarangan saya boleh terimabarang kah?","I would like to pick up goods. I�m with a delivery order to confirm. Could I receive goods? ","Saya ingin ambil barang-barang.  Saya bawa surat pengantar sebagai bukti. Apa saya bisa ambil barang-barang tersebut sekarang?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya datang untuk mengambil  barang bersama dengan surat  perintah penghantaranbarangan saya boleh terimabarang kah?", "I would like to pick up goods. I�m with a delivery order to confirm. Could I receive goods? ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToLaos(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("darn-su-lah-ga-gorn","","Imigresen","Custom house","�?????????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Imigresen", "Custom house", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("sin-kha","","barangan  dagangan","Goods","�??????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("barangan  dagangan", "Goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("tha","","Pelabuhan ","Dock warehouse","�???",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Pelabuhan ", "Dock warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("nung-seu-hub-hong","","Surat jaminan","Certificate","�???????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat jaminan", "Certificate", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("num-khao","","Impot","Import","�???????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Impot", "Import", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("song-org","","Ekspot","Export","�???????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Ekspot", "Export", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("kha-tum-niam","","Yuran","Charge","�????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Yuran", "Charge", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("phoo-song-sin-kha","","Penghantar barang","Goods deliverer","�?????????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Penghantar barang", "Goods deliverer", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("phoo-hub-sin-kha","","Penerima barang","Goods receiver","�????????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Penerima barang", "Goods receiver", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("hong-mian-khueang/hong-phuk-khueang","","Gudang / Gudang barangan","Warehouse","�?????????????? / ?????????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Gudang / Gudang barangan", "Warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("pa-kun-phai","","Insuren","Insurance","�???????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Insuren", "Insurance", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("phu-tang-na","","Wakil","Shipping agent","�?????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Wakil", "Shipping agent", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("phoo-hub-ga-song-sin-kha","","Penerima barang kiriman","Consignee ","�??????????????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Penerima barang kiriman", "Consignee ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("mai-leg-too-sin-kha-lae-mai-leg-ga-too-sin-kha","","Nombor kontena dan nombor cap materai kontena","Container and seal number","�?????????????????????????? ?????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Nombor kontena dan nombor cap materai kontena", "Container and seal number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("bai-sung-poi-sin-kha","","Surat perintah penghantaran barangan","Delivery order","�????????????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat perintah penghantaran barangan", "Delivery order", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("lai-garn-sin-kha","","Senarai barangan","Description of goods","�????????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Senarai barangan", "Description of goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("kha-song-kheun-too-sin-kha-thee-sa-gern-gwar-way-la-thee-gum-nod","","Bayaran memulangkan  kontena  terlewat dari  masa   yang ditetapkan","Detention","�????????????????????????????????????? ????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Bayaran memulangkan  kontena  terlewat dari  masa   yang ditetapkan", "Detention", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("kha-aek-ga-sarn","","Yuran dokumen","Document fee"," ???????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Yuran dokumen", "Document fee", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("toe-thaen-phoo-hub-song-sin-kha","","Wakil penerima pengangkutan barangan","Freight forwarder","�?????????????????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Wakil penerima pengangkutan barangan", "Freight forwarder", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("sin-kha-un-ta-lai","","Barangan merbahaya","Dangerous goods","�??????????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Barangan merbahaya", "Dangerous goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("khueang-mai-lae-mai-leg-heeb-khong-sin-kha","","Tanda dan nombor peti barangan","Shipping mark and number","�??????????????????????????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tanda dan nombor peti barangan", "Shipping mark and number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("bai-song-sin-kha","","Surat hantar barangan","Invoice","�????????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat hantar barangan", "Invoice", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("bai-hub-sin-kha","","Surat terima barangan","Bill of lading","�???????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat terima barangan", "Bill of lading", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("tharng-khao-tarng-org","","Jalan masuk-jalan keluar","Entrance - Exit","�???????? - ??????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Jalan masuk-jalan keluar", "Entrance - Exit", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("khoy-ma-hub-sin-kha-lae-ao-bai-song-poi-sin-kha-ma-yung-yuen-khoy-hub-sin-kha-dai-loey-bor","","Saya datang untuk mengambil  barang bersama dengan surat  perintah penghantaranbarangan saya boleh terimabarang kah?","I would like to pick up goods. I�m with a delivery order to confirm. Could I receive goods? ","?????????????????????????????????????????????????????????????????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya datang untuk mengambil  barang bersama dengan surat  perintah penghantaranbarangan saya boleh terimabarang kah?", "I would like to pick up goods. I�m with a delivery order to confirm. Could I receive goods? ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToMalaysia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ee-mee-kray-sen","","Imigresen","Custom house","Imigresen",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Imigresen", "Custom house", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("ba-ra-ngun-da-ka-ngun","","barangan  dagangan","Goods","barangan  dagangan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("barangan  dagangan", "Goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("per-la-boo-hun","","Pelabuhan ","Dock warehouse","Pelabuhan ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Pelabuhan ", "Dock warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("soo-rut-ya-mee-nun","","Surat jaminan","Certificate","Surat jaminan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat jaminan", "Certificate", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("im-pot","","Impot","Import","Impot",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Impot", "Import", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("ex-pot","","Ekspot","Export","Ekspot",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Ekspot", "Export", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("yoo-run","","Yuran","Charge","Yuran",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Yuran", "Charge", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("perng-hun-tul-ba-rung","","Penghantar barang","Goods deliverer","Penghantar barang",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Penghantar barang", "Goods deliverer", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("per-ner-ree-ma-ba-rung","","Penerima barang","Goods receiver","Penerima barang",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Penerima barang", "Goods receiver", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("koo-dung / koo-dung- ba-rung-gun","","Gudang / Gudang barangan","Warehouse","Gudang / Gudang barangan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Gudang / Gudang barangan", "Warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("in-soo-rern","","Insuren","Insurance","Insuren",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Insuren", "Insurance", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("wa-geel","","Wakil","Shipping agent","Wakil",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Wakil", "Shipping agent", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("per-ner-ree-ma-ba-rung-gee-ree-mun","","Penerima barang kiriman","Consignee ","Penerima barang kiriman",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Penerima barang kiriman", "Consignee ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("noam-bol-goan-tay-na-darn-noam-bol-jub-mer-ter-ray-goan-tay-na","","Nombor kontena dan nombor cap materai kontena","Container and seal number","Nombor kontena dan nombor cap materai kontena",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Nombor kontena dan nombor cap materai kontena", "Container and seal number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("soo-rut-per-rin-tah-perng-hun-ta-run ba-ra-ngun","","Surat perintah penghantaran barangan","Delivery order","Surat perintah penghantaran barangan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat perintah penghantaran barangan", "Delivery order", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("ser-na-rai-ba-ra-ngun","","Senarai barangan","Description of goods","Senarai barangan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Senarai barangan", "Description of goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("ba-ya-run-mer-moo-lung-gun- goan-tay-na-tern-lay-wat-da-ree-ma-sa-yong-dee-ter-tub-gun","","Bayaran memulangkan  kontena  terlewat dari  masa   yang ditetapkan","Detention","Bayaran memulangkan  kontena  terlewat dari  masa   yang ditetapkan",null,null);
                child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Bayaran memulangkan  kontena  terlewat dari  masa   yang ditetapkan", "Detention", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("yoo-run-doe-goo-mern","","Yuran dokumen","Document fee","Yuran dokumen",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Yuran dokumen", "Document fee", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("wa-geel-per-ner-ree-ma-per-ngung-goo-tun-ba-ra-ngun","","Wakil penerima pengangkutan barangan","Freight forwarder","Wakil penerima pengangkutan barangan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Wakil penerima pengangkutan barangan", "Freight forwarder", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("ba-ra-ngun-mern-ba-ha-ya","","Barangan merbahaya","Dangerous goods","Barangan merbahaya",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Barangan merbahaya", "Dangerous goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("tun-da-darn-noam-bol-per-tee-ba-ra-ngun","","Tanda dan nombor peti barangan","Shipping mark and number","Tanda dan nombor peti barangan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tanda dan nombor peti barangan", "Shipping mark and number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("soo-rut-hun-tan-ba-ra-ngun","","Surat hantar barangan","Invoice","Surat hantar barangan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat hantar barangan", "Invoice", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("soo-rut-ter-ree-ma-ba-ra-ngun","","Surat terima barangan","Bill of lading","Surat terima barangan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat terima barangan", "Bill of lading", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("ya-lun-ma-sook-ya-lun-ger-loo-wal","","Jalan masuk-jalan keluar","Entrance - Exit","Jalan masuk-jalan keluar",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Jalan masuk-jalan keluar", "Entrance - Exit", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("sa-ya-da-tung-oon-took-mer-ngum-beel-ba-rang-bern-sa-ma-der-ngun-soo-rut-per-rin-tah-perng-hun-ta-run-ba-ra-ngun-sa-ya-boe-leh-ter-ree-ma-ba-rung-gah","","Saya datang untuk mengambil  barang bersama dengan surat  perintah penghantaranbarangan saya boleh terimabarang kah?","I would like to pick up goods. I�m with a delivery order to confirm. Could I receive goods? ","Saya datang untuk mengambil  barang bersama dengan surat  perintah penghantaranbarangan saya boleh terimabarang kah?",null,null);
                child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya datang untuk mengambil  barang bersama dengan surat  perintah penghantaranbarangan saya boleh terimabarang kah?", "I would like to pick up goods. I�m with a delivery order to confirm. Could I receive goods? ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToMyanmar(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("a-kaw-khoon-yong","","Imigresen","Custom house","?????????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Imigresen", "Custom house", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("kong-piat-see","","barangan  dagangan","Goods","??????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("barangan  dagangan", "Goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("se-kan","","Pelabuhan ","Dock warehouse","????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Pelabuhan ", "Dock warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("thaw-khan-sa","","Surat jaminan","Certificate","?????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat jaminan", "Certificate", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("twing-kong","","Impot","Import","?????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Impot", "Import", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("poh-kong","","Ekspot","Export","??? ?????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Ekspot", "Export", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("wun-saw-khah","","Yuran","Charge","?????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Yuran", "Charge", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("kong-poh-too","","Penghantar barang","Goods deliverer","??????? ???",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Penghantar barang", "Goods deliverer", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("kong-laeh-khan-too","","Penerima barang","Goods receiver","???????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Penerima barang", "Goods receiver", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("kong-yong- kong-yong","","Gudang / Gudang barangan","Warehouse","???????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Gudang / Gudang barangan", "Warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("ar-ma-khan","","Insuren","Insurance","?????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Insuren", "Insurance", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("koe-sa-lae","","Wakil","Shipping agent","????????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Wakil", "Shipping agent", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("kong-piat-see-ta-seh-laeh- khan- daeh-too","","Penerima barang kiriman","Consignee ","?????????????????????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Penerima barang kiriman", "Consignee ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("kong-tet-ta-nan-but-naeh kong- tet-ta-ba-koh-nan-but","","Nombor kontena dan nombor cap materai kontena","Container and seal number","???????????????????????????????????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Nombor kontena dan nombor cap materai kontena", "Container and seal number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("kong-ma-lwa","","Surat perintah penghantaran barangan","Delivery order","??????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat perintah penghantaran barangan", "Delivery order", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("kong-piat-see-sa-yin","","Senarai barangan","Description of goods","????????????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Senarai barangan", "Description of goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("a-cheng-loon-daeh-kong- tet-ta- khah","","Bayaran memulangkan  kontena  terlewat dari  masa   yang ditetapkan","Detention","???????????????????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Bayaran memulangkan  kontena  terlewat dari  masa   yang ditetapkan", "Detention", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("sa-ywaeh-sa-dan-khah","","Yuran dokumen","Document fee","?????????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Yuran dokumen", "Document fee", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("kong-piat-see-tae-saw- daeh- koe-sa-lae","","Wakil penerima pengangkutan barangan","Freight forwarder","?????????????????????????????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Wakil penerima pengangkutan barangan", "Freight forwarder", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("an-da-yae-shi-daeh-kong- piat-see","","Barangan merbahaya","Dangerous goods","???????????????????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Barangan merbahaya", "Dangerous goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("kong-piat-see-yaeh-a-mut- naeh, a- thoh-nan-but","","Tanda dan nombor peti barangan","Shipping mark and number","????????????????????????????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tanda dan nombor peti barangan", "Shipping mark and number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("kong-poh-lwa","","Surat hantar barangan","Invoice","????????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat hantar barangan", "Invoice", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("kong-ma-lwa","","Surat terima barangan","Bill of lading","??????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat terima barangan", "Bill of lading", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("win-paw-thwaeh-paw","","Jalan masuk-jalan keluar","Entrance - Exit","???????? - ?????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Jalan masuk-jalan keluar", "Entrance - Exit", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("ja-nor-kong-piat-see-la- yoo-bee  kong-poh-lwa- teen-dae  ja-nor- kong-piat- see yoo- twa-loh-ya- bee-la-kha-mia","","Saya datang untuk mengambil  barang bersama dengan surat  perintah penghantaranbarangan saya boleh terimabarang kah?","I would like to pick up goods. I�m with a delivery order to confirm. Could I receive goods? ","???????????????????????????? ??????????????????? ??????????????????? ?????????????????????????",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya datang untuk mengambil  barang bersama dengan surat  perintah penghantaranbarangan saya boleh terimabarang kah?", "I would like to pick up goods. I�m with a delivery order to confirm. Could I receive goods? ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToPhilippines(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("kas-toms-in-spex-chan","","Imigresen","Custom house","Customs inspeksyon",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Imigresen", "Custom house", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("par-nin-dar","","barangan  dagangan","Goods","paninda",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("barangan  dagangan", "Goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("pu-ey-rar-to","","Pelabuhan ","Dock warehouse","puerto",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Pelabuhan ", "Dock warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("ser-ti-pi-go-nang-gar-ran-ti-yar","","Surat jaminan","Certificate","sertipiko ng garantiya",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat jaminan", "Certificate", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("ang-gat","","Impot","Import","angkat",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Impot", "Import", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("lu-was","","Ekspot","Export","luwas",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Ekspot", "Export", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("bar-yat","","Yuran","Charge","bayad",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Yuran", "Charge", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("nak-par-dar-lar","","Penghantar barang","Goods deliverer","nagpadala",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Penghantar barang", "Goods deliverer", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("tu-mang-gap","","Penerima barang","Goods receiver","Tumanggap",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Penerima barang", "Goods receiver", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("bo-dey-gar-nang-par-nin-dar","","Gudang / Gudang barangan","Warehouse","Bodega ng paninda",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Gudang / Gudang barangan", "Warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("pak-sey-sey-ku-ro","","Insuren","Insurance","pagseseguro",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Insuren", "Insurance", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("gi-nar-tar-wan","","Wakil","Shipping agent","kinatawan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Wakil", "Shipping agent", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("kom-sai-nee-of-goos","","Penerima barang kiriman","Consignee ","Consignee of goods",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Penerima barang kiriman", "Consignee ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("bi-lang-nang-goos-kon-ten-ner-at-nang-sel-yar","","Nombor kontena dan nombor cap materai kontena","Container and seal number","Bilang ng Goods container at ng selya",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Nombor kontena dan nombor cap materai kontena", "Container and seal number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("or-der-sar-pak-dar-dar-lar-nang-gar-lar-gal","","Surat perintah penghantaran barangan","Delivery order","Order sa pagdadala ng kalakal",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat perintah penghantaran barangan", "Delivery order", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("lis-tar-han-nang-mar-ngar-gar-lar-gal","","Senarai barangan","Description of goods","Listahan ng mga kalakal",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Senarai barangan", "Description of goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("mool-tar-sar-hu-ling-pak-sar-sar-u-li-nang-goos-kon-ten-ner","","Bayaran memulangkan  kontena  terlewat dari  masa   yang ditetapkan","Detention","Multa sa huling pagsasauli ng goods container",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Bayaran memulangkan  kontena  terlewat dari  masa   yang ditetapkan", "Detention", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("dog-kiw-men-fee","","Yuran dokumen","Document fee","Document fee",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Yuran dokumen", "Document fee", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("ar-hen-tey-par-rar-sar-dey-li-wer-ree","","Wakil penerima pengangkutan barangan","Freight forwarder","Ahente para sa delivery",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Wakil penerima pengangkutan barangan", "Freight forwarder", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("mar-pan-ngar-nip-nar-mar-ngar-gar-lar-gal","","Barangan merbahaya","Dangerous goods","mapanganib na mga kalakal",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Barangan merbahaya", "Dangerous goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("pi-rar-mar-at-nu-mey-ro-nang-pak-tang-gap-nang-gar-lar-gal","","Tanda dan nombor peti barangan","Shipping mark and number","Pirma at numero ng pagtanggap ng kalakal",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tanda dan nombor peti barangan", "Shipping mark and number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("si-ngi-lin","","Surat hantar barangan","Invoice","singilin",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat hantar barangan", "Invoice", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("gu-wen-tar-nang-pak-gar-gar","","Surat terima barangan","Bill of lading","kuwenta ng pagkarga",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat terima barangan", "Bill of lading", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("pak- par-sok-at-ang-pak-lar-bas","","Jalan masuk-jalan keluar","Entrance - Exit","Pagpasok at ang paglabas",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Jalan masuk-jalan keluar", "Entrance - Exit", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("nan-di-to-ar-go-pa-ra-gu-nin-ang-mar-ngar-gar-lar-gal-har-wak-go-ang-par-pel-par-rar-sar-or-der-for-dey-li-wer-ree-pu-wey-dey-bang-gu-nin-gar-ar-gad-ang-mar-ngar-gar-lar-gal","","Saya datang untuk mengambil  barang bersama dengan surat  perintah penghantaranbarangan saya boleh terimabarang kah?","I would like to pick up goods. I�m with a delivery order to confirm. Could I receive goods? ","Nandito ako para kunin ang mga kalakal. Hawak ko ang papel para sa �order for delivery�.  Puwede bang kunin kaagad ang mga kalakal?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya datang untuk mengambil  barang bersama dengan surat  perintah penghantaranbarangan saya boleh terimabarang kah?", "I would like to pick up goods. I�m with a delivery order to confirm. Could I receive goods? ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToSingapore(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("Custom house","","Imigresen","","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Imigresen", "", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("Goods","","barangan  dagangan","","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("barangan  dagangan", "", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("Dock warehouse","","Pelabuhan ","","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Pelabuhan ", "", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("Certificate","","Surat jaminan","","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat jaminan", "", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("Import","","Impot","","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Impot", "", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("Export","","Ekspot","","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Ekspot", "", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("Charge","","Yuran","","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Yuran", "", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("Goods deliverer","","Penghantar barang","","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Penghantar barang", "", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("Goods receiver","","Penerima barang","","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Penerima barang", "", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("Warehouse","","Gudang / Gudang barangan","","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Gudang / Gudang barangan", "", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("Insurance","","Insuren","","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Insuren", "", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("Shipping agent","","Wakil","","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Wakil", "", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("Consignee ","","Penerima barang kiriman","","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Penerima barang kiriman", "", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("Container and seal number","","Nombor kontena dan nombor cap materai kontena","","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Nombor kontena dan nombor cap materai kontena", "", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("Delivery order","","Surat perintah penghantaran barangan","","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat perintah penghantaran barangan", "", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("Description of goods","","Senarai barangan","","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Senarai barangan", "", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("Detention","","Bayaran memulangkan  kontena  terlewat dari  masa   yang ditetapkan","","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Bayaran memulangkan  kontena  terlewat dari  masa   yang ditetapkan", "", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("Document fee","","Yuran dokumen","","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Yuran dokumen", "", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("Freight forwarder","","Wakil penerima pengangkutan barangan","","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Wakil penerima pengangkutan barangan", "", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("Dangerous goods","","Barangan merbahaya","","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Barangan merbahaya", "", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("Shipping mark and number","","Tanda dan nombor peti barangan","","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tanda dan nombor peti barangan", "", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("Invoice","","Surat hantar barangan","","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat hantar barangan", "", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("Bill of lading","","Surat terima barangan","","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat terima barangan", "", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("Entrance - Exit","","Jalan masuk-jalan keluar","","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Jalan masuk-jalan keluar", "", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("I would like to pick up goods. I�m with a delivery order to confirm. Could I receive goods? ","","Saya datang untuk mengambil  barang bersama dengan surat  perintah penghantaranbarangan saya boleh terimabarang kah?","","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya datang untuk mengambil  barang bersama dengan surat  perintah penghantaranbarangan saya boleh terimabarang kah?", "", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToVietnam(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("hai-kwan","","Imigresen","Custom house","ha?i quan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Imigresen", "Custom house", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("hang-hwa","","barangan  dagangan","Goods","ha?ng ho?a",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("barangan  dagangan", "Goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("kong-tram-ben","","Pelabuhan ","Dock warehouse","c??ng, tra?m, b??n",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Pelabuhan ", "Dock warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("yuai-jing-yern","","Surat jaminan","Certificate","gi??y ch??ng nh??n",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat jaminan", "Certificate", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("yerb-khoeu","","Impot","Import","nh??p kh??u",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Impot", "Import", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("suad-khoeu","","Ekspot","Export","xu??t kh??u",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Ekspot", "Export", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("lay-fee","","Yuran","Charge","l?? phi?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Yuran", "Charge", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("ngeau-kuew-hang","","Penghantar barang","Goods deliverer","ng???i g??i ha?ng",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Penghantar barang", "Goods deliverer", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("ngeau-yern-hang","","Penerima barang","Goods receiver","ng???i nh??n ha?ng",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Penerima barang", "Goods receiver", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("khor / khor-hang","","Gudang / Gudang barangan","Warehouse","kho / kho ha?ng",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Gudang / Gudang barangan", "Warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("boa-hium","","Insuren","Insurance","ba?o hi??m",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Insuren", "Insurance", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("ngeau-dai-yean","","Wakil","Shipping agent","ng???i ?a?i di??n",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Wakil", "Shipping agent", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("ngeau-yern-hang-san-ferm","","Penerima barang kiriman","Consignee ","ng???i nh??n ha?ng sa?n ph??m",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Penerima barang kiriman", "Consignee ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("soe-thung-container-wa-soe-korn-yue-kua-thung-container","","Nombor kontena dan nombor cap materai kontena","Container and seal number","s?? thu?ng container va? s?? con d??u cu?a thu?ng container",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Nombor kontena dan nombor cap materai kontena", "Container and seal number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("yuai-fab-jor-guew-hang","","Surat perintah penghantaran barangan","Delivery order","gi??y phe?p cho gu?i ha?ng",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat perintah penghantaran barangan", "Delivery order", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("yan-suk-hang-hwa","","Senarai barangan","Description of goods","danh sa?ch ha?ng ho?a",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Senarai barangan", "Description of goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("tien-fard-container-den-jum-kwa-han-den","","Bayaran memulangkan  kontena  terlewat dari  masa   yang ditetapkan","Detention","ti??n pha?t container ???n ch??m qua? ha?n ?i?nh",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Bayaran memulangkan  kontena  terlewat dari  masa   yang ditetapkan", "Detention", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("tien-larm-yeaw-ter","","Yuran dokumen","Document fee","ti??n la?m gi??y t??",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Yuran dokumen", "Document fee", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("dai-lee-wern-tai-hang-hwa","","Wakil penerima pengangkutan barangan","Freight forwarder","?a?i ly? v??n ta?i ha?ng ho?a",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Wakil penerima pengangkutan barangan", "Freight forwarder", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("hang-ngui-heim","","Barangan merbahaya","Dangerous goods","ha?ng nguy hi??m",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Barangan merbahaya", "Dangerous goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("yarn-hiaw-hwa-soe-hiaw-kua-boa-bi-san-ferm","","Tanda dan nombor peti barangan","Shipping mark and number","nha?n hi??u va? s?? hi??u cu?a bao bi? sa?n ph??m",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tanda dan nombor peti barangan", "Shipping mark and number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("hwa-dern-kuew-hang","","Surat hantar barangan","Invoice","ho?a ??n g??i ha?ng ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat hantar barangan", "Invoice", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("hwa-dern-yern-hang","","Surat terima barangan","Bill of lading","ho?a ??n nh??n ha?ng ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat terima barangan", "Bill of lading", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("loi-wow-loi-ra","","Jalan masuk-jalan keluar","Entrance - Exit","l??i va?o - l??i ra",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Jalan masuk-jalan keluar", "Entrance - Exit", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        child = new Child("toay-den-yern-hang-hwa-dam-yuai-fab-jor-kuey-hang-den-larm-bung, toay-kor-thay-lun-hang-ngai-khong-ar","","Saya datang untuk mengambil  barang bersama dengan surat  perintah penghantaranbarangan saya boleh terimabarang kah?","I would like to pick up goods. I�m with a delivery order to confirm. Could I receive goods? ","t?i ???n nh??n ha?ng va? ?em gi??y phe?p cho g??i ha?ng ???n la?m b??ng, t?i co? th?? la?nh ha?ng ngay kh?ng a??",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya datang untuk mengambil  barang bersama dengan surat  perintah penghantaranbarangan saya boleh terimabarang kah?", "I would like to pick up goods. I�m with a delivery order to confirm. Could I receive goods? ", childList);
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
