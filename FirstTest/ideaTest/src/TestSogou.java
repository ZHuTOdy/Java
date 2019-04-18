public class TestSogou {
    public static synchronized void main(String[] args){
        Thread t = new Thread(){
            public void run(){
                sogou();
            }
        };
        t.run();
        System.out.println("Hello");
    }

    private static synchronized void sogou(){
        System.out.println("Sogou");
    }
}
