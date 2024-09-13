package ivkhk.ee;

public class App {
    public void run (){
        System.out.println("Демо программа хранения данных работников");

        Address address = new Address("Pushkin", "Johvi", "10", "11");
        Person person = new Person("Ivan", "Ivanov",2000,7,10,"54235125",address);

        Employee employee = new Employee();
        employee.setPosition("Director");
        employee.setSalary("3000");
        employee.setPerson(person);

        System.out.printf("Работник:%n %s %s%n %d лет%n %s%n %s%n",
                employee.getPerson().getName(),
                employee.getPerson().getLastname(),
                employee.getPerson().getAge(),
                employee.getPerson().getPhone(),
                employee.getPerson().getAddress().getCity(),
                employee.getPosition()

        );

    }
}
