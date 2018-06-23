package model;

import model.Produto;
import model.Cliente;
import java.util.List;

public class Compra {

    private double valorTotal;
    private Cliente cliente;
    private List<Produto> listaProdutos;
    private List<Promocao> listPromocao;
    private int taxaFrete;
    private String regiaoParaEntrega;
    private float valorFrete;

    public Compra(Cliente cliente,List<Produto> listaProdutos, Promocao promocao) {
        this.cliente = cliente;
        this.listaProdutos = listaProdutos;
        this.cliente.setQddCompras(this.cliente.getQddCompras() + 1);
        
    }

    public String getRegiaoParaEntrega() {
        return regiaoParaEntrega;
    }
    
    public Cliente getCliente() {
        return cliente;
    }
    
    public double getValorTotal() {
        return valorTotal;
    }

    public List<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setPromocao(Promocao promocao) {
        this.listPromocao.add(promocao);
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public float getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(float valorFrete) {
        this.valorFrete = (float) (this.valorTotal * (this.taxaFrete / 100));
    }
    
    
}
