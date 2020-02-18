package com.zx.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FilterDemo2 implements Filter{

	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("=====before filter demo2=====");
		chain.doFilter(request, response);
		System.out.println("=====after filter demo2=====");
		
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
	}
	
}
