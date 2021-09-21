
#  Ex5-2 표현언어
*복잡한 자바코드가 있는것보다 EL & JSTL을 사용해서 구현하는게 화면작업하는데 용이하기 때문*
- 기존 표현식보다 편리하게 값을 출력
- 변수와 여러가지 연산자를 포함할 수 있다
- JSP의 내장객체에 저장된 속성 및 자바 빈 속성도 표현언어 에서 출력할 수 있다
- 표현언어 자체 내장 객체도 제공
- JSP페이지 생성 시 기본설정은 표현언어를 사용할 수 없다
- 페이지 디렉티브 태그에서는 반드시 isElIgnored=false로 설정해야 한다

*${표현식 & 값}*
***
**표현 언어 내장 객체**
**내장 객체 기능**

|내장객체|타입|설명|
|--|--|--|
|request|javax.servlet.http.HttpServletRequest|클라이언트의 요청정보 저장|
|response|javax.servlet.http.HttpServletResponse|응답 정보를 저장|
|out|javax.servlet.jsp.jspWriter|JSP 페이지에서 결과를 출력|
|session|javax.servlet.http.HttpSession|세션 정보를 저장|
|application|ServletContext|컨텍스트 정보를 저장|
|pageContext|PageContext|JSP 페이지 정보를 저장|
|page|java.lang.Object|JSP 페이지 서블릿 인스턴스를 저장|
|config|javax.servlet.ServletConfig|JSP 페이지 설정정보 저장|
|exception|java.lang.Exception|예외발생시 예외를 처리|

***
**JSP 예외 처리**
*예외처리 담당 JSP를 만들어 예외발생시 예외처리담당 JSP파일을 지정한다*

**내장객체 종류와 기능**
|구분|
|--|
|스코프||
- PageScope : page와 같은 기능을 하고 page영역에 바인딩된 객체를 참조
- requestScope : request와 같은 기능을 하고 request에 바인딩된 객체를 참조
- sessionScopre : session와 같은 기능을 하고 session에 바인딩된 객체를 참조
- applicationScopre : application와 같은 기능을 하고 application에 바인딩된 객체를 참조

||
|--|
|요청 매개 변수|
- param : request.getParameter를 호출한것과 같이 한개의 값을 전달하는 요청 매개변수
- paramValue : request.getParameterValues 를 호출한 것과 같이 여러개의 값을 전달하는 요청 매개변수

||
|--|
|헤더값|
- header : request.getHeader 와 같이 요청 헤더이름의 정보를 단일값으로 반환
- headerValues : request.getHeader 와 같이 요청 헤더이름의 정보를 배열로 반환


||
|--|
|쿠키 값|
- cookie : 쿠키이름의 값을 반환

||
|--|--|
|JSP 내용|
- pageContext : pageContext객체를 참조할 때 사용


**커스텀 태그**
*JSTL : JSP 페이지에서 가장 많이 사용하는 기능을 태그로 제공하며 JSTL 라이브러리를 따로 설치해서 사용*
- 코어
	- 변수 지원 반복문 처리 URL 처리
	- C
	- JSTL/core
- 국제화
	- 지역, 메세지 형식, 숫자 및 날짜형식
	-  fmt
	- jstl/fmt
- XML
	- XML 코어 ,  흐름 제어 ,  XML변환
	- x
	- jstl/xml
- 데이터 베이스
	- SQL
	- sql
	- jstl/sql
- 함수
	- 컬렉션 처리, 문자열 처리
	- fn
	- jstl/function


다음장 ..!  
[Ex 5-3 태그 라이브러리](../ex03)