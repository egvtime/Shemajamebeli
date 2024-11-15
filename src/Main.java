import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] square = new int[5][5];
        int sigrdze = 0;
        int sigane = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("airchiet sigrdze ");
        sigrdze = scanner.nextInt();
        System.out.print("airchiet sigane ");
        sigane = scanner.nextInt();

        int dummy = 0;

        int Min = 5;
        int Max = 0;
        int MinLine = 0;
        int MaxLine = 0;

        for(int i = 0; i <= 5; i++){
            if(i == 5){
                dummy = dummy + 1;
                i= 0;
            }
            if(dummy == 5){
                break;
            }
            square[dummy][i] = (int) (Math.random() * 10)/2;

            if (Min > square[dummy][i]){
                Min = i;
                MinLine = dummy;
            }
            if (Max > square[dummy][i]){
                Max = i;
                MaxLine = dummy;
            }
        }
        System.out.println("tqveni archeuli iyo " + square[sigrdze-1][sigane-1]);

        System.out.println("maxsimaluri raodenoba iyo: " + square[MaxLine][Max] + "; " + MaxLine + " sigrdzis " + Max + " indexze");
        System.out.println("minimaluri raodenoba iyo: " + square[MinLine][Min] + "; " + MinLine + " sigrdzis " + Min + " indexze");

    }
}
