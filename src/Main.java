
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int num;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please write number to check:");
        num=scanner.nextInt();
        boolean isPrime=isPrime(num);
        if(isPrime==true){
            System.out.println("This number is a prime number");
        }else{
            System.out.println("This number is a composite number");
        }
}

public static boolean isPrime(int num){
    for(int i=2;i<num;i++) {
        if(num%i==0)
            return false;
    }
    return true;
}
    }
