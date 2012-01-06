package br.com.caelum.aeris.validators;

import org.hibernate.validator.Validator;

public class MaiusculoValidator implements Validator<Maiusculo> {

	@SuppressWarnings("unused")
	private Maiusculo anotacao;

	public boolean isValid(Object value) {
		String asString = value.toString();
		return asString.equals(asString.toUpperCase());
	}

	public void initialize(Maiusculo parameters) {
		this.anotacao = parameters;
	}

}
