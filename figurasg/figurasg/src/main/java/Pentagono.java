

import java.util.Scanner;


public class Pentagono extends figurasGeometricas {
    private Double lado;
  
    private Double apotema;
    private Double area;
    private Double perimetro;
    private Double Plado;
    
    
    
    public Pentagono() {
    }

    

    public Pentagono(Double lado, Double apotema, Double area, Double perimetro, Double plado) {
        this.lado = lado;
        this.apotema = apotema;
        this.area = area;
        this.perimetro = perimetro;
        Plado = plado;
    }



    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    public Double getApotema() {
        return apotema;
    }

    public void setApotema(Double apotema) {
        this.apotema = apotema;
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

    public Double getPlado() {
        return Plado;
    }

    public void setPlado(Double plado) {
        Plado = plado;
    }

    Scanner entrada = new Scanner(System.in);



    @Override
    public void calcularArea() {

        area=((lado*5)*apotema)/2;

        System.out.println(" el area del Pentagono es "+area);

       
    }

    @Override
    public void calcularPerimetro() {
        perimetro=5*Plado;

        System.out.println("el perimetro del pentagono es  "+perimetro);
        
    }


    
}

