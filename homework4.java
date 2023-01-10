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
import java.util.Random;

public class homework4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] dizi = new int[5][5];

        randomarray(dizi);

    }

    public static int[][] randomarray(int[][] array) {

        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = r.nextInt(200);

                System.out.println("\noluşan dizi:" + array[i][j]);
            }
        }
        return array;

    }

}
