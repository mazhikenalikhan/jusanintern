import java.util.Scanner;
import java.util.ArrayList;
class DontGiveMeFive {
    static int dont_give_me_five(int l, int r) {
        int fives = 0;
        for(int i = l; i <= r; i++) {
            int j = i;
            while(j > 0) {
                if (j % 10 == 5) {
                    fives++;
                    break;
                }
                j /= 10;
            }
        }
        return r - l + 1 - fives;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt(), r = scanner.nextInt();
        int result = dont_give_me_five(l, r);
        System.out.print("Result " + result);
    }
}