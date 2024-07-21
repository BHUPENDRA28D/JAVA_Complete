package Assignment17;

public class Circle {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public  double getArea(){
        return 3.14* radius*radius;
    }
}
class  SubCircle extends Circle{
    private int thickness;

    public int getThickness() {
        return thickness;
    }

    public void setThickness(int thickness) {
        this.thickness = thickness;
    }

    @Override
    public double getArea() {

        return  ((3.14 *(thickness+getRadius())*(thickness+getRadius())) - super.getArea());

    }

}
