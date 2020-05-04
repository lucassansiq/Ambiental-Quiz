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
    private int pontuacao;
    private int vidas;
    
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
}
