


package Trabalho_03;

//------------------------------//

//Eu entendi tudo certinho. So preciso praticar mais. Valeu ai Professor//

public class App {
		   

	public static void main(String[] args) {
		Veiculo mustang = new Veiculo(new MotorMustang());
		Veiculo porche = new Veiculo(new MotorFerrari());
		Veiculo ferrari = new Veiculo(new MotorFerrari());
		Veiculo bmw = new Veiculo(new MotorBMW());
		Veiculo golf = new Veiculo(new MotorBMW());
		
		
		System.out.println (mustang.acelerar());
		System.out.println (porche.acelerar());
		System.out.println (ferrari.acelerar());
		System.out.println (bmw.acelerar());
		System.out.println (golf.acelerar());
		
	    
	    									}
		

				}
