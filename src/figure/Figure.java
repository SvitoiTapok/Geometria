package figure;


public abstract class Figure{
    //private int sideCount;
    int sideCount;
    public static int count;
    //private double side;
    double side;
    public double GetSquare(){return 0;}
    public double GetPerimeter(){
        return this.side*this.sideCount;
    }
    static {
        count = 0;
    }
    {
        count++;
    }
    public Figure(double a){
        this.side = a;
    }
}