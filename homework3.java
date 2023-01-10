
import java.util.Scanner;

public class homework3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         array();
       

    }

    public static int[]array() {
        Scanner input = new Scanner(System.in);
        System.out.println("dizi boyutunu girin:");
        int n = input.nextInt();
        int[] dizi = new int[n];
        for(int i=0;i<n;i++){
        System.out.println("dizinin"+(i+1)+"nci elemanını girin:");
        dizi[i]=input.nextInt();
        }
        for (int i = 0; i < dizi.length; i++) {
            int gec=0;
            for (int j =0; j < dizi.length; j++) {
                if (dizi[i]<dizi[j]) {
                    gec = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = gec;
                }
            }
        }
        for (int i = 0; i < dizi.length; i++) {

            System.out.println("\nsıralanmış hali:" + dizi[i]);
        }
       return dizi;

    }

}
