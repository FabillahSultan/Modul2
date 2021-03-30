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
public class Nomor3 {
  public static void main(String[] args) {
        int [][] A = {
            {5,9,11},
            {9,12,13}
        };
        int [][] B = {
            {8,6},
            {15,7},
            {11,9}
        };
        if(A[0].length == B.length) {
            int[][] C = new int [A.length][B[0].length];
            for(int i = 0; i<A.length; i++) {
             for(int j = 0; j<B[0].length; j++) {
                 for(int k = 0; k<A[0].length; k++){
                 C [i][j] += A[i][k] * B[k][j];
             }   
                
            }
        }
        for(int[]c : C ){
            for(int i : c) {
           System.out.print(i+" "); 
        }
            System.out.println();
        }
        System.out.println("MUHAMAD AZRIAL SULTAN FABILLAH");
        }
    }  
}
