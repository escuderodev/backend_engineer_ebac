package br.com.escuderodev.domain;

/**
 * 
 * @author escuderodev
 *
 */

import java.util.Objects;

public class Cliente {

	private String nome;
	private Long cpf;
	private Long tel;
	private String endereco;
	private Integer numero;
	private String cidade;
	private String estado;

	public Cliente(String nome, String cpf, String tel, String endereco, String numero, String cidade, String estado) {

		this.nome = nome;
		this.cpf = Long.valueOf(cpf.trim());
		this.tel = Long.valueOf(tel.trim());
		this.endereco = endereco;
		this.numero = Integer.valueOf(numero.trim());
		this.cidade = cidade;
		this.estado = estado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public Long getTel() {
		return tel;
	}

	public void setTel(Long tel) {
		this.tel = tel;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(cpf, other.cpf);
	}

	@Override
	public String toString() {

		return "Cliente [nome: " + nome + ", CPF: " + cpf + ", Telefone: " + tel + ", Endereço: " + endereco + ", Nº: " + numero + ", Cidade: " + cidade + ", UF: " + estado + "]";
	}

}
