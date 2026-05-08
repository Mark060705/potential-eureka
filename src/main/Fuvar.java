/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author AmmerMárkDániel(SZF_
 */
public class Fuvar {
    private String rendszam, fizetesiMod;
    private int ido;
    private double osszeg;

    public Fuvar(String rendszam, int ido, double osszeg, String fizetesiMod) {
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

    public double getOsszeg() {
        return osszeg;
    }
    
    
}
