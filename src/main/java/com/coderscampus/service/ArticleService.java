package com.coderscampus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderscampus.domain.Article;
import com.coderscampus.repository.ArticleRepository;

@Service
public class ArticleService {
	@Autowired
	ArticleRepository articleRepo;

	public Article save(Article article) {
		return articleRepo.save(article);
	}

	public List<Article> findAll() {
		return articleRepo.findAll();
	}

}
