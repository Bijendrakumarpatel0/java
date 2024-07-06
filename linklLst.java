import java.util.*;

class linkList {
    public static void main(String[] args) {
        LinkedList<Integer> li = new LinkedList<>();
        LinkedList<Integer> l2 =  new LinkedList<>();

        l2.add(33);
        l2.add(77);
        //l2.add(88);

        li.add(7);
        li.add(6);
        li.add(9);
        li.add(3);
        li.add(0, 5);
        li.add(0, 1);
        li.addAll(l2);
        System.out.println(li.contains(7));
        System.out.println(li.indexOf(33));
        for (int i = 0; i < li.size(); i++) {
            System.out.print(li.get(i));
            System.out.print(" ");
        }
    }
}
