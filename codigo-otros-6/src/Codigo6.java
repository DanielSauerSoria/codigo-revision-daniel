import java.util.Scanner;//Se importó la clase Scanner

public class Codigo6 {
    public static void main(String[] args) {//Se agregó el metodo main

        int[] n = new int[20];//Se agregó el new

        for (int i = 0; i < 20; i++) { //Se reemplazó i+ por i++
            n[i] = (int) (Math.random() * 381) + 20;
            System.out.print(n[i] + " "); //Se agregó .out
        }

        Scanner scanner = new Scanner(System.in);//Se agregó el scanner

        System.out.print("\n¿Qué números quiere resaltar? ");
        System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
        int opcion = scanner.nextInt();//Lectura de entrada corregida

        int multiplo = (opcion == 1) ? 5 : 7;//Se cambiaron los lugares de : y de ?

        for (int e : n) {//Se cambió foreach por for y char por int
            if (e % multiplo == 0) {
                System.out.print("[" + e + "] ");
            } else {//Faltaba la llave de cerrar el if
                System.out.print(e + " ");//Se cambió .in por .out
            }
        }
        scanner.close(); //Faltaba cerrar el Scanner
    }
}