package alumnos;

import javax.swing.JOptionPane;

public class AprobadosSuspenCond {

	public static void main(String[] args) {
		
		int contApro = 0, contCondi = 0, contSuspen = 0;
		float cal;
		
		for(int i=1; i<=6; i++) {
			
			do {
			cal = Float.parseFloat(JOptionPane.showInputDialog("Ingresa la calificación del alumno: "+i+".- Entre cero a diez"));
			
			}while(cal<0 || cal>10);
			
			if(cal>=6 && cal<=10) {
				contApro++;
			}
			else if(cal<6 && cal>=4) {
				contCondi++;
			}
			else if(cal<4 && cal>=0) {
				contSuspen++;
			}
			
			
			
			
		}
			System.out.println("La cantidad de alumnos aprobados es: "+contApro);
			System.out.println("La cantidad de alumnos condicionados es: "+contCondi);
			System.out.println("La cantidad de alumnos suspensos es: "+contSuspen);
			
			

	

}}
