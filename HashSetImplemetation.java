import java.util.HashSet;
class Main {
    public static void main(String[] args) {
        HashSet<String>list=new HashSet<>();
        list.add("India");
        list.add("NewZealand");
        list.add("SriLanka");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains("SriLanka"));
     }
}
