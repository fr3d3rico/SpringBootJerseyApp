package com.springbootjerseyapp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springbootjerseyapp.bean.Pessoa;

@Service
public class PessoaService {
	
	public List<Pessoa> getPessoas() {
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		pessoas.add(new Pessoa(10, "Fred"));
		pessoas.add(new Pessoa(20, "SpringBoot + Jersey"));
		
		return pessoas;
	}
	
	public Pessoa getPessoa(long id) {
		Pessoa pessoa = new Pessoa();
		
		pessoa.setId(id);
		
		return pessoa;
	}

}
