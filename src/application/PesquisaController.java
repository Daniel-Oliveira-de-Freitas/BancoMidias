package application;

import javafx.scene.control.Alert;

public class PesquisaController {
	
	public void acaobotaovoltar(){
		Main.changeScene("main");
}
	
	public void acaobotaopesquisar() {
	
		
	}
	
	//avisa para ser escolhido um tipo de midia
		public void avisoMidia() {
			Alert alert = new Alert(Alert.AlertType.WARNING);
			alert.setTitle("Atenção");
			alert.setContentText("Selecione um tipo de midia");
			alert.setHeaderText(null);
			alert.showAndWait();

}
}