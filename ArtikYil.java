import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        System.out.println("yıl girin");
        int yil = girdi.nextInt();
        int artik = yil%4;
        int artik100 = yil%100;
        int artik400 = yil%400;

        if (artik100 != 0)
            {
                if(artik==0)
                    System.out.println(yil+" bir artık yıldır");
                else System.out.println(yil+" bir artık yıl degildir");
            }
        else
            {
                if(artik400==0)
                    System.out.println(yil+" bir artık yıldır");
                else System.out.println(yil+" bir artık yıl degildir");
            }
    }
}
