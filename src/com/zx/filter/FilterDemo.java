package com.zx.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FilterDemo implements Filter{

	@Override
	public void destroy() {
		System.out.println("-----destroy-----");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("------do filter-----");
		System.out.println("before filterdemo");
		chain.doFilter(request, response);
		System.out.println("------after filter------");
		
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("-----init-----");
	}
}
