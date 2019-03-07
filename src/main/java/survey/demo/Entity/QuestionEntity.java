package survey.demo.Entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "question")
public class QuestionEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "survey_id")
    private Integer surveyId;

    @Column(name = "content")
    private String content;

    @Column(name = "type")
    private String type;

    @Column(name = "rating")
    private Integer rating;

    @OneToMany(mappedBy = "questionId")
    List<MCAnswerEntity> answerEntityList;

    @OneToMany(mappedBy = "questionId")
    List<OEAnswerEntity> oeAnswerEntityList;

    public QuestionEntity() {
    }

    public QuestionEntity(Integer surveyId, String content) {
        this.surveyId = surveyId;
        this.content = content;
        this.rating = 0;
    }

    public Integer getId() {
        return id;
    }

    public Integer getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(Integer surveyId) {
        this.surveyId = surveyId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public List<MCAnswerEntity> getAnswerEntityList() {
        return answerEntityList;
    }

    public void setAnswerEntityList(List<MCAnswerEntity> answerEntityList) {
        this.answerEntityList = answerEntityList;
    }

    public List<OEAnswerEntity> getOeAnswerEntityList() {
        return oeAnswerEntityList;
    }

    public void setOeAnswerEntityList(List<OEAnswerEntity> oeAnswerEntityList) {
        this.oeAnswerEntityList = oeAnswerEntityList;
    }
}
