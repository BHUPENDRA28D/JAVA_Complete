public class Cuboid{
    int l,h,b;
    public void setSide(int l,int h,int b){
       this.l =l;
       this.b= b;
       this.h =h;
    }
    public int getVolume(){
        return l*b*h;
    }

    public int getSurfaceArea(){
        return 2*(l+b+h);
    }

 public static void main(String args[]){
    Cuboid c1 = new Cuboid();
    c1.setSide(10,2,5);
    System.out.println("The volume of the cuboid is: "+c1.getVolume());
    System.out.println("The Surface area of the cuboid is: "+c1.getSurfaceArea());


 }
}