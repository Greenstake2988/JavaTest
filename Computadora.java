
public class Computadora {
  private String nombre;
  private int centroComputo;
  private int numComputadora;
  private Programa[] programas;


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

  public void instalarPrograma(Programa programa) {

    // Crear un nuevo array con una longitud mayor en 1 que el array original
    Programa[] programasNuevo = new Programa[programas.length + 1];

    // Copiar todos los elementos del array original al nuevo array
    for (int i = 0; i < this.programas.length; i++) {
      programasNuevo[i] = this.programas[i];
    }

    // Agregar el nuevo objeto al final del nuevo array
    programasNuevo[programas.length] = programa;

    // Asignar el nuevo array al array original
    programas = programasNuevo;
    
  }
}
