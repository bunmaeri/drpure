package drpure.common.util;

import java.util.Map;

import org.springframework.web.servlet.ModelAndView;

public class MetaUtils {
	public static void setMetaTitle(ModelAndView mv, String META_title) {
		mv.addObject("META_title", META_title);
	}
	
	public static void setMetaDescription(ModelAndView mv, String META_description) {
		mv.addObject("META_description", META_description);
	}
	
	public static void setMetaKeyword(ModelAndView mv, String META_keyword) {
		mv.addObject("META_keyword", META_keyword);
	}
	
	public static void setMetaTitle(ModelAndView mv, Map<String,Object> map, String name) {
		mv.addObject("META_title", ObjectUtils.null2void(map.get(name)));
	}
	
	public static void setMetaDescription(ModelAndView mv, Map<String,Object> map, String name) {
		mv.addObject("META_description", ObjectUtils.null2void(map.get(name)));
	}
	
	public static void setMetaKeyword(ModelAndView mv, Map<String,Object> map, String name) {
		mv.addObject("META_keyword", ObjectUtils.null2void(map.get(name)));
	}
	
	@SuppressWarnings("unchecked")
	public static void setMetaTitle(ModelAndView mv, Object obj, String name) {
		if(null!=obj) {
			Map<String,Object> map = (Map<String,Object>) obj;
			mv.addObject("META_title", ObjectUtils.null2void(map.get(name)));
		} else {
			mv.addObject("META_title", "");
		}
	}
	
	@SuppressWarnings("unchecked")
	public static void setMetaDescription(ModelAndView mv, Object obj, String name) {
		if(null!=obj) {
			Map<String,Object> map = (Map<String,Object>) obj;
			mv.addObject("META_description", ObjectUtils.null2void(map.get(name)));
		} else {
			mv.addObject("META_description", "");
		}
	}
	
	@SuppressWarnings("unchecked")
	public static void setMetaKeyword(ModelAndView mv, Object obj, String name) {
		if(null!=obj) {
			Map<String,Object> map = (Map<String,Object>) obj;
			mv.addObject("META_keyword", ObjectUtils.null2void(map.get(name)));
		} else {
			mv.addObject("META_keyword", "");
		}
	}
	
	
	@SuppressWarnings("unchecked")
	public static void setMetaTitle(ModelAndView mv, Object obj, String name, String name1) {
		if(null!=obj) {
			Map<String,Object> map = (Map<String,Object>) obj;
			mv.addObject("META_title", ObjectUtils.null2Value(ObjectUtils.null2void(map.get(name)), ObjectUtils.null2void(map.get(name1))));
		} else {
			mv.addObject("META_title", "");
		}
	}
	
	@SuppressWarnings("unchecked")
	public static void setMetaDescription(ModelAndView mv, Object obj, String name, String name1) {
		if(null!=obj) {
			Map<String,Object> map = (Map<String,Object>) obj;
			mv.addObject("META_description", ObjectUtils.null2Value(ObjectUtils.null2void(map.get(name)), ObjectUtils.null2void(map.get(name1))));
		} else {
			mv.addObject("META_description", "");
		}
	}
	
	@SuppressWarnings("unchecked")
	public static void setMetaKeyword(ModelAndView mv, Object obj, String name, String name1) {
		if(null!=obj) {
			Map<String,Object> map = (Map<String,Object>) obj;
			mv.addObject("META_keyword", ObjectUtils.null2Value(ObjectUtils.null2void(map.get(name)), ObjectUtils.null2void(map.get(name1))));
		} else {
			mv.addObject("META_keyword", "");
		}
	}
}
