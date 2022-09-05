package oop;

public class abstraction implements Bus{
    public static void main(String[] args) {
     audi A = new audi();
     A.start();
     abstraction ab = new abstraction();
     ab.start();
    }

    @Override
    public void start() {
        System.out.println("Bus is Starting.......");
    }
}

class audi extends car{
    @Override
     void start()
     {
         System.out.println("adui is starting.....");
     }
}
class BMW extends car{
    @Override
     void start()
    {
        System.out.println("BMW is start.....");
    }
}
abstract class car{
    int price;
    abstract void start();

}

interface Bus{
    // In interfaces methods are by default public abstracted so you can not define it's body
    void start();
}