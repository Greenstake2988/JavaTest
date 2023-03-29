import java.util.Scanner;

public class ComputadoraTestDrive {
  public static void main(String[] args) {
    Scanner escaner = new Scanner(System.in);
    CentroComputo cc1 = new CentroComputo();
    Programa[] programas;
    Computadora[] computadoras;
    
    int numProgramas = 0;
    int numComputadoras = 0;
    
    System.out.println("Ingresa el numero del Centro de Computo");
    cc1.setNumCentroComputo(Integer.parseInt(escaner.nextLine()));

    System.out.println("Ingresa el numero de computadoras");
    numComputadoras = Integer.parseInt(escaner.nextLine());

    computadoras = new Computadora[numComputadoras];
    for (int i = 0; i < numComputadoras; i++) {

      computadoras[i] = new Computadora();

      computadoras[i].setCentroComputo(cc1.getNumCentroComputo());

      computadoras[i].setNumComputadora(i);

      computadoras[i].setNombre();

      System.out.println("Cuantos programas vas a instalar en la Computadora " + (i + 1));
      numProgramas = Integer.parseInt(escaner.nextLine());
  
      programas = new Programa[numProgramas];
  
      for (int j = 0; j < numProgramas; j++) {
  
        programas[j] = new Programa();
  
        System.out.println("Ingresa el nombre del programa #" + (j+1));
        programas[j].setNombre(escaner.nextLine());
  
        System.out.println("Ingresa la fecha de instalacion del programa #" + (j+1));
        programas[j].setFechaInstalacion(escaner.nextLine());
       
      }
      computadoras[i].setProgramas(programas);
    }

    cc1.setComputadoras(computadoras);

    System.out.println("Centro de computo # " + cc1.getNumCentroComputo());

    for (Computadora computadora : cc1.getComputadoras()) {
      System.out.println("Nombre Computadora " + computadora.getNombre());
      
      for (Programa programa : computadora.getProgramas()) {
        System.out.println("Nombre programa " + programa.getNombre());
        System.out.println("Fecha de instalacion del programa " +programa.getFechaInstalacion());
      }
    }

    escaner.close();
  }
}
