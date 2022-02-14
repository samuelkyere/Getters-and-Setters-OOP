package gettersandsetters;

public class Starters1 {

	public static void main(String[] args) {
		// Creating POJOs or Beans
		
     Computer c1 = new Computer();
     Computer c2 = new Computer();
     
     //Assigning or setting the properties
     c1.setCname("Nana");
     c1.setCyear(1940);
     c1.setCcost(2000);
     
     
     c2.setCname("Akos");
     c2.setCyear(1970);
     c2.setCcost(2021);
     
     //Displaying or getting the properties
     		System.out.println(c1.getCname());
     		System.out.println(c1.getCyear());
     		System.out.println(c1.getCcost());
     		System.out.println();
     		
     		System.out.println(c2.getCname());
     		System.out.println(c2.getCyear());
     		System.out.println(c2.getCcost());
     		
     		Computer.totalComputers();
	}
	

}
