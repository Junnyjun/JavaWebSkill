
  

# Ex6-5 spring + mybatis

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
  


# Mybatis

*복잡하게  query를 구상해야하는 단점을 해결*
- SQL 실행 결과를 자바 빈즈 또는 MAP 객체에 매핑해주는 Persistence 솔루션으로 관리
- SQL문과 프로그래밍 코드를 분리
- DataSource 기능과 트랜잭션 처리기능 제공

|설정 파일|기능|
|--|--|
|SqlMapConfig.xml|데이터베이스 연동 시 반환되는 값을 저장할 빈이나 트랜잭션 데이터 소스등 마이바티스 관련 정보 설정|
|mapper.xml|정보 관련 SQL문을 설정|

> selectList(query.id , 조건 ) 
id 에 대한 select 문을 실행한후 List 반환

> selectOne ( query_id , 조건 )
id 에 대한 select 문을 실행한후 타입 반환

> Map<k,v> selectMap(query_id , 조건)
id 에 대한 select 문을 실행한후 Map 반환

> insert(query_id , Object obj )  , update(query_id , Object obj ) , delete(query_id , Object obj ) 
각각의 query를 실행

    <select  id="selectMemberById"  
	    resultType="memberVO" parameterType="String"  >
		    <![CDATA[select * from t_memberwhereid=#{id}]]>
	</select>


# 트랜잭션 기능
*여러개의 DML명령문을 하나의 논리적인 작업 단위로 묶어서 관리하는 것*

**속성**
- propagation -  트랜잭션 전파 규칙
	- Required - 트랜잭션 필요 & 진행중인 트랜잭션이 없는 경우 새로운 트랜잭션 생성
	- Mandatory - 트랜잭션 필요 &  진행중인 트랜잭션 X 시 예외
	-  Required_NEW -  항상 새로운 트랜잭션 생성 & 진행중이면 중지후 새로운 트랜잭션
	- Support - 트랜잭션 필요 X & 진행중이면 해당 트랜잭션 사용
	- Nested - 트랜잭션 필요 & 진행중 인 트랙잭션이 있는경우 중첩된 트랜잭션
- isolation - 트랜잭션 격리 레벨
	- Default - 기본 설정
	- Read_uncommited - 다른 트랜잭션에서 커밋하지 않은 데이터 읽기 가능
	- Read_commit - 커밋한 데이터 읽기 가능
	- Repeatable_read - 데이터를 수정하지않으면 새로운 데이터와 동일
	- Serializable - 같은 데이터에는 한개의 트랜잭션
- readOnlu - 읽기 전용 여부
- rollbackFor - 트랜잭션을 롤백 할 예외 타입
- norollbackFor - 트랜잭션을 롤백 하지 않을 예외 타입
- timeout - 트랜잭션 타임아웃 시간



다음장 ..!

[Ex 7-1 spring annotation](../../sec07/ex01)