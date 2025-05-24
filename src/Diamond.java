public class Diamond extends Shape{
    double dia1, dia2;
    public Diamond (double dia1, double dia2){
        this.dia1 = dia1;
        this.dia2 = dia2;
    }

    @Override
    double area(){
        return 0.5 * (dia1 * dia2);
    }
}
