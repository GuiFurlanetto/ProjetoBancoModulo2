import model.*;
import model.Funcionario.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {


        Cliente cliente1 = new Cliente("Well", 55555L, LocalDate.of(2007,01,25),123456L);
        Cliente cliente2 = new Cliente("Gui", 55555L, LocalDate.of(1994,01,01),22222222L,new Usuario("login2","senha2"));

    // cliente 1
        cliente1.setConta(new ContaCorrente(0101L,0101));

        Usuario usuarioCliente1 = new Usuario("login1", "senha1");
        cliente1.setUsuario(usuarioCliente1);
        cliente1.getUsuario().logar("login1", "senha1");
        cliente1.getConta().deposita(BigDecimal.valueOf(100));
        cliente1.getConta().saque(BigDecimal.valueOf(50));



    // cliente 2
        cliente2.setConta(new ContaCorrente(0101L,0202));
        cliente2.setConta(new ContaPoupanca(0202L,0202));
        cliente2.getUsuario().logar("login1", "senha1");
        Usuario usuarioCliente2 = new Usuario("login2", "senha2");
        cliente2.setUsuario(usuarioCliente2);
        cliente2.getUsuario().logar("login2", "senha2");
        cliente2.getConta().deposita(BigDecimal.valueOf(200));
        cliente2.getConta().saque(BigDecimal.valueOf(100));
        cliente2.getConta().deposita(BigDecimal.valueOf(20));


        //transferencias
        cliente1.getConta().transferencia(BigDecimal.valueOf(25),cliente2.getConta());
        cliente2.getConta().transferencia(BigDecimal.valueOf(50),cliente1.getConta());

        //render juros
        cliente1.getConta().renderJuros(BigDecimal.valueOf(5000));
        cliente2.getConta().renderJuros(BigDecimal.valueOf(10000));

        //limite
        cliente1.setConta(new ContaCorrente(0202L,0101));
        ///////////////////////////////////////////verificar porque não esta puxando a classe filha???????
        ((ContaCorrente) cliente1.getConta()).pedirLimiteCredito(BigDecimal.valueOf(1000)) ;



        // Funcionarios

        Funcionario funcionario1 = new Funcionario(99999,"Guilherme","Analista",1000);
        Funcionario funcionario2 = new Funcionario(11111,"Paulinho","Analista Sr",5000);

        Usuario usuarioFuncionario1 = new Usuario("login999", "senha999");
        funcionario1.setUsuario(usuarioFuncionario1);
        funcionario1.getUsuario().logar("login999", "senha999");

        Usuario usuarioFuncionario2 = new Usuario("login999", "senha999");
        funcionario2.setUsuario(usuarioFuncionario2);
        funcionario2.getUsuario().logar("login1111", "senha111");


        funcionario1.calcularFerias();
        funcionario2.calcularFerias();

        funcionario1.calcularPLR();
        funcionario2.calcularPLR();


    }
}