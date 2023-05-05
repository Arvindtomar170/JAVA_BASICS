class counter{
    int c=0;
    public synchronized void increament(){
        c++;
    }
}
public class SynchronizedThread {
    public static void main(String[] args) throws Exception {
        counter obj=new counter();
        Thread t1=new Thread(()->{
                for(int i=0;i<100000;i++){
                    // System.out.println("I am t1");
                    obj.increament();
                }
            }
        );

        Thread t2=new Thread(()->{
            for(int i=0;i<100000;i++){
                // System.out.println("I am t2");
                obj.increament();
                }
            }
        );
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(obj.c);
    }
}
