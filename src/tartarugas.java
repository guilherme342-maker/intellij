import java.util.Scanner;

public class tartarugas {
   public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);

       System.out.println("digite quantas tartarugas viu no zoologico");
       int zoo = scanner.nextInt();
       int tar1 = 900000;
       int tar2 = 900;
       int tar3 = 2;
       int conta2 = zoo + tar3;
       double conta = tar2 * tar3;
       System.out.println(" São a quantidade de tartarugas que são liberadas ao mar: " + tar1);
       System.out.println(" Quantas mil tartarugas tem: " + tar2);
       System.out.println(" quantas tartarugas sobrevivem a cada 1000: " +tar3);
       System.out.println(" total de tartarugas que sobrevivem: " + conta);
       System.out.println("tartarugas no zoologico: " + conta2);


    }
}
