package main.sbxx.designpattern.interpreter;

/**
 * @author Dair
 * @since
 */
public class Test {
	
	public static  Expression getMaleExpression(){
		Expression rebert=new TerminalExpression("Rebert");
		Expression john=new TerminalExpression("John");
		return new OrExpression(rebert,john);
	}
	
	public static  Expression getMarriedWomanExpression(){
		Expression julie=new TerminalExpression("Julie");
		Expression married=new TerminalExpression("Married");
		return new AddExpression(julie,married);
	}
	
	public static void main(String[] args) {
		Expression maleExpression = getMaleExpression();
		Expression marriedWomanExpression = getMarriedWomanExpression();
		System.out.println("John is male? " + maleExpression.interpret("John"));
		System.out.println("Julie is a married women? "
				+ marriedWomanExpression.interpret("Married Julie"));
	}
	
}
