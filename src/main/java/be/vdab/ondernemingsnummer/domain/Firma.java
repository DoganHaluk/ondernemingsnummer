package be.vdab.ondernemingsnummer.domain;

import be.vdab.ondernemingsnummer.constrains.OndernemingsNummer;

public class Firma {
    @OndernemingsNummer
    private long ondernemingsNummer;

    public long getOndernemingsNummer() {
        return ondernemingsNummer;
    }

    public void setOndernemingsNummer(long ondernemingsNummer) {
        this.ondernemingsNummer = ondernemingsNummer;
    }
}
