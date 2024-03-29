import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(in.nextLine());
        }
        String str = "";
        for (String s : list) {
            str = str.concat(s);
        }
        long max = 0;
        int index = 0;
        for (int i = 0; i < 988; i++) {
            long sum = 1;
            for (int j = 0; j < 13; j++) {
                sum *= Character.getNumericValue(str.charAt(i + j));
                if (sum == 0) {
                    break;
                }
                if (sum > max) {
                    max = sum;
                    index = i;
                }
            }
        }
        long total = 1;
        for (int i = 0; i < 13; i++) {
            total *= Character.getNumericValue(str.charAt(index + i));
        }
        System.out.println(total);
    }
}
