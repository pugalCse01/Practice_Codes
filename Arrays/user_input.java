import java.util.*;
class user_input{
    public static void main(String[] args) {
      // Scanner for getting the user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of thr arraay");
        int N  = sc.nextInt();
      // Initialize the array
        int[] arr = new int[N];
      // use for loop for iteration.forloop used to get the user input 
       for (int i = 0; i < N;i++){
           System.out.println("Enter the " + i +"  index element");
           
           arr[i] =  sc.nextInt();
       }
       System.out.println("Created Array is : "+Arrays.toString(arr));
      // close the scanner function to prevent resource leak
       sc.close();
        
    }
}
