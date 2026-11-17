
import javax.swing.JOptionPane;

public class RepasoEstructurada {

    //HOLA MUNDO
    //psvm+tab
    public static void main(String[] args) {
        //sout+tab
        System.out.println("HOLA MUNDO");
        
        //SUMA DE 2 NÚMEROS
        //JOptionPane->Métodos con GUI
        double n1 = Double.parseDouble(JOptionPane.showInputDialog(
                null, "Ingrese un número:"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog(
                null, "Ingrese un número:"));
        double suma = n1 + n2;
        System.out.println("La suma es:" + suma);

        //E1 - Cálculo de promedio
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog(
                null, "E1. Ingrese la primera calificación:"));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog(
                null, "E1. Ingrese la segunda calificación:"));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog(
                null, "E1. Ingrese la tercera calificación:"));
        double promedio = (nota1 + nota2 + nota3) / 3;
        System.out.println("El promedio es:" + promedio);

        //E2 - Edad de la madre al dar a luz
        int edadMadre = Integer.parseInt(JOptionPane.showInputDialog(
                null, "E2. Ingrese la edad actual de la madre:"));
        int edadHijo = Integer.parseInt(JOptionPane.showInputDialog(
                null, "E2. Ingrese la edad actual del hijo:"));
        int edadAlDarALuz = edadMadre - edadHijo;
        System.out.println("La madre dio a luz a los:" + edadAlDarALuz + " años");

        //E3 - Conversión de unidades (Pesos colombianos a dólares)
        double pesosCOP = Double.parseDouble(JOptionPane.showInputDialog(
                null, "E3. Ingrese la cantidad en pesos colombianos:"));
        double tasaCambio = Double.parseDouble(JOptionPane.showInputDialog(
                null, "E3. Ingrese el valor de 1 dólar en pesos colombianos:"));
        double dolares = pesosCOP / tasaCambio;
        System.out.println("Equivalen a:$" + dolares + " USD");

        //E4 - Área y perímetro de un círculo
        double radio = Double.parseDouble(JOptionPane.showInputDialog(
                null, "E4. Ingrese el radio del círculo:"));
        double areaCirculo = Math.PI * Math.pow(radio, 2);
        double perimetroCirculo = 2 * Math.PI * radio;
        System.out.println("Área del círculo:" + areaCirculo);
        System.out.println("Perímetro del círculo:" + perimetroCirculo);

        //E5 - Área y perímetro de un rombo
        double diagMayor = Double.parseDouble(JOptionPane.showInputDialog(
                null, "E5. Ingrese la diagonal mayor:"));
        double diagMenor = Double.parseDouble(JOptionPane.showInputDialog(
                null, "E5. Ingrese la diagonal menor:"));
        double ladoRombo = Double.parseDouble(JOptionPane.showInputDialog(
                null, "E5. Ingrese el lado del rombo:"));
        double areaRombo = (diagMayor * diagMenor) / 2;
        double perimetroRombo = 4 * ladoRombo;
        System.out.println("Área del rombo:" + areaRombo);
        System.out.println("Perímetro del rombo:" + perimetroRombo);
    }
}
