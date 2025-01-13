package Collections;

public class Animal implements Comparable<Animal> {
    int age;
    String name;
    int weight;

    public Animal(int age,String name,int weight){
        this.age =age;
        this.name =name;
        this.weight =weight;
    }

    @Override
    public int compareTo(Animal o) {
        return this.age - this.age;
    }
}
