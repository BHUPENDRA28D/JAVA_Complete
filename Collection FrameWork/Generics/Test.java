package Generics;

//
//enum DAY{
//     Sunday,Monday,Tuesday,Wednesday,Thrusday,Friday,Saturday
//}

enum Operations {
    Add, Minus, Multiplay, Divide;

    public <T> double apply(T a, T b){
        return 2.443;
    }
}
public class Test {
    public static void main(String[] args) {

//        DAY day = DAY.Monday;
//        DAY dayy = "Monday"; // required type was enum not string.

         Integer [] arrInt = {11,12,13,14,15};
         String [] arrStr ={"Hello ", "rashi","lovelysingh"};
         printArray(arrInt);
         printArray(arrStr);
        display(12);
        display("hello");

    }
        //... Generic Methodes..
        public static  <T> void printArray(T[] array){

           for(T element : array){
               System.out.print(element+" ");
           }
            System.out.println();
        }

    public static <T> void display(T elment){
        System.out.println("Generic display :"+ elment);
    }
        public static void display(Integer elment){
            System.out.println("Integer display :"+ elment);
        }
}
