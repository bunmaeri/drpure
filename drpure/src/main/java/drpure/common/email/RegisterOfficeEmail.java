package drpure.common.email;

import java.util.Map;

import drpure.common.controller.CodeController;
import drpure.common.util.StoreUtil;

/**
 * 회원가입 이메일
 * @author jo
 *
 */
public class RegisterOfficeEmail {

	public static String getHtml(Map<String,Object> map) throws Exception {
		// 공통코드
		CodeController code = new CodeController();
		
		StringBuffer sb = new StringBuffer();
		sb.append("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01//EN\" \"http://www.w3.org/TR/1999/REC-html401-19991224/strict.dtd\">");
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />");
		sb.append("<title>회원가입 완료 이메일</title>");
		sb.append("</head>");
		sb.append("<body style=\"font-family: Verdana, Helvetica, sans-serif; font-size: 14px; color: #000000;\">");
		sb.append("<div style=\"width: 720px;\">");
		sb.append("<div style=\"border: 1px solid #bbb;padding:25px;\">");
		sb.append("    <p style=\"margin-top: 0px; margin-bottom: 20px;\"><h3>웹사이트: ").append(code.getValue("config_comapny_name")).append("</h3></p>");
		sb.append("    <p style=\"margin-top: 0px; margin-bottom: 20px;\"><h3>고객이름: ").append(map.get("customer_name")).append("</h3></p>");
		sb.append("    <p style=\"margin-top: 0px; margin-bottom: 20px;\"><h3>고객그룹: ").append(map.get("customer_group")).append("</h3></p>");
		sb.append("    <p style=\"margin-top: 0px; margin-bottom: 20px;\"><h3> 이메일: ").append(map.get("email")).append("</h3></p>");
		sb.append("    <p style=\"margin-top: 0px; margin-bottom: 20px;\"><h3>전화번호: ").append(map.get("telephone")).append("</h3></p>");
		sb.append("    <p style=\"margin-top: 0px; margin-bottom: 20px;\"><h3>가입경로: ").append(map.get("join_path")).append("</h3></p>");
		
		sb.append("</div>");
		sb.append("</div>");
		sb.append("</body>");
		sb.append("</html>");
		
		return sb.toString();
	}
}
