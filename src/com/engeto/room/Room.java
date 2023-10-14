package com.engeto.room;



public class Room {
    private int cisloPokoje;
    private int luzka;
    private boolean balkon;
    private boolean vyhled;
    private int cenaPokoje;

    //region Konstruktory

    public Room(int cisloPokoje, int luzka,
                boolean balkon, boolean vyhled, int cenaPokoje) {
        this.cisloPokoje = cisloPokoje;
        this.luzka = luzka;
        this.balkon = balkon;
        this.vyhled = vyhled;
        this.cenaPokoje = cenaPokoje;
    }

    public Room() {

    }
    //endregion


    //region Přístupové metody

    public int getCisloPokoje() {
        return cisloPokoje;
    }

    public void setCisloPokoje(int cisloPokoje) {
        this.cisloPokoje = cisloPokoje;
    }

    public int getLuzka() {
        return luzka;
    }

    public void setLuzka(int luzka) {
        this.luzka = luzka;
    }

    public boolean isBalkon() {
        return balkon;
    }

    public void setBalkon(boolean balkon) {
        this.balkon = balkon;
    }

    public boolean isVyhled() {
        return vyhled;
    }

    public void setVyhled(boolean vyhled) {
        this.vyhled = vyhled;
    }

    public int getCenaPokoje() {
        return cenaPokoje;
    }

    public void setCenaPokoje(int cenaPokoje) {
        this.cenaPokoje = cenaPokoje;
    }

    //endregio

    @Override
    public String toString() {
        return "Room{" +
                "cislo pokoje=" + cisloPokoje +
                ", luzka='" + luzka + '\'' +
                ", balkon='" + balkon + '\'' +
                ", vyhled=" + vyhled + '\'' +
                ", cena pokoje=" + vyhled +
                '}';
    }

    public void addRoom(Room room) {
    }

    public void printAllRoom() {
    }
}
