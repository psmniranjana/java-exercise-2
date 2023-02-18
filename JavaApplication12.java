/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;
 import  java.util.Scanner;

/**
 *
 * @author Admin
 */
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      


        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int x=1;
        int sum=0;
        while(x>=1 && x<=N){
            sum += x;
            x++;
            
        }
        System.out.println(sum);
    }

}
    

