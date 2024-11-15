public class Main {
    public static void main(String[] args) {
        int[] store ={1, 2, 3, 4, 5};

        int MinStore = 0;
        int Min = store[4];
        int MaxStore = 0;
        int Max = 0;

        for(int i = 0; i <= store.length; i++){
            if(i==store.length){
                System.out.println(MinStore + " magaziashi yvelaze iafia da girs " + Min);
                System.out.println(MaxStore + " magaziashi yvelaze dzviria da girs " + Max);
                break;
            }
            if(Max < store[i]){
                Max = store[i];
                MaxStore = i;
            }
            if(Min > store[i]){
                Min = store[i];
                MinStore = i;
            }
        }

    }
}