import javax.swing.JOptionPane;

public class testConvertidor {
	
	public static void main(String[] args) {
		
		double pesos = 0;
		double centigrados = 0;
		String opc ="";
		int respuesta = 0;
		boolean esc = false;
		
		convertidorMonedas ejemplo1 = new convertidorMonedas();
		
		if(ejemplo1.menu() == "Conversor de Moneda") {
			
			do {
				pesos = ejemplo1.pesos();
				opc= ejemplo1.menuMonedas();
				
				switch (opc){
				case "Pesos a Dolar":{
					ejemplo1.dolares(pesos);
					respuesta = ejemplo1.continuar();
					if(respuesta == 0) {
						break;
					}else {
						ejemplo1.terminar();
						esc = true;
					}
					break;
				}
				case "Pesos a Euro":{
					ejemplo1.euros(pesos);
					respuesta = ejemplo1.continuar();
					if(respuesta == 0) {
						break;
					}else {
						ejemplo1.terminar();
						esc = true;
					}
					break;
				}
				case "Pesos a Libra Esterlina":{
					ejemplo1.esterlina(pesos);
					respuesta = ejemplo1.continuar();
					if(respuesta == 0) {
						break;
					}else {
						ejemplo1.terminar();
						esc = true;
					}
					break;
				}
				case "Pesos a Yen Japones":{
					ejemplo1.yen(pesos);
					respuesta = ejemplo1.continuar();
					if(respuesta == 0) {
						break;
					}else {
						ejemplo1.terminar();
						esc = true;
					}
					break;
				}
				case "Pesos a Won sul-coreano":{
					ejemplo1.sul(pesos);
					respuesta = ejemplo1.continuar();
					if(respuesta == 0) {
						break;
					}else {
						ejemplo1.terminar();
						esc = true;
					}
					break;
				}
				case "Dolar a Pesos":{
					ejemplo1.pesosDolares(pesos);
					respuesta = ejemplo1.continuar();
					if(respuesta == 0) {
						break;
					}else {
						ejemplo1.terminar();
						esc = true;
					}
					break;
				}
				case "Euros a Pesos":{
					ejemplo1.pesosEuros(pesos);
					respuesta = ejemplo1.continuar();
					if(respuesta == 0) {
						break;
					}else {
						ejemplo1.terminar();
						esc = true;
					}
					break;
				}
				case "Libra Esterlina a Pesos":{
					ejemplo1.pesosEsterlina(pesos);
					respuesta = ejemplo1.continuar();
					if(respuesta == 0) {
						break;
					}else {
						ejemplo1.terminar();
						esc = true;
					}
					break;
				}
				case "Yen Japones a Pesos":{
					ejemplo1.pesosYen(pesos);
					respuesta = ejemplo1.continuar();
					if(respuesta == 0) {
						break;
					}else {
						ejemplo1.terminar();
						esc = true;
					}
					break;
				}
				case "Won Sul-Coreano a Pesos":{
					ejemplo1.pesosSul(pesos);
					respuesta = ejemplo1.continuar();
					if(respuesta == 0) {
						break;
					}else {
						ejemplo1.terminar();
						esc = true;
					}
					break;
				}
				}
			}while(esc == false);

		}else {
			do {
				centigrados = ejemplo1.centigrados();
				ejemplo1.conversion(centigrados);
				respuesta = ejemplo1.continuar();
				if(respuesta == 1) {
					ejemplo1.terminar();
					esc = true;
					break;
				}
			}while(esc == false);
		}
	
	}
}
