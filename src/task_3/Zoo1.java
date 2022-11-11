package task_3;

import java.util.ArrayList;

public class Zoo1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add( 0, "Crocodile" );
        arrayList.add( 1, "Donkey" );
        arrayList.add( 2, "Goat" );     // 3rd element
        arrayList.add( 3, "Iguana" );
        arrayList.add( 4, "Lizard" );     // 5th element
        arrayList.add( 5, "Snake" );
        arrayList.add( 6, "Squirrel" );     // 7th element
        arrayList.add( 7, "Wolf" );
        System.out.println(arrayList);

        // removal of the 3rd, 5th and 7th element
        arrayList.remove( 2 );
        arrayList.remove( "Lizard" );
        arrayList.remove( "Squirrel" );

        System.out.println(arrayList);
        System.out.println("Size of the resulting list: " + arrayList.size());
    }
}
