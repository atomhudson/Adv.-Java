package com.incapp;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class IncappTag extends TagSupport {

	@Override
	public int doStartTag() throws JspException {
		
		JspWriter out=pageContext.getOut();
		try {
			out.print("<p>Hello INCAPP Custom Tag</p>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return SKIP_BODY;
	}

	@Override
	public int doEndTag() throws JspException {
		JspWriter out=pageContext.getOut();
		try {
			out.print("<p>Bye INCAPP Custom Tag</p>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		return EVAL_PAGE;
		return SKIP_PAGE;
	}
	
	
	
}
