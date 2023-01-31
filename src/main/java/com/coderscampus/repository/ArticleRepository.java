package com.coderscampus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coderscampus.domain.Article;

public interface ArticleRepository extends JpaRepository<Article, Long>{

}
