import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values:");
        int n = sc.nextInt(); 
        int k = sc.nextInt(); 
        int j = sc.nextInt(); 
        int m = sc.nextInt();
        int p = sc.nextInt(); 
        if (n <= 0 || k <= 0 || j <= 0 || m < 0 || p < 0) {
            System.out.println("INVALID INPUT");
            return;
        }
        int monkeysBanana = (int)Math.ceil((double)m / k);
        int monkeysPeanut = (int)Math.ceil((double)p / j);
        int monkeysEating = monkeysBanana + monkeysPeanut;
        int monkeysLeft = n - monkeysEating;
        if (monkeysLeft < 0) {
            monkeysLeft = 0;
        }
        System.out.println("Number of Monkeys left on the Tree:" + monkeysLeft);
    }
}
