import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String space =str.replace(" ","");
        System.out.println("The String after removing spaces : ("+space+")");
    }
}
