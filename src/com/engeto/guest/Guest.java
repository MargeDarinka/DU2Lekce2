package com.engeto.guest;

import java.time.LocalDate;

public class Guest {
   private String celeJmeno;
   private LocalDate datumNarozeni;

   //region Konstruktory

    public Guest(String celeJmeno,
                 LocalDate datumNarozeni) {
        this.celeJmeno = celeJmeno;
        this.datumNarozeni = datumNarozeni;

    }


    //endregion


    //region Přístupové metody

    public String getCeleJmeno() {
        return celeJmeno;
    }

    public void setCeleJmeno(String celeJmeno) {
        this.celeJmeno = celeJmeno;
    }


    public LocalDate getDatumNarozeni() {
        return datumNarozeni;
    }

    public void setDatumNarozeni(LocalDate datumNarozeni) {
        this.datumNarozeni = datumNarozeni;
    }

    //endregion
}
