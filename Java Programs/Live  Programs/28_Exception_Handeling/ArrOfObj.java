
class Student{
    int roolNo;
    String name;
    int marks;
}
public class ArrOfObj {
    public static void main(String a []){

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        //Array of object
        Student student[] = new Student[3];
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;
        s1.marks =98;
        s2.marks =74;
        s3.marks =87;
        s1.name ="Navin";
        s2.name ="Riya";
        s3.name ="Jeniffer";


        for( int i =0; i< student.length;i++){
            System.out.println( student[i].name +" : "+student[i].marks) ;
        }

        int arr []  = new int[6];

        arr[0] =4;
        arr[1] = 8;
        arr[2] = 3;
        arr[3] = 3;
        arr[4] = 21;
        
        System.out.print("\nThe array to be displayed is:  ");
        for( int i : arr){


            System.out.print(" "+ i);
        }
//        int i =0;
//        while(i < arr.length){
//            System.out.print(" "+arr[i]);
//            i++;
//        }
    }
}
