package com.cuvic.user;

/*
    User VO (회원관리 VO)
 */


import java.util.Date;

public class UserVO {

    private String user_numb;   // 유저ID
    private String user_name;   // 유저이름
    private int user_grad;      // 유저학년
    private Date user_birt;     // U유저생일
    private String user_stat;      // 유저상태
                                // 0 : 자퇴
                                // 1 : 재학
                                // 2 : 휴학
                                // 3 : 졸업
    private int user_mone;      // 회비 냈는지 안냈는지 여부
                                // 0 : 안냄
                                // 1 : 냄
    private String user_phon;   // 핸드폰 번호
    private String user_flag;      // 기수
    private String pass_word;   // 관리자만 설정

    public String getUser_numb() {
        return user_numb;
    }

    public void setUser_numb(String user_numb) {
        this.user_numb = user_numb;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public int getUser_grad() {
        return user_grad;
    }

    public void setUser_grad(int user_grad) {
        this.user_grad = user_grad;
    }

    public Date getUser_birt() {
        return user_birt;
    }

    public void setUser_birt(Date user_birt) {
        this.user_birt = user_birt;
    }

    public String getUser_stat() {
        return user_stat;
    }

    public void setUser_stat(String user_stat) {
        this.user_stat = user_stat;
    }

    public int getUser_mone() {
        return user_mone;
    }

    public void setUser_mone(int user_mone) {
        this.user_mone = user_mone;
    }

    public String getUser_phon() {
        return user_phon;
    }

    public void setUser_phon(String user_phon) {
        this.user_phon = user_phon;
    }

    public String getUser_flag() {
        return user_flag;
    }

    public void setUser_flag(String user_flag) {
        this.user_flag = user_flag;
    }

    public String getPass_word() {
        return pass_word;
    }

    public void setPass_word(String pass_word) {
        this.pass_word = pass_word;
    }
}
