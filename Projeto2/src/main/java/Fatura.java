public class Fatura {
    private String numero;
    private String descrição;
    private int quantidade;
    private Double preco;

    public Fatura(){
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        if(preco<0){
            this.preco=0.0;
        }else{
            this.preco = preco;
        }
    }

    public Double getTotalFatura(){
        double res=quantidade*preco;
        if(res<0){
            return 0.0;
        }else{
            return res;
        }
    }

    public String toString(){
        return "numero: "+this.numero+
                "\nDescripcion: "+this.descrição+
                "\nCantidad: "+this.quantidade+
                "\nPrecio: "+this.preco;
    }
}
