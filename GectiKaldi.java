import java.util.Scanner;
public class GectiKaldi {
    public static void main(String[] args) {
        int mat, fizik, kimya, biyoloji , geo, total=0 , n=0;
                Scanner input = new Scanner(System.in);
        System.out.println("Mat notunuzu giriniz:  ");
        mat= input.nextInt();
        if(mat<100 && mat>0) {
            total=total+mat;
            n=n+1;
        }


        System.out.println("Fizik notunuzu giriniz:  ");
        fizik = input.nextInt();
        if(fizik<100 && fizik>0) {
            total=total+fizik;
            n=n+1;
        }


        System.out.println("biyoloji notunuzu giriniz:  ");
        biyoloji= input.nextInt();
        if(biyoloji<100 && biyoloji>0) {
            total=total+biyoloji;
            n=n+1;
        }



        System.out.println("Kimya notunuzu giriniz:  ");
        kimya= input.nextInt();
        if(kimya<100 && kimya>0) {
            total=total+kimya;
            n=n+1;
        }

        System.out.println("Geometri notunuzu giriniz:  ");
        geo= input.nextInt();
        if(geo<100 && geo>0) {
            total=total+geo;
            n=n+1;
        }
        double ortalama = total/n ;
        System.out.println("Ortalamanız: "+ortalama);
        if(ortalama <55)
            System.out.println("Kaldınız");
        else
            System.out.println("Geçtiniz");
    }
}
