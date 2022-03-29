package Q01_Day01;

public class Q02_Practice {
    public static void main(String[] args) {
        String str="CODER";
        for (int i = 0; i <str.length() ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print(str.charAt(i)+" ");
                
            }
            System.out.println();
        }
    }
}
