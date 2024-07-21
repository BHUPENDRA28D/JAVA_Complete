class ComplexNo{
  int real;
  int img;

  void getNo(int r,int i){
    real =r;
    img =i;
  }
  void dispaly(){
    System.out.println("Complex NO :: " +real+" + "  +img+"i\n");
  }
  void  sum(ComplexNo c){
   
    System.out.println("Addition of two complex numbers : ");
    System.out.println(+(real+c.real)+" + "+(img+c.img) +"i");
  }


  public static void main(String[] args) {
     ComplexNo  c1= new ComplexNo();
     ComplexNo  c2= new ComplexNo();
     c1.getNo(3,9);
     c2.getNo(5,7);
     c1.sum(c2);
     c1.dispaly();
  }

}