
public class moving_rec {
    public static void move_x(String str, int idx, int count, String nstr){
        if(idx==str.length()){
            for(int i=0;i<=count;i++){
                nstr +='x';
            }
            System.out.println(nstr);
            return;
        }
    
        
       if(str.charAt(idx)=='x'){
        count++;
        move_x(str,idx+1,count,nstr);
       }
       else {
        nstr +=str.charAt(idx);
        move_x(str,idx+1,count,nstr);

       }
    
    }
    public static void main(String[] args){

        String str="axbcxxd";
        int idx=0;
        int count=0;
        String nstr="";
        move_x(str,idx,count,nstr);

    }
    
}
