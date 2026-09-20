
public class backtracking_1 {
    public static void permutations(String str, String perm, int idx){
        if(str.length() ==0)
            {System.out.println(perm);
                return;
        }
        for (int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String nstr= str.substring(0,i) + str.substring(i+1);
            permutations(nstr,perm+curr,idx+2);
    }
        }
    public static void main(String[] args){
        String str="ABC";
        permutations(str, "", 0);
    }
    
}
