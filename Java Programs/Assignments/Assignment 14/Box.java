package A14;

public class Box {
    private int l, b, h;
    protected double volume, surfaceArea;

    public void setLength(int l) {
        this.l = l;
    }

    public void setBreadth(int b) {
        this.b = b;
    }

    public void setHeight(int h) {
        this.h = h;
    }

    public int getLength() {
        return l;
    }

    public int getBreadth() {
        return b;
    }

    public int getHeight() {
        return h;
    }

    public double getVolume() {
        volume = l * b * h;
        return volume;
    }

    public double getSurfaceArea() {
        surfaceArea = 2 * (l * b + l * h + b * h);
        return surfaceArea;
    }

    public void display() {
        System.out.println("Length = " + getLength());
        System.out.println("Breadth = " + getBreadth());
        System.out.println("Height = " + getHeight());
        System.out.println("Volume = " + getVolume());
        System.out.println("Surface Area = " + getSurfaceArea());
    }
}
