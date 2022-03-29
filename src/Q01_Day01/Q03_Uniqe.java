package Q01_Day01;

import java.util.Scanner;

public class Q03_Uniqe {
    public static void main(String[] args) {
        /*bir stringdeki Unique karakterleri yazdirin*/
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir kelime yaziniz");
        String str=scan.next();
        for (int i = 0; i <str.length() ; i++) {
            if (str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))){
                System.out.print(str.charAt(i));
            }

        }




    }
}
