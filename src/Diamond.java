public class Diamond extends Shape{
    double dia1, dia2, side;
    public Diamond (double dia1, double dia2, double side){
        this.dia1 = dia1;
        this.dia2 = dia2;
        this.side = side;
    }

    @Override
    double area(){
        return 0.5 * (dia1 * dia2);
    }
    double perimeter(){
        return 4 * side;
    }
}
