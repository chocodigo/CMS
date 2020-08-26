package com.cuvic.item;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ItemController {

    private final ItemService itemService;

    @Autowired
    private ItemController(ItemService itemService) {this.itemService = itemService;}

    @RequestMapping("/item")
    public String item(Model model)throws Exception{
        List<ItemVO> item_list = itemService.getItemListService();
        List<ItemCategoryVO> item_category_list = itemService.getItemCategoryListService();
        model.addAttribute("item_list",item_list);
        model.addAttribute("item_category_list", item_category_list);
        return "item";
    }

    @RequestMapping("/itemInsertProc")
    public String itemInsertProc(HttpServletRequest request) throws Exception{
        ItemVO itemVO = new ItemVO();

        int CATE_NUMB = Integer.parseInt(request.getParameter("CATE_NUMB"));
        String ITEM_MODE = request.getParameter("ITEM_MODE");
        int ITEM_AMNT = Integer.parseInt(request.getParameter("ITEM_AMNT"));
        String ITEM_STAT = request.getParameter("ITEM_STAT");

        itemVO.setCATE_NUMB(CATE_NUMB);
        itemVO.setITEM_MODE(ITEM_MODE);
        itemVO.setITEM_AMNT(ITEM_AMNT);
        itemVO.setITEM_STAT(ITEM_STAT);

        itemService.insertItemListService(itemVO);

        return "redirect:/item";
    }

    @RequestMapping("/itemDeleteProc/{ITEM_NUMB}")
    public String itemDeleteProc(@PathVariable int ITEM_NUMB)throws Exception{

        itemService.deleteItemListService(ITEM_NUMB);

        return "redirect:/item";
    }

    @RequestMapping("/categoryInsertProc")
    public String categoryInsertProc(HttpServletRequest request) throws Exception{
        ItemCategoryVO categoryVO = new ItemCategoryVO();

        String CATE_NAME = request.getParameter("CATE_NAME");

        categoryVO.setCATE_NAME(CATE_NAME);

        itemService.insertCategoryListService(categoryVO);

        return "redirect:/item";
    }
}