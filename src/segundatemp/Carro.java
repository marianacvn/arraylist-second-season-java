package segundatemp;

public class Carro {
	Pneu pneu;
	String nome;
	String marca;
	String motor;
	
	public Carro(Pneu pneu, String nome, String marca, String motor) {
		super();
		this.pneu = pneu;
		this.nome = nome;
		this.marca = marca;
		this.motor = motor;
	}
	
	public void destroyd() {
		Carro carro = null;
		System.gc();
	}
	
	
	
	@Override
	public String toString() {
		return "Carro [pneu=" + pneu + ", nome=" + nome + ", marca=" + marca + ", motor=" + motor + "]";
	}

	public static void main(String[] args) {
		Pneu pneu = new Pneu("we", 7, "qqq");
		Carro carro = new Carro(pneu, "ffff", "ffff", "788");
		
		carro.destroyd();
		System.out.println(carro);
	}
	

}
