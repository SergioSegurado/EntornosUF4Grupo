import com.itt.libreria.*;

public class Principal {

	public static void main(String[] args) {
		
		Autor autor1 = new Autor("Don Piltrafa de la Sarna", "Viv�a y crec�a sin hacer mucho caso a la polic�a.");		
		Libro libro1 = new Libro("3 tristes tigres", "Poes�a", autor1 );
		
		
		System.out.println("=== PRIMER TO STRING ===");
			System.out.println(libro1.toString());
		
	
		// modificamos la Biograf�a
		libro1.getAutor().setBiografia("Con f�sforo un d�a, fu� a ver si gas hab�a, y hab�a.");

		System.out.println("=== INVOCAMOS TO STRING DEL AUTOR DE DOS MANERAS DIFERENTES ===");
			System.out.println(libro1.getAutor().toString());
			System.out.println(autor1.toString());
		
		
		
		System.out.println("=== CAMBIAMOS GENERO E IMPRIMIMOS RESULTADO FINAL ===");
			libro1.setGenero("Comedia");
			System.out.println(libro1.toString());
	}

}
