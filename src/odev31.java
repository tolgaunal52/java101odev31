import java.util.Scanner;

public class odev31 {
    public static void main(String[] args) {
        int a = 0, b = 1, c = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci serisinin eleman sayisini giriniz: ");
        int elamanSayisi = input.nextInt();

        for (int i = 0; i <= elamanSayisi; i++) {
            System.out.print(a + " ");

            c = a + b;
            a = b;
            b = c;

        }
    }
}



