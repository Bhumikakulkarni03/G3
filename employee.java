import java.util.Scanner;
public class employee {
    int id;
    String name;
    int salary;
    void read(){
        // System.out.println("Enter id name and salary of employee");
        // Scanner s=new Scanner(System.in);
        // id=s.nextInt();
        // name=s.next();
        // salary=s.nextInt();
        id=001;
        name="ramesh";
        salary=10000;
    }
    void display(){
        System.out.println("Id: "+id+"\nName: "+name+"\nSalary: "+salary);
    }
    public static void main(String[] args) {
        employee e1=new employee();
        e1.read();
        e1.display();
    }
}
