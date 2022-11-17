package com.krafttechnologie.tests.day_14;

public class Singleton {
    private Singleton(){
        //diğer classlardan obje oluşturulamaz
    }
    public static String str;
    public static String getInstance(){
        if (str==null){
            System.out.println("str null ise değer ata");
            str="chrome";
        }else {
            System.out.println("valuesu varsa onu döndür");
        } return str;
    }
}
