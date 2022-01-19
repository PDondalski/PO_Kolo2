package com.company;

import java.util.*;

public class Main{
    public static void main(String[] args) {
        Autor autor_pierwszy = new Autor("Paweł","jakismail@22.pl",'m');
        Autor autor_drugi = new Autor("Przemek","przykladmail@255.pl","m");
        Autor autor_trzeci = new Autor("Jolanta","jakisikmail@12.pl",'k');
        Autor autor_czwarty = new Autor("Maciek","eeeeeemail@234.pl",'m');

        ArrayList<Autor> lista_autorow = new ArrayList<Autor>(Arrays.asList(autor_pierwszy, autor_drugi, autor_trzeci, autor_czwarty));
        System.out.println("Lista autorow: " + lista_autorow);
        Collections.sort(lista_autorow);
        System.out.println(lista_autorow);


        Ksiazka ksiazka_pierwsza = new Ksiazka("Dramatzilla",autor_pierwszy,22);
        Ksiazka ksiazka_druga = new Ksiazka("Niesamowitość",autor_trzeci,99);
        Ksiazka ksiazka_trzecia = new Ksiazka("Gargantuiczność",autor_czwarty,71);
        Ksiazka ksiazka_czwarta = new Ksiazka("Dramatzilla",autor_pierwszy,37);

        ArrayList<Ksiazka> lista_ksiazek = new ArrayList<Ksiazka>(Arrays.asList(ksiazka_pierwsza,ksiazka_druga,ksiazka_trzecia,ksiazka_czwarta));
        System.out.println("Lista ksiazek: " + lista_ksiazek);
        Collections.sort(lista_ksiazek);
        System.out.println(lista_ksiazek);
    }
}
