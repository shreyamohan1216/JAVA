package arrays;

public class E3 {
    public static void main(String[] args) {
        //Types
        int[]arr={1,2,3,4,5};
        //2D Array-> Array of arrays-Matrix
        int[][]matrix={{1,2,3},//Row 0
                       {4,5,6},//Row 1
                       {7,8,9}};//Row 2[3x3 matrix/Square matrix]
        // Array of arrays-here it is 3 subarrays//length is also 3
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
        //Jagged Array
        //In a 2D array if the row length is not same
        int[][]jagged={
                {1,2,3,4,5},
                {1,2,3},
                {1,2}
        };
        System.out.println(jagged[0].length);
        System.out.println(jagged[1].length);
        System.out.println(jagged[2].length);
        //array.length=rows array[row].length=cols
        //Method 1
        for(int r=0;r< jagged.length;r++){
            for(int c=0;c< jagged[r].length;c++){
                System.out.print(jagged[r][c]+" ");
            }
            System.out.println();
        }
        //Method 2
        for(int[] a:jagged){
            for(int x:a){//inside main array(a) we read individual vales(a)
                System.out.print(x+" ");
            }
            System.out.println();
        }
        char[][]names={
                {'S','U','R','A','B','H','I'},
                {'S','I','R','I'},
                {'S','U','S','H','M','A'}
        };
        for (char[] c:names){
            for(char x:c){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
