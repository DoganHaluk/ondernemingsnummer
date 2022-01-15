package be.vdab.ondernemingsnummer.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import static org.assertj.core.api.Assertions.assertThat;

public class FirmaTest {
    private Validator validator;
    private Firma firma;

    @BeforeEach
    void beforeEach() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
        firma=new Firma();
    }

    @Test
    void juisteOndernemingsNummer() {
        firma.setOndernemingsNummer(426388541);
        assertThat(validator.validate(firma)).isEmpty();
    }

    @Test
    void verkeerdeOndernemingsNummer() {
        firma.setOndernemingsNummer(426388542);
        assertThat(validator.validate(firma)).isNotEmpty();
    }
}
