
#  Ex4-2  서블릿 속성과 스코프

**서블릿 속성**
*세가지 서블릿 API 클래스에 저장되는 객체*
- servletContext
- HttpSession
- HttpServletRequest

**서블릿 스코프**
*서블릿 API에 바인딩된 속성에 대한 접근 범위*
- 로그인 상태 유지기능
- 장바구니 기능
- MVC에 Model&View 데이터 전달 기능

|Scope 종류|Servlet API|Attribute&Scope|
|--|--|--|
|Applicatio Scope|ServletContext|속성은 어플리케이션 전체에 접근|
|Session Scope|HttpSession|속성은 브라우저 에서만 접근|
|Request Scope|HttpSerlvetRequest|속성은 해당 요청/응답 사이클에서만 접근|

**URL 패턴**
*실제 서블릿의 매핑 이름*
*서블릿 매핑시 가상의 이름으로 클라이언트가 브라우저에서 요청할 때 사용되며 반드시 / 로 시작*



다음장 ..!  
[Ex 4-3 필터 API](../ex03)