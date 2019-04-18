import java.util.ArrayList;
import java.util.List;

public class ExamSample {
    public static void main(String[] args){
        new ExamSample().ref1();
    }

    public static class Val{
        int i = 1;
    }

    public void ref1(){
        int i = 2;
        Val v = new Val();
        v.i = 3;
        ref2(v, i);
        System.out.println(v.i);
    }

    public  void ref2(Val v, int i){
//        v.i = 4;
//        i = 5;
//        Val val = new Val();
//        v = val;
//        System.out.print(v.i + "，" + i + "，");
//        String s = "race a car";
//        String s1 = s.replaceAll("[\\pP\\p{Punct}]","");
//        String s2 = s1.replace(" ","");
//        char end = s2.charAt(s2.length()-4);
//        char start = s2.charAt(3);
//        System.out.println(start+","+end);
        String a = "a";
        String b = "apple";
        System.out.println(b.contains(a));
    }
}
