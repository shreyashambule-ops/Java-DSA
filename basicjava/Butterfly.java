package basicjava;
public class Butterfly{
    public static void main(String[] args){
        int a=5; //size    
        for (int i=1;i<=a;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            } 
            int sp=2*(a-i);
            for( int k=1;k<=sp;k++){
                    System.out.print(" ");
                }
           for (int j=1;j<=i;j++){
                System.out.print("*");
            } 
            System.out.println();

    }
    for (int i=a;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            } 
            int sp=2*(a-i);
            for( int k=1;k<=sp;k++){
                    System.out.print(" ");
                }
           for (int j=1;j<=i;j++){
                System.out.print("*");
            } 
            System.out.println();

    }
    
}
}