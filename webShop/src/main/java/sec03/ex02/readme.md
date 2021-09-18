
#  Ex3-2  포워딩 & 바인딩

*Spring 이나 struts 프레임워크에서 자주 쓰는 방법*
 
|dispatch||
|--|--|
   |웹브라우저를 거치지 않고 서버에서 포워딩이 진행|
   |클라이언트의 웹 브라우저 에서 첫 번째 서블릿에 요청|
   |첫번 째 서블릿은 RequestDispatcher를 이용해 두번 째 서블릿으로 포워드|


**바인딩**
*대량의 정보를 JSP로 전달할  때 사용*
*HttpServletRequest, HttpSersssion, ServletContext 객체에서 사용되며 저장된 자원은 서블릿이나 jsp에서 공유해서 사용*

- [ ]   setAttribute(name, obj)
자원을 각 객체에 바인딩
- [ ]  getAttribute(name)
각 객체에 바인딩된 자원을 name으로 가져온다
- [ ]  removeAttribue(name)
각 객체에 바인딩된 자원을 name으로 제거

***
**ServletContext**
*tomcat container 실행시 각 context마다 한개의 servletcontext를 생성합니다*

*특징?*
- javax.servlet.ServletContext
- 서블릿과 컨테이너 간의 연동을 위해 사용
- 컨텍스트 마다 하나의 ServletContext가 생성
- 서블릿 끼리 자원을 공유하는 데 사용
- 컨테이너 실행시 생성되고 컨테이너 종료시 소멸


*기능?*
- 서블릿에서 파일 접근
- 자원 바인딩 
- 로그 파일
- 컨텍스트에서 제공하는 설정정보 제공

|메서드|기능|
|--|--|
|getAttributes|- 주어진 name을 이용해 바인딩된 value를 가져온다|
||-name이 존재하지 않으면 null 반환|
|getAttributes|바인딩된 속성들의 name을 반환|
|getContext|지정한 uripath에 해당하는 객체를 반환|
|getIntitParameter| - name에 해당되는 매개변수의 초기화값을 반환|
||- name에 해당되는 매개변수가 존재하지 않으면 null|
|getMajorVerser|서블릿 API버전 반환|
|getRealPath|실제경로 반환|
|getResource|Resource 반환|
|setAttribute| name으로 객체를 ServletContext에 바인딩|
|setInitParameter|name으로 value를 컨텍스트 초기화 매개변수로 설정 |

**ServletConfig**
*각 ServletConfig에 생성된다*
*서블릿과 동일하게 생성되고 서블릿이 소멸되면 같이 소멸된다.*

|요소|설명|
|--|--|
|UrlPattern|웹 브라우저에서 서블릿 요청 시 사용하는 매핑 이름|
|name|서블릿 이름|
|loadOnStartup|컨테이너 실행 시 서블릿이 로드되는 순서 지정|
|initParam| @WebInitParam 을 이용해 매개변수를 추가|


**load on startup**
- 톰캣 컨테이너가 실행되면서 미리 서블릿을 실행
- 지정한 숫자가 0보다 크면 톰캣 컨테이너가 실해오디면서 서블릿이 초기화된다
- 지정한 숫자는 우선순위를 의미하며 작은 숫자부터 먼저 초기화 된다


다음장 ..!  
[Ex 4-1 웹페이지 연결 기능](../../sec04/ex01)