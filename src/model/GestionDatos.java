package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GestionDatos {

	public GestionDatos() {

	}

	//TODO: Implementa una función para abrir ficheros
	
	//TODO: Implementa una función para cerrar ficheros
	
	
	public boolean compararContenido (String fichero1, String fichero2) throws IOException{
		//TODO: Implementa la función
		FileReader file1 = new FileReader(fichero1);
		FileReader file2 = new FileReader(fichero2);
		BufferedReader buffered1 = new BufferedReader(file1);
		BufferedReader buffered2 = new BufferedReader(file2);
		String linea1 = buffered1.readLine();
		String linea2 = buffered2.readLine();
		boolean igual = true;
		
		while((linea1!=null) || (linea2!=null) && igual)
		{
			if(linea1==null || linea2==null || !linea1.equals(linea2))
			{
				igual = false;
			}
				linea1 = buffered1.readLine();
				linea2 = buffered2.readLine();
		}
		file1.close();
		file2.close();
		buffered1.close();
		buffered2.close();
		
		return igual;
	}
	
	public int buscarPalabra (String fichero1, String palabra) throws IOException{
		//TODO: Implementa la función
		
		FileReader fichero = new FileReader(fichero1);
		BufferedReader buffered = new BufferedReader(fichero);
		
		String linea = buffered.readLine();
		
		int n_linea=0;
		int contador=0;
		int fin;
		
			while ((linea!=null))
			{
					if(linea.compareTo(palabra)==0)
					{
					contador++;
					n_linea=contador;
					}
				linea=buffered.readLine();
			}
			
			if(n_linea==0)
			{
				fin=-1;
			}
			else
			{
				fin=n_linea;
			}

		fichero.close();
		buffered.close();

		return fin;
	}
}
