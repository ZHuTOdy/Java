public class Test extends Base {
    static {
        System.out.println("test static2");
    }

    public Test(){
        System.out.println("test constructor4");
    }

    public static void main(String []args){
        new Test();
    }
}

class Base{
    static{
        System.out.println("base static1");
    }
    public Base(){
        System.out.println("base constructor3");
    }
}
