package basicjava;
public class stack_recursion_logn{
    public static int printPow(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        if(n%2==0){
            return printPow(x,n/2)*printPow(x, n/2);
        }
        else{
            return x*printPow(x,n/2)*printPow(x,n/2);
        }
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 3;
        int result = printPow(x,n);
        System.out.println(result);

        
    }
}