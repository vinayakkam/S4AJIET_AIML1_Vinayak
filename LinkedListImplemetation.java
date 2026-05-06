import java.util.LinkedList;
import java.util.Collections;
class Main {
    public static void main(String[] args) {
        LinkedList<Integer>list=new LinkedList<>();
        list.add(95);
        list.add(12);
        list.add(45);
        list.add(70);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("The List : "+list);
    }
}
