package com.cuvic.item;

import java.util.List;

public interface ItemMapper {

    //자재 목록 받아오기
    public List<ItemVO> getItemList()throws Exception;

    //자재 카테고리 받아오기
    public List<ItemCategoryVO> getItemCategoryList()throws Exception;

    //자재 추가
    public int insertItemList(ItemVO itemVO)throws Exception;
}
