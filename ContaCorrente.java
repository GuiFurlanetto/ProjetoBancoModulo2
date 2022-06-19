package model;

// extends: Herença / Herdar
// voce pode  adiciona novas "caracteristicas" e não da pra escolher o que herdar


import java.math.BigDecimal;

public class ContaCorrente extends Conta {
    private BigDecimal limiteCredito;

    public ContaCorrente(Long numeroConta, Integer agencia) {
        super(numeroConta, agencia);
        this.limiteCredito = BigDecimal.ZERO;
    }

    public void setLimiteCredito(BigDecimal limiteCredito){
        this.limiteCredito = limiteCredito;
    }
    public BigDecimal getLimiteCredito(){
        return this.limiteCredito;
    }

    public void pedirLimiteCredito(BigDecimal novoLimite){
        this.limiteCredito = this.limiteCredito.add(novoLimite);
    }

}