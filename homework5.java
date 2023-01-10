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

public class homework5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        sumarray();

    }

    public static int[] sumarray() {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.println("satır sayısı girin:");
        int n = input.nextInt();
        System.out.println("col sayısı giriniz:");
        int m = input.nextInt();
        int[] array = new int[m*n];
        int[][] array1 = new int[n][m];
        int[][] array2 = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("1.matrisin elemanlarını giriniz:");
                array1[i][j] = input.nextInt();
                System.out.println("2.matrisin elemanlarını giriniz:");
                array1[i][j] = input.nextInt();
                array[i] += array1[i][j] + array2[i][j];

            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        return array;

    }

}
