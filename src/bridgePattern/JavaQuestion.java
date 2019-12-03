package bridgePattern;

import java.util.ArrayList;
import java.util.List;

public class JavaQuestion implements Question
{
	
	private List<String> questions = new ArrayList<String>();
	private int current = 0;
	
	
	public JavaQuestion()
	{
		questions.add("what is string?");
		questions.add("what is java?");
		questions.add("what is abstract?");		
		questions.add("what is interface?");		
	}

	@Override
	public void nextQuestion() {
		if(current <= questions.size()-1)
		current++;
		System.out.print(current);
	}

	@Override
	public void previousQuestion() {
		if(current > 0)
			current--;
	}

	@Override
	public void newQuestion(String q) {
		questions.add(q);
	}

	@Override
	public void deleteQuestion(String q) {
		questions.remove(q);
	}

	@Override
	public void displayQuestion() {
		System.out.println(questions.get(current));
	}

	@Override
	public void displayAllQuestion() {
		for(String s:questions)
		{
			System.out.println(s);
		}
	}
	

}
