package ar.edu.UNLAM.PB2;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.Comparator;
import org.junit.Assert;
import org.junit.Test;

public class BibliotecaTest {
/*
	@Test
	public void bibliotecaConLibrosDuplicados() throws Exception{
								
		Libro l1 = new Libro ("Zlibro1", 0004);
		Libro l2 = new Libro ("Alibro2", 0002);
		Libro l3 = new Libro ("Nlibro1", 0021);
		Libro l4 = new Libro ("Clibro3", 0013);
		Libro l5 = new Libro ("Dlibro1", 0001);
		
		Biblioteca b1 = new Biblioteca (6);	
			
					
		b1.agregarLibro(new Libro("Curso Java", 0005));
		b1.agregarLibro(new Libro("Curso Phyton", 0015));
		b1.agregarLibro(new Libro("Curso Pearl", 1005));
		b1.agregarLibro(new Libro("Curso C", 0025));
		b1.agregarLibro(l5);
		b1.agregarLibro(l5);
		//b1.agregarLibro(l1);
			
		Assert.assertTrue(b1.getCant()==6);
		System.out.println(b1.getCant());	
		System.out.println(b1.getbibblioteca());		

	}
	*/
	@Test
	public void ordenarLibros() throws Exception {
		
		Libro l1 = new Libro ("Zlibro1", 0004);
		Libro l2 = new Libro ("Alibro2", 0002);
		Libro l3 = new Libro ("Nlibro1", 0007);
		Libro l4 = new Libro ("Clibro3", 0006);
		Libro l5 = new Libro ("Dlibro1", 0001);
				
		Biblioteca b1 = new Biblioteca(6);
		
		b1.agregarLibro(l1);
		b1.agregarLibro(l2);
		b1.agregarLibro(l3);
		b1.agregarLibro(l4);
		b1.agregarLibro(l5);	
		//ordeno x ISBN
		b1.sortByISBN();		
		b1.mostrarLibros();
		// ordeno x nombre
		b1.sortByNombre();
		b1.mostrarLibros();
		
		
		
		
	}

}
