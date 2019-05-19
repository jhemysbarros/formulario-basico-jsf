package br.unitins.formulario.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.unitins.formulario.model.Contato;

@Named
@RequestScoped

public class ContatoController {
	
	private Contato usuario = new Contato();    
	
	public void enviar() {
		System.out.println("Nome: " + getUsuario().getNome());
		
		System.out.println("E-mail: " + getUsuario().getEmail());
		
		System.out.println("Nome: " + getUsuario().getMensagem());		
	}

	public Contato getUsuario() {
		return usuario;
	}

	public void setUsuario(Contato usuario) {
		this.usuario = usuario;
	}
}