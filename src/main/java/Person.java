public class Person {
    private Value value;

    public Person(Value value) {
        this.value = value;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Person{" +
                "value=" + value +
                '}';
    }
}
