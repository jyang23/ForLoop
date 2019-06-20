public class Main {

    static final int MAX = 10;

    public static void main(String[] args) {

//        for(int i=1; i<11; i++){
//            System.out.println("Count is: " + i);
//        }

//        int row, column;
//
//        for (row = 1; row <= MAX; row++) {
//            for (column = 1; column <= MAX; column++) {
//                System.out.print(row * column + "\t");
//            }
//            System.out.println(); //Takes us to the next line
//        }

        int row, column;
        int increment = 2;
        for(row = 1;row < MAX; row++){
            increment++;
            for(column = 1; column < increment; column++){
                System.out.print(row);
            }
            System.out.println();
        }
    }
}

