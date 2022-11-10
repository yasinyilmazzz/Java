package day17listspassbyvalue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lists02 {
    public static void main(String[] args) {

//Example 1: Find the closest 2 integers in the given list. [12, 15, 10, 21]

        List<Integer> a= new ArrayList<>();
        a.add(12);
        a.add(15);
        a.add(10);
        a.add(21);
        System.out.println(a);

        int max=Integer.MAX_VALUE ;//ilk değerin ne olacağını bilmediğimizden maximum değer atıyoruz.

        Collections.sort(a);
        for (int i=1;i<a.size();i++){
            max=Math.min(max,a.get(i)-a.get(i-1)); //Math.min metodu bir değer ile başka değeri kıyaslar
        }                                           //örnekte max değeri döngüye göre sorgulanacak ancak
                                                   // sürekli değişmeyecek minimum değerde sabit kalacaktır
        System.out.println(max);
        for (int i=1;i<a.size();i++){
            if (a.get(i)-a.get(i-1)==max){
                System.out.println(a.get(i)+" and "+a.get(i-1));
            }
        }
//=========================================================================================================


























    }
}
