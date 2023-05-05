class A {
    int num;
    boolean valueSet=false;
    public synchronized void put(int num){

        while(valueSet){
            // try{wait();}catch(Exception e){}
        }

        this.num=num;
        System.out.println("put : "+num);
        valueSet=true;
    }
    public synchronized void get(){
        while(!valueSet){
            // try{wait();}catch(Exception e){}
        }
        System.out.println("get : "+num);
        valueSet=false; 
    }
}


//producer class
class Producer implements Runnable{
    A q;
    public Producer(A q){
        this.q=q;
        Thread t =new  Thread(this,"Producer");
        t.start();
    }
    @Override
    public void run() {
        int i=0;
        while(true){
            q.put(i++);
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                //nothing
            }
        }
        
    }
}


//consumer class
class Consumer implements Runnable{
    A q;

    public Consumer(A q){
        this.q=q;
        Thread t =new  Thread(this,"consumer");
        t.start();
    }
    @Override
    public void run() {
        while(true){
            q.get();
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                //nothing
            }
        }
        
    }
}

public class InterThread {
    public static void main(String[] args) {
        A q=new A();
        new Producer(q);
        new Consumer(q);
    }
}
