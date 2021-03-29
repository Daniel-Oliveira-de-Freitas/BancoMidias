package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	
	private static Stage stage;
	
	private static Scene mainScene;
	private static Scene cadastroScene;
	private static Scene editaScene;
	private static Scene pesquisaScene;
	private static Scene exibirScene;
	private static Scene excluirScene;

//	@SuppressWarnings("unused")
	@Override
	public void start(Stage primaryStage) throws Exception{
		stage = primaryStage;
			
		primaryStage.setTitle("Banco de Midia");
		Pane fxmlmain = FXMLLoader.load(getClass().getResource("TelaMain.fxml"));
			mainScene = new Scene(fxmlmain);
		
		Pane fxmlcadastro = FXMLLoader.load(getClass().getResource("CadastroTela.fxml"));
			   cadastroScene = new Scene(fxmlcadastro);	
			
		Pane fxmledita = FXMLLoader.load(getClass().getResource("EditarTela.fxml"));
		   editaScene = new Scene(fxmledita);
		   
	    Pane fxmlpesquisa = FXMLLoader.load(getClass().getResource("pesquisarTela.fxml"));
		   pesquisaScene = new Scene(fxmlpesquisa);   
	
		 Pane fxmlexibir = FXMLLoader.load(getClass().getResource("ExibirTela.fxml"));
			   exibirScene = new Scene(fxmlexibir);   

		 Pane fxmlexcluir = FXMLLoader.load(getClass().getResource("ExcluirTela.fxml"));
			  excluirScene = new Scene(fxmlexcluir); 
		
			primaryStage.setScene(mainScene);
			primaryStage.show();
	}
	
	public static void changeScene(String scr) {
		switch(scr) {
		case "main":
			stage.setScene(mainScene);
			break;
		case"cadastro":
			stage.setScene(cadastroScene);
			break;
			
		case"editar":
			stage.setScene(editaScene);
			break;
			
		case"pesquisar":
			stage.setScene(pesquisaScene);
			break;
		
	case"exibir":
			stage.setScene(exibirScene);
		break;
	case"excluir":
		stage.setScene(excluirScene);
	break;
	}
	}
	
	public static void main(String[] args) {
		launch(args);
		
	}
}
