import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());
        int sum = 0;

        for(int i = 1; i <=99; i++){
            if(i%num==0){
                System.out.println(i);
                sum += i;
            }else if(i % 10 == num){
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("合計は"+sum);
    }
}
