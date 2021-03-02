package trabajos_entregar;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileReader;


public class OperacionesMatematicasConFicheros {

	@SuppressWarnings("resource")
	public static void main(String[]args) throws IOException {
		
		
		//Preparando los objetos de lectura y escritura
	    PrintWriter salida =null;
	    FileReader fr=null;
		salida= new PrintWriter ("C:/PruebasFile/boletines.txt");
	    String ruta ="C:/PruebasFile/operaciones.txt";
		fr =new FileReader(ruta);
		@SuppressWarnings("resource")
		BufferedReader entrada =new BufferedReader(fr);
		
		String cadena =entrada.readLine();
		   System.out.println(cadena);
		cadena=quitarEspacios(cadena);
			System.out.println(cadena);
		
		
	   	 boolean valido=validarOperacion(cadena);
		
	    if(!valido) {
	    
				System.out.println(cadena+ " Operacion incorrecta");}

		
		  int PrimeraAparicion=cadena.indexOf('(');                              
	      int UltimaAparicion=cadena.lastIndexOf(')');
	  
	   // System.out.println(PrimeraAparicion);
	    System.out.println(UltimaAparicion);
	    
	    String operadores ="+-*/";
	    
	     String cadenaR=cadena.substring(PrimeraAparicion+1, UltimaAparicion);
	           
	     System.out.println(cadenaR);
	   
	     
	     
	      int  num1=Integer.valueOf(cadenaR.charAt(0));
	          num1=num1-48;
	          
	      int  num2=Integer.valueOf(cadenaR.charAt(2));
	          num2=num2-48;
	          
	      int resultado=0;
	     
	      if(cadenaR.charAt(1)=='+') {
	            System.out.println("Es una suma");;
	            resultado=sumar(num1,num2); 
		    	System.out.println(resultado);}
	    if(cadenaR.charAt(1)=='-') {
	    	    System.out.println("Es una resta");;
	    		resultado=restar(num1,num2); 
		    	System.out.println(resultado);}
	    if(cadenaR.charAt(1)=='*') {
	    	    System.out.println("Es una multiplicacion");
		        resultado=multiplicar(num1,num2); 
  	        System.out.println(resultado);}
	    	 
	    if(cadenaR.charAt(1)=='/') {
	    	    System.out.println("Es una division");
  		    resultado=dividir(num1,num2);  
	    	    System.out.println(resultado);}
	    	 
	          
	      
	            System.out.println(resultado);
	  
	            cadenaR= cadena.substring(UltimaAparicion+1, cadena.length()-1);
	      
	         if(cadenaR.charAt(0)=='+')
		         System.out.println("Es una suma");;
		     if(cadenaR.charAt(0)=='-')
		    	 System.out.println("Es una resta");;
		     if(cadenaR.charAt(0)=='*')
		    	 System.out.println("Es una multiplicacion");;
		     if(cadenaR.charAt(0)=='/')
		    	 System.out.println("Es una division");;
	    
		    	 
		    	 System.out.println(cadenaR);
		    	 int numC=convertirInt(cadenaR.charAt(1) , cadenaR);
		    	
		    	  System.out.println(numC);
		       
		          System.out.println(resultado);
		        
		          cadenaR=cadenaR.substring(2,cadenaR.length());
		        
		          numC= convertirInt(cadenaR.charAt(1) , cadenaR);
			    
		           System.out.println(numC);
		        
		      /*  if(cadenaR.charAt(0)=='+') {
			            System.out.println("Es una suma");;
			            resultado=sumar(resultado,numC); 
				    	System.out.println(resultado);}
			    if(cadenaR.charAt(0)=='-') {
			    	    System.out.println("Es una resta");;
			    		resultado=restar(resultado,numC); 
				    	System.out.println(resultado);}
			    if(cadenaR.charAt(0)=='*') {
			    	    System.out.println("Es una multiplicacion");
	    		        resultado=multiplicar(resultado,numC); 
		    	        System.out.println(resultado);}
			    	 
			    if(cadenaR.charAt(0)=='/') {
			    	    System.out.println("Es una division");
		    		    resultado=dividir(resultado,numC); 
			    	    System.out.println(resultado);}*/
			    	 
		    
		        
	}

	
	
//limpieza	
public static String quitarEspacios(String cadena) {
	String nuevaCadena;
	
	nuevaCadena=cadena.replaceAll(" ", "");
	
	return nuevaCadena;
	
}
//operaciones a realizar
public static int sumar(int num1, int num2) {
	
	int resultado=num1+num2;
	return resultado;
}
public static int restar(int num1, int num2) {
	
	int resultado=num1-num2;
	return resultado;
}
public static int multiplicar(int num1, int num2) {
	
	int resultado=num1*num2;
	return resultado;
}
public static int dividir(int num1, int num2) {
	
	int resultado=num1/num2;
	return resultado;
}
//identificar operaciones

public static boolean validarOperacion(String cadena) {
	boolean valido=false;
	int parentesisApertura=0;
	int parentesisCierre=0;
	
	
	
	
	
	      for(int i=0;i<cadena.length();i++) {
	    	  if(cadena.charAt(i)=='(' ) {
	    		  parentesisApertura++;
	    	  }
	    	  if( cadena.charAt(i)==')'){
	    		parentesisCierre++;
	    	  }
	       }
	
	      if(parentesisApertura==parentesisCierre)
	    	  valido=true;
	
	return valido;
}


public static int convertirInt(char carac ,String cadenaR) {
	
	 int num=Integer.valueOf(cadenaR.charAt(1));
	 
	 num=num-48;
	return num;
}


public static void identificarOperador(String cadena) {
	
	
	
}


}
