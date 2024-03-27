
public class RectangularTower extends Tower{
    public RectangularTower(int width, int height){
        super(width, height);
        if (width==height || Math.abs(height-width)>5) {
            double per = perimeter();
            System.out.println("Ths is the perimeter of the rectangle: " + per + "\n\n");
        }
        else {
            double ar=area();
            System.out.print("Ths is the area of the rectangle: "+ar+"\n\n");
        }
    }
    @java.lang.Override
    protected double perimeter() {
        return (2*width)+(2*height);
    }
}
