package ar.edu.UNLAM.PB2;

import java.util.Comparator;

public class Libro implements Comparable<Libro> {
	

	private Integer ISBN;
	private String nombre;
	
	
	
	
	
	public Libro(String nombre, Integer ISBN){
		this.nombre=nombre;
		this.ISBN=ISBN;
	}

	

	public Integer getISBN() {
		return ISBN;
	}

	public String getNombre() {
		return nombre;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ISBN == null) ? 0 : ISBN.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (ISBN == null) {
			if (other.ISBN != null)
				return false;
		} else if (!ISBN.equals(other.ISBN))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
//	@Override
//	public int compareTo(Libro l) {
//		if (this.ISBN>l.getISBN())return 1;
//		else if(this.ISBN<l.getISBN())return -1;
//		return 0;
//	}
	@Override
	public int compareTo(Libro objgen) {
		return ISBN-objgen.getISBN();
	}

	public String toString() {
		return "Libro [nombre=" + nombre + ", ISBN=" + ISBN + "]";
	}
	

}
