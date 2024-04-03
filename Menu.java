import Yarely_3102.Selectiva_Switch;
import Yarely_3102.Multi;
import Yarely_3102.Materias;
import Yarely_3102.Números;
import Yarely_3102.Arreglos;
import Yarely_3102.barco;
import Yarely_3102.Promedios;
import Yarely_3102.Factorial;
import Yarely.Cafeteria1;
import Yarely.Comparasion;
import Yarely.VACUNAS;
import Yarely.Binario;
import Yarely.autobuses;
import javax.swing.JOptionPane;
public class Menu {
    public static void main(String[] args) {
        byte op;
        op = Byte.parseByte(JOptionPane.showInputDialog("Capture el número del programa que desea ejecutar \n 1.- Sorteo Cafeteria \n 2.- Comparacion de 3 números \n 3.- Vacunación Mascotas \n 4.- Cálculo de Promedio \n 5.- Converción Decimal a Binarios \n 6.- Viaje de Autobuses \n 7.- Factorial \n 8.- Dibujo con ciclos \n 9.-Ejercicio Switch-case \n 10.- Suma y Multiplicacion con ciclos \n 11.- Verctor \n 12.- Promedio con Matrices \n 13.- Examen Arreglos"));
        switch (op){
            case 1: Cafeteria1 obj = new Cafeteria1();
            obj.calcularDescuentos();
            break;
            case 2: Comparasion obj0 = new Comparasion();
            obj0.numeros();
            break;
            case 3: VACUNAS obj1 = new VACUNAS();
            obj1.vacunasMascotas();
            break;
            case 4: Promedios obj10 = new Promedios();
            obj10.promedia();
            break;
            case 5: Binario obj2 = new Binario();
            obj2.decimalBinario();
            break;
            case 6: autobuses obj3 = new autobuses();
            obj3.viejesAutobuses();
            break;
            case 7: Factorial obj11 = new Factorial();
            obj11.factor();
            break;
            case 8: barco obj4 = new barco();
            obj4.dibujoMoño();
            break;
            case 9: Selectiva_Switch obj5 = new Selectiva_Switch();
            obj5.seleccionSwitch();
            break;
            case 10: Números obj6 = new Números();
            obj6.sumaMultiplicacion();
            break;
            case 11: Arreglos obj7 = new Arreglos();
            obj7.vectores();
            break;
            case 12: Materias obj8 = new Materias();
            obj8.materiasMatriz();
            break;
            case 13: Multi obj9 = new Multi();
            obj9.multiplicacion();
            break;
        }
    }
}
