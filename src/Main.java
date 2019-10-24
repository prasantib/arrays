/*public class Main {
    public static void main(String[] args) {
        int [] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int sum = 0;
            for (int num : numbers) {
                sum = sum + num;
            }
            System.out.println(sum);
            }
        }

 */
/*import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] numbers = new int[10];
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            numbers[i] = scan.nextInt();
        }
        for (int num : numbers) {
            sum = sum + num;
        }
        System.out.println(sum);
    }
}

 */
/*import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] numbers = new int[10];
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < 10; i++) {
            numbers[i] = scan.nextInt();
        }
        for (int num : numbers) {
            sum = sum + num;
            avg = sum / 10;
        }
        System.out.println(avg);
    }
}

 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] names = new String[4];
        for (int i = 0; i < 4; i++) {
            names[i] = scan.nextLine();
        }
        System.out.println(names);
    }
}