package anna.swiatkowska.example.family;

import java.util.List;

public class Mom extends Person {

    public Mom(String name, String sex, int age) {
        super(name, sex, age);
    }

    private List<Child> children;

    public void addChild(String name, String sex, int age) {
        Child child = new Child(name, sex, age);
    }

    public List<Child> getChildren() {
        return children;
    }

    @Override
    public String toString() {
        return super.toString() + "Children: " + children.size(); }
}
