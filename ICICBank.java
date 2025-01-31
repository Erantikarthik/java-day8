
public class ICICBank extends Bank{
	

		public ICICBank(int openBalance) {
		super(openBalance);
		// TODO Auto-generated constructor stub
	}
		String name;
		String accNo;
		public void ICICIBank(String name, int balance, String accNo) {
		
			
			this.accNo = accNo;
			this.name = name;                     
			this.openBalance = balance;
			
		}
		
		void deposit(int amt) {
			System.out.println(":::::From ICICI Bank::::::");
			super.deposit(amt);
		}
		
		void withDraw(int amt) {
			System.out.println(":::::From ICICI Bank::::::");
			super.withDraw(amt);
			
		}
		void checkBalance() {
			System.out.println(":::::From ICICI Bank::::::");
			super.checkBalance();
		}



	}

