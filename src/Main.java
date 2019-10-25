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
/*import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 3 names: ");
        String [] names = new String[3];
        for (int i = 0; i < 3; i++) {
            names[i] = scan.nextLine();
        }
        System.out.println(Arrays.toString(names));
    }
}

 */

import java.util.Arrays;

/*public class Main {
    public static void main(String[] args) {
        int [] numbers = new int[]{12,5,9,0,2,1,8,5,4};
        for (int i = 5; i < 8; i++) {
            System.out.println(numbers[i]);
        }
    }
}

 */
/*public class Main {
    public static void main(String[] args) {
        int [] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = numbers.length-1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}

 */
/*public class Main {
    public static void main(String[] args) {
        String [] letters = new String[]{"w","t","y","h","k"};
        for (char i = 0; i < 5; i++) {
            if (letters[i] == "t"){
                letters[i] = "hello";
            }
            }
        System.out.println(Arrays.toString(letters));
        }
    }

 */
public class Main {
    public static void main(String[] args) {
        int [] numbers = new int[]{1,7,6,5,9};
        int [] numbers2 = new int[]{2,7,6,3,4};
        for (int i = 0; i < 4; i++) {
            if (numbers[i] == numbers2[i]){
                System.out.println(numbers[i]);
            }
        }
    }
}
