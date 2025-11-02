public class Task2 {
    public static void main(String[] args) {
        double originalPrice = 250.00;
        double discountRate = 0.15;

        double finalPrice = originalPrice * (1.0 - discountRate);
        
        System.out.println("Final Price:" + finalPrice);
    }
}