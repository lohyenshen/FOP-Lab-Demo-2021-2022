package L8.Q3;

public class Test_Q3 {
    public static void main(String[] args) {
        WeightCalculator p = new WeightCalculator();

        p.setAge(20);
        p.setHeight(170);
        p.calculateRecommendWeight();
        System.out.println(p);
    }
}
