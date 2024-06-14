package com.hcltech.Exer2;

public class Employeedemo {
	public static void main(String[] args) {
		FullTimeHourlyEmployee fullTimeHourlyEmployee = new FullTimeHourlyEmployee("John Doe", 101, 20.0);
		PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Jane Smith", 102, 15.0);
		Engineer engineer = new Engineer("Alice Johnson", 103, 75000.0);
		Technician technician = new Technician("Bob Brown", 104, 60000.0);
		ClericalStaff clericalStaff = new ClericalStaff("Carol White", 105, 40000.0);
		Executive executive = new Executive("Eve Black", 106, 120000.0);

		fullTimeHourlyEmployee.displayDetails();
		partTimeEmployee.displayDetails();
		engineer.displayDetails();
		technician.displayDetails();
		clericalStaff.displayDetails();
		executive.displayDetails();
	}
}
