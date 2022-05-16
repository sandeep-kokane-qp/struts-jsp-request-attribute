package com.proj.action;

import com.proj.form.UserForm;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SubmitAction extends Action {
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        UserForm userForm = (UserForm) form;

        String name = userForm.getName();
        System.out.println(name);
        String email = userForm.getEmail();
        System.out.println(email);

        request.setAttribute("name", name);
        request.setAttribute("email", email);

        return mapping.findForward("success");
    }
}
