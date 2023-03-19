import java.io.*;
import java.util.*;
import  java.lang.*;

public class Algo5_1 {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fc = new FileInputStream("small1_input.txt");
        Scanner sc1 = new Scanner(fc);
        String line1 = sc1.nextLine();
        Scanner sc2 = new Scanner(line1);
        short t = sc2.nextShort();
        for (int i=0; i<t; i++) {
            String line2 = sc1.nextLine();
            Scanner sc3 = new Scanner(line2);
            byte raw = sc3.nextByte();
//            System.out.println(raw);
            byte col = sc3.nextByte();
//            System.out.println(col);
            short mine = sc3.nextShort();
            String[][] arr = new String[raw][col];
//            boolean b = mine < ((raw * col) - 9);
//            System.out.println(b);
            if (mine > ((raw * col) - 9)) {

                System.out.println("Impossible");
                continue;
            } else {

                for (int k = 0; k < raw; k++) {
                    for (int j = 0; j < col; j++) {
                        arr[k][j] = ".";
                    }
                }
            }
//            for (int k = 0; k < raw; k++) {
//                for (int j = 0; j < col; j++) {
//                    System.out.print(arr[k][j]);
//
//                }
//                System.out.println();
//            }
            Random rm = new Random();


                int k1 = rm.nextInt(1,raw-1);
                int j1 = rm.nextInt(1,col-1);

                    arr[k1][j1] = "C";
//                    arr[k1+1][j1] = ".";
//                    arr[k1-1][j1] = ".";
//                    arr[k1][j1+1] = ".";
//                    arr[k1][j1-1] = ".";
//                    arr[k1-1][j1-1] = ".";
//                    arr[k1+1][j1+1] = ".";
//                    arr[k1+1][j1-1] = ".";
//                    arr[k1-1][j1+1] = ".";

                    for (int mi=1; mi<200; mi++){
                        int miR = rm.nextInt(raw);
                        int miC = rm.nextInt(col);

                        if((miR ==k1 || miR ==k1+1|| miR ==k1-1) && (miC == j1 || miC == j1-1 || miC == j1+1) ){

                        }
                        else {
                            arr[miR][miC] = "*";


                        }


                    }

                    //c=false;


            System.out.println();
            for (int k=0; k<raw; k++){
                for(int j=0; j<col; j++){
                    System.out.print(arr[k][j]);
                }
                System.out.println();
            }
    }
}
}
