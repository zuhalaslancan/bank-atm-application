import java.util.Scanner;

public class main {

    static Scanner input = new Scanner(System.in);
    static int hesaptakiPara = 0;

    public static void main(String[] args) {

        String adSoyad;

        int secenek;

        adSoyad = adSoyadıal();

        do {
            menu(adSoyad);

            secenek = secenekAl();

            secenekKontrol(secenek);
            if(secenek==4) {
                break;
            }

            menuyeDon();


        } while (secenek!=4);


    }

    public static String adSoyadıal() {
        Scanner input = new Scanner(System.in);
        String isim;
        String soyisim;
        System.out.println("Merhaba  devam etmek için bilgilerinizi giriniz");
        System.out.print("adınızı giriniz : ");
        isim = input.next();
        System.out.print("soyadınızı giriniz : ");
        soyisim = input.next();
        return isim + " " + soyisim;

    }

    public static void menu(String adSoyad) {
        System.out.println("*MENU*");
        System.out.println("Hosgeldin " + adSoyad);
        System.out.println("********************");
        System.out.println("Yapmak istediğiniz işlemi seçiniz");
        System.out.println("1-) Para Yatırma");
        System.out.println("2-) Para çekme");
        System.out.println("3-) Bakiye Sorgulama");
        System.out.println("4-) Çıkış ");
        System.out.println("********************");
        System.out.println();

    }

    public static int secenekAl() {
        System.out.println("bir seçenek giriniz");
        int seçenek = input.nextInt();
        return seçenek;


    }

    public static void secenekKontrol(int secenek) {
        if (secenek == 1) {
            paraYatir();

        } else if (secenek == 2) {
            paraCekme();

        } else if (secenek == 3) {
            bakiyeSorma();

        } else if (secenek == 4) {
            cıkıs();

        }
        else {
            System.out.println("Yanlıs bir secenek seçtiniz.Tekrar giriş yapınız.");
        }

    }

    public static void paraYatir() {


        int yatirilanPara;

        System.out.println("para yatırmayı seçtiniz.Hesaptaki miktarınız : " + hesaptakiPara);
        //Do-while döngüsünde istediğimiz konusulun içi doğru oldugu sürece döngü çalışır.kullanıcı-100 girerse

        do {
            System.out.println("yatırmak istediğiniz miktar : ");

            yatirilanPara = input.nextInt();

            System.out.println();

            if (yatirilanPara < 0) {

                System.out.println("Yanlış para girişi. Yeniden deneyiniz");

            }


        } while (yatirilanPara < 0);

        hesaptakiPara = hesaptakiPara + yatirilanPara;
        System.out.println("hesabınıza para yatırıldı. Yeni bakiyeniz " + hesaptakiPara);


    }

    public static void paraCekme() {
        int cekilenPara;
        System.out.println("Hesapta ki paranız :  " + hesaptakiPara);

        do {
            System.out.println("Çekmek istediğiniz miktarı giriniz  : ");

            cekilenPara = input.nextInt();

            if (cekilenPara > hesaptakiPara) {

                System.out.println("yetersiz bakiye");
            }


        } while (cekilenPara > hesaptakiPara);

        hesaptakiPara = hesaptakiPara - cekilenPara;
        System.out.println("Hesabınızdan " + cekilenPara + "para çekildi " + "Hesabınızda kalan para " + hesaptakiPara);


    }

    public static void bakiyeSorma() {
        System.out.println("hesabınızda ki para " + hesaptakiPara);

    }

    public static void cıkıs() {
        System.out.println("Çıkış yapılıyor...");
    }

    public static void menuyeDon() {
        System.out.println("\nMenüye yönlendiriliyorsunuz... ");
    }

}
