package com.proj.form;

import lombok.Getter;
import lombok.Setter;
import org.apache.struts.action.ActionForm;

@Getter
@Setter
public class UserForm extends ActionForm {
    private String name;
    private String email;
}
