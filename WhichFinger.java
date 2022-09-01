import java.util.Scanner;
import java.util.ArrayList;

public class WhichFinger {
    static int which_finher(int l) {
        if(l <= 5) return l - 1;
        l = (l - 5) % 8;
        if(l <= 4) return 4 - l;
        return l - 4;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> fingers = new ArrayList<String>();
        fingers.add("Bolshoi palec");
        fingers.add("Ukazatelniy palec");
        fingers.add("Sredniy palec");
        fingers.add("Bezimyaniy palec");
        fingers.add("Mizinec");
        int n = scanner.nextInt();
        int result = which_finher(n);
        System.out.print(fingers.get(result));
    }
}
