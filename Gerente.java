package model.Funcionario;

public class Gerente extends Funcionario{


    public Gerente(int codigoFuncional, String nome, String cargo, double salario) {
        super(codigoFuncional, nome, cargo, salario);
    }

    //para ações criamos metodos
    public double calcularPLR () {
        return salario * 4;
    }
}

