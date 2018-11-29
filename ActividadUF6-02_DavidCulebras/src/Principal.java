import com.itt.libreria.*;

public class Principal {

	public static void main(String[] args) {
		
		Autor autor1 = new Autor("Don Piltrafa de la Sarna", "Vivía y crecía sin hacer mucho caso a la policía.");		
		Libro libro1 = new Libro("3 tristes tigres", "Poesía", autor1 );
		
		
		System.out.println("=== PRIMER TO STRING ===");
			System.out.println(libro1.toString());
		
	
		// modificamos la Biografía
		libro1.getAutor().setBiografia("Con fósforo un día, fué a ver si gas había, y había.");

		System.out.println("=== INVOCAMOS TO STRING DEL AUTOR DE DOS MANERAS DIFERENTES ===");
			System.out.println(libro1.getAutor().toString());
			System.out.println(autor1.toString());
		
		
		
		System.out.println("=== CAMBIAMOS GENERO E IMPRIMIMOS RESULTADO FINAL ===");
			libro1.setGenero("Comedia");
			System.out.println(libro1.toString());
	}

}
