package lab_6_eje_1;

import javax.swing.JOptionPane;

public class Competencia {
	Atleta a;
	Atleta atletas[];
	public Competencia(){
		mostrarMenu();
	}
	
	private void mostrarMenu(){
		int loop=0;
		while(loop!=5){
	int opc=Integer.parseInt(JOptionPane.showInputDialog(null, "1.Registrar Atleta\n "
			                    	    + "2.Datos del campeón\n"
			                    	    + "3.Atletas por país\n"
			                    	    + "4.Tiempo promedio de todos los atletas\n"
			                    	    + "5.Salir","Competencia",JOptionPane.QUESTION_MESSAGE));
	
		switch(opc){
		case 1:registrarAtleta();
		break;
		case 2:datosCampeon();
		break;
		case 3:filtrarAtletas();
		break;
		case 4:tiempoProm();
		break;
		case 5:System.exit(0);
		break;
		default :
			JOptionPane.showMessageDialog(null,"la opcion no esta disponible");
		}
		}
	}
	
	private void registrarAtleta(){
		
		
		int num=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese numero de atletas"));
		atletas=new Atleta[num];
		for(int i=0; i<atletas.length;i++){
			
			String nom=JOptionPane.showInputDialog("ingrese nombre del atleta");
			String pais=JOptionPane.showInputDialog("ingrese pais del atleta");
			int tiempo =Integer.parseInt(JOptionPane.showInputDialog("ingrese tiempo del atleta"));
			a=new Atleta(nom,pais,tiempo);
			atletas[i]=a;
			
		}
	}
	
	private void datosCampeon(){
		
	
		for(int i=0; i<atletas.length-1;i++){
			if(atletas[i].getTiempo()<atletas[i+1].getTiempo()){
				a=atletas[i];
				atletas[i]=atletas[i+1];
				atletas[i+1]=a;
			}else{
				a=atletas[i+1];
			}
		}
		
		JOptionPane.showMessageDialog(null,a.getNombre()+"\n"
				+a.getPais()+"\n"
				+a.getTiempo());
	}
	
	private void filtrarAtletas(){
	String pais=JOptionPane.showInputDialog(null,"buscar:","filtrar por pais");
		for(int i=0;i<atletas.length;i++){
			if(pais.equalsIgnoreCase(atletas[i].getPais())){
				JOptionPane.showMessageDialog(null,atletas[i].getNombre()+"\n"
						+atletas[i].getPais()+"\n"
						+atletas[i].getTiempo());
			}
		}
	}
	
	private void tiempoProm(){
		int acum=0;
		double prom;
		for(int i=0;i<atletas.length;i++){
			acum=acum+atletas[i].getTiempo();
		}
		prom=acum/atletas.length;
		
		JOptionPane.showMessageDialog(null,"tiempo promedio "+prom);
	}	
}
