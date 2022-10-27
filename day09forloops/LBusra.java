package day09forloops;

public class LBusra {
    public static void main(String[] args) {
        /*Aşağıdaki şekli nested loop kullanarak oluşturun.

         *****
         ****
         ***
         **
         *

         */


//        for (int a = 5; a >= 1; a--) {
//            for (int b = 1; b <= a; b++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        System.out.println("\n<--------------------------------------------------------------------------->\n");



/* Aşağıdaki şekli nested loop kullanarak oluşturun.

1****
2***
3**
4*
5

*/

        for (int a = 1; a <= 5; a++) {
            System.out.print(a);
            for (int b = 5; b > a; b--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n<-------------------------------------------------------->\n");



/* Question-5 Type code to draw the following image by using a for loop.

A A A A A
A A A A A
A A A A A           */

//        for(int i=0; i<3; i++) {
//            for ( int j=0; j<5; j++) {
//                System.out.print("A ");
//            }
//            System.out.println();
//        }
//
//        System.out.println("\n---------------------------------------------------------");

//------------------------------------------------------------------------------------------------------------------

/* Question 6-  Type code to draw the following image by using a for loop.
A
A A
A A A
A A A A      */

//        for(int i = 1; i<5; i++) {
//            for(int j=1; j<i+1; j++) {
//                System.out.print("A ");
//            }
//
//            System.out.println();
//        }
//
//
//        System.out.println("\n-------------------------------------------------------------");


        //----------------------------------------------------------------------------

        /* Pattern

         *
         * *
         * * *
         * * * *
         * * * * *

         */

//        for (int i = 1; i < 6; i++) {
//            for(int j=1; j<=i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        System.out.println("--------------------------------------------------------------------------\n");



//----------------------------------------------------------------------------------------

/*Type code for this pattern

A A A A A
A A A A
A A A
A A
A

*/

//        for(int i=5; i>0; i--) {
//            for(int j=i; j>0; j--) {
//                System.out.print("A ");
//            }
//            System.out.println();
//        }
//
//        System.out.println("--------------------------------------------------------------------------\n");


//----------------------------------------------------------------------------------------



        /*

         * * * * * *
         * * * * *
         * * * *
         * * *
         * *
         *

         */


//        int satir = 6;
//
//        for(int i=1; i<=6; i++) {
//            for (int j=satir-i; j>=0; j--) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//------------------------------------------------------------

        /* Pattern
         *
         * *
         * * *
         * * * *
         * * * * *

         */

//        for (int i = 1; i < 6; i++) {
//            for(int j=1; j<=i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        System.out.println("--------------------------------------------------------------------------\n");


//----------------------------------------------------------------------------------------

        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *    */


//        int row = 6;
//
//        for(int i=0; i<row; i++ ) {
//
//            for(int j=row-i; j>1; j--) {
//                System.out.print(" ");
//            }
//            for(int j=0; j<=i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        System.out.println("--------------------------------------------------------------------------\n");





        /*  Type this rectangle patern

         * * * *
         * * * *
         * * * *
         * * * *

         */

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter number of rows");
//        int row =scan.nextInt();
//        System.out.println("Enter number of columns");
//        int columns =scan.nextInt();
//
//        for(int i=1; i<=row; i++) {
//            for(int j=1; j<=columns; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        System.out.println();




/*  Type code for this pattern

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

 */

//        for(int i=1; i<6; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//
//        }






/*  Type code for this pattern
        /*

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *

         */

        int row= 5;


        for(int i=row-1; i>=1; i--) {
            for(int j=i;j<=row-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        for(int i=1; i<=5; i++) {
            for(int j=i;j<=row; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }








/*Type code for this pattern
        1
        2 1
        3 2 1
        4 3 2 1
        5 4 3 2 1          */


//        for(int i=1; i<6; i++) {
//            for (int j = i; j >=1; j--) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//
//        }
    }
}
