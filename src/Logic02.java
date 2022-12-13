public class Logic02 {
    public static void main(String[] args) {
        soal1(9);
    }

    public static void soal1(int n){
        System.out.println("soal 1 :");
        String[][] kotak = new String[n][n];
        for (int i = 0; i < n; i++) {
            int angka=1;
            for (int j = 0; j < n; j++) {
                if(i == j){
                    kotak[i][j] = String.valueOf(angka);
                }else if(i+j == n-1){
                    kotak[i][j] = String.valueOf(angka);
                }
                angka++;
            }
        }


        PrintArray.print(kotak);
    }
}