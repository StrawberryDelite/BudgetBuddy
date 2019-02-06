package budgetbuddy;

import java.util.Stack;

public class Category {
	
	 private Stack<Transaction> _transHistory = new Stack<Transaction>();
	 
	 
	 
	 
	 public void add(Transaction newItem) 
	 //pushes the argument to the transHistory stack
	 {
		 this._transHistory.push(newItem);
	 }
	 
	 
	 
	 public void addStack(Stack<Transaction> NewItems) 
	 //pushes the argument to the transHistory stack
	 {
		 while (NewItems.size() > 0)
		 {
			 this._transHistory.push(NewItems.pop());
		 }
	 }
	 
	 
	 
	 public double expenses()
	 //collates the costs of all Transactions in the category's transHistory Stack
	 {	 
		 double accumulator = 0;
		 Transaction temp = new Transaction(null, 0, null);
		 Stack<Transaction> tempStack = new Stack<Transaction>();
		 
		 
		 while (this._transHistory.size() > 0)
		 {
			 temp = tempStack.push(_transHistory.pop());
			 accumulator += temp.getCost();
		 }
		 
		 while (tempStack.size() > 0)
		 {
			 this._transHistory.push(tempStack.pop());
		 }
		 
		 return accumulator;
	 }
	 
	 public Transaction[] getHistory(int length) // TODO
	 //returns a specified number of transactions in an array, with the most recent in index 0
	 {
		 Transaction[] transArray = new Transaction[length];
		 
		 for (int i = 0; i < length; i++)
		 {
			 transArray[i] = this._transHistory.pop();
		 }
		 
		 for (int i = 0; i < length; i++)
		 {
			 this._transHistory.push(transArray[i]);
		 }
		 
		 return transArray;
	 }
	 
	 
}
