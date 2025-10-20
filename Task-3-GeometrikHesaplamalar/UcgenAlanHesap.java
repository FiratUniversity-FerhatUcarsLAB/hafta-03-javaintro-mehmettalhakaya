public class UcgenAlanHesap {
    public static void main(String[] args) {
        double a = 3, b = 4, c = 5;

        double s = (a + b + c) / 2;
        double A = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        
        System.out.println("Alan: " + A);
    }
}
