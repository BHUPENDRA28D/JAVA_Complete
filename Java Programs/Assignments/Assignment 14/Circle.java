public class Circle{
    private double radius;
    
    public double getRadius(){return radius;}
    public void setRadius(double r){ radius =r;}

    public double area(){
        return Math.PI * getRadius() * getRadius();
    }
    public double circumfreance(){
        return 2 * Math.PI * getRadius();
    }


}