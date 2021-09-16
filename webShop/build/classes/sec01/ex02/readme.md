
#  Ex1-2 서블릿 기초 

요청과 관련된 API : javax.servlet.http.HttpServletRequest
응답과 관련된 API : javax.servlet.http.HttpServletResponse

1. 응답 & 요청 

**ServletRequest의 여러가지 메서드** 
|메서드명|기능  |
|--|--|
|authenticate|ServletContext 객체에 대한 인증을 위한 컨테이너 로그인 메커니즘 사용  |
|changSessionId|현재 요청의 세션 id를 변경하여 새 세션 id를 반환  |
|getContextPath|요청한 컨텍스트의 URI를 반환|
|getCookies|클라이언트가 보낸 쿠키객체들을 배열로 반환|
|getHeaderName|요청에 포함된 헤더의 name속성을 enumeration으로 반환|
|getMethod|get, Post, put의 HTTP요청 방식을 반환|
|getRequestURI|URL의 컨텍스트 이름과 파일 경로까지 반환|
|getSession|현재의 요청과 연관된 세션을 반환합니다. 없을땐 새로 만들어서 반환|


**ServletResponse의 여러가지 메서드** 
|메서드명|기능  |
|--|--|
|addCookie|응답에 쿠키를 추가|
|addHeader|name & value를 헤더에 추가|
|encodeURL|클라이언트가 쿠키를 지원하지 않을때 세션 id을 포합한 특정 URL을 인코딩 한다.|
|getHeaderNames|현재 응답의 헤더에 포함된 naem을 얻어옵니다|
|sendRedirect|클라이언트에게 리다이렉트 읍답을 보낸 후 특정 URL로 재요청|
|getPathInfo|요청시 보낸 URL과 추가 경로정보를 반환|

  2. form
 - [ ] name :  form 이름 지정 
 - [ ] method : 전송 방법 지정
 - [ ] action : 전송할 경로 지정
 - [ ] encType :  encoding 타입 지정

	2.1 응답 받기

|메서드명|기능  |
|--|--|
|getParameter|name 값을 알고 있을때, name에 값을 받아온다|
|getParameterValues|같은 name에 대해 여러개의 값을 얻을때 사용|
|getParameterNames||name값을 모를 때 사용 합니다.|


다음장 ..!
[Ex 1-2 서블릿 기초](../ex03) 