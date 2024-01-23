package loopsconditions;
public class Reversing {

    public static void main(String[] args) {
        int number= 23689;
        int r,sum=0;
        while(number>0){
            r=number%10;
            sum= (sum*10)+r;
            number= number/10;
        }
        System.out.println(sum);
    }
}
