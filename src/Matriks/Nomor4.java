/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matriks;

/**
 *
 * @author Lenovo ID
 */
public class Nomor4 {
     public static void main(String[] args) {
        int[][] M = {
            {21,22,23},
            {24,25,26}          
        };
        int[][] transpose = new int [5][5];
        for (int i=0; i<M.length; i++){
            for (int j=0; j<M[0].length; j++){
                transpose[j][i] = M[i][j];               
            }
            System.out.println();           
        }
        for (int i=0; i<M[0].length; i++){
            for (int j=0; j<M.length; j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("MUHAMAD AZRIAL SULTAN FABILLAH");
        }
    
}
