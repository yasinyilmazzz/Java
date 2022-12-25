package day32lambda;

import javax.swing.plaf.IconUIResource;
import java.util.HashMap;

public class UtilsClass {
    public static void printInTheSameLineWithASpace(Object str){
        System.out.print(str+" ");
    }
    public static boolean checkToBeEven(int x){
        return x%2==0;
    }
    public static boolean checkToBeOdd(int x){
        return x%2!=0;
    }
    public static int getSquare(int x){
        return x*x;
    }
    public static int getCube(int x){
        return x*x*x;
    }
    public static double getHalf(double x){
        return x/2.0;
    }
    public static char getLastChar(String str){
        return str.charAt(str.length()-1);
    }
    public static HashMap myMap(String[] myArray){
        HashMap<String,Integer> myHashMap = new HashMap<>();
        for (int i = 0; i <myArray.length ; i++) {
            int counter=0;
            for (int j=i;j<myArray.length;j++){
                if (myArray[i].equals(myArray[j])){
                    counter++;
                    if (j==myArray.length-1){
                        i=j;
                    }
                    myHashMap.put(myArray[i], counter);
                }else {
                    i=j-1;
                    break;
                }
            }
        }
        return myHashMap;
    }

    public static int getSumOfDigit(int x){
        int sum=0;
        while(x!=0){
            sum=sum+x%10;
            x=x/10;
        }
        return sum;
    }


}
