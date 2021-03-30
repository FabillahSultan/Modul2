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
public class Nomor2 {
    public static void main(String[]args){
        int [][] A = {
            {9,6},
            {10,7},
            {9,6},
        };
        int [][] B = {
            {9,5},
            {12,11},
            {7,9},
        };
        
        if ((A.length == B.length) && (A[0].length == B[0].length)){
            int [][] C = new int[A.length][A[0].length];
            for(int i = 0; i<A.length; i++) {
                for(int j = 0; j<A[0].length; j++){
                    C[i][j] = A[i][j] - B[i][j];
                    System.out.print(C [i] [j] + "  ");   
                }   
                 System.out.println();
                    }
            System.out.println("MUHAMAD AZRIAL SULTAN FABILLAH");
        }
    }
}
