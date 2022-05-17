public class FaturaTeste {
    public static void main(String[] args) {
        //instancia de objeto
        Fatura fat1=new Fatura();
        fat1.setNumero("750123");
        fat1.setDescrição("Descripcion de ejemplo 1");
        fat1.setQuantidade(2);
        fat1.setPreco(13.5);
        System.out.println(fat1.toString());
        System.out.println("El total de la factura:"+ fat1.getTotalFatura());
    }
}
