package com.free.vendas.api.resource;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.free.vendas.api.controller.form.LoginForm;

@RestController
@RequestMapping("/auth")
public class AutenticacaoController {
	
	@PostMapping
	public ResponseEntity<?> autenticar(@RequestBody @Valid LoginForm form ) {
		System.out.println(form.getLogin());
		return ResponseEntity.ok().build();
	}
}
