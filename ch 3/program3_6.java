import java.util.Scanner;

class Smartcard {
    float emp_idn;

    public void markattendance(Employee e) {
        emp_idn = e.getEmpId();
        // instructions to mark present for empid.....

        System.out.println("Employe" + emp_idn + "is marked present");
    }

    public float getEmpIdn(Employee e) {
        return e.empid;
    }

}

class Employee {
    float empid;

    Employee() {
        System.out.println("Enter employee id");
        Scanner sc = new Scanner(System.in);
        this.empid = sc.nextFloat();
    }

    float getEmpId() {
        return empid;
    }

    public void Login(Smartcard sc) {
        float eid = sc.getEmpIdn(this);
        System.out.println("Login successful for employee " + eid);
    }
}

public class program3_6 {
    public static void main(String[] args) {
        System.out.println("*** ASSOCIATION BETWEEN EMPLOYEE AND SMARTCARD *****");

        Employee e = new Employee();
        System.out.println("NEW EMPLOYEE IS CREATED");
        Smartcard scd = new Smartcard();
        scd.markattendance(e);

        e.Login(scd);

    }
}
