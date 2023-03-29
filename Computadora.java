
public class Computadora {
  private String nombre;
  private int centroComputo;
  private int numComputadora;
  private Programa[] programas;

  public Computadora(){
    
  }

  public void setNombre() {
    this.nombre = "CC" + this.centroComputo + "-" + this.numComputadora;
  }

  public String getNombre() {
    return nombre;
  }

  public void setCentroComputo(int centroComputo) {
    this.centroComputo = centroComputo;
  }

  public int getCentroComputo() {
    return centroComputo;
  }

  public void setNumComputadora(int numComputadora) {
    this.numComputadora = numComputadora;
  }

  public int getNumComputadora() {
    return numComputadora;
  }

  public void setProgramas(Programa[] programas) {
    this.programas = programas;
  }

  public Programa[] getProgramas() {
    return programas;
  }
}
