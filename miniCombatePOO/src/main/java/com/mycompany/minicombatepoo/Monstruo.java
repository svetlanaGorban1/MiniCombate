/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.minicombatepoo;

/**
 *
 * @author damt110
 */
public class Monstruo {
     private String tipo;
    private int hp;
    private int danioMaximo;
    
    public Monstruo(){
            }
    public Monstruo(String tipo,int hp,int danioMaximo){
        this.tipo=tipo;
        this.hp=hp;
        this.danioMaximo=danioMaximo;
    }
    public String getTipo(){
        return tipo;
    }
    public int getHp(){
        return hp;
    }
    public int getDanioMaximo(){
        return danioMaximo;
    }
    public void setTipo(String tipo){
        this.tipo=tipo;
    }
    public void setHp(int hp){
        this.hp=hp;
    }
    public void setDanioMaximo(int danioMaximo){
        this.danioMaximo=danioMaximo;
    }
}
