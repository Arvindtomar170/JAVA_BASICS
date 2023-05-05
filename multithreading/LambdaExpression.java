public class LambdaExpression {
    public static void main(String args[]){
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
                    System.out.println("Hello");
                    try{
                        Thread.sleep(1000);
                    }catch(Exception e){
                        //nothing
                    }
                }
            };
        Thread t2=new Thread(obj2);

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
        t1.start();
        t2.start();
        t3.start();

        System.out.println("Bye");
        //main did not wait for other thread


    }
}
