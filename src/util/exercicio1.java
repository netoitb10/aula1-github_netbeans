/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.Scanner;

/**
 *
 * @author manoel
 */
public class exercicio1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int mat [][] = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                
                mat[i][j] = sc.nextInt();
                
            }
        }
        
        int negativos = 0;
        
        System.out.println("Main diagonal:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                
                if (i == j) {
                    System.out.print(mat[i][j] + " ");
                    
                }
                
                if(mat[i][j] < 0){
                    negativos++; 
                    
                }                               
            }
        }
        System.out.println("");
        System.out.printf("Negative numbers = %d %n",negativos);
        
        sc.close();
    }
    
}
