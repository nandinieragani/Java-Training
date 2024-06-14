package com.hcltech.Exer2;

public class Employeedemo2 {
	public static void main(String[] args) {
		String Employee_Name = args[0];
		String Department_of_Employee = args[1];
		String Designation = args[2];
		int salary = Integer.parseInt(args[3]);
		Employee2 x1 = new Employee2();
		x1.setEmployee_Name("ram");
		x1.setDepartment_of_Employee("Mgr");
		x1.setDesignation("Graduate engineer");
		x1.setSalary(45000);
		System.out.println(x1);
		if (Department_of_Employee.equals("Mgr")) {
			x1 = new Manager(Employee_Name, Department_of_Employee, Designation, salary);
		} else {
			x1 = new Clerk(Employee_Name, Department_of_Employee, Designation, salary);
		}
		x1.Employee2Details();
		if (x1 instanceof Manager) {
			((Manager) x1).Salarycalculation();
		} else if (x1 instanceof Clerk) {
			((Clerk) x1).Salarycalculation();
		}
	}
}
