package com.irakozeMaurice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(101,"Carole",2010));
		employees.add(new Employee(103,"Laura",2011));
		employees.add(new Employee(102,"Jim",2014));
		employees.add(new Employee(105,"Ralph",2003));
		employees.add(new Employee(104,"Jane",2020));
		
//		EmployeeComparator<Employee> employeeComparator = new Employee.EmployeeComparator<Employee>();
//		employees.sort(employeeComparator);
//		employees.sort(employeeComparator.reversed());
		
//		EmployeeComparator<Employee> employeeComparator = new EmployeeComparator<Employee>("startYear");
		employees.sort(new Employee.EmployeeComparator<Employee>("startYear").reversed());
		
		System.out.println("-------------Employees----------------");
		System.out.println();
		
		for(Employee e : employees) {
			System.out.println(e);
		}
		
		System.out.println();
		System.out.println("-------------store employees----------------");
		System.out.println();
		
		List<StoreEmployee> storeEmployees = new ArrayList<StoreEmployee>();
		
		storeEmployees.add(new StoreEmployee(202,"Marty",2018,"walmart"));
		storeEmployees.add(new StoreEmployee(201,"Tom",2019,"macys"));
		storeEmployees.add(new StoreEmployee(204,"Bud",2011,"kfc"));
		storeEmployees.add(new StoreEmployee(205,"Meg",2017,"walmart"));
		storeEmployees.add(new StoreEmployee(203,"Joe",2016,"kfc"));
		
		storeEmployees.sort(new StoreEmployee().new StoreComparator<StoreEmployee>());
		
		for (StoreEmployee storeEmp : storeEmployees) {
			System.out.println(storeEmp);
		}
		
		System.out.println();
		System.out.println("-------------Decorated employees----------------");
		System.out.println();
		
		addPigLatinName(storeEmployees);
		
		// Anonymous inner class example
		employees.sort(new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getEmployeeId() - o2.getEmployeeId();
			}
		}.reversed());
		
		System.out.println();
		System.out.println("--------------Employees sorted by employee id reverse order---------------");
		System.out.println();
		
		for(Employee e : employees) {
			System.out.println(e);
		}
	}

	private static void addPigLatinName(List<? extends StoreEmployee> storeEmployees) {
		
		// Local inner class example
		class DecoratedEmployee extends StoreEmployee implements Comparable<DecoratedEmployee>{
			private String latinName;
			private Employee originalInstance;
			
			public DecoratedEmployee(String latinName,Employee originalInstance) {
				this.latinName = latinName;
				this.originalInstance = originalInstance;
			}
			
			public String toString() {
				return originalInstance.toString() + "\t\t" + latinName;
			}

			@Override
			public int compareTo(DecoratedEmployee o) {
				return this.latinName.compareTo(o.latinName);
			}
		}
		
		List<DecoratedEmployee> decoratedEmployees = new ArrayList<>(storeEmployees.size());
		
		for(StoreEmployee storeEmployee : storeEmployees ) {
			String latinName = storeEmployee.getName().substring(1) + storeEmployee.getName().charAt(0) + "ay";
			decoratedEmployees.add(new DecoratedEmployee(latinName, storeEmployee));
		}
		
		decoratedEmployees.sort(null);
		
		for (DecoratedEmployee decoratedEmployee : decoratedEmployees) {
			System.out.println(decoratedEmployee);
		}
	}
}
