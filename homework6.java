/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Excalibur
 */
import java.util.Scanner;

public class homework6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    star();
    }

    public static void star() {
        Scanner input = new Scanner(System.in);
        System.out.println("satır sayısını girin:");
        int n=input.nextInt();
        for(int i=0;i<n;i++){
         for(int j=i;j>=0;j--){
           System.out.print("*");
         }
         System.out.println();
        }

    }

}
