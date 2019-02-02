package BudgetBuddy;

public class Starter 
{
	public static void main(String[] args)
	{
		BudgetList list = new BudgetList(100000);
		list.addItem("Funding Fee", 0.1, 10100);
		list.addItem("Sundering Fee", 0.2, 200);
		list.getListPercents();
		list.addItem("Thundering Fee", 0.7, 6000);
		list.getListPercents();
		list.addItem("Blundering Fee", 0.1, 2500);
		System.out.println(list.getItem("Funding Fee").getName());
		System.out.println(list.getItem("Funding Fee").getTotal());
		list.updateTotal(1000);
		System.out.println(list.getItem("Funding Fee").getTotal());
		list.updateTotal(2000);
		System.out.println(list.getItem("Funding Fee").getTotal());
		System.out.println(list.getItem("Sundering Fee").getTotal());
	}
}