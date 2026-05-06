import java.util.HashMap;
class Main {
    public static void main(String[] args) {
        HashMap<Integer,String>list=new HashMap<>();
        list.put(101,"Alice");
        list.put(102,"Bob");
        list.put(103,"Abhijith");
        list.put(104,"Madhav");
        System.out.println(list);
        System.out.println(list.get(102));
        list.remove(103);
        System.out.println(list);
     }
}
