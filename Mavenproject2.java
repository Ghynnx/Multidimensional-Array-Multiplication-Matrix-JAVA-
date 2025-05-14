/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

/**
 *
 * @author Student's Account
 */
public class Mavenproject2 {

    public static void main(String[] args) {
       
        int [][]  matrix = new int [10][10];

        for (int i = 0; i < 10; i++){
            for (int j= 0; j<10; j++){
                matrix [i][j]= (i+1)*(j+1);
               
            }
        }
            for (int i = 0; i < 10; i++){
            for (int j= 0; j<10; j++){
                System.out.print(matrix[i][j]+"\t");
            }
                System.out.println();
        }
            
        }
        
}
