public class subsequences_rec {
    public static void sub(String str, int idx, String nstr){

    if(idx==str.length()){
        System.out.println(nstr);
        return;
    }
    char curr = str.charAt(idx);
     
    // to be
    sub(str, idx+1,nstr+curr);
    
    //not to be
    sub(str,idx+1,nstr);



    }
    public static void main (String[] args){
        String str="abc";
        sub(str,0,"");

    }
}
