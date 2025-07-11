import java.util.Scanner;//Se agregó la importación de Scanner

public class Codigo5 {
    public static void main(String[] args) { //Se agregó el metodo main para poder ejecutar el programa

        Scanner s = new Scanner(System.in);//e agregó el metodo main para poder ejecutar el programa}

        System.out.print("Introduzca un número: ");//Se arreglaron las comillas mal cerradas
        int ni = s.nextInt();//Se cambió la entrada de String a int
        int c = ni;

        int afo = 0;
        int noAfo = 0;

        while (ni > 0) {
            int digito = ni % 10;//Se usó int en lugar de double
            if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
                afo++;
            } else {
                noAfo++;
            }
            ni /= 10;//Se puso dentro del ciclo pero fuera del else
            if (afo > noAfo) {
                System.out.println("El " + c + " es un número afortunado.");//Se arregló typo en "println"
            } else {
                System.out.println("El " + c + " no es un número afortunado.");
            }

        }
    }
}