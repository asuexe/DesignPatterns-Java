package c;

public class Manager implements compositepart {
	private String name;
	private long ID;
	private String position;
	public Manager(int ID,String name,String position) {
		this.ID =ID;
		this.name=name;
		this.position=position;
	}
	@Override
	public void showDetails() {
		System.out.println(ID + " "+name+" "+position);
	}
}
