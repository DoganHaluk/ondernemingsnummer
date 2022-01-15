package be.vdab.ondernemingsnummer.constrains;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class OndernemingsNummerValidator implements ConstraintValidator<OndernemingsNummer, Long> {
    @Override
    public void initialize(OndernemingsNummer constraintAnnotation) {
    }

    @Override
    public boolean isValid(Long value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }
        return 97 - (value / 100) % 97 == value % 100;
    }
}
