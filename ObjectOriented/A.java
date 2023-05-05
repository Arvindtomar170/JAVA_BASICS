package util;
public class A{ 
    public static void main(String[] args){
        System.out.println("Yoo...");
    }
    public int add(int x, int y){
        return (x + y);
    }
}
//This is a package-private class
class D{
    D(){
        System.out.println("This is constructor");
    }
}