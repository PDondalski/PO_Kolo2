package com.company;

import com.sun.org.apache.xml.internal.utils.StringComparable;
import sun.jvm.hotspot.utilities.ObjectReader;

public class Autor implements Cloneable, Comparable<Autor>{
    private String nazwa;
    private String email;
    private char plec;

    public String getNazwa() {
        return nazwa;
    }

    public String getEmail() {
        return email;
    }

    public char getPlec() {
        return plec;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPlec(char plec) {
        this.plec = plec;
    }

    @Override
    public int compareTo(Autor o){
        int porownanie = nazwa.compareTo(o.nazwa);
        if (porownanie == 0){
            porownanie = Character.compare(this.plec, o.plec);
        }
        return porownanie;
    }

    @Override
    public String toString() {
        return "Autor[" +
                "nazwa='" + nazwa  +
                ", email='" + email  +
                ", plec=" + plec +
                ']';
    }
}
