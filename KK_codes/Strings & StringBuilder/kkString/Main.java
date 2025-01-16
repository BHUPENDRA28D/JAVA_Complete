package kkString;

public class Main {

    public static void main(String[] args) {
        String a = "Ravi";
         System.out.println(a);
        String b="Kushwaha";
        System.out.println(b);

        System.out.println(a==b);

        String name1 = new String("Rashi");
        String name2 = new String("Rashi");

       System.out.println(name1 == name2);

       // So value can be compared by the use of .equals methode.
       System.out.println(name1.equals(name2));



    }
}
