package jana60.bank;

import java.util.Random;

public class Conto {
	
	private int numeroConto;
	private String nomeProprietario;
	private int saldo;
	public int deposito;
	
	Random r = new Random();
	
	public Conto(String nomeProprietario) {
		
		saldo = 0;
		numeroConto = r.nextInt(1, 1001);
		setNomeproprietario(nomeProprietario);
	}
	
//	-------------------------------------------
	
	public int GetSaldo() {
		return saldo;
	}
	
//	-------------------------------------------
	
	public int getNumeroConto() {
		return numeroConto;
	}
	
	
//	-------------------------------------------
	
	public String getNomeproprietario() {
		return nomeProprietario;
	}
	
	public void setNomeproprietario(String nomeProprietario){
		this.nomeProprietario = nomeProprietario;
	}
	
//	-------------------------------------------
	
	public boolean getMoney(int amount) {
		
		if (amount < 0) return false;
		
			if (amount <= saldo) {
				
				saldo -= amount;
				return true;
			}
			
			
			return false;
		}
	
	public void putMoney(int amount) {
		
		saldo = saldo + amount;
	}
	
	@Override
	public String toString() {

		return "nome del conto:" + getNomeproprietario()
			+ "\n" + "saldo contabile:" + GetSaldo() + "$"
			+ "\n" + "numero conto:" + getNumeroConto();
	}
}


