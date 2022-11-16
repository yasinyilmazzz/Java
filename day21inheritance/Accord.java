package day21inheritance;

import day20accessmodifiersinheritance.Honda;

public class Accord extends Honda {
    public void Sport(){
        System.out.println("Accord is in Sport Design");
    }
    public Accord(){
        System.out.println("Accord class constructor");
    }
}
