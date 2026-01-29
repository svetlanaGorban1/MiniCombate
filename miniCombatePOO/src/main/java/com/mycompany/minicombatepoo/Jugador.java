/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.minicombatepoo;

/**
 *
 * @author damt110
 */
public class Jugador {
    private String nombre;
    private int hp;
    private Arma[] arma;
    private Armadura armadura;

    public Jugador() {
    }

    public void setArmadura(Armadura armadura) {
        this.armadura = armadura;
    }

    public Armadura getArmadura() {
        return armadura;
    }

    public Jugador(String nombre, int hp, Arma[] arma, Armadura armadura) {
        this.nombre = nombre;
        this.hp = hp;
        this.arma = arma;
        this.armadura = armadura;
    }

    public Jugador(String nombre, int hp, Arma[] arma) {
        this.nombre = nombre;
        this.hp = hp;
        this.arma = arma;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHp() {
        return hp;
    }

    public Arma[] getArma() {
        return arma;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setArma(Arma[] arma) {
        this.arma = arma;
    }

    public void restarHP(int cantidad) {
        cantidad -= armadura.getDefensa();
        hp -= cantidad;
    }

    public void sumarHP(int cantidad) {
        hp += cantidad;
    }
    
    public int golpeCritico(int danio){
        int danioDeGolpeCritico=danio*2;
       return danioDeGolpeCritico;
    }
}
