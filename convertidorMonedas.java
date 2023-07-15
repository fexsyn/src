import javax.swing.JOptionPane;

public class convertidorMonedas {
	
	private double dolar = 16.94;
	private double euros = 18.82;
	private double libraEsterlina = 21.97;
	private double yenJapones = 0.12;
	private double sulCoreano = 75.56;
	
	
	public void setDolar(double dolar) {
		this.dolar = dolar;
	}

	public void setEuros(double euros) {
		this.euros = euros;
	}

	public void setLibraEsterlina(double libraEsterlina) {
		this.libraEsterlina = libraEsterlina;
	}

	public void setYenJapones(double yenJapones) {
		this.yenJapones = yenJapones;
	}

	public void setSulCoreano(double sulCoreano) {
		this.sulCoreano = sulCoreano;
	}

	public double getDolar() {
		return dolar;
	}
	
	public double getEuros() {
		return euros;
	}
	
	public double getLibraEsterlina() {
		return libraEsterlina;
	}
	
	public double getYenJapones() {
		return yenJapones;
	}
	
	public double getSulCoreano() {
		return sulCoreano;
	}
	
	public String menu() {
		
		String opciones[] = {"Conversor de Moneda", "Conversor de Temperatura"};
		
		String opc = (String) JOptionPane.showInputDialog(null,
				"Seleccione una opsion de conversor","Menu",
				JOptionPane.DEFAULT_OPTION,null,opciones,opciones[0]);
		
		//JOptionPane.showMessageDialog(null, "usted seleccionado " + opc);
		
		return opc;
	}
	
	public double pesos() {
		double pesos = 0;
		boolean estado = false;
		do {
			try {
				pesos = Double.parseDouble(JOptionPane.showInputDialog("Cantidad a convertir"));
				estado = true;
			}catch (NumberFormatException es) {
				System.out.println("no se pudo convertir");
				estado = false;
			}	
		}while (!estado);
		return pesos;
	}
	
	public String menuMonedas(){
		
		String opciones[] = {"Pesos a Dolar", "Pesos a Euro", "Pesos a Libra Esterlina", "Pesos a Yen Japones", "Pesos a Won sul-coreano",
							"Dolar a Pesos", "Euros a Pesos", "Libra Esterlina a Pesos", "Yen Japones a Pesos", "Won Sul-Coreano a Pesos"};
		String opc = (String) JOptionPane.showInputDialog(null,
				"Elija la moneda a la que deseas convertir tu dinero",
				"Monedas",JOptionPane.DEFAULT_OPTION,null,opciones,opciones[0]);
		return opc;
	}
	 
	
	public void dolares(double pesos) {
		double convertido = pesos / getDolar();
		JOptionPane.showMessageDialog(null, "Tienes $ " + String.format("%.2f",convertido) + " Dolares");
	}
	
	public void euros(double pesos) {
		double convertido = pesos / getEuros();
		JOptionPane.showMessageDialog(null, "Tienes $ " + String.format("%.2f",convertido) + " Euros");
	}
	
	public void esterlina(double pesos) {
		double convertido = pesos / getLibraEsterlina();
		JOptionPane.showMessageDialog(null, "Tienes $ " + String.format("%.2f",convertido)  + " LibraEsterlina");
	}
	
	public void yen(double pesos) {
		double convertido = pesos * getYenJapones();
		JOptionPane.showMessageDialog(null, "Tienes $ " + String.format("%.2f",convertido)  + " Yen Japones");
	}
	
	public void sul(double pesos) {
		double convertido = pesos / getSulCoreano();
		JOptionPane.showMessageDialog(null, "Tienes $ " + String.format("%.2f",convertido)  + " Won Sul-Coreano");
	}
	
	public void pesosDolares(double pesos) {
		double convertido = pesos * getDolar();
		JOptionPane.showMessageDialog(null, "Tienes $ " + String.format("%.2f",convertido)  + " Pesos");
	}
	
	public void pesosEuros(double pesos) {
		double convertido = pesos * getEuros();
		JOptionPane.showMessageDialog(null, "Tienes $ " + String.format("%.2f",convertido)  + " Pesos");
	}
	
	public void pesosEsterlina(double pesos) {
		double convertido = pesos * getLibraEsterlina();
		JOptionPane.showMessageDialog(null, "Tienes $ " + String.format("%.2f",convertido)  + " Pesos");
	}
	
	public void pesosYen(double pesos) {
		double convertido = pesos / getYenJapones();
		JOptionPane.showMessageDialog(null, "Tienes $ " + String.format("%.2f",convertido)  + " Pesos");
	}
	
	public void pesosSul(double pesos) {
		double convertido = pesos * getSulCoreano();
		JOptionPane.showMessageDialog(null, "Tienes $ " + String.format("%.2f",convertido)  + " Pesos");
	}
	
	public int continuar() {
		int opc =JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
		return opc;
	}
	
	public void terminar() {
		JOptionPane.showMessageDialog(null, "Programa terminado");
	}
	
	public double centigrados() {
		double centigrados = 0;
		boolean estado = false;
		do {
			try {
				centigrados = Double.parseDouble(JOptionPane.showInputDialog("Centigrados a convertir en Fahrenheit"));
				estado = true;
			}catch (NumberFormatException es) {
				System.out.println("no se pudo convertir");
				estado = false;
			}	
		}while (!estado);
		return centigrados;
	}
	//String.format("%.2f",convertido)
	public void conversion(double centigrados) {
		double convertido = (centigrados * 1.8000) + 32;
		JOptionPane.showMessageDialog(null, "los grados convertids son " + convertido  + " °F");
	}
}