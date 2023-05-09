import java.util.Scanner;

public class ejecucion {

    Triangulo triangulo = new Triangulo();
    Pentagono pent = new Pentagono();
    Rombo rombo = new Rombo();

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int opcion;
   
    System.out.println(
      "selecione una figura geometrica para calcular su area y perimetro  : \n1:Triangulo \n 2:Rombo \n 3:pentagono"
    );
    int select = entrada.nextInt();

    switch (select) {
      case 1:
        System.out.println("que desea calcular  : \n1:Area \n2:perimetro ");
        opcion = entrada.nextInt();

        if (opcion == 1) {
          triangulo.calcularArea();
        } else if (opcion == 2) {
          triangulo.calcularPerimetro();
        }

        break;
      case 2:
        System.out.println("que desea calcular  : \n1:Area \n2:perimetro ");
        opcion = entrada.nextInt();

        if (opcion == 1) {
          rombo.ingresarDatosArea();
          rombo.calcularArea();
        } else if (opcion == 2) {
          rombo.ingresarDatosPerimetro();
          rombo.calcularPerimetro();
        }

        break;
      case 3:
        System.out.println("que desea calcular  : \n1:Area \n2:perimetro ");
        opcion = entrada.nextInt();
        if (opcion == 1) {
          pent.calcularArea();
        } else if (opcion == 2) {
          pent.ingresarDatosPerimetro();

          pent.calcularPerimetro();
        }

        break;
    }
  }
}


