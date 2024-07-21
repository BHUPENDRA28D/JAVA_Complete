package A16;

public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double area(){
       return  (3.14*radius*radius);
    }
}
class ThickCircle extends Circle{
    private int thickness;

    public int getThickness() {
        return thickness;
    }

    public void setThickness(int thickness) {
        this.thickness = thickness;
    }

    public double getThicknessArea(){
        return ((3.14 *(getRadius()+thickness)*(getRadius()+thickness))  - area());
    }
    public  double getHallowArea(){
        return area();


    }
}
