package com.felipinetec.atividadejavafx.Controller;

import com.felipinetec.atividadejavafx.App;
import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("View/secondary");
    }
}
