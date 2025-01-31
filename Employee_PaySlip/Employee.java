package Employee_PaySlip;

public class Employee {
    int Emp_id;
    String Emp_name;
    String Address;
    String Mail_Id;
    String Mobile_no;
    Employee(){}
    Employee(int id,String name,String addr,String mail,String mob)
    {
        this.Emp_id=id;
        this.Emp_name=name;
        this.Address=addr;
        this.Mail_Id=mail;
        this.Mobile_no=mob;
    }

}
