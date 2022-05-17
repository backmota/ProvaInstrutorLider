public class Main {
    public static void main(String[] args) {
        // write your code here
        Endereço endereço=new Endereço("Zapate","Orizaba", "Veracruz", "94300","Av1");
        //La clase Owner requiere el Objeto de dirección (endereço))
        Owner owner=new Owner("Jose Juan Mota", "MOTAT","RGSGJFJ", endereço);
        Marca marca=new Marca("VMW",1234, "2022", "AVMW2022");
        Carro carro=new Carro(owner, marca);

        carro.setVolume_de_combusvel(200);
        carro.exibir_volume_combustivel();
        //acelerar el carro a 100 km por hora
        for (int i=0; i<100; i++){
            carro.acelera();
        }
        System.out.println(carro.getVelocidade_atual());
        carro.reduz_a_marcha();
    }
}
