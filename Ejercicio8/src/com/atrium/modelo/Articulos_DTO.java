package com.atrium.modelo;

public class Articulos_DTO {

	private Integer codigoarticulo;
	private String descripcionarticulo;
	private Double preciounidadarticulo;
	private Integer cantidad;

	public Integer getCodigoarticulo() {
		return codigoarticulo;
	}

	public void setCodigoarticulo(Integer codigoarticulo) {
		this.codigoarticulo = codigoarticulo;
	}

	public String getDescripcionarticulo() {
		return descripcionarticulo;
	}

	public void setDescripcionarticulo(String descripcionarticulo) {
		this.descripcionarticulo = descripcionarticulo;
	}

	public Double getPreciounidadarticulo() {
		return preciounidadarticulo;
	}

	public void setPreciounidadarticulo(Double preciounidadarticulo) {
		this.preciounidadarticulo = preciounidadarticulo;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

}
