import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());

        for(int i = 1; i <=99; i++){
            if(i%num==0){
                System.out.println(i);
            }else if(i % 10 == num){
                System.out.println(i);
            }
        }
    }
}
