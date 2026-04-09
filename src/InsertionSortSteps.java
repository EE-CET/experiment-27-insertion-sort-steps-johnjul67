import java.util.Scanner;

public class InsertionSortSteps{
        public static void main(String args[]){
                Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                int arr[]=new int[n];
                for(int i=0;i<n;i++){
                        arr[i]=sc.nextInt();
                }
                int key=arr[n-1];
                int i=n-2;
                while(i>=0 && arr[i]>key){
                        arr[i+1]=arr[i];
                        print(n,arr);
                        i--;
                }
                arr[i+1]=key;
                print(n,arr);
        }
        public static void print(int n, int arr[]) {
                for (int i = 0; i < n; i++) {
                System.out.print(arr[i]);
                if (i < n - 1) System.out.print(" ");
                }
                System.out.println();
        }

        // TODO: Read n
        // TODO: Read the array elements

        // TODO: Implement the insertion logic:
        // 1. Store the last element (key)
        // 2. Iterate backwards from the second-to-last element
        // 3. If current element > key, shift it right and print array
        // 4. If current element <= key, insert key and print array (then break)
        // Note: Don't forget the case where key is the smallest element (index 0)
    
}
