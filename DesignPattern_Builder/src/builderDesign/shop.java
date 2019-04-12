package builderDesign;

public class shop 
{
	public static void main(String[] args) 
	{
		Phone p = new Phonebuilder().setOs("Android").setBattery(3100).getPhone();
		System.out.println(p);
	}

}
