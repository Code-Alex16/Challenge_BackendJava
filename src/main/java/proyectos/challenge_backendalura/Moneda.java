package proyectos.challenge_backendalura;

import javax.swing.JOptionPane;
/*
Convertir de la moneda de tu país a Dólar y Viceversa
      - Convertir de la moneda de tu país  a Euros
      - Convertir de la moneda de tu país  a Libras Esterlinas
      - Convertir de la moneda de tu país  a Yen Japonés
      - Convertir de la moneda de tu país  a Won sul-coreano
*/
public class Moneda {
   
    //Metodos Para Convertir de Moneda local a las requeridas	
    public void Dolar_a_Euros(double valor,double tasa) {
	double monedaEuro = valor * tasa;
	monedaEuro = (double) Math.round(monedaEuro *100d)/100;
	JOptionPane.showMessageDialog(null, "Tienes $ " +monedaEuro+ " Euros");
    }
	
    public void Dolar_a_Libra(double valor,double tasa) {
	double monedaLibra = valor * tasa;
        monedaLibra = (double) Math.round(monedaLibra *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaLibra+ " Libras Esterlinas");
    }
	
    public void Dolar_a_Yen(double valor,double tasa) {
	double monedaYen = valor * tasa;
        monedaYen = (double) Math.round(monedaYen *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaYen+ " Yuanes");
    }
	
    public void Dolar_a_Won(double valor,double tasa) {
        double monedaWon = valor * tasa;
        monedaWon = (double) Math.round(monedaWon *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaWon+ " Wons");
    }
    
    //Metodos para convertir de las Opciones a la Moneda Local
    
    public void Euro_A_Dolar(double valor, double tasa){
        double resultado = valor / tasa;
        resultado = (double) Math.round(resultado * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $" + resultado + " Dólares");
    }
    
    public void Libra_A_Dolar(double valor, double tasa){
        double resultado = valor / tasa;
        resultado = (double) Math.round(resultado * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $" + resultado + " Dólares");
    }
    
    public void Yen_A_Dolar(double valor, double tasa){
        double resultado = valor / tasa;
        resultado = (double) Math.round(resultado * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $" + resultado + " Dólares");
    }
    
    public void Won_A_Dolar(double valor,double tasa){
        double resultado = valor / tasa;
        resultado = (double) Math.round(resultado * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $" + resultado + " Dólares");
    }
}
