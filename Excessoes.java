package principal;

public class ClasseA {
	public void metodo1(){
		System.out.println("Inicio 1");
		metodo2();
		System.out.println("Fim 1");
	}


	public void metodo2(){
		System.out.println("Inicio 2");
		try{
		metodo3();
		}catch (Exception e){
			e.printStackTrace();
		}
		System.out.println("Fim 2");
	}

	public void metodo3() throws Exception{
		System.out.println("Inicio 3");
		try{
			metodo4();
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("...");
			throw new Exception("O metodo 4 sobreviveu");
		}
		System.out.println("Fim 3");
	}
	public void metodo4(){
		System.out.println("Inicio 4");
		int [] num = new int[10];
		int num1 = num [10];
		System.out.println("Fim 4");
	}
}
