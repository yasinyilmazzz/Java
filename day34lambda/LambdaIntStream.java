package day34lambda;

import day32lambda.UtilsClass;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class LambdaIntStream {
    public static void main(String[] args) {

        List<Integer> l=new ArrayList<>();
        l.add(8);
        l.add(9);
        l.add(131);
        l.add(10);
        l.add(9);
        l.add(10);
        l.add(2);
        l.add(8);
        System.out.println(getSumOfFromSevenToHundred());
        System.out.println(getSumOfFromSevenToHundred2Way());
        System.out.println(getMultiplicationFromTwoToEleven());
        System.out.println(calculateFactorial01(5));
        System.out.println(calculateFactorial02(-6));
        System.out.println(sumOfIntsInGivenRange(11,100));
        System.out.println(findSumOfDigitsInGivenRange(23,32));

    }

    //1) Create a method to find the sum of integers from 7 to 100
    public static int getSumOfFromSevenToHundred(){
        return IntStream.range(7,101).reduce(0,Math::addExact);
    }
    public static int getSumOfFromSevenToHundred2Way(){
        return IntStream.rangeClosed(7,100).sum(); //in this way rangeClosed method provide to be second parameter incluesive
    }

    //2)Create a method to find the multiplication of the integers from 2 (inc) to 11(inc)
    public static int getMultiplicationFromTwoToEleven(){
        return IntStream.rangeClosed(2,11).reduce(1,Math::multiplyExact);
    }

    //3)Create a method to calculate the factorial of a given number. (5 factorial= 1*2*3*4*5 ==> 5!= 1*2*3*4*5)
    public static int calculateFactorial01(int x){
        if(x>0) {
            return IntStream.rangeClosed(1, x).reduce(1, Math::multiplyExact);
        }
        System.out.println("Please enter positive integers for factorial operations");
        return 0;
    }
    public static Object calculateFactorial02(int x){
        return x>0 ? IntStream.rangeClosed(1, x).reduce(1, Math::multiplyExact) :
                        "Please enter positive integers for factorial operations";
            //in this way change return type to Object, because of ternary conditions return different data type
    }
    //4) Create a method to calculate the sum of even integers between given two integers

    public static int sumOfIntsInGivenRange(int a, int b){
        int x=0;
        if (a>b){
            x=a;
            a=b;
            b=x;
        }//in this part we assurance parameters to be first one greater than second one by swap operation.
        return IntStream.rangeClosed(a,b).filter(UtilsClass::checkToBeEven).sum();
    }

    //5) Create a method to calculate the sum of digits of every integers between given two integers
    // 23 and 32 ==> 2+3  2+4  2+5  2+6  2+7  2+8  2+9 3+0  3+1 3+2 ==> for each sum part we will use sum of digits

    public static int findSumOfDigitsInGivenRange(int a, int b){
        int x=0;
        if (a>b){
            x=a;
            a=b;
            b=x;
        }
        return IntStream.rangeClosed(a,b).map(UtilsClass::getSumOfDigit).sum();
    }



}
