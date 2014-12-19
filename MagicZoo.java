package magiczoo;

public class MagicZoo {

    //HIER KOMT INPUT !!!
    //bijvoorbeeld: static long z[] = { 17, 55, 6 };
    static long z[] = { 2055, 2006, 2017 };
    
    //output end stand
    static long e[] = { 0, 0, 0 };

    public static void main(String[] args) {

        System.out.println("IN: ( " + z[0] + "," + z[1] + "," + z[2] + " )");
        int overblijft, min; // index naar positie in z[]  0,1,2
        
        if (((z[0] - z[1]) % 2 == 0) && ((z[1] - z[2]) % 2 == 0)) { 
            overblijft = getMax();
            min = getMin(overblijft);
        } else {
            overblijft = getNotFit();
            min = getMin(overblijft);
        }
        e[overblijft] = z[overblijft] + z[min];
        
        System.out.println("OUT: ( " + e[0] + "," + e[1] + "," + e[2] + " )");
    }

    public static int getNotFit() {
        if (((z[0] - z[1]) % 2) == 0)
            return 2;
        if (((z[1] - z[2]) % 2) == 0)
            return 0;
        else 
            return 1;      
    }

    public static int getMax() {
        int tmax = 0;
        if (z[0] < z[1]) {
            tmax = 1;
        }
        if (z[tmax] < z[2])
            return 2;
        else
            return tmax;
    }

    public static int getMin(int notThis) {
        int a = (notThis + 1) % 3;
        int b = (notThis + 2) % 3;
        if (z[a] < z[b]) 
            return a;
        else 
            return b;        
    }
}
