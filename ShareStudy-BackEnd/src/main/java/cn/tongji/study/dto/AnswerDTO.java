package cn.tongji.study.dto;

import lombok.Data;

import java.util.Date;

@Data
public class AnswerDTO {
    Long answerid;
    Long answererid;
    String answercontent;
    Long questionid;
    Boolean adopted;
    String answerername;
    String answereravatar;
    Date createtime;
    Integer likenum;
    Integer starnum;
    Boolean isStared=false;
    Integer commentnum;
    Boolean isliked=false;
    Boolean hascomment=false;
}
