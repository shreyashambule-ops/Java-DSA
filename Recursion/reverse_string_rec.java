
public class reverse_string_rec {
    public static void reverse(String a,int n){
        if(n==0){
            System.out.print(a.charAt(n));
            return;
        }
        System.out.print(a.charAt(n));
        
        reverse(a,n-1);
    }
    public static void main(String[] args){
        String i ="Shreyash";
        int n =i.length();
        reverse(i,n-1);

    }
    
}
