package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnComparableAndComparator {
    public static void main(String[] args) {
        Animal a1 =new Animal(4,"Leo",10);
        Animal a2 =new Animal(2,"Puuppy",10);
        Animal a3 =new Animal(8,"Tommy",20);


        List<Animal> dogs = new ArrayList<>();
        dogs.add(a1);
        dogs.add(a2);
        dogs.add(a3);

        System.out.println(dogs);

        Collections.sort(dogs);
        Collections.max(dogs);

    }
}
