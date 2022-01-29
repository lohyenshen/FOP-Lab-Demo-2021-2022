package L8.Q3;

public class WeightCalculator {
    private int age, height;
    private double recommendWeight;


    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void calculateRecommendWeight() {
        recommendWeight = (height-100+age/10) * 0.9;
    }

    @Override
    public String toString() {
        return String.format("Age = %d\nHeight = %d\nRecommended Weight = %.2f\n", age, height, recommendWeight);
    }
}
