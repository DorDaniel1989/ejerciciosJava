package recursividad;

import javax.swing.*;

public class NumApocaRecur {

	public static void main(String[] args) {
		
		int num = 0;
		
		boolean bFallo = false;
		
		do {
			try {
				bFallo = false;
				num = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un n�mero:"));
			
			}catch(NumberFormatException e) {
			
				JOptionPane.showMessageDialog(null, "He fallado");
				bFallo = true;
			}
			
		}while(bFallo);
		
		
		
		if(numApo(num)) {
			JOptionPane.showMessageDialog(null, "El n�mero " + num + " es apocal�ptico");
		}else {
			JOptionPane.showMessageDialog(null, "El n�mero " + num + " no es apocal�ptico");
		}
		
	}
	
	
	public static boolean numApo(int num) {
		if(num < 100) {
			return false;
		}else {
			if(num%10 == 6 && num%1000 == 666) {
				return true;
			}else {
				return numApo(num/10);
			}
		}
	}
}
