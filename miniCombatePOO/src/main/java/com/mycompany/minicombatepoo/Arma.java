/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.minicombatepoo;

/**
 *
 * @author damt110
 */
public class Arma {
    private String tipoArma;
    private int danioMaximo;

    public Arma(String tipoArma, int danioMaximo) {
        this.tipoArma = tipoArma;
        this.danioMaximo = danioMaximo;
    }

    public String getTipoArma() {
        return tipoArma;
    }

    public int danioMaximo() {
        return danioMaximo;
    }

    public void setDanioMaximo(int danioMaximo) {
        this.danioMaximo = danioMaximo;
    }

    public void setTipoArma(String tipoArma) {
        this.tipoArma = tipoArma;
    }
     
}
