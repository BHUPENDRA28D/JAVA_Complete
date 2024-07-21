package Assignment17;

public class Rectangle {
 private    int l,b;
    private String borderColor;

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }
    public void printRectangleColor(){
        System.out.println(" Border Color : "+borderColor);
    }
}
//Filled Rectangle
class FilledRectangle extends Rectangle{
    private String filledColor;

    public String getFilledColor() {
        return filledColor;
    }

    public void setFilledColor(String filledColor) {
        this.filledColor = filledColor;
    }

    public void printRectangleColor(){
        super.printRectangleColor();
        System.out.println("FilledColor : "+filledColor);
    }
}
