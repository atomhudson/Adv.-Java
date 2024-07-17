package com.incapp;


import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class MyTag2 extends TagSupport {

	@Override
	public int doStartTag() throws JspException {
		try {
			JspWriter out=pageContext.getOut();
			out.print("<h3>Hi rahul, My Custom tag</h3>");
		}catch (Exception e) {
			e.printStackTrace();
		}
		return SKIP_BODY;
	}
	
}
