public class Faculty extends Employee {
    String officeHours, rank;
    Faculty(String name, String address,String phoneNumber,String emailAddress,int officerNumber,
            int salary,MyDate dateHired,String officeHours,String rank) {
        super(name, address, phoneNumber, emailAddress, officerNumber, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String toString(){
        return "Faculty\nName: "+name+"\nAddress: "+address+"\nPhone number: "+phoneNumber+
                "\nEmail Address: "+emailAddress+"\nOffice number: "+officeNumber+
                "\nSalary: "+salary+"\nDate Hired: "+dateHired.getDate()+"\nHours: "+officeHours+"\nRank: "+rank;
    }
}
