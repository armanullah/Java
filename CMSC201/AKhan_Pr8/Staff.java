public class Staff extends Employee {
    String title;

    Staff(String name, String address, String phoneNumber, String emailAddress, int officerNumber, int salary,
    MyDate dateHired, String title) {
        super(name, address, phoneNumber, emailAddress, officerNumber, salary, dateHired);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff\nName: "+ name +"\nAddress: "+ address +"\nPhone number: "+ phoneNumber +"\nEmail Address: "
                + emailAddress +"\nOffice number: "+ officeNumber +"\nSalary: "+ salary +
                "\nDate: "+ dateHired.getDate()+"\nTitle: " + title;
    }
}
