
public class Tower_Of_Hanoi_rec {
    public static void tower(int n, String source, String helper, String dest){
        if (n==1){
            System.out.println("Move disk 1 from "+source+" to " +dest);
            return;
        }
        tower(n-1,source,helper,dest);
        System.out.println("Move disk "+n+ " from "+source+" to "+dest);
        tower(n-1,helper,source,dest);

    }
    public static void main(String[] args){
        int n=5;
        

        tower(n,"A","B","C");

    }
    
}
