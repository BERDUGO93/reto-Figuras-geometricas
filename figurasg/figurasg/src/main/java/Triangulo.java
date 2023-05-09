public class Triangulo extends figurasGeometricas {

  private Double lado;
  private Double Base;
  private Double Altura;
  private Double Area;
  private Double Perimetro;

  public Double getLado() {
    return lado;
  }

  public void setLado(Double lado) {
    this.lado = lado;
  }

  public Double getBase() {
    return Base;
  }

  public void setBase(Double base) {
    Base = base;
  }

  public Double getAltura() {
    return Altura;
  }

  public void setAltura(Double altura) {
    Altura = altura;
  }

  public Double getArea() {
    return Area;
  }

  public void setArea(Double area) {
    Area = area;
  }

  public Double getPerimetro() {
    return Perimetro;
  }

  public void setPerimetro(Double perimetro) {
    Perimetro = perimetro;
  }

  public Triangulo() {}

  public Triangulo(
    Double lado,
    Double base,
    Double altura,
    Double area,
    Double perimetro
  ) {
    this.lado = lado;
    Base = base;
    Altura = altura;
    Area = area;
    Perimetro = perimetro;
  }

  @Override
  public void calcularArea() {
    Area = (Base * Altura) / 2;
    System.out.println(" el area del triangulo es " + Area);
  }

  @Override
  public void calcularPerimetro() {
    Perimetro = (lado * 3);

    System.out.println("el perimetro del triangulo es " + Perimetro);
  }

  @Override
  public void ingresarDatosPerimetro() {
    System.out.println(
      "ingrese la medida de un lado del triangulo para calcular el perimetro"
    );
    triangulo.setLado(entrada.nextDouble());
  }

  @Override
  public void ingresarDatosArea() {
    System.out.println("ingrese la base del triangulo");
    triangulo.setBase(entrada.nextDouble());
    System.out.println("ingrese el altura del triangulo");
    triangulo.setAltura(entrada.nextDouble());
  }
}
