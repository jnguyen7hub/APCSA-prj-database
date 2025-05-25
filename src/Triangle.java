public class Triangle extends Shape{

    double base, height;

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    @Override
    double area(){
        return 0.5 * (base * height);
    }
    double perimeter(){
        return base + height + (Math.sqrt((Math.pow(base,2)) + (Math.pow(height,2))));
    }
}
