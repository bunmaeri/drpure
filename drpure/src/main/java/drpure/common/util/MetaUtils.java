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
		mv.addObject("META_title", map.get(name));
	}
	
	public static void setMetaDescription(ModelAndView mv, Map<String,Object> map, String name) {
		mv.addObject("META_description", map.get(name));
	}
	
	public static void setMetaKeyword(ModelAndView mv, Map<String,Object> map, String name) {
		mv.addObject("META_keyword", map.get(name));
	}
	
	@SuppressWarnings("unchecked")
	public static void setMetaTitle(ModelAndView mv, Object obj, String name) {
		Map<String,Object> map = (Map<String,Object>) obj;
		mv.addObject("META_title", map.get(name));
	}
	
	@SuppressWarnings("unchecked")
	public static void setMetaDescription(ModelAndView mv, Object obj, String name) {
		Map<String,Object> map = (Map<String,Object>) obj;
		mv.addObject("META_description", map.get(name));
	}
	
	@SuppressWarnings("unchecked")
	public static void setMetaKeyword(ModelAndView mv, Object obj, String name) {
		Map<String,Object> map = (Map<String,Object>) obj;
		mv.addObject("META_keyword", map.get(name));
	}
	
	
	@SuppressWarnings("unchecked")
	public static void setMetaTitle(ModelAndView mv, Object obj, String name, String name1) {
		Map<String,Object> map = (Map<String,Object>) obj;
		mv.addObject("META_title", ObjectUtils.null2Value(ObjectUtils.null2void(map.get(name)), ObjectUtils.null2void(map.get(name1))));
	}
	
	@SuppressWarnings("unchecked")
	public static void setMetaDescription(ModelAndView mv, Object obj, String name, String name1) {
		Map<String,Object> map = (Map<String,Object>) obj;
		mv.addObject("META_description", ObjectUtils.null2Value(ObjectUtils.null2void(map.get(name)), ObjectUtils.null2void(map.get(name1))));
	}
	
	@SuppressWarnings("unchecked")
	public static void setMetaKeyword(ModelAndView mv, Object obj, String name, String name1) {
		Map<String,Object> map = (Map<String,Object>) obj;
		mv.addObject("META_keyword", ObjectUtils.null2Value(ObjectUtils.null2void(map.get(name)), ObjectUtils.null2void(map.get(name1))));
	}
}
