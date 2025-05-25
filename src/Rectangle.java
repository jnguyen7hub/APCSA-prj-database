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
    double perimeter(){
        return (2 * base) + (2 * height);
    }
}
