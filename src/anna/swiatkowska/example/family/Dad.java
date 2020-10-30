package anna.swiatkowska.example.family;

public class Dad extends Person {

    public Dad(String name, String sex, int age) {
        super(name, sex, age);
    }

    @Override
    public String toString() {
        return "dad: " + super.toString();
    }

}
