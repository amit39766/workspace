//Answer to the Question No.01>>c
public class Sales {
	private int id;
	private String name;
	public double salesprice;
	public void Sales(int id,String name,double salesprice){
		this.id=id;
		this.name=name;
		this.salesprice=salesprice;
	}
	public void input(int id,String name,double salesprice){
		this.id=id;
		this.name=name;
		this.salesprice=salesprice;
	}
	public void calculate(){
		if(salesprice>=3000){
			double discount=salesprice*(1/100);
			salesprice=salesprice-discount;
		}
			
	}
	public void displaySales(){
		System.out.println("ID : "+id);
		System.out.println("Name : "+name);
		System.out.println("Sales Price : "+salesprice);
	}

}