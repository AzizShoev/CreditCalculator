public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int credit = 1_000_000;
        double percent = 9.99;
        int months = 12;
        int result = (int) service.calculate(credit, percent, months);

        System.out.println("Сумма кредита: " + credit);
        System.out.println("Процентная ставка: " + percent);
        System.out.println("Колличество месяцев: " + months);
        System.out.println("Ежемесячный платеж: " + result);





    }
}