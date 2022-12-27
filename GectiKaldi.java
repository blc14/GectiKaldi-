import java.util.Scanner;
public class GectiKaldi {
    public static void main(String[] args) {
        int mat, fizik, kimya, biyoloji , geo;
                Scanner input = new Scanner(System.in);
        System.out.println("Mat notunuzu giriniz:  ");
        mat= input.nextInt();

        System.out.println("Fizik notunuzu giriniz:  ");
        fizik = input.nextInt();

        System.out.println("biyoloji notunuzu giriniz:  ");
        biyoloji= input.nextInt();

        System.out.println("Kimya notunuzu giriniz:  ");
        kimya= input.nextInt();

        System.out.println("Geometri notunuzu giriniz:  ");
        geo= input.nextInt();

        double ortalama = (mat+fizik+biyoloji+kimya+geo) / 5 ;
        System.out.println("Ortalamanız: "+ortalama);
        if(ortalama <50)
            System.out.println("Kaldınız");
        else
            System.out.println("Geçtiniz");
    }
}
