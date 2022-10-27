package day08stringmanipulationsloops;

public class Exercises02 {
    public static void main(String[] args) {
        //ex: is string palindrom
        String str="kavak";
        String m="";
        for (int i=str.length()-1;i>=0;i--){
            m=m+str.charAt(i);

        }if (m.equals(str)){
            System.out.println("its palindrom");
        }else{
            System.out.println("not palindrom");
        }

        String a = "accessories";
        String b = "";
        for (int i =0; i<a.length();i++){
            String c= a.substring(i,i+1);
            if (a.indexOf(c)!= a.lastIndexOf(c)){
                if (!b.contains(c))
                b=b+c;
            }
        }
        System.out.println(b);

        /*String shirtPrice = ‘$12.99’;
 String bookPrice = ‘$35.99’;
 Type code to find the sum of the shirt and book prices.
  */
        String shirtPrice = "$12.99";
        String bookPrice = "$35.99";

        String shirt= shirtPrice.replace("$","");
        String book= bookPrice.replace("$","");
        System.out.println(Double.valueOf(shirt)+Double.valueOf(book));

        //2.Example: Type code to print unique characters in a String. Hello ==> Heo
        //*******ebay interwiev
        String st = "Hello";
        String ss = "";
        for (int i=0;i<st.length();i++){
            String c= st.substring(i,i+1);
            if (st.indexOf(c)==st.lastIndexOf(c)){
                ss=ss+c;
            }
        }
        System.out.println(ss);

        //1.Example: Put * between 2 consecutive characters and to the end in a String. For example; Java ==> J*a*v*a*
        String java ="Java";
        String jav= "";

        for (int i=0; i<java.length();i++){
            String j = java.substring(i,i+1)+"*";
            jav = jav+ j;
        }
        System.out.println(jav);

        String yas= "Yasin Yılmaz";
        String first= yas.substring(0,1), sec= yas.split(" ")[1].substring(0,1);
        System.out.println(first+" "+sec);

        String u = "Hello";
        String o= "";
        for (int i=0; i<u.length();i++){
            String p=u.substring(i,i+1);
            if (u.indexOf(p)== u.lastIndexOf(p)){
                o=o+p;
            }
        } System.out.println(o);

        String hh = "Hello";
        String bb = "";
        for (int i=0;i<hh.length();i++){
            if (hh.indexOf(i,i+1) == hh.lastIndexOf(i,i+1)){
                bb=bb+i;
            }
        }

        String test2="Java";
        String tp="";
        for (int i=0;i<test2.length();i++){
            String tu=test2.substring(i,i+1)+"*";
            tp=tp+tu;
        }
        System.out.println(tp);

        String test3="accessories";
        String testRs="";
        for (int i=0;i<test3.length();i++){
            String tg= test3.substring(i,i+1);
            if (test3.indexOf(tg)!=test3.lastIndexOf(tg)){
               if (!testRs.contains(tg)){
                testRs=testRs+tg;
                }}
        }System.out.println(testRs);


        String v="Java";
        String vv="";
        for (int i=0;i<v.length();i++){
            String ff= v.substring(i,i+1)+"*";
            vv=vv+ff;
        }
        System.out.println(vv);

        String h="Hello";
        String rr="";
        for (int i=0;i<h.length();i++){
            if (h.indexOf(h.charAt(i))==h.lastIndexOf(h.charAt(i))){
                String rrr= h.substring(i,i+1);
                if (!rr.contains(rrr)){
                    rr=rr+rrr;
                }
            }
        }
        System.out.println(rr);


        //Example 2: Find the sum of the integers from 3 to 6

        int sum=0;
        for (int i=3;i<7;i++){
            sum=sum+i;
        }
        System.out.println(sum);

        //Example 4: Type code to find the sum of the digits of an integer
        //           584 ==> 5+8+4=17

        int g =-584;
        g=Math.abs(g);
        int sumg=0;
        for (int i=584; i>0; i= i/10){
            sumg=sumg+i%10;
        }
        System.out.println(sumg);

        //Example 1: Type code to print characters except "m" in a String
        //           For example, Andromeda ==> Androeda

        String andr="Andromeda";
        String andr1="";
        for (int i=0;i<andr.length();i++){
            if (!andr.substring(i,i+1).contains("m")){
                String con=andr.substring(i,i+1);
                andr1=andr1+con;
            }
        }
        System.out.println(andr1);












    }

}
