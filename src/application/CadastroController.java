package application;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class CadastroController {
	@FXML
	private Label caminhoarquivoid;
	@FXML
	private Label tituloid;
	@FXML
	private Label descricaoid;
	@FXML
	private Label generoid;
	@FXML
	private Label idiomaid;
	@FXML
	private Label autoresid;
	@FXML
	private Label interpretesid;
	@FXML
	private Label duracaoid;
	@FXML
	private Label anoid;
	@FXML
	private TextField caminhoarquivo;
	@FXML
	private TextField titulo;
	@FXML
	private TextField descricao;
	@FXML
	private TextField genero;
	@FXML
	private TextField idioma;
	@FXML
	private TextField autores;
	@FXML
	private TextField interpretes;
	@FXML
	private TextField duracao;
	@FXML
	private TextField ano;
	@FXML 
	private RadioButton foto;
	@FXML 
	private RadioButton musica;
	@FXML 
	private RadioButton filme;
	
	public void acaobotaovoltar(){
		Main.changeScene("main");
		retiraSelecao();
		resetaPosicao();
	}
	
	public void acaoescolha() {
	if(foto.isSelected()) {
		generoid.setText("Fotógrafo");
		idiomaid.setText("Pessoas");
		autoresid.setText("Local");
		interpretesid.setText("Data");
		duracaoid.setVisible(false);
		duracao.setVisible(false);
		anoid.setVisible(false);
		ano.setVisible(false);
	
	}else if(filme.isSelected()) {
		autoresid.setText("Diretor");
		interpretesid.setText("Atores Principais");
	}else if (!foto.isSelected()) {
		resetaPosicao();
	
	}else if(musica.isSelected()) {
		resetaPosicao();	
	}
	}

	public void acaobotaosalvar(){
		Alert alert = new Alert(Alert.AlertType.WARNING);
		
			if(!titulo.getText().isEmpty()) {
				String texto = titulo.getText();
				Main.changeScene("main");
				System.out.println(texto);
				retiraSelecao();
				resetaPosicao();
			}else {
				alert.setContentText(null);
				alert.setTitle("Atenção");
				alert.setHeaderText("Preencha todos os campos para poder salvar");
				alert.show();
				System.out.println("Deu erro");}
		
	}
	
	public void resetaPosicao() {
		generoid.setText("Genêro");
		idiomaid.setText("Idioma");
		autoresid.setText("Autores");
		interpretesid.setText("Intépretes");
		duracaoid.setVisible(true);
		duracao.setVisible(true);
		anoid.setVisible(true);
		ano.setVisible(true);
	}
	public void retiraSelecao() {
		filme.setSelected(false);
		musica.setSelected(false);
		foto.setSelected(false);
	}
	}
