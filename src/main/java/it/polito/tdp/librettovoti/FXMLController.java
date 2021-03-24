package it.polito.tdp.librettovoti;


import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import it.polito.tdp.libretto.model.Libretto;
import it.polito.tdp.libretto.model.Voto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {

	private Libretto model;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtEsame;

    @FXML
    private TextField txtVoto;

    @FXML
    private TextField txtData;

    @FXML
    private TextArea txtRisultatp;

    @FXML
    void handleInserisci(ActionEvent event) {

    	//Lettura e controllo dati
    	String nomeEsame = txtEsame.getText();
    	LocalDate data = LocalDate.parse(txtData.getText());
    	int voto = Integer.parseInt(txtVoto.getText());
    	
    	// Esegui l'azione
    	Voto esame = new Voto(nomeEsame,voto, data);
    	model.add(esame);
    	
    	// aggiorna i dati
    	
    	txtRisultatp.setText(model.stampati(esame));
    }
    public void setModel(Libretto model) {
    	this.model = model;
    }

    @FXML
    void initialize() {
        assert txtEsame != null : "fx:id=\"txtEsame\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtVoto != null : "fx:id=\"txtVoto\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtData != null : "fx:id=\"txtData\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtRisultatp != null : "fx:id=\"txtRisultatp\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}
