package task1;

public class Orange extends Fruit {

    private final float weight = 1.5f;

    public Orange() {
    }

    @Override
    public float getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Orange{" +
                "weight=" + weight +
                '}';
    }
}
