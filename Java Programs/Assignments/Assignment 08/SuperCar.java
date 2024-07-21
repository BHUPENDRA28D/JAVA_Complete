class SuperCar{
  private String ownerName,price,color,brand;

  public void setOwnerName(String name){
   ownerName =name;
  }  
  public void setPrice(String price){
     this.price=price;
  }  
  public void setColor(String color){
     this.color=color;
  }  
  public void setBrand (String brand){
     this.brand=brand;
  }  
 public String getOwnerName(return ownerName);
 public String getPrice(return price);
 public String getColor(return color);
 public String getBrand(return brand);
 
 public static int countInstance;
 public SuperCar getInstance(){
    if(countInstance ==0){
        countInstance ++;
        return new SuperCar();
    }
    return null;
 }

}