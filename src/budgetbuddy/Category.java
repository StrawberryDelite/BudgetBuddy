package budgetbuddy;

import java.util.Stack;

public class Category {
	
	 private Stack<Transaction> transHistory = new Stack<Transaction>();
	 
	 
	 
	 
	 public void add(Transaction newItem) 
	 //pushes the argument to the transHistory stack
	 {
		 transHistory.push(newItem);
	 }
	 
	 
	 
	 public void addStack(Stack<Transaction> NewItems) 
	 //pushes the argument to the transHistory stack
	 {
		 while (NewItems.size() > 0)
		 {
			 transHistory.push(NewItems.pop());
		 }
	 }
	 
	 
	 
	 public double expenses()
	 //collates the costs of all Transactions in the category's transHistory Stack
	 {	 
		 double accumulator = 0;
		 Transaction temp = new Transaction();
		 Stack<Transaction> tempStack = new Stack<Transaction>();
		 
		 
		 while (transHistory.size() > 0)
		 {
			 temp = tempStack.push(transHistory.pop());
			 accumulator += temp.cost();
		 }
		 
		 while (tempStack.size() > 0)
		 {
			 transHistory.push(tempStack.pop());
		 }
		 
		 return accumulator;
	 }
	 
	 public Transaction[] getHistory(int length) // TODO
	 //returns a specified number of transactions in an array, with the most recent in index 0
	 {
		 Transaction[] transArray = new Transaction[length];
		 
		 for (int i = 0; i < length; i++)
		 {
			 transArray[i] = transHistory.pop();
		 }
		 
		 for (int i = 0; i < length; i++)
		 {
			 transHistory.push(transArray[i]);
		 }
		 
		 return transArray;
	 }
	 
	 
}
