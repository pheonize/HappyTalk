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
        Child child = new Child(" phnaek-goai","","Imigresen","Custom house"," ផ្នែកគយ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Imigresen", "Custom house", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" toom-neun","","barangan  dagangan","Goods","ទំនិញ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("barangan  dagangan", "Goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" gom-puang-phae","","Pelabuhan ","Dock warehouse"," កំពង់ផែ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Pelabuhan ", "Dock warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" aek-gah-sa-bon-jiah","","Surat jaminan","Certificate"," ឯកសារបញ្ជាក់",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat jaminan", "Certificate", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nuam-joen","","Impot","Import"," នាំចូល",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Impot", "Import", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nuam-jern","","Ekspot","Export"," នាំចេញ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Ekspot", "Export", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("thlai-joh-bon-jee","","Yuran","Charge"," ថ្លៃចុះបញ្ជី",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Yuran", "Charge", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("niah-bon-joon-toom-neun","","Penghantar barang","Goods deliverer"," អ្នកបញ្ជូនទំនិញ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Penghantar barang", "Goods deliverer", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("niah-tao-tual-toom-neun","","Penerima barang","Goods receiver"," អ្នកទទួលទំនិញ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Penerima barang", "Goods receiver", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kliang/kliang-toom-neun","","Gudang / Gudang barangan","Warehouse"," ឃ្លាំង/ឃ្លាំងទំនិញ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Gudang / Gudang barangan", "Warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("thia-nia-rub-roang","","Insuren","Insurance"," ធានារ៉ាប់រង",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Insuren", "Insurance", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("niah-dom-narng","","Wakil","Shipping agent"," អ្នកតំណាង",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Wakil", "Shipping agent", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" niah-tao-tual-bon-took-phnaek-trar-toom-neun","","Penerima barang kiriman","Consignee "," អ្នកទទួលបន្ទុកផ្នែកត្រាទំនិញ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Penerima barang kiriman", "Consignee ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" lake-too-gong-teu-nui-toom-neun-neung-lake-trar-jua-too-gong-teu- nui-toom-neun","","Nombor kontena dan nombor cap materai kontena","Container and seal number","លេខទូកុងទឺណ័រទំនិញនិងលេខត្រាជ័រទូកុងទឺណ័រទំនិញ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Nombor kontena dan nombor cap materai kontena", "Container and seal number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("aek-gah-sa-bon-jia-oay-bon-jern-toom-neun","","Surat perintah penghantaran barangan","Delivery order"," ឯកសារបញ្ចាឲ្យបញ្ចេញទំនិញ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat perintah penghantaran barangan", "Delivery order", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" mook-toom-neun","","Senarai barangan","Description of goods"," មុខទំនិញ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Senarai barangan", "Description of goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("thlai-gong-teu-nui-dael-bon- joon-groey-pel-way-lia-gom-nord","","Bayaran memulangkan  kontena  terlewat dari  masa   yang ditetapkan","Detention"," ថ្លៃទូកុងទឺណ័រដែលបញ្ជូនក្រោយពេល វេលាកំណត់",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Bayaran memulangkan  kontena  terlewat dari  masa   yang ditetapkan", "Detention", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("thlai -aek-gah-sa","","Yuran dokumen","Document fee"," ថ្លៃឯកសារ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Yuran dokumen", "Document fee", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" niah-dorm-narng-khang-toa-tual-bon-took-bon-joon-toom-neun","","Wakil penerima pengangkutan barangan","Freight forwarder"," អ្នកតំណាងខាងទទួលបន្ទុកបញ្ជូន ទំនិញ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Wakil penerima pengangkutan barangan", "Freight forwarder", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" toom-neun-gruah-thnah","","Barangan merbahaya","Dangerous goods"," ទំនិញគ្រោះថ្នាក់",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Barangan merbahaya", "Dangerous goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" slark-sun-ya-neung-lake-goat-geh-toom-neun","","Tanda dan nombor peti barangan","Shipping mark and number"," ស្លាកសញ្ញានិងលេខកូដកេះទំនិញ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tanda dan nombor peti barangan", "Shipping mark and number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("aek-gah-sa-bon-joon-toom-neun","","Surat hantar barangan","Invoice"," ឯកសារបញ្ជូនទំនិញ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat hantar barangan", "Invoice", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" aek-gah-sa-tao-tual-toom-neun","","Surat terima barangan","Bill of lading"," ឯកសារទទួលទំនិញ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat terima barangan", "Bill of lading", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" phleuw-joen-phleuw-jern","","Jalan masuk-jalan keluar","Entrance - Exit"," ផ្លូវចូល ផ្លូវចេញ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Jalan masuk-jalan keluar", "Entrance - Exit", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kyom-moak-tao-tual-yoak-toom- neun-neung-yoak-neau-aek-gah-sa-bon- jern-toom-neun-moak-bon-jiah- khyom-art- tao-tual-yoak-toom-neun- barn-eui-leuw-tay","","Saya datang untuk mengambil  barang bersama dengan surat  perintah penghantaranbarangan saya boleh terimabarang kah?","I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ","ខ្ញុំមកទទួលយកទំនិញ និងយកនូវ    ឯកសារបញ្ចេញទំនិញមកបញ្ជាក់ ខ្ញុំ    អាចទទួលយកទំនិញបានឥឡូវទេ",null,null);
                child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya datang untuk mengambil  barang bersama dengan surat  perintah penghantaranbarangan saya boleh terimabarang kah?", "I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ", childList);
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
        childList = new ArrayList<Child>();
        child = new Child("bar-rang-bar-rang","","barangan  dagangan","Goods","Barang-barang",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("barangan  dagangan", "Goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("peu-lar- bu-han","","Pelabuhan ","Dock warehouse","Pelabuhan ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Pelabuhan ", "Dock warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soo-rat-peu-ngan-tar","","Surat jaminan","Certificate","Surat pengantar",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat jaminan", "Certificate", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("im-por","","Impot","Import","Impor",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Impot", "Import", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ex-por","","Ekspot","Export","Ekspor",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Ekspot", "Export", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bee-yar-yar-ad-mi-nis-tra-see","","Yuran","Charge","Biaya administrasi ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Yuran", "Charge", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("peu-ngee-rim-bar-rang-bar-rang","","Penghantar barang","Goods deliverer","Pengirim barang-barang",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Penghantar barang", "Goods deliverer", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("peu-ner-ree-mar-bar-rang-bar-rang","","Penerima barang","Goods receiver","Penerima barang-barang",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Penerima barang", "Goods receiver", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gu-dang","","Gudang / Gudang barangan","Warehouse","Gudang",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Gudang / Gudang barangan", "Warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ar-su-ran-see","","Insuren","Insurance","Asuransi",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Insuren", "Insurance", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ar-gen-gar-pal","","Wakil","Shipping agent","Agen kapal",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Wakil", "Shipping agent", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("per-ner-ree-mar-bar-rang-bar-rang","","Penerima barang kiriman","Consignee ","Penerima barang-barang",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Penerima barang kiriman", "Consignee ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("no-mor-peu-tee-bar-rang-bar-rang-dan no-mor-seu-gel-peu-tee-bar-rang-bar-rang","","Nombor kontena dan nombor cap materai kontena","Container and seal number","Nomor peti barang-barang dan nomor segel peti barang-barang",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Nombor kontena dan nombor cap materai kontena", "Container and seal number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("su-rat-peu-leu-par-san-bar-rang-bar-rang","","Surat perintah penghantaran barangan","Delivery order","Surat pelepasan barang-barang",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat perintah penghantaran barangan", "Delivery order", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("daf-tar-bar-rang-bar-rang","","Senarai barangan","Description of goods","Daftar barang-barang",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Senarai barangan", "Description of goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bee-yar-yar-peu-ngeum-bar-lee-yan-peu-tee-bar-rang-bar-rang-yang-ter-lat-mer-ler-bee-hee-wak-tu-yang-dee-teun-tu-kan","","Bayaran memulangkan  kontena  terlewat dari  masa   yang ditetapkan","Detention","Biaya pengembalian peti barang-barang yang telat melebihi waktu yang ditentukan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Bayaran memulangkan  kontena  terlewat dari  masa   yang ditetapkan", "Detention", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bee-yar-yar -dork-gu-men","","Yuran dokumen","Document fee","Biaya dokumen ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Yuran dokumen", "Document fee", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ar-gen-peu-ngee-rim-bar-rang","","Wakil penerima pengangkutan barangan","Freight forwarder","Agen pengirim barang ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Wakil penerima pengangkutan barangan", "Freight forwarder", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bar-rang-bar-rang-ber-bar-har-yar","","Barangan merbahaya","Dangerous goods","Barang-barang berbahaya",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Barangan merbahaya", "Dangerous goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tan-dar-dan-no-mor-peu-tee-bar-rang-bar-rang","","Tanda dan nombor peti barangan","Shipping mark and number","Tanda dan nomor peti barang-barang",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tanda dan nombor peti barangan", "Shipping mark and number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fak-tur","","Surat hantar barangan","Invoice","Faktur",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat hantar barangan", "Invoice", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("daf-tar-mu-war-tan-gar-pal","","Surat terima barangan","Bill of lading","Daftar muatan kapal",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat terima barangan", "Bill of lading", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mar-sook-ger-lu-war","","Jalan masuk-jalan keluar","Entrance - Exit","Masuk – Keluar ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Jalan masuk-jalan keluar", "Entrance - Exit", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-am-pil-bar-rang-bar-rang   sar-yar-bar-war-su-rat-per-ngan-tar-ser-bar-kai-book-tee  ar-par-sar-yar-bee-sar-am-bil-bar-rang-bar-rang-ter-seu-but-seu-gar-rang","","Saya datang untuk mengambil  barang bersama dengan surat  perintah penghantaranbarangan saya boleh terimabarang kah?","I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ","Saya ingin ambil barang-barang.  Saya bawa surat pengantar sebagai bukti. Apa saya bisa ambil barang-barang tersebut sekarang?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya datang untuk mengambil  barang bersama dengan surat  perintah penghantaranbarangan saya boleh terimabarang kah?", "I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToLaos(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("darn-su-lah-ga-gorn","","Imigresen","Custom house"," ດ່ານສຸລະກາກອນ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Imigresen", "Custom house", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sin-kha","","barangan  dagangan","Goods"," ສິນຄ້າ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("barangan  dagangan", "Goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tha","","Pelabuhan ","Dock warehouse"," ທ່າ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Pelabuhan ", "Dock warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nung-seu-hub-hong","","Surat jaminan","Certificate"," ໜັງສືຮັບຮອງ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat jaminan", "Certificate", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("num-khao","","Impot","Import"," ນຳເຂົ້າ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Impot", "Import", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("song-org","","Ekspot","Export"," ສົ່ງອອກ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Ekspot", "Export", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kha-tum-niam","","Yuran","Charge"," ຄ່າທຳນຽມ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Yuran", "Charge", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("phoo-song-sin-kha","","Penghantar barang","Goods deliverer"," ຜູ້ສົ່ງສິນຄ້າ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Penghantar barang", "Goods deliverer", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("phoo-hub-sin-kha","","Penerima barang","Goods receiver"," ຜູ້ຮັບສິນຄ້າ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Penerima barang", "Goods receiver", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-mian-khueang/hong-phuk-khueang","","Gudang / Gudang barangan","Warehouse"," ຫ້ອງມ້ຽນເຄື່ອງ / ຫ້ອງພັກເຄື່ອງ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Gudang / Gudang barangan", "Warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pa-kun-phai","","Insuren","Insurance"," ປະກັນໄພ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Insuren", "Insurance", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("phu-tang-na","","Wakil","Shipping agent"," ຜູ້ຕາງໜ້າ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Wakil", "Shipping agent", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("phoo-hub-ga-song-sin-kha","","Penerima barang kiriman","Consignee "," ຜູ້ຮັບກາສົ່ງສິນຄ້າ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Penerima barang kiriman", "Consignee ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mai-leg-too-sin-kha-lae-mai-leg-ga-too-sin-kha","","Nombor kontena dan nombor cap materai kontena","Container and seal number"," ໝາຍເລກຕູ້ສິນຄ້າແລະໝາຍເລກກາ ຕູ້ສິນຄ້າ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Nombor kontena dan nombor cap materai kontena", "Container and seal number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bai-sung-poi-sin-kha","","Surat perintah penghantaran barangan","Delivery order"," ໃບສັ່ງປ່ອຍສິນຄ້າ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat perintah penghantaran barangan", "Delivery order", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("lai-garn-sin-kha","","Senarai barangan","Description of goods"," ລາຍການສິນຄ້າ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Senarai barangan", "Description of goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kha-song-kheun-too-sin-kha-thee-sa-gern-gwar-way-la-thee-gum-nod","","Bayaran memulangkan  kontena  terlewat dari  masa   yang ditetapkan","Detention"," ຄ່າສົ່ງຄືນຕູ້ສິນຄ້າທີ່ຊ້າເກີນກວ່າເວລາ ທີ່ກຳໜົດ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Bayaran memulangkan  kontena  terlewat dari  masa   yang ditetapkan", "Detention", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kha-aek-ga-sarn","","Yuran dokumen","Document fee"," ຄ່າເອກກະສານ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Yuran dokumen", "Document fee", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toe-thaen-phoo-hub-song-sin-kha","","Wakil penerima pengangkutan barangan","Freight forwarder"," ໂຕແທນຜູ້ຮັບສົ່ງສິນຄ້າ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Wakil penerima pengangkutan barangan", "Freight forwarder", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sin-kha-un-ta-lai","","Barangan merbahaya","Dangerous goods"," ສິນຄ້າອັນຕະລາຍ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Barangan merbahaya", "Dangerous goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khueang-mai-lae-mai-leg-heeb-khong-sin-kha","","Tanda dan nombor peti barangan","Shipping mark and number"," ເຄື່ອງໝາຍແລະໝາຍເລກຫີບຂອງສິນຄ້າ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tanda dan nombor peti barangan", "Shipping mark and number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bai-song-sin-kha","","Surat hantar barangan","Invoice"," ໃບສົ່ງສິນຄ້າ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat hantar barangan", "Invoice", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bai-hub-sin-kha","","Surat terima barangan","Bill of lading"," ໃບຮັບສິນຄ້າ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat terima barangan", "Bill of lading", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tharng-khao-tarng-org","","Jalan masuk-jalan keluar","Entrance - Exit"," ທາງເຂົ້າ - ທາງອອກ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Jalan masuk-jalan keluar", "Entrance - Exit", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-ma-hub-sin-kha-lae-ao-bai-song-poi-sin-kha-ma-yung-yuen-khoy-hub-sin-kha-dai-loey-bor","","Saya datang untuk mengambil  barang bersama dengan surat  perintah penghantaranbarangan saya boleh terimabarang kah?","I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ","ຂ້ອຍມາຮັບສິນຄ້າແລະເອົາໃບສົ່ງປ່ອຍສິນຄ້າມາຢັ້ງຢືນຂ້ອຍຮັບສິນຄ້າໄດ້ເລີຍບໍ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya datang untuk mengambil  barang bersama dengan surat  perintah penghantaranbarangan saya boleh terimabarang kah?", "I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ", childList);
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
        childList = new ArrayList<Child>();
        child = new Child("ba-ra-ngun-da-ka-ngun","","barangan  dagangan","Goods","barangan  dagangan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("barangan  dagangan", "Goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("per-la-boo-hun","","Pelabuhan ","Dock warehouse","Pelabuhan ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Pelabuhan ", "Dock warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soo-rut-ya-mee-nun","","Surat jaminan","Certificate","Surat jaminan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat jaminan", "Certificate", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("im-pot","","Impot","Import","Impot",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Impot", "Import", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ex-pot","","Ekspot","Export","Ekspot",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Ekspot", "Export", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yoo-run","","Yuran","Charge","Yuran",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Yuran", "Charge", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("perng-hun-tul-ba-rung","","Penghantar barang","Goods deliverer","Penghantar barang",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Penghantar barang", "Goods deliverer", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("per-ner-ree-ma-ba-rung","","Penerima barang","Goods receiver","Penerima barang",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Penerima barang", "Goods receiver", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("koo-dung / koo-dung- ba-rung-gun","","Gudang / Gudang barangan","Warehouse","Gudang / Gudang barangan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Gudang / Gudang barangan", "Warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("in-soo-rern","","Insuren","Insurance","Insuren",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Insuren", "Insurance", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wa-geel","","Wakil","Shipping agent","Wakil",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Wakil", "Shipping agent", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("per-ner-ree-ma-ba-rung-gee-ree-mun","","Penerima barang kiriman","Consignee ","Penerima barang kiriman",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Penerima barang kiriman", "Consignee ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("noam-bol-goan-tay-na-darn-noam-bol-jub-mer-ter-ray-goan-tay-na","","Nombor kontena dan nombor cap materai kontena","Container and seal number","Nombor kontena dan nombor cap materai kontena",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Nombor kontena dan nombor cap materai kontena", "Container and seal number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soo-rut-per-rin-tah-perng-hun-ta-run ba-ra-ngun","","Surat perintah penghantaran barangan","Delivery order","Surat perintah penghantaran barangan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat perintah penghantaran barangan", "Delivery order", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ser-na-rai-ba-ra-ngun","","Senarai barangan","Description of goods","Senarai barangan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Senarai barangan", "Description of goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ba-ya-run-mer-moo-lung-gun- goan-tay-na-tern-lay-wat-da-ree-ma-sa-yong-dee-ter-tub-gun","","Bayaran memulangkan  kontena  terlewat dari  masa   yang ditetapkan","Detention","Bayaran memulangkan  kontena  terlewat dari  masa   yang ditetapkan",null,null);
                child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Bayaran memulangkan  kontena  terlewat dari  masa   yang ditetapkan", "Detention", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yoo-run-doe-goo-mern","","Yuran dokumen","Document fee","Yuran dokumen",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Yuran dokumen", "Document fee", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wa-geel-per-ner-ree-ma-per-ngung-goo-tun-ba-ra-ngun","","Wakil penerima pengangkutan barangan","Freight forwarder","Wakil penerima pengangkutan barangan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Wakil penerima pengangkutan barangan", "Freight forwarder", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ba-ra-ngun-mern-ba-ha-ya","","Barangan merbahaya","Dangerous goods","Barangan merbahaya",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Barangan merbahaya", "Dangerous goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tun-da-darn-noam-bol-per-tee-ba-ra-ngun","","Tanda dan nombor peti barangan","Shipping mark and number","Tanda dan nombor peti barangan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tanda dan nombor peti barangan", "Shipping mark and number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soo-rut-hun-tan-ba-ra-ngun","","Surat hantar barangan","Invoice","Surat hantar barangan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat hantar barangan", "Invoice", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soo-rut-ter-ree-ma-ba-ra-ngun","","Surat terima barangan","Bill of lading","Surat terima barangan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat terima barangan", "Bill of lading", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ya-lun-ma-sook-ya-lun-ger-loo-wal","","Jalan masuk-jalan keluar","Entrance - Exit","Jalan masuk-jalan keluar",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Jalan masuk-jalan keluar", "Entrance - Exit", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-da-tung-oon-took-mer-ngum-beel-ba-rang-bern-sa-ma-der-ngun-soo-rut-per-rin-tah-perng-hun-ta-run-ba-ra-ngun-sa-ya-boe-leh-ter-ree-ma-ba-rung-gah","","Saya datang untuk mengambil  barang bersama dengan surat  perintah penghantaranbarangan saya boleh terimabarang kah?","I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ","Saya datang untuk mengambil  barang bersama dengan surat  perintah penghantaranbarangan saya boleh terimabarang kah?",null,null);
                child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya datang untuk mengambil  barang bersama dengan surat  perintah penghantaranbarangan saya boleh terimabarang kah?", "I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToMyanmar(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("a-kaw-khoon-yong","","Imigresen","Custom house","အေကာက္ခြန္ရံု",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Imigresen", "Custom house", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kong-piat-see","","barangan  dagangan","Goods","ကုန္ပစၥည္း",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("barangan  dagangan", "Goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-kan","","Pelabuhan ","Dock warehouse","ဆိပ္ကမ္း",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Pelabuhan ", "Dock warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("thaw-khan-sa","","Surat jaminan","Certificate","ေထာက္ခံစာ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat jaminan", "Certificate", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("twing-kong","","Impot","Import","သြင္းကုန္",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Impot", "Import", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("poh-kong","","Ekspot","Export","ပုိ ့ကုန္",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Ekspot", "Export", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wun-saw-khah","","Yuran","Charge","၀န္ေဆာင္ခ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Yuran", "Charge", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kong-poh-too","","Penghantar barang","Goods deliverer","ကုန္ပုိ ့သူ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Penghantar barang", "Goods deliverer", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kong-laeh-khan-too","","Penerima barang","Goods receiver","ကုန္လက္ခံသူ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Penerima barang", "Goods receiver", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kong-yong- kong-yong","","Gudang / Gudang barangan","Warehouse","ကုန္ရံု",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Gudang / Gudang barangan", "Warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ar-ma-khan","","Insuren","Insurance","အာမခံ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Insuren", "Insurance", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("koe-sa-lae","","Wakil","Shipping agent","ကိုယ္စားလွယ္",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Wakil", "Shipping agent", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kong-piat-see-ta-seh-laeh- khan- daeh-too","","Penerima barang kiriman","Consignee ","ကုန္ပစၥည္းတံဆပ္လက္ခံတဲ့သူ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Penerima barang kiriman", "Consignee ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kong-tet-ta-nan-but-naeh kong- tet-ta-ba-koh-nan-but","","Nombor kontena dan nombor cap materai kontena","Container and seal number","ကုန္ေသတၱာနံပါတ္နဲ႔ကုန္ေသတၱာဘာကုတ္နံပါတ္",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Nombor kontena dan nombor cap materai kontena", "Container and seal number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kong-ma-lwa","","Surat perintah penghantaran barangan","Delivery order","ကုန္မွာလႊာ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat perintah penghantaran barangan", "Delivery order", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kong-piat-see-sa-yin","","Senarai barangan","Description of goods","ကုန္ပစၥည္းစာရင္း",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Senarai barangan", "Description of goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("a-cheng-loon-daeh-kong- tet-ta- khah","","Bayaran memulangkan  kontena  terlewat dari  masa   yang ditetapkan","Detention","အခ်ိန္လြန္တဲ့ကုန္ေသတၱာခ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Bayaran memulangkan  kontena  terlewat dari  masa   yang ditetapkan", "Detention", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ywaeh-sa-dan-khah","","Yuran dokumen","Document fee","စာ႐ြက္စာတမ္းခ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Yuran dokumen", "Document fee", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kong-piat-see-tae-saw- daeh- koe-sa-lae","","Wakil penerima pengangkutan barangan","Freight forwarder","ကုန္ပစၥည္းသယ္ေဆာင္တဲ့ကိုယ္စားလွယ္",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Wakil penerima pengangkutan barangan", "Freight forwarder", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("an-da-yae-shi-daeh-kong- piat-see","","Barangan merbahaya","Dangerous goods","အႏၲရာယ္ရွိတဲ့ကုန္ပစၥည္း",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Barangan merbahaya", "Dangerous goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kong-piat-see-yaeh-a-mut- naeh, a- thoh-nan-but","","Tanda dan nombor peti barangan","Shipping mark and number","ကုန္ပစၥည္းရဲ့အမွတ္နဲ႔အထုပ္နံပါတ္",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tanda dan nombor peti barangan", "Shipping mark and number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kong-poh-lwa","","Surat hantar barangan","Invoice","ကုန္္ပို႕လႊာ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat hantar barangan", "Invoice", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kong-ma-lwa","","Surat terima barangan","Bill of lading","ကုန္မွာလႊာ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat terima barangan", "Bill of lading", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("win-paw-thwaeh-paw","","Jalan masuk-jalan keluar","Entrance - Exit","ဝင္ေပါက္ - ထြက္ေပါက္",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Jalan masuk-jalan keluar", "Entrance - Exit", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor-kong-piat-see-la- yoo-bee  kong-poh-lwa- teen-dae  ja-nor- kong-piat- see yoo- twa-loh-ya- bee-la-kha-mia","","Saya datang untuk mengambil  barang bersama dengan surat  perintah penghantaranbarangan saya boleh terimabarang kah?","I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ","ကြ်န္ေတာ္ကုန္ပစၥည္းလာယူၿပီ္း ကုန္္ပို႕လႊာတင္တယ္။ ကြ်န္ေတာ္ကုန္ပစၥည္း ယူသြားလို႔ရၿပီ္လားခင္ဗ်ာ။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya datang untuk mengambil  barang bersama dengan surat  perintah penghantaranbarangan saya boleh terimabarang kah?", "I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ", childList);
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
        childList = new ArrayList<Child>();
        child = new Child("par-nin-dar","","barangan  dagangan","Goods","paninda",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("barangan  dagangan", "Goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pu-ey-rar-to","","Pelabuhan ","Dock warehouse","puerto",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Pelabuhan ", "Dock warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ser-ti-pi-go-nang-gar-ran-ti-yar","","Surat jaminan","Certificate","sertipiko ng garantiya",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat jaminan", "Certificate", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ang-gat","","Impot","Import","angkat",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Impot", "Import", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("lu-was","","Ekspot","Export","luwas",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Ekspot", "Export", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bar-yat","","Yuran","Charge","bayad",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Yuran", "Charge", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nak-par-dar-lar","","Penghantar barang","Goods deliverer","nagpadala",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Penghantar barang", "Goods deliverer", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tu-mang-gap","","Penerima barang","Goods receiver","Tumanggap",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Penerima barang", "Goods receiver", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bo-dey-gar-nang-par-nin-dar","","Gudang / Gudang barangan","Warehouse","Bodega ng paninda",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Gudang / Gudang barangan", "Warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pak-sey-sey-ku-ro","","Insuren","Insurance","pagseseguro",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Insuren", "Insurance", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gi-nar-tar-wan","","Wakil","Shipping agent","kinatawan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Wakil", "Shipping agent", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kom-sai-nee-of-goos","","Penerima barang kiriman","Consignee ","Consignee of goods",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Penerima barang kiriman", "Consignee ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bi-lang-nang-goos-kon-ten-ner-at-nang-sel-yar","","Nombor kontena dan nombor cap materai kontena","Container and seal number","Bilang ng Goods container at ng selya",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Nombor kontena dan nombor cap materai kontena", "Container and seal number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("or-der-sar-pak-dar-dar-lar-nang-gar-lar-gal","","Surat perintah penghantaran barangan","Delivery order","Order sa pagdadala ng kalakal",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat perintah penghantaran barangan", "Delivery order", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("lis-tar-han-nang-mar-ngar-gar-lar-gal","","Senarai barangan","Description of goods","Listahan ng mga kalakal",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Senarai barangan", "Description of goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mool-tar-sar-hu-ling-pak-sar-sar-u-li-nang-goos-kon-ten-ner","","Bayaran memulangkan  kontena  terlewat dari  masa   yang ditetapkan","Detention","Multa sa huling pagsasauli ng goods container",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Bayaran memulangkan  kontena  terlewat dari  masa   yang ditetapkan", "Detention", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dog-kiw-men-fee","","Yuran dokumen","Document fee","Document fee",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Yuran dokumen", "Document fee", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ar-hen-tey-par-rar-sar-dey-li-wer-ree","","Wakil penerima pengangkutan barangan","Freight forwarder","Ahente para sa delivery",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Wakil penerima pengangkutan barangan", "Freight forwarder", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mar-pan-ngar-nip-nar-mar-ngar-gar-lar-gal","","Barangan merbahaya","Dangerous goods","mapanganib na mga kalakal",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Barangan merbahaya", "Dangerous goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pi-rar-mar-at-nu-mey-ro-nang-pak-tang-gap-nang-gar-lar-gal","","Tanda dan nombor peti barangan","Shipping mark and number","Pirma at numero ng pagtanggap ng kalakal",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tanda dan nombor peti barangan", "Shipping mark and number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("si-ngi-lin","","Surat hantar barangan","Invoice","singilin",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat hantar barangan", "Invoice", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gu-wen-tar-nang-pak-gar-gar","","Surat terima barangan","Bill of lading","kuwenta ng pagkarga",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat terima barangan", "Bill of lading", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pak- par-sok-at-ang-pak-lar-bas","","Jalan masuk-jalan keluar","Entrance - Exit","Pagpasok at ang paglabas",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Jalan masuk-jalan keluar", "Entrance - Exit", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nan-di-to-ar-go-pa-ra-gu-nin-ang-mar-ngar-gar-lar-gal-har-wak-go-ang-par-pel-par-rar-sar-or-der-for-dey-li-wer-ree-pu-wey-dey-bang-gu-nin-gar-ar-gad-ang-mar-ngar-gar-lar-gal","","Saya datang untuk mengambil  barang bersama dengan surat  perintah penghantaranbarangan saya boleh terimabarang kah?","I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ","Nandito ako para kunin ang mga kalakal. Hawak ko ang papel para sa “order for delivery”.  Puwede bang kunin kaagad ang mga kalakal?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya datang untuk mengambil  barang bersama dengan surat  perintah penghantaranbarangan saya boleh terimabarang kah?", "I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToSingapore(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("cas-tom-haos","","Imigresen","Custom house","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Imigresen", "Custom house", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("goos","","barangan  dagangan","Goods","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("barangan  dagangan", "Goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dok-ware-haos","","Pelabuhan ","Dock warehouse","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Pelabuhan ", "Dock warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ser-ti-fi-ket","","Surat jaminan","Certificate","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat jaminan", "Certificate", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("im-port","","Impot","Import","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Impot", "Import", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ex-port","","Ekspot","Export","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Ekspot", "Export", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("charch","","Yuran","Charge","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Yuran", "Charge", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("goos-dee-li-wer-rer","","Penghantar barang","Goods deliverer","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Penghantar barang", "Goods deliverer", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("goos-ree-seef-wer","","Penerima barang","Goods receiver","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Penerima barang", "Goods receiver", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-haos","","Gudang / Gudang barangan","Warehouse","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Gudang / Gudang barangan", "Warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("in-chua-rans","","Insuren","Insurance","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Insuren", "Insurance", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chip-ping-eh-jent","","Wakil","Shipping agent","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Wakil", "Shipping agent", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kan-sai-nee","","Penerima barang kiriman","Consignee ","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Penerima barang kiriman", "Consignee ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kon-ten-ner-an-sil-nam-ber","","Nombor kontena dan nombor cap materai kontena","Container and seal number","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Nombor kontena dan nombor cap materai kontena", "Container and seal number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-li-wer-ree-or-der","","Surat perintah penghantaran barangan","Delivery order","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat perintah penghantaran barangan", "Delivery order", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dis-crip-chan-of-goos","","Senarai barangan","Description of goods","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Senarai barangan", "Description of goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-ten-chan","","Bayaran memulangkan  kontena  terlewat dari  masa   yang ditetapkan","Detention","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Bayaran memulangkan  kontena  terlewat dari  masa   yang ditetapkan", "Detention", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dok-kio-ment-fee","","Yuran dokumen","Document fee","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Yuran dokumen", "Document fee", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fret-for-ward-der","","Wakil penerima pengangkutan barangan","Freight forwarder","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Wakil penerima pengangkutan barangan", "Freight forwarder", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("den-jer-ras-goos","","Barangan merbahaya","Dangerous goods","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Barangan merbahaya", "Dangerous goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chip-ping-mark-an-nam-ber","","Tanda dan nombor peti barangan","Shipping mark and number","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tanda dan nombor peti barangan", "Shipping mark and number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("in-wois","","Surat hantar barangan","Invoice","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat hantar barangan", "Invoice", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bil-of-led -ding","","Surat terima barangan","Bill of lading","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat terima barangan", "Bill of lading", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("en-trans-ex-sit","","Jalan masuk-jalan keluar","Entrance - Exit","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Jalan masuk-jalan keluar", "Entrance - Exit", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-laik-tu-pik-ap-goos-ai-am-wit-a-dee-li-wer-ree-or-der-to-kon-ferm-kood-ai-ree-seef-goos","","Saya datang untuk mengambil  barang bersama dengan surat  perintah penghantaranbarangan saya boleh terimabarang kah?","I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya datang untuk mengambil  barang bersama dengan surat  perintah penghantaranbarangan saya boleh terimabarang kah?", "I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadBruneiToVietnam(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("hai-kwan","","Imigresen","Custom house","hải quan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("Imigresen", "Custom house", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hang-hwa","","barangan  dagangan","Goods","hàng hóa",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("barangan  dagangan", "Goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kong-tram-ben","","Pelabuhan ","Dock warehouse","cổng, trạm, bến",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Pelabuhan ", "Dock warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yuai-jing-yern","","Surat jaminan","Certificate","giấy chứng nhận",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat jaminan", "Certificate", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yerb-khoeu","","Impot","Import","nhập khẩu",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Impot", "Import", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("suad-khoeu","","Ekspot","Export","xuất khẩu",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Ekspot", "Export", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("lay-fee","","Yuran","Charge","lệ phí",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Yuran", "Charge", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ngeau-kuew-hang","","Penghantar barang","Goods deliverer","người gửi hàng",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Penghantar barang", "Goods deliverer", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ngeau-yern-hang","","Penerima barang","Goods receiver","người nhận hàng",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Penerima barang", "Goods receiver", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khor / khor-hang","","Gudang / Gudang barangan","Warehouse","kho / kho hàng",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Gudang / Gudang barangan", "Warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("boa-hium","","Insuren","Insurance","bảo hiểm",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Insuren", "Insurance", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ngeau-dai-yean","","Wakil","Shipping agent","người đại diện",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Wakil", "Shipping agent", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ngeau-yern-hang-san-ferm","","Penerima barang kiriman","Consignee ","người nhận hàng sản phẩm",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Penerima barang kiriman", "Consignee ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soe-thung-container-wa-soe-korn-yue-kua-thung-container","","Nombor kontena dan nombor cap materai kontena","Container and seal number","số thùng container và số con dấu của thùng container",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Nombor kontena dan nombor cap materai kontena", "Container and seal number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yuai-fab-jor-guew-hang","","Surat perintah penghantaran barangan","Delivery order","giấy phép cho gủi hàng",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat perintah penghantaran barangan", "Delivery order", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yan-suk-hang-hwa","","Senarai barangan","Description of goods","danh sách hàng hóa",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Senarai barangan", "Description of goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tien-fard-container-den-jum-kwa-han-den","","Bayaran memulangkan  kontena  terlewat dari  masa   yang ditetapkan","Detention","tiền phạt container đến chậm quá hạn định",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Bayaran memulangkan  kontena  terlewat dari  masa   yang ditetapkan", "Detention", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tien-larm-yeaw-ter","","Yuran dokumen","Document fee","tiền làm giấy tờ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Yuran dokumen", "Document fee", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dai-lee-wern-tai-hang-hwa","","Wakil penerima pengangkutan barangan","Freight forwarder","đại lý vận tải hàng hóa",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Wakil penerima pengangkutan barangan", "Freight forwarder", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hang-ngui-heim","","Barangan merbahaya","Dangerous goods","hàng nguy hiểm",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Barangan merbahaya", "Dangerous goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yarn-hiaw-hwa-soe-hiaw-kua-boa-bi-san-ferm","","Tanda dan nombor peti barangan","Shipping mark and number","nhãn hiệu và số hiệu của bao bì sản phẩm",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Tanda dan nombor peti barangan", "Shipping mark and number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hwa-dern-kuew-hang","","Surat hantar barangan","Invoice","hóa đơn gửi hàng ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat hantar barangan", "Invoice", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hwa-dern-yern-hang","","Surat terima barangan","Bill of lading","hóa đơn nhận hàng ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Surat terima barangan", "Bill of lading", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("loi-wow-loi-ra","","Jalan masuk-jalan keluar","Entrance - Exit","lối vào - lối ra",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Jalan masuk-jalan keluar", "Entrance - Exit", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-den-yern-hang-hwa-dam-yuai-fab-jor-kuey-hang-den-larm-bung, toay-kor-thay-lun-hang-ngai-khong-ar","","Saya datang untuk mengambil  barang bersama dengan surat  perintah penghantaranbarangan saya boleh terimabarang kah?","I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ","tôi đến nhận hàng và đem giấy phép cho gửi hàng đến làm bằng, tôi có thể lãnh hàng ngay không ạ?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya datang untuk mengambil  barang bersama dengan surat  perintah penghantaranbarangan saya boleh terimabarang kah?", "I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadCambodiaToChina(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("hai-gwan",""," ផ្នែកគយ","Custom house"," 海关",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" ផ្នែកគយ", "Custom house", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hwor","","ទំនិញ","Goods"," 货",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ទំនិញ", "Goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ma-thow",""," កំពង់ផែ","Dock warehouse"," 码头",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" កំពង់ផែ", "Dock warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jerng-soo",""," ឯកសារបញ្ជាក់","Certificate"," 证书",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ឯកសារបញ្ជាក់", "Certificate", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Jin-khow",""," នាំចូល","Import"," 进口",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" នាំចូល", "Import", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("choo-khow",""," នាំចេញ","Export"," 出口",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" នាំចេញ", "Export", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fuai-yong",""," ថ្លៃចុះបញ្ជី","Charge"," 费用",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ថ្លៃចុះបញ្ជី", "Charge", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fa-hwor-jer",""," អ្នកបញ្ជូនទំនិញ","Goods deliverer"," 发货者",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកបញ្ជូនទំនិញ", "Goods deliverer", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sow-hwor-jer",""," អ្នកទទួលទំនិញ","Goods receiver","收货者",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកទទួលទំនិញ", "Goods receiver", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chang-khoo",""," ឃ្លាំង/ឃ្លាំងទំនិញ","Warehouse"," 仓库",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ឃ្លាំង/ឃ្លាំងទំនិញ", "Warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pao-sian",""," ធានារ៉ាប់រង","Insurance"," 保险",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ធានារ៉ាប់រង", "Insurance", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tai-lee",""," អ្នកតំណាង","Shipping agent"," 代理",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកតំណាង", "Shipping agent", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("thee-tun-jer",""," អ្នកទទួលបន្ទុកផ្នែកត្រាទំនិញ","Consignee "," 提单者",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកទទួលបន្ទុកផ្នែកត្រាទំនិញ", "Consignee ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jee-juang-siang-haw-ma","","លេខទូកុងទឺណ័រទំនិញនិងលេខត្រាជ័រទូកុងទឺណ័រទំនិញ","Container and seal number"," 集装箱号码",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("លេខទូកុងទឺណ័រទំនិញនិងលេខត្រាជ័រទូកុងទឺណ័រទំនិញ", "Container and seal number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fa-hwor-tun",""," ឯកសារបញ្ចាឲ្យបញ្ចេញទំនិញ","Delivery order"," 发货单",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ឯកសារបញ្ចាឲ្យបញ្ចេញទំនិញ", "Delivery order", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ching-tun",""," មុខទំនិញ","Description of goods"," 清单",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" មុខទំនិញ", "Description of goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jee-juang-siang-yian-chee-fuai-yong",""," ថ្លៃទូកុងទឺណ័រដែលបញ្ជូនក្រោយពេល វេលាកំណត់","Detention"," 集装箱延期费用",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ថ្លៃទូកុងទឺណ័រដែលបញ្ជូនក្រោយពេល វេលាកំណត់", "Detention", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("foo-in-fuay",""," ថ្លៃឯកសារ","Document fee"," 复印费",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ថ្លៃឯកសារ", "Document fee", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hwor-awin-tay-lee",""," អ្នកតំណាងខាងទទួលបន្ទុកបញ្ជូន ទំនិញ","Freight forwarder"," 货运代理",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកតំណាងខាងទទួលបន្ទុកបញ្ជូន ទំនិញ", "Freight forwarder", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wuai-sian-phin",""," ទំនិញគ្រោះថ្នាក់","Dangerous goods"," 危险品",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ទំនិញគ្រោះថ្នាក់", "Dangerous goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("woo-phin-ming-cherng-her-woo-phin-pian-hao",""," ស្លាកសញ្ញានិងលេខកូដកេះទំនិញ","Shipping mark and number"," 物品名称和物品编号",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ស្លាកសញ្ញានិងលេខកូដកេះទំនិញ", "Shipping mark and number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("song-hwor-tan",""," ឯកសារបញ្ជូនទំនិញ","Invoice","送货单",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ឯកសារបញ្ជូនទំនិញ", "Invoice", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sow-hwor-tan",""," ឯកសារទទួលទំនិញ","Bill of lading"," 收货单",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ឯកសារទទួលទំនិញ", "Bill of lading", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("loo-khow-choo-khow",""," ផ្លូវចូល ផ្លូវចេញ","Entrance - Exit"," 入口- 出口",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ផ្លូវចូល ផ្លូវចេញ", "Entrance - Exit", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-naa-sow-hwor-chew-yern-soo-lai/ wor- sian-jai-kher-yee-soe-hwa-ma","","ខ្ញុំមកទទួលយកទំនិញ និងយកនូវ    ឯកសារបញ្ចេញទំនិញមកបញ្ជាក់ ខ្ញុំ    អាចទទួលយកទំនិញបានឥឡូវទេ","I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? "," 我拿售货确认书来，我现在可以收货吗",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ខ្ញុំមកទទួលយកទំនិញ និងយកនូវ    ឯកសារបញ្ចេញទំនិញមកបញ្ជាក់ ខ្ញុំ    អាចទទួលយកទំនិញបានឥឡូវទេ", "I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadCambodiaToThai(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("dan-sun-la-ka-kon",""," ផ្នែកគយ","Custom house","ด่านศุลกากร",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" ផ្នែកគយ", "Custom house", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sin-kha","","ទំនិញ","Goods","สินค้า",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ទំនិញ", "Goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tha",""," កំពង់ផែ","Dock warehouse","ท่า",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" កំពង់ផែ", "Dock warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nang-sue-rap-rong",""," ឯកសារបញ្ជាក់","Certificate","หนังสือรับรอง",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ឯកសារបញ្ជាក់", "Certificate", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nam-khao",""," នាំចូល","Import","นำเข้า",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" នាំចូល", "Import", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("song-ork",""," នាំចេញ","Export","ส่งออก",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" នាំចេញ", "Export", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kha-tham-niam",""," ថ្លៃចុះបញ្ជី","Charge","ค่าธรรมเนียม",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ថ្លៃចុះបញ្ជី", "Charge", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("phu-song-ork",""," អ្នកបញ្ជូនទំនិញ","Goods deliverer","ผู้ส่งสินค้า",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកបញ្ជូនទំនិញ", "Goods deliverer", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("phu-rub-sin-kha",""," អ្នកទទួលទំនិញ","Goods receiver","ผู้รับสินค้า",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកទទួលទំនិញ", "Goods receiver", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ko-dang/khlang-sin-kha",""," ឃ្លាំង/ឃ្លាំងទំនិញ","Warehouse","โกดัง/คลังสินค้า",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ឃ្លាំង/ឃ្លាំងទំនិញ", "Warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pra-kan-phai",""," ធានារ៉ាប់រង","Insurance","ประกันภัย",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ធានារ៉ាប់រង", "Insurance", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tua-thaen",""," អ្នកតំណាង","Shipping agent","ตัวแทน",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកតំណាង", "Shipping agent", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("phu-rub-tra-song-sin-kha",""," អ្នកទទួលបន្ទុកផ្នែកត្រាទំនិញ","Consignee ","ผู้รับตราส่งสินค้า",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកទទួលបន្ទុកផ្នែកត្រាទំនិញ", "Consignee ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mai-lek-tu-sin-kha-lae-mai-lek-thaep-pha-nuek-tu-sinkha","","លេខទូកុងទឺណ័រទំនិញនិងលេខត្រាជ័រទូកុងទឺណ័រទំនិញ","Container and seal number","หมายเลขตู้สินค้าและหมายเลขแถบผนึกตู้สินค้า",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("លេខទូកុងទឺណ័រទំនិញនិងលេខត្រាជ័រទូកុងទឺណ័រទំនិញ", "Container and seal number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ba-isang-ploi-sin-kha",""," ឯកសារបញ្ចាឲ្យបញ្ចេញទំនិញ","Delivery order","ใบสั่งปล่อยสินค้า",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ឯកសារបញ្ចាឲ្យបញ្ចេញទំនិញ", "Delivery order", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("rai-kan-sin-kha",""," មុខទំនិញ","Description of goods","รายการสินค้า",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" មុខទំនិញ", "Description of goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kha-khuen-tu-sin-kha-tee-cha-koen-kwa-tee-kam-not",""," ថ្លៃទូកុងទឺណ័រដែលបញ្ជូនក្រោយពេល វេលាកំណត់","Detention","ค่าคืนตู้สินค้าที่ช้าเกินกว่าเวลาที่กำหนด",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ថ្លៃទូកុងទឺណ័រដែលបញ្ជូនក្រោយពេល វេលាកំណត់", "Detention", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kha-ek-ka-san",""," ថ្លៃឯកសារ","Document fee","ค่าเอกสาร",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ថ្លៃឯកសារ", "Document fee", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tua-thaen-phu-rap-khon-song-sin-kha",""," អ្នកតំណាងខាងទទួលបន្ទុកបញ្ជូន ទំនិញ","Freight forwarder","ตัวแทนผู้รับขนส่งสินค้า",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកតំណាងខាងទទួលបន្ទុកបញ្ជូន ទំនិញ", "Freight forwarder", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sin-kha-an-ta-rai",""," ទំនិញគ្រោះថ្នាក់","Dangerous goods","สินค้าอันตราย",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ទំនិញគ្រោះថ្នាក់", "Dangerous goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khrueang-mai-lae-mai-hipho-khong-sin-kha",""," ស្លាកសញ្ញានិងលេខកូដកេះទំនិញ","Shipping mark and number","เครื่องหมายและเลขหมายหีบห่อของสินค้า",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ស្លាកសញ្ញានិងលេខកូដកេះទំនិញ", "Shipping mark and number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bai-song-sin-kha",""," ឯកសារបញ្ជូនទំនិញ","Invoice","ใบส่งสินค้า",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ឯកសារបញ្ជូនទំនិញ", "Invoice", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bai-rub-sin-kha",""," ឯកសារទទួលទំនិញ","Bill of lading","ใบรับสินค้า",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ឯកសារទទួលទំនិញ", "Bill of lading", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("thang-khao - thang-ork",""," ផ្លូវចូល ផ្លូវចេញ","Entrance - Exit","ทางเข้า -ทางออก",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ផ្លូវចូល ផ្លូវចេញ", "Entrance - Exit", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("phom-ma-rap-sin-kha-lae-aow-bai-song-ploi-sin-kha-ma-yuen-yan-pom-rup-sin-kha-dai-loei-mai-khrap","","ខ្ញុំមកទទួលយកទំនិញ និងយកនូវ    ឯកសារបញ្ចេញទំនិញមកបញ្ជាក់ ខ្ញុំ    អាចទទួលយកទំនិញបានឥឡូវទេ","I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ","ผมมารับสินค้าและเอาใบส่งปล่อยสินค้ามายืนยัน ผมรับสินค้าได้เลยไหมครับ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ខ្ញុំមកទទួលយកទំនិញ និងយកនូវ    ឯកសារបញ្ចេញទំនិញមកបញ្ជាក់ ខ្ញុំ    អាចទទួលយកទំនិញបានឥឡូវទេ", "I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadCambodiaToBrunei(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ee-mee-kray-sen",""," ផ្នែកគយ","Custom house","Imigresen",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" ផ្នែកគយ", "Custom house", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ba-ra-ngun-da-ka-ngun","","ទំនិញ","Goods","barangan  dagangan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ទំនិញ", "Goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("per-la-boo-hun",""," កំពង់ផែ","Dock warehouse","Pelabuhan ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" កំពង់ផែ", "Dock warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soo-rut-ya-mee-nun",""," ឯកសារបញ្ជាក់","Certificate","Surat jaminan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ឯកសារបញ្ជាក់", "Certificate", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("im-pot",""," នាំចូល","Import","Impot",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" នាំចូល", "Import", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ex-pot",""," នាំចេញ","Export","Ekspot",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" នាំចេញ", "Export", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yoo-run",""," ថ្លៃចុះបញ្ជី","Charge","Yuran",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ថ្លៃចុះបញ្ជី", "Charge", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("perng-hun-tul-ba-rung",""," អ្នកបញ្ជូនទំនិញ","Goods deliverer","Penghantar barang",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកបញ្ជូនទំនិញ", "Goods deliverer", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("per-ner-ree-ma-ba-rung",""," អ្នកទទួលទំនិញ","Goods receiver","Penerima barang",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកទទួលទំនិញ", "Goods receiver", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("koo-dung / koo-dung- ba-rung-gun",""," ឃ្លាំង/ឃ្លាំងទំនិញ","Warehouse","Gudang / Gudang barangan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ឃ្លាំង/ឃ្លាំងទំនិញ", "Warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("in-soo-rern",""," ធានារ៉ាប់រង","Insurance","Insuren",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ធានារ៉ាប់រង", "Insurance", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wa-geel",""," អ្នកតំណាង","Shipping agent","Wakil",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកតំណាង", "Shipping agent", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("per-ner-ree-ma-ba-rung-gee-ree-mun",""," អ្នកទទួលបន្ទុកផ្នែកត្រាទំនិញ","Consignee ","Penerima barang kiriman",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកទទួលបន្ទុកផ្នែកត្រាទំនិញ", "Consignee ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("noam-bol-goan-tay-na-darn-noam-bol-jub-mer-ter-ray-goan-tay-na","","លេខទូកុងទឺណ័រទំនិញនិងលេខត្រាជ័រទូកុងទឺណ័រទំនិញ","Container and seal number","Nombor kontena dan nombor cap materai kontena",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("លេខទូកុងទឺណ័រទំនិញនិងលេខត្រាជ័រទូកុងទឺណ័រទំនិញ", "Container and seal number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soo-rut-per-rin-tah-perng-hun-ta-run ba-ra-ngun",""," ឯកសារបញ្ចាឲ្យបញ្ចេញទំនិញ","Delivery order","Surat perintah penghantaran barangan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ឯកសារបញ្ចាឲ្យបញ្ចេញទំនិញ", "Delivery order", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ser-na-rai-ba-ra-ngun",""," មុខទំនិញ","Description of goods","Senarai barangan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" មុខទំនិញ", "Description of goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ba-ya-run-mer-moo-lung-gun- goan-tay-na-tern-lay-wat-da-ree-ma-sa-yong-dee-ter-tub-gun",""," ថ្លៃទូកុងទឺណ័រដែលបញ្ជូនក្រោយពេល វេលាកំណត់","Detention","Bayaran memulangkan  kontena  terlewat dari  masa   yang ditetapkan",null,null);
                child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ថ្លៃទូកុងទឺណ័រដែលបញ្ជូនក្រោយពេល វេលាកំណត់", "Detention", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yoo-run-doe-goo-mern",""," ថ្លៃឯកសារ","Document fee","Yuran dokumen",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ថ្លៃឯកសារ", "Document fee", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wa-geel-per-ner-ree-ma-per-ngung-goo-tun-ba-ra-ngun",""," អ្នកតំណាងខាងទទួលបន្ទុកបញ្ជូន ទំនិញ","Freight forwarder","Wakil penerima pengangkutan barangan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកតំណាងខាងទទួលបន្ទុកបញ្ជូន ទំនិញ", "Freight forwarder", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ba-ra-ngun-mern-ba-ha-ya",""," ទំនិញគ្រោះថ្នាក់","Dangerous goods","Barangan merbahaya",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ទំនិញគ្រោះថ្នាក់", "Dangerous goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tun-da-darn-noam-bol-per-tee-ba-ra-ngun",""," ស្លាកសញ្ញានិងលេខកូដកេះទំនិញ","Shipping mark and number","Tanda dan nombor peti barangan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ស្លាកសញ្ញានិងលេខកូដកេះទំនិញ", "Shipping mark and number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soo-rut-hun-tan-ba-ra-ngun",""," ឯកសារបញ្ជូនទំនិញ","Invoice","Surat hantar barangan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ឯកសារបញ្ជូនទំនិញ", "Invoice", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soo-rut-ter-ree-ma-ba-ra-ngun",""," ឯកសារទទួលទំនិញ","Bill of lading","Surat terima barangan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ឯកសារទទួលទំនិញ", "Bill of lading", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ya-lun-ma-sook-ya-lun-ger-loo-wal",""," ផ្លូវចូល ផ្លូវចេញ","Entrance - Exit","Jalan masuk-jalan keluar",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ផ្លូវចូល ផ្លូវចេញ", "Entrance - Exit", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-da-tung-oon-took-mer-ngum-beel-ba-rang-bern-sa-ma-der-ngun-soo-rut-per-rin-tah-perng-hun-ta-run-ba-ra-ngun-sa-ya-boe-leh-ter-ree-ma-ba-rung-gah","","ខ្ញុំមកទទួលយកទំនិញ និងយកនូវ    ឯកសារបញ្ចេញទំនិញមកបញ្ជាក់ ខ្ញុំ    អាចទទួលយកទំនិញបានឥឡូវទេ","I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ","Saya datang untuk mengambil  barang bersama dengan surat  perintah penghantaranbarangan saya boleh terimabarang kah?",null,null);
                child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ខ្ញុំមកទទួលយកទំនិញ និងយកនូវ    ឯកសារបញ្ចេញទំនិញមកបញ្ជាក់ ខ្ញុំ    អាចទទួលយកទំនិញបានឥឡូវទេ", "I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }
    public void loadCambodiaToCambodia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child(" phnaek-goai",""," ផ្នែកគយ","Custom house","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" ផ្នែកគយ", "Custom house", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" toom-neun","","ទំនិញ","Goods","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ទំនិញ", "Goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" gom-puang-phae",""," កំពង់ផែ","Dock warehouse","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" កំពង់ផែ", "Dock warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" aek-gah-sa-bon-jiah",""," ឯកសារបញ្ជាក់","Certificate","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ឯកសារបញ្ជាក់", "Certificate", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nuam-joen",""," នាំចូល","Import","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" នាំចូល", "Import", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nuam-jern",""," នាំចេញ","Export","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" នាំចេញ", "Export", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("thlai-joh-bon-jee",""," ថ្លៃចុះបញ្ជី","Charge","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ថ្លៃចុះបញ្ជី", "Charge", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("niah-bon-joon-toom-neun",""," អ្នកបញ្ជូនទំនិញ","Goods deliverer","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកបញ្ជូនទំនិញ", "Goods deliverer", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("niah-tao-tual-toom-neun",""," អ្នកទទួលទំនិញ","Goods receiver","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកទទួលទំនិញ", "Goods receiver", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kliang/kliang-toom-neun",""," ឃ្លាំង/ឃ្លាំងទំនិញ","Warehouse","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ឃ្លាំង/ឃ្លាំងទំនិញ", "Warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("thia-nia-rub-roang",""," ធានារ៉ាប់រង","Insurance","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ធានារ៉ាប់រង", "Insurance", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("niah-dom-narng",""," អ្នកតំណាង","Shipping agent","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកតំណាង", "Shipping agent", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" niah-tao-tual-bon-took-phnaek-trar-toom-neun",""," អ្នកទទួលបន្ទុកផ្នែកត្រាទំនិញ","Consignee ","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកទទួលបន្ទុកផ្នែកត្រាទំនិញ", "Consignee ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" lake-too-gong-teu-nui-toom-neun-neung-lake-trar-jua-too-gong-teu- nui-toom-neun","","លេខទូកុងទឺណ័រទំនិញនិងលេខត្រាជ័រទូកុងទឺណ័រទំនិញ","Container and seal number","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("លេខទូកុងទឺណ័រទំនិញនិងលេខត្រាជ័រទូកុងទឺណ័រទំនិញ", "Container and seal number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("aek-gah-sa-bon-jia-oay-bon-jern-toom-neun",""," ឯកសារបញ្ចាឲ្យបញ្ចេញទំនិញ","Delivery order","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ឯកសារបញ្ចាឲ្យបញ្ចេញទំនិញ", "Delivery order", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" mook-toom-neun",""," មុខទំនិញ","Description of goods","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" មុខទំនិញ", "Description of goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("thlai-gong-teu-nui-dael-bon- joon-groey-pel-way-lia-gom-nord",""," ថ្លៃទូកុងទឺណ័រដែលបញ្ជូនក្រោយពេល វេលាកំណត់","Detention","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ថ្លៃទូកុងទឺណ័រដែលបញ្ជូនក្រោយពេល វេលាកំណត់", "Detention", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("thlai -aek-gah-sa",""," ថ្លៃឯកសារ","Document fee","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ថ្លៃឯកសារ", "Document fee", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" niah-dorm-narng-khang-toa-tual-bon-took-bon-joon-toom-neun",""," អ្នកតំណាងខាងទទួលបន្ទុកបញ្ជូន ទំនិញ","Freight forwarder","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកតំណាងខាងទទួលបន្ទុកបញ្ជូន ទំនិញ", "Freight forwarder", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" toom-neun-gruah-thnah",""," ទំនិញគ្រោះថ្នាក់","Dangerous goods","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ទំនិញគ្រោះថ្នាក់", "Dangerous goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" slark-sun-ya-neung-lake-goat-geh-toom-neun",""," ស្លាកសញ្ញានិងលេខកូដកេះទំនិញ","Shipping mark and number","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ស្លាកសញ្ញានិងលេខកូដកេះទំនិញ", "Shipping mark and number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("aek-gah-sa-bon-joon-toom-neun",""," ឯកសារបញ្ជូនទំនិញ","Invoice","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ឯកសារបញ្ជូនទំនិញ", "Invoice", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" aek-gah-sa-tao-tual-toom-neun",""," ឯកសារទទួលទំនិញ","Bill of lading","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ឯកសារទទួលទំនិញ", "Bill of lading", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" phleuw-joen-phleuw-jern",""," ផ្លូវចូល ផ្លូវចេញ","Entrance - Exit","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ផ្លូវចូល ផ្លូវចេញ", "Entrance - Exit", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kyom-moak-tao-tual-yoak-toom- neun-neung-yoak-neau-aek-gah-sa-bon- jern-toom-neun-moak-bon-jiah- khyom-art- tao-tual-yoak-toom-neun- barn-eui-leuw-tay","","ខ្ញុំមកទទួលយកទំនិញ និងយកនូវ    ឯកសារបញ្ចេញទំនិញមកបញ្ជាក់ ខ្ញុំ    អាចទទួលយកទំនិញបានឥឡូវទេ","I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ","",null,null);
                child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ខ្ញុំមកទទួលយកទំនិញ និងយកនូវ    ឯកសារបញ្ចេញទំនិញមកបញ្ជាក់ ខ្ញុំ    អាចទទួលយកទំនិញបានឥឡូវទេ", "I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }
    public void loadCambodiaToIndonesia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("gan-tor- ber-ya-ju-gai",""," ផ្នែកគយ","Custom house","Kantor bea cukai",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" ផ្នែកគយ", "Custom house", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bar-rang-bar-rang","","ទំនិញ","Goods","Barang-barang",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ទំនិញ", "Goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("peu-lar- bu-han",""," កំពង់ផែ","Dock warehouse","Pelabuhan ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" កំពង់ផែ", "Dock warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soo-rat-peu-ngan-tar",""," ឯកសារបញ្ជាក់","Certificate","Surat pengantar",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ឯកសារបញ្ជាក់", "Certificate", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("im-por",""," នាំចូល","Import","Impor",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" នាំចូល", "Import", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ex-por",""," នាំចេញ","Export","Ekspor",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" នាំចេញ", "Export", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bee-yar-yar-ad-mi-nis-tra-see",""," ថ្លៃចុះបញ្ជី","Charge","Biaya administrasi ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ថ្លៃចុះបញ្ជី", "Charge", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("peu-ngee-rim-bar-rang-bar-rang",""," អ្នកបញ្ជូនទំនិញ","Goods deliverer","Pengirim barang-barang",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកបញ្ជូនទំនិញ", "Goods deliverer", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("peu-ner-ree-mar-bar-rang-bar-rang",""," អ្នកទទួលទំនិញ","Goods receiver","Penerima barang-barang",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកទទួលទំនិញ", "Goods receiver", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gu-dang",""," ឃ្លាំង/ឃ្លាំងទំនិញ","Warehouse","Gudang",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ឃ្លាំង/ឃ្លាំងទំនិញ", "Warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ar-su-ran-see",""," ធានារ៉ាប់រង","Insurance","Asuransi",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ធានារ៉ាប់រង", "Insurance", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ar-gen-gar-pal",""," អ្នកតំណាង","Shipping agent","Agen kapal",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកតំណាង", "Shipping agent", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("per-ner-ree-mar-bar-rang-bar-rang",""," អ្នកទទួលបន្ទុកផ្នែកត្រាទំនិញ","Consignee ","Penerima barang-barang",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកទទួលបន្ទុកផ្នែកត្រាទំនិញ", "Consignee ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("no-mor-peu-tee-bar-rang-bar-rang-dan no-mor-seu-gel-peu-tee-bar-rang-bar-rang","","លេខទូកុងទឺណ័រទំនិញនិងលេខត្រាជ័រទូកុងទឺណ័រទំនិញ","Container and seal number","Nomor peti barang-barang dan nomor segel peti barang-barang",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("លេខទូកុងទឺណ័រទំនិញនិងលេខត្រាជ័រទូកុងទឺណ័រទំនិញ", "Container and seal number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("su-rat-peu-leu-par-san-bar-rang-bar-rang",""," ឯកសារបញ្ចាឲ្យបញ្ចេញទំនិញ","Delivery order","Surat pelepasan barang-barang",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ឯកសារបញ្ចាឲ្យបញ្ចេញទំនិញ", "Delivery order", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("daf-tar-bar-rang-bar-rang",""," មុខទំនិញ","Description of goods","Daftar barang-barang",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" មុខទំនិញ", "Description of goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bee-yar-yar-peu-ngeum-bar-lee-yan-peu-tee-bar-rang-bar-rang-yang-ter-lat-mer-ler-bee-hee-wak-tu-yang-dee-teun-tu-kan",""," ថ្លៃទូកុងទឺណ័រដែលបញ្ជូនក្រោយពេល វេលាកំណត់","Detention","Biaya pengembalian peti barang-barang yang telat melebihi waktu yang ditentukan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ថ្លៃទូកុងទឺណ័រដែលបញ្ជូនក្រោយពេល វេលាកំណត់", "Detention", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bee-yar-yar -dork-gu-men",""," ថ្លៃឯកសារ","Document fee","Biaya dokumen ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ថ្លៃឯកសារ", "Document fee", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ar-gen-peu-ngee-rim-bar-rang",""," អ្នកតំណាងខាងទទួលបន្ទុកបញ្ជូន ទំនិញ","Freight forwarder","Agen pengirim barang ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកតំណាងខាងទទួលបន្ទុកបញ្ជូន ទំនិញ", "Freight forwarder", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bar-rang-bar-rang-ber-bar-har-yar",""," ទំនិញគ្រោះថ្នាក់","Dangerous goods","Barang-barang berbahaya",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ទំនិញគ្រោះថ្នាក់", "Dangerous goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tan-dar-dan-no-mor-peu-tee-bar-rang-bar-rang",""," ស្លាកសញ្ញានិងលេខកូដកេះទំនិញ","Shipping mark and number","Tanda dan nomor peti barang-barang",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ស្លាកសញ្ញានិងលេខកូដកេះទំនិញ", "Shipping mark and number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fak-tur",""," ឯកសារបញ្ជូនទំនិញ","Invoice","Faktur",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ឯកសារបញ្ជូនទំនិញ", "Invoice", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("daf-tar-mu-war-tan-gar-pal",""," ឯកសារទទួលទំនិញ","Bill of lading","Daftar muatan kapal",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ឯកសារទទួលទំនិញ", "Bill of lading", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mar-sook-ger-lu-war",""," ផ្លូវចូល ផ្លូវចេញ","Entrance - Exit","Masuk – Keluar ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ផ្លូវចូល ផ្លូវចេញ", "Entrance - Exit", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-am-pil-bar-rang-bar-rang   sar-yar-bar-war-su-rat-per-ngan-tar-ser-bar-kai-book-tee  ar-par-sar-yar-bee-sar-am-bil-bar-rang-bar-rang-ter-seu-but-seu-gar-rang","","ខ្ញុំមកទទួលយកទំនិញ និងយកនូវ    ឯកសារបញ្ចេញទំនិញមកបញ្ជាក់ ខ្ញុំ    អាចទទួលយកទំនិញបានឥឡូវទេ","I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ","Saya ingin ambil barang-barang.  Saya bawa surat pengantar sebagai bukti. Apa saya bisa ambil barang-barang tersebut sekarang?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ខ្ញុំមកទទួលយកទំនិញ និងយកនូវ    ឯកសារបញ្ចេញទំនិញមកបញ្ជាក់ ខ្ញុំ    អាចទទួលយកទំនិញបានឥឡូវទេ", "I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadCambodiaToLaos(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("darn-su-lah-ga-gorn",""," ផ្នែកគយ","Custom house"," ດ່ານສຸລະກາກອນ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" ផ្នែកគយ", "Custom house", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sin-kha","","ទំនិញ","Goods"," ສິນຄ້າ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ទំនិញ", "Goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tha",""," កំពង់ផែ","Dock warehouse"," ທ່າ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" កំពង់ផែ", "Dock warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nung-seu-hub-hong",""," ឯកសារបញ្ជាក់","Certificate"," ໜັງສືຮັບຮອງ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ឯកសារបញ្ជាក់", "Certificate", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("num-khao",""," នាំចូល","Import"," ນຳເຂົ້າ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" នាំចូល", "Import", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("song-org",""," នាំចេញ","Export"," ສົ່ງອອກ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" នាំចេញ", "Export", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kha-tum-niam",""," ថ្លៃចុះបញ្ជី","Charge"," ຄ່າທຳນຽມ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ថ្លៃចុះបញ្ជី", "Charge", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("phoo-song-sin-kha",""," អ្នកបញ្ជូនទំនិញ","Goods deliverer"," ຜູ້ສົ່ງສິນຄ້າ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកបញ្ជូនទំនិញ", "Goods deliverer", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("phoo-hub-sin-kha",""," អ្នកទទួលទំនិញ","Goods receiver"," ຜູ້ຮັບສິນຄ້າ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកទទួលទំនិញ", "Goods receiver", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-mian-khueang/hong-phuk-khueang",""," ឃ្លាំង/ឃ្លាំងទំនិញ","Warehouse"," ຫ້ອງມ້ຽນເຄື່ອງ / ຫ້ອງພັກເຄື່ອງ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ឃ្លាំង/ឃ្លាំងទំនិញ", "Warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pa-kun-phai",""," ធានារ៉ាប់រង","Insurance"," ປະກັນໄພ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ធានារ៉ាប់រង", "Insurance", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("phu-tang-na",""," អ្នកតំណាង","Shipping agent"," ຜູ້ຕາງໜ້າ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកតំណាង", "Shipping agent", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("phoo-hub-ga-song-sin-kha",""," អ្នកទទួលបន្ទុកផ្នែកត្រាទំនិញ","Consignee "," ຜູ້ຮັບກາສົ່ງສິນຄ້າ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកទទួលបន្ទុកផ្នែកត្រាទំនិញ", "Consignee ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mai-leg-too-sin-kha-lae-mai-leg-ga-too-sin-kha","","លេខទូកុងទឺណ័រទំនិញនិងលេខត្រាជ័រទូកុងទឺណ័រទំនិញ","Container and seal number"," ໝາຍເລກຕູ້ສິນຄ້າແລະໝາຍເລກກາ ຕູ້ສິນຄ້າ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("លេខទូកុងទឺណ័រទំនិញនិងលេខត្រាជ័រទូកុងទឺណ័រទំនិញ", "Container and seal number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bai-sung-poi-sin-kha",""," ឯកសារបញ្ចាឲ្យបញ្ចេញទំនិញ","Delivery order"," ໃບສັ່ງປ່ອຍສິນຄ້າ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ឯកសារបញ្ចាឲ្យបញ្ចេញទំនិញ", "Delivery order", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("lai-garn-sin-kha",""," មុខទំនិញ","Description of goods"," ລາຍການສິນຄ້າ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" មុខទំនិញ", "Description of goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kha-song-kheun-too-sin-kha-thee-sa-gern-gwar-way-la-thee-gum-nod",""," ថ្លៃទូកុងទឺណ័រដែលបញ្ជូនក្រោយពេល វេលាកំណត់","Detention"," ຄ່າສົ່ງຄືນຕູ້ສິນຄ້າທີ່ຊ້າເກີນກວ່າເວລາ ທີ່ກຳໜົດ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ថ្លៃទូកុងទឺណ័រដែលបញ្ជូនក្រោយពេល វេលាកំណត់", "Detention", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kha-aek-ga-sarn",""," ថ្លៃឯកសារ","Document fee"," ຄ່າເອກກະສານ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ថ្លៃឯកសារ", "Document fee", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toe-thaen-phoo-hub-song-sin-kha",""," អ្នកតំណាងខាងទទួលបន្ទុកបញ្ជូន ទំនិញ","Freight forwarder"," ໂຕແທນຜູ້ຮັບສົ່ງສິນຄ້າ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកតំណាងខាងទទួលបន្ទុកបញ្ជូន ទំនិញ", "Freight forwarder", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sin-kha-un-ta-lai",""," ទំនិញគ្រោះថ្នាក់","Dangerous goods"," ສິນຄ້າອັນຕະລາຍ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ទំនិញគ្រោះថ្នាក់", "Dangerous goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khueang-mai-lae-mai-leg-heeb-khong-sin-kha",""," ស្លាកសញ្ញានិងលេខកូដកេះទំនិញ","Shipping mark and number"," ເຄື່ອງໝາຍແລະໝາຍເລກຫີບຂອງສິນຄ້າ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ស្លាកសញ្ញានិងលេខកូដកេះទំនិញ", "Shipping mark and number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bai-song-sin-kha",""," ឯកសារបញ្ជូនទំនិញ","Invoice"," ໃບສົ່ງສິນຄ້າ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ឯកសារបញ្ជូនទំនិញ", "Invoice", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bai-hub-sin-kha",""," ឯកសារទទួលទំនិញ","Bill of lading"," ໃບຮັບສິນຄ້າ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ឯកសារទទួលទំនិញ", "Bill of lading", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tharng-khao-tarng-org",""," ផ្លូវចូល ផ្លូវចេញ","Entrance - Exit"," ທາງເຂົ້າ - ທາງອອກ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ផ្លូវចូល ផ្លូវចេញ", "Entrance - Exit", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-ma-hub-sin-kha-lae-ao-bai-song-poi-sin-kha-ma-yung-yuen-khoy-hub-sin-kha-dai-loey-bor","","ខ្ញុំមកទទួលយកទំនិញ និងយកនូវ    ឯកសារបញ្ចេញទំនិញមកបញ្ជាក់ ខ្ញុំ    អាចទទួលយកទំនិញបានឥឡូវទេ","I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ","ຂ້ອຍມາຮັບສິນຄ້າແລະເອົາໃບສົ່ງປ່ອຍສິນຄ້າມາຢັ້ງຢືນຂ້ອຍຮັບສິນຄ້າໄດ້ເລີຍບໍ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ខ្ញុំមកទទួលយកទំនិញ និងយកនូវ    ឯកសារបញ្ចេញទំនិញមកបញ្ជាក់ ខ្ញុំ    អាចទទួលយកទំនិញបានឥឡូវទេ", "I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadCambodiaToMalaysia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ee-mee-kray-sen",""," ផ្នែកគយ","Custom house","Imigresen",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" ផ្នែកគយ", "Custom house", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ba-ra-ngun-da-ka-ngun","","ទំនិញ","Goods","barangan  dagangan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ទំនិញ", "Goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("per-la-boo-hun",""," កំពង់ផែ","Dock warehouse","Pelabuhan ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" កំពង់ផែ", "Dock warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soo-rut-ya-mee-nun",""," ឯកសារបញ្ជាក់","Certificate","Surat jaminan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ឯកសារបញ្ជាក់", "Certificate", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("im-pot",""," នាំចូល","Import","Impot",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" នាំចូល", "Import", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ex-pot",""," នាំចេញ","Export","Ekspot",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" នាំចេញ", "Export", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yoo-run",""," ថ្លៃចុះបញ្ជី","Charge","Yuran",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ថ្លៃចុះបញ្ជី", "Charge", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("perng-hun-tul-ba-rung",""," អ្នកបញ្ជូនទំនិញ","Goods deliverer","Penghantar barang",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកបញ្ជូនទំនិញ", "Goods deliverer", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("per-ner-ree-ma-ba-rung",""," អ្នកទទួលទំនិញ","Goods receiver","Penerima barang",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកទទួលទំនិញ", "Goods receiver", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("koo-dung / koo-dung- ba-rung-gun",""," ឃ្លាំង/ឃ្លាំងទំនិញ","Warehouse","Gudang / Gudang barangan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ឃ្លាំង/ឃ្លាំងទំនិញ", "Warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("in-soo-rern",""," ធានារ៉ាប់រង","Insurance","Insuren",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ធានារ៉ាប់រង", "Insurance", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wa-geel",""," អ្នកតំណាង","Shipping agent","Wakil",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកតំណាង", "Shipping agent", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("per-ner-ree-ma-ba-rung-gee-ree-mun",""," អ្នកទទួលបន្ទុកផ្នែកត្រាទំនិញ","Consignee ","Penerima barang kiriman",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកទទួលបន្ទុកផ្នែកត្រាទំនិញ", "Consignee ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("noam-bol-goan-tay-na-darn-noam-bol-jub-mer-ter-ray-goan-tay-na","","លេខទូកុងទឺណ័រទំនិញនិងលេខត្រាជ័រទូកុងទឺណ័រទំនិញ","Container and seal number","Nombor kontena dan nombor cap materai kontena",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("លេខទូកុងទឺណ័រទំនិញនិងលេខត្រាជ័រទូកុងទឺណ័រទំនិញ", "Container and seal number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soo-rut-per-rin-tah-perng-hun-ta-run ba-ra-ngun",""," ឯកសារបញ្ចាឲ្យបញ្ចេញទំនិញ","Delivery order","Surat perintah penghantaran barangan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ឯកសារបញ្ចាឲ្យបញ្ចេញទំនិញ", "Delivery order", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ser-na-rai-ba-ra-ngun",""," មុខទំនិញ","Description of goods","Senarai barangan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" មុខទំនិញ", "Description of goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ba-ya-run-mer-moo-lung-gun- goan-tay-na-tern-lay-wat-da-ree-ma-sa-yong-dee-ter-tub-gun",""," ថ្លៃទូកុងទឺណ័រដែលបញ្ជូនក្រោយពេល វេលាកំណត់","Detention","Bayaran memulangkan  kontena  terlewat dari  masa   yang ditetapkan",null,null);
                child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ថ្លៃទូកុងទឺណ័រដែលបញ្ជូនក្រោយពេល វេលាកំណត់", "Detention", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yoo-run-doe-goo-mern",""," ថ្លៃឯកសារ","Document fee","Yuran dokumen",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ថ្លៃឯកសារ", "Document fee", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wa-geel-per-ner-ree-ma-per-ngung-goo-tun-ba-ra-ngun",""," អ្នកតំណាងខាងទទួលបន្ទុកបញ្ជូន ទំនិញ","Freight forwarder","Wakil penerima pengangkutan barangan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកតំណាងខាងទទួលបន្ទុកបញ្ជូន ទំនិញ", "Freight forwarder", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ba-ra-ngun-mern-ba-ha-ya",""," ទំនិញគ្រោះថ្នាក់","Dangerous goods","Barangan merbahaya",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ទំនិញគ្រោះថ្នាក់", "Dangerous goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tun-da-darn-noam-bol-per-tee-ba-ra-ngun",""," ស្លាកសញ្ញានិងលេខកូដកេះទំនិញ","Shipping mark and number","Tanda dan nombor peti barangan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ស្លាកសញ្ញានិងលេខកូដកេះទំនិញ", "Shipping mark and number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soo-rut-hun-tan-ba-ra-ngun",""," ឯកសារបញ្ជូនទំនិញ","Invoice","Surat hantar barangan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ឯកសារបញ្ជូនទំនិញ", "Invoice", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soo-rut-ter-ree-ma-ba-ra-ngun",""," ឯកសារទទួលទំនិញ","Bill of lading","Surat terima barangan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ឯកសារទទួលទំនិញ", "Bill of lading", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ya-lun-ma-sook-ya-lun-ger-loo-wal",""," ផ្លូវចូល ផ្លូវចេញ","Entrance - Exit","Jalan masuk-jalan keluar",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ផ្លូវចូល ផ្លូវចេញ", "Entrance - Exit", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-da-tung-oon-took-mer-ngum-beel-ba-rang-bern-sa-ma-der-ngun-soo-rut-per-rin-tah-perng-hun-ta-run-ba-ra-ngun-sa-ya-boe-leh-ter-ree-ma-ba-rung-gah","","ខ្ញុំមកទទួលយកទំនិញ និងយកនូវ    ឯកសារបញ្ចេញទំនិញមកបញ្ជាក់ ខ្ញុំ    អាចទទួលយកទំនិញបានឥឡូវទេ","I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ","Saya datang untuk mengambil  barang bersama dengan surat  perintah penghantaranbarangan saya boleh terimabarang kah?",null,null);
                child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ខ្ញុំមកទទួលយកទំនិញ និងយកនូវ    ឯកសារបញ្ចេញទំនិញមកបញ្ជាក់ ខ្ញុំ    អាចទទួលយកទំនិញបានឥឡូវទេ", "I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadCambodiaToMyanmar(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("a-kaw-khoon-yong",""," ផ្នែកគយ","Custom house","အေကာက္ခြန္ရံု",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" ផ្នែកគយ", "Custom house", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kong-piat-see","","ទំនិញ","Goods","ကုန္ပစၥည္း",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ទំនិញ", "Goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-kan",""," កំពង់ផែ","Dock warehouse","ဆိပ္ကမ္း",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" កំពង់ផែ", "Dock warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("thaw-khan-sa",""," ឯកសារបញ្ជាក់","Certificate","ေထာက္ခံစာ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ឯកសារបញ្ជាក់", "Certificate", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("twing-kong",""," នាំចូល","Import","သြင္းကုန္",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" នាំចូល", "Import", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("poh-kong",""," នាំចេញ","Export","ပုိ ့ကုန္",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" នាំចេញ", "Export", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wun-saw-khah",""," ថ្លៃចុះបញ្ជី","Charge","၀န္ေဆာင္ခ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ថ្លៃចុះបញ្ជី", "Charge", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kong-poh-too",""," អ្នកបញ្ជូនទំនិញ","Goods deliverer","ကုန္ပုိ ့သူ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកបញ្ជូនទំនិញ", "Goods deliverer", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kong-laeh-khan-too",""," អ្នកទទួលទំនិញ","Goods receiver","ကုန္လက္ခံသူ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកទទួលទំនិញ", "Goods receiver", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kong-yong- kong-yong",""," ឃ្លាំង/ឃ្លាំងទំនិញ","Warehouse","ကုန္ရံု",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ឃ្លាំង/ឃ្លាំងទំនិញ", "Warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ar-ma-khan",""," ធានារ៉ាប់រង","Insurance","အာမခံ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ធានារ៉ាប់រង", "Insurance", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("koe-sa-lae",""," អ្នកតំណាង","Shipping agent","ကိုယ္စားလွယ္",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកតំណាង", "Shipping agent", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kong-piat-see-ta-seh-laeh- khan- daeh-too",""," អ្នកទទួលបន្ទុកផ្នែកត្រាទំនិញ","Consignee ","ကုန္ပစၥည္းတံဆပ္လက္ခံတဲ့သူ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកទទួលបន្ទុកផ្នែកត្រាទំនិញ", "Consignee ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kong-tet-ta-nan-but-naeh kong- tet-ta-ba-koh-nan-but","","លេខទូកុងទឺណ័រទំនិញនិងលេខត្រាជ័រទូកុងទឺណ័រទំនិញ","Container and seal number","ကုန္ေသတၱာနံပါတ္နဲ႔ကုန္ေသတၱာဘာကုတ္နံပါတ္",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("លេខទូកុងទឺណ័រទំនិញនិងលេខត្រាជ័រទូកុងទឺណ័រទំនិញ", "Container and seal number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kong-ma-lwa",""," ឯកសារបញ្ចាឲ្យបញ្ចេញទំនិញ","Delivery order","ကုန္မွာလႊာ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ឯកសារបញ្ចាឲ្យបញ្ចេញទំនិញ", "Delivery order", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kong-piat-see-sa-yin",""," មុខទំនិញ","Description of goods","ကုန္ပစၥည္းစာရင္း",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" មុខទំនិញ", "Description of goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("a-cheng-loon-daeh-kong- tet-ta- khah",""," ថ្លៃទូកុងទឺណ័រដែលបញ្ជូនក្រោយពេល វេលាកំណត់","Detention","အခ်ိန္လြန္တဲ့ကုန္ေသတၱာခ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ថ្លៃទូកុងទឺណ័រដែលបញ្ជូនក្រោយពេល វេលាកំណត់", "Detention", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ywaeh-sa-dan-khah",""," ថ្លៃឯកសារ","Document fee","စာ႐ြက္စာတမ္းခ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ថ្លៃឯកសារ", "Document fee", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kong-piat-see-tae-saw- daeh- koe-sa-lae",""," អ្នកតំណាងខាងទទួលបន្ទុកបញ្ជូន ទំនិញ","Freight forwarder","ကုန္ပစၥည္းသယ္ေဆာင္တဲ့ကိုယ္စားလွယ္",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកតំណាងខាងទទួលបន្ទុកបញ្ជូន ទំនិញ", "Freight forwarder", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("an-da-yae-shi-daeh-kong- piat-see",""," ទំនិញគ្រោះថ្នាក់","Dangerous goods","အႏၲရာယ္ရွိတဲ့ကုန္ပစၥည္း",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ទំនិញគ្រោះថ្នាក់", "Dangerous goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kong-piat-see-yaeh-a-mut- naeh, a- thoh-nan-but",""," ស្លាកសញ្ញានិងលេខកូដកេះទំនិញ","Shipping mark and number","ကုန္ပစၥည္းရဲ့အမွတ္နဲ႔အထုပ္နံပါတ္",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ស្លាកសញ្ញានិងលេខកូដកេះទំនិញ", "Shipping mark and number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kong-poh-lwa",""," ឯកសារបញ្ជូនទំនិញ","Invoice","ကုန္္ပို႕လႊာ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ឯកសារបញ្ជូនទំនិញ", "Invoice", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kong-ma-lwa",""," ឯកសារទទួលទំនិញ","Bill of lading","ကုန္မွာလႊာ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ឯកសារទទួលទំនិញ", "Bill of lading", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("win-paw-thwaeh-paw",""," ផ្លូវចូល ផ្លូវចេញ","Entrance - Exit","ဝင္ေပါက္ - ထြက္ေပါက္",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ផ្លូវចូល ផ្លូវចេញ", "Entrance - Exit", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor-kong-piat-see-la- yoo-bee  kong-poh-lwa- teen-dae  ja-nor- kong-piat- see yoo- twa-loh-ya- bee-la-kha-mia","","ខ្ញុំមកទទួលយកទំនិញ និងយកនូវ    ឯកសារបញ្ចេញទំនិញមកបញ្ជាក់ ខ្ញុំ    អាចទទួលយកទំនិញបានឥឡូវទេ","I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ","ကြ်န္ေတာ္ကုန္ပစၥည္းလာယူၿပီ္း ကုန္္ပို႕လႊာတင္တယ္။ ကြ်န္ေတာ္ကုန္ပစၥည္း ယူသြားလို႔ရၿပီ္လားခင္ဗ်ာ။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ខ្ញុំមកទទួលយកទំនិញ និងយកនូវ    ឯកសារបញ្ចេញទំនិញមកបញ្ជាក់ ខ្ញុំ    អាចទទួលយកទំនិញបានឥឡូវទេ", "I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadCambodiaToPhilippines(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("kas-toms-in-spex-chan",""," ផ្នែកគយ","Custom house","Customs inspeksyon",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" ផ្នែកគយ", "Custom house", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("par-nin-dar","","ទំនិញ","Goods","paninda",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ទំនិញ", "Goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pu-ey-rar-to",""," កំពង់ផែ","Dock warehouse","puerto",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" កំពង់ផែ", "Dock warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ser-ti-pi-go-nang-gar-ran-ti-yar",""," ឯកសារបញ្ជាក់","Certificate","sertipiko ng garantiya",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ឯកសារបញ្ជាក់", "Certificate", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ang-gat",""," នាំចូល","Import","angkat",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" នាំចូល", "Import", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("lu-was",""," នាំចេញ","Export","luwas",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" នាំចេញ", "Export", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bar-yat",""," ថ្លៃចុះបញ្ជី","Charge","bayad",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ថ្លៃចុះបញ្ជី", "Charge", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nak-par-dar-lar",""," អ្នកបញ្ជូនទំនិញ","Goods deliverer","nagpadala",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកបញ្ជូនទំនិញ", "Goods deliverer", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tu-mang-gap",""," អ្នកទទួលទំនិញ","Goods receiver","Tumanggap",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកទទួលទំនិញ", "Goods receiver", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bo-dey-gar-nang-par-nin-dar",""," ឃ្លាំង/ឃ្លាំងទំនិញ","Warehouse","Bodega ng paninda",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ឃ្លាំង/ឃ្លាំងទំនិញ", "Warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pak-sey-sey-ku-ro",""," ធានារ៉ាប់រង","Insurance","pagseseguro",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ធានារ៉ាប់រង", "Insurance", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gi-nar-tar-wan",""," អ្នកតំណាង","Shipping agent","kinatawan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកតំណាង", "Shipping agent", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kom-sai-nee-of-goos",""," អ្នកទទួលបន្ទុកផ្នែកត្រាទំនិញ","Consignee ","Consignee of goods",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកទទួលបន្ទុកផ្នែកត្រាទំនិញ", "Consignee ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bi-lang-nang-goos-kon-ten-ner-at-nang-sel-yar","","លេខទូកុងទឺណ័រទំនិញនិងលេខត្រាជ័រទូកុងទឺណ័រទំនិញ","Container and seal number","Bilang ng Goods container at ng selya",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("លេខទូកុងទឺណ័រទំនិញនិងលេខត្រាជ័រទូកុងទឺណ័រទំនិញ", "Container and seal number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("or-der-sar-pak-dar-dar-lar-nang-gar-lar-gal",""," ឯកសារបញ្ចាឲ្យបញ្ចេញទំនិញ","Delivery order","Order sa pagdadala ng kalakal",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ឯកសារបញ្ចាឲ្យបញ្ចេញទំនិញ", "Delivery order", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("lis-tar-han-nang-mar-ngar-gar-lar-gal",""," មុខទំនិញ","Description of goods","Listahan ng mga kalakal",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" មុខទំនិញ", "Description of goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mool-tar-sar-hu-ling-pak-sar-sar-u-li-nang-goos-kon-ten-ner",""," ថ្លៃទូកុងទឺណ័រដែលបញ្ជូនក្រោយពេល វេលាកំណត់","Detention","Multa sa huling pagsasauli ng goods container",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ថ្លៃទូកុងទឺណ័រដែលបញ្ជូនក្រោយពេល វេលាកំណត់", "Detention", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dog-kiw-men-fee",""," ថ្លៃឯកសារ","Document fee","Document fee",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ថ្លៃឯកសារ", "Document fee", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ar-hen-tey-par-rar-sar-dey-li-wer-ree",""," អ្នកតំណាងខាងទទួលបន្ទុកបញ្ជូន ទំនិញ","Freight forwarder","Ahente para sa delivery",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកតំណាងខាងទទួលបន្ទុកបញ្ជូន ទំនិញ", "Freight forwarder", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mar-pan-ngar-nip-nar-mar-ngar-gar-lar-gal",""," ទំនិញគ្រោះថ្នាក់","Dangerous goods","mapanganib na mga kalakal",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ទំនិញគ្រោះថ្នាក់", "Dangerous goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pi-rar-mar-at-nu-mey-ro-nang-pak-tang-gap-nang-gar-lar-gal",""," ស្លាកសញ្ញានិងលេខកូដកេះទំនិញ","Shipping mark and number","Pirma at numero ng pagtanggap ng kalakal",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ស្លាកសញ្ញានិងលេខកូដកេះទំនិញ", "Shipping mark and number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("si-ngi-lin",""," ឯកសារបញ្ជូនទំនិញ","Invoice","singilin",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ឯកសារបញ្ជូនទំនិញ", "Invoice", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gu-wen-tar-nang-pak-gar-gar",""," ឯកសារទទួលទំនិញ","Bill of lading","kuwenta ng pagkarga",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ឯកសារទទួលទំនិញ", "Bill of lading", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pak- par-sok-at-ang-pak-lar-bas",""," ផ្លូវចូល ផ្លូវចេញ","Entrance - Exit","Pagpasok at ang paglabas",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ផ្លូវចូល ផ្លូវចេញ", "Entrance - Exit", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nan-di-to-ar-go-pa-ra-gu-nin-ang-mar-ngar-gar-lar-gal-har-wak-go-ang-par-pel-par-rar-sar-or-der-for-dey-li-wer-ree-pu-wey-dey-bang-gu-nin-gar-ar-gad-ang-mar-ngar-gar-lar-gal","","ខ្ញុំមកទទួលយកទំនិញ និងយកនូវ    ឯកសារបញ្ចេញទំនិញមកបញ្ជាក់ ខ្ញុំ    អាចទទួលយកទំនិញបានឥឡូវទេ","I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ","Nandito ako para kunin ang mga kalakal. Hawak ko ang papel para sa “order for delivery”.  Puwede bang kunin kaagad ang mga kalakal?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ខ្ញុំមកទទួលយកទំនិញ និងយកនូវ    ឯកសារបញ្ចេញទំនិញមកបញ្ជាក់ ខ្ញុំ    អាចទទួលយកទំនិញបានឥឡូវទេ", "I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadCambodiaToSingapore(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("cas-tom-haos",""," ផ្នែកគយ","Custom house","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" ផ្នែកគយ", "Custom house", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("goos","","ទំនិញ","Goods","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ទំនិញ", "Goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dok-ware-haos",""," កំពង់ផែ","Dock warehouse","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" កំពង់ផែ", "Dock warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ser-ti-fi-ket",""," ឯកសារបញ្ជាក់","Certificate","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ឯកសារបញ្ជាក់", "Certificate", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("im-port",""," នាំចូល","Import","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" នាំចូល", "Import", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ex-port",""," នាំចេញ","Export","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" នាំចេញ", "Export", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("charch",""," ថ្លៃចុះបញ្ជី","Charge","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ថ្លៃចុះបញ្ជី", "Charge", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("goos-dee-li-wer-rer",""," អ្នកបញ្ជូនទំនិញ","Goods deliverer","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកបញ្ជូនទំនិញ", "Goods deliverer", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("goos-ree-seef-wer",""," អ្នកទទួលទំនិញ","Goods receiver","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកទទួលទំនិញ", "Goods receiver", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-haos",""," ឃ្លាំង/ឃ្លាំងទំនិញ","Warehouse","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ឃ្លាំង/ឃ្លាំងទំនិញ", "Warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("in-chua-rans",""," ធានារ៉ាប់រង","Insurance","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ធានារ៉ាប់រង", "Insurance", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chip-ping-eh-jent",""," អ្នកតំណាង","Shipping agent","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកតំណាង", "Shipping agent", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kan-sai-nee",""," អ្នកទទួលបន្ទុកផ្នែកត្រាទំនិញ","Consignee ","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកទទួលបន្ទុកផ្នែកត្រាទំនិញ", "Consignee ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kon-ten-ner-an-sil-nam-ber","","លេខទូកុងទឺណ័រទំនិញនិងលេខត្រាជ័រទូកុងទឺណ័រទំនិញ","Container and seal number","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("លេខទូកុងទឺណ័រទំនិញនិងលេខត្រាជ័រទូកុងទឺណ័រទំនិញ", "Container and seal number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-li-wer-ree-or-der",""," ឯកសារបញ្ចាឲ្យបញ្ចេញទំនិញ","Delivery order","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ឯកសារបញ្ចាឲ្យបញ្ចេញទំនិញ", "Delivery order", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dis-crip-chan-of-goos",""," មុខទំនិញ","Description of goods","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" មុខទំនិញ", "Description of goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-ten-chan",""," ថ្លៃទូកុងទឺណ័រដែលបញ្ជូនក្រោយពេល វេលាកំណត់","Detention","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ថ្លៃទូកុងទឺណ័រដែលបញ្ជូនក្រោយពេល វេលាកំណត់", "Detention", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dok-kio-ment-fee",""," ថ្លៃឯកសារ","Document fee","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ថ្លៃឯកសារ", "Document fee", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fret-for-ward-der",""," អ្នកតំណាងខាងទទួលបន្ទុកបញ្ជូន ទំនិញ","Freight forwarder","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកតំណាងខាងទទួលបន្ទុកបញ្ជូន ទំនិញ", "Freight forwarder", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("den-jer-ras-goos",""," ទំនិញគ្រោះថ្នាក់","Dangerous goods","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ទំនិញគ្រោះថ្នាក់", "Dangerous goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chip-ping-mark-an-nam-ber",""," ស្លាកសញ្ញានិងលេខកូដកេះទំនិញ","Shipping mark and number","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ស្លាកសញ្ញានិងលេខកូដកេះទំនិញ", "Shipping mark and number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("in-wois",""," ឯកសារបញ្ជូនទំនិញ","Invoice","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ឯកសារបញ្ជូនទំនិញ", "Invoice", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bil-of-led -ding",""," ឯកសារទទួលទំនិញ","Bill of lading","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ឯកសារទទួលទំនិញ", "Bill of lading", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("en-trans-ex-sit",""," ផ្លូវចូល ផ្លូវចេញ","Entrance - Exit","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ផ្លូវចូល ផ្លូវចេញ", "Entrance - Exit", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-laik-tu-pik-ap-goos-ai-am-wit-a-dee-li-wer-ree-or-der-to-kon-ferm-kood-ai-ree-seef-goos","","ខ្ញុំមកទទួលយកទំនិញ និងយកនូវ    ឯកសារបញ្ចេញទំនិញមកបញ្ជាក់ ខ្ញុំ    អាចទទួលយកទំនិញបានឥឡូវទេ","I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ខ្ញុំមកទទួលយកទំនិញ និងយកនូវ    ឯកសារបញ្ចេញទំនិញមកបញ្ជាក់ ខ្ញុំ    អាចទទួលយកទំនិញបានឥឡូវទេ", "I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadCambodiaToVietnam(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("hai-kwan",""," ផ្នែកគយ","Custom house","hải quan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" ផ្នែកគយ", "Custom house", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hang-hwa","","ទំនិញ","Goods","hàng hóa",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ទំនិញ", "Goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kong-tram-ben",""," កំពង់ផែ","Dock warehouse","cổng, trạm, bến",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" កំពង់ផែ", "Dock warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yuai-jing-yern",""," ឯកសារបញ្ជាក់","Certificate","giấy chứng nhận",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ឯកសារបញ្ជាក់", "Certificate", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yerb-khoeu",""," នាំចូល","Import","nhập khẩu",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" នាំចូល", "Import", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("suad-khoeu",""," នាំចេញ","Export","xuất khẩu",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" នាំចេញ", "Export", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("lay-fee",""," ថ្លៃចុះបញ្ជី","Charge","lệ phí",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ថ្លៃចុះបញ្ជី", "Charge", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ngeau-kuew-hang",""," អ្នកបញ្ជូនទំនិញ","Goods deliverer","người gửi hàng",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកបញ្ជូនទំនិញ", "Goods deliverer", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ngeau-yern-hang",""," អ្នកទទួលទំនិញ","Goods receiver","người nhận hàng",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកទទួលទំនិញ", "Goods receiver", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khor / khor-hang",""," ឃ្លាំង/ឃ្លាំងទំនិញ","Warehouse","kho / kho hàng",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ឃ្លាំង/ឃ្លាំងទំនិញ", "Warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("boa-hium",""," ធានារ៉ាប់រង","Insurance","bảo hiểm",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ធានារ៉ាប់រង", "Insurance", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ngeau-dai-yean",""," អ្នកតំណាង","Shipping agent","người đại diện",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកតំណាង", "Shipping agent", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ngeau-yern-hang-san-ferm",""," អ្នកទទួលបន្ទុកផ្នែកត្រាទំនិញ","Consignee ","người nhận hàng sản phẩm",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកទទួលបន្ទុកផ្នែកត្រាទំនិញ", "Consignee ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soe-thung-container-wa-soe-korn-yue-kua-thung-container","","លេខទូកុងទឺណ័រទំនិញនិងលេខត្រាជ័រទូកុងទឺណ័រទំនិញ","Container and seal number","số thùng container và số con dấu của thùng container",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("លេខទូកុងទឺណ័រទំនិញនិងលេខត្រាជ័រទូកុងទឺណ័រទំនិញ", "Container and seal number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yuai-fab-jor-guew-hang",""," ឯកសារបញ្ចាឲ្យបញ្ចេញទំនិញ","Delivery order","giấy phép cho gủi hàng",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ឯកសារបញ្ចាឲ្យបញ្ចេញទំនិញ", "Delivery order", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yan-suk-hang-hwa",""," មុខទំនិញ","Description of goods","danh sách hàng hóa",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" មុខទំនិញ", "Description of goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tien-fard-container-den-jum-kwa-han-den",""," ថ្លៃទូកុងទឺណ័រដែលបញ្ជូនក្រោយពេល វេលាកំណត់","Detention","tiền phạt container đến chậm quá hạn định",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ថ្លៃទូកុងទឺណ័រដែលបញ្ជូនក្រោយពេល វេលាកំណត់", "Detention", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tien-larm-yeaw-ter",""," ថ្លៃឯកសារ","Document fee","tiền làm giấy tờ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ថ្លៃឯកសារ", "Document fee", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dai-lee-wern-tai-hang-hwa",""," អ្នកតំណាងខាងទទួលបន្ទុកបញ្ជូន ទំនិញ","Freight forwarder","đại lý vận tải hàng hóa",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" អ្នកតំណាងខាងទទួលបន្ទុកបញ្ជូន ទំនិញ", "Freight forwarder", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hang-ngui-heim",""," ទំនិញគ្រោះថ្នាក់","Dangerous goods","hàng nguy hiểm",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ទំនិញគ្រោះថ្នាក់", "Dangerous goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yarn-hiaw-hwa-soe-hiaw-kua-boa-bi-san-ferm",""," ស្លាកសញ្ញានិងលេខកូដកេះទំនិញ","Shipping mark and number","nhãn hiệu và số hiệu của bao bì sản phẩm",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ស្លាកសញ្ញានិងលេខកូដកេះទំនិញ", "Shipping mark and number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hwa-dern-kuew-hang",""," ឯកសារបញ្ជូនទំនិញ","Invoice","hóa đơn gửi hàng ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ឯកសារបញ្ជូនទំនិញ", "Invoice", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hwa-dern-yern-hang",""," ឯកសារទទួលទំនិញ","Bill of lading","hóa đơn nhận hàng ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ឯកសារទទួលទំនិញ", "Bill of lading", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("loi-wow-loi-ra",""," ផ្លូវចូល ផ្លូវចេញ","Entrance - Exit","lối vào - lối ra",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" ផ្លូវចូល ផ្លូវចេញ", "Entrance - Exit", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-den-yern-hang-hwa-dam-yuai-fab-jor-kuey-hang-den-larm-bung, toay-kor-thay-lun-hang-ngai-khong-ar","","ខ្ញុំមកទទួលយកទំនិញ និងយកនូវ    ឯកសារបញ្ចេញទំនិញមកបញ្ជាក់ ខ្ញុំ    អាចទទួលយកទំនិញបានឥឡូវទេ","I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ","tôi đến nhận hàng và đem giấy phép cho gửi hàng đến làm bằng, tôi có thể lãnh hàng ngay không ạ?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("ខ្ញុំមកទទួលយកទំនិញ និងយកនូវ    ឯកសារបញ្ចេញទំនិញមកបញ្ជាក់ ខ្ញុំ    អាចទទួលយកទំនិញបានឥឡូវទេ", "I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------arang tersebut sekarang?","I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ","tôi đến nhận hàng và đem giấy phép cho gửi hàng đến làm bằng, tôi có thể lãnh hàng ngay không ạ?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("Saya ingin ambil barang-barang.  Saya bawa surat pengantar sebagai bukti. Apa saya bisa ambil barang-barang tersebut sekarang?", "I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadChinaToChina(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("hai-gwan",""," 海关","Custom house","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" 海关", "Custom house", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hwor",""," 货","Goods","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 货", "Goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ma-thow",""," 码头","Dock warehouse","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 码头", "Dock warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jerng-soo",""," 证书","Certificate","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 证书", "Certificate", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("Jin-khow",""," 进口","Import","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 进口", "Import", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("choo-khow",""," 出口","Export","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 出口", "Export", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fuai-yong",""," 费用","Charge","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 费用", "Charge", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fa-hwor-jer",""," 发货者","Goods deliverer","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 发货者", "Goods deliverer", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sow-hwor-jer","","收货者","Goods receiver","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("收货者", "Goods receiver", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chang-khoo",""," 仓库","Warehouse","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 仓库", "Warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pao-sian",""," 保险","Insurance","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 保险", "Insurance", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tai-lee",""," 代理","Shipping agent","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 代理", "Shipping agent", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("thee-tun-jer",""," 提单者","Consignee ","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 提单者", "Consignee ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jee-juang-siang-haw-ma",""," 集装箱号码","Container and seal number","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 集装箱号码", "Container and seal number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fa-hwor-tun",""," 发货单","Delivery order","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 发货单", "Delivery order", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ching-tun",""," 清单","Description of goods","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 清单", "Description of goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("jee-juang-siang-yian-chee-fuai-yong",""," 集装箱延期费用","Detention","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 集装箱延期费用", "Detention", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("foo-in-fuay",""," 复印费","Document fee","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 复印费", "Document fee", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hwor-awin-tay-lee",""," 货运代理","Freight forwarder","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 货运代理", "Freight forwarder", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wuai-sian-phin",""," 危险品","Dangerous goods","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 危险品", "Dangerous goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("woo-phin-ming-cherng-her-woo-phin-pian-hao",""," 物品名称和物品编号","Shipping mark and number","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 物品名称和物品编号", "Shipping mark and number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("song-hwor-tan","","送货单","Invoice","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("送货单", "Invoice", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sow-hwor-tan",""," 收货单","Bill of lading","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 收货单", "Bill of lading", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("loo-khow-choo-khow",""," 入口- 出口","Entrance - Exit","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 入口- 出口", "Entrance - Exit", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wor-naa-sow-hwor-chew-yern-soo-lai/ wor- sian-jai-kher-yee-soe-hwa-ma",""," 我拿售货确认书来，我现在可以收货吗","I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 我拿售货确认书来，我现在可以收货吗", "I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadChinaToThai(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("dan-sun-la-ka-kon",""," 海关","Custom house","ด่านศุลกากร",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" 海关", "Custom house", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sin-kha",""," 货","Goods","สินค้า",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 货", "Goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tha",""," 码头","Dock warehouse","ท่า",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 码头", "Dock warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nang-sue-rap-rong",""," 证书","Certificate","หนังสือรับรอง",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 证书", "Certificate", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nam-khao",""," 进口","Import","นำเข้า",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 进口", "Import", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("song-ork",""," 出口","Export","ส่งออก",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 出口", "Export", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kha-tham-niam",""," 费用","Charge","ค่าธรรมเนียม",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 费用", "Charge", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("phu-song-ork",""," 发货者","Goods deliverer","ผู้ส่งสินค้า",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 发货者", "Goods deliverer", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("phu-rub-sin-kha","","收货者","Goods receiver","ผู้รับสินค้า",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("收货者", "Goods receiver", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ko-dang/khlang-sin-kha",""," 仓库","Warehouse","โกดัง/คลังสินค้า",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 仓库", "Warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pra-kan-phai",""," 保险","Insurance","ประกันภัย",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 保险", "Insurance", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tua-thaen",""," 代理","Shipping agent","ตัวแทน",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 代理", "Shipping agent", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("phu-rub-tra-song-sin-kha",""," 提单者","Consignee ","ผู้รับตราส่งสินค้า",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 提单者", "Consignee ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mai-lek-tu-sin-kha-lae-mai-lek-thaep-pha-nuek-tu-sinkha",""," 集装箱号码","Container and seal number","หมายเลขตู้สินค้าและหมายเลขแถบผนึกตู้สินค้า",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 集装箱号码", "Container and seal number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ba-isang-ploi-sin-kha",""," 发货单","Delivery order","ใบสั่งปล่อยสินค้า",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 发货单", "Delivery order", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("rai-kan-sin-kha",""," 清单","Description of goods","รายการสินค้า",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 清单", "Description of goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kha-khuen-tu-sin-kha-tee-cha-koen-kwa-tee-kam-not",""," 集装箱延期费用","Detention","ค่าคืนตู้สินค้าที่ช้าเกินกว่าเวลาที่กำหนด",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 集装箱延期费用", "Detention", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kha-ek-ka-san",""," 复印费","Document fee","ค่าเอกสาร",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 复印费", "Document fee", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tua-thaen-phu-rap-khon-song-sin-kha",""," 货运代理","Freight forwarder","ตัวแทนผู้รับขนส่งสินค้า",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 货运代理", "Freight forwarder", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sin-kha-an-ta-rai",""," 危险品","Dangerous goods","สินค้าอันตราย",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 危险品", "Dangerous goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khrueang-mai-lae-mai-hipho-khong-sin-kha",""," 物品名称和物品编号","Shipping mark and number","เครื่องหมายและเลขหมายหีบห่อของสินค้า",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 物品名称和物品编号", "Shipping mark and number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bai-song-sin-kha","","送货单","Invoice","ใบส่งสินค้า",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("送货单", "Invoice", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bai-rub-sin-kha",""," 收货单","Bill of lading","ใบรับสินค้า",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 收货单", "Bill of lading", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("thang-khao - thang-ork",""," 入口- 出口","Entrance - Exit","ทางเข้า -ทางออก",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 入口- 出口", "Entrance - Exit", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("phom-ma-rap-sin-kha-lae-aow-bai-song-ploi-sin-kha-ma-yuen-yan-pom-rup-sin-kha-dai-loei-mai-khrap",""," 我拿售货确认书来，我现在可以收货吗","I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ","ผมมารับสินค้าและเอาใบส่งปล่อยสินค้ามายืนยัน ผมรับสินค้าได้เลยไหมครับ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 我拿售货确认书来，我现在可以收货吗", "I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadChinaToBrunei(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ee-mee-kray-sen",""," 海关","Custom house","Imigresen",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" 海关", "Custom house", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ba-ra-ngun-da-ka-ngun",""," 货","Goods","barangan  dagangan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 货", "Goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("per-la-boo-hun",""," 码头","Dock warehouse","Pelabuhan ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 码头", "Dock warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soo-rut-ya-mee-nun",""," 证书","Certificate","Surat jaminan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 证书", "Certificate", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("im-pot",""," 进口","Import","Impot",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 进口", "Import", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ex-pot",""," 出口","Export","Ekspot",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 出口", "Export", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yoo-run",""," 费用","Charge","Yuran",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 费用", "Charge", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("perng-hun-tul-ba-rung",""," 发货者","Goods deliverer","Penghantar barang",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 发货者", "Goods deliverer", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("per-ner-ree-ma-ba-rung","","收货者","Goods receiver","Penerima barang",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("收货者", "Goods receiver", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("koo-dung / koo-dung- ba-rung-gun",""," 仓库","Warehouse","Gudang / Gudang barangan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 仓库", "Warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("in-soo-rern",""," 保险","Insurance","Insuren",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 保险", "Insurance", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wa-geel",""," 代理","Shipping agent","Wakil",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 代理", "Shipping agent", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("per-ner-ree-ma-ba-rung-gee-ree-mun",""," 提单者","Consignee ","Penerima barang kiriman",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 提单者", "Consignee ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("noam-bol-goan-tay-na-darn-noam-bol-jub-mer-ter-ray-goan-tay-na",""," 集装箱号码","Container and seal number","Nombor kontena dan nombor cap materai kontena",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 集装箱号码", "Container and seal number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soo-rut-per-rin-tah-perng-hun-ta-run ba-ra-ngun",""," 发货单","Delivery order","Surat perintah penghantaran barangan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 发货单", "Delivery order", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ser-na-rai-ba-ra-ngun",""," 清单","Description of goods","Senarai barangan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 清单", "Description of goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ba-ya-run-mer-moo-lung-gun- goan-tay-na-tern-lay-wat-da-ree-ma-sa-yong-dee-ter-tub-gun",""," 集装箱延期费用","Detention","Bayaran memulangkan  kontena  terlewat dari  masa   yang ditetapkan",null,null);
                child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 集装箱延期费用", "Detention", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yoo-run-doe-goo-mern",""," 复印费","Document fee","Yuran dokumen",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 复印费", "Document fee", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wa-geel-per-ner-ree-ma-per-ngung-goo-tun-ba-ra-ngun",""," 货运代理","Freight forwarder","Wakil penerima pengangkutan barangan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 货运代理", "Freight forwarder", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ba-ra-ngun-mern-ba-ha-ya",""," 危险品","Dangerous goods","Barangan merbahaya",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 危险品", "Dangerous goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tun-da-darn-noam-bol-per-tee-ba-ra-ngun",""," 物品名称和物品编号","Shipping mark and number","Tanda dan nombor peti barangan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 物品名称和物品编号", "Shipping mark and number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soo-rut-hun-tan-ba-ra-ngun","","送货单","Invoice","Surat hantar barangan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("送货单", "Invoice", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soo-rut-ter-ree-ma-ba-ra-ngun",""," 收货单","Bill of lading","Surat terima barangan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 收货单", "Bill of lading", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ya-lun-ma-sook-ya-lun-ger-loo-wal",""," 入口- 出口","Entrance - Exit","Jalan masuk-jalan keluar",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 入口- 出口", "Entrance - Exit", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-da-tung-oon-took-mer-ngum-beel-ba-rang-bern-sa-ma-der-ngun-soo-rut-per-rin-tah-perng-hun-ta-run-ba-ra-ngun-sa-ya-boe-leh-ter-ree-ma-ba-rung-gah",""," 我拿售货确认书来，我现在可以收货吗","I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ","Saya datang untuk mengambil  barang bersama dengan surat  perintah penghantaranbarangan saya boleh terimabarang kah?",null,null);
                child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 我拿售货确认书来，我现在可以收货吗", "I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadChinaToCambodia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child(" phnaek-goai",""," 海关","Custom house"," ផ្នែកគយ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" 海关", "Custom house", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" toom-neun",""," 货","Goods","ទំនិញ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 货", "Goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" gom-puang-phae",""," 码头","Dock warehouse"," កំពង់ផែ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 码头", "Dock warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" aek-gah-sa-bon-jiah",""," 证书","Certificate"," ឯកសារបញ្ជាក់",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 证书", "Certificate", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nuam-joen",""," 进口","Import"," នាំចូល",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 进口", "Import", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nuam-jern",""," 出口","Export"," នាំចេញ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 出口", "Export", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("thlai-joh-bon-jee",""," 费用","Charge"," ថ្លៃចុះបញ្ជី",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 费用", "Charge", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("niah-bon-joon-toom-neun",""," 发货者","Goods deliverer"," អ្នកបញ្ជូនទំនិញ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 发货者", "Goods deliverer", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("niah-tao-tual-toom-neun","","收货者","Goods receiver"," អ្នកទទួលទំនិញ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("收货者", "Goods receiver", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kliang/kliang-toom-neun",""," 仓库","Warehouse"," ឃ្លាំង/ឃ្លាំងទំនិញ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 仓库", "Warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("thia-nia-rub-roang",""," 保险","Insurance"," ធានារ៉ាប់រង",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 保险", "Insurance", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("niah-dom-narng",""," 代理","Shipping agent"," អ្នកតំណាង",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 代理", "Shipping agent", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" niah-tao-tual-bon-took-phnaek-trar-toom-neun",""," 提单者","Consignee "," អ្នកទទួលបន្ទុកផ្នែកត្រាទំនិញ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 提单者", "Consignee ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" lake-too-gong-teu-nui-toom-neun-neung-lake-trar-jua-too-gong-teu- nui-toom-neun",""," 集装箱号码","Container and seal number","លេខទូកុងទឺណ័រទំនិញនិងលេខត្រាជ័រទូកុងទឺណ័រទំនិញ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 集装箱号码", "Container and seal number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("aek-gah-sa-bon-jia-oay-bon-jern-toom-neun",""," 发货单","Delivery order"," ឯកសារបញ្ចាឲ្យបញ្ចេញទំនិញ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 发货单", "Delivery order", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" mook-toom-neun",""," 清单","Description of goods"," មុខទំនិញ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 清单", "Description of goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("thlai-gong-teu-nui-dael-bon- joon-groey-pel-way-lia-gom-nord",""," 集装箱延期费用","Detention"," ថ្លៃទូកុងទឺណ័រដែលបញ្ជូនក្រោយពេល វេលាកំណត់",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 集装箱延期费用", "Detention", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("thlai -aek-gah-sa",""," 复印费","Document fee"," ថ្លៃឯកសារ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 复印费", "Document fee", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" niah-dorm-narng-khang-toa-tual-bon-took-bon-joon-toom-neun",""," 货运代理","Freight forwarder"," អ្នកតំណាងខាងទទួលបន្ទុកបញ្ជូន ទំនិញ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 货运代理", "Freight forwarder", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" toom-neun-gruah-thnah",""," 危险品","Dangerous goods"," ទំនិញគ្រោះថ្នាក់",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 危险品", "Dangerous goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" slark-sun-ya-neung-lake-goat-geh-toom-neun",""," 物品名称和物品编号","Shipping mark and number"," ស្លាកសញ្ញានិងលេខកូដកេះទំនិញ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 物品名称和物品编号", "Shipping mark and number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("aek-gah-sa-bon-joon-toom-neun","","送货单","Invoice"," ឯកសារបញ្ជូនទំនិញ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("送货单", "Invoice", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" aek-gah-sa-tao-tual-toom-neun",""," 收货单","Bill of lading"," ឯកសារទទួលទំនិញ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 收货单", "Bill of lading", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child(" phleuw-joen-phleuw-jern",""," 入口- 出口","Entrance - Exit"," ផ្លូវចូល ផ្លូវចេញ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 入口- 出口", "Entrance - Exit", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kyom-moak-tao-tual-yoak-toom- neun-neung-yoak-neau-aek-gah-sa-bon- jern-toom-neun-moak-bon-jiah- khyom-art- tao-tual-yoak-toom-neun- barn-eui-leuw-tay",""," 我拿售货确认书来，我现在可以收货吗","I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ","ខ្ញុំមកទទួលយកទំនិញ និងយកនូវ    ឯកសារបញ្ចេញទំនិញមកបញ្ជាក់ ខ្ញុំ    អាចទទួលយកទំនិញបានឥឡូវទេ",null,null);
                child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 我拿售货确认书来，我现在可以收货吗", "I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadChinaToIndonesia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("gan-tor- ber-ya-ju-gai",""," 海关","Custom house","Kantor bea cukai",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" 海关", "Custom house", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bar-rang-bar-rang",""," 货","Goods","Barang-barang",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 货", "Goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("peu-lar- bu-han",""," 码头","Dock warehouse","Pelabuhan ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 码头", "Dock warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soo-rat-peu-ngan-tar",""," 证书","Certificate","Surat pengantar",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 证书", "Certificate", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("im-por",""," 进口","Import","Impor",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 进口", "Import", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ex-por",""," 出口","Export","Ekspor",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 出口", "Export", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bee-yar-yar-ad-mi-nis-tra-see",""," 费用","Charge","Biaya administrasi ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 费用", "Charge", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("peu-ngee-rim-bar-rang-bar-rang",""," 发货者","Goods deliverer","Pengirim barang-barang",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 发货者", "Goods deliverer", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("peu-ner-ree-mar-bar-rang-bar-rang","","收货者","Goods receiver","Penerima barang-barang",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("收货者", "Goods receiver", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gu-dang",""," 仓库","Warehouse","Gudang",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 仓库", "Warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ar-su-ran-see",""," 保险","Insurance","Asuransi",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 保险", "Insurance", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ar-gen-gar-pal",""," 代理","Shipping agent","Agen kapal",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 代理", "Shipping agent", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("per-ner-ree-mar-bar-rang-bar-rang",""," 提单者","Consignee ","Penerima barang-barang",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 提单者", "Consignee ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("no-mor-peu-tee-bar-rang-bar-rang-dan no-mor-seu-gel-peu-tee-bar-rang-bar-rang",""," 集装箱号码","Container and seal number","Nomor peti barang-barang dan nomor segel peti barang-barang",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 集装箱号码", "Container and seal number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("su-rat-peu-leu-par-san-bar-rang-bar-rang",""," 发货单","Delivery order","Surat pelepasan barang-barang",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 发货单", "Delivery order", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("daf-tar-bar-rang-bar-rang",""," 清单","Description of goods","Daftar barang-barang",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 清单", "Description of goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bee-yar-yar-peu-ngeum-bar-lee-yan-peu-tee-bar-rang-bar-rang-yang-ter-lat-mer-ler-bee-hee-wak-tu-yang-dee-teun-tu-kan",""," 集装箱延期费用","Detention","Biaya pengembalian peti barang-barang yang telat melebihi waktu yang ditentukan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 集装箱延期费用", "Detention", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bee-yar-yar -dork-gu-men",""," 复印费","Document fee","Biaya dokumen ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 复印费", "Document fee", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ar-gen-peu-ngee-rim-bar-rang",""," 货运代理","Freight forwarder","Agen pengirim barang ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 货运代理", "Freight forwarder", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bar-rang-bar-rang-ber-bar-har-yar",""," 危险品","Dangerous goods","Barang-barang berbahaya",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 危险品", "Dangerous goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tan-dar-dan-no-mor-peu-tee-bar-rang-bar-rang",""," 物品名称和物品编号","Shipping mark and number","Tanda dan nomor peti barang-barang",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 物品名称和物品编号", "Shipping mark and number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fak-tur","","送货单","Invoice","Faktur",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("送货单", "Invoice", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("daf-tar-mu-war-tan-gar-pal",""," 收货单","Bill of lading","Daftar muatan kapal",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 收货单", "Bill of lading", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mar-sook-ger-lu-war",""," 入口- 出口","Entrance - Exit","Masuk – Keluar ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 入口- 出口", "Entrance - Exit", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sar-yar-ee-ngin-am-pil-bar-rang-bar-rang   sar-yar-bar-war-su-rat-per-ngan-tar-ser-bar-kai-book-tee  ar-par-sar-yar-bee-sar-am-bil-bar-rang-bar-rang-ter-seu-but-seu-gar-rang",""," 我拿售货确认书来，我现在可以收货吗","I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ","Saya ingin ambil barang-barang.  Saya bawa surat pengantar sebagai bukti. Apa saya bisa ambil barang-barang tersebut sekarang?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 我拿售货确认书来，我现在可以收货吗", "I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadChinaToLaos(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("darn-su-lah-ga-gorn",""," 海关","Custom house"," ດ່ານສຸລະກາກອນ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" 海关", "Custom house", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sin-kha",""," 货","Goods"," ສິນຄ້າ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 货", "Goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tha",""," 码头","Dock warehouse"," ທ່າ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 码头", "Dock warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nung-seu-hub-hong",""," 证书","Certificate"," ໜັງສືຮັບຮອງ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 证书", "Certificate", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("num-khao",""," 进口","Import"," ນຳເຂົ້າ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 进口", "Import", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("song-org",""," 出口","Export"," ສົ່ງອອກ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 出口", "Export", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kha-tum-niam",""," 费用","Charge"," ຄ່າທຳນຽມ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 费用", "Charge", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("phoo-song-sin-kha",""," 发货者","Goods deliverer"," ຜູ້ສົ່ງສິນຄ້າ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 发货者", "Goods deliverer", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("phoo-hub-sin-kha","","收货者","Goods receiver"," ຜູ້ຮັບສິນຄ້າ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("收货者", "Goods receiver", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hong-mian-khueang/hong-phuk-khueang",""," 仓库","Warehouse"," ຫ້ອງມ້ຽນເຄື່ອງ / ຫ້ອງພັກເຄື່ອງ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 仓库", "Warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pa-kun-phai",""," 保险","Insurance"," ປະກັນໄພ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 保险", "Insurance", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("phu-tang-na",""," 代理","Shipping agent"," ຜູ້ຕາງໜ້າ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 代理", "Shipping agent", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("phoo-hub-ga-song-sin-kha",""," 提单者","Consignee "," ຜູ້ຮັບກາສົ່ງສິນຄ້າ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 提单者", "Consignee ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mai-leg-too-sin-kha-lae-mai-leg-ga-too-sin-kha",""," 集装箱号码","Container and seal number"," ໝາຍເລກຕູ້ສິນຄ້າແລະໝາຍເລກກາ ຕູ້ສິນຄ້າ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 集装箱号码", "Container and seal number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bai-sung-poi-sin-kha",""," 发货单","Delivery order"," ໃບສັ່ງປ່ອຍສິນຄ້າ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 发货单", "Delivery order", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("lai-garn-sin-kha",""," 清单","Description of goods"," ລາຍການສິນຄ້າ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 清单", "Description of goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kha-song-kheun-too-sin-kha-thee-sa-gern-gwar-way-la-thee-gum-nod",""," 集装箱延期费用","Detention"," ຄ່າສົ່ງຄືນຕູ້ສິນຄ້າທີ່ຊ້າເກີນກວ່າເວລາ ທີ່ກຳໜົດ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 集装箱延期费用", "Detention", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kha-aek-ga-sarn",""," 复印费","Document fee"," ຄ່າເອກກະສານ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 复印费", "Document fee", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toe-thaen-phoo-hub-song-sin-kha",""," 货运代理","Freight forwarder"," ໂຕແທນຜູ້ຮັບສົ່ງສິນຄ້າ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 货运代理", "Freight forwarder", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sin-kha-un-ta-lai",""," 危险品","Dangerous goods"," ສິນຄ້າອັນຕະລາຍ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 危险品", "Dangerous goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khueang-mai-lae-mai-leg-heeb-khong-sin-kha",""," 物品名称和物品编号","Shipping mark and number"," ເຄື່ອງໝາຍແລະໝາຍເລກຫີບຂອງສິນຄ້າ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 物品名称和物品编号", "Shipping mark and number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bai-song-sin-kha","","送货单","Invoice"," ໃບສົ່ງສິນຄ້າ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("送货单", "Invoice", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bai-hub-sin-kha",""," 收货单","Bill of lading"," ໃບຮັບສິນຄ້າ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 收货单", "Bill of lading", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tharng-khao-tarng-org",""," 入口- 出口","Entrance - Exit"," ທາງເຂົ້າ - ທາງອອກ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 入口- 出口", "Entrance - Exit", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khoy-ma-hub-sin-kha-lae-ao-bai-song-poi-sin-kha-ma-yung-yuen-khoy-hub-sin-kha-dai-loey-bor",""," 我拿售货确认书来，我现在可以收货吗","I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ","ຂ້ອຍມາຮັບສິນຄ້າແລະເອົາໃບສົ່ງປ່ອຍສິນຄ້າມາຢັ້ງຢືນຂ້ອຍຮັບສິນຄ້າໄດ້ເລີຍບໍ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 我拿售货确认书来，我现在可以收货吗", "I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadChinaToMalaysia(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("ee-mee-kray-sen",""," 海关","Custom house","Imigresen",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" 海关", "Custom house", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ba-ra-ngun-da-ka-ngun",""," 货","Goods","barangan  dagangan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 货", "Goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("per-la-boo-hun",""," 码头","Dock warehouse","Pelabuhan ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 码头", "Dock warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soo-rut-ya-mee-nun",""," 证书","Certificate","Surat jaminan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 证书", "Certificate", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("im-pot",""," 进口","Import","Impot",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 进口", "Import", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ex-pot",""," 出口","Export","Ekspot",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 出口", "Export", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yoo-run",""," 费用","Charge","Yuran",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 费用", "Charge", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("perng-hun-tul-ba-rung",""," 发货者","Goods deliverer","Penghantar barang",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 发货者", "Goods deliverer", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("per-ner-ree-ma-ba-rung","","收货者","Goods receiver","Penerima barang",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("收货者", "Goods receiver", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("koo-dung / koo-dung- ba-rung-gun",""," 仓库","Warehouse","Gudang / Gudang barangan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 仓库", "Warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("in-soo-rern",""," 保险","Insurance","Insuren",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 保险", "Insurance", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wa-geel",""," 代理","Shipping agent","Wakil",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 代理", "Shipping agent", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("per-ner-ree-ma-ba-rung-gee-ree-mun",""," 提单者","Consignee ","Penerima barang kiriman",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 提单者", "Consignee ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("noam-bol-goan-tay-na-darn-noam-bol-jub-mer-ter-ray-goan-tay-na",""," 集装箱号码","Container and seal number","Nombor kontena dan nombor cap materai kontena",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 集装箱号码", "Container and seal number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soo-rut-per-rin-tah-perng-hun-ta-run ba-ra-ngun",""," 发货单","Delivery order","Surat perintah penghantaran barangan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 发货单", "Delivery order", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ser-na-rai-ba-ra-ngun",""," 清单","Description of goods","Senarai barangan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 清单", "Description of goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ba-ya-run-mer-moo-lung-gun- goan-tay-na-tern-lay-wat-da-ree-ma-sa-yong-dee-ter-tub-gun",""," 集装箱延期费用","Detention","Bayaran memulangkan  kontena  terlewat dari  masa   yang ditetapkan",null,null);
                child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 集装箱延期费用", "Detention", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yoo-run-doe-goo-mern",""," 复印费","Document fee","Yuran dokumen",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 复印费", "Document fee", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wa-geel-per-ner-ree-ma-per-ngung-goo-tun-ba-ra-ngun",""," 货运代理","Freight forwarder","Wakil penerima pengangkutan barangan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 货运代理", "Freight forwarder", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ba-ra-ngun-mern-ba-ha-ya",""," 危险品","Dangerous goods","Barangan merbahaya",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 危险品", "Dangerous goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tun-da-darn-noam-bol-per-tee-ba-ra-ngun",""," 物品名称和物品编号","Shipping mark and number","Tanda dan nombor peti barangan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 物品名称和物品编号", "Shipping mark and number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soo-rut-hun-tan-ba-ra-ngun","","送货单","Invoice","Surat hantar barangan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("送货单", "Invoice", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soo-rut-ter-ree-ma-ba-ra-ngun",""," 收货单","Bill of lading","Surat terima barangan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 收货单", "Bill of lading", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ya-lun-ma-sook-ya-lun-ger-loo-wal",""," 入口- 出口","Entrance - Exit","Jalan masuk-jalan keluar",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 入口- 出口", "Entrance - Exit", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ya-da-tung-oon-took-mer-ngum-beel-ba-rang-bern-sa-ma-der-ngun-soo-rut-per-rin-tah-perng-hun-ta-run-ba-ra-ngun-sa-ya-boe-leh-ter-ree-ma-ba-rung-gah",""," 我拿售货确认书来，我现在可以收货吗","I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ","Saya datang untuk mengambil  barang bersama dengan surat  perintah penghantaranbarangan saya boleh terimabarang kah?",null,null);
                child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 我拿售货确认书来，我现在可以收货吗", "I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadChinaToMyanmar(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("a-kaw-khoon-yong",""," 海关","Custom house","အေကာက္ခြန္ရံု",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" 海关", "Custom house", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kong-piat-see",""," 货","Goods","ကုန္ပစၥည္း",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 货", "Goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("se-kan",""," 码头","Dock warehouse","ဆိပ္ကမ္း",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 码头", "Dock warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("thaw-khan-sa",""," 证书","Certificate","ေထာက္ခံစာ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 证书", "Certificate", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("twing-kong",""," 进口","Import","သြင္းကုန္",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 进口", "Import", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("poh-kong",""," 出口","Export","ပုိ ့ကုန္",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 出口", "Export", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("wun-saw-khah",""," 费用","Charge","၀န္ေဆာင္ခ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 费用", "Charge", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kong-poh-too",""," 发货者","Goods deliverer","ကုန္ပုိ ့သူ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 发货者", "Goods deliverer", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kong-laeh-khan-too","","收货者","Goods receiver","ကုန္လက္ခံသူ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("收货者", "Goods receiver", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kong-yong- kong-yong",""," 仓库","Warehouse","ကုန္ရံု",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 仓库", "Warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ar-ma-khan",""," 保险","Insurance","အာမခံ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 保险", "Insurance", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("koe-sa-lae",""," 代理","Shipping agent","ကိုယ္စားလွယ္",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 代理", "Shipping agent", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kong-piat-see-ta-seh-laeh- khan- daeh-too",""," 提单者","Consignee ","ကုန္ပစၥည္းတံဆပ္လက္ခံတဲ့သူ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 提单者", "Consignee ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kong-tet-ta-nan-but-naeh kong- tet-ta-ba-koh-nan-but",""," 集装箱号码","Container and seal number","ကုန္ေသတၱာနံပါတ္နဲ႔ကုန္ေသတၱာဘာကုတ္နံပါတ္",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 集装箱号码", "Container and seal number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kong-ma-lwa",""," 发货单","Delivery order","ကုန္မွာလႊာ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 发货单", "Delivery order", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kong-piat-see-sa-yin",""," 清单","Description of goods","ကုန္ပစၥည္းစာရင္း",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 清单", "Description of goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("a-cheng-loon-daeh-kong- tet-ta- khah",""," 集装箱延期费用","Detention","အခ်ိန္လြန္တဲ့ကုန္ေသတၱာခ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 集装箱延期费用", "Detention", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("sa-ywaeh-sa-dan-khah",""," 复印费","Document fee","စာ႐ြက္စာတမ္းခ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 复印费", "Document fee", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kong-piat-see-tae-saw- daeh- koe-sa-lae",""," 货运代理","Freight forwarder","ကုန္ပစၥည္းသယ္ေဆာင္တဲ့ကိုယ္စားလွယ္",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 货运代理", "Freight forwarder", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("an-da-yae-shi-daeh-kong- piat-see",""," 危险品","Dangerous goods","အႏၲရာယ္ရွိတဲ့ကုန္ပစၥည္း",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 危险品", "Dangerous goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kong-piat-see-yaeh-a-mut- naeh, a- thoh-nan-but",""," 物品名称和物品编号","Shipping mark and number","ကုန္ပစၥည္းရဲ့အမွတ္နဲ႔အထုပ္နံပါတ္",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 物品名称和物品编号", "Shipping mark and number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kong-poh-lwa","","送货单","Invoice","ကုန္္ပို႕လႊာ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("送货单", "Invoice", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kong-ma-lwa",""," 收货单","Bill of lading","ကုန္မွာလႊာ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 收货单", "Bill of lading", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("win-paw-thwaeh-paw",""," 入口- 出口","Entrance - Exit","ဝင္ေပါက္ - ထြက္ေပါက္",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 入口- 出口", "Entrance - Exit", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ja-nor-kong-piat-see-la- yoo-bee  kong-poh-lwa- teen-dae  ja-nor- kong-piat- see yoo- twa-loh-ya- bee-la-kha-mia",""," 我拿售货确认书来，我现在可以收货吗","I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ","ကြ်န္ေတာ္ကုန္ပစၥည္းလာယူၿပီ္း ကုန္္ပို႕လႊာတင္တယ္။ ကြ်န္ေတာ္ကုန္ပစၥည္း ယူသြားလို႔ရၿပီ္လားခင္ဗ်ာ။",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 我拿售货确认书来，我现在可以收货吗", "I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadChinaToPhilippines(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("kas-toms-in-spex-chan",""," 海关","Custom house","Customs inspeksyon",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" 海关", "Custom house", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("par-nin-dar",""," 货","Goods","paninda",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 货", "Goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pu-ey-rar-to",""," 码头","Dock warehouse","puerto",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 码头", "Dock warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ser-ti-pi-go-nang-gar-ran-ti-yar",""," 证书","Certificate","sertipiko ng garantiya",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 证书", "Certificate", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ang-gat",""," 进口","Import","angkat",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 进口", "Import", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("lu-was",""," 出口","Export","luwas",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 出口", "Export", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bar-yat",""," 费用","Charge","bayad",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 费用", "Charge", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nak-par-dar-lar",""," 发货者","Goods deliverer","nagpadala",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 发货者", "Goods deliverer", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tu-mang-gap","","收货者","Goods receiver","Tumanggap",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("收货者", "Goods receiver", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bo-dey-gar-nang-par-nin-dar",""," 仓库","Warehouse","Bodega ng paninda",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 仓库", "Warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pak-sey-sey-ku-ro",""," 保险","Insurance","pagseseguro",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 保险", "Insurance", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gi-nar-tar-wan",""," 代理","Shipping agent","kinatawan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 代理", "Shipping agent", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kom-sai-nee-of-goos",""," 提单者","Consignee ","Consignee of goods",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 提单者", "Consignee ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bi-lang-nang-goos-kon-ten-ner-at-nang-sel-yar",""," 集装箱号码","Container and seal number","Bilang ng Goods container at ng selya",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 集装箱号码", "Container and seal number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("or-der-sar-pak-dar-dar-lar-nang-gar-lar-gal",""," 发货单","Delivery order","Order sa pagdadala ng kalakal",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 发货单", "Delivery order", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("lis-tar-han-nang-mar-ngar-gar-lar-gal",""," 清单","Description of goods","Listahan ng mga kalakal",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 清单", "Description of goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mool-tar-sar-hu-ling-pak-sar-sar-u-li-nang-goos-kon-ten-ner",""," 集装箱延期费用","Detention","Multa sa huling pagsasauli ng goods container",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 集装箱延期费用", "Detention", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dog-kiw-men-fee",""," 复印费","Document fee","Document fee",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 复印费", "Document fee", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ar-hen-tey-par-rar-sar-dey-li-wer-ree",""," 货运代理","Freight forwarder","Ahente para sa delivery",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 货运代理", "Freight forwarder", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("mar-pan-ngar-nip-nar-mar-ngar-gar-lar-gal",""," 危险品","Dangerous goods","mapanganib na mga kalakal",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 危险品", "Dangerous goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pi-rar-mar-at-nu-mey-ro-nang-pak-tang-gap-nang-gar-lar-gal",""," 物品名称和物品编号","Shipping mark and number","Pirma at numero ng pagtanggap ng kalakal",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 物品名称和物品编号", "Shipping mark and number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("si-ngi-lin","","送货单","Invoice","singilin",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("送货单", "Invoice", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("gu-wen-tar-nang-pak-gar-gar",""," 收货单","Bill of lading","kuwenta ng pagkarga",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 收货单", "Bill of lading", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("pak- par-sok-at-ang-pak-lar-bas",""," 入口- 出口","Entrance - Exit","Pagpasok at ang paglabas",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 入口- 出口", "Entrance - Exit", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("nan-di-to-ar-go-pa-ra-gu-nin-ang-mar-ngar-gar-lar-gal-har-wak-go-ang-par-pel-par-rar-sar-or-der-for-dey-li-wer-ree-pu-wey-dey-bang-gu-nin-gar-ar-gad-ang-mar-ngar-gar-lar-gal",""," 我拿售货确认书来，我现在可以收货吗","I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ","Nandito ako para kunin ang mga kalakal. Hawak ko ang papel para sa “order for delivery”.  Puwede bang kunin kaagad ang mga kalakal?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 我拿售货确认书来，我现在可以收货吗", "I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadChinaToSingapore(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("cas-tom-haos",""," 海关","Custom house","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" 海关", "Custom house", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("goos",""," 货","Goods","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 货", "Goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dok-ware-haos",""," 码头","Dock warehouse","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 码头", "Dock warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ser-ti-fi-ket",""," 证书","Certificate","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 证书", "Certificate", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("im-port",""," 进口","Import","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 进口", "Import", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ex-port",""," 出口","Export","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 出口", "Export", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("charch",""," 费用","Charge","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 费用", "Charge", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("goos-dee-li-wer-rer",""," 发货者","Goods deliverer","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 发货者", "Goods deliverer", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("goos-ree-seef-wer","","收货者","Goods receiver","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("收货者", "Goods receiver", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ware-haos",""," 仓库","Warehouse","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 仓库", "Warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("in-chua-rans",""," 保险","Insurance","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 保险", "Insurance", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chip-ping-eh-jent",""," 代理","Shipping agent","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 代理", "Shipping agent", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kan-sai-nee",""," 提单者","Consignee ","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 提单者", "Consignee ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kon-ten-ner-an-sil-nam-ber",""," 集装箱号码","Container and seal number","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 集装箱号码", "Container and seal number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-li-wer-ree-or-der",""," 发货单","Delivery order","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 发货单", "Delivery order", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dis-crip-chan-of-goos",""," 清单","Description of goods","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 清单", "Description of goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dee-ten-chan",""," 集装箱延期费用","Detention","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 集装箱延期费用", "Detention", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dok-kio-ment-fee",""," 复印费","Document fee","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 复印费", "Document fee", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("fret-for-ward-der",""," 货运代理","Freight forwarder","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 货运代理", "Freight forwarder", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("den-jer-ras-goos",""," 危险品","Dangerous goods","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 危险品", "Dangerous goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("chip-ping-mark-an-nam-ber",""," 物品名称和物品编号","Shipping mark and number","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 物品名称和物品编号", "Shipping mark and number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("in-wois","","送货单","Invoice","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("送货单", "Invoice", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("bil-of-led -ding",""," 收货单","Bill of lading","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 收货单", "Bill of lading", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("en-trans-ex-sit",""," 入口- 出口","Entrance - Exit","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 入口- 出口", "Entrance - Exit", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ai-wood-laik-tu-pik-ap-goos-ai-am-wit-a-dee-li-wer-ree-or-der-to-kon-ferm-kood-ai-ree-seef-goos",""," 我拿售货确认书来，我现在可以收货吗","I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ","",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 我拿售货确认书来，我现在可以收货吗", "I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
    }

    public void loadChinaToVietnam(){
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("hai-kwan",""," 海关","Custom house","hải quan",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(" 海关", "Custom house", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hang-hwa",""," 货","Goods","hàng hóa",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 货", "Goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("kong-tram-ben",""," 码头","Dock warehouse","cổng, trạm, bến",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 码头", "Dock warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yuai-jing-yern",""," 证书","Certificate","giấy chứng nhận",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 证书", "Certificate", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yerb-khoeu",""," 进口","Import","nhập khẩu",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 进口", "Import", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("suad-khoeu",""," 出口","Export","xuất khẩu",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 出口", "Export", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("lay-fee",""," 费用","Charge","lệ phí",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 费用", "Charge", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ngeau-kuew-hang",""," 发货者","Goods deliverer","người gửi hàng",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 发货者", "Goods deliverer", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ngeau-yern-hang","","收货者","Goods receiver","người nhận hàng",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("收货者", "Goods receiver", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("khor / khor-hang",""," 仓库","Warehouse","kho / kho hàng",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 仓库", "Warehouse", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("boa-hium",""," 保险","Insurance","bảo hiểm",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 保险", "Insurance", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ngeau-dai-yean",""," 代理","Shipping agent","người đại diện",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 代理", "Shipping agent", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("ngeau-yern-hang-san-ferm",""," 提单者","Consignee ","người nhận hàng sản phẩm",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 提单者", "Consignee ", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("soe-thung-container-wa-soe-korn-yue-kua-thung-container",""," 集装箱号码","Container and seal number","số thùng container và số con dấu của thùng container",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 集装箱号码", "Container and seal number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yuai-fab-jor-guew-hang",""," 发货单","Delivery order","giấy phép cho gủi hàng",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 发货单", "Delivery order", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yan-suk-hang-hwa",""," 清单","Description of goods","danh sách hàng hóa",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 清单", "Description of goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tien-fard-container-den-jum-kwa-han-den",""," 集装箱延期费用","Detention","tiền phạt container đến chậm quá hạn định",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 集装箱延期费用", "Detention", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("tien-larm-yeaw-ter",""," 复印费","Document fee","tiền làm giấy tờ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 复印费", "Document fee", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("dai-lee-wern-tai-hang-hwa",""," 货运代理","Freight forwarder","đại lý vận tải hàng hóa",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 货运代理", "Freight forwarder", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hang-ngui-heim",""," 危险品","Dangerous goods","hàng nguy hiểm",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 危险品", "Dangerous goods", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("yarn-hiaw-hwa-soe-hiaw-kua-boa-bi-san-ferm",""," 物品名称和物品编号","Shipping mark and number","nhãn hiệu và số hiệu của bao bì sản phẩm",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 物品名称和物品编号", "Shipping mark and number", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hwa-dern-kuew-hang","","送货单","Invoice","hóa đơn gửi hàng ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader("送货单", "Invoice", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("hwa-dern-yern-hang",""," 收货单","Bill of lading","hóa đơn nhận hàng ",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 收货单", "Bill of lading", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("loi-wow-loi-ra",""," 入口- 出口","Entrance - Exit","lối vào - lối ra",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 入口- 出口", "Entrance - Exit", childList);
        groupHeaderList.add(groupHeader);
//-------------------------------------------------
        childList = new ArrayList<Child>();
        child = new Child("toay-den-yern-hang-hwa-dam-yuai-fab-jor-kuey-hang-den-larm-bung, toay-kor-thay-lun-hang-ngai-khong-ar",""," 我拿售货确认书来，我现在可以收货吗","I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ","tôi đến nhận hàng và đem giấy phép cho gửi hàng đến làm bằng, tôi có thể lãnh hàng ngay không ạ?",null,null);
        child.setSoundPath(-1);
        childList.add(child);

        groupHeader = new GroupHeader(" 我拿售货确认书来，我现在可以收货吗", "I would like to pick up goods. I’m with a delivery order to confirm. Could I receive goods? ", childList);
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
