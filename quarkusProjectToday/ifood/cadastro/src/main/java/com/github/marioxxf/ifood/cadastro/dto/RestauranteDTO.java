package com.github.marioxxf.ifood.cadastro.dto;

import java.sql.Date;

public class RestauranteDTO {
	public Long id;

    public String proprietario;

    public String cnpj;

    public String nomeFantasia;

    public LocalizacaoDTO localizacao;

    public Date dataCriacao;
}
