package day27exceptionscollections;
//        Collections are for storing multiple data in the same data type.
//        Collections are flexible in length.
//        Collections have many useful methods.
//
//        There are 3 main Collections: i)List ==> a)ArrayList  b)LinkedList
//        ii)Queue ==> a)PriorityQueue  b)Deque
//        iii)Set ==> a)HashSet  b)LinkedHashSet  c)TreeSet

import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String[] args) {

        LinkedList<String> visitors = new LinkedList<>();
        visitors.add("Tom");
        visitors.add("Jane");
        visitors.add("Mary");
        visitors.add("Carl");
        visitors.add("Adam");

        System.out.println(visitors); //[Tom, Jane, Mary, Carl, Adam]

        visitors.addLast("Mahmut");
        System.out.println(visitors); //[Tom, Jane, Mary, Carl, Adam, Mahmut]

        visitors.addFirst("Christ");
        System.out.println(visitors); //[Christ, Tom, Jane, Mary, Carl, Adam, Mahmut]

        LinkedList<String> kids = new LinkedList<>();
        kids.add("Bobby");
        kids.add("Nick");
        kids.add("Harry");
        visitors.addAll(kids);
        System.out.println(visitors);//[Christ, Tom, Jane, Mary, Carl, Adam, Mahmut, Bobby, Nick, Harry]

        visitors.add(2,"Miami");
        System.out.println(visitors); //[Christ, Tom, Miami, Jane, Mary, Carl, Adam, Mahmut, Bobby, Nick, Harry]

        visitors.addAll(6,kids);
        System.out.println(visitors);

        visitors.remove(2);
        System.out.println(visitors); //[Christ, Tom, Jane, Mary, Carl, Bobby, Nick, Harry, Adam, Mahmut, Bobby, Nick, Harry]

        visitors.remove("Mahmut"); //remove() method removes first occureance of the object
        System.out.println(visitors); //[Christ, Tom, Jane, Mary, Carl, Bobby, Nick, Harry, Adam, Bobby, Nick, Harry]

        visitors.remove();  //[Tom, Jane, Mary, Carl, Bobby, Nick, Harry, Adam, Bobby, Nick, Harry]
        visitors.removeFirst(); //[Jane, Mary, Carl, Bobby, Nick, Harry, Adam, Bobby, Nick, Harry]
        System.out.println(visitors);

        visitors.removeFirstOccurrence("Carl");
        System.out.println(visitors); // [Jane, Mary, Bobby, Nick, Harry, Adam, Bobby, Nick, Harry]

        visitors.removeLastOccurrence("Harry");
        System.out.println(visitors); //[Jane, Mary, Bobby, Nick, Harry, Adam, Bobby, Nick]

        visitors.removeAll(kids);
        System.out.println(visitors);  // [Jane, Mary, Adam]


        //Example 1 Change all names stars with "A" to "****"
        for (String w:visitors){
            if(w.startsWith("A")){
                visitors.set(visitors.indexOf(w),"*****" );
            }
        }
        System.out.println(visitors); //[Jane, Mary, *****]

        //Example 2 if the number of the characters is more than 4, remove from the link list

        LinkedList<String> names = new LinkedList<>();
        names.add("Tom");
        names.add("Jane");
        names.add("Mary");
        names.add("Mahmut");
        names.add("Ali");
        names.add("Emily");

        for(int i =0; i<names.size(); i++){     //we use for loop becouse of we worked on indexes.

            if(names.get(i).length()>4){
                names.remove(names.get(i));
                i--;                    // since removing one element we should decrease the index
                                        // while the indexes will change after every iteration
            }
        }
        System.out.println(names); //[Tom, Jane, Mary, Ali]





    }
}
