package compositeDesign;

public class CompositeTester 
{
	public static void main(String[] args) {
		
	Component hd = new leaf(3000, "HDD");
	Component mouse = new leaf(800, "MOUSE");
	Component monitor = new leaf(8500, "MONITOR");
	
	Composite cabinet = new Composite("Cabinet");
	Composite computer = new Composite("Computer");

	//hd.showprice();
	cabinet.addComponent(hd);
	cabinet.addComponent(mouse);
	cabinet.addComponent(monitor);
	computer.addComponent(cabinet);

	computer.showprice();
	
	
	
	}
}
