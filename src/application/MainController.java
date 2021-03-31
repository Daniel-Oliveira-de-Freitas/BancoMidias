package application;

import java.io.File;

public class MainController {
	
	public void acaobotaocadastro(){
		Main.changeScene("cadastro");
	}
	
	public void acaobotaoeditar(){
		Main.changeScene("editar");
}
	
	public void acaobotaopesquisa(){
		Main.changeScene("pesquisar");
}
	public void acaobotaoexibir() {
		Main.changeScene("exibir");
	}
	
	public void acaobotaoexcluir() {
		Main.changeScene("excluir");
	}
	
}