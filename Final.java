package com.mycompany.sem_2;
import javax.swing.JOptionPane;
public class Final {
 public double ingre,  total=0;
 public int niño=0, adul=0, mayor=0,adolecente=0,entradas,j,l, tota,mas,lou,tol;
 public void datos() {
    /*bol=Byte.parseByte(JOptionPane.showInputDialog("ingrese lo que requiere "));
    if(entradas==1){*/
    ingre=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de boletos"));
        for (short c=1; c<=ingre; c++) {
            int edad=0;
                edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la persona q desea comprar el boleto"));
                if (edad<=12) {
                    JOptionPane.showMessageDialog(null,"Eres un niño");
                    niño=niño+1;
                }
                else if (edad>=13 && edad<=17 ){
                    JOptionPane.showMessageDialog(null,"Eres un adolecente");
                    adolecente=adolecente+1;
                }
                else if (edad>=12 && edad<=65) {
                    JOptionPane.showMessageDialog(null,"Eres un adulto");
                    adul=adul+1;
		}
                else {
                    JOptionPane.showMessageDialog(null,"Eres un abuelo");
                    mayor=mayor+1;
                }
	    }
	}
    public void operaciones() {
        tota = niño*200;
        mas=adolecente*350;
        lou=adul*350;
        l=(int) (mayor*(350-(350*0.30)));
        j=(byte) (niño+adul+mayor+adolecente);
        tol  = tota+mas+lou+l;
    }
    public void mostrar() {
        JOptionPane.showMessageDialog(null,"Total en dinero"+"\t"+tol+"\n"+"Total entradas"+j+"\t");       
    }
    public void oda (){
        byte y;
        y=Byte.parseByte(JOptionPane.showInputDialog( "Quieres mas entradas"));
        if(y==1){
            datos();
            operaciones();
            mostrar();
        }
        else if (y==2){
            JOptionPane.showMessageDialog(null,"gracias por su compra");
        }
    }
    public void dos(){
        short g;
        g=(short) (adul+mayor+adolecente+niño);
        total=(niño)+(adul)+(adolecente)+(mayor);
        JOptionPane.showMessageDialog(null,"total en ventas"+g+"\t"+total);
    }   
}
