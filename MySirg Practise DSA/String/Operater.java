package String;

public class Operater {

    public static void main(String[] args) {

//        System.out.println('a'+'b');
//        System.out.println("a"+"b");
//        System.out.println((char)('a'+3));
//        System.out.println("a"+1);
//
//        //tostring methode call all over.
        // // if one of the datatype is string all will become string ...
//
//
//        System.out.println("kumal"+ new ArrayList<>());
//
//        System.out.println("Kumal"+new Integer(345));
//        System.out.println("Kumal"+String.valueOf(21));


        String series = "";

        for(int i =0;i<26;i++){
            char ch = (char)('a'+i);
            series+=ch;


        }

        System.out.println(series);
    }
}
