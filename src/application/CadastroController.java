package application;


import java.io.File;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

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

	public void acaobotaosalvar() {

		if (filme.isSelected()) {
			cadastroFilme();
		} else if (musica.isSelected()) {
			cadastroMusica();
		} else if (foto.isSelected()) {
			cadastroFoto();
		} else if (!filme.isSelected()) {
			avisoMidia();
		} else if (!musica.isSelected()) {
			avisoMidia();
		} else if (!foto.isSelected()) {
			avisoMidia();
		}
	}

	// volta para a tela principal
	public void acaobotaovoltar() {
		Main.changeScene("main");
		retiraSelecao();
		resetaPosicao();
		limpaCampos();
	}

	// Quando realiza a escolha de um radio button essa função é chamada e reliza
	// sua função escolhida
	public void acaoescolha() {
		if (foto.isSelected()) {
			generoid.setText("Fotógrafo");
			idiomaid.setText("Pessoas");
			autoresid.setText("Local");
			interpretesid.setText("Data");
			duracaoid.setVisible(false);
			duracao.setVisible(false);
			anoid.setVisible(false);
			ano.setVisible(false);
		} else if (filme.isSelected()) {
			resetaPosicao();
			autoresid.setText("Diretor");
		} else if (musica.isSelected()) {
			resetaPosicao();
			interpretesid.setText("Intepretes");
		} else if (!foto.isSelected()){
			resetaPosicao();
		}
	}

	// Reseta os campos e nomes para padrão quando der o salvar midia ou voltar
	public void resetaPosicao() {
		generoid.setText("Genêro");
		idiomaid.setText("Idioma");
		autoresid.setText("Autores");
		interpretesid.setText("Atores Principais");
		duracaoid.setVisible(true);
		duracao.setVisible(true);
		anoid.setVisible(true);
		ano.setVisible(true);
	}

	// retira a seleção dos radio buttons
	public void retiraSelecao() {
		filme.setSelected(false);
		musica.setSelected(false);
		foto.setSelected(false);
	}
	//aviso generico
	public void avisoErro(String a) {
		Alert alert = new Alert(Alert.AlertType.WARNING);
		alert.setTitle("Atenção");
		alert.setContentText(a);
		alert.setHeaderText(null);
		alert.showAndWait();
	}
	// avisa para ser escolhido um tipo de midia
	public void avisoMidia() {
		Alert alert = new Alert(Alert.AlertType.WARNING);
		alert.setTitle("Atenção");
		alert.setContentText("Selecione um tipo de midia");
		alert.setHeaderText(null);
		alert.showAndWait();
	}

	// avisa que a operação foi salva com sucesso
	public void avisoSucesso() {
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setTitle("Atenção");
		alert.setContentText("Salvo com sucesso");
		alert.setHeaderText(null);
		alert.showAndWait();
	}

	// Quando clica em cima do botao ao lado da caixa de texto de caminho de arquivo
	// abre outra janela
	public void EscolhaCaminho() {
		FileChooser fc = new FileChooser();
		fc.setTitle("Escolha o arquivo");
		fc.getExtensionFilters().addAll(  new FileChooser.ExtensionFilter("ALL FILES", "*.*"),
	            new FileChooser.ExtensionFilter("Foto", "*.png",".jpg", "*.gif"),
	            new FileChooser.ExtensionFilter("Filme", "*.avi",".mp4",".wmv"),
	            new FileChooser.ExtensionFilter("Musica", "*.mp3","*.mva","*.wav"));
		File file = fc.showOpenDialog(null);

		if (file != null) {
			// nome do text field que esta associado
			caminhoarquivo.setText(file.getAbsolutePath());

		} else {
			System.out.println("error");
		}
	}

	public void limpaCampos() {
		caminhoarquivo.setText(null);
		titulo.setText(null);
		descricao.setText(null);
		genero.setText(null);
		idioma.setText(null);
		autores.setText(null);
		interpretes.setText(null);
		duracao.setText(null);
		ano.setText(null);
	}

	public void cadastroFilme() {
		if (!titulo.getText().isEmpty() && !caminhoarquivo.getText().isEmpty() && !descricao.getText().isEmpty()
				&& !genero.getText().isEmpty() && !idioma.getText().isEmpty() && !autores.getText().isEmpty()
				&& !interpretes.getText().isEmpty() && !duracao.getText().isEmpty() && !ano.getText().isEmpty() ) {
			String caminho, tituloa, descricaoa, generoa, idiomaa, diretora, atoresa, duracaoa, anoa;
			caminho = caminhoarquivo.getText();
			tituloa = titulo.getText();
			descricaoa = descricao.getText();
			generoa = genero.getText();
			idiomaa = idioma.getText();
			diretora = autores.getText();
			atoresa = interpretes.getText();
			duracaoa = duracao.getText();
			anoa = ano.getText();
			Filme filme = new Filme(caminho, tituloa, descricaoa, generoa, idiomaa, diretora, atoresa, duracaoa, anoa);
			Main.instancia().AdicionarFilme(filme);
			System.out.println(filme);
			avisoSucesso();
			Main.instancia().salvarFilme();
			acaobotaovoltar();
		}else {
			avisoErro("Preencha todos os campos de filme para poder salvar");
		}
	}

	public void cadastroMusica() {
		if (!titulo.getText().isEmpty() && !caminhoarquivo.getText().isEmpty() && !descricao.getText().isEmpty()
				&& !genero.getText().isEmpty() && !idioma.getText().isEmpty() && !autores.getText().isEmpty()
				&& !interpretes.getText().isEmpty() && !ano.getText().isEmpty() && !duracao.getText().isEmpty()) {
			String caminho, tituloa, descricaoa, generoa, idiomaa, autoresa, interpretesa, duracaoa, anoa;
			caminho = caminhoarquivo.getText();
			tituloa = titulo.getText();
			descricaoa = descricao.getText();
			generoa = genero.getText();
			idiomaa = idioma.getText();
			autoresa = autores.getText();
			interpretesa = interpretes.getText();
			duracaoa = duracao.getText();
			anoa = ano.getText();
			Musica musica = new Musica(caminho, tituloa, descricaoa, generoa, idiomaa, autoresa, interpretesa, duracaoa,
					anoa);
			Main.instancia().AdicionarMusica(musica);
			System.out.println(musica);
			avisoSucesso();
			Main.instancia().salvarMusica();
			acaobotaovoltar();
		}else {
			avisoErro("Preencha todos os campos de musica para poder salvar");
		}
	}

	public void cadastroFoto() {
		if (!titulo.getText().isEmpty() && !caminhoarquivo.getText().isEmpty() && !descricao.getText().isEmpty()
				&& !genero.getText().isEmpty() && !idioma.getText().isEmpty() && !autores.getText().isEmpty()) {
			String caminho, tituloa, descricaoa, fotografoa, pessoasa, locala, dataa;
			caminho = caminhoarquivo.getText();
			tituloa = titulo.getText();
			descricaoa = descricao.getText();
			fotografoa = genero.getText();
			pessoasa = idioma.getText();
			locala = autores.getText();
			dataa = interpretes.getText();
			Foto foto = new Foto(caminho, tituloa, descricaoa, fotografoa, pessoasa, locala, dataa);
			Main.instancia().AdicionarFoto(foto);
			System.out.println(foto);
			avisoSucesso();
			Main.instancia().salvarFoto();
			acaobotaovoltar();
		} else{
			avisoErro("Preencha todos os campos de foto para poder salvar");
		}
	}
}
