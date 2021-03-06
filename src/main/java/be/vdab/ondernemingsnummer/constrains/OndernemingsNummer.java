package be.vdab.ondernemingsnummer.constrains;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Target({METHOD, FIELD, ANNOTATION_TYPE})
@Constraint(validatedBy = OndernemingsNummerValidator.class)
public @interface OndernemingsNummer {
    String message() default "{be.vdab.OndernemingsNummer.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
