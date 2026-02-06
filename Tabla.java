import java.util.Scanner;

public class Tabla {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("BIENVENIDO\nTABLAS DE MULTIPLICAR");
        int num;
        System.out.println("QUE NUMERO QUIERES MOSTRAR?");
        num = sc.nextInt();
        for(int i=1; i<=10;i++){
            System.out.println(num+" * "+i+" = "+(i*num));
        }







    }
}