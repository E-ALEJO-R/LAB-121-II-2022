package poo.e1;

public class Employee {
    private Double ci;
    private String name;
    private String firstName;
    private String lastName;
    private Double salary;
    private String area;

    public Employee(Double ci, String name, String firstName, String lastName, Double salary, String area) {
        this.ci = ci;
        this.name = name;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.area = area;
    }

    public Employee(Double ci, String name, String firstName, String lastName, String area) {
        this.ci = ci;
        this.name = name;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = 2000.0;
        this.area = area;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ci=" + ci +
                ", name='" + name + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", area='" + area + '\'' +
                '}';
    }

    public Double getCi() {
        return ci;
    }

    public void setCi(Double ci) {
        this.ci = ci;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    /**
     * b) De los dos empleados mostrar al empleado que tiene mayor sueldo.
     * @param employee empleado.
     * @return nombre del empleado con mayor sueldo
     */
    public String higherSalary(Employee employee) {
        if (this.salary > employee.salary) {
            return name + " " + firstName + " " + lastName;
        } else if (employee.salary > this.salary) {
            return employee.name + " " + employee.firstName + " " + employee.lastName;
        } else {
            return "Los dos empleados tienen salarios iguales";
        }
    }

    /**
     * c) Modificar el área de trabajo de un empleado con el área X.
     * @param areaX   área existente
     * @param newArea nueva área
     */
    public void modifyArea(String areaX, String newArea) {
        if (this.area.equalsIgnoreCase(areaX)) {
            this.area = newArea;
        }
    }

    /**
     * d) Verificar si ambos empleados son del mismo área.
     * @param employee empleado
     * @return true or false
     */
    public boolean sameArea(Employee employee) {
        return employee.area.equalsIgnoreCase(this.area);
    }
}
