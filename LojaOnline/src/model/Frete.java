package model;

public class Frete {
    private int taxa;
    private Compra compra;

    public int getTaxa() {
        return taxa;
    }

    public void setTaxa(Compra c) {
        
        int tx = 0;
        if(c.getRegiaoParaEntrega().equals("S") || c.getRegiaoParaEntrega().equals("SE"))
            tx = 3;
        else
            if(c.getRegiaoParaEntrega().equals("CO") || c.getRegiaoParaEntrega().equals("N") || c.getRegiaoParaEntrega().equals("NE"))
                tx = 5;
        
        this.taxa = tx;
    }
    
}
