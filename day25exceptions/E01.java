package day25exceptions;
    /*
    1-Exception is unexpected result.
    2-There are two ways to work with Exceptions.
        i)try-catch blocks : Handling Exceptions
        ii)Throw exceptions and block the application.

    3-If you do not handle Exception, java stops execution and the application is blocked.


     */

public class E01 {
    public static void main(String[] args) {
        divide(6,2);
        divide2(5,0);

    }

    //1.way:We donot recommend this way. It is not mandatory to know all math rules. In Math, there may be a lot of way to consider every formule
    //to solve a code requirements.
    public static void divide(int a, int b){

        System.out.println(a/b);
    }



    //2.way: Handle Exception by using try -catch blocks
    public static void divide2(int a,int b){
        try {
            System.out.println(a/b);
            System.out.println("hi");

        }catch (ArithmeticException e){
            System.out.println("A problem");
        }
    }
}
