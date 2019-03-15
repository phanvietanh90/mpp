package demo.mpp.Entity.social;

import demo.mpp.Entity.social.CommentEntity;
import demo.mpp.Entity.social.LikeEntity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "post")
public class PostEntity {
    @Id
    @Column(name = "post_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer postId;

    @Column(name = "content")
    private String content;

    @Column(name = "created_date")
    private Date createdDate;

    @Column(name = "user_id")
    private Integer userId;

    @OneToMany(mappedBy = "postId")
    private List<CommentEntity> commentEntityList;

    @OneToMany(mappedBy = "postId")
    private Set<LikeEntity> likeEntityList;

    public PostEntity() {
    }

    public PostEntity(String content, Date createdDate, Integer userId) {
        this.content = content;
        this.createdDate = createdDate;
        this.userId = userId;
    }

    public PostEntity(String content, Date createdDate, Integer userId, List<CommentEntity> commentEntityList, Set<LikeEntity> likeEntityList) {
        this.content = content;
        this.createdDate = createdDate;
        this.userId = userId;
        this.commentEntityList = commentEntityList;
        this.likeEntityList = likeEntityList;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public List<CommentEntity> getCommentEntityList() {
        return commentEntityList;
    }

    public void setCommentEntityList(List<CommentEntity> commentEntityList) {
        this.commentEntityList = commentEntityList;
    }

    public Set<LikeEntity> getLikeEntityList() {
        return likeEntityList;
    }

    public void setLikeEntityList(Set<LikeEntity> likeEntityList) {
        this.likeEntityList = likeEntityList;
    }
}
