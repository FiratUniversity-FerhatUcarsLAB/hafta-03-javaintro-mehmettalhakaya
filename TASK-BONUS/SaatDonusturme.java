public class SaatDonusturme {
    public static void main(String[] args) {
        int toplamSaniye = 3665;

        int saat = toplamSaniye / 3600;
        int dakika = (toplamSaniye % 3600) / 60;
        int saniye = toplamSaniye % 60;

        String sonuc = String.format("%d:%02d:%02d", saat, dakika, saniye);

        System.out.println(toplamSaniye + " saniye = " + sonuc);
    }
}
