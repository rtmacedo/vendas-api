package com.free.vendas.api.controller.dto;

import lombok.Data;

@Data
public class TokenDto {

	private String token;
	private String string;

	public TokenDto(String token, String string) {
		this.token = token;
		this.string = string;
	}

}
