/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.minicombatepoo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author damt110
 */
public class MiniCombatePOO {

    public static void main(String[] args) {
        Random r = new Random();
        Scanner teclado = new Scanner(System.in);

//Creación de un arma y armadura
        Arma arma1 = new Arma("Cuchillo", 5);
        Arma arma2 = new Arma("Espada", 4);
        Arma[] armas = {arma1, arma2};
        Armadura armadura = new Armadura("Armadura", 2);
//Creación primer jugador
        Jugador jugadorConArmasYarmadura = new Jugador("JugadorConArmasYArmaduras", 6, armas, armadura);
        System.out.println("Primer jugador");
        System.out.println("Arma: " + jugadorConArmasYarmadura.getArma()[0].getTipoArma()
                + " Con danio maximo: " + jugadorConArmasYarmadura.getArma()[1].danioMaximo());

//Creación otro jugador con valores desde teclado        
        System.out.println("Escribe nombre del jugador");
        String nombre = teclado.nextLine();
        Jugador jugador = new Jugador(nombre, 12, armas, armadura);
        Monstruo monstruo = new Monstruo("Goblin", 15, 4);
        System.out.println("Inicio del combate: " + jugador.getNombre() + " y " + monstruo.getTipo());
        int menu = 0;
        
//Menu para eligír un opción de los tres posibles(numero introduce por pantalla)
        while (jugador.getHp() > 0 && monstruo.getHp() > 0 && menu != 3) {
            System.out.println("¿Que queres haser? 1.Atacar 2.Curarte(+2HP) 3.Huir");
            menu = teclado.nextInt();
            int danioMonstruo;
            switch (menu) {
//Opcion para atacar
                case 1:
                    int probabilidad = r.nextInt(0, 100);
                    System.out.println("Nombre:" + jugador.getNombre() + ", HP: " + jugador.getHp() + ", Tipo de arma: "
                            + jugador.getArma()[0].getTipoArma() + ", Danio maximo " + jugador.getArma()[0].danioMaximo());
//Danio que el jugador hace de monstruo (numero aleatorio)
                    int danioJugador = r.nextInt(0, jugador.getArma()[0].danioMaximo());
//Probabilidad 20% y daño*2 
                    if (probabilidad < 20) {
                        danioJugador = jugador.golpeCritico(danioJugador);
                    }
                    monstruo.setHp(monstruo.getHp() - danioJugador);
                    System.out.println("Atacas con " + monstruo.getTipo() + " y haces " + danioJugador + " de daño");
//Si monstruo tiene vidas, el atace                    
                    if (monstruo.getHp() >= 1) {
                        danioMonstruo = r.nextInt(0, monstruo.getDanioMaximo());
                        jugador.restarHP(danioMonstruo);
                        System.out.println("El goblin te ataca y te hace " + danioMonstruo + " de daño");
                    }
                    break;
//Opcion para curar hp
                case 2:
                    System.out.println("Nombre:" + jugador.getNombre() + " ,HP: " + jugador.getHp() + " ,Tipo de arma: "
                            + jugador.getArma()[0].getTipoArma() + " ,Danio maximo " + jugador.getArma()[0].danioMaximo());
                    jugador.sumarHP(2);
                    System.out.println("Te curas 2 puntos");
                    danioMonstruo = r.nextInt(0, monstruo.getDanioMaximo());
                    jugador.restarHP(danioMonstruo);
                    System.out.println("El goblin te ataca y te hace " + danioMonstruo + " de daño");
                    break;
                case 3:
                    System.out.println("Has huido. FIN DEL JUEGO");
                    break;
            }

            if (jugador.getHp() == 0) {
                System.out.println("GAME OVER");
            } else if (monstruo.getHp() <= 0) {
                System.out.println("¡Has ganado el combate!");
                jugador.getArma()[0].setTipoArma("Espada larga");
                jugador.getArma()[0].setDanioMaximo(8);
                System.out.println("Por gana jugador tiene otra arma: " + jugador.getArma()[0].getTipoArma()
                        + " con danio maximo: " + jugador.getArma()[0].danioMaximo());
            }
        }
    }
}
