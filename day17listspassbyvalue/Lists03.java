package day17listspassbyvalue;

import java.util.ArrayList;
import java.util.List;

public class Lists03 {
    public static void main(String[] args) {

        //Type code to increase the value of every element by 3 except 7.

        List<Integer> a=new ArrayList<>();
        a.add(11);
        a.add(33);
        a.add(22);
        a.add(7);
        a.add(15);
        System.out.println(a);
        for (Integer w:a){
            if (w==7){
                continue;
            }
            a.set(a.indexOf(w),w+3);
        }
        System.out.println(a);

//=========================================================================================================

        //Example 2: Convert all elements to "*" except the last 4 elements.

        List<String> b=new ArrayList<>();
        b.add("12");
        b.add("32");
        b.add("54");
        b.add("67");
        b.add("43");
        b.add("65");
        b.add("11");
        b.add("98");
        System.out.println(b);

        for (String w:b){
            if (b.indexOf(w)==b.size()-4){
                break;
            }b.set(b.indexOf(w),"*");
        }
        System.out.println(b);



























    }
}
