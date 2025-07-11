//package com.generation;

import java.util.Scanner;//faltaba importar libreria

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);//faltaba el System.in

        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = s.nextLine();

        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        //Scanner s2 = new Scanner(); borre esta linea porque no se utiliza
        String j2 = s.nextLine();

        if (j1 == j2) { //sobraba un parentesis
            System.out.println("Empate");
        } else {
            int g = 2;
            switch (j1) {
                case "piedra":
                    if (j2 == "tijeras") {
                        g = 1;
                    }
                    break; //faltaba breack
                case "papel":
                    if (j2 == "piedra") {
                        g = 1;
                    }//altaba cerrar llaves
                    break; //faltaba breack
                case "tijeras": //cambie "tijera" por "tijeras" para que coincida con las insttrucciones
                    if (j2.equals("papel")) {
                        g = 1;
                    }
                    break;
            }
            System.out.println("Gana el jugador " + g);
        }
    }
}