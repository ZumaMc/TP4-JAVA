import javax.swing.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int ejercicios = Integer.parseInt(JOptionPane.showInputDialog("Introduce el ejercicio a realizar (1-20)"));
        Scanner sc = new Scanner(System.in);
        if (ejercicios == 1) {
            String[][] paises = new String[4][4];
            for (int filas = 0; filas < paises.length; filas++) {
                System.out.println("Ingrese Su pais");
                paises[filas][0] = sc.nextLine();
                for (int col = 1; col < paises.length; col++) {
                    System.out.println("Ingrese su ciudad");
                    paises[filas][col] = sc.nextLine();
                }
            }
            System.out.println("Países y ciudades ingresados:");
            for (int filas = 0; filas < paises.length; filas++) {
                for (int col = 0; col < paises[filas].length; col++) {
                    System.out.print(paises[filas][col] + " ");
                }
                System.out.println();
            }
        }
        if (ejercicios == 2) {
            System.out.println("Ingrese 2 numeros enteros");
            int x = sc.nextInt();
            int y = sc.nextInt();
            int[][] matriz1 = new int[x][y];
            int[][] matriz2 = new int[y][x];
            int[][] matriz3 = new int[x][y];
            System.out.println("Complete la primer matriz");

            for (int filas = 0; filas < x; filas++) {
                System.out.println("Ingrese la fila n°" + filas + " de numeros enteros");
                matriz1[filas][0] = sc.nextInt();
                for (int col = 1; col < y; col++) {
                    matriz1[filas][col] = sc.nextInt();
                }
            }
            System.out.println("Complete la segunda matriz");
            for (int filas = 0; filas < y; filas++) {
                System.out.println("Ingrese la fila n°" + filas + " de numeros enteros");
                matriz2[filas][0] = sc.nextInt();
                for (int col = 1; col < x; col++) {
                    matriz2[filas][col] = sc.nextInt();
                }
            }
            for (int filas = 0; filas < x; filas++) {
                for (int col = 0; col < y; col++) {
                    matriz3[filas][col] = matriz1[filas][col] * matriz2[col][filas];
                }
            }
            System.out.println("La primera matriz es:");
            for (int[] fila : matriz1) {
                for (int col : fila) {
                    System.out.print(col + " ");
                }
                System.out.println();
            }
            System.out.println("La segunda matriz es:");
            for (int[] fila : matriz2) {
                for (int col : fila) {
                    System.out.print(col + " ");
                }
                System.out.println();

            }
            System.out.println("La tercera matriz es:");
            for (int[] fila : matriz3) {
                for (int col : fila) {
                    System.out.print(col + " ");
                }
                System.out.println();

            }
        }
        if (ejercicios == 3) {
            int x = 0;
            while (x < 3 || x > 10) {
                System.out.println("Ingrese un numero mayor o igual a 3, y menor o igual que 10");
                x = sc.nextInt();
            }
            int[][] matriz1 = new int[x][x];
            for (int filas = 0; filas < x; filas++) {
                System.out.println("Ingrese la fila n°" + filas + " de numeros enteros");
                matriz1[filas][0] = sc.nextInt();
                for (int col = 1; col < x; col++) {
                    matriz1[filas][col] = sc.nextInt();
                }
            }
            int[] columnasum = new int[x];
            int sum1 = 0;
            for (int col = 0; col < x; col++) {
                for (int fila = 0; fila < x; fila++) {
                    sum1 += matriz1[fila][col];
                }
                columnasum[col] = sum1;
                sum1 = 0;


            }
            for (int i = 0; i < x; i++) {
                System.out.println("La suma de la columna " + (i + 1) + " es=" + columnasum[i]);
            }
        }
        if (ejercicios == 4) {
            int x = 0;
            while (x < 4 || x > 10) {
                System.out.println("Ingrese un numero entero");
                x = sc.nextInt();
            }
            int[][] matriz = new int[x][x];
            int arealizar = 0;
            int ej = 0;
            while (ej != 8) {
                System.out.println("Ingrese la opcion que desee, recuerde que si no ha completado la matriz no podra acceder a las otras opciones");
                System.out.println("1) Rellenar matriz");
                System.out.println("2) sumar toda una fila");
                System.out.println("3) sumar toda una columna");
                System.out.println("4) Sumar la diagonal principal");
                System.out.println("5) Sumar la diagonal inversa");
                System.out.println("6) La media de todos los valores de la matriz");
                System.out.println("8) salir ");
                ej = sc.nextInt();
                if (ej == 1) {
                    for (int filas = 0; filas < x; filas++) {
                        System.out.println("Ingrese la fila n°" + (filas + 1) + " de numeros enteros");
                        matriz[filas][0] = sc.nextInt();
                        for (int col = 1; col < x; col++) {
                            matriz[filas][col] = sc.nextInt();
                        }
                    }
                    System.out.println("La matriz es:");
                    for (int[] fila : matriz) {
                        for (int col : fila) {
                            System.out.print(col + " ");
                        }
                        System.out.println();
                    }
                }
                if (ej == 2) {
                    int sum1 = 0;
                    int[] filasum = new int[x];
                    System.out.println("¿que fila desea sumar?:");
                    int fila = sc.nextInt();
                    fila += 1;
                    for (int col = 0; col < 2; col++) {
                        sum1 += matriz[fila][col];
                        filasum[fila] = sum1;
                    }
                    System.out.println("La suma de la fila n° " + (fila) + " es=" + filasum[fila]);

                }
                if (ej == 3) {
                    int[] columnasum = new int[x];
                    int sum1 = 0;
                    System.out.println("¿que columna desea sumar?:");
                    int col = sc.nextInt();
                    for (int fila = 0; fila < 2; fila++) {
                        sum1 += matriz[fila][col];
                        columnasum[col] = sum1;
                    }
                    System.out.println("La suma de la columna n° " + (col) + " es=" + columnasum[col]);
                }
                if (ej == 4) {
                    int sumadiag = 0;
                    for (int i = 0; i < x; i++) {
                        sumadiag += matriz[i][i];
                    }
                    System.out.println("la suma de la diagonal principal es " + sumadiag);
                }
                if (ej==5) {
                int sumainv=0;
                for (int i=0;i<x;i++){
                    sumainv += matriz[i][x-i-1];
                }
                    System.out.println("la suma de la diagonal inversa es " + sumainv);
                }
                if (ej==6) {
                  float sumprin=0;
                    for (int col=0;col<x;col++){
                        for (int fil=0; fil<x;fil++){
                        sumprin+=matriz[fil][col];
                    }
                    }
                    int cantelementos= x*x;
                    float media= sumprin/cantelementos;
                    System.out.println("la media de todos los numeros de la matriz es " + media);

                }
            }
        }
    if (ejercicios==5){
        String[][] golosinas = {
                {"KitKat", "32", "10"},
                {"Chicles", "2", "50"},
                {"Caramelos de Menta", "2", "50"},
                {"Huevo Kinder", "25", "10"},
                {"Chetoos", "30", "10"},
                {"Twix", "26", "10"},
                {"M&M'S", "35", "10"},
                {"Papas Lays", "40", "20"},
                {"Milkybar", "30", "10"},
                {"Alfajor Tofi", "20", "15"},
                {"Lata Coca", "50", "20"},
                {"Chitos", "45", "10"}
        };
    }
        int prender=0;
        while (prender!=4) {
            System.out.println("Menú de la maquina expendedora:");
            System.out.println("1. Pedir golosina");
            System.out.println("2. Mostrar golosinas");
            System.out.println("3. Rellenar golosinas (requiere contraseña)");
            System.out.println("4. Apagar maquina");
            System.out.print("Selecciona una opcion: ");
            int opcion= sc.nextInt();
            if (opcion==1) {
                
            }
    }
    }
}
