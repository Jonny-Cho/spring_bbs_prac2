package com.bbs.ex.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bbs.ex.dao.IDao;

@Controller
public class BController {
	
	private static final Logger logger = LoggerFactory.getLogger(BController.class);
	
	@Autowired
	private SqlSession sqlSession;
	
	@RequestMapping("/list")
	public String list(Model model) {
		logger.info("list()");
		
		IDao dao = sqlSession.getMapper(IDao.class);
		model.addAttribute("list", dao.list());
		
		return "list";
	}
	
	@RequestMapping("/write_view")
	public String write_view(Model model) {
		logger.info("write_view()====");
		return "write_view";
	}
	
	@RequestMapping("/write")
	public String write(HttpServletRequest request) {
		logger.info("write()====");
		
		IDao dao = sqlSession.getMapper(IDao.class);		
		dao.write(request.getParameter("bTitle"), request.getParameter("bContent"));
		return "redirect:list";
	}
	
	@RequestMapping("/content_view")
	public String content_view(HttpServletRequest request, Model model) {
		logger.info("content_view()====");
		
		IDao dao = sqlSession.getMapper(IDao.class);
		dao.upHit(request.getParameter("bId"));
		model.addAttribute("list", dao.content_view(request.getParameter("bId")));
		
		return "content_view";
	}
	
	@RequestMapping("/update_view")
	public String update_view(HttpServletRequest request, Model model) {
		logger.info("update_view()====");
		
		IDao dao = sqlSession.getMapper(IDao.class);
		model.addAttribute("list", dao.update_view(request.getParameter("bId")));
		
		return "update_view";
	}
	
	@RequestMapping("/update")
	public String update(HttpServletRequest request) {
		logger.info("update()====");
		
		IDao dao = sqlSession.getMapper(IDao.class);		
		dao.update(request.getParameter("bTitle"), request.getParameter("bContent"), request.getParameter("bId"));
		
		return "redirect:list";
	}
	
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request) {
		logger.info("delete()====");
		
		IDao dao = sqlSession.getMapper(IDao.class);
		dao.delete(request.getParameter("bId"));
		
		return "redirect:list";
	}
	
	@RequestMapping("/search")
	public String search(HttpServletRequest request, Model model) {
		logger.info("search()====");
		
		IDao dao = sqlSession.getMapper(IDao.class);
		model.addAttribute("s", dao.search(request.getParameter("sname")));
		System.out.println(model);
		
		return "redirect:list";
	}
	
}
