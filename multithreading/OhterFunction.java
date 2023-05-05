public class OhterFunction {
    public static void main(String args[]) throws InterruptedException{
        //first methord  (using annonymous class)
        Runnable obj1=new Runnable() {
            public void run(){
                for(int i=0;i<5;i++){
                    System.out.println("Hi");
                    try{
                        Thread.sleep(1000);
                    }catch(Exception e){
                        //nothing
                    }
                }
            } 
        };

        Thread t1=new Thread(obj1);

        //second methrod (anonymous class using lamda expression)
        Runnable obj2=() ->
            {
                for(int i=0;i<5;i++){
                    System.out.println("Hello i am t2 and my priority is : " + Thread.currentThread().getPriority());
                    try{
                        Thread.sleep(1000);
                    }catch(Exception e){
                        //nothing
                    }
                }
            };
        Thread t2=new Thread(obj2,"I am t2");

        //third methord (all using landa expression)
        Thread t3= new Thread(()->{
            for(int i=0;i<5;i++){
                System.out.println("I am different");
                try{
                    Thread.sleep(1000);
                }catch(Exception e){
                    //nothing here
                }
            }
        });
        System.out.println(t1.isAlive());  
        t1.start();
        t2.start();
        t3.start();
        
        // main thread wait for the other threads
        System.out.println(t1.isAlive());
        t1.join();
        t2.join();
        t3.join();
        System.out.println(t1.isAlive());


        System.out.println("Othter Function Starts Here");
        //naming the tread 
        t1.setName("Hey i am t1");
        t1.setPriority(1);
    
    }
}
