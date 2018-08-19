package demo;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.*;
import org.apache.struts.action.ActionForward;

public class RegisterAction extends Action {
	
	public ActionForward execute(ActionMapping mapping,ActionForm form,
			     HttpServletRequest request,HttpServletResponse response){
		System.out.println("1st struts application:execute(----)");
		RegisterForm fr=(RegisterForm)form;
		String uname=fr.getUsername();
		String password=fr.getPassword();
		if(uname.equals("Amrita")){
			return mapping.findForward("success");
		}
		else
			return mapping.findForward("failure");
		
		
	}//execute(-,-,-,-)
}
