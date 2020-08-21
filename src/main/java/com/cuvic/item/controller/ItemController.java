package com.cuvic.item.controller;

import java.util.List;

import com.cuvic.item.domain.ItemVO;
import com.cuvic.item.mapper.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ItemController {

    @Autowired
    private ItemMapper itemMapper;

    @RequestMapping("/item")
    public ModelAndView item() throws Exception {
        List<ItemVO> item = itemMapper.itemList();
        return new ModelAndView("item", "list", item);
    }
}