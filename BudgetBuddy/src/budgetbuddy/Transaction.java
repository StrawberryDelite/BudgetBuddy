package budgetbuddy;

import java.util.Date;

//Basic receipt item
public class Transaction
{
	private String _sName;	//item name
	private double _dCost;	//item cost
	private Date _dDate;	//item date of sale
	
	//Constructor
	public Transaction(String name, double cost, Date date) {
		this._sName = name;
		this._dCost = cost;
		this._dDate = date;
	}
	
	//getCost - getter for item name
	public String getName() {
		return _sName;
	}
	//getCost - getter for item cost
	public double getCost() {
		return _dCost;
	}
	//getCost - getter for item date
	public Date getDate() {
		return _dDate;
	}
}