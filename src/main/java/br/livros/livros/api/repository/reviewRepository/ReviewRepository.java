package br.livros.livros.api.repository.reviewRepository;

import br.livros.livros.api.entity.review.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
