package com.irakozeMaurice;

import java.util.Comparator;

public class Employee {
	
	// static inner class example
	public static class EmployeeComparator<T extends Employee> implements Comparator<Employee> {

		private String type;
		
		public EmployeeComparator() {
			this("name");
		}
		
		public EmployeeComparator(String type) {
			this.type = type;
		}
		
		@Override
		public int compare(Employee o1, Employee o2) {
			if(type.equalsIgnoreCase("startYear")) {
				return o1.startYear - o2.startYear;
			}
			
			return o1.name.compareTo(o2.name);
		}
	}
	
	
	private int employeeId;
	private String name;
	private int startYear;

	public Employee() {	}
	
	public Employee(int employeeId, String name, int startYear) {
		this.employeeId = employeeId;
		this.name = name;
		this.startYear = startYear;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return employeeId +"\t\t"+ name + "\t\t" + startYear;
	}
}
