import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;



public class Test {
	static int count = 0;
    public static void main(String[] args) {  
    	long start = System.currentTimeMillis();
    	int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12};
    	f(arr,arr.length,0);
    	System.out.println(count);
    	System.out.println("use:"+(System.currentTimeMillis() - start));
    }  
    public static void f(int[] arr, int n,  int k){  
       if(k == n){
    	   count++;
//    	   for(int m:arr){
//    		   System.out.print(m+" ");
//    	   }
//    	   System.out.println();
       }
       for(int i = k; i < n; i++){
    	   swap(arr,i,k);
    	   f(arr,n,k+1);
    	   swap(arr,i,k);
       }
    }  
  
    public static void swap(int[] arr, int i, int j){
    	int t = arr[i];
    	arr[i] = arr[j];
    	arr[j] = t;
    }
}
