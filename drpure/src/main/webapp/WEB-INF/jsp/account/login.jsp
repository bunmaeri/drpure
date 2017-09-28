<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/include/header.jspf" %>
<div class="main" role="main">
    <section class="atr-registration atr-login">
        <div class="banner banner__category">
            <div class="container-fluid">
                <div class="vertical-align">
                    <header class="page-title">
                        <h1>로그인</h1>
                    </header>
                </div>
            </div>
        </div>
    
        <div class="container-fluid padding-left40">
	        <div class="row">
	            <div class="col-md-5 atr_form">
	                ${ctag:getErrorString(errorMsg)}
	                ${ctag:getSuccess(successMsg)}
	                <form action="/login/action.dr" method="post" id="login-form">
	                    <div class="progress-form">
	                        <div class="progress-form__section">
	                            <h3>회원가입하신 고객</h3>
	                            <ul class="form-list">
	                                <li>
	                                    <label for="email" class="sr-only">이메일</label>
	                                    <div class="input-box validation-passed">
	                                        <input type="text"  name="email" value="${email}" id="email"class="input-text required-entry validate-email validation-passed" placeholder="이메일">
	                                    </div>
	                                </li>
	                                <li>
	                                    <label for="pass" class="sr-only">Password</label>
	                                    <div class="input-box validation-passed">
	                                        <input type="password" name="password" id="pass" class="input-text required-entry validate-password validation-passed" placeholder="비밀번호">
	                                    </div>
	                                </li>
	                                <li class="buttons-set">
	                                    <button type="submit" class="button button-default" name="send" id="send2">로그인 <i class="fa fa-arrow-right" style="position: absolute;top: 50%;right: 36px;margin-top: -9px;font-size: 18px;"></i></button>
	                                    <a class="link" href="/forgotpassword.dr">비밀번호 찾기</a>
	                                </li>
	                            </ul>
	                            <script type="text/javascript">
	                                //<![CDATA[
	                                var dataForm = new VarienForm('login-form', true);
	                                //]]>
	                            </script>
	                        </div>
	                    </div>
	                </form>
	            </div>
	            <div class="col-md-6 col-md-push-1 atr_spiffs padding-top50">
	                <article class="banner banner__stacked" style="color:#000;font-size:15px;">
	                    ${notice.description}
	                </article>
	             </div>
	        </div>
	    </div>
	</section>
</div>

<%@ include file="/WEB-INF/include/footer.jspf" %>
<%@ include file="/WEB-INF/include/end.jspf" %>