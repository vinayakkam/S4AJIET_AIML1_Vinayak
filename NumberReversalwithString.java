import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the Number:");
        String str=s.nextLine();
        String rev ="";
        int n=str.length();
        for(int i=n-1;i>-1;i--){
            rev = rev + str.charAt(i);
        }
        System.out.println("The Reverse of number is  "+ rev);
    }
}
