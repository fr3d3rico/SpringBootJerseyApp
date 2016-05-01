package com.springbootjerseyapp.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import com.springbootjerseyapp.bean.Pessoa;
import com.springbootjerseyapp.services.PessoaService;

@Path("/pessoa")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PessoaResource {
	
	@Autowired
	private PessoaService pessoaService;

	@GET
	public List<Pessoa> getPessoas() {
		return pessoaService.getPessoas();
	}
	
	@GET
	@Path("/{id}")
	public Pessoa getPessoa(@PathParam("id") Long id) {
		Pessoa pessoa = new Pessoa();
		
		pessoa.setId(id);
		
		return pessoa;
	}

	public PessoaService getPessoaService() {
		return pessoaService;
	}

	public void setPessoaService(PessoaService pessoaService) {
		this.pessoaService = pessoaService;
	}
	
	
	
}
