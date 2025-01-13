package Generics;

public class Coll {
    public static void main(String[] args) {

            Dog<String> d1 = new Dog("Bhup1234");
            Dog<Integer> d2 = new Dog(158);
    }
}

 class Dog<E>{
    E id;

    public Dog(E id){
        this.id =id;


    }
        }