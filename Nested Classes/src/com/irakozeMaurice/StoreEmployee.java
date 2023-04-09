package com.irakozeMaurice;

import java.util.Comparator;

public class StoreEmployee extends Employee{
	
	// Instance inner class example
	public class StoreComparator<T extends StoreEmployee> implements Comparator<StoreEmployee>{

		@Override
		public int compare(StoreEmployee o1, StoreEmployee o2) {
			
			int result = o1.store.compareTo(o2.store);
			if(result == 0) {
				return new Employee.EmployeeComparator<Employee>("startYear").compare(o1, o2);
			}
			return result;
		}
		
	}
	
	
	private String store;

	public StoreEmployee() {}
	
	public StoreEmployee(int employeeId, String name, int startYear,String store) {
		super(employeeId,name,startYear);
		this.store = store;
	}

	@Override
	public String toString() {
		return store + "\t\t" + super.toString();
	}

}
