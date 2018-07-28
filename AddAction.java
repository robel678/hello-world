package com.cbc.web.emp;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public final class AddAction extends Action {
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		Employee emp = new Employee();
		AddForm addForm = (AddForm) form;
this is added again
		// Perform employee search based on what criteria was entered.
		emp.setFirstName(addForm.getFirstName());
		emp.setLastName(addForm.getLastName());
		emp.setEmail(addForm.getEmail());
		emp.setPhoneNumber(addForm.getPhoneNumber());
		
		// Forward control to this Action's input page.
		return mapping.getInputForward();
	}
}
