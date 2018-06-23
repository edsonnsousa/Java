package model;

import model.Compra;

public interface Promocao {
    public boolean aplicavelCompra(Compra compra);
    public float calcularDesconto(Compra compra);
}
