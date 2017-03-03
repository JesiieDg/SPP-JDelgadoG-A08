/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.jdelgadog.a08;

/**
 *
 * @author GILDARDO
 */
public class SPPJDelgadoGA08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Este programa promedia las posiciones pares y
        suma las posiciones nones de un arreglo
         */
        int promedio, sumaPar = 0, sumaNon = 0, cont = 0;
        int[][] matrix = {{10, 30, 89, 48, 56},
        {32, 23, 84, 20, 10},
        {72, 108, 71, 402, 8}};
        //i iniciaen 0, elciclo se ejecuta mientras i<tamaño del arreglo
        //i se incrementa de dos en dos
        for (int[] matrix1 : matrix) {
            for (int j = 0; j < matrix1.length; j = j + 2) {
                sumaPar = sumaPar + matrix1[j];
                cont++;
            }
        }
        promedio = sumaPar / cont;
        System.out.println(promedio);

        for (int[] matrix1 : matrix) {
            for (int j = 1; j < matrix1.length; j = j + 2) {
                sumaNon = sumaNon + matrix1[j];
            }
        }
        System.out.println(sumaNon);
    }
}
