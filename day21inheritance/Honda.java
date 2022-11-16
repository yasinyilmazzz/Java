package day21inheritance;



public class Honda extends Car {
    public void makes(){
        System.out.println("This car is Honda mekes");
    }

    public Honda(){
        System.out.println("Honda class constructor");
    }
    public Honda(boolean isNew){
        super("Hybrid");
        if (isNew){
            System.out.println("Brand new");
        }else {
            System.out.println("Used");
        }
    }
}
