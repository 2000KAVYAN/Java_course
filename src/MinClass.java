
import java.util.Scanner;

public class MinClass {

        public static int readInteger(){
            Scanner sc = new Scanner(System.in);
            System.out.print("how many elements the user needs to enter:");
            int element = sc.nextInt();
            return element;
        }
        public static int[] readElements(int n){



            Scanner sc = new Scanner(System.in);
            System.out.print("how many elements the user needs to enter:");
            n=sc.nextInt();
            int [] arr = new int[n];
            for (int i = 0; i <n; i++) {
                int a = sc.nextInt();
                arr[i] =a;
            }
            for (int i = 0; i <n; i++) {
                System.out.print(arr[i]);
            }
            return arr;
        }
        public static int findMin(int [] arr){
//            int arr1[] = {1,2,3};
            int min = arr[0];
            for (int i = 0; i < arr.length ; i++) {
                if(arr[i] < min){
                    min = arr[i];
                }
            }
            return min;
        }
    }



