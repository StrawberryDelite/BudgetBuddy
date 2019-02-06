package budgetbuddy.budget;

class BudgetItem 
{
	private String itemName;
	private double itemPercent;
	private double itemTotal;
	private double itemLimit;
	
	//Constructor for the BudgetItem, takes in four variables. The name of the object, associated running total, percent value,
	//and upper limit to determine if the desired percent should be awarded again
	public BudgetItem(String name, double percent, double total, double limit)
	{
		itemName = name;
		itemPercent = percent;
		itemTotal = total * itemPercent;
		itemLimit = limit;
	}
	
	//Setters that allow for the modification of budget funds. Savings can be renamed, current totals can be updated, percentages can
	//be modified and limits adjusted
	public void setName(String name) { itemName = name; }
	public void setTotal(double total) { itemTotal = total; }
	public void setPercent(double percent) { itemPercent = percent; }
	public void setLimit(double limit) { itemLimit = limit; }
	
	//Getters that allow for the information to be received and displayed to screen
	public String getName() { return itemName; }
	public double getTotal() { return itemTotal; }
	public double getPercent() { return itemPercent; }
	public double getLimit() { return itemLimit; }
}
