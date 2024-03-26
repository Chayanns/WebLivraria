package br.com.weblivraria.dominio;

public class DetalhePedido {
	private Integer iddetalhepedido;
	private Integer idpedido;
	private Integer livro;
	private Integer quantidade;
	private Double precototal;
	
	public Integer getIddetalhepedido() {
		return iddetalhepedido;
	}
	public void setIddetalhepedido(Integer iddetalhepedido) {
		this.iddetalhepedido = iddetalhepedido;
	}
	public Integer getIdpedido() {
		return idpedido;
	}
	public void setIdpedido(Integer idpedido) {
		this.idpedido = idpedido;
	}
	public Integer getLivro() {
		return livro;
	}
	public void setLivro(Integer livro) {
		this.livro = livro;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public Double getPrecototal() {
		return precototal;
	}
	public void setPrecototal(Double precototal) {
		this.precototal = precototal;
	}

}
