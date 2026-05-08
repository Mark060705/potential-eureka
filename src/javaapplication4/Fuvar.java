/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author AmmerMárkDániel(SZF_
 */
public class Fuvar {
    private String rendszam, fizetesiMod;
    private int ido, osszeg;

    public Fuvar(String rendszam, String fizetesiMod, int ido, int osszeg) {
        this.rendszam = rendszam;
        this.fizetesiMod = fizetesiMod;
        this.ido = ido;
        this.osszeg = osszeg;
    }

    public String getRendszam() {
        return rendszam;
    }

    public String getFizetesiMod() {
        return fizetesiMod;
    }

    public int getIdo() {
        return ido;
    }

    public int getOsszeg() {
        return osszeg;
    }
    
    
}
