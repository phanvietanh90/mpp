package demo.mpp.Repository.social;

import demo.mpp.Entity.social.PostEntity;
import demo.mpp.Entity.survey.MCAnswerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<PostEntity, Integer> {
    PostEntity findByPostIdEquals(Integer postId);
    List<PostEntity> findAllByUserIdEquals(Integer userId);
}
