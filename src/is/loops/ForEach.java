package is.loops;

public class ForEach {
        public static void main(String[] args) {
            char[][] names = {{'d','e','e', 'p','t', 'i'},
                    {'p','r', 'a','n', 'a', 'v'},
                    {'s', 'a','n', 'd', 'h','y'}};
            int[][] nums={{'1','2','3','4','5'},
                         {'2','3','4','5'},
                         {'8'}};
            for(int r=0; r<names.length;r++){
                for(int c=0; c<6;c++)
                {
                    System.out.print(names[r] [c]);
                }
                System.out.println();

            }

        }

    }
