import java.util.Scanner;
import java.util.ArrayList;
class SquareOrSquareRoot {
    static ArrayList squareOrSquareRoot(ArrayList<Integer> arr) {
        for(int i = 0; i < arr.size(); i++) {
            int m = arr.get(i);
            int change = m * m;
            for(int j = 1; j * j <= m; j++) {
                if(j * j == m){
                    change = j;
                }
            }
            arr.set(i, change);
        }
        return arr;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        int n;
        while( (n = scanner.nextInt() ) > 0 ) {
            arr.add(n);
        }
        ArrayList<Integer> newArr = squareOrSquareRoot(arr);
        for(int x : newArr) {
            System.out.print(x + " ");
        }
    }
}