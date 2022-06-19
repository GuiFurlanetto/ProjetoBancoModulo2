package model.Funcionario;

import model.Usuario;

/**
 * Questão #1
 *
 * Crie uma classe chamada Funcionario.
 * Escreva os atributos pessoais de um funcionário de uma empresa.
 * Esta classe possuirá dois métodos, calcularPLR e calcularFerias.
 * Após isto, crie uma classe Gerente uma classe Estagiario.java, que herdem os atributos e métodos da classe Funcionario.
 */

//atributos dentro da classe
public class Funcionario{
    private int codigoFuncional;
    private String nome;
    protected String cargo;
    protected double salario;
    protected Usuario usuario;


    public Funcionario (int codigoFuncional, String nome, String cargo, double salario){
        this.codigoFuncional = codigoFuncional;
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    //get e set
    public int getCodigoFuncional(){
        return this.codigoFuncional;
    }
    public void setCodigoFuncional (int codigoFuncional){
        this.codigoFuncional = codigoFuncional;
    }

    public String getNome(){return this.nome;}
    public void setNome (String nome){
        this.nome = nome;
    }

    public String getCargo(){
        return this.cargo;
    }
    public void setCargo (String cargo){
        this.cargo = cargo;
    }

    public double getSalario(){
        return this.salario;
    }
    public void setSalario (double salario){
        this.salario = salario;
    }

    public Usuario getUsuario(){
        return this.usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }


    //para ações criamos metodos
    public double calcularPLR () {
        return salario * 3;
    }

    public double calcularFerias () {
        return salario *  1.3;
    }

    ///


}
