public class CreditPaymentService {
    public double calculate(int credit, double percent, int months) {
        double p = percent / 100 / 12;
        return credit * (p + p / (Math.pow(1 + p, months) - 1));
    }
}
