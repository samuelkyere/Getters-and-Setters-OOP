package gettersandsetters;

public class Computer {
	static int count=0;
	
	private String cname;
	private int cyear;
	private int ccost;
	
	public Computer()
	{
		count++;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getCyear() {
		return cyear;
	}

	public void setCyear(int cyear) {
		this.cyear = cyear;
	}

	public int getCcost() {
		return ccost;
	}

	public void setCcost(int ccost) {
		this.ccost = ccost;
	}
	
	public static void totalComputers() {
	System.out.println("total number of computers are "+count );	
	}
	
}//closing class
