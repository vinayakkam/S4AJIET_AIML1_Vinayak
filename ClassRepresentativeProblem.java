import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int[] ranks= new int[50];
        int count=0;
        System.out.println("Enter the number of Students:");
        int n=s.nextInt();
        System.out.println("Enter the Ranks:");
        for(int i=0;i<n;i++){
            ranks[i]=s.nextInt();
        }
        int current=ranks[0];
        for(int i=1;i<n;i++){
            if(ranks[i]<current){
                current=ranks[i];
                count++;
            }
        }
        System.out.println("Count = "+ count);
    }
}
