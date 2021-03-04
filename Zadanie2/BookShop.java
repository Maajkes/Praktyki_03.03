package com.company;

public class BookShop extends  Shop {
    protected String ksiazka1;
    protected String ksiazka2;
    protected String ksiazka3;
    protected String ksiazka4;


    public BookShop() {

    }

    public String getKsiazka1() {
        return ksiazka1;
    }

    public void setKsiazka1(String ksiazka1) {
        this.ksiazka1 = ksiazka1;
    }

    public String getKsiazka2() {
        return ksiazka2;
    }

    public void setKsiazka2(String ksiazka2) {
        this.ksiazka2 = ksiazka2;
    }

    public String getKsiazka3() {
        return ksiazka3;
    }

    public void setKsiazka3(String ksiazka3) {
        this.ksiazka3 = ksiazka3;
    }

    public String getKsiazka4() {
        return ksiazka4;
    }

    public void setKsiazka4(String ksiazka4) {
        this.ksiazka4 = ksiazka4;
    }

    @Override
    public String info() {
        System.out.println(" Księgarnia: " + getKsiazka1() + "  " + getKsiazka2()  + "  " + getKsiazka3() + "  " + getKsiazka4());
        return super.info();

    }
}
