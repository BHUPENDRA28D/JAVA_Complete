package com.kk;

import java.util.Arrays;

public class ArrayADT extends Sorting {
    private int cap;
    private int lastIndex;
    private int [] ptr;

    public ArrayADT(int cap) {
        this.cap = cap;
        this.lastIndex =-1;
        this.ptr = new int[cap];
    }
    public void   append(int data){

        if(isFull()){System.out.println("Array is already full !");}
        else {
            lastIndex++;
            ptr[lastIndex] = data;
            System.out.println("Element appended in Arrray !");
        }
    }
// insert data
    public  void insert(int index,int data){
        if(isFull()){System.out.println("Array is already full !");}
        else{
            for(int i =lastIndex;i>=index;i--)
                ptr[i+1] = ptr[i];
            lastIndex++;
            ptr[index] = data;
        }
    }

//    delete data
    public void del(int index){
        int i;
        if(isEmpty()){ System.out.println("Array is already full !");}

        else if (index < 0 || index > lastIndex){
            System.out.println("\nIndex is invalid ");
        }
        else {
            for (i = index; i < lastIndex; i++)
                ptr[i] = ptr[i + 1];
            lastIndex--;


        }

    }
    public void edit(int index, int data){
        ptr[index] =data;
    }

//    searching by
    public int search(int data){
        insertion_sort();

        int start =0, end =lastIndex;
        int flag=0;
        int position=-1;

        while(start<=end){
            int mid =start+end/2;

            if(arr[mid] == data){flag=1; position =mid; break;}
            else if (arr[mid]>=data) { start+=1;}
            else if (arr[mid]<=data) {end-=1;}


            }
        if(flag==1)
            return  position;
        else
            return -1;
        }





    public  void display(){
        System.out.print("\n"+Arrays.toString(ptr));
    }

    public boolean isEmpty(){
        return (lastIndex== -1);
    }
        public boolean isFull(){
          return (lastIndex== cap-1);
    }
}

