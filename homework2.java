
import java.util.Scanner;

public class homework2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        asal();
    }

    public static void asal() {
        Scanner input = new Scanner(System.in);

        System.out.println("bir sayı girin:");
        int sayi = input.nextInt();
        boolean asal = true;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                asal = false;
            }
        }
        if(asal==true && sayi!=1 && sayi!=0){
        System.out.println("asal");
        }
        else{
        System.out.println("asal değil");
        }
    }

}
