package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import model.*;
import view.*;

public class GestionEventos {

	private GestionDatos model;
	private LaunchView view;
	private ActionListener actionListener_comparar, actionListener_buscar;

	public GestionEventos(GestionDatos model, LaunchView view) {
		this.model = model;
		this.view = view;
	}

	public void contol() {
		actionListener_comparar = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				// TODO: Llamar a la función call_compararContenido
				try {
					call_compararContenido();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		view.getComparar().addActionListener(actionListener_comparar);

		actionListener_buscar = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				// TODO: Llamar a la función call_buscarPalabra
				try {
					call_buscarPalabra(null, null);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		view.getBuscar().addActionListener(actionListener_buscar);
	}

	private int call_compararContenido() throws IOException {
		// TODO: Llamar a la función compararContenido de GestionDatos
		try {
			if(model.compararContenido(view.getFichero1().getText(), view.getFichero2().getText()))
			{
				view.getTextArea().setText("Los archivos son iguales");
			}
			else
			{
				view.getTextArea().setText("Los archivos no son iguales");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			view.showError("Uno de los ficheros no existe");
		}
		// TODO: Gestionar excepciones
		return 1;
	}

	private int call_buscarPalabra(String fichero1, String palabra) throws IOException {
		// TODO: Llamar a la función buscarPalabra de GestionDatos
		int num = model.buscarPalabra(view.getFichero1().getText(), view.getPalabra().getText());
		try {
			if(num!=-1)
			{
					view.getTextArea().setText("La palabra buscada aparece "+num+" veces");
			}
			else
			{
				view.getTextArea().setText("ERROR: La palabra buscada no aparece en el fichero");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			view.showError("Se ha producido un error");
		}
		
		// TODO: Gestionar excepciones
		return 1;
	}

}
