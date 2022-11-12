package day18datetimeclassvarargs;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Friday13th {



    public static void main(String[] args) {

        LocalDate i=LocalDate.of(0,1,1);
        int counter=0;
        while (true){
            if (i.getDayOfMonth()==13 && i.getDayOfWeek().equals(DayOfWeek.FRIDAY)){
                counter++;
            }
            i=i.plusDays(1);
            if (i.equals(LocalDate.now())){
                break;
            }
        }
        System.out.println(counter);


    }
}


