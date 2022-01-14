package be.vdab.ondernemingsnummer.constrains;

import javax.validation.Constraint;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Target({TYPE,ANNOTATION_TYPE})
@Constraint(validatedBy = OndernemingsNummerValidator.class)
public @interface OndernemingsNummer {
}
