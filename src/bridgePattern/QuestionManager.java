package bridgePattern;

public class QuestionManager
{
	protected Question q;
	private String catalog;
	
	
	public QuestionManager(String catalog) {
		this.catalog = catalog;
	}
	
	public void next()
	{
		q.nextQuestion();
	}
	
	public void previous()
	{
		q.previousQuestion();
	}
	
	public void newOne(String qq)
	{
		q.newQuestion(qq);
	}
	
	public void delete(String qq)
	{
		q.deleteQuestion(qq);
	}
	public void display()
	{
		q.displayQuestion();
	}
	
	public void displayAll()
	{
		System.out.println("Question paper :"+catalog);
		q.displayAllQuestion();
	}

}
