/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecfm.algoritmos2s2020;

import java.util.Scanner;

/**
 *
 * @author hugo
 */
public class QuickFind {
    int N;
    
    public QuickFind(int N){
        this.N = N;
    }
        
    public void execute(){
        int id[]= new int[N];
        Scanner scanner = new Scanner(System.in);
	String tokens[] = scanner.nextLine().split(" ");
        for(int i=0; i < N; i++) id[i] = i;
        for(int j=0; j < tokens.length; j=j+2){
            int p= Integer.parseInt(tokens[j]) , q = Integer.parseInt(tokens[j+1]);
            int t = id[p];
            if ( t == id[q]) continue;
            for( int k = 0; k < N;k++){
                if( id[k] == t) id[k] = id[q];
                System.out.println(" " + String.valueOf(p) + " " + String.valueOf(q));
            }
            imprimirArray(id);
        }
    }
    
    public static void imprimirArray(int [] array) {
        for(int i = 0; i < array.length; i++)
        System.out.print( array[i] + " ");
        }
       
}
