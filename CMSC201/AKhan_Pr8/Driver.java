import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        String name, address, phone, email;
        Scanner s = new Scanner(System.in);
        System.out.println("What object do you want to create?");
        int option;
        do {
            System.out.println("1.Student\n2.Faculty\n3.Staff\nEnter your response(1-3):");
            option = s.nextInt();
            if(option < 1 && option > 3) {
                System.out.println("Incorrect option selected. Please re-enter.");
            }
        } while(option < 1 && option > 3);
        //user enter's person information
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println("Enter address: ");
        address = sc.nextLine();
        System.out.println("Enter phone number: ");
        phone = sc.nextLine();
        System.out.println("Enter email address: ");
        email = sc.nextLine();

        switch(option){     //print responses based on user choice

            case 1:
                System.out.println("Enter student status: ");
                String status=sc.nextLine();
                Student st = new Student(name,address,phone,email,status);
                System.out.println(st.toString());
                break;
            case 2:System.out.println("Enter office number: ");
                int officeNumber = s.nextInt();
                System.out.println("Enter salary: ");
                int salary = s.nextInt();
                System.out.println("Enter Date(mm/dd/yyyy): ");
                String date = sc.nextLine();
                MyDate dt = new MyDate(date);
                System.out.println("Enter office hours: ");
                String hrs = sc.nextLine();
                System.out.println("Enter Rank: ");
                String rank = sc.nextLine();
                Faculty f = new Faculty(name,address,phone,email,officeNumber,salary,dt,hrs,rank);
                System.out.println(f.toString());
                break;
            case 3:System.out.println("Enter office number: ");
                int officeNumbers = s.nextInt();
                System.out.println("Enter salary: $");
                int salarys = s.nextInt();
                System.out.println("Enter date hired: ");
                String dates = sc.nextLine();
                MyDate dts = new MyDate(dates);
                System.out.println("Enter title of staff: ");
                String title = sc.nextLine();
                Staff staff =  new Staff(name,address,phone,email,officeNumbers,salarys,dts,title);
                System.out.println(staff.toString());
                break;
        }
    }
}
