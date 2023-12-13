package EmployeeWage;
import java.util.*;

public class EmployeeWageManager
{
	 private List<Company> companies;

	    public EmployeeWageManager() {
	        this.companies = new ArrayList<>();
	    }

	    public void addCompany(Company company) {
	        companies.add(company);
	    }

}
