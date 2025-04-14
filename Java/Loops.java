import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        boolean found = false;
        int start= (int) Math.ceil(Math.sqrt(a));
        int end= (int) Math.floor(Math.sqrt(b));


        for (int i = start; i <= end; i++) {
            int square = i*i;
            System.out.println(square+" ");
            found = true;
        }

        if (found) {
            System.out.println(); // Print a newline if any numbers were found
        }

    }
}
