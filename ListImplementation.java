import java.util.ArrayList;
class Main {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.size();
        System.out.println("The List : "+list);
        list.remove(2);
        System.out.println("The List after remove(2) : "+list);
        list.clear();
        System.out.println("The List after clear() : "+list);
    }
}
