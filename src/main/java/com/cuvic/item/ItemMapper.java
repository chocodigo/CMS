package com.cuvic.item;

import java.util.List;

public interface ItemMapper {

    //자재 입력
    public void itemInsert(ItemVO item)throws Exception;

    //자재 목록 받아오기
    public List<ItemVO> getItemList()throws Exception;

}
