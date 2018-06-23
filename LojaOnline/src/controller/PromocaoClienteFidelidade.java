package controller;

import model.Promocao;
import model.Compra;

public class PromocaoClienteFidelidade implements Promocao{

    @Override
    public boolean aplicavelCompra(Compra compra) {
       return compra.getCliente().getQddCompras() >= 5;        
    }

    @Override
    public float calcularDesconto(Compra compra) {
        float desconto = 0.0f;
        if(aplicavelCompra(compra)){
            if(compra.getValorTotal() > 99.0f && compra.getValorTotal() <= 999.0f)
                return (float) (compra.getValorTotal() * 0.05);
            else
            if(compra.getValorTotal() > 999.0f)
                return (float) (compra.getValorTotal() * 0.1);
            else
                return 0;
        }
        else
            return 0;
    }
}
