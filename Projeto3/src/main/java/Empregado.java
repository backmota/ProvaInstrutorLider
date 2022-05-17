public class Empregado {
    private String nome;
    private String sobrenome;
    private Double salario_mensual;
    private static int numero_empregados;

    public Empregado(){
        numero_empregados++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Double getSalario_mensual() {
        return salario_mensual;
    }

    public void setSalario_mensual(Double salario_mensual) {
        this.salario_mensual = salario_mensual;
    }

    public int getNumero_empregados(){
        return numero_empregados;
    }

    public String toString(){
        return "Nombre: "+this.nome
                +"\nApellido: "+this.sobrenome
                +"\nSalario Mensual: "+this.salario_mensual
                ;
    }
}
