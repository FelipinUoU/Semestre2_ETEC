module com.felipinetec.atividadejavafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.felipinetec.atividadejavafx to javafx.fxml;
    opens com.felipinetec.atividadejavafx.Controller to javafx.fxml;
    
    exports com.felipinetec.atividadejavafx;
    exports com.felipinetec.atividadejavafx.Controller; 
}
