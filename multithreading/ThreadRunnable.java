
class Hi implements Runnable{
    //runable does not have start class so how to call run???
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hi");
            try{
                Thread.sleep(500);
            }catch(Exception e){
                //nothing
            }
        }
    }
}

class Hello implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hello");
            try{
                Thread.sleep(500);
            }catch(Exception e){
                //nothing
            }
        }
    }
}

public class ThreadRunnable {
        public static void main(String args[]) {
            Hi obj1=new Hi();
            Hello obj2= new Hello();

            Thread t1=new Thread(obj1);
            Thread t2=new Thread(obj2);

            // obj1.start();obj2.start();
            //start always call run methord 
            // obj1.show();
            // obj2.show();

            t1.start();
            t2.start();
        }
};  