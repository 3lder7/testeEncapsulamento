//DTO = Transferência de Objetos
public class pessoaDTO {
	
	private String nome; //Só é possível trabalhar com essa variável através dos métodos acessores (Get e Set)
	
	//RECEBER e ARMAZENAR
	public void setNome(String nomeFora) {//Método // Dentro dos parênteses = Recebe essa informação de outro lugar
		this.nome = nomeFora; //this.nome = Referência a variável nesta classe, na linha 4
						  //O que for recebido na variável "nomeFora" entre (), é armazenado dentro de nome 
	}
	
	//PUXAR e RETORNAR 
	public String getNome() {//Não é "void" pois retorna um valor do tipo String, por isso que é "get"
		return nome;
	}
}
