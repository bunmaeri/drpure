<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <%@ include file="/WEB-INF/include/header.jspf" %>
        <div class="banner banner__category">
            <div class="container-fluid">
                <div class="vertical-align">
                    <header class="page-title">
                        <h1><img src="/image/${map.image}" alt="${map.title}" title="${map.title}" style="vertical-align: middle;">
                        ${map.title}</h1>
                    </header>
                </div>
            </div>
        </div>
        <div id="global-messages" class="container-fluid"></div>

        <div class="main" role="main">
            <div class="std">
                <div class="container-fluid">
                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-md-7">
                                <div class="gor-accordion">
                                <c:forEach items="${list}" var="item">
                                    <div class="accordion-item">
                                        <div class="accordion-header" onclick="goContents('${item.contents_id}')">
                                             <i class="fa fa-circle"></i> <a href='/information/disease/medicine/${item.contents_id}.dr'>${item.title}</a>
                                        </div>
                                    </div>
                                </c:forEach>
                                </div>
                            </div>
                            <div class="col-md-4 col-md-push-1 padding-top30">
                                <div class="product-sidebar">
                                    <div class="block block-list block-viewed">
                                        <div class="block-title text-align-left padding-left20">
                                            <strong><span>최근 본 질병과 추천생약제</span></strong>
                                        </div>
                                        <ul class="product-list-subset">
                                            <c:forEach items="${recentViewedList}" var="item">
                                                <li>
                                                    <h5 style="font-size: 16px;">
                                                        <a href='/information/${item.code}/medicine/${item.contents_id}.dr'>${item.title}</a>
                                                    </h5>
                                                </li>
                                            </c:forEach>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script type="text/javascript">
            function goContents(contents_id) {
                var comSubmit = new ComSubmit();
                comSubmit.setUrl("<c:url value='/information/disease/medicine/"+contents_id+".dr' />");
                comSubmit.submit();
            }
        </script>
<%@ include file="/WEB-INF/include/footer.jspf" %>
<%@ include file="/WEB-INF/include/end.jspf" %>