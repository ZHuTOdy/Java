public class TestStatic {
    static int a;
    int b;
    static int c;
    public int aMethod(){
        a++;
        return a;
    }

    public int bMethod(){
        b++;
        return b;
    }

    public static int cMethod(){
        c++;
        return c;
    }

    public static void main(String []args){
        TestStatic test1 = new TestStatic();
        TestStatic test2 = new TestStatic();
        TestStatic test3 = new TestStatic();
        test1.aMethod();
        System.out.println(test1.aMethod());
        test2.bMethod();
        System.out.println(test2.bMethod());
        TestStatic.cMethod();
        System.out.println(TestStatic.cMethod());
    }
}
