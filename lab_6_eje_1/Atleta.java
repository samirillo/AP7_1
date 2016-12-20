package lab_6_eje_1;

public class Atleta {
	private String nombre;
	private String nacionalidad;
	private int tiempo;
	
	public Atleta(String nom, String nal, int t){
		nombre=nom;
		nacionalidad=nal;
		tiempo=t;
	}
	
	
	
	public String getNombre(){
		return nombre;
	}
	
	
	
	public String getPais(){
		return nacionalidad;
	}

	
	public int getTiempo(){
		return tiempo;
	}

}
