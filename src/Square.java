public class Square extends Shape{

    double side;
    public Square(double side){
        this.side = side;
    }

    @Override
    double area(){
        return side * side;
    }
    double perimeter(){
        return 4 * side;
    }
}
