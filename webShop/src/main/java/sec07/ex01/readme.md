
  

# Ex7-1 spring annotation

  *복잡한 XML 파일 설정을 간단하게 가능*

- DefaultAnnotationHandlerMapping - 클래스레벨에서 RequestMapping 처리
- AnnotationMethodHandlerAdapter - 메서드 레벨에서 RequestMapping 처리

**\<context:component-scan>**
@Contoller ,  @Service , @Repository , @Component
*Bean 을 스프링에 등록하여 해당 annotation의 역할을 수행하게 한다*

**@AutoWired**
*XML 설정이 아닌 코드에 설정을 하여 설정과 보기가 편해지는 장점이 있다*


**ModelAndView & Model**
*View설정이 없을 경우 Model으로 처리*





# Maven
*pom.xml*

|속성|설명|
|--|--|
|groupId|프로젝트 그룹 id를 나타내며 일반적으로 도메인 이름|
|artifactId|아티팩트 id 설정 대개 패키지설정|
|version|버전을 설정|
|packaging|배포 시 패키징 타입 설정|

*dependencies*
|속성|설명|
|--|--|
|dependency|의존하는 다른 라이브러리 정보를 기술|
|groupId|프로젝트의 그룹 id|
|artifactId|프로젝트의 그룹 artifact id|
|version|프로젝트의 버전|


> insert(query_id , Object obj )  , update(query_id , Object obj ) , delete(query_id , Object obj ) 
각각의 query를 실행

    <select  id="selectMemberById"  
	    resultType="memberVO" parameterType="String"  >
		    <![CDATA[select * from t_memberwhereid=#{id}]]>
	</select>


# log4j
*실행 확인을 위한 작업을 편하게 대체*
- appender
	- 로그의 출력 위치를 결정,
-  layout
	- 로그를 어떤형식으로 출력할지 출력 레이아웃을 결졍
-  Logger
	- 로그 메세지를 appender에 전달
	- 개발자가 로그레벨을 이용해 로그 출력여부를 조정 가능

*Appender*
- ConsoleAppender
	- 콘솔에 로그 메세지를 출력
- FileAppender
	- 파일에 메세지를 출력
- RollingFileAppender
	- 파일크기가 일정 기준을 넘으면 기존 파일을 백업파일로 바꾸고 처음부터 기록
- DaliyRollingAppender
	- 설정한 기간 단위로 새 파일을 만들어 로그 메세지를 기록

 - [ ] %p  : debug , info , error , fatal 등 로그 레벨 이름 출력
 - [ ] %n : 로그 메시지 출력
 - [ ] %d : 로깅 이벤트 발생 시각 출력
 - [ ] %F : 로깅이 발생한 프로그램 파일 이름 출력
 - [ ]  %l : caller의 정보 출력
 - [ ]  %L : Caller의 라인 수 출력
 - [ ]  %M : 메서드 명 출력
 - [ ]   ....... 

# Tiles
*화면의 레이아웃을 쉽게 구현하기 위해 도입된 JSP 페이지 레이아웃을 위한 프레임 워크*
- 페이지 레리아웃을 쉽고 단순하게 구현 가능
- 공통된 레이아웃을 사용하므로 유지 관리가 쉽다
다음장 ..!

[Ex 7-2 spring 여러가지 기능](/../ex02)