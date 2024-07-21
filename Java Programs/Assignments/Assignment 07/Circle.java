class Circle {
    private double r;
    public Circle(double r){
        this.r =r;
    }
    // method to calculate area of circle
    public double getArea() {
        return 3.14*r*r;}
        // method to calculate circumference of
    public double getCircumference(){
        return 2 * 3.14*r;
    }
public static void main (String [] arg){
    Circle c= new Circle(10);
    System.out.println("The Area is : "+c.getArea()+"\n"
    + "The Circumference is : "+c.getCircumference()+"\n");
}
}