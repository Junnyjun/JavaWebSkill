
#  Ex5-3 라이브러리 태그
**Core**
*자바의 import문 처럼 코어 태그 라이브러리를 사용하려면 반드시 jsp 페이지 상단에 taglib 디렉티브 태그를 추가해야한다*
- 변수 지원
	- <c:set> : JSP 페이지에서 변수를 지정
	- <c:remove> : 지정된 변수를 제거
- 흐름 제어
	- <c:if> : 조건문을 사용합니다
	- <c:choose> : switch문을 사용합니다
	- <c:forEach> : 반복문을 사용
	- <c:forTokens> :  구분자로 분리된 각각의 토큰을 처리할 때 사용
-  URL 처리
	- <c:import> : URL을 이용해 다른 자원을 JSP 페이지에 추가
	- <c:redirect>  response.sendRedirect의 기능을 수행
	- <c:url> : 요청 매개변수로부터 URL을 생성
- 기타 태그
	- <c:catch> : 예외처리


|
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
[Ex 6-1 File 업로드](../../sec06/ex01)