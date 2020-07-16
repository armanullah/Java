public class Employee extends Person {
    int officeNumber, salary;
    MyDate dateHired;

    public Employee(String name, String address, String phoneNumber, String emailAddress, int officeNumber,
                    int salary, MyDate dateHired){
        super(name, address, phoneNumber, emailAddress);
        this.officeNumber =  officeNumber;
        this.salary = salary;
        this.dateHired = dateHired;

    }
}
