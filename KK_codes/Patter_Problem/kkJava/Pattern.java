package kkJava;

public class Pattern {
    public static void main(String[] args) {

//        simple_pattern();
        pattern2();
        pattern3();
    }


    static void simple_pattern(){
        for(int i =0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2(){
        for(int i =0;i<5;i++){
            for(int j =0;j<5;j++){
                if(j<=i)
                System.out.print(" ");

                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }



    static void pattern3(){
        for(int i =0;i<5;i++){
            for(int j =0;j<5;j++){
                if(j>=i)
                    System.out.print("*");

                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
