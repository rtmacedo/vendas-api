package com.free.vendas.api.config.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.free.vendas.api.model.Usuario;
import com.free.vendas.api.repository.UsuarioRepository;

@Service
public class AutenticacaoService implements UserDetailsService{
	
	@Autowired
	private UsuarioRepository repossitory;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Usuario> usuario = repossitory.findByEmail(username);
		
		if (usuario.isPresent()) {
			return usuario.get();
		}
		usuario = repossitory.findByUsuario(username);
		
		if (usuario.isPresent()) {
			return usuario.get();
		}
		return (UserDetails) new UsernameNotFoundException("Dados inválidos!");
	}

}
