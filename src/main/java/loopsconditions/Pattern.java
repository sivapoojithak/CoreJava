package loopsconditions;

public class Pattern {

    public static void printPattern(int n){
        int i, j;

        for(i=4;i>=0;i--) {
            for(j=0;j<n;j++){
                if(j<i) {
                    System.out.print("+");
                }else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=6;
        printPattern(n);

    }
}
