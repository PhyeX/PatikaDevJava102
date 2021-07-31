package com.company;

import com.company.Products.Color;
import com.company.Products.Laptop;
import com.company.Products.Phone;
import com.company.Stores.Loader;
import com.company.Stores.Store;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        TreeSet<Store> stores = Loader.loadStores();
        Scanner scan = new Scanner(System.in);

        int selection;
        do{
            getSelections();
            selection = scan.nextInt();
            System.out.println("Tercihiniz : "+ selection);
            switch ( selection ){
                case 1:
                    getSelectionsOfNoteBook(stores);
                    break;
                case 2:
                    getSelectionsOfPhone(stores);
                    break;
                case 3:
                    getStores(stores);
                    break;


            }
        } while(selection != 0);


    }

    public static void getSelectionPhoneText(){
        System.out.println("Telefon Yönetim Paneli");
        System.out.println("1 - Listele");
        System.out.println("2 - Id'ile sil");
        System.out.println("3 - Telefon ekle");
        System.out.println("0 - Çıkış Yap");
    }
    public static void deleteByIdPhone(TreeSet<Store> stores ){
        Scanner scan = new Scanner(System.in);
        System.out.println("Silincek Id'yi giriniz");
        int id = scan.nextInt();
        for( Store store : stores){
            try{
                List<Phone> phones = store.getPhoneList();
                for( Phone phone : phones ){
                    if( phone.getId() == id){
                        store.getPhoneList().remove(phone);
                        System.out.println("Cihaz başarıyla kaldırıldı! ");
                        return;
                    }
                }
            }catch (Exception e ){

            }
        }
    }
    public static void deleteByIdLaptop(TreeSet<Store> stores ){
        Scanner scan = new Scanner(System.in);
        System.out.println("Silincek Id'yi giriniz");
        int id = scan.nextInt();
        for( Store store : stores){
            try{
                List<Laptop> laptops = store.getLaptopList();
                for( Laptop laptop : laptops ){
                    if( laptop.getId() == id){
                        store.getPhoneList().remove(laptop);
                        System.out.println("Cihaz başarıyla kaldırıldı! ");
                        return;
                    }
                }
            }catch (Exception e ){

            }
        }

    }
    public static  void getSelectionsOfPhone(TreeSet<Store> stores){
        Scanner scan = new Scanner(System.in);
        int selection;
        do{
            getSelectionPhoneText();
            selection = scan.nextInt();
            switch (selection){
                case 1:
                    listPhones(stores);
                    break;
                case 2:
                    deleteByIdPhone(stores);
                    break;
            }
        }while(selection != 0);
    }

    public static void listPhones(TreeSet<Store> stores){
        List<Phone> allPhones = new ArrayList<>();

        for( Store store : stores ){
            try {
                allPhones.addAll(store.getPhoneList());
            }catch (Exception e){

            }
        }

        listOfPhoneString();
        System.out.println("| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | Kamera    | Pil       | RAM       | Renk      |");
        listOfPhoneString();
        for( Phone phone : allPhones ){
            System.out.format("| %-2d | %-30s| %-10d| %-10s| %-10d| %-10.1f| %-10d| %-10d| %-10d| %-10s| \n",phone.getId(),phone.getName(),phone.getPrice(),phone.getBrand(),phone.getMemoryCapacity(),phone.getScreenSize(),phone.getCamera(),phone.getBatteryPower(),phone.getRam(),phone.getColor());

        }
        listOfPhoneString();
    }
    public static  void selectionNoteBookText(){
        System.out.println("NetBook Yönetim Paneli");
        System.out.println("1 - Listele");
        System.out.println("2 - Id'ile sil");
        System.out.println("3 - NetBook ekle");
        System.out.println("0 - Çıkış Yap");
    }
    public static void getSelectionsOfNoteBook(TreeSet<Store> stores){
        Scanner scan = new Scanner(System.in);

        int selection;
        do{
            selectionNoteBookText();
            selection = scan.nextInt();
            switch (selection){
                case 1:
                    listNoteBooks(stores);
                    break;
                case 2:
                    deleteByIdLaptop(stores);
                    break;
                case 3:
                    addLaptop(stores);
                    break;
            }
        }while(selection != 0);

    }
    public static void addLaptop(TreeSet<Store> stores){
        Scanner scan = new Scanner(System.in);

        System.out.println("Eklemek istediğiniz laptopun adını giriniz ");
        String name = scan.next();
        System.out.println("Eklemek istediğiniz laptopun fiyatını giriniz ");
        int price = scan.nextInt();
        System.out.println("Eklemek istediğiniz laptopun markasını giriniz ");
        String brand = scan.next();
        if( ! ( stores.stream().filter( i -> i.getName().equals(brand)).toArray().length > 0  ) ){
            System.out.println("Böyle bir marka yok çıkış yapılıyor");
            return;
        }
        System.out.println("Eklemek istediğiniz laptopun miktarını giriniz ");
        int stockAmount = scan.nextInt();
        System.out.println("EKlemek sitediğiniz laptopun indirim miktarını giriniz");
        float discount = scan.nextFloat();
        System.out.println("Eklemek istediğiniz laptopun ekran boyutunu giriniz  (Inc olarak )");
        float screenSize = scan.nextFloat();
        System.out.println("Eklemek istediğiniz laptopun depolama alanını giriniz (GB olarak )");
        int memoryCapacity = scan.nextInt();
        System.out.println("Eklemek istediğiniz laptopun ram miktarını  giriniz (GB olarak )");
        int ram = scan.nextInt();

        Laptop laptop = new Laptop(price, discount, stockAmount, name, brand, memoryCapacity, screenSize, ram);
        try{
            stores.stream().filter( i -> i.getName().equals(brand)).findFirst().get().getLaptopList().add(laptop);
        }catch (Exception e){
            System.out.println("Bir sorun oluştu!");
        }

    }
    public static void addPhone(TreeSet<Store> stores){
        Scanner scan = new Scanner(System.in);

        System.out.println("Eklemek istediğiniz telefonun adını giriniz ");
        String name = scan.next();
        System.out.println("Eklemek istediğiniz telefonun fiyatını giriniz ");
        int price = scan.nextInt();
        System.out.println("Eklemek istediğiniz telefonun markasını giriniz ");
        String brand = scan.next();
        if( ! ( stores.stream().filter( i -> i.getName().equals(brand)).toArray().length > 0  ) ){
            System.out.println("Böyle bir marka yok çıkış yapılıyor");
            return;
        }
        System.out.println("Eklemek istediğiniz telefonun miktarını giriniz ");
        int stockAmount = scan.nextInt();
        System.out.println("EKlemek sitediğiniz telefonun indirim miktarını giriniz");
        float discount = scan.nextFloat();
        System.out.println("Eklemek istediğiniz telefonun ekran boyutunu giriniz  (Inc olarak )");
        float screenSize = scan.nextFloat();
        System.out.println("Eklemek istediğiniz telefonun depolama alanını giriniz (GB olarak )");
        int memoryCapacity = scan.nextInt();
        System.out.println("Eklemek istediğiniz telefonun ram miktarını  giriniz (GB olarak )");
        int ram = scan.nextInt();
        System.out.println("Eklemek istediğiniz telefonun batarya gücünü girdiniz ");
        int batteryPower = scan.nextInt();
        System.out.println("Eklemek istediğiniz  telefonun camare gücünü giriniz ");
        int camera = scan.nextInt();
        System.out.println("Eklemek istediğiniz telefonun resmini giriniz ");
        System.out.println(" 1-Mavi \n 2-Kırmızı \n 3-Siyah");
        int selection = scan.nextInt();

        Color color = selection == 1 ? Color.Mavi : selection == 2 ? Color.Kırmızı : Color.Siyah ;


        Phone phone = new Phone(price, discount, stockAmount, name, brand, memoryCapacity, screenSize, ram ,batteryPower ,color,camera);
        try{
            stores.stream().filter( i -> i.getName().equals(brand)).findFirst().get().getPhoneList().add(phone);
        }catch (Exception e){
            System.out.println("Bir sorun oluştu!");
        }

    }
    /*
----------------------------------------------------------------------------------------------------
| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | RAM         |
----------------------------------------------------------------------------------------------------
| 1  | HUAWEI Matebook 14            | 7000.0 TL | Huawei    | 512       | 14.0      | 16          |
| 2  | LENOVO V14 IGL                | 3699.0 TL | Lenovo    | 1024      | 14.0      | 8           |
| 3  | ASUS Tuf Gaming               | 8199.0 TL | Asus      | 2048      | 15.6      | 32          |
----------------------------------------------------------------------------------------------------
    */

    public static void listNoteBooks(TreeSet<Store> stores){
        List<Laptop> allLaptops = new ArrayList<>();

        for( Store store : stores ){
            try {
                allLaptops.addAll(store.getLaptopList());
            }catch (Exception e){

            }
        }
        listeOfLaptopString();
        System.out.println("| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | RAM         |");
        listeOfLaptopString();
        for( Laptop laptop : allLaptops ){
         System.out.format("| %-2d | %-30s| %-10d| %-10s| %-10d| %-10.1f| %-10d |\n",laptop.getId(),laptop.getName(),laptop.getPrice(),laptop.getBrand(),laptop.getMemoryCapacity(),laptop.getScreenSize(),laptop.getRam());

        }
        listeOfLaptopString();
    }
    public static void listeOfLaptopString(){
        System.out.println("----------------------------------------------------------------------------------------------------");
    }
    public static void listOfPhoneString(){
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
    }
    public static void getStores(TreeSet<Store> stores){
        System.out.println(
                "Markalarımız\n" +
                "--------------" );

        for( Store store : stores ){
            System.out.println("- "+ store.getName());
        }

    }

    public static void getSelections() {
        System.out.println("PatikaStore Ürün Yönetim Paneli !\n" +
                "1 - Notebook İşlemleri\n" +
                "2 - Cep Telefonu İşlemleri\n" +
                "3 - Marka Listele\n" +
                "0 - Çıkış Yap");

    }
}
