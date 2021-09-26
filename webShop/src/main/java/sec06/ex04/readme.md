
  

# Ex6-4 spring & servlet + mybatis

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

다음장 ..!

[Ex 6-4 Spring + mybatis](../ex05)