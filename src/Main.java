import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int n,r,total= 1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Eleman Sayısını Giriniz : ");
        n = sc.nextInt();
        System.out.print("Kaç Nesneli Eleman olsun : ");
        r = sc.nextInt();

        for(int i = 1; i <= n ; i++) {
            total *= i;
        }
        int nFac = total;

        total= 1;
        for(int i = 1; i <= r ; i++){
            total *= i;
        }
        int rFac = total;

        total = 1;
        for(int i = 1; i<=n - r ; i++ ){
            total *= i;
        }
        int n_rFac = total;

        int kombinasyon = nFac / (rFac * n_rFac);

        System.out.print("Kombinasyon = " + kombinasyon);



    }

}
