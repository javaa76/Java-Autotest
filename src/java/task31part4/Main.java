package task31part4;

public class Main {
    public static void main(String[] args) {
        int P = Integer.parseInt(args[0]);
        double r = Integer.parseInt(args[1]);
        int t = Integer.parseInt(args[2]);
        System.out.println(P * Math.exp(r/100 * t));
    }
}
