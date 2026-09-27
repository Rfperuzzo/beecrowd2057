
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int s , t , f ,c  ;
        
        s = scanner.nextInt();
        t = scanner.nextInt();
        f = scanner.nextInt();
        
        c = s + t + f;
        
        if(c >= 24){
            c = c - 24;
        }
        if( c < 0){
            c = c + 24;
        }
        
        System.out.println(+c);
        
        
    }
}
