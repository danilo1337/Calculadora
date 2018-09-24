/**
 * 
 */
package br.calculadora.interfaces;
/**
 * @author Danilo
 *
 */

import java.net.URL;
import java.util.ResourceBundle;

import br.calculadora.classes.Calculadora;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class TelaController implements Initializable{
	
    @FXML
    private Button bu7;

    @FXML
    private Button bu4;

    @FXML
    private Button bu1;

    @FXML
    private Button bu8;

    @FXML
    private Button bu5;

    @FXML
    private Button bu9;

    @FXML
    private Button bu2;

    @FXML
    private Button bu6;

    @FXML
    private Button bu3;

    @FXML
    private Button bu0;

    @FXML
    private Button buIgual;

    @FXML
    private Button buPonto;

    @FXML
    private TextField Resultado;

    @FXML
    private Button buClean;

    @FXML
    private Button buAdicao;

    @FXML
    private Button buSubtracao;

    @FXML
    private Button buMultiplicacao;

    @FXML
    private Button buDivisao;

    @FXML
    private Button buPotencia;

    @FXML
    private Button buRaizQ;
    
    private Calculadora calc = null;
    private char c;
    
    
    @FXML
    private void botao0(ActionEvent event) {
    	Resultado.setText(Resultado.getText()+"0");
    	
    }

    @FXML
    private void botao1(ActionEvent event) {
    	Resultado.setText(Resultado.getText()+"1");
    	
    }

    @FXML
    private void botao2(ActionEvent event) {
    	Resultado.setText(Resultado.getText()+"2");
    }

    @FXML
    private void botao3(ActionEvent event) {
    	Resultado.setText(Resultado.getText()+"3");

    }

    @FXML
    private void botao4(ActionEvent event) {
    	Resultado.setText(Resultado.getText()+"4");

    }

    @FXML
    private void botao5(ActionEvent event) {
    	Resultado.setText(Resultado.getText()+"5");

    }

    @FXML
    private void botao6(ActionEvent event) {
    	Resultado.setText(Resultado.getText()+"6");

    }

    @FXML
    private void botao7(ActionEvent event) {
    	Resultado.setText(Resultado.getText()+"7");

    }

    @FXML
    private void botao8(ActionEvent event) {
    	Resultado.setText(Resultado.getText()+"8");

    }

    @FXML
    private void botao9(ActionEvent event) {
    	Resultado.setText(Resultado.getText()+"9");
    }

    @Override
	public void initialize(URL location, ResourceBundle resources) {
		botaoClean(null);
		Resultado.setDisable(true);
	}

	@FXML
	private void botaoIgual(ActionEvent event) {
		String saida = ""+ Resultado.getText();
		
		if(!saida.isEmpty()) {
		calc.setValor2(Double.parseDouble(saida));
		saida = "";
		if(c == '+')
			saida += calc.calcularAdicao();
		else if(c == '-')
			saida += calc.calcularSubtracao();
		else if(c == '*')
			saida += calc.calcularMultiplicacao();
		else if(c == '/')
			saida += calc.calcularDivisao();
		else if(c == 'a')
			saida += calc.calcularPotencia();
		
		Resultado.setText(saida);
		}
		
	}

	@FXML
	private void botaoPonto(ActionEvent event) {
		String saida = Resultado.getText();
		if(!saida.isEmpty() && saida.indexOf(".") < 1)
		Resultado.setText(saida+".");
	}

	@FXML
   private void botaoAdicao(ActionEvent event) {
		try {
		String saida = ""+Resultado.getText();
		if(saida.isEmpty()) 
			throw new Exception("Não é possível fazer essa operação!!");
		
    	calc.setValor1(Double.parseDouble(saida));
    	Resultado.setText("");
    	c = '+';
		}catch (Exception e) {
			Alert a = new Alert(AlertType.ERROR, e.getMessage());
			a.show();
		}
    	
		
    }

    @FXML
	private void botaoSubtracao(ActionEvent event) {
		try {
		String saida = ""+Resultado.getText();
		if(saida.isEmpty()) 
			throw new Exception("Não é possível fazer essa operação!!");
		
    	calc.setValor1(Double.parseDouble(saida));
    	Resultado.setText("");
    	c = '-';
		}catch (Exception e) {
			Alert a = new Alert(AlertType.ERROR, e.getMessage());
			a.show();
		}
	}

	@FXML
	private void botaoMultiplicacao(ActionEvent event) {
		try {
		String saida = ""+Resultado.getText();
		if(saida.isEmpty()) 
			throw new Exception("Não é possível fazer essa operação!!");
		
    	calc.setValor1(Double.parseDouble(saida));
    	Resultado.setText("");
    	c = '*';
		}catch (Exception e) {
			Alert a = new Alert(AlertType.ERROR, e.getMessage());
			a.show();
		}
	}

	@FXML
    private void botaoDivisao(ActionEvent event) {
		try {
		String saida = ""+Resultado.getText();
		if(saida.isEmpty()) 
			throw new Exception("Não é possível fazer essa operação!!");
    	calc.setValor1(Double.parseDouble(saida));
    	Resultado.setText("");
    	c = '/';
		}catch (Exception e) {
			Alert a = new Alert(AlertType.ERROR, e.getMessage());
			a.show();
		}
    }

    @FXML
    private void botaoPotencia(ActionEvent event) {
		try {
		String saida = ""+Resultado.getText();
		if(saida.isEmpty()) 
			throw new Exception("Não é possível fazer essa operação!!");
		
    	calc.setValor1(Double.parseDouble(saida));
    	Resultado.setText("");
    	c = 'a';
		}catch (Exception e) {
			Alert a = new Alert(AlertType.ERROR, e.getMessage());
			a.show();
		}
    }

    @FXML
    private void botaoRaizQ(ActionEvent event) throws Exception{
    	try {
    	String saida = ""+Resultado.getText();
    	if(saida.isEmpty())
    		throw new Exception("Não é possível fazer esse tipo de operação");
    	calc.setValor1(Double.parseDouble(saida));
    	saida = ""+calc.calcularRaizQ();
    	Resultado.setText(saida);
    	}catch(Exception e) {
    		Alert a = new Alert(AlertType.ERROR, e.getMessage());
    		a.show();
    	}
    		
    }

    @FXML
	private void botaoClean(ActionEvent event) {
		calc = new Calculadora();
		Resultado.setText("");
	}

}
