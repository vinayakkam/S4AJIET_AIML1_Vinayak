import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.print("Enter value of K: ");
        int k = sc.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int x : arr) {
            pq.add(x);
            if (pq.size() > k)
                pq.poll();
        }
        String suffix;
        if (k % 10 == 1 && k % 100 != 11)
            suffix = "st";
        else if (k % 10 == 2 && k % 100 != 12)
            suffix = "nd";
        else if (k % 10 == 3 && k % 100 != 13)
            suffix = "rd";
        else
            suffix = "th";
        System.out.println("The " + k + suffix + " largest element is: " + pq.peek());
    }
}
