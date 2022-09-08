package poo.e1;

/**
 * @author edgar
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("\na) Instanciar 2 empleados de manera diferente, y mostrarlos.");
        Employee employee1 = new Employee(125.0, "María", "Flores", "Torrez", 5000.0, "Consultoría");
        Employee employee2 = new Employee(425.0, "Alán", "Brito", "Perez", "Técnica");
        System.out.println(employee1);
        System.out.println(employee2);

        System.out.println("\nb) De los dos empleados mostrar al empleado que tiene mayor sueldo.");
        System.out.println(employee1.higherSalary(employee2));

        System.out.println("\nc) Modificar el área de trabajo de un empleado con el área X.");
        System.out.println("Consultoría a Comunicación");
        employee1.modifyArea("Consultoría", "Comunicación");
        System.out.println(employee1);

        System.out.println("\nd) Verificar si ambos empleados son del mismo área.");
        if (employee1.sameArea(employee2)){
            System.out.println("Son del mismo área");
        } else {
            System.out.println("Son de distintas áreas.");
        }
    }
}