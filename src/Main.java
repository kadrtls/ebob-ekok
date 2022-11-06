import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i=1,x,ebob=1,ekok=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("ilk sayıyı giriniz.");
        int num1= scanner.nextInt();
        System.out.println("ikinci sayıyı giriniz.");
        int num2= scanner.nextInt();
        while (i<=num1){
            if (num1%i==0&&num2%i==0){
                ebob=i;
                i++;
            }else{
                i++;
            }
        }
        System.out.println("ebob:"+ebob);

        while (i<=num1*num2){
            if (i%num1==0&&i%num2==0){
                ekok=i;
                System.out.println("ekok:"+ekok);
                break;
            }else {
                i++;
            }
        }
    }
}