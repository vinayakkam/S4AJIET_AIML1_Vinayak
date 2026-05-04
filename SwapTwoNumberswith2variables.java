import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the value of a:");
        a=sc.nextInt();
        System.out.println("Enter the value of b:");
        b=sc.nextInt();
        System.out.println("Before Swapping:");
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping:");
        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }
}
