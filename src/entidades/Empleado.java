/*
 * Herencia en la POO
 * 
 * Nos permite heredar atributos y metodos con la finalidad de reutilizar codigo y generar una relacion entre clases superiores (padres) y las subclases (hijos).
 * 
 * Superclase (clase superior) es la clase de quien vamos a heredar (persona)
 * Sublcase (clase hijo) es donde vamos a poner lo que heredamos (empleado)
 * 
 * 
 * Para heredar, usamos una palabra reservada llamada extends. Esta palabra se coloca al alado del nombre de mi clase (Empleado), y despues definimos el lugar de donde nos vamos a traer las cosas que queremos heredar (Persona).
 * 
 * 
 * 
 * Para heredar constructores de una forma muy rapida, daremos click derecho sobre nuestro editor de codigo, despues buscaremos la opcion source y despues en la opcion de Generate Constructor using fields. En la segunda ventana, veremos la cantidad de constructores disponibles para heredar.
 * 
 * 
 */

package entidades;

public class Empleado extends Persona {


//1.- Atributos
	
	public String numEmpleado;
	public String nss;
	public String puesto;


//2.- Contructor
	public Empleado(String nombre, int edad, String correo, String telefono, String numEmpleado, String nss,
			String puesto) {
		super(nombre, edad, correo, telefono); //Nos indica que heredamos (de la clase superior)
		this.numEmpleado = numEmpleado;
		this.nss = nss;
		this.puesto = puesto;
	}
	
	//3. Metodo para imprimirInformacion empleado
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Correo: " + correo);
        System.out.println("Telefono: " + telefono);
        System.out.println("Numero Empleado: " + numEmpleado);
        System.out.println("Numero Seguro Social: " + nss);
        System.out.println("Puesto: " + puesto);
    }//cierre mostrarInformacin


    
    //4.- toString
    //Es un metodo en Java que proviene de la clase Objeto (el antecesor o precursor de todos los objetos que existen en Java). Este metodo ya se escribió, ya esta deficino y nos permite mostrar la informacion del objeto en una cadena de texto
    
	@Override
	public String toString() {
		return "Empleado [numEmpleado=" + numEmpleado + ", nss=" + nss + ", puesto=" + puesto + ", nombre=" + nombre + ", edad=" + edad + ", correo=" + correo + ", telefono=" + telefono + "]";
	}
    
	
}