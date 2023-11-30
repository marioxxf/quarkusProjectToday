package com.github.marioxxf.ifood.cadastro.infra;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidDTOValidator
implements ConstraintValidator<ValidDTO, DTO> {
	
	@Override
	public void initialize(ValidDTO constraintAnnotation) {
	}
	
	@Override
	public boolean isValid(DTO dto, ConstraintValidatorContext constraintValidatorContext) {
		return dto.isValid(constraintValidatorContext);
	}
}