package com.action;

import java.util.Map;

import com.bean.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.UserService;

public class LoginOutAction extends ActionSupport {
	//���� Spring ����ע��
    protected UserService us;     

    //������
    public String execute() throws Exception {
        System.out.println("����˳�");

        //����session
        Map attibutes = ActionContext.getContext().getSession();  
        attibutes.put("user",null);
        attibutes.put("admin", null);//���ٹ���Ա��session
        return "SUCCESS";
   }
}
