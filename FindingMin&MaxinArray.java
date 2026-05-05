import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n=sc.nextInt();
        int[] num = new int[20];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (num[j] > num[j + 1]) {
                    temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
        System.out.println("The Minimum number is " + num[0]);
        System.out.println("The Maximum number is " + num[n - 1]);
    }
}
