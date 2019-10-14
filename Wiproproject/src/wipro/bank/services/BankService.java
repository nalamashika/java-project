package wipro.bank.services;

import wipro.bank.acc.RDAccount;
import wipro.bank.exception.BankValidException;

public class BankService {

public boolean validateData(float principal, int tenure,int age, String gender)
{
	try {
	if(principal<=500 || (tenure==5 && tenure ==10) || gender.equalsIgnoreCase ("female")|| gender.equalsIgnoreCase ("male") || (age>=1 && age<=100))
	{
	return true;
	}
	else {
		throw new BankValidException();
	}
	}	
	catch(BankValidException exp){
		
		System.out.println(exp);
		return false;
	}



public void calculate(float principal,int tenure, int age, String gender)

{
	if(validateData(principal,tenure,age,gender)){
		RDAccount r=new RDAccount(tenure,principal);
		r.setInterest(age, gender);
		System.out.println("total amount deposited");
		System.out.println("interest:");
		System.out.println("maturity interest:");
		
				
		
	}
}
	
}
}
