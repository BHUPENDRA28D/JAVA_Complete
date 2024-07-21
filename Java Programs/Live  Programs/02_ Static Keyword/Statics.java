class StaticsTutorial {
    String s1;// Instance + Reference variable.
   int a ,b;
   
   static int k =20;// static variable here..
   void setInstanceVar(int x ,int y){
    a = x;
    b =y;
   }
   
 static   void setStaticVar(int z)//  static  method here.
   { k = z;}
}
class Statics{
    public static void main(String []args){


        StaticsTutorial s1 = new  StaticsTutorial();
        StaticsTutorial s2 = new  StaticsTutorial();

        StaticsTutorial s3; // Local variable by default blank ...
        s1.setInstanceVar(5,7);
        System.out.println("Value of a in object s1 : ");

       System.out.println("a = "+s1.a+ " b=" +s1.b);

       s1.setInstanceVar(34,56);
       System.out.println("Value of a in object s2 : ");
       System.out.println("a = "+s2.a+ " b=" +s2.b);
//    System.out.println("k ="+s1.k+"\n");
//accessing the static variable using object


 //accessing the static variable using class
       StaticsTutorial.setStaticVar(98);
       System.out.println("Value of k in Class  : ");
       System.out.println("k = "+StaticsTutorial.k);
    


    }
}