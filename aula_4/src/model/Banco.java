package model;

import java.util.ArrayList;

public class Banco {
	private String nome_banco;
	private String certificado_autorizacao;
    private ArrayList <Usuario> usuarios;
	public String getNomeBanco() {
		return nome_banco;
	}
	
	public String getCerticadoAutorizacao() {
		return certificado_autorizacao;
	}
	
	public void setNomeBanco (String Nome) {
		this.nome_banco = Nome;
	}
	
	public void setCertificadoAutorizacao (String Certificado) {
	this.certificado_autorizacao = Certificado;
}
	public String CriarUsuario(String Nome, String CPF, String Email, String Celular, String Senha) {
		Usuario usuarioNovo = new Usuario(Nome,CPF,Email,Celular,Senha);
		usuarios.add(usuarioNovo);
		return "Usuario cadastrado com sucesso";
	}
}