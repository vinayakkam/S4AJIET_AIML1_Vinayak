import java.util.LinkedHashSet;
class Main {
    public static void main(String[] args) {
        LinkedHashSet<String>list=new LinkedHashSet<>();
        list.add("India");
        list.add("NewZealand");
        list.add("SriLanka");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains("SriLanka"));
     }
}
