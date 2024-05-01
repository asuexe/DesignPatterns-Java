package c;

import java.util.ArrayList;

public class CompanyDirectery implements compositepart
{
	private ArrayList<compositepart> a = new ArrayList<compositepart>();

	@Override
	public void showDetails()
	{
		for(compositepart cp:a)
		{
			cp.showDetails();
		}
	}
	public void addEmployee(compositepart cp)
	{
		a.add(cp);
	}
	public void removeEmployee(compositepart cp)
	{
		a.remove(cp);
	}

}
