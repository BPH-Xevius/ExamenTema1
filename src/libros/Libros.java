package libros;

import java.io.Serializable;

public class Libros implements Serializable {
	
	private int id=0, paginas=0;
	private String titulo=null, autor=null, year=null, editor=null;
	
	public Libros () 
	{
		
	}
	
	public Libros (int i, int pags, String tit, String aut, String ye, String edit) 
	{
		id=i;
		paginas=pags;
		titulo=tit;
		autor=aut;
		year=ye;
		editor=edit;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}
	
	public void mostrar()
	{
		System.out.println("- ID: "+id+" Titulo: "+titulo+" Autor: "+autor+" Editor: "+editor+" Año: "+year+" Paginas: "+paginas);
	}
}
