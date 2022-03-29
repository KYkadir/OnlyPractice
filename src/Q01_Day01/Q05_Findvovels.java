package Q01_Day01;

import java.util.Arrays;
import java.util.Scanner;

public class Q05_Findvovels {
    public static void main(String[] args) {
        /*find the vovels in a string by using arrays
         print them on the console
            a e i o u
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen Bir metin giriniz");
        String kullaniciGirisi=scan.nextLine();
        String arr[]=kullaniciGirisi.split("");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length ; i++) {
            if(
             arr[i].equalsIgnoreCase("a") ||
             arr[i].equalsIgnoreCase("e") ||
             arr[i].equalsIgnoreCase("i") ||
             arr[i].equalsIgnoreCase("o") ||
             arr[i].equalsIgnoreCase("u") )
            {
                System.out.print(arr[i]);
            }

        }



    }
}
