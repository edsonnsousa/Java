package controller;

import model.Promocao;
import model.Compra;

public class PromocaoFrete implements Promocao{

    @Override
    public boolean aplicavelCompra(Compra compra) {
        return compra.getValorTotal() > 99.0f;        
    }

    @Override
    public float calcularDesconto(Compra compra) {
        if(aplicavelCompra(compra)){
            return (float) compra.getValorFrete();
        }
        else
            return 0.0f;
    }
}
