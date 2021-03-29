package application;

import javafx.fxml.FXML;
//import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CadastroController {
	@FXML
	private TextField titulo;
	
	public void acaobotaovoltar(){
		Main.changeScene("main");
	}
	
	public void acaobotaosalvar(){
		Main.changeScene("main");
	}
	}
