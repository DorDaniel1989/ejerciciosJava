import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.text.Normalizer;

public class ejerciciosFile {

	public  static void main (String[]args) throws IOException {
		
		    
		    FileReader fr =null;
	        String ruta = "C:/PruebasFile/notas.txt";
		   
	        
	        
	        fr =new FileReader(ruta);
	        BufferedReader entrada= new BufferedReader(fr);
            File fichero=new File("C:/PruebasFile/resultados.txt");
	        String  cadena =entrada.readLine();
            while(cadena!=null) {
            	           
               
               String nuevaCadena= cadena.replace(';', ' ');
            
               
              
               String cadenaResul="";
               String[] notas = new String[6];
               int []notasEnteras=new int[6];
               int suma=0;
               long media=0;
             
               cadenaResul=cadenaResul+nuevaCadena.charAt(0);
               cadenaResul=cadenaResul+".";
              
               int i=1;
               while(nuevaCadena.charAt(i)!=' ' )
                   i++;
               
               do {
            	   cadenaResul=cadenaResul+nuevaCadena.charAt(i);
            			i++;   
               }while(nuevaCadena.charAt(i)!=' ');
               
               int restoCadena=i;
               int x=0;
               //tratar los numeros
                for(int j=restoCadena ; j<nuevaCadena.length();j++) {
            	 
                	if(nuevaCadena.charAt(j)!=' ') {
            		   notas[x]= String.valueOf(nuevaCadena.charAt(j));
                	         x++;}
                }	
               
               for(i=0;i<notasEnteras.length;i++) {
            	   notasEnteras[i]=Integer.parseInt(notas[i]);
               }
               
                for(int k=0;k<notas.length;k++) {
            	   
            	      suma=suma+notasEnteras[k];
            	   
               }
                 media=suma/6;
                 //media=(long) 9.54;
                
                 cadenaResul=cadenaResul+"  "+media;
                 
                 
                 if(media<=5)
                	 cadenaResul=cadenaResul + "  SUSPENSO";
                 if(media>5 && media<6)
                	 cadenaResul=cadenaResul + "  SUFICIENTE";
                 if(media>=6&& media<7)
                	 cadenaResul=cadenaResul + "  BIEN";
                 if(media>=7 && media<=8)
                	 cadenaResul=cadenaResul + "  NOTABLE";
                 if(media>=8 && media<=10)
                	 cadenaResul=cadenaResul + "  SOBRESALIENTE";
                 
                 System.out.println(cadenaResul);
                 cadena =entrada.readLine();
            }
	}
	

	


	}




               
               
              
               
               
               /*	try {
              
				
				   JOptionPane.showMessageDialog(null,cadena);
				   int i=0;
				   int suma = 0;
				   String cadenaResul="";
				 
				   while(i <cadena.length()-1) {
					   
					   //Cogemos la primera letra y le a�adimos un punto
					  cadenaResul=cadenaResul+cadena.charAt(i);
					  cadenaResul=cadenaResul+". ";
					  
					    //Obviamos el resto de letras del nombre
					  while(cadena.charAt(i)!=' ') {
						     i++;
				    	    }	
					     i++;
					     
					  if(cadena.charAt(i)!=' ') {
						while (cadena.charAt(i) !=';') {
							cadenaResul=cadenaResul+cadena.charAt(i);
							i++;
						}
					}
					System.out.println(cadenaResul);
					//calculamos media
					
					while(cadena != null ) {
					    if(cadena.charAt(i)==';') {
						i++;
				     	}
						suma= suma+  Character.getNumericValue(cadena.charAt(i));
						System.out.println(suma);
						if((cadena.charAt(i+1))==';')
						  i++;
						if(cadena.charAt(i+1)==-1) {
							break;
						}
					}
					int media=suma/6;
					System.out.println(cadenaResul);
					cadenaResul = cadenaResul+ "       " + media;
				    System.out.println(cadenaResul);
				
				    
				    //cadena =entrada.readLine();
			       }
			
			
	
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}*/
			

