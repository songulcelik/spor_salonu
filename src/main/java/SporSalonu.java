import java.util.Scanner;

    public class SporSalonu {
        /*
        spor kursu icin secilecek ogrencileri belirleyen bir program yaziniz
        kurs gereklilikleri:
        erkekler--> bou :1.60 ve ustu
                    kilo: 70-90 kg
        kizlar--> boy: 1.50 ve ustu
                  kilo:50-70 kg

        kullanicidan ogrenci sayisi ve herbir ogrenci icin isim cinsiyet kilo boy bilgilerini girmesini isteyiniz.
         */
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Listeye toplam kac ogrenci kaydi gireceksiniz:  ");
            int ogrenciSayisi = input.nextInt();
            String isim[] = new String[ogrenciSayisi];
            String cinsiyet[] = new String[ogrenciSayisi];
            double boy[] = new double[ogrenciSayisi];
            double kilo[] = new double[ogrenciSayisi];
            boolean basariliMi = true;
            do {

                basariliMi = true;
                for (int i = 0; i < ogrenciSayisi; i++) {
                    input.nextLine();
                    System.out.println("isim: ");
                    isim[i] = input.nextLine();
                    System.out.println("cinsiyet: ");
                    String cins = input.next().substring(0, 1).toUpperCase();
                    if (cins.equals("K") || cins.equals("E")) {
                        cinsiyet[i] = cins;
                    } else {
                        System.out.println("Hatali giris yaptinizz!" +
                                "\n  Kiz icin--> K  Erkek icin--> E giriniz");
                        basariliMi = false;
                        break;
                    }
                    System.out.println("boy: ");
                    boy[i] = input.nextDouble();
                    System.out.println("kilo: ");
                    kilo[i] = input.nextDouble();
                }
            } while (!basariliMi);
            System.out.println("==========Kayit Yaptirabilecek Ogrenciler=================");
            int counter = 0;
            for (int i = 0; i < ogrenciSayisi; i++) {
                if (cinsiyet[i].equals("K") && boy[i] >= 1.50 && kilo[i] >= 50 && kilo[i] < 70) {
                    System.out.println("isim: " + isim[i] + " cinsiyet: " + cinsiyet[i] + " boy: " + boy[i] + " kilo: " + kilo[i]);
                    counter++;
                } else if (cinsiyet[i].equals("E") && boy[i] >= 1.60 && kilo[i] >= 70 && kilo[i] < 90) {
                    System.out.println("isim: " + isim[i] + " cinsiyet: " + cinsiyet[i] + " boy: " + boy[i] + " kilo: " + kilo[i]);
                    counter++;
                }

            }  System.out.println("Kayit basariyla yapilmistir");
            if (counter == 0) {
                System.out.println("Kayit kriterlerinde ogrenci bulunamamistir.");
            }

        }

    }
