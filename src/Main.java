public class Main {

    public static void main(String[] args) {

        BmiService bmi = new BmiService();
        float resultBmi = bmi.calculate(70F, 1.80F);
        System.out.printf("Ваш Индекс массы тела: %.2f", resultBmi);
    }
}
