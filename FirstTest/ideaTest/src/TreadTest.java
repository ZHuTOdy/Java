public class TreadTest implements Runnable{
    private int i ;

    public void run(){
        for(;i < 100;i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args){
        for (int i = 0;i < 100;i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i == 20) {
//                new Thread().start();
//                Thread tt1 = new Thread(new TreadTest());
//                tt1.start();
//                Thread t = new Thread();
//                t.start();
                //Runable接口默认用法：
                TreadTest treadTest = new TreadTest();
                Thread thread = new Thread(treadTest);
                thread.start();
            }
        }
    }

}
