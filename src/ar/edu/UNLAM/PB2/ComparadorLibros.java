package ar.edu.UNLAM.PB2;

import java.util.Comparator;


public class ComparadorLibros implements Comparator<Libro>{

	@Override
	public int compare(Libro lgen1, Libro lgen2) {	
	return (lgen1.getNombre().toUpperCase().compareTo(lgen2.getNombre().toUpperCase()));
	}

}
