package com.sonata;

public class savingsAcc extends Bank {

		savingsAcc (int no, String n,double b)
		{
			super(no,n,b);
		}
		savingsAcc()
		{
			
		}
		public void deposite()
		{
			super.deposite();
			System.out.println("saving bank deposite");
		}
		public static void main(String[] args) 
		{
			savingsAcc s1 = new savingsAcc();
			s1.accNo=123;
			s1.accName="andhra";
			s1.accBal=243544;
			
			s1.display();
			s1.deposite();
			s1.withdraw();
			
			savingsAcc s2 = new savingsAcc(124,"hdfc",254354);
			s2.display();
			s2.deposite();
		}
	}

