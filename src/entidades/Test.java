package entidades;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Instancia de Empleado");
		Empleado EvilFelipe = new Empleado("Evil Felipe", 31, "evilfelipe@gmail.com","55555555", "ABC123", "98121982912", "botones");
		EvilFelipe.mostrarInformacion();
		
		System.out.println("Instancia de Persona");
		Persona Naruto = new Persona("Naruto", 30, "naruto@gmail.com","33333333");
		Naruto.mostrarInformacion();
		
		System.out.println("Impresion de Objetos\n");
		System.out.println(EvilFelipe);
		
		//Instancia de un cliente
		System.out.println();
		System.out.println("Instancia de un cliente");
		
		Cliente Jesus = new Cliente("Jesus Gonzales", "ABCD1234", 157654.00f, "1234");
		Jesus.mostrarInfoCliente();
		
		//Modificacion de un atributo
		Jesus.nombre = "Evil Jesus";
		//Jesus.setSaldo(0.00f);
		Jesus.setCuentaBancaria("XYZ098");
		
		//Getter
		System.out.println(Jesus.getCuentaBancaria());


		//Impresion de datos modificados
		System.out.println();
		Jesus.mostrarInfoCliente();
		
		
	}

}
