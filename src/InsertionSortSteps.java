import java.util.Scanner;
public class InsertionSortSteps 
{
        static void print(int[] arr)
        {
                for (int i=0;i<arr.length;i++)
                        System.out.print(arr[i] + " ");
                System.out.println();
        }
        public static void main(String[] args)
        {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int arr[] = new int[n];
                for (int i=0;i<n;i++)
                        arr[i]=sc.nextInt();
                int key = arr[n - 1];
                int i = n - 2;
                while (i>=0&&arr[i]>key)
                {
                        arr[i+1]=arr[i];
                        print(arr);
                        i--;
                }
                arr[i+1]=key;
                print(arr);
        }

}
