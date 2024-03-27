
public abstract class Tower {
    protected int width;
    protected int height;
    public Tower(int width,int height){
        this.width=width;
        this.height=height;
    }
    protected abstract double perimeter();
    public double area(){
        return this.height*this.width;
    }
}
