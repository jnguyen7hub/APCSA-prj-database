public class Rectangle extends Shape{

    double base, height;

    public Rectangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    double area(){
        return base * height;
    }
}
