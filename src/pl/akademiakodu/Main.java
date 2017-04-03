package pl.akademiakodu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

//        Pattern pattern = Pattern.compile("a{2}");
//        Pattern pattern = Pattern.compile("[0-9]{1,}");
//        Pattern pattern = Pattern.compile("\\S\\D{1,}");
//        Pattern pattern = Pattern.compile("\\d{1,9}");
//        Pattern pattern = Pattern.compile("(\\p{Upper}){1,}\\d{1,}"); ????????????




//        Matcher matcher = pattern.matcher("");

//1.
//        System.out.println(pattern.matcher("aa").matches());

//2.
//        System.out.println(pattern.matcher("521313542534").matches());

//3.
//        System.out.println(pattern.matcher("sadsdgadfgs").matches());

//4.
//        System.out.println(pattern.matcher("123456789").matches());

// 5.
//        System.out.println(pattern.matcher("").matches());

        System.out.println(Pattern.matches("[789]\\d{0,8}", "7"));

        System.out.println(Pattern.matches("[A-Z].+\\s[A-Z].+", "Oskar Polak"));
        System.out.println(Pattern.matches("\\d.*\\D", "5asdasdD"));
        System.out.println(Pattern.matches("\\d.*[a-zA-z]", "5asdasdD"));

        System.out.println(Pattern.matches(".+@.+\\..+", "lukaszkolacz@gmail.com"));



        //Hasło z różnymi znakami

//        Pattern bigChars = Pattern.compile(".*[A-Z].*");
//        Pattern specjalChars = Pattern.compile(".*[\\W].*");
//        Pattern intchar = Pattern.compile(".*[\\d].*");
//
//        Matcher matcherBig = bigChars.matcher("Aasd48as%dsd");
//        Matcher matcherSpecial =specjalChars.matcher("Aasd48as%dsd");
//        Matcher matcherInt = intchar.matcher("Aasd48as%dsd");

//        if(matcherBig.matches() && matcherSpecial.matches() && matcherInt.matches()){
//            System.out.println("Hasło jest poprawne");
//        }




    }
}
