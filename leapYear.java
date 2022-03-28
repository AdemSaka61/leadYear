import java.util.Scanner;


public class leapYear {
    public static void main(String[] args) {
        int year, excess;

        Scanner input = new Scanner(System.in);

        System.out.print("Yıl Giriniz :");
        year = input.nextInt();

        excess = year % 400;

        if (excess == 0) {
            System.out.print(year);
            System.out.print("\tArtık Bir Yıldır.");
        } else {
            System.out.print(year);
            System.out.print("\tArtık Bir Yıl Değildir.");
        }

    }
}
