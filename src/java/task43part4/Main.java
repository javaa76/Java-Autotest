package task43part4;

import java.lang.Math;

public class Main {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        if ((a + b > c) && (a + c > b) && (c + b > a)) {
            if ((a < c) && (b < c)) {
                    a = a + c;
                    c = a - c;
                    a = a - c;
                }
             else if (b > c && b > a){
                a = a + b;
                b = a - b;
                a = a - b;
            }

            if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2))
                System.out.println("right");
            else if (Math.pow(a, 2) < Math.pow(b, 2) + Math.pow(c, 2)) {
                System.out.println("acute");
            } else if (Math.pow(a, 2) > Math.pow(b, 2) + Math.pow(c, 2)) {
                System.out.println("obtuse");
            }
        }
        else System.out.println("impossible");
    }


}
