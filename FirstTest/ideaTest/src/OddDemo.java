public class OddDemo {

    public static void main(String[] args){
        if(odd(2)){
            System.out.println("奇数");
        }else
            System.out.println("偶数");
    }
    private static boolean odd(int num){
        return num % 2 != 0;
    }
}
