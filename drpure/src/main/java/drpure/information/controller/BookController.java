package drpure.information.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import drpure.common.common.CommandMap;
import drpure.common.util.MetaUtils;
import drpure.common.util.StoreUtil;
import drpure.information.service.BookService;
import drpure.information.service.InformationService;

@Controller
public class BookController {
	Logger log = Logger.getLogger(this.getClass());
	
	@Resource(name="bookService")
	private BookService bookService;
	
	@Resource(name="informationService")
	private InformationService informationService;
	
	private int language_id = StoreUtil.getLanguageId();
	
	/**
	 * 책 목록
	 * @param commandMap
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/books.dr")
    public ModelAndView listBook(CommandMap commandMap) throws Exception{
    	ModelAndView mv = new ModelAndView("/information/books");
    	
    	commandMap.put("language_id", language_id);
    	List<Map<String,Object>> list = bookService.listBook(commandMap.getMap());
    	mv.addObject("list", list);
    	
    	commandMap.put("information_id", 21);
    	commandMap.put("language_id", language_id);
    	Map<String,Object> map = informationService.information(commandMap.getMap());
    	mv.addObject("info", map.get("map"));
    	
    	/**
    	 * META TAG
    	 */
    	MetaUtils.setMetaTitle(mv, map.get("map"), "name", "title");
    	MetaUtils.setMetaDescription(mv, map.get("map"), "meta_description", "title");
    	MetaUtils.setMetaKeyword(mv, map.get("map"), "meta_keyword");
    	
    	return mv;
    }
	
	/**
	 * 책 상세조회
	 * @param commandMap
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/books/{book_id}.dr")
    public ModelAndView book(@PathVariable String book_id, CommandMap commandMap) throws Exception{
    	ModelAndView mv = new ModelAndView("/information/book");
    	
    	commandMap.put("book_id", book_id);
    	commandMap.put("language_id", language_id);
    	Map<String,Object> book = bookService.book(commandMap.getMap());
    	mv.addObject("book", book.get("map"));
    	
    	/**
    	 * META TAG
    	 */
    	MetaUtils.setMetaTitle(mv, book.get("map"), "name", "title");
    	MetaUtils.setMetaDescription(mv, book.get("map"), "meta_description", "title");
    	MetaUtils.setMetaKeyword(mv, book.get("map"), "meta_keyword");
    	
    	commandMap.put("information_id", 21);
    	commandMap.put("language_id", language_id);
    	Map<String,Object> map = informationService.information(commandMap.getMap());
    	mv.addObject("info", map.get("map"));
    	
    	commandMap.put("language_id", language_id);
    	List<Map<String,Object>> list = bookService.listBook(commandMap.getMap());
    	mv.addObject("list", list);

    	return mv;
    }
}
