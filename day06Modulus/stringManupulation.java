package day06Modulus;

public class stringManupulation {
    public static void main(String[] args) {

        //Count the alphabetical characters in a given String

        String name = "        Tom12  Hanks?..  ";

        System.out.println(name.replaceAll("[^A-Za-z]","").length());
        // temel mantığı:  .replaceAll ("parantez sonrası ne varsa al" , "virgül sonrasına yerleştir)
        /* Örnekte özel formül "[^A-Za-z]" kullanılarak A-z aralığındaki herhangi karakterler alınarak yerine
            "" boşluksuz tırnak açılarak hiçbirşey yerleştirme komutu verilmiştir.*/
        System.out.println(name.replaceAll("[^A-Za-z]",""));


        String s1="java is good, java is fun, java is intelligent";
        String denemeReplaceAll=s1.replaceAll("a","e");//replaces all occurrences of "a" to "e"
        String denemeReplace=s1.replace("a","e");
        System.out.println(denemeReplaceAll);
        System.out.println(denemeReplace);

















    }
}
