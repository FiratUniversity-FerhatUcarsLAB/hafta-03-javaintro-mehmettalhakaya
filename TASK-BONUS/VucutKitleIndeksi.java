public class VucutKitleIndeksi {
    public static void main(String[] args) {
        double kilo = 70.0;
        double boy = 1.75;

        double bmi = kilo / (boy * boy);

        System.out.println("Kilo: " + kilo + " kg");
        System.out.println("Boy: " + boy + " m");
        System.out.println("Vücut Kitle İndeksi (BMI): " + bmi);
    }
}
