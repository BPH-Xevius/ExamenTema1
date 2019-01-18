package libros;

import java.io.ObjectOutputStream;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Almacen {
	
	public void Almacen()
	{
		
	}
	
	public void guardar(Libros l, String a)
	{
		
		ObjectOutputStream out = null;
		
		try {
			out = new ObjectOutputStream(new FileOutputStream(a));
			out.writeObject(l);
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally
		{
			intentarCerrar(out);
		}
		
	}

	public Libros recuperar(String a) {
		Libros l = null;
        ObjectInputStream in=null;
        try {
            in = new ObjectInputStream(new FileInputStream(a));
            l = (Libros) in.readObject();            
        } catch (ClassNotFoundException ex) {
            System.err.println("Error de fichero");
        } catch (IOException ex) {
        	System.err.println("Error IO");
        }finally{
            intentarCerrar(in);
        }
        return l;
	}
	
	public void intentarCerrar(Closeable aCerrar)
	{
		try {
			if(aCerrar!=null)
			{
				aCerrar.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(System.err);
		}
	}
}
