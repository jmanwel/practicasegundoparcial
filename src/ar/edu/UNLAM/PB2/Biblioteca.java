package ar.edu.UNLAM.PB2;

import java.util.Comparator;
import java.util.Collections;
import java.util.List.*;
import java.util.LinkedList;
import java.util.ListIterator;


import org.omg.Messaging.SyncScopeHelper;

public class Biblioteca  {
	private Integer cantidadMaxima;
	private LinkedList<Libro> biblioteca;

	//DEFINO LA CANT MAXIMA DE LIBROS EN LA BIBLIOTECA		
	public Biblioteca(Integer cantidadMaxima) {
		this.cantidadMaxima = cantidadMaxima;
		this.biblioteca = new LinkedList<Libro>();//no entiendo esta asignación
	}
	// METODO PARA AGREGAR LIBROS				
	public void agregarLibro (Libro l)throws Exception
	{   Integer cantidad=biblioteca.size();
		if(cantidad<cantidadMaxima){
			biblioteca.add(l);}			
		    else{throw new Exception("No se pueden agregar mas libros");}				
	}
		
	public void mostrarLibros (){System.out.println(biblioteca);}
	
	public LinkedList<Libro> getbibblioteca() {return biblioteca;}
		
	public Integer getCant(){return biblioteca.size();}
	
	public void sortByISBN() {biblioteca.sort(null);}
		
	public void sortByNombre() {biblioteca.sort(new ComparadorLibros());}		
		


}
