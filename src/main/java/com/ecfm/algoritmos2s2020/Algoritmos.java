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
public class Algoritmos {
    public static void main(String[] args){
        int N = Integer.parseInt(args[0]);
        //QuickFind qf = new QuickFind(N);
        //qf.execute();
        
        QuickUnion qu = new QuickUnion(N);
        qu.execute();
        
        
    }


}
