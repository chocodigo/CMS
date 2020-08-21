package com.cuvic.item.mapper;

import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.cuvic.item.domain.ItemVO;

public interface ItemMapper {

    //자재 입력
    public void itemInsert(ItemVO item)throws Exception;

    //자재 목록
    public List<ItemVO>itemList()throws Exception;

}
