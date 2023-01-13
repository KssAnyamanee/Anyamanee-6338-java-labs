    /*
     * this program will show you the matrix , matrix by row, matrix by column 
     * ,row backward, column backward, top-left to bottom-right, top=right to bottom-left;
     * row zigzag 
     * 
     * Author: Anyamanee Somsuk
     * ID: 653040633-8
     * sec: 1
     * Date: 27/12/2022
     */

package somsuk.anyamanee.lab4;
import java.util.Scanner;

public class DisplayMatrix {
    static int[][] matrix;
    static int rowDim, colDim;
    static Scanner sc = new Scanner(System.in);
    public static void inputMetrix(){
        System.out.print("Enter the size of the matrix (number of rows then number of columns) : ");
        int rowDim = sc.nextInt();
        int colDim = sc.nextInt();
        matrix= new int [rowDim][colDim];
        for(rowDim = 0; rowDim<matrix.length; rowDim++){
            for(colDim = 0; colDim<matrix[rowDim].length; colDim++){
                System.out.print("Enter element at row " + rowDim + " column " + colDim + " : ");
                matrix[rowDim][colDim]=sc.nextInt(); 
            }
        }
    }
    public static void showMatrix(){
        for(rowDim=0; rowDim<matrix.length; rowDim++){
            for(colDim=0; colDim<matrix[rowDim].length; colDim++){
                System.out.print(matrix[rowDim][colDim] + " ");
            }
            System.out.println();
        }
    }
    public static void showMatrixByRow(){
        System.out.print("show the matrix by row : " );
        for(rowDim=0; rowDim<matrix.length; rowDim++){
            for(colDim=0; colDim<matrix[rowDim].length; colDim++){
                System.out.print(matrix[rowDim][colDim] + " ");
            }
       }
    }
    public static void showMatrixByColumn(){
        System.out.println();
        System.out.print("show the matrix by column : ");
        for(int i=0; i<colDim; i++){
            for(int j=0; j<rowDim; j++){
                System.out.print(matrix[j][i] + " ");
            }
           }
    }
    public static void showMatrixByRowBackward(){
        System.out.println();
        System.out.print("show the matrix by row backward : " );
        for(int i = rowDim-1; i>=0; i--){
            for(int j = colDim-1; j>=0; j--){
                System.out.print(matrix[i][j] + " ");
            }
       }
    }
    public static void showMatrixByColumnBackward(){
        System.out.println();
        System.out.print("show the matrix by column backward : ");
        for(int i=colDim-1; i>=0; i--){
            for(int j=rowDim-1; j>=0; j--){
                System.out.print(matrix[j][i] + " ");
            }
           }
    }
    public static void showMatrixByDiagonalTopleftBottomRight(){
        System.out.println();
        System.out.print("show the diagonal elements of the matrix from top-left to bottom-right : ");
        if(rowDim==colDim ){
            for(int i=0; i<matrix.length; i++){
                    System.out.print(matrix[i][i] + " ");   
           }
        }else if(rowDim>colDim){
            for(int j=0; j<colDim; j++){
                System.out.print(matrix[j][j] + " ");
            }
        }else if(rowDim<colDim){
            for(int i=0; i<rowDim; i++){
                System.out.print(matrix[i][i] + " ");   

        }

        }
    }
    public static void showMatrixByDiagonalTopRightBottomLeft(){
        System.out.println();
        if(rowDim==colDim || rowDim<colDim){
            System.out.print("show the diagonal elements of the matrix from top-right to bottom-left : ");
            for(int i=0; i<matrix.length; i++){
                    System.out.print(matrix[i][colDim-1-i] + " ");   
            }    
        }else if(rowDim>colDim){
            System.out.print("show the diagonal elements of the matrix from top-right to bottom-left : ");
            for(int i=0; i<colDim; i++){
                    System.out.print(matrix[i][colDim - 1 - i] + " ");   
            }    
        }
    }
    public static void showMatrixByRowZigzag(){
        System.out.println();
        System.out.print("show the matrix by row zigzag : ");
        if(rowDim==colDim){
        for(int i =0; i<matrix.length; i++){
            while(true){
            if(i % 2 != 0 ){
                for(int j = matrix.length-1  ; j>= 0; j--){
                    System.out.print(matrix[i][j] + " ");
                    
                }
            }else{
                for(int j =0; j<matrix.length ; j++ ){
                    System.out.print(matrix[i][j] + " ");
                   
                }
            }
            break;
        }
    }
}else {
    for(int i =0; i<matrix.length; i++){
        while(true){
        if(i % 2 != 0 ){
            for(int j = matrix.length  ; j>= 0; j--){
                System.out.print(matrix[i][j] + " ");
                
            }
        }else{
            for(int j =0; j<matrix.length+1 ; j++ ){
                System.out.print(matrix[i][j] + " ");
               
            }
            }break;
        }   

    }
        
    }
}
public static void main(String[] args) {
    inputMetrix();
    showMatrix();
    showMatrixByRow();
    showMatrixByColumn();
    showMatrixByRowBackward();
    showMatrixByColumnBackward();
    showMatrixByDiagonalTopleftBottomRight();
    showMatrixByDiagonalTopRightBottomLeft();
    showMatrixByRowZigzag();
    sc.close();
}

}
