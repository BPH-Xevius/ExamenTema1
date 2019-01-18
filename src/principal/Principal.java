package principal;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JFrame;

import model.*;
import view.*;
import controller.*;
import libros.Almacen;
import libros.Libros;

public class Principal {

	public static void main(String[] args) {		
	
		GestionDatos model = new GestionDatos();
		
		LaunchView view = new LaunchView();
		view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		view.setVisible(true);
		
		GestionEventos controller = new GestionEventos(model,view);
		controller.contol();
		
		
		int n=1;
		ArrayList<Libros> libro = new ArrayList<Libros>();
		
		Almacen alam=new Almacen();
		
		
		libro.add(new Libros(01,100,"Guia de cocina","Alberto Chicote","2017","Pim Pum"));
		libro.add(new Libros(02,356,"Como ser el mejor, el mejor que habra jamas","Ash Ketchum","2000","Game Freak"));
		
		Iterator it = libro.iterator();
		while(it.hasNext()){
			Libros lib = (Libros) it.next();
			lib.mostrar();
			alam.guardar(lib, "Libro"+n+".txt");
			n++;
		}
		
		
		
		
	}

}
