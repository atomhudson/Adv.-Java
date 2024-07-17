package com.incapp;


import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class MyTag extends TagSupport {

	@Override
	public int doStartTag() throws JspException {
		try {
			JspWriter out=pageContext.getOut();
			out.print("<h2>hello My Custom tag</h2>");
		}catch (Exception e) {
			e.printStackTrace();
		}
		return SKIP_BODY;
	}

	@Override
	public int doEndTag() throws JspException {
		try {
			JspWriter out=pageContext.getOut();
			out.print("<h2>Bye My Custom tag</h2>");
		}catch (Exception e) {
			e.printStackTrace();
		}
//		return SKIP_PAGE;
		return EVAL_PAGE;
	}
	
}
