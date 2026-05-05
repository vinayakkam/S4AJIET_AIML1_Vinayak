import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the value of target:");
        int t=s.nextInt();
        System.out.println("Enter the value of n:");
        int n=s.nextInt();
        int[] a=new int[10];
        String str="( ";
        int count=0;
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        for(int i =0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if((a[i]+a[j])==t){
                    count++;
                    str=str+"("+a[i]+","+a[j]+") ";
                }
            }
        }
        str=str+")";
        System.out.println("The number of pairs that add up to "+ t +" : "+ count);
        System.out.println("The pairs are:");
        System.out.println(""+str);
    }
}
