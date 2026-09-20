public class removing_duplicate_rec{
    public static boolean[] map= new boolean[26];

    public static void dup(String str, int idx,String nstr){
        char curr=str.charAt(idx);
        if(idx==str.length()-1){
            System.out.println(nstr);
            return;
        }
        if(map[curr-'a'] == true){
            dup(str,idx+1,nstr);
        }
        else{
            nstr+=curr;
            map[curr-'a'] = true;
            dup(str,idx+1,nstr);
        }
        }
    public static void main(String[] args){
    String str="abbccda";
    String nstr="";
    dup(str,0,nstr);
    }
}
