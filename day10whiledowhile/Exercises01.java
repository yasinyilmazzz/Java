package day10whiledowhile;

import java.util.Scanner;

public class Exercises01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int i= input.nextInt();
        int o=1;
        while (o<=i){
            if (i%o==0){
                System.out.print(o+" ");
            }
            o++;
        }









































    }
}
