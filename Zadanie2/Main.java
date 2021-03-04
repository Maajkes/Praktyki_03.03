package com.company;

public class Main {

    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.setSize("6/9");
        shop.setAddress(" Głowna 13");
        System.out.println(shop.info());

        BookShop bookShop = new BookShop();

        bookShop.setSize("6/10");
        bookShop.setAddress(" Główna 13 ");

        bookShop.setKsiazka1("Ksiazka1");
        bookShop.setKsiazka2("Ksiazka2");
        bookShop.setKsiazka3("Ksiazka3");
        bookShop.setKsiazka4("Ksiazka4");
        System.out.println(bookShop.info());

        Bakery bakery = new Bakery();
        bakery.setSize("6/11");
        bakery.setAddress(" Główna 13");


        bakery.setChleb("Chleb");
        bakery.setPaczek("Paczek");
        bakery.setBulka("Bulka");
        bakery.setDrozdzowka("Drozdzowka");
        System.out.println(bakery.info());

    }
}
