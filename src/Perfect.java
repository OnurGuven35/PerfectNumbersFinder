/* Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise ekrana “mükemmel sayıdır.”
değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan programı Java dilinde yazınız. */

import java.util.Scanner;

public class Perfect {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int div;
        int top = 0;

        // İlk olarak kullanıcıdan sayıyı alıyoruz.

        System.out.print("Lutfen Bir Sayi Giriniz : ");
        number = input.nextInt();

        /* Girilen sayı eksi olmasın diye bir if attıktan sonra bir i tanımlayarak girilen sayıya kadar arttırıyorum.
         Daha sonra girilen sayıyı her i sayısına bölerek tam bölünen olanları buluyorum ve tam bölen i'leri topluyorum. */

        if (number > 0) {
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    div = i;
                    top += div;
                }
            }

            // Son olarak toplam, girilen sayıya eşitse mükemmel sayı oluyor.

            if (top == number) {
                System.out.print(number + " " + "Mukemmel Bir Sayidir ! ");
            } else {
                System.out.print(number + " " + "Mukemmel Bir Sayi Degildir !");
            }
        } else {
            System.out.print("Lutfen Gecerli Bir Deger Giriniz ! ");
        }
    }
}
