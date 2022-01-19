package com.company;

public class Ksiazka extends Autor implements Cloneable, Comparable<Ksiazka>{
    private String tytul;
    private Autor autor;
    private Double cena;

    public Ksiazka(String tytul, Autor autor, double Cena){
        this.tytul = tytul;
        this.cena = cena;
        this.autor = autor;
    }

    public String getTytul() {
        return tytul;
    }

    public Autor getAutor() {
        return autor;
    }

    public Double getCena() {
        return cena;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setCena(Double cena) {
        this.cena = cena;
    }

    @Override
    public int compareTo(Ksiazka o){
        int res = this.getAutor().compareTo(o.getNazwa());
        if(res == 0){
            res = this.tytul.compareTo(o.tytul);
        }
        if(res == 0){
            res = Double.compare(this.cena,o.cena);
        }
        return res;
    }
}
