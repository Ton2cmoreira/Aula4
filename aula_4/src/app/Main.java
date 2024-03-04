package app;

import model.Usuario;
import view.Mensagens;

public class Main {

	public static void main(String[] args) {
		
		Mensagens  mensagem = new Mensagens ();
		
		String Nome, CPF, Celular, Email, Senha;
        String opcao;		
		mensagem.mostrarInformacao("Seja Bem Vindo");
		
		do {
			mensagem.mostrarInformacao("Cadastro de Usuario");
			
			Nome = mensagem.solicitarEntrada("Digite o seu Nome");
			CPF = mensagem.solicitarEntrada("Digite o seu CPF");
			Celular = mensagem.solicitarEntrada("Digite o seu Celular");
			Email = mensagem.solicitarEntrada("Digite o seu Email");
			Senha = mensagem.solicitarEntrada("Digite a sua Senha");
			Usuario usuario = new Usuario (Nome,CPF,Celular,Email,Senha);
			mensagem.mostrarMensagemDeSucesso(usuario.getUsuario());
			opcao = "ok";
				
		} while (opcao == "ok");

	}

}
































