import java.util.Scanner;

public class diamante {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Introduce el tamaño del diamante");
        int medio=input.nextInt();
        int filasdiamante= medio*2-1;

        for (int i=1; i<=filasdiamante;i++){
            int spaces=Math.abs(i-medio)*2;
            int points=filasdiamante-spaces;

            for (int j=1;j<=spaces/2;j++){
                System.out.print(" ");
            }

            for(int k=1;k<=points;k++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
