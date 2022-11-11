package task_4;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // adding 10 elements assigning each of them a value equal to its index
        for (int i = 0; i < 10; i++) {
            list.add(i, i);
        }
        System.out.println(list);

        // creating an iterator
        ListIterator<Integer> listItr = list.listIterator();

        // incrementing the value of each element by 1
        while(listItr.hasNext()) {
            list.set(listItr.nextIndex(), listItr.nextIndex() + 1);
            System.out.print(listItr.next() + " ");
        }

        // Output of the resulting list
        System.out.println("\n" + list);
    }
}
