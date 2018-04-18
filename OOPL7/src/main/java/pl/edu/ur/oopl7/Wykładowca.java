/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7;

/**
 *
 * @author student
 */
public class Wykładowca extends Osoba{
    private int pensja;
    private String tytul;

    public Wykładowca(int pensja, String tytul, String imie, String nazwisko, String dataUrodzenia, String plec) {
        super(imie, nazwisko, dataUrodzenia, plec);
        this.pensja = pensja;
        this.tytul = tytul;
    }
    @Override
    public void wyswietl(){
       super.wyswietl();
       System.out.println("pensja  "+ this.pensja+" tytul " + this.tytul);
    }
    public int getPensja() {
        return pensja;
    }

    public void setPensja(int pensja) {
        this.pensja = pensja;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }
    
}
