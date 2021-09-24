

  

# Ex6-3 Spring Frame work

  *EJB 의 단점을 극복한 프레임 워크*
   - 경량 컨테이너의 기능을 수행
   - 제어 역행을 통해 어플리케이션 간의 결합 제어
   - 의존성 주입 기능을 지원
   - 관점지향 기능을 이용해 자원을 관리
   - 영속성과 관련된 다양한 서비스를 지원
   - 수많은 라이브러리 연동기능을 지원

|기능| 설명|
|--|--|
|Core|다른 기능과 설정을 분리하기 위한 IOC 기능 제공|
|Context|스프링의 기본 기능인 Bean에 대한 접근 방법을 제공|
|DAO| JDBC 기능을 편리하게 사용 가능|
|ORM| 영속성 관련 프레임워크와 연동된 기능을 제공 |
|AOP|관련 지향 기능을 제공|
|WEB| 웹 어플리케이션 개발에 필요한 기능을 제공|
|WEBMVC| MVC 구현에 관련된 기능을 제공|
  
 1. 모델2 아키텍쳐 지원
 2. 스프링과 다른 모듈과의 연계가 용이
  
|구성 요소| 설명|
|--|--|
|DispatcherServlet|클라이언트의 요청을 전달받아 해당 요청에 대한 컨트롤러를 선택하여 클라이언트의 요청을 전달. 반환한 값을 view에 전달|
|HandlerMapping|클라이언트가 요청한 URL을 처리할 컨트롤러를 지정|
|Controller|클라이언트의 요청을 처리한 후 그 결과를 DispatcherServlet에 전달|
|ModelAndView|컨트롤러가 처리한 결과 및 뷰 선택에 필요한 정보를 저장|
|ViewResolver|컨트롤러 처리결과를 전달할 뷰를 지정|
|View|컨트롤러의 처리 결과 화면을 생성|
 1. DispatcherServlet 에 URL로 접근하여 해당 정보 요청
 2. 핸들러 매핑에서 해당 요청에 대해 매핑된 컨트롤러를 요청
 3. 매핑된 컨트롤러 처리 요청
 4. 컨트롤러 처리 결과와 VIEW 이름을 ModelAndView에 저장하여 DispatcherServlet으로 반환
 5. DispatcherServlet 에서는 컨트롤러에서 보낸 View의 이름을 ViewResolver로 보내 해당 View 요청
 6. View 처리결과를 DispatcherServlet에 전송
 7. DispatcherServlet이 최종결과를 브라우저로 전송

# 의존성 주입 DI

*컨테이너가 연관관계를 직접 규정 하는것*

> Interface를 사용하면 기존의 클래스를 변경할 필요가 줄어든다
- 의존관계를 최소화 하여 코드를 단순화
- 어플리케이션을 더 쉽게 유지 및 관리
- 의존성 주입은 객체의 생성, 소멸과 객체 간의 의존관계를 컨테이너가 제어
> 객체의 제어를 스프링이 직접 담당하므로 제어의 역전  IOC를 한다

**XML (Bean)** 
|속성 이름| 설명|
|--|--|
|id|빈 객체의 고유 이름으로 빈 id를 이용해 빈에 접근|
|name|객체의 별칭|
|class|생성할 클래스 / 패키지 이름까지 입력|
|constructor-arg|생성자를 이용해 값을 주입할 때 사용|
|property|setter 를 이용해 값을 주입할 때 사용|

    BeanFactory  factory = new  XmlBeanFactory(new FileSystemResource("person.xml"));
    PersonService  person = (PersonService) factory.getBean("personService");
> BeanFactory 로 빈을 생성후 주입
> getBean 에 id를 가진 빈을 가져옵니다

# 관점 지향 프로그래밍 AOP
*모든 웹 어플리케이션의 공통 기능*
*메서드 안의 주기능과 보조기능을 분리한 후 선택적으로 적용*
|이름| 설명|
|--|--|
|aspect|구현하고자하는 보조 기능|
|advice|aspect의 실체 구현체 메서드 호출을 기준으로 여러 지점에서 실행|
|joinpoint|advice 적용하는 지점을 의미|
|pointcut|정규식으로 지정하여 사용|
|target|advice가 적용되는 클래스를 의미|
|weaving|advice를 주기능에 적용하는 것|

- 타깃 지정
- 어드바이스 지정
- 포인트컷 설정
-  어드바이스와 포인트컷을 결합하는 어드바이저
- ProxyFactoryBean 클래스를 이용해 타깃에 어드바이스 설정
-  getBean으로 객체에 접근

> MethodBeforeAdvice
	=> Before
	=> 해당 메서드가 실행되기전 실행
	
> AfterReturningAdvice
	=> afterReturning
	=> 해당 메서드가 실행된 후 실행
	
> ThrowsAdvice
	=> afterThrowing
	=> 해당 메서드의 예외 방생 시 실행

> MethodInterceptor
	=> invoke
	=> 해당 메서드의 실행 전/후 와 예외 발생시 실행

다음장 ..!

[Ex 6-3 Spring 활용](../ex04)


