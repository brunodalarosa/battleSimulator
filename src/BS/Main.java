package BS;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        BS.getInstance().start(primaryStage);
    }

    @Override
    public void stop(){
        BS.getInstance().stop();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
