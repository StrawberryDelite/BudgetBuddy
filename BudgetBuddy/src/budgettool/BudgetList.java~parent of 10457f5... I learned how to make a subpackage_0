package budgettool;

import java.util.ArrayList;

public class BudgetList 
{
	ArrayList<BudgetItem> itemList = new ArrayList<BudgetItem>();
	double totalIncome = Integer.MIN_VALUE;
	
	public BudgetList(double income)
	{
		totalIncome = income;
	}
	
	public void addItem(String name, double percent, double limit)
	{
		double totalPercent = percent;
		for (BudgetItem item : itemList)
		{
			totalPercent += item.getPercent();
		}
		if (totalPercent <= 1.0) { itemList.add(new BudgetItem(name, percent, totalIncome, limit)); }
		else { System.out.println("Erroneous Allocation"); }
	}
	
	public void updateTotal(double total)
	{
		for (BudgetItem item : itemList)
		{
			item.setTotal(item.getTotal() + (item.getPercent() * total));
		}
	}
	
	public BudgetItem getItem(String name)
	{
		for (BudgetItem item : itemList)
		{
			if (item.getName().equals(name))
			{
				return item;
			}
		}
		return null;
	}
	
	public void getListPercents()
	{
		double totalPercent = 0.0;
		for (BudgetItem item : itemList)
		{
			System.out.println(item.getName() + ": " + item.getPercent());
			totalPercent += item.getPercent();
		}
		System.out.println("Budget Percent: " + totalPercent);
	}
	
	public ArrayList<BudgetItem> getList()
	{
		return itemList;
	}
}
