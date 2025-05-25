public class Circle extends Shape{

    double radius;

    public Circle (double radius){
        this.radius = radius;
    }
   @Override
    double area(){
        return Math.PI * Math.pow(radius, 2);
    }

    double perimeter(){
        return 2 * (Math.PI * radius);
    }
}
