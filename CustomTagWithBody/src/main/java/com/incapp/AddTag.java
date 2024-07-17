package com.incapp;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class AddTag extends TagSupport {

	private int num1,num2;
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}


	@Override
	public int doStartTag() throws JspException {
		JspWriter out=pageContext.getOut();
		try {
			int s=num1+num2;
			out.print("<p>Sum: "+s+" </p>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return EVAL_BODY_INCLUDE;
//		return SKIP_BODY;
	}
	@Override
	public int doEndTag() throws JspException {
		JspWriter out=pageContext.getOut();
		try {
			out.print("<p>Bye Custom Tag</p>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return EVAL_PAGE;
	}
	@Override
	public int doAfterBody() throws JspException {
		JspWriter out=pageContext.getOut();
		try {
			out.print("<p>After Body Custom Tag</p>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SKIP_BODY;
//		return EVAL_BODY_AGAIN;
	}
	
	
}
