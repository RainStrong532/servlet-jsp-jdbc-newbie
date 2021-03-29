package com.laptrinhjavaweb.controllers.web;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.laptrinhjavaweb.services.ICategoryService;
import com.laptrinhjavaweb.services.IPostService;

@WebServlet(urlPatterns = {"/home-page"})
public class HomeController extends HttpServlet{

	@Inject
	private ICategoryService categoryService;
	
	@Inject
	private IPostService postService;
//	public HomeController() {
//		categoryService = new CategoryService();
//	}
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Long code = 1L;
		req.setAttribute("posts", postService.findCategoryId(code));
		req.setAttribute("categories", categoryService.findAll());
		RequestDispatcher rd = req.getRequestDispatcher("/views/web/home.jsp");
		rd.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
}
