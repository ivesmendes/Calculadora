package com.ivesworks.servlet.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CalculadoraBean implements Serializable{
	private static final long serialVersionUID = 1L;
	
	
	private Double valorSomaA;
	private Double valorSomaB;
	private Double valorSubA;
	private Double valorSubB;
	private Double valorMultA;
	private Double valorMultB;
	private Double valorDivA;
	private Double valorDivB;
	private Double resultadoSoma;
	private Double resultadoSub;
	private Double resultadoMult;
	private Double resultadoDiv;
	
	public void somar() {
		this.resultadoSoma = this.valorSomaA + this.valorSomaB;
	}
	
	public void subtrair() {
		this.resultadoSub = this.valorSubA - this.valorSubB;
	}
	
	public void multiplicar() {
		this.resultadoMult = this.valorMultA * this.valorMultB;
	}
	
	public void dividir() {
		this.resultadoDiv = this.valorDivA / this.valorDivB;
	}
	
	public Double getResultadoSub() {
		return resultadoSub;
	}

	public void setResultadoSub(Double resultadoSub) {
		this.resultadoSub = resultadoSub;
	}

	public Double getResultadoMult() {
		return resultadoMult;
	}

	public void setResultadoMult(Double resultadoMult) {
		this.resultadoMult = resultadoMult;
	}

	public Double getResultadoDiv() {
		return resultadoDiv;
	}

	public void setResultadoDiv(Double resultadoDiv) {
		this.resultadoDiv = resultadoDiv;
	}

	public Double getResultadoSoma() {
		return resultadoSoma;
	}
	public void setResultadoSoma(Double resultadoSoma) {
		this.resultadoSoma = resultadoSoma;
	}

	public Double getValorSomaA() {
		return valorSomaA;
	}

	public void setValorSomaA(Double valorSomaA) {
		this.valorSomaA = valorSomaA;
	}

	public Double getValorSomaB() {
		return valorSomaB;
	}

	public void setValorSomaB(Double valorSomaB) {
		this.valorSomaB = valorSomaB;
	}

	public Double getValorSubA() {
		return valorSubA;
	}

	public void setValorSubA(Double valorSubA) {
		this.valorSubA = valorSubA;
	}

	public Double getValorSubB() {
		return valorSubB;
	}

	public void setValorSubB(Double valorSubB) {
		this.valorSubB = valorSubB;
	}

	public Double getValorMultA() {
		return valorMultA;
	}

	public void setValorMultA(Double valorMultA) {
		this.valorMultA = valorMultA;
	}

	public Double getValorMultB() {
		return valorMultB;
	}

	public void setValorMultB(Double valorMultB) {
		this.valorMultB = valorMultB;
	}

	public Double getValorDivA() {
		return valorDivA;
	}

	public void setValorDivA(Double valorDivA) {
		this.valorDivA = valorDivA;
	}

	public Double getValorDivB() {
		return valorDivB;
	}

	public void setValorDivB(Double valorDivB) {
		this.valorDivB = valorDivB;
	}
	
	
	
}
