package btvn;

public class Baitap1 {

    static int prime(int nguyenTo) {

        boolean isPrime = true;

        if (nguyenTo <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(nguyenTo); i++) {
                if (nguyenTo % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            return nguyenTo;
        }
        return 0;
    }

    
    static int soLe(int le) {
        if (le % 2 == 1) {
            return le;
        }
        return 0;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 9;
        int laSoNguyenTo = prime(a);
        int laSoLe = soLe(b);
        System.out.println(laSoNguyenTo);
        System.out.println(laSoLe);
    }
}
