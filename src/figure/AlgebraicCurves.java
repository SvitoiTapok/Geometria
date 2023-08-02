package figure;

public class AlgebraicCurves extends Figure{
    public AlgebraicCurves(double a){
        super(a);
    }
    public static int curvesCount;
    {
        curvesCount++;
    }
    public final double PI = Math.PI;
    @Override
    public double GetPerimeter(){
        return 0;
    }
}
