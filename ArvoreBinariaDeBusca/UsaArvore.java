public class UsaArvore{
	public static void main(String args[]){
		
		Elemento elem = new Elemento(0);

		Arvore arvore = new Arvore(new Elemento(10));
		arvore.insereElemento(new Elemento(5));
		arvore.insereElemento(new Elemento(1));
		arvore.insereElemento(new Elemento(8));
		arvore.insereElemento(new Elemento(15));
		arvore.insereElemento(new Elemento(12));
		arvore.insereElemento(new Elemento(18));

		// System.out.println("O elemento 5 " + (arvore.encontrarElemento(5) ? "existe" : "não existe") );
		// System.out.println("O elemento 12 " + (arvore.encontrarElemento(12) ? "existe" : "não existe") );
		// System.out.println("O elemento 18 " + (arvore.encontrarElemento(18) ? "existe" : "não existe") );
		// System.out.println("O elemento 34 " + (arvore.encontrarElemento(34) ? "existe" : "não existe") );

		// arvore.imprimirPreOrdem();
		// arvore.imprimirInOrdem();
		// arvore.imprimirPosOrdem();

		arvore.imprimirEmOrdem();
		System.out.println("");

		elem.setValor(18);
		arvore = arvore.removeElemento(elem);

		System.out.println("Nova arvore.....");
		arvore.imprimirEmOrdem();
		System.out.println("");


	}
}