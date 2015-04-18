package uk.co.cogitolearning.cogpar;

public class ParserTest {

	Parser parser = new Parser();
	
	public void testParser(){
		
		try {
			  ExpressionNode expression = parser.parse("2+2");
			  expression.accept(new SetVariable("pi", Math.PI));
			  System.out.println("The value of the expression is "
			    + expression.getValue());
			}
			catch (ParserException e) {
			  System.out.println(e.getMessage());
			}
			catch (EvaluationException e) {
			  System.out.println(e.getMessage());
			}
	}
	
}
