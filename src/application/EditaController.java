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
	
	public void acaobotaosalvar(){
		Alert alert = new Alert(Alert.AlertType.WARNING);
			if(!titulo.getText().isEmpty()) {
				if(filme.isSelected()) {
					avisoSucesso();
					salvarFilme();
					acaobotaovoltar();
				}else if (musica.isSelected()) {
					avisoSucesso();
					salvarMusica();
					acaobotaovoltar();
				}else if(foto.isSelected())	{
					avisoSucesso();
					salvarFoto();
					acaobotaovoltar();
				}else if(!filme.isSelected()) {
					avisoMidia();
				}else if(!musica.isSelected()) {
					avisoMidia();
				}else if(!foto.isSelected()) {
					avisoMidia();
				}
			}else {
				alert.setTitle("Atenção");
				alert.setContentText("Preencha todos os campos para poder salvar");
				alert.setHeaderText(null);
				alert.showAndWait();
				}
	}
	//volta para a tela principal
	public void acaobotaovoltar(){
		Main.changeScene("main");
		retiraSelecao();
		resetaPosicao();
	}
	//Quando realiza a escolha de um radio button essa função é chamada e reliza sua função escolhida
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
	//Reseta os campos e nomes para padrão quando der o salvar midia ou voltar
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
	//retira a seleção dos radio buttons
	public void retiraSelecao() {
		filme.setSelected(false);
		musica.setSelected(false);
		foto.setSelected(false);
	}
	//função que envolve criar um arquivo de texto para musica pegando as informações do campos de texto
	public void salvarMusica(){
		 try {
	    	 File arquivo = new File("/tmp/Musica.txt");
	            FileWriter fc = new FileWriter(arquivo);
	            BufferedWriter bc = new BufferedWriter(fc);
	               String linha = caminhoarquivo.getText() + ";" +titulo.getText() + ";" + descricao.getText() + ";" + genero.getText() + ";" + idioma.getText() + ";" + autores.getText() + ";"+ interpretes.getText()+";"+duracao.getText()+";"+ano.getText()+";";
	                bc.write(linha);
	                bc.newLine();
	                bc.close();
		            fc.close();
		            }catch(Exception m) {System.out.println(m);
		            System.out.println("Deu erro");}
	}
	//função que envolve criar um arquivo de texto para filme pegando as informações do campos de texto
	public void salvarFilme(){
		 try {
	    	 File arquivo = new File("/tmp/Filme.txt");
	            FileWriter fc = new FileWriter(arquivo);
	            BufferedWriter bc = new BufferedWriter(fc);
	               String linha = caminhoarquivo.getText() + ";" +titulo.getText() + ";" + descricao.getText() + ";" + genero.getText() + ";" + idioma.getText() + ";" + autores.getText() + ";"+ interpretes.getText()+";"+duracao.getText()+";"+ano.getText()+";";
	                bc.write(linha);
	                bc.newLine();
	                bc.close();
		            fc.close();
		            }catch(Exception m) {System.out.println(m);
		            System.out.println("Deu erro");}
	}
	//função que envolve criar um arquivo de texto para foto pegando as informações do campos de texto
	public void salvarFoto(){
		 try {
	    	 File arquivo = new File("/tmp/Foto.txt");
	            FileWriter fc = new FileWriter(arquivo);
	            BufferedWriter bc = new BufferedWriter(fc);
	               String linha = caminhoarquivo.getText() + ";" +titulo.getText() + ";" + descricao.getText() + ";" + genero.getText() + ";" + idioma.getText() + ";" + autores.getText() + ";"+ interpretes.getText()+";";
	                bc.write(linha);
	                bc.newLine();
	                bc.close();
		            fc.close();
		            }catch(Exception m) {System.out.println(m);
		            System.out.println("Deu erro");}
	}
	//avisa para ser escolhido um tipo de midia
	public void avisoMidia() {
		Alert alert = new Alert(Alert.AlertType.WARNING);
		alert.setTitle("Atenção");
		alert.setContentText("Selecione um tipo de midia");
		alert.setHeaderText(null);
		alert.showAndWait();
	}
	//avisa que a operação foi salva com sucesso
	public void avisoSucesso() {
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setTitle("Atenção");
		alert.setContentText("Salvo com sucesso");
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
		        System.out.println("error");
		    }
	}

	}