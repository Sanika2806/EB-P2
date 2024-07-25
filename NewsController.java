package com.example.newsaggregator.controllers;

import com.example.newsaggregator.models.NewsArticle;
import com.example.newsaggregator.repositories.NewsArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/news")
public class NewsController {

    @Autowired
    private NewsArticleRepository newsArticleRepository;

    @GetMapping
    public List<NewsArticle> getAllNewsArticles() {
        return newsArticleRepository.findAll();
    }
}
