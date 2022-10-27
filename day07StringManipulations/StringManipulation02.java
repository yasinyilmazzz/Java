package day07StringManipulations;

public class StringManipulation02 {
    public static void main(String[] args) {

        String str = "Java is OOP";
        String result1=str.replace('O','*');
        System.out.println(result1);//Java is **P  //burada ' kullanıldı

        String result2 = str.replace("Java","*");
        System.out.println(result2);//* is OOP  //burada " kullanıldı

       //exp: Change all digits to "*" in the giving string
        // way 1:
        String st = "Ali is 13 years old, I think he seems 15";
        String result3= st.replace('1','*').
                         replace('3','*').
                         replace('5','*');
        //.................
        System.out.println(result3);// Ali is ** years old, I think he seems **
                                    // its hardcoding and cannot be accepted

        // way 2:
        String result4=  st.replaceAll("[0-9]","*");
        System.out.println(result4);

        /*
        Regex means "Regular Expressions"
        Regex represents a group of data
        All digits: [0-9]
        All lowercase letters: [a-z]
        All Uppercase letters: [A-Z]
        All lower and uppercase letters [a-zA-Z]
        All lower and uppercase letters and digits [a-zA-Z0-9]
        Some multiple characters like a, e, i, o, u: [aeiou]

        All characters different from digits: [^0-9]
        All characters different from letters: [^a-zA-Z]
        All characters different from vowels: [^aeiou]

        space character: \\s
        All characters different from space :\\S

        All digits :\\d
        All characters different from digits: \\D

        All upper-lower letters and digit and _ : \\w
        All characters different from those:\\W

        All punctuation marks : \\p{Punch}
         */

//___________________________________________________________________________
        /*Type code to check if a password is valid or not for the following conditions;
            Password must have at least 8 characters different from space character
            Password must have at least 1 symbol*/

        String pwd = "!1a23 b4? es";
        boolean firstRule = pwd.replaceAll("\\s","").length()>7;
        //boolean secRule = pwd.replaceAll("\\s","").replaceAll("[a-zA-Z]","").length()>0;

        //aşağıda space de eklenmiştir ancak space görünmediğinden dikkat etmek gerekir.
        boolean secRule = pwd.replaceAll("[a-zA-Z ]","").length()>0;
        System.out.println("is the pass valid: "+ (firstRule&&secRule));














    }
}
