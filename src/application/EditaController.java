package application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;



import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

public class EditaController {
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
	@FXML
	private TextField edita;
	
	public void acaobotaosalvar(){
		Alert alert = new Alert(Alert.AlertType.WARNING);
			if(!titulo.getText().isEmpty()) {
				if(filme.isSelected()) {
					salvarFilmeEd();
					Main.instancia().salvarFilme();
					avisoSucesso();
					acaobotaovoltar();
				}else if (musica.isSelected()) {
					salvarMusicaEd();
					Main.instancia().salvarMusica();
					avisoSucesso();
					acaobotaovoltar();
				}else if(foto.isSelected())	{
					salvarFotoEd();
					Main.instancia().salvarFoto();
					avisoSucesso();					
					acaobotaovoltar();
				}else if(!filme.isSelected()) {
					avisoMidia();
				}else if(!musica.isSelected()) {
					avisoMidia();
				}else if(!foto.isSelected()) {
					avisoMidia();
				}
			}else {
				alert.setTitle("Aten��o");
				alert.setContentText("Preencha todos os campos para poder salvar");
				alert.setHeaderText(null);
				alert.showAndWait();
				}
	}
	
	public void acaobotaoeditar() {
		try {
		if(!edita.getText().isEmpty()) {
			if(filme.isSelected()) {
				pesquisaFilme();
			
			}else if (musica.isSelected()) {
				pesquisaMusica();
			
			}else if(foto.isSelected())	{		
			    pesquisaFoto();
			  
			}else if(!filme.isSelected()) {
				avisoMidia();
			}else if(!musica.isSelected()) {
				avisoMidia();
			}else if(!foto.isSelected()) {
				avisoMidia();
			}
			}else {
			avisoErro("Preencha o campo para pesquisar");
			}
		}catch(NullPointerException e) {
			avisoErro(e.getMessage());
		}
	}
	
	public void pesquisaFilme() {
		Filme midia;
		midia = Main.instancia().edicaoFilme(edita.getText());
		if (midia == null) {
			throw new NullPointerException("O tipo de filme procurado n�o existe") ;}
		caminhoarquivo.setText(midia.getCaminhoArquivo());
		titulo.setText(midia.getTitulo());
		descricao.setText(midia.getDescricao());
		genero.setText(midia.getGenero());
		idioma.setText(midia.getIdioma());
		autores.setText(midia.getDiretor());
		interpretes.setText(midia.getAtoresPrincipais());
		duracao.setText(midia.getDuracao());
		ano.setText(midia.getAno());
	}
	
	public void salvarFilmeEd() {
		Filme midia;
		midia = Main.instancia().edicaoFilme(edita.getText());
		midia.setCaminhoArquivo(caminhoarquivo.getText());
		midia.setTitulo(titulo.getText());
		midia.setDescricao(descricao.getText());
		midia.setDuracao(duracao.getText());
		midia.setGenero(genero.getText());
		midia.setIdioma(idioma.getText());
		midia.setDiretor(autores.getText());
		midia.setAtoresPrincipais(interpretes.getText());
		midia.setDiretor(duracao.getText());
		midia.setAno(ano.getText());
	}

	public void pesquisaMusica() {
		Musica m;
		m = Main.instancia().edicaoMusica(edita.getText());
		if (m == null) {
			throw new NullPointerException("O tipo de musica procurada n�o existe") ;}
		caminhoarquivo.setText(m.getCaminhoArquivo());
		titulo.setText(m.getTitulo());
		descricao.setText(m.getDescricao());
		genero.setText(m.getGenero());
		idioma.setText(m.getIdioma());
		autores.setText(m.getAutores());
		interpretes.setText(m.getInterpretes());
		duracao.setText(m.getDuracao());
		ano.setText(m.getAno());
	}
	
	public void salvarMusicaEd() {
		Musica m;
		m = Main.instancia().edicaoMusica(edita.getText());
		m.setCaminhoArquivo(caminhoarquivo.getText());
		m.setTitulo(titulo.getText());
		m.setDescricao(descricao.getText());
		m.setGenero(genero.getText());
		m.setIdioma(idioma.getText());
		m.setAutores(autores.getText());
		m.setInterpretes(interpretes.getText());
		m.setDuracao(duracao.getText());
		m.setAno(ano.getText());
	}
	
	public void pesquisaFoto() {
		Foto mid;
		mid = Main.instancia().edicaoFoto(edita.getText());
		if (mid == null) {
			throw new NullPointerException("O tipo de foto procurado n�o existe") ;}
		caminhoarquivo.setText(mid.getCaminhoArquivo());
		titulo.setText(mid.getTitulo());
		descricao.setText(mid.getDescricao());
		genero.setText(mid.getFotografo());
		idioma.setText(mid.getPessoas());
		autores.setText(mid.getLocal());
		interpretes.setText(mid.getData());
		
	}
	
	public void salvarFotoEd() {
		Foto mid;
		mid = Main.instancia().edicaoFoto(edita.getText());
		mid.setCaminhoArquivo(caminhoarquivo.getText());
		mid.setTitulo(titulo.getText());
		mid.setDescricao(descricao.getText());
		mid.setFotografo(genero.getText());
		mid.setPessoas(idioma.getText());
		mid.setLocal(autores.getText());
		mid.setData(interpretes.getText());
		
	}
	
	//volta para a tela principal
	public void acaobotaovoltar(){
		Main.changeScene("main");
		retiraSelecao();
		resetaPosicao();
		limpaCampos();
	}
	//Quando realiza a escolha de um radio button essa fun��o � chamada e reliza sua fun��o escolhida
	public void acaoescolha() {
		if(foto.isSelected()) {
			generoid.setText("Fot�grafo");
			idiomaid.setText("Pessoas");
			autoresid.setText("Local");
			interpretesid.setText("Data");
			duracaoid.setVisible(false);
			duracao.setVisible(false);
			anoid.setVisible(false);
			ano.setVisible(false);
			limpaCampos();
		}else if(filme.isSelected()) {
			resetaPosicao();
			autoresid.setText("Diretor");
			interpretesid.setText("Atores Principais");
		
			limpaCampos();
		}else if(musica.isSelected()) {
			resetaPosicao();	
			limpaCampos();
		
		}else if (!foto.isSelected()) {
			resetaPosicao();
			
		
		}
	}
	//Reseta os campos e nomes para padr�o quando der o salvar midia ou voltar
	public void resetaPosicao() {
		generoid.setText("Gen�ro");
		idiomaid.setText("Idioma");
		autoresid.setText("Autores");
		interpretesid.setText("Int�pretes");
		duracaoid.setVisible(true);
		duracao.setVisible(true);
		anoid.setVisible(true);
		ano.setVisible(true);
	}
	//retira a sele��o dos radio buttons
	public void retiraSelecao() {
		filme.setSelected(false);
		musica.setSelected(false);
		foto.setSelected(false);
	}
	
	//avisa para ser escolhido um tipo de midia
	public void avisoMidia() {
		Alert alert = new Alert(Alert.AlertType.WARNING);
		alert.setTitle("Aten��o");
		alert.setContentText("Selecione um tipo de midia");
		alert.setHeaderText(null);
		alert.showAndWait();
	}
	
	//avisa que a opera��o foi salva com sucesso
	public void avisoSucesso() {
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setTitle("Aten��o");
		alert.setContentText("Salvo com sucesso");
		alert.setHeaderText(null);
		alert.showAndWait();
	}
	
	public void avisoErro(String e) {
		Alert alert = new Alert(Alert.AlertType.WARNING);
		alert.setTitle("Aten��o");
		alert.setContentText(e);
		alert.setHeaderText(null);
		alert.showAndWait();
	}
	//Quando clica em cima do botao ao lado da caixa de texto de caminho de arquivo abre outra janela
	public void EscolhaCaminho() {
		FileChooser fc = new FileChooser();
		fc.setTitle("Escolha o arquivo");
		fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("ALL FILES", "*.*"));
		   File file = fc.showOpenDialog(null);

		    if (file != null) {
		        // nome do text field que esta associado
		    	caminhoarquivo.setText(file.getAbsolutePath());

		    } else  {
		        System.out.println("erro ao encontrar o arquivo");
		    }
	}
	
	public void limpaCampos() {
		edita.setText(null);
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

}