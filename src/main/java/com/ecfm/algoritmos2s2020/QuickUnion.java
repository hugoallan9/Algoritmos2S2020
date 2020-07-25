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
public class QuickUnion extends QuickFind {
    
    public QuickUnion(int N) {
        super(N);
    }
    
    @Override
    public void execute(){
        int id[]= new int[N];
        for(int i=0; i < N; i++) id[i] = i;
        Scanner scanner = new Scanner(System.in);
	String tokens[] = scanner.nextLine().split(" ");
        for(int l=0; l < tokens.length; l=l+2){
        int i, j, p = Integer.parseInt(tokens[l]), q = Integer.parseInt(tokens[l+1]);
        for (i = p; i != id[i]; i = id[i]);
        for (j = q; j != id[j]; j = id[j]);
        if (i == j) continue;
        id[i] = j;
        System.out.println(" " + p + " " + q);
        imprimirArray(id);
        }
        

    }
    
}
