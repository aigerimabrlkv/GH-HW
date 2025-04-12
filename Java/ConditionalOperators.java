import java.util.Scanner;
    public class ConditionalOperators {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();

            if (a == 0) {
                if (b != 0) {
                    System.out.println("NO");
                } else {
                    // 0 / (cx + d) == 0
                    //  x ≠ -d / c
                    if (d % c == 0) {
                        System.out.println("INF");
                    } else {
                        System.out.println("INF");
                    }
                }
            } else {
                if (-b % a != 0) {
                    System.out.println("NO");
                } else {
                    int x = -b / a;
                    if (c * x + d == 0) {
                        System.out.println("NO");
                    } else {
                        System.out.println(x);
                    }
                }
            }
        }
    }






