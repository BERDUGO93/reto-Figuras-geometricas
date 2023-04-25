

import java.util.Scanner;

public class ejecucion {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        Triangulo triangulo=new Triangulo();
        Pentagono pent = new Pentagono();
        Rombo rombo = new Rombo();
        System.out.println("selecione una figura geometrica para calcular su area y perimetro  : \n1:Triangulo \n 2:Rombo \n 3:pentagono");
        int select=entrada.nextInt();
       switch (select) {
        case 1:
        System.out.println("que desea calcular  : \n1:Area \n2:perimetro ");
        opcion = entrada.nextInt();
        if (opcion==1){
            System.out.println("ingrese la base del triangulo");
            triangulo.setBase(entrada.nextDouble());
            System.out.println("ingrese el altura del triangulo");
            triangulo.setAltura(entrada.nextDouble());
            triangulo.calcularArea( ) ;

        }else if(opcion==2){
            System.out.println("ingrese la medida de un lado del triangulo para calcular el perimetro");
            triangulo.setLado(entrada.nextDouble());
            triangulo.calcularPerimetro();
        }

        break;
    case 2:
        System.out.println("que desea calcular  : \n1:Area \n2:perimetro ");
        opcion = entrada.nextInt();
        if (opcion == 1) {
            System.out.println("ingrese la diagonal mayor del rombo");
            rombo.setDiagmayor(entrada.nextDouble());
            System.out.println("ingrese la diagonal menor del rombo");
            rombo.setDiagmenor(entrada.nextDouble());
            rombo.calcularArea();
        }else if (opcion==2) {
            System.out.println("ingrese la medida de un lado del Rombo para calcular el perimetro");
            rombo.setRlado(entrada.nextDouble());
            rombo.calcularPerimetro();
        }
                break;
    case 3:
        System.out.println("que desea calcular  : \n1:Area \n2:perimetro ");
        opcion = entrada.nextInt();
        if (opcion == 1) {
            System.out.println("ingrese la lado del pentagono");
            pent.setLado(entrada.nextDouble());
            System.out.println("ingrese el apotema del pentagono");
            pent.setApotema(entrada.nextDouble());
            pent.calcularArea();
        }else if (opcion==2) {
            System.out.println("ingrese la medida de un lado del Pentagono para calcular el perimetro");
            pent.setPlado(entrada.nextDouble());
            pent.calcularPerimetro();
        }
             break;
    }
     
    }
    
}
