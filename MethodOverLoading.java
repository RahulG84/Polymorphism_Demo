//Complie Time Polymorphism
//Method overloading

public class MethodOverLoading {
    public static void main(String[] args) {
        A result= new A();
        result.add(20,20);
        result.add();
        result.add(15,15.80);
        result.add();
    }
}
 class A{
     void add(){
        int a = 10, b = 20;
        int c=a+b;
        System.out.println(c);
    }
    void add(int x, int y){
        int c;
        c=x+y;
        System.out.println(c);
    }
    void add(int x, double y){
        double c;
        c=x+y;
        System.out.println(c);
    }
    }