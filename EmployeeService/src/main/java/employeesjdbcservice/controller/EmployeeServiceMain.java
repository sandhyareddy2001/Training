package employeesjdbcservice.controller;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.Scanner;

import employeejdbcservice.model.Employees;
import employeejdbcservice.service.EmployeesServiceImpl;
import employeejdbcservice.service.IEmployeesService;

public class EmployeeServiceMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		IEmployeesService service = new EmployeesServiceImpl();
		
		/*System.out.println("Enter id ");
		int id = sc.nextInt();
		System.out.println("Enter FirstName");
		String fname = sc.next();
		System.out.println("Enter LastName");
		String lname = sc.next();
		
		Employees empl = new Employees(id,fname,lname);
		String result = service.insertEmployees(empl);
		System.out.println(result);
		*/
		Iterator<Employees> itr = service.getAllEmployees().iterator();
		while(itr.hasNext()) {
			Employees k = itr.next();
			System.out.println(k.getId()+" "+k.getFirstName()+" "+k.getLastName());
		}
		System.out.println("Enter the id of the person you want to delete: ");
		int r=sc.nextInt();
		System.out.println(service.deleteEmployee(r));
		Iterator<Employees> it = service.getAllEmployees().iterator();

		while(it.hasNext()) {
			Employees k = it.next();
			System.out.println(k.getId()+" "+k.getFirstName()+" "+k.getLastName());
		}
		

	}

}
