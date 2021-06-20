package week1day2;

public class employee {
	
	
	public void printEmployeeDetails(String firstName, int empId) {
		System.out.println("Details of "+firstName+" "+empId);

	}
	
	public String getEmployeeAddress() {
		
		return "Chennai";
	}
	

	public static void main(String[] args) {
		employee emp1 = new employee();
		
		emp1.printEmployeeDetails("Hari",100);
		
		
		
		String address = emp1.getEmployeeAddress();
		
		System.out.println(address);
	}
	
}