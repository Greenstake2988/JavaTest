public class CentroComputo {
  private int numCentroComputo;
  Computadora[] computadoras;

  public void setNumCentroComputo(int numCentroComputo) {
    if (numCentroComputo > 0) {
      this.numCentroComputo = numCentroComputo;
    }
    else{
      System.out.println("El valor no puede ser 0 menor de 0");
    }
  }

  public int getNumCentroComputo() {
    return numCentroComputo;
  }

  public void setComputadoras(Computadora[] computadoras) {
    this.computadoras = computadoras;
  }

  public Computadora[] getComputadoras() {
    return computadoras;
  }
}
