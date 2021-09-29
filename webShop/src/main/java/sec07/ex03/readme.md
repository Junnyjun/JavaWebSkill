

  

# Ex7-3 RestAPI
*하나의 URI가 고유한 리소스를 처리하는 공통 방식*

 - [ ] @ResponseBody & @RestController
데이터처리를 지원어노테이션

 - [ ] @PathVariable
브라우저에서 요청 URL로 전달된 매개변수를 가져올 수 있다

*ResponseEntity로 HTTP 상태 코드를 설정하여 앱으로 전송*

 - 정보 응답
	 - 100 continue : 상태가 괜찮으며 클라이언트가 계속해서 요청하거나 요청이 완료된 경우에는 무시해도 된다
	 - 101 switching_protocol : 클라이언트가 보낸 upgrade 요청 헤더에 대한 응답으로 서버에서 프로토콜을 변경할 것임을 알려준다
- 성공 응답
	- 200 OK : 요청 완료
	- 201 Create : 요청 성공, 새로운 리소스가 생성
	- 202 Accepted : 요청을 수신했지만 응답할 행동이 없다.
- 리다이렉션
	- 300 Multiple_choice : 요청에 대해 하나 이상의 응답이 가능
	- 301 Moved_permanently : 요청한 리소스의 URI가 변경
	- 302 Found : 요청한 리소스의 URI가 일시적 변경
	- 303 See_other : 클라이언트가 요청한 리소르를 다린 URI에서 GET요청을 통해 얻어야 할 경우 서버가 클라이언트로 직접 보내는 응답
- 클라이언트 오류 응답
	- 400 Bad_request : 클라이언트의 문법 요청 오류
	- 401 Unauthorized : 인증되지 않음
	- 403 Forbidden : 클라이언트가 콘텐츠에 접근할 권리를 가지고 있지 않다
	- 404 Not_found : 서버 요처 받은 리소르를 찾을수 없다
- 서버 오류 응답
	- 500 Interal_server_error : 처리할 수 없는 내부 오류가 발생
	- 501 Not_implement : 요청메서드는 서버가 지원하지 않거나 처리할 수 없다
	- 503 Service_unavailable : 서버가 요청을 처리할 준비 X

  
#  인터셉터
*브라우저 요청이 있을 때 요청 메서드 호출 전 후에 개발자가 원하는 기능 수행*

|메서드 | 기능|
|--|--|
|preHandle|컨트롤러 실행전 호출|
|postHandle|컨트롤러 실행후 Servlet이 View로 보내기전 호출|
|afterCompletion|뷰까지 수행하고 나서 호출|

다음장 ..!
[Ex 7-3 Spring Rest API](../ex03)


