/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;

/**
 *
 * @author Lucas Hype
 */
public class Questao implements Serializable{
    
    private Alternativa alternativa;
    private String pergunta;
    private String array [] = new String[4];
    private int correta;
	

	public  void setPergunta(String pergunta){
		this.pergunta = pergunta;
	}
	
	public void setAlternativas(String alternativa1, String alternativa2, String alternativa3, String alternativa4){
		array[0] = alternativa1;
		array[1] = alternativa2;
		array[2] = alternativa3;
		array[3] = alternativa4;
	}
	
	public void setCorreta(int correta){
		this.correta = correta;
	}

}
