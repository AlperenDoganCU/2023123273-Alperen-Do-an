import java.util.Scanner;

//1. odev
public class main {
    //metot olarak cagirmamin sebebi butun yerlerde tek tek tanimlamamak icin
    //siralama islemi Maratoncular classinin icinde diziye klenip o sekilde islem yapiliyor
    //Arraylistle yapamadim sonra odevin de diziyle yap dedigini gorunce degistirmedim
    public static Scanner scanner = new Scanner(System.in);
    public static Maratoncular maratoncular = new Maratoncular();
    public static void islemleriBastir(){
        System.out.println("**************************************");
        System.out.println("islemler:");
        System.out.println("0.islemleri bastir");
        System.out.println("1.maratoncu bastir (kayit siralamasi)");
        System.out.println("2.maratoncu siralama bastir");
        System.out.println("3.maratoncu sinifi bastir");
        System.out.println("4.maratoncu ilk 3 bastir");
        System.out.println("5.maratoncu ekleme");
        System.out.println("6.maratoncu silme");
        System.out.println("7.cikis");
        System.out.println("**************************************");
    }
    //maratoncuyu ekledikten ve sildikten sonra guncel siralamaci olusturuyor

    public static void MaratoncuİlkÜc(){
        for (int i = 0; i <3 ; i++) {
            switch (i+1){
                case 1:
                    System.out.println("Birinci: " +maratoncular.maratoncuSiralamaİlkUcİsm()[i]+"\t"+maratoncular.maratoncuSiralamaİlkUcDer()[i]);
                    break;
                case 2:
                    System.out.println("İkinci: " +maratoncular.maratoncuSiralamaİlkUcİsm()[i]+"\t"+maratoncular.maratoncuSiralamaİlkUcDer()[i]);
                    break;
                case 3:
                    System.out.println("Ucuncu: " +maratoncular.maratoncuSiralamaİlkUcİsm()[i]+"\t"+maratoncular.maratoncuSiralamaİlkUcDer()[i]);
                    break;
            }
        }
    }
    public static void MaratoncuSinif(){
        System.out.println("siniflar: ");
        System.out.println("S: 200 ve altinda yapanlar");
        System.out.println("A: 200-299 dereceliler");
        System.out.println("B: 300-399 dereceliler");
        System.out.println("C: 400 ve uzerindekiler");
        String[] sinifIsim = {"S","A","B","C"};
        int[] siniflar = {0,0,0,0};
        for (int i = 0; i <maratoncular.maratoncuDereceDizi().length ; i++) {
            if(maratoncular.maratoncuDereceDizi()[i]<200){
                siniflar[0]+=1;
            } else if (maratoncular.maratoncuDereceDizi()[i]>200 && maratoncular.maratoncuDereceDizi()[i]<300) {
                siniflar[1]+=1;
            } else if (maratoncular.maratoncuDereceDizi()[i]>300 && maratoncular.maratoncuDereceDizi()[i]<400) {
                siniflar[2]+=1;
            }else {
                siniflar[3]+=1;
            }
        }
        for (int i = 0; i <4 ; i++) {
            System.out.println(sinifIsim[i]+" : "+siniflar[i]);
        }
    }


    public static void MaratoncuEkle(String isim,int derece){
        maratoncular.maratoncuEkleme(isim,derece);
        maratoncular.maratoncuSiralama();
    }
    public static void MaratoncuSil(int kayitliSira){
        maratoncular.maratoncuSilme(kayitliSira);
        maratoncular.maratoncuSiralama();
    }
    public static void main(String[] args) {
        maratoncular.maratoncuEkleme("Kadir", 341);
        maratoncular.maratoncuEkleme("Gokhan",273);
        maratoncular.maratoncuEkleme("Hakan",278);
        maratoncular.maratoncuEkleme("Suzan",329);
        maratoncular.maratoncuEkleme("Pinar",445);
        maratoncular.maratoncuEkleme("Mehmet",402);
        maratoncular.maratoncuEkleme("Ali",388);
        maratoncular.maratoncuEkleme("Emel",270);
        maratoncular.maratoncuEkleme("Firat",243);
        maratoncular.maratoncuEkleme("James",334);
        maratoncular.maratoncuEkleme("Jale",412);
        maratoncular.maratoncuEkleme("Ersin",393);
        maratoncular.maratoncuEkleme("Deniz",299);
        maratoncular.maratoncuEkleme("Gozde",343);
        maratoncular.maratoncuEkleme("Anil",317);
        maratoncular.maratoncuEkleme("Burak",265);
        maratoncular.maratoncuSiralama();
        boolean dongu=true;
        System.out.println("**************************************");
        System.out.println("uygulamaya hosgeldiniz");
        //bilerek siralama ara diye islem koymadim sacma olurdu die
        //ekleme ve cikarma islemlerini koyma sebebim:
        // ekleyip cikarilsa bile degismeyecegini gostermek.
        System.out.println("Not:1. ve 2. islemler guncel degilse 3. ve 4. islemleri kullanarak guncelleyin");
        System.out.println("(sistemin duzgun calistigi gormek icin maratıoncu ekleyip cikarabilirsiniz)");
        System.out.println("islemler:");
        System.out.println("0.islemleri bastir");
        System.out.println("1.maratoncu bastir (kayit siralamasi)");
        System.out.println("2.maratoncu siralama bastir");
        System.out.println("3.maratoncu sinifi bastir");
        System.out.println("4.maratoncu ilk 3 bastir");
        System.out.println("5.maratoncu ekleme");
        System.out.println("6.maratoncu silme");
        System.out.println("7.cikis");
        System.out.println("**************************************");
        System.out.print("lutfen bir islem seciniz:");
        int islem = scanner.nextInt();
        scanner.nextLine();
        boolean dongu2=true;
        while (dongu){
            while(dongu2){
                if(-1<islem && islem<8){
                    dongu2=false;
                }else {
                    System.out.print("lutfen 0 ve 8 arasinda bir islem seciniz:");
                    islem = scanner.nextInt();
                }
            }
            switch (islem){
                case 0:
                    islemleriBastir();
                    System.out.print("lutfen baska bir islem giriniz:");
                    islem=scanner.nextInt();
                    scanner.nextLine();
                    break;
                case 1:
                    maratoncular.maratoncuBastir();
                    System.out.print("lutfen baska bir islem giriniz:");
                    islem=scanner.nextInt();
                    scanner.nextLine();
                    break;
                case 2:
                    maratoncular.maratoncuSiralamaBastir();
                    System.out.print("lutfen baska bir islem giriniz:");
                    islem=scanner.nextInt();
                    scanner.nextLine();
                    break;
                case 3:
                    MaratoncuSinif();
                    System.out.print("lutfen baska bir islem giriniz:");
                    islem=scanner.nextInt();
                    scanner.nextLine();
                    break;
                case 4:
                    MaratoncuİlkÜc();
                    System.out.print("lutfen baska bir islem giriniz:");
                    islem=scanner.nextInt();
                    scanner.nextLine();
                    break;
                case 5:
                    System.out.print("lutfen maratoncunun ismini giriniz: ");
                    String isim =scanner.nextLine();
                    System.out.print("lutfen maratoncunun dereces,n, giriniz: ");
                    int derce= scanner.nextInt();
                    MaratoncuEkle(isim,derce);
                    System.out.print("lutfen baska bir islem giriniz:");
                    islem=scanner.nextInt();
                    scanner.nextLine();
                    break;
                case 6:
                    System.out.println("lutfen silmek istediginiz maratoncunun kayit sirasini giriniz: ");
                    int maratoncuKonum = scanner.nextInt();
                    MaratoncuSil(maratoncuKonum);
                    System.out.print("lutfen baska bir islem giriniz:");
                    islem=scanner.nextInt();
                    scanner.nextLine();
                    break;
                case 7:
                    System.out.println("cikis yapiliyor...");
                    dongu=false;
                    break;
            }
        }
    }
}
