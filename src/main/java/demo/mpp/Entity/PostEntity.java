package demo.mpp.Entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

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

    @Column(name = "user_name")
    private String userName;

    @OneToMany(mappedBy = "postId")
    private List<CommentEntity> commentEntityList;

    @OneToMany(mappedBy = "postId")
    private List<EmotionEntity> emotionEntityList;

    @PrePersist
    public void preInsert() {
        this.createdDate = new Date();
    }

    public PostEntity() {
    }

    public PostEntity(String content, Date createdDate, String userName) {
        this.content = content;
        this.createdDate = createdDate;
        this.userName = userName;
    }

    public PostEntity(String content, Date createdDate, String userName, List<CommentEntity> commentEntityList, List<EmotionEntity> emotionEntityList) {
        this.content = content;
        this.createdDate = createdDate;
        this.userName = userName;
        this.commentEntityList = commentEntityList;
        this.emotionEntityList = emotionEntityList;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<CommentEntity> getCommentEntityList() {
        return commentEntityList;
    }

    public void setCommentEntityList(List<CommentEntity> commentEntityList) {
        this.commentEntityList = commentEntityList;
    }

    public List<EmotionEntity> getEmotionEntityList() {
        return emotionEntityList;
    }

    public void setEmotionEntityList(List<EmotionEntity> emotionEntityList) {
        this.emotionEntityList = emotionEntityList;
    }
}
