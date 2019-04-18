public class TestException {
    public static void main(String[] args) throws Exception{
        try{
            try {
                throw new B();
            }
            catch (A a){
                System.out.println("Caught A");
                throw a;
            }
        }
        catch (B b){
            System.out.println("Caught B");
            return;
        }
        finally {
            System.out.println("Hello World");
        }
    }
}

class A extends Exception{}

class B extends A{}
