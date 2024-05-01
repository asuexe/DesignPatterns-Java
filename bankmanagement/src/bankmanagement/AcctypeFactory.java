package bankmanagement;

public class AcctypeFactory implements account {
	

	@Override
	public account type(String Acc) {
		if(Acc.equalsIgnoreCase("Savings")) {
			return (account) new savingacc();
		}
		else if(Acc.equalsIgnoreCase("current")) {
			return(account) new currentacc();
		}
		return null;
	
	}

	
	/*public void type() {
		System.out.println("corrent account created.");
	}
	public void addinfo() {
		Scanner sc = new Scanner(System.in);
	//	File f = new File("info.txt");
		 FileWriter fw = null;
		try {
			fw = new FileWriter("info2.txt");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}  
		    BufferedWriter bw = new BufferedWriter(fw);     
		try {
			System.out.println("enter your name.");
			String Name = sc.next();
			bw.write(Name);
			System.out.println("enter Mo. number");
			int no = sc.nextInt();
			bw.write(no);
			System.out.println("enter PAN no.");
			//for now assume Pan number is integer
			int pan = sc.nextInt();
			bw.write(pan);
			/*fw.close();
			bw.close();*/
			
		//catch(Exception e) {
		//	System.out.println(e);*
}
