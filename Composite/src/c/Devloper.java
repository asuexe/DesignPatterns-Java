package c;

public class Devloper implements compositepart {
	private String name;
	private long ID;
	private String position;
	public Devloper(int ID,String name,String position) {
		this.ID =ID;
		this.name=name;
		this.position=position;
	}
	@Override
	public void showDetails() {
		System.out.println(ID + " "+name+" "+position);
	}
	

}