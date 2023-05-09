import java.util.Scanner;

public class Rombo extends figurasGeometricas {

  private Double diagmenor;
  private Double Rlado;
  private Double diagmayor;
  private Double area;
  private Double perimetro;

  public Double getDiagmenor() {
    return diagmenor;
  }

  public void setDiagmenor(Double diagmenor) {
    this.diagmenor = diagmenor;
  }

  public Double getRlado() {
    return Rlado;
  }

  public void setRlado(Double rlado) {
    Rlado = rlado;
  }

  public Double getDiagmayor() {
    return diagmayor;
  }

  public void setDiagmayor(Double diagmayor) {
    this.diagmayor = diagmayor;
  }

  public Double getArea() {
    return area;
  }

  public void setArea(Double area) {
    this.area = area;
  }

  public Double getPerimetro() {
    return perimetro;
  }

  public void setPerimetro(Double perimetro) {
    this.perimetro = perimetro;
  }

  public Rombo() {}

  public Rombo(
    Double diagmenor,
    Double rlado,
    Double diagmayor,
    Double area,
    Double perimetro
  ) {
    this.diagmenor = diagmenor;
    Rlado = rlado;
    this.diagmayor = diagmayor;
    this.area = area;
    this.perimetro = perimetro;
  }

  Scanner entrada = new Scanner(System.in);

  @Override
  public void calcularArea() {
    area = (diagmayor * diagmenor) / 2;

    System.out.println(" el area del rombo es " + area);
  }

  @Override
  public void calcularPerimetro() {
    perimetro = 4 * Rlado;

    System.out.println("el perimetro del Rombo es  " + perimetro);
  }

  @Override
  public void ingresarDatosPerimetro() {
    System.out.println(
      "ingrese la medida de un lado del Rombo para calcular el perimetro"
    );
    rombo.setRlado(entrada.nextDouble());
  }

  @Override
  public void ingresarDatosArea() {
    System.out.println("ingrese la diagonal mayor del rombo");
    rombo.setDiagmayor(entrada.nextDouble());

    System.out.println("ingrese la diagonal menor del rombo");
    rombo.setDiagmenor(entrada.nextDouble());
  }
}
