package com.zx.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CharsetEncodingFilter implements Filter{

	//Set filter default encoding charset
	String charset = "UTF-8";
	
	/*
	 * init method will execute before doFilter
	 * and will initialize some parameters
	 */
	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("encoding char set is:"+charset);
		
		request.setCharacterEncoding(charset);
		response.setCharacterEncoding(charset);
		chain.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// set filter info
		String initCharset = filterConfig.getInitParameter("charset");
		if(initCharset != null && initCharset !="") {
			charset = initCharset;
		}
	}
	
}
