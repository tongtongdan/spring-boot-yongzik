package likelion14th.blog.repository;

import likelion14th.blog.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface ArticleRepository extends JpaRepository<Article,Long> {
    Optional<Article> findByTitle(String title);
    Optional<Article> findByContent(String content);
    Optional<Article> findByAuthor(String author);
}