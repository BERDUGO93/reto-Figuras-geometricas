import java.util.Scanner;

public class ejecucion {

  Triangulo triangulo = new Triangulo();
  Pentagono pent = new Pentagono();
  Rombo rombo = new Rombo();
  int opcion;

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int select = mostrarMenu(entrada);
    manejarOpcionSeleccionada(select, entrada);
  }

  private static int mostrarMenu(Scanner entrada) {
    System.out.println(
      "Seleccione una figura geométrica para calcular su área y perímetro:\n1: Triángulo\n2: Rombo\n3: Pentágono"
    );
    return entrada.nextInt();
  }

  private static void manejarOpcionSeleccionada(int select, Scanner entrada) {
    switch (select) {
      case 1:
        manejarTriangulo(entrada);
        break;
      case 2:
        manejarRombo(entrada);
        break;
      case 3:
        manejarPentagono(entrada);
        break;
      default:
        System.out.println("Opción inválida");
        break;
    }
  }

  private static void manejarTriangulo(Scanner entrada) {
    System.out.println("¿Qué desea calcular?\n1: Área\n2: Perímetro");
    int opcion = entrada.nextInt();
    if (opcion == 1) {
      triangulo.calcularArea();
    } else if (opcion == 2) {
      triangulo.calcularPerimetro();
    }
  }

  private static void manejarRombo(Scanner entrada) {
    System.out.println("¿Qué desea calcular?\n1: Área\n2: Perímetro");
    int opcion = entrada.nextInt();
    if (opcion == 1) {
      rombo.ingresarDatosArea();
      rombo.calcularArea();
    } else if (opcion == 2) {
      rombo.ingresarDatosPerimetro();
      rombo.calcularPerimetro();
    }
  }

  private static void manejarPentagono(Scanner entrada) {
    System.out.println("¿Qué desea calcular?\n1: Área\n2: Perímetro");
    int opcion = entrada.nextInt();
    if (opcion == 1) {
      pent.calcularArea();
    } else if (opcion == 2) {
      pent.ingresarDatosPerimetro();
      pent.calcularPerimetro();
    }
  }
}
