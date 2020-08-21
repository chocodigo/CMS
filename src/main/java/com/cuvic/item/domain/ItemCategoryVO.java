package com.cuvic.item.domain;

public class ItemCategoryVO {

    private int CATE_NUMB; // 자재 카테고리 번호
    private String CATE_NAME; // 자재 카테고리명

    // 자재 카테고리 번호
    public int getCATE_NUMB(){
        return CATE_NUMB;
    }

    public void setCATE_NUMB(int ITEM_NUMB){
        this.CATE_NUMB = CATE_NUMB;
    }

    // 자재 카테고리명
    public String getCATE_NAME(){
        return CATE_NAME;
    }

    public void setCATE_NAME(String CATE_NAME){
        this.CATE_NAME = CATE_NAME;
    }

}
