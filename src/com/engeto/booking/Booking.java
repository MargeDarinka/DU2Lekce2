package com.engeto.booking;

import java.time.LocalDate;

public class Booking {
    private String celeJmeno;
    private int cisloPokoje ;
    private LocalDate datumPrijezdu;
    private LocalDate datumOdjezdu;
    private boolean pracovniPobyt;

    //region Konstruktor


    public Booking(String celeJmeno, int cisloPokoje, LocalDate datumPrijezdu, LocalDate datumOdjezdu, boolean pracovniPobyt) {
        this.celeJmeno = celeJmeno;
        this.cisloPokoje = cisloPokoje;
        this.datumPrijezdu = datumPrijezdu;
        this.datumOdjezdu = datumOdjezdu;
        this.pracovniPobyt = pracovniPobyt;

    }

    //endregion

    //region Přístupové metody

    public String getCeleJmeno() {
        return celeJmeno;
    }

    public void setCeleJmeno(String celeJmeno) {
        this.celeJmeno = celeJmeno;
    }

    public int getCisloPokoje() {
        return cisloPokoje;
    }

    public void setCisloPokoje(int cisloPokoje) {
        this.cisloPokoje = cisloPokoje;
    }

    public LocalDate getDatumPrijezdu() {
        return datumPrijezdu;
    }

    public void setDatumPrijezdu(LocalDate datumPrijezdu) {
        this.datumPrijezdu = datumPrijezdu;
    }

    public LocalDate getDatumOdjezdu() {
        return datumOdjezdu;
    }

    public void setDatumOdjezdu(LocalDate datumOdjezdu) {
        this.datumOdjezdu = datumOdjezdu;
    }

    public boolean isPracovniPobyt() {
        return pracovniPobyt;
    }

    public void setPracovniPobyt(boolean pracovniPobyt) {
        this.pracovniPobyt = pracovniPobyt;
    }

    //endregion

    @Override
    public String toString() {
        return "Booking{" +
                "cele Jmeno=" + celeJmeno +
                ", cislo pokoje=" + cisloPokoje +
                ", datum prijezdu='" + datumPrijezdu + '\'' +
                ", datum odjezdu='" + datumOdjezdu + '\'' +
                ", pracovní pobyt=" + pracovniPobyt +
                '}';

    }
}