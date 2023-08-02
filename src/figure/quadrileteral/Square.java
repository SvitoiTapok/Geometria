package figure.quadrileteral;

public class Square extends Parallelogram{
    public Square(double a){
        super(a,a);
        this.side = a;
    }
    @Override
    public double GetSquare(){
        return this.side*this.side;
    }
}
