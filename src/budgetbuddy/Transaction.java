package budgetbuddy;

import java.util.Date;

//Basic receipt item
public class Transaction
{
	String _sName;	//item name
	double _dCost;	//item cost
	Date _dDate;	//item date of sale
	
	//Constructor
	public Transaction(String name, double cost, Date date) {
		this._sName = name;
		this._dCost = cost;
		this._dDate = date;
	}
	
	//getCost - getter for item name
	public String GetName() {
		return _sName;
	}
	//getCost - getter for item cost
	public double GetCost() {
		return _dCost;
	}
	//getCost - getter for item date
	public Date GetDate() {
		return _dDate;
	}
} 