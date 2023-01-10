
import java.util.Scanner;

public class homework1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        karetoplam();

    }

    public static void karetoplam() {
        Scanner input = new Scanner(System.in);

        System.out.println("üst sınırı girin:");
        int n = input.nextInt();
        int t = 0;
        for (int i = 1; i <= n; i++) {
            t += i * i;

        }
        System.out.println(t);
    }

}
