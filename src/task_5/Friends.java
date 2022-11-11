package task_5;

import java.util.ArrayList;
import java.util.Collections;

public class Friends {
    public static void main(String[] args) {
        ArrayList<String> friends = new ArrayList<>();
        friends.add( "Monica" );
        friends.add( "Rachel" );
        friends.add( "Ross" );
        friends.add( "Phoebe" );
        friends.add( "Joey" );
        friends.add( "Chandler" );
        System.out.println(friends); /*Unsorted List*/

        Collections.sort(friends);

        System.out.println(friends);  /* Sorted List*/
    }
}
