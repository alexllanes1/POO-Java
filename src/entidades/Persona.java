package entidades;

public class Persona {
	
	//1.- Propriedades o atributos
	public String nombre;
	public int edad;
	public String correo;
	public String telefono;
	
	//2.- Constructor
	public Persona(String nombre, int edad, String correo, String telefono) {
	this.nombre = nombre;
	this.edad = edad;
	this.correo = correo;
	this.telefono = telefono;
	}
	
	public Persona(String nombre, int edad, String correo) {
		this.nombre = nombre;
		this.edad = edad;
		this.correo = correo;
	}
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	
	//3.- Metodos
	public void mostrarInformacion() {
	System.out.println("Nombre: " + nombre);
	System.out.println("Edad: " + edad);
	System.out.println("Correo: " + correo);
	System.out.println("Telefono: " + telefono);
	}
	
	public float conversor(float conversionDolar) {
		float dolar = 16.50f;
		float conversion = dolar*conversionDolar;
		System.out.println(conversion);
		return conversion;
	}
	
	
	//Metodo main
	public static void main(String[] args) {
		Persona Felipe = new Persona("Felipe", 31, "felipe.maqueda@gmail.com", "918298129");
//		Clase  Nombre = PReservada NombreMetodoConstructor(Parametros)
		Persona Andrea = new Persona("Andrea", 21, "AndreaAT@gmail.com", "93843");
		Persona Luis = new Persona("Luis", 24, "luisgomez19@gmail.com", "5509303");
		Persona Ana = new Persona("Ana", 28, "ana123@gmail.com", "5550394930");

		Persona EvilAndrea = new Persona("andreaAT@gmail.com", 21, "Andrea");
		Persona EvilAna = new Persona("Ana", 28);
		
		
		Felipe.mostrarInformacion();
		Andrea.mostrarInformacion();
		Luis.mostrarInformacion();
		Ana.mostrarInformacion();
		EvilAndrea.mostrarInformacion();
		EvilAna.mostrarInformacion();

		// TODO Auto-generated method stub

	}//Cierre del Main

}//Cierre de la clase
