/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.arreglobidimiensionales_clase3;

import java.util.Scanner;

/**
 *
 * @author misael.perilla
 */
public class ArregloBidimiensionales_Clase3 {

    public static void main(String[] args) {

        String nombres[] = new String[4];//crear arreglo en blanco de tamaño N
        nombres[0] = "Julian";
        nombres[1] = "Chris";
        nombres[2] = "Jhon";
        nombres[3] = "Daniel";
        String apellidos[] = {"Alvarez", "Benoit", "Cardenas", "Diaz"};
        //crear arreglo con datos y tamaño definidos

//        Scanner ingreso = new Scanner(System.in);
//        System.out.println("Digite el tamaño del arreglo: ");
//        int size = ingreso.nextInt();
//        double notas[] = new double[size];
//        for (int i = 0; i < notas.length; i++) {
//            System.out.println("digite un valor: ");
//            notas[i] = ingreso.nextDouble();
//        }
        Imprimir(nombres);
        Imprimir(apellidos);
        //Imprimir(notas);

        double notasAlumnos[][] = new double[4][4];

        notasAlumnos[0][0] = 3.2;
        notasAlumnos[0][1] = 4.2;
        notasAlumnos[0][2] = 4.6;
        notasAlumnos[0][3] = 3.1;

        notasAlumnos[1][0] = 4.5;
        notasAlumnos[1][1] = 4.8;
        notasAlumnos[1][2] = 4.9;
        notasAlumnos[1][3] = 4.3;

        notasAlumnos[2][0] = 3.2;
        notasAlumnos[2][1] = 2.8;
        notasAlumnos[2][2] = 1.9;
        notasAlumnos[2][3] = 4.5;

        notasAlumnos[3][0] = 4.2;
        notasAlumnos[3][1] = 3.6;
        notasAlumnos[3][2] = 2.2;
        notasAlumnos[3][3] = 3.5;

        //ImprimirNotas(notasAlumnos);
        Boletin(nombres, apellidos, notasAlumnos);

    }

    //------------------------------
    //------------------------------
    
    public static void Imprimir(Object[] items) {
        System.out.print("Los valores del arreglo son: [ ");
        for (int ind = 0; ind < items.length; ind++) {
            System.out.print(items[ind] + ",  ");
        }
        System.out.println("]");
    }

    public static void Imprimir(double[] items) {
        System.out.print("Los valores del arreglo son: [ ");
        for (int ind = 0; ind < items.length; ind++) {
            System.out.print(items[ind] + ",  ");
        }
        System.out.println("]");
    }

    public static void ImprimirNotas(double[][] items) {
        System.out.print("Los valores del arreglo son: \n[ ");
        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[0].length; j++) {
                System.out.print(items[i][j] + ",  ");
            }
            System.out.println("");
        }
        System.out.println("]");
    }

    public static void Boletin(String nombres[], String apellidos[], double[][] items) {
        System.out.print("Los valores del arreglo son: \n[ ");
        for (int i = 0; i < items.length; i++) {
            double prom = 0;
            System.out.print("Nombre: " + nombres[i] + " " + apellidos[i] + ":  ");
            for (int j = 0; j < items[0].length; j++) {
                System.out.print(items[i][j] + ",  ");
                prom = prom + items[i][j];//sumatoria
            }
            System.out.println("\tnota final=" + prom / items.length);
        }
        System.out.println("]");
    }
}
