import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class Menu {

	public static void main(String[] args) throws Exception {
		PessoaDao pd = new PessoaDao();
	//	try {
			//Incluir uma pessoa
			/*Pessoa p1 = new Pessoa(1,"jose", "jose@gmail.com");
			Pessoa p2 = new Pessoa(2, "joao", "joao@gmail.com");
			pd.incluirPessoa(p1);
			pd.incluirPessoa(p2); */
			
			// Alterar uma pessoa
			// - Verificar se o código da pessoa existe
			// - Alterar a informação desejada usando o (Classe encapsulado)
			
			Pessoa pes = pd.consultarPessoaIndividual(2);
			if (pes != null) {
			    pes.setEmail("jose233@gmail.com");
			
			//Chamar o método que tem comando update
			pd.alterarPessoa(pes);
			
			List<Pessoa> listaPessoas = pd.ListarPessoas();
			
		    for(Pessoa p: listaPessoas) {
				System.out.println(p);
			}			
			
        }
	}
	
}
	
		
		    /*
			// Excluir uma pessoa
			// verificar se a pessoa existe por código
			Pessoa pessoa1 = pd.consultarPessoaIndividual(1);
			// chamar o método que contém o comando delete
			pd.excluirPessoa(pessoa1);
			//Listando todas as pessoas
			List<Pessoa> listaPessoas = pd.ListarPessoas();
			
			for(Pessoa p: ListaPessoa) {
				System.out.println(p);
			}
			*/
			
	/*	} catch (Exception e){
			System.out.println("Error: " + e.getMessage());
		}*/
				

	//}

//}
