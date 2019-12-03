package bridgePattern;

public class Testing
{
	public static void main(String[] args)
	{
		QuestionFormat questions = new QuestionFormat("JAVA Question");
		questions.q = new JavaQuestion();
		
		questions.delete("what is java??");
        questions.display();
        
        questions.newOne("hello sandhya");
        questions.displayAll();
        
		
	}

}
