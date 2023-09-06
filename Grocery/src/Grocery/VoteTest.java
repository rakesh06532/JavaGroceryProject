package Grocery;
import java.util.InputMismatchException;
import java.util.Scanner;
public class VoteTest {
	static int BJP;
	static int JMM;
	static int CONGRES;
	static int AAM;
	static int LOCAL;
	 int vote;
	String s;
	void getList()
	{
		VoteTest obj=new VoteTest();
		try
		{
		System.out.println("=========ENTER YOUR CHOICE FOR VOTING========");
		System.out.println("Enter 1 for BJP");
		System.out.println("Enter 2 for JMM");
		System.out.println("Enter 3 for CONGRES");
		System.out.println("Enter 4 AAM Party");
		System.out.println("Enter 5 LOCAL Part");
		obj.getParty();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Please enter numeric key \n");
			obj.getList();
		}
	}
	void getParty()
	{
		Scanner sc=new Scanner(System.in);
		VoteTest obj=new VoteTest();
		 vote=sc.nextInt();
		if(vote>5 || vote<=0)
		{
			System.out.println("Please enter vote between 1 to 5 ");
			obj.getList();
		}
		else
		{
		switch(vote)
		{
		case 1 : System.out.println("You gave Vote for BJP Party");
		System.out.println("Thankyou for Voting");
		System.out.println("=========================================");
		BJP++;
		System.out.println("You want to continue for voting");
		System.out.println("Enter : Y/N");
		 s=sc.next();
		if(s.equalsIgnoreCase("Y"))
			obj.getList();
		else
			obj.getResult();
		break;
		case 2 : System.out.println("You gave Vote for JMM Party");
		System.out.println("Thankyou for Voting");
		System.out.println("=========================================");
		JMM++;
		System.out.println("You want to continue for voting");
		System.out.println("Enter : Y/N");
		 s=sc.next();
		if(s.equalsIgnoreCase("Y"))
			obj.getList();
		else
			obj.getResult();
		break;
		case 3 : System.out.println("You gave Vote for CONGRES Party");
		System.out.println("Thankyou for Voting ");
		System.out.println("=========================================");
		CONGRES++;
		System.out.println("You want to continue for voting");
		System.out.println("Enter : Y/N");
		 s=sc.next();
		if(s.equalsIgnoreCase("Y"))
			obj.getList();
		else
			obj.getResult();
		break;
		case 4 : System.out.println("You gave Vote for AAM Party ");
		System.out.println("Thankyou for Voting ");
		System.out.println("=========================================");
		AAM++;
		System.out.println("You want to continue for voting");
		System.out.println("Enter : Y/N");
		 s=sc.next();
		if(s.equalsIgnoreCase("Y"))
			obj.getList();
		else
			obj.getResult();
		break;
		case 5 : System.out.println("You gave Vote for LOCAL Party");
		System.out.println("Thankyou for Voting");
		System.out.println("=========================================");
		LOCAL++;
		System.out.println("You want to continue for voting");
		System.out.println("Enter : Y/N");
		 s=sc.next();
		if(s.equalsIgnoreCase("Y"))
			obj.getList();
		else
			obj.getResult();
		break;		  
		}
		}
		sc.close();
	}
	void getResult()
	{
		if(BJP>=JMM && BJP>=CONGRES && BJP>=AAM && BJP>=LOCAL)
		{
			System.out.println("Congratulations BJP have wone the Election \nTOTAL Vote of BJP : "+BJP);
			System.out.println("\nTOTAL Vote of JMM : "+JMM+"\nTOTAL Vote of CONGRES : "+CONGRES
					+ "\nTOTAL Vote of AAM : "+AAM+" \nTOTAL Vote of LOCAL : "+LOCAL);
		}
		else if(JMM>=BJP && JMM>=CONGRES && JMM>=AAM && JMM>=LOCAL)
		{
			System.out.println("Congratulations JMM have wone the Election \n TOTAL Vote : "+JMM);
			System.out.println("\nTOTAL Vote of BJB : "+BJP+"\nTOTAL Vote of CONGRES : "+CONGRES
					+ "\nTOTAL Vote of AAM : "+AAM+" \nTOTAL Vote of LOCAL : "+LOCAL);
		}
		else if(CONGRES>=BJP && CONGRES>=JMM && CONGRES>=AAM && CONGRES>=LOCAL)
		{
			System.out.println("Congratulations CONGRES have wone the Election \n TOTAL Vote : "+CONGRES);
			System.out.println("\nTOTAL Vote of JMM : "+JMM+"\nTOTAL Vote of BJP : "+BJP
					+ "\nTOTAL Vote of AAM : "+AAM+" \nTOTAL Vote of LOCAL : "+LOCAL);
		}
		else if(AAM>=BJP && AAM>=JMM && AAM>=CONGRES && AAM>=LOCAL)
		{
			System.out.println("Congratulations AAM have wone the Election \n TOTAL Vote : "+AAM);
			System.out.println("\nTOTAL Vote of BJP : "+BJP+"\nTOTAL Vote of CONGRES : "+CONGRES
					+ "\nTOTAL Vote of AAM : "+AAM+" \nTOTAL Vote of LOCAL : "+LOCAL);
		}
		else
		{
			System.out.println("Congratulations LOCAL have wone the Election \n TOTAL Vote : "+LOCAL);
			System.out.println("\nTOTAL Vote of JMM : "+JMM+"\nTOTAL Vote of CONGRES : "+CONGRES
					+ "\nTOTAL Vote of AAM : "+AAM+" \nTOTAL Vote of BJP : "+BJP);
		}
	}
	public static void main(String[] args) {
		VoteTest obj=new VoteTest();	
		obj.getList();
	}
}
