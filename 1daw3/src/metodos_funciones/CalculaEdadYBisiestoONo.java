package metodos_funciones;

import javax.swing.JOptionPane;

public class CalculaEdadYBisiestoONo {
		
	public static void main(String[] args) {
		String  seguir;
		char letra;
	  
	do {
		 a�o=pedirA�o();
		 mes=pedirMes();
		 dia=pedirDia();
		  
		 int edad;
		    
		   if (mes<mesActual)
			   edad= a�oActual-a�o;
		   else
			   edad= (a�oActual-a�o)-1;
		  
         System.out.println("Tu fecha de nacimiento es : " +dia+"/"+mes+"/"+a�o);
         System.out.println("Y tu edad es :" +edad);
         
         seguir =  JOptionPane.showInputDialog(null,"Seguir? (Si/No)");
         letra= seguir.charAt(0);
         
	 }while((letra !='N') && (letra !='n'));
	}

	
    static int[]MaxDiadelMes ={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	static int a�o;
	static int mes;
	static int dia;
	static int a�oActual=2021;
	static int mesActual=2;
	static int diaActual=7;
	static boolean bisiesto=false;
	
	
	public static int pedirA�o() {
		do {
		  a�o=Integer.parseInt(JOptionPane.showInputDialog("Introduzca su a�o de nacimiento:"));
		if (a�o<1910)
			JOptionPane.showMessageDialog(null,"Introduzca el a�o de nacimiento /nde una persona viva por favor ");
		}while(a�o<1910);
		  if ((a�o % 4 == 0) && ((a�o % 100 != 0) || (a�o % 400 == 0))) 
			 bisiesto = true;
		  else
		     bisiesto=false;
			 
			
		return a�o;
	}
	
    public static int pedirMes() {
		
    	do {
    		mes=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un mes:"));
     		if (mes<0 || mes>12)
    			JOptionPane.showMessageDialog(null,"Introduzca un mes valido por favor ");
    		}while(mes<0 || mes>12);
    	return mes;
    	
    	
     }public static int pedirDia() {
		
	   int indice;
	   do {
			dia=Integer.parseInt(JOptionPane.showInputDialog("Dia"));
			 indice = mes-1;
			 if(bisiesto)
			  MaxDiadelMes [1]=29;
			 if(bisiesto==false)
			  MaxDiadelMes [1]=28;
			 
			 if (dia>MaxDiadelMes[indice] )
				
				JOptionPane.showMessageDialog(null,"Introduzca un dia valido por favor");    	
			}while(dia>MaxDiadelMes[indice]);
	     return dia;
   }

}
