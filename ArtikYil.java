import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        System.out.println("yıl girin");
        int yil = girdi.nextInt();
        int artik = yil%4;

        if (artik == 0)
            {
                System.out.println(yil+" bir artık yıldır");
            }
        else
            {
                System.out.println(yil+" bir artık yıl degildir");
            }
    }
}
