package day21inheritance;

public class Civic extends Honda {
    public void eco(){
        System.out.println("Civic uses ecoEngine");

    }
    public Civic(){
        System.out.println("Civic class constructor");
    }

    public Civic(int year){
        super(true);
        System.out.println(year);
    }
}
