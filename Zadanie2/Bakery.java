package com.company;

public class Bakery extends Shop{
    protected String Chleb;
    protected String Paczek;
    protected String Bulka;
    protected String Drozdzowka;

    public String getChleb() {
        return Chleb;
    }

    public void setChleb(String chleb) {
        Chleb = chleb;
    }

    public String getPaczek() {
        return Paczek;
    }

    public void setPaczek(String paczek) {
        Paczek = paczek;
    }

    public String getBulka() {
        return Bulka;
    }

    public void setBulka(String bulka) {
        Bulka = bulka;
    }

    public String getDrozdzowka() {
        return Drozdzowka;
    }

    public void setDrozdzowka(String drozdzowka) {
        Drozdzowka = drozdzowka;
    }

    @Override
    public String info() {

        System.out.println(" Produkty w piekarni: " + getChleb() + "  " + getPaczek() + "  " + getBulka() + "  " + getDrozdzowka());

        return super.info();

    }
}
