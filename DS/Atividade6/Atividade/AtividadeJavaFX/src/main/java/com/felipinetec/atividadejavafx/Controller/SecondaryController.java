package com.felipinetec.atividadejavafx.Controller;

import com.felipinetec.atividadejavafx.App;
import java.io.IOException;
import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("View/primary");
    }
}