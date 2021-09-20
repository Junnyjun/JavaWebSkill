
#  Ex5-1  JSP
~~*보기 편하게 편의상 java 폴더에 넣을예정*~~
*화면 기능을 디자이너가 작업하기 쉽게 하기위해 등장*

**구성 요소**
- HTML & CSS & JAVASCRIPT
- JSP 기본&액션 태그

**JSP 변환 과정**
1. 변환 단계 : 컨테이너는 JSP파일을 자바 파일로 변환
2. 컴파일 단계 : 컨테이너는 변환된 자바 파일을 클래스 파일로 컴파일 합니다.
3. 실행 단계 : 컨테이너는 클래스파일을 실행하여 그 결과를 브라우저로 전송해 출력합니다

**JSP 구성 요소**
- 디렉티브 태그
- 스크립트 요소
- 표현 언어
- 내장 객체
- 액션 태그
- 커스텀 태그

***
**디렉티브 태그**
*JSP 페이지에 전반적인 설정 정보를 지정할 때 사용하는 태그*
- 페이지 디렉티브 : JSP 페이지의 전반적인 정보를 설정
- 인클루드 디렉티브 : 공통으로 사용하는 JSP 페이지를 다른 JSP페이지에 추가할 때 사용
- 태그라이브 디렉티브 태그 : 개발자나 프레임워크에서 제공하는 태그를 사용할 때 사용

**JSP 스크립트 요소**
- 선언문 : jsp에서 변수나 메서드를 선언할때사용
- 스크립트 릿: jsp에서 자바코드를 작성할 때 사용
- 표현식 : jsp에서 변수의 값을 출력할 때 사용

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

***
**인클루드 액션 태그**
|이름|형식|설명|
|--|--|--|
|인클루드 액션 |jsp:include|JSP를 현재 JSP에 포함
|포워드 액션|JSP:forward|서블릿에서 RequestDispatcher 클래스의 포워딩 기능을 대신하는 태그|
|유즈빈 액션|jsp:useBean|객체를 생성하기 위한 new 연산자를 대신하는 태그|
|셋프로퍼티 액션 |jsp:setProperty|setter를 대신하는|
|겟프로퍼티 액션 |jsp:getProperty|getter를 대신하는|

|항목|인클루드 액션 태그|인클루드 디렉티브 태그|
|--|--|--|
|기능|JSP 레이아웃 모듈화|JSP 레이아웃 모듈화|
|처리 시간|요청 시간에 처리|JSP를 자바 코드로 변환 시 처리|
|데이터 처리 방법|param 액션 태그를 이용해 동적 처리|정적 처리만 가능|
|포함된 JSP 자바 파일 변환 여부|포함되는 JSP가 각각 자바 파일로 생성|포함되는 JSP가 포함하는 JSP에 합쳐진 후 한개의 자바파일로 생성|

***
**Bean 사용하기**
*Bean 데이터를 저장하거나 전달하는데 사용한다*
- 속성의 접근제한자는 private
- 각 속성은 setter/getter
- setter와getter의 첫글자는 소문자
- 인자 없는 생성자를 반드시 가지며 다른생성자도 추가 할 수 있다

다음장 ..!  
[Ex 5-2 표현 언어](../ex02)