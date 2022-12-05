package day28collections;

//        HashSet
//        1) It consists of unique elements,
//        an element can be used only once in Sets. no duplicate elements
//        2) If you want to add an element back to the HashSet,
//        the old one is deleted and the new one is overwritten.
//        3)HashSets are the fastest among Sets.
//        The order in which the values are entered is not taken into account.
//        4) HashSet can use "null" object as element.
//        However, if you want to add multiple null values to a HashSet,
//        there will be only one null value.
//        LinkedHashset :
//        1) They do not accept repeated elements. They arrange the elements according to the insertion order.
//        2) LinkedHashSet runs slower than HashSet.
//        3) LinkedHashSet can use "null" object as element.
//        4) They are fast in adding and removing operations.
//        TreeSet :
//        1) TreeSet does not accept repeated elements, because it is Set.
//        2) Arranges the elements according to natural Order (alphabetical if String, smallest to largest).
//        3) TreeSet is the slowest of the sets. That's why you should be careful when using TreeSet...
//        4)TRICK :TreeSet "null" object cannot be used as an element.
//        Set Methods:
//        .add(element);-->Adds element to Set
//        .addAll(collection);-->adds all the elements of the desired collection
//        .contains(element);-->freezes true if the desired element is in sett, false otherwise.
//        .containsAll(collection);-->freezes true if all of the requested collection exists in the searched set, false otherwise
//        .remove(element);-->removes and freezes true if the desired element is found, false if not found
//        .removeAll(collection);-->removes all elements of the requested collection if it finds it and freezes true, if not found false returns
//        .equlas(set2);--> freezes true if all elements are the same as the requested set2, false otherwise
//        .retainAll(collection1);-->Deletes all elements except the elements of collection1, true if deleted, false otherwise (returns the intersecting common elements.)
//        .clear();-->Delete all elements in sett
//        .isEmpty();-->Freezes true if the set has no elements, false if any
//        .size();-->returns the number of elements of the set
//        .clone();--> when you use clone method, you can make data type "Object"

import java.time.LocalTime;
import java.util.*;

public class Sets01 {

    /*
        1)Sets are for storing multiple non-primitive data in the same data type
        2)Sets are for storing unique data like email addresses, SSN, Phone Numbers in a Country, ...
        3)There are 3 different Sets: i)HashSet: Uses "Hashing Technique".
                                                 It does not put the elements in any order.
                                                 HashSet accepts just a single "null" as element
                                      ii)LinkedHashSet: Puts the elements in "Insertion Order"
                                      iii)TreeSet: Puts the elements in "Natural Order"(Ascending Order in numbers, Alphabetical Order in Strings)
                                          TreeSet is so slow in adding elements
        Question: If you need to store "unique elements" in "natural order", which collection do yo use?
                  Answer: TreeSet
        Question: As you know, TreeSet is so slow in adding elements, how can you improve your code?
                  i)Create a HashSet
                  ii)Add elements into the HashSet
                  iii)Convert HashSet to TreeSet
     */

    public static void main(String[] args) {

        //HashSet
        HashSet<String> emails = new HashSet<>();
        System.out.println(emails);// []

        emails.add("Apple");
        emails.add("Mango");
        emails.add("Orange");
        emails.add("Apricot");
        emails.add("Fig");
        emails.add("Mango");//When you try to add repeated data, Java does not give any error, and last data will be overwritten to the previous data
        emails.add(null);
        emails.add(null);
        System.out.println(emails);// [null, Apple, Fig, Mango, Apricot, Orange]

        emails.remove("Fig");
        System.out.println(emails);// [Apple, Mango, Apricot, Orange]

        //emails.clear();//Deletes all elements from the HashSet
        //System.out.println(emails);// []

        //When you use clone() method, you can make data type "Object"
        Object emails2 = emails.clone();
        System.out.println(emails2);

        HashSet<String> emails3 = (HashSet<String>) emails.clone();
        System.out.println(emails3);

        //LinkedHashSet
        LinkedHashSet<Integer> ssn = new LinkedHashSet<>();
        ssn.add(123456789);
        ssn.add(234567891);
        ssn.add(345678912);
        ssn.add(456789123);
        ssn.add(null);
        
        System.out.println(ssn);//[123456789, 234567891, 345678912, 456789123]

        //TreeSet
        //1.Way: Slower
        Long starting = LocalTime.now().toNanoOfDay();
        TreeSet<Integer> nums1 = new TreeSet<>();
        nums1.add(23);
        nums1.add(5);
        nums1.add(17);
        nums1.add(67);
        nums1.add(41);
        nums1.add(-5);
        //nums1.add(null);//TreeSet does not accept "null" as element
        System.out.println(nums1);//[ -5, 5, 17, 23, 41, 67]

        Long middle = LocalTime.now().toNanoOfDay();

        //2.Way: Faster
        HashSet<Integer> nums2 = new HashSet<>();
        nums2.add(5);
        nums2.add(17);
        nums2.add(67);
        nums2.add(41);
        nums2.add(-5);

        Set<Integer> perfectNums = new TreeSet<>(nums2);
        System.out.println(perfectNums);//[ -5, 5, 17, 23, 41, 67]

        Long ending = LocalTime.now().toNanoOfDay();

        System.out.println("1.Way: " + (middle-starting));
        System.out.println("2.Way: " + (ending-middle));
    }
}
