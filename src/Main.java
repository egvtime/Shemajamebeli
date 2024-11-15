import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] square = {
                {1, 2, 3, 4},
                {1, 2, 3, 4},
                {1, 2, 3, 4},
                {1, 2, 3, 4},
        };
        int gamokleba = 0;
        int jami = 0;
        boolean mzadaa = false;
        for(int i = square.length-1; i >= 0; i--){
            if(i==0){
                i = square.length-1;
                jami =+ square[i][square.length-gamokleba];
            }
            if(gamokleba==((square.length)/2)){
                if (mzadaa == true){
                    System.out.println(jami);
                    break;
                }
                jami =+ i-gamokleba;
                gamokleba = 0;
                mzadaa = true;
            }
            jami =+ square[i][square.length-gamokleba];
            jami =+ square[i][square.length+gamokleba];

        }
    }
}
