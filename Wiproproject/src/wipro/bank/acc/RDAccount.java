package wipro.bank.acc;

public class RDAccount extends Account {
	public RDAccount(int tenure, float principal) 
	{
		this.tenure=tenure;
		this.principal=principal;
	}

	@Override
	public float calculateInterest() {
		// TODO Auto-generated method stub
		float r=rateOfInterest/100;
		float interest=0.0f;
		int n=4*tenure;
		float tn=tenure*12;
		for(int i=0;i<=tn;i++)
		{
			interest+= principal * (float) (Math.pow(1+(r/n), n*((tn-i)/12.0))-1);

			
		}
		return interest;
	}

	@Override
	public float calculateAmountDeposited() {
		// TODO Auto-generated method stub
		
		return  principal*tenure*12;
	}
}
