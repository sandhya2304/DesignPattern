package factory;

public class PlanFactory
{

	public Plan getPlanFactory(String planType)
	{
		if(planType == null)
		{
			return null;
		}else if(planType.equalsIgnoreCase("domestic"))
		{
			return new DomesticPlan();
		}
		else if(planType.equalsIgnoreCase("commecrce"))
		{
			return new CommercialPlan();
		}
		else if(planType.equalsIgnoreCase("institute"))
		{
			return new InstitutionalPlan();
		}
		return null;
		
		
		
	}
	
}
