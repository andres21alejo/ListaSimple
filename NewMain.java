/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listasimple;

/**
 *
 * @author User
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        static Scanner sc = new Scanner(System.in);
    static lista lista = new lista();
    public static void main(String[] args) {
        menu();
    }
    
    public static void menu(){
        boolean salir = false;
        int eleccion;
        
        while (!salir){
            System.out.println("\n\n---------------------------");
            System.out.println("\nSeleccione qué desea hacer");
            System.out.println("\n1. Añadir al inicio \n2 Añador al final \n3 Mostrar \n4 Borrar el primer numero"
                    + "\n5 Borrar el ultimo elemento \n6 Borrar el elemento seleccionado \n7 Buscar \n8 Salir");
            System.out.println("2. Añadir al final");
            eleccion  = sc.nextInt();
            
            switch (eleccion){
                case 1: añadir();
                        break;
                case 2: añadirFinal();
                        break;
                case 3: lista.mostrarLista();
                        break;
                case 4: System.out.println("elemento Borrado: [" + lista.borrarInicio() + "]");
                        break;
                case 5: System.out.println("elemento Borrado: [" + lista.borrarFinal() + "]");
                        break;
                case 6: System.out.println("elemento Borrado: [" + lista.borrarSeleccion() + "]");
                        break;
                case 7: System.out.println("Elemento encontrado: [" + lista.buscarElemento() + "]");
                        break;
                case 8: salir = true;
                        break;
                case 9: default: System.out.println("La opción que seleccionó no"
                        + " existe, seleccione otra");
                        break;
            }
        }
    }
    
    public static void añadir(){
        char elemento=0;
        System.out.println("Ingrese el elemento a añadir");
        elemento = sc.next().charAt(elemento);
        lista.AgregarInicio(elemento);
    }
    
    public static void añadirFinal(){
        char elemento = 0;
        System.out.println("Ingrese el elemento a añadir");
        elemento = sc.next().charAt(elemento);
        lista.AgregarFinal(elemento);
    }
}// TODO code application logic here
    
    

