package figure.quadrileteral;

public class Rectangle extends Parallelogram{
    public Rectangle(double a, double b){
        super(a, b);
    }
    @Override
    public double GetSquare(){
        return this.side * this.b;
    }

}
