package com.cuvic.item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    private final ItemMapper itemMapper;

    @Autowired
    public ItemService(ItemMapper itemMapper){this.itemMapper = itemMapper;}

    //자재 리스트 받아오는 서비스
    public List<ItemVO> getItemListService() throws Exception{
        return itemMapper.getItemList();
    }

    //자재 카테고리 리스트 받아오는 서비스
    public List<ItemCategoryVO> getItemCategoryListService() throws Exception{
        return itemMapper.getItemCategoryList();
    }

    //자재 리스트 추가하는 서비스
    public int insertItemListService(ItemVO itemVO)throws Exception{
        return itemMapper.insertItemList(itemVO);
    }
}
