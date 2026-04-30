package F1_Basic_OOP;
class Shape{
    void draw(){
        System.out.println("Shape is drawn");
    }
}

class Circle extends Shape{
    @Override
    void draw(){
        super.draw();
        System.out.println("Circle is drawn");
    }
}

class Rectangle extends Shape{
    @Override
    void draw(){
        System.out.println("Rectangle is drawn");
    }
}
public class L5_Pol_MethodOverriding {
    public static void main(String[] args) {
        Shape obj = new Rectangle();
        obj.draw();

        Shape obj2 = new Circle();
        obj2.draw();

        Shape obj3 = new Shape();
        obj3.draw();
    }
}
