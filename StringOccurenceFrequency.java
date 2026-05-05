import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=s.nextLine();
        int n=str.length();
        int[] freq = new int[n*100];
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            freq[ch]++;
        }
        for (int i=0;i<n*100;i++) {
            if (freq[i]>0) {
                System.out.println("'" + (char)i + "' : " + freq[i]);
            }
        }    
    }
}
