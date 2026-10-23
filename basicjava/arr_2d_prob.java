package basicjava;

public class arr_2d_prob {
    public static void main(String[] args){
        int[][] arr={{1,5,7,9,10,11},{6,10,12,13,20,21},{9,25,29,30,32,41},{15,55,59,63,68,70},{40,70,79,81,95,105}};
    

    int rowStart=0;
    int rowEnd=4;
    int colStart=0;
    int colEnd=5;

    while(rowStart<=rowEnd && colStart <=colEnd){
        for(int col=colStart;col<=colEnd;col++){
            System.out.println(arr[rowStart][col]+ " ");
        }

        rowStart++;

        for(int row =rowStart;row<rowEnd;row++){
            System.out.println(arr[row][colEnd]+ " ");
        }

        colEnd--;


        for(int col=colEnd; col>=colStart; col--) {
            System.out.print(arr[rowEnd][col] + " ");
        }
        rowEnd--;

        for(int row =rowEnd;row>rowStart;row--){
            System.out.println(arr[row][colStart] + " ");
        }


        colStart++;

        System.out.println();

    }


}
}