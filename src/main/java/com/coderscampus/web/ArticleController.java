package com.coderscampus.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.coderscampus.domain.Article;
import com.coderscampus.service.ArticleService;

@Controller
public class ArticleController {
	@Autowired
	ArticleService articleService;
	
	@GetMapping("/create-article")
	public String createArticle(Article article) {
		return "create-article";
		
	}
	@PostMapping("/create-article")
	public String updateArticle(Article article) {
		articleService.save(article);
		return "redirect:/articles";
		
	}
	@GetMapping("/articles")
	public String fetchBlog(ModelMap model) {
		List<Article> articles = articleService.findAll();
		model.put("articles", articles);
		return "articles";
	}

}
