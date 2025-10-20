public class ParaBozma {
    public static void main(String[] args) {
        int toplam = 278;
        int yuzluk = toplam / 100;
        toplam = toplam % 100;
        int ellilik = toplam / 50;
        toplam = toplam % 50;
        int yirmilik = toplam / 20;
        toplam = toplam % 20;
        int onluk = toplam / 10;
        toplam = toplam % 10;
        int beslik = toplam / 5;
        toplam = toplam % 5;
        int ikilik = toplam / 2;
        toplam = toplam % 2;
        int birlik = toplam;

        System.out.println(toplam + " TL = " + yuzluk + "x100, " + ellilik + "x50, " + yirmilik + "x20, " + onluk + "x10, " + beslik + "x5, " + ikilik + "x2, " + birlik + "x1");
    }
}
