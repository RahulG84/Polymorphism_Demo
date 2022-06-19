//"Runtime Polymorphism"
//"Method Overriding"
public class Shape {
    void draw(){  //Super Class
        System.out.println("Cant Stay Shape Tye");
    }
}
class square extends Shape{
    @Override
    void draw(){
        super.draw(); // Calling Super class Method Using Subclass object Becouse of We extend the Shape Class in Square Class
        System.out.println("Square Shape");
    }
   /* //@Override// To Remove Override Then With the object of Sub class Only Called the  Superclass Method
    void draw1(){
        System.out.println("Square Shape");   // Calling Only Suer Class Method //Shape Result = new square();
    }*/
}
class Demo{
    public static void main(String[] args) {
        Shape Result = new square();
        Result.draw();
    }
}