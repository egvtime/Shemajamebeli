import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] square = {
                {7, 4, 1,},
                {8, 5, 2,},
                {9, 6, 3,},
        };
        int dummy= 3;
            for(int i = 0; i <= 3; i++){
                if(i == 3){
                    i = 0;
                    dummy =-1;
                }
                if(dummy == -1){
                    break;
                }
                square[i][dummy] = square[dummy][i];
        }
        }
    }

