package controller;

import model.Promocao;
import model.Compra;
import model.Produto;

public class PromocaoLimpezaPague2Leve3 implements Promocao{
    
    
    public boolean aplicavelProduto(Produto produto) {
        return produto.getCategoria().equals("limpeza") && produto.getQtdd() >= 2;
    }

    @Override
    public float calcularDesconto(Compra compra) {
        Produto produto = new Produto();
        float desconto = 0.0f;
        for (int i = 0;i <= compra.getListaProdutos().size(); i++) {
            produto = compra.getListaProdutos().get(i);
            if(aplicavelProduto(produto)){
                
                desconto += produto.getValor() * (produto.getQtdd() / 3);
            }
        }
        return desconto;
    }

    @Override
    public boolean aplicavelCompra(Compra compra) {
        return true;
    }
        
}
