package c;

public class Company {
	public static void main(String[] args) {
		Devloper D1 = new Devloper(100 ,"vivek","SeniorDev");
		Devloper D2 = new Devloper(101 ,"Jaydeep","JuniorDev");
		Manager M1 = new Manager(200 ,"Aditya","SeniorManager");
		Manager M2 = new Manager(201 ,"Meet","JuniorManager");
		CompanyDirectery CD1 = new CompanyDirectery();
		CD1.addEmployee(D1);
		CD1.addEmployee(D2);
		CompanyDirectery CD2 = new CompanyDirectery();
		CD2.addEmployee(M1);
		CD2.addEmployee(M2);
		//CD2.removeEmployee(M2);
		CompanyDirectery CDmain = new CompanyDirectery();
		CDmain.addEmployee(CD1);
		CDmain.addEmployee(CD2);
		CDmain.showDetails();
	}

}
