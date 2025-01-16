package Generics;

import java.util.Arrays;

public class CustomArrayList {

    public static void main(String[] args) {

        Array array = new Array(5);
        array.append(23);
        array.append(96);
        array.append(4);
        array.append(34);

        array.display();
        array.delete(2);
        array.display();
        array.insert(76,2);
        array.display();
        array.search(96);
        array.edit(1,52);
        array.display();

    }
}
class  Array{
    private int capicity;
    private  int lastIndex;
    private  int[] ptr;

    Array(int cap){
        this.capicity =cap;
        this.lastIndex = -1;
        this.ptr = new int[capicity];
    }

    public boolean isEmpty(){
        if(lastIndex ==-1){
            return  true;
        }
        return false;
    }

    public boolean isFull(){
        return lastIndex == capicity-1;
    }

    public void append(int data){
        if(isFull())
            System.out.println("Generics.Array is already full");

        else{
            lastIndex++;
            ptr[lastIndex] =data;
        }}
        // insert element
        public void insert(int data,int index){
         if(isFull())
             System.out.println("Generics.Array is already full");

         if(index <0 || index>lastIndex+1)
             System.out.println("Invalid Index");

         else{
             for(int i =lastIndex;i>= index;i--){
                 ptr[i+1] = ptr[i];}

                 ptr[index] = data;
                 lastIndex++;



        }
    }

    //delete the element.
    public  void delete(int index){
        if(isEmpty())
            System.out.println("The array is empty");
        if(index <0 || index >=lastIndex+1){
            System.out.println("The index is invalid");

        }
        else {
            for( int i = index;i<lastIndex;i++)
                ptr[i] = ptr[i+1];
        }
        ptr[lastIndex] =0;
        lastIndex--;
    }

    // serach
    public void search(int data){
        for(int i =0;i<lastIndex;i++){
            if(ptr[i] == data){
                System.out.println("Data found at "+ i);
                return;}
            }
        System.out.println("data not found");

    }

    // edit
    public  void edit(int index,int data){
        if(index>=0 && index<=lastIndex){
            ptr[index] =data;
        }
    }

    //count
    public int countElement(){
        return lastIndex+1;
    }

    public void display(){
        System.out.println(Arrays.toString(ptr));

    }

}

class DynamicArray{
    int capicity;
    int lastIndex;
    int [] ptr;

    //consturtor
    DynamicArray(int cap){
        this.capicity =cap;
        lastIndex=-1;
        this.ptr =new int[lastIndex];
    }

    public  void halfArray(){
       int[] temp = new int[capicity];

       for(int i =0;i<=lastIndex;i++)
           temp[i] = ptr[i];
       ptr =temp;
       capicity/=2;

    }
    public  void doubleArray(){
       int[] temp = new int[capicity*2];

       for(int i =0;i<=lastIndex;i++)
           temp[i] = ptr[i];
       ptr =temp;
       capicity*=2;

    }
    public boolean isEmpty(){
        if(lastIndex ==-1){
            return  true;
        }
        return false;
    }

    public boolean isFull(){
        return lastIndex == capicity-1;
    }

    public void append(int data){
        if(isFull())
            System.out.println("Generics.Array is already full");

        else{
            lastIndex++;
            ptr[lastIndex] =data;
        }
    }
    // insert element
    public void insert(int data,int index){
        if(isFull())
          doubleArray();

        if(index <0 || index>lastIndex+1)
            System.out.println("Invalid Index");

        else{
            for(int i =lastIndex;i>= index;i--){
                ptr[i+1] = ptr[i];}

            ptr[index] = data;
            lastIndex++;



        }
    }

    //delete the element.
    public  void delete(int index){
        if(isEmpty())
            System.out.println("The array is empty");
        if(index <0 || index >=lastIndex+1){
            System.out.println("The index is invalid");

        }
        else {
            for( int i = index;i<lastIndex;i++)
                ptr[i] = ptr[i+1];
        }
        ptr[lastIndex] =0;
        lastIndex--;

        if (lastIndex + 1 <= capicity / 2 && capicity > 1)
            halfArray();
    }

    // serach
    public void search(int data){
        for(int i =0;i<lastIndex;i++){
            if(ptr[i] == data){
                System.out.println("Data found at "+ i);
                return;}
        }
        System.out.println("data not found");

    }

    // edit
    public  void edit(int index,int data){
        if(index>=0 && index<=lastIndex){
            ptr[index] =data;
        }
    }

    //count
    public int countElement(){
        return lastIndex+1;
    }

    public void display(){
        System.out.println(Arrays.toString(ptr));

    }
}