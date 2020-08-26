package com.cuvic.item;

public class ItemVO {

    private int ITEM_NUMB; // 자재 번호
    private int CATE_NUMB; // 자재 카테고리 번호
    private String ITEM_MODE; // 자재 모델명
    private int ITEM_AMNT; // 자재 개수
    private String ITEM_STAT; // 자재 상태
    private String CATE_NAME; // 자재 카테고리명

    // 자재 번호
    public int getITEM_NUMB(){
        return ITEM_NUMB;
    }

    public void setITEM_NUMB(int ITEM_NUMB){
        this.ITEM_NUMB = ITEM_NUMB;
    }

    // 자재 카테고리 번호
    public int getCATE_NUMB(){
        return CATE_NUMB;
    }

    public void setCATE_NUMB(int CATE_NUMB){
        this.CATE_NUMB = CATE_NUMB;
    }

    // 자재 모델명
    public String getITEM_MODE(){
        return ITEM_MODE;
    }

    public void setITEM_MODE(String ITEM_MODE){
        this.ITEM_MODE = ITEM_MODE;
    }

    // 자재 갯수
    public int getITEM_AMNT(){
        return ITEM_AMNT;
    }

    public void setITEM_AMNT(int ITEM_AMNT){
        this.ITEM_AMNT = ITEM_AMNT;
    }

    // 자재 상태
    public String getITEM_STAT(){
        return ITEM_STAT;
    }

    public void setITEM_STAT(String ITEM_STAT){
        this.ITEM_STAT = ITEM_STAT;
    }

    // 자재 카테고리명
    public String getCATE_NAME(){
        return CATE_NAME;
    }

    public void setCATE_NAME(String CATE_NAME){
        this.CATE_NAME = CATE_NAME;
    }

}