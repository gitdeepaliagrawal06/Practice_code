package RealTimeInterface;


		class SBI implements Bank,Loan,Insurance
		{
			public float rateOfIntrest()
			{
				return 9.75f;
			}

			@Override
			public void healthInsursnce() {				
			}

			@Override
			public void lifeInsurance() {
				
				
			}

			@Override
			public void homeInsurance() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void homeLoan() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void carLoan() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void educationLoan() {
				// TODO Auto-generated method stub
				
			}
		}
		class ICICI implements Bank,Loan
		{
			public float rateOfIntrest()
			{
				return 9.25f;
			}

			@Override
			public void homeLoan() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void carLoan() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void educationLoan() {
				// TODO Auto-generated method stub
				
			}
		}

		public class BankTest
		{
			public static void main(String[] args)
			{
				Bank c=new ICICI();
				System.out.println("ICICI rateOfIntrest: "+c.rateOfIntrest());
				
				Bank s=new SBI();
				System.out.println("SBI rateOfIntrest: "+s.rateOfIntrest());	
			}

		}


	

