import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int mat,fiz,kim,turk,muz,ort;
        Scanner input = new Scanner(System.in);
        System.out.println("Mat Notlarınızı Giriniz : ");
        mat = input.nextInt();

        System.out.println("Fiz Notlarınızı Giriniz : ");
        fiz = input.nextInt();

        System.out.println("Kim Notlarınızı Giriniz : ");
        kim = input.nextInt();

        System.out.println("Turk Notlarınızı Giriniz : ");
        turk = input.nextInt();

        System.out.println("Muz Notlarınızı Giriniz : ");
        muz = input.nextInt();

        ort = (mat+fiz+kim+turk+muz)/5;
        System.out.println("ortalamanız : " +ort);


    }

    }
