/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7;

/**
 *
 * @author student nr indeksu
typ studiów
kierunek
rok studiów
 */
public class Student extends Osoba{
    private int nr_indeksu;
    private String typ_studiów;
    private String kierunek;
    private int rok_studiow;

    public Student(int nr_indeksu, String typ_studiów, String kierunek, int rok_studiow, String imie, String nazwisko, String dataUrodzenia, String plec) {
        super(imie, nazwisko, dataUrodzenia, plec);
        this.nr_indeksu = nr_indeksu;
        this.typ_studiów = typ_studiów;
        this.kierunek = kierunek;
        this.rok_studiow = rok_studiow;
    }
    @Override
    public void wyswietl(){
       super.wyswietl();
       System.out.println("nr_indeksu  "+ this.nr_indeksu+" typ_studiów "+ this.typ_studiów+" kierunek "+ this.kierunek+ " rok_studiow "+ this.rok_studiow);
    }
    public int getNr_indeksu() {
        return nr_indeksu;
    }

    public void setNr_indeksu(int nr_indeksu) {
        this.nr_indeksu = nr_indeksu;
    }

    public String getTyp_studiów() {
        return typ_studiów;
    }

    public void setTyp_studiów(String typ_studiów) {
        this.typ_studiów = typ_studiów;
    }

    public String getKierunek() {
        return kierunek;
    }

    public void setKierunek(String kierunek) {
        this.kierunek = kierunek;
    }

    public int getRok_studiow() {
        return rok_studiow;
    }

    public void setRok_studiow(int rok_studiow) {
        this.rok_studiow = rok_studiow;
    }
    
}
