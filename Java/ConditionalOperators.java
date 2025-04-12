import java.util.Scanner;
    public class ConditionalOperators {

        // Define the sign(x) function
        public static int sign(int x) {
            if (x > 0) return 1;
            if (x < 0) return -1;
            return 0;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();

            System.out.println(sign(x));
        }
    }





