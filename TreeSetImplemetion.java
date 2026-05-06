import java.util.TreeSet;
class Main {
    public static void main(String[] args) {
        TreeSet<String>list=new TreeSet<>();
        list.add("India");
        list.add("NewZealand");
        list.add("SriLanka");
        System.out.println(list);
        System.out.println(list.contains("SriLanka"));
     }
}
