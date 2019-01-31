package budgetbuddy;

import java.util.Stack;

public class Category {
	
	 private Stack<Transaction> history = new Stack<Transaction>();
	 
	 public double expenses()
	 {
		 //collates the costs of all Transactions in the category's history Stack
		 
		 double accumulator = 0;
		 Transaction temp = new Transaction();
		 Stack<Transaction> tempStack = new Stack<Transaction>();
		 
		 
		 while (history.size() > 0)
		 {
			 temp = tempStack.push(history.pop());
			 accumulator += temp.cost();
		 }
		 
		 while (tempStack.size() > 0)
		 {
			 history.push(tempStack.pop());
		 }
		 
		 return accumulator;
	 }
	 
	 
	 
	 
}
