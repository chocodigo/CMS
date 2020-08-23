package com.cuvic.user;

public class UserStatVO {
    private int stat_numb;      // 유저상태ID
                                // 0 : 자퇴
                                // 1 : 재학
                                // 2 : 휴학
                                // 3 : 졸업
    private String stat_name;      // 유저상태이름

    public int getStat_numb() {
        return stat_numb;
    }

    public void setStat_numb(int stat_numb) {
        this.stat_numb = stat_numb;
    }

    public String getStat_name() {
        return stat_name;
    }

    public void setStat_name(String stat_name) {
        this.stat_name = stat_name;
    }
}
