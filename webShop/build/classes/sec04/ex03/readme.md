
#  Ex4-3  필터 API

*브라우저에서 서블릿에 요청하거나 응답할 때 미리 요청이나 응답과 관련해 여러가지 작업을 처리하는 기능*

**요청 필터**
- 사용자 인증 및 권한 검사
- 요청 시 요청 관련 로그 작업
- 인코딩

**응답 필터**
- 응답 결과에 대한 암호과 작업
- 서비스 시간 측정

|메서드|기능|
|--|--|--|
|destroy|필터 소명 시 컨테이너에 의해 호출되어 종료 작업을 수행|
|doFilter|요청/응답 시 컨테이너에 의해 호출되어 기능을 수행|
|init|필터 생성 시 컨테이너에 의해 호출되어 초기화 수행|
- getFilterName : 필터이름 반환
- getInitParameter : 매개변수 name에 대한 값 반환
- getServletContext : 서블릿 콘텍스트 객체를 반환

**Servlet Listener API**
|Listener||
|--|--|
|ServletContextAttributeListener|context 객체의 속성 추가/제거/수정 이벤트 발생시 처리|
- attributeAdd() : 
- attributeRemoved()
- attributeReplaced

|||
|--|--|
|HttpSessionListener|세션 객체의 생성/소멸 이벤트 발생 시 처리|
- sessionCreated()
- sessionDestroyed()

|||
|--|--|
|ServletRequestListener|클라이언트의 요청 이벤트 발생시 처리|
- requestInitialized
- requestDestroyed

|||
|--|--|
|ServletRequestAttributeListener|요청객체에 속성 추가/제거/수정 이벤트 발생시 처리|
- attributesAdded()
- attributesRemoved()
- attributesReplaced()

|||
|--|--|
|HttpSessionBindingListener|세션에 바인딩/언바인딩 된 객체를 알려주는 이벤트 발생 시 처리|
- valueBound()
- valueUnbound()

|||
|--|--|
|ServletContextListener|컨텍스트 객체의 생성/소멸 이벤트 발생 시 처리|
- contextInitialized()
- contextDestroyed()

|||
|--|--|
|HttpSerssionActivationListener|세션 활성화/비활성화 비엔트 발생시 처리|
- sessionDidActivated()
- sessionWillPassivated()


다음장 ..!  
[Ex 5-1 JSP](../../sec05/ex01)