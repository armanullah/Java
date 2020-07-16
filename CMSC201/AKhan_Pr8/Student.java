public class Student extends Person {

    final String status;

    Student(String name, String address, String phoneNumber, String emailAddress, String status) {
        super(name, address, phoneNumber, emailAddress);
        this.status = status;
    }

    public String toString() {//method to override toString method in object class
        return "Student\nName: " + name + "\nAddress: " + address + "\nPhone number: " + phoneNumber +
                "\nEmail Address: " + emailAddress + "\nStatus: " + status;
    }
}
