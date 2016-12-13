/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OversiktKlasser;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author maria
 */
public class TilbakemeldingOversikt {
    
    private final SimpleIntegerProperty oversiktTilbakemeldingID;
    private final SimpleIntegerProperty oversiktTilbakemeldingSID;
    private final SimpleIntegerProperty oversiktTilbakemeldingStatus;
    private final SimpleStringProperty oversiktTilbakemeldingDato;
 
    public TilbakemeldingOversikt(int otID, int otSID, int otStatus, String otDato) {
        this.oversiktTilbakemeldingID = new SimpleIntegerProperty(otID);
        this.oversiktTilbakemeldingSID = new SimpleIntegerProperty(otSID);
        this.oversiktTilbakemeldingStatus = new SimpleIntegerProperty(otStatus);
        this.oversiktTilbakemeldingDato = new SimpleStringProperty(otDato);
    }
 
    public int getOversiktTilbakemeldingID() {
        return oversiktTilbakemeldingID.get();
    }
    public int getOversiktTilbakemeldingSID() {
        return oversiktTilbakemeldingSID.get();
    }
    public int getOversiktTilbakemeldingStatus() {
        return oversiktTilbakemeldingStatus.get();
    }
    public String getOversiktTilbakemeldingDato() {
        return oversiktTilbakemeldingDato.get();
    }
    
    public void setOversiktTilbakemeldingID(int otID) {
        oversiktTilbakemeldingID.set(otID);
    }
    public void setOversiktTilbakemeldingSID(int otSID) {
        oversiktTilbakemeldingSID.set(otSID);
    }
    public void setOversiktTilbakemeldingStatus(int otStatus) {
        oversiktTilbakemeldingStatus.set(otStatus);
    }
    public void setOversiktTilbakemeldingDato(String otDato) {
        oversiktTilbakemeldingDato.set(otDato);
    }
}
