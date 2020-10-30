package anna.swiatkowska.example;

import anna.swiatkowska.example.family.Dad;
import anna.swiatkowska.example.family.Mom;

public class Main {

    public static void main(String[] args) {

        Dad dad = new Dad("Jake", "male", 31);
        Mom mom = new Mom("Amy", "female", 28);

        mom.addChild("Gina", "female", 12);
        mom.addChild("Boyle", "male", 14);

        System.out.println(dad.toString());
        System.out.println(mom.toString());
    }

}
