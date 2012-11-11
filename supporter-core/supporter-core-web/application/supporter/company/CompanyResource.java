package supporter.company;

import org.layr.jee.routing.business.Route;
import org.layr.jee.routing.business.WebResource;


@WebResource("/company/")
public class CompanyResource {

	
	@Route(
			pattern="/",
			template="new.xhtml")
	public void newCompany(){
		System.out.println("aaaaaaaaaaaaaaaaaaaa");
	}
}
