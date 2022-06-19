package model.Funcionario;

public class Estagiario extends Funcionario{

    public Estagiario (int codigoFuncional, String nome, String cargo, double salario) {
        super(codigoFuncional, nome, cargo, salario);
    }

    //para ações criamos metodos
    public double calcularPLR () {
        return salario * 2;
    }

    }
