package anna.swiatkowska.example.family;

import java.util.ArrayList;
import java.util.List;

public class Mom extends Person {

    public Mom(String name, String sex, int age) {
        super(name, sex, age);
    }

    private List<Child> children = new ArrayList<>();

    public void addChild(String name, String sex, int age) {
        Child child = new Child(name, sex, age);
        children.add(child);
    }

    public List<Child> getChildren() {
        return children;
    }

    @Override
    public String toString() {
        return ("mom: " + super.toString() + " children: " + children.size());
    }

}
