package br.com.strategy.cidades;

import br.com.strategy.imposto.IdadesSuportadasParaCalculoDoImposto;

import java.math.BigDecimal;

public class Curitiba extends Cidade {

    private int idadeDoImovel;

    public Curitiba(BigDecimal areaTotal, int idadeDoImovel) {
        super(areaTotal);
        this.idadeDoImovel = idadeDoImovel;
    }

    public BigDecimal calculoTotal() {
       return IdadesSuportadasParaCalculoDoImposto.calcularImpostoDeRenda(idadeDoImovel);
    }

    @Override
    protected BigDecimal calcularArea() {
        return areaTotal.multiply(new BigDecimal("5"));
    }
}
