package view;
import java.util.Iterator;
import java.util.List;
import control.CategoriaControle;
import model.Categoria;

public class Programa {
	public static void main(String[] args) {
		//inserindo  comit
		Categoria novo = new Categoria(null, "Festa");		
		CategoriaControle controle = new CategoriaControle();	
		controle.inserir(novo);
		
		//buscando
		novo = controle.buscarPorId(3); //o id 3 precisa existir no banco, modifique o valor
		System.out.println(novo.getTipo()); // substitua por um método get do seu projeto
		
		//modificando
		novo.setTipo("TESTE"); // no seu caso utilize um método set do seu projeto
		controle.alterar(novo);
		
		//buscar todos
		List<Categoria> objetos = controle.buscarTodos();
		for (Iterator iterator = obj.iterator(); iterator.hasNext();) {
			Categoria obj = (Categoria) iterator.next();
			System.out.println(obj.getTipo());
		}
		
		//excluir
		controle.excluir(objetos.get(0));
		
		//excluir por id
		controle.excluirPorId(3); //o id 3 precisa existir no banco, modifique o valor	
	}
}
