package com.example.newsaggregator.repositories;

import com.example.newsaggregator.models.NewsArticle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsArticleRepository extends JpaRepository<NewsArticle, Long> {
    // Custom queries can be added here if needed
}
