/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author Lucas Hype
 */
public class Jogador {
    
    private String nome;
    private static int pontuacao;
    private static int vidas; 
    
    public void cadastrar(){}
    
    public void setNome(String nome){
        if(nome.length() > 1 && nome.length() < 15 ){
            this.nome = nome;
        }
        else throw new IllegalArgumentException("Nome inválido");
    }
    
    public String getNome(){
        return this.nome;
    }
    public void setPontuacao(int pontuacao){
        this.pontuacao = pontuacao;
    }
    
    public void setVidas(int vidas){
        this.vidas = vidas;
    }
    public int respostaCerta(){
        return pontuacao +=10;
    }  
    public int respostaErrada(){
        return vidas -=1;
    }
    
    public Jogador (String nome){
        this(nome,0,3);
    }
  
    public Jogador (String nome , int pontuacao, int vidas){
        setNome(nome);
        setPontuacao(pontuacao);
        setVidas(vidas);       
    }
          
    public String toString(){
        return("Nome: " + getNome() + " - Pontuação: " + pontuacao + " Vidas: "+ vidas);
    }
    
}
