public class Dimension {
    public static void main(String[] args) {
int B[][]={{1,2},{3,4},{2,9,9,0},{5,5,5,3,32,9}};
int C[][]={{2,6,7,9},{3,8,0,9},{23,4,5,3,2}};
    System.out.println("The elements of Array B is:");
outputB(B);
System.out.println("The elements of Array C is:");
outputC(C);
    }
public static void  outputB(int [][]B){
    for(int row=0;row<B.length;row++){
        for(int column=0;column<B[row].length;column++)
            System.out.printf("%d ",B[row][column]);
        System.out.println();
        }

}
public static void outputC(int [][]C){
    for(int row=0;row<C.length;row++){
        for(int column=0;column<C[row].length;column++)
            System.out.printf("%d ",C[row][column]);
        System.out.println();
    }
    
}
}







        