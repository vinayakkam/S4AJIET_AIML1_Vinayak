import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N = 10;
        int K = 5;
        int candies = N;
        Scanner sc = new Scanner(System.in);
        int t = 5;
        for (int i = 0; i < t; i++) {
            System.out.print("Enter number of candies to order: ");
            if (!sc.hasNextInt()) {
                System.out.println("INVALID INPUT");
                sc.next();
                i--;
                continue;
            }
            int order = sc.nextInt();
            if (order > candies) {
                System.out.println("INVALID INPUT");
                i--;
                continue;
            }
            candies -= order;
            System.out.println("Number of Candies Sold: " + order);
            if (candies <= K) {
                candies = N;
                System.out.println("Jar refilled!");
            }
            System.out.println("Number of Candies available: " + candies);
        }
        sc.close();
    }
}
