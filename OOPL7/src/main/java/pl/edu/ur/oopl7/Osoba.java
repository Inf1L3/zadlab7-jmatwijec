/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7;

/**
 *
 * @author student  imię, nazwisko, data urodzenia, płeć oraz cechować się zachowaniami w postaci zaimplementowanej metodzie zwracającej informację o osobie. 
 */
public class Osoba {

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(String dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public String getPlec() {
        return plec;
    }

    public void setPlec(String plec) {
        this.plec = plec;
    }
    private String imie;
    private String nazwisko;
    private String dataUrodzenia;
    private String plec;

    public Osoba(String imie, String nazwisko, String dataUrodzenia, String plec) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
        this.plec = plec;
    }
   public void wyswietl(){
       System.out.println("Imie "+ this.imie+" Nazwisko "+ this.nazwisko+" Data urodzenia "+ this.dataUrodzenia+ " plec "+ this.plec);
   } 
}
