import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String s =sc.nextLine();
        char[] c= new char[100000];
        int[] a= new int[100000];
        String t= "";
        int j=0;
        int k=0;
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                a[j] = s.charAt(i) - '0';
                j++;
            }
            else{
                c[k]=s.charAt(i);
                k++;
            }
        }
        int n=j;
        for(j=0;j<=n;j++){
            t += String.valueOf(c[j]).repeat(a[j]); 
        }
        System.out.println(""+t);
    }
}
