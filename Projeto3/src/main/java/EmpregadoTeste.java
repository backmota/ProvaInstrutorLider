public class EmpregadoTeste {
    public static void main(String[] args) {
        //instancia del empleado 1
        Empregado emp1 = new Empregado();
        emp1.setNome("Jose Juan");
        emp1.setSobrenome("M.T.");
        emp1.setSalario_mensual(25000.00);
        System.out.println(emp1);
        //instancia del empleado2
        Empregado emp2 = new Empregado();
        emp2.setNome("Tony");
        emp2.setSobrenome("J.R.");
        emp2.setSalario_mensual(20000.00);
        System.out.println(emp2);
        //salario anual de los empleados:
        System.out.println("Salario Anual del Empleado 1: "+emp1.getSalario_mensual()*12);
        System.out.println("Salario Anual del Empleado 2: "+emp2.getSalario_mensual()*12);
        //aumento del 10% a los empleados.
        emp1.setSalario_mensual(emp1.getSalario_mensual()*1.10);
        emp2.setSalario_mensual(emp2.getSalario_mensual()*1.10);
        //salario anual de los empleados:
        System.out.println("Salario Anual con aumento del Empleado 1: "+emp1.getSalario_mensual()*12);
        System.out.println("Salario Anual con aumento del Empleado 2: "+emp2.getSalario_mensual()*12);
        //cantidad de empleados
        System.out.println("La empresa ha tenido "+emp2.getNumero_empregados()+" empleados");
    }
}
