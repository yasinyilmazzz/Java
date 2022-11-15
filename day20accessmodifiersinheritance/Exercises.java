package day20accessmodifiersinheritance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercises {
    public static void main(String[] args) {
//        int i=1;
//        do{
//            if (i!=3){
//                continue;
//            } else if (i==5) {
//                System.out.println(i);
//                break;
//            }else {
//                System.out.println(i);
//            }
//            i++;
//        }while (true);

//Type code to print different characters used in a String Example: 'Mississippi' ==> Misp

//        String exp="Mississippi";
//        String p="";
//        for (int i = 0; i<exp.length(); i++){
//            String r=exp.substring(i,i+1);
//            if (!p.contains(r)){
//                p=p+r;
//
//            }
//        }
//        System.out.println(p);
//        Type the code that shows how many different elements there are in a list. Example: {10, 31, 15, 7, 15, 7, 7} ==> 4
//        List<Integer> myList=Arrays.asList(10, 31, 15, 7, 15, 7, 7);
//        List<Integer> num=new ArrayList<>();
//        for (int w:myList){
//            if (!num.contains(w)){
//                num.add(w);
//            }
//        }
//        System.out.println(num);

//        //print only not repeated elements(10, 31, 15, 7, 15, 7, 7)
//        List<Integer> prr=new ArrayList<>();
//        prr.add(10);
//        prr.add(31);
//        prr.add(15);
//        prr.add(7);
//        prr.add(15);
//        prr.add(7);
//        List<Integer> yrr=new ArrayList<>();
//        yrr.add(10);
//        yrr.add(31);
//        yrr.add(15);
//        yrr.add(7);
//        yrr.add(15);
//        yrr.add(7);
//        for (int w:prr){
//            for (int i=1;i< prr.size();i++){
//                if(w== prr.get(i)){
//                    yrr.remove(yrr.get(i));
//                }
//
//            }
//        }
//        System.out.println(yrr);
//
////        Write a Java program to find the common elements between two arrays (string values).
//        String arr[]={"apple","melon","grapes","cherry"};
//        String brr[]={"car","bike","apple","plane"};
//
//        for (String w:arr){
//            for (String k:brr){
//                if (w.equals(k)){
//                    System.out.println(w);
//                }
//            }
//        }
//
// Type code to print repeated characters in a String by using while loop Example: String str = "accessories";   ==>  ces

        String m="accessories";
        String r="";
        for (int i = 0; i <m.length() ; i++) {
            String p=m.substring(i,i+1);
            if (m.indexOf(p)!=m.lastIndexOf(p)&&!r.contains(p)){
                r=r+m.substring(i,i+1);

            }

        }System.out.println(r);

        String str = "accessories";
        String repeated="";
        int i = 0;
        while (i<str.length()){
            String p=str.substring(i,i+1);
            if (str.indexOf(p)!=str.lastIndexOf(p) && !repeated.contains(p))
                repeated=repeated+p;
            i++;
        }
        System.out.println(repeated);










    }
}
