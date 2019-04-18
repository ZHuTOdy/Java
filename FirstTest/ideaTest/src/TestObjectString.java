public class TestObjectString {

    public void myMethod(String str){
        System.err.println("String");
    }
    public void myMethod(Object obj){
        System.err.println("Object");
    }

    public static void main(String[] args){
        new TestObjectString().myMethod(null);
    }
}
