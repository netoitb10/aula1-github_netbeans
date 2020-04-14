/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author manoel
 */
public class exercicio2 {
    
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Programa para matriz.");
        System.out.println("Insira o valor para o nº de linhas:");
        int linha = sc.nextInt();
        
        System.out.println("Insira o valor para o nº de colunas:");
        int coluna =sc.nextInt();
        
        int matriz[][] = new int[linha][coluna];
        
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                
                System.out.printf("Insira o valor para a posição %d %d:%n",i,j);
                matriz[i][j] = sc.nextInt();
            }
            
        }
        
        System.out.println("Insira o valor para a ocorrência:");
        int ocorrencia = sc.nextInt();
        
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                
                if(ocorrencia == matriz[i][j] ){
                    System.out.printf("Position %d,%d: %n",i,j);
                    if(i > 0){
                        System.out.printf("Up:%d %n",matriz[i-1][j]);
                    }
                    if(j > 0){
                        System.out.printf("Left:%d %n",matriz[i][j-1]);
                    }
                    if(j < matriz[i].length-1) {
                        System.out.printf("Right:%d %n",matriz[i][j+1]);
                    }
                    
                    if(i < matriz.length-1){
                        System.out.printf("Down:%d %n",matriz[i+1][j]);
                    }
                                        
                }
                
            }
            
        }      
        
        sc.close();
    }
    
}
