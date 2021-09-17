
#  Ex2-1 비즈니스 로직 처리

*Statement 보다 미리 쿼리를 컴파일 할 수 있는 PreparedStatement 인터페이스를 사용하자.* 
 - [ ] PreparedStatement 인터페이스는 Statement를 그대로 사용 할 수 있다.
 - [ ] Statement와 달리 PreparedStatement 는 컴파일된 SQL문을 DBMS에 전달한다
 - [ ] PreparedStatement  인터페이스는 SQL문에 "?"(와일드카드)를 넣을 수 있다.
 

|Statement|
|--|--|
    String Query = "select * from t_member";
    ResultSet rs = stmt.executeQuery(Query);

|PreparedStatement |
|--|--|
    String Query = "select * from t_member";
	stmt = con.prepareStatement(Query);
	ResultSet rs = stmt.executeQuery();

***

**ConnectionPool** 
*데이터 베이스와 연결시킨 상태를 유지하는 기술*

**동작 과정**

 1. Tomcat에서 Application 실행
 2. ConnectionPool 객체를 생성
 3. DBMS와 객체 연결
 4. ConnectionPool에서 사용하는 메서드로 연동

***
**JNDI**
*필요한 자원을 키/값 쌍으로 저장한 후 필요할 때 키를 이용해 값을 얻는 방법*

 - [ ] name/value 쌍으로 전송한 후 서블릿에서 getParameter로 가져올때
 - [ ] 해쉬맵 & 해쉬테이블 에 키/값으로 저장 후 키를 이용해 가져올 때
 - [ ] 도메인 네임으로 DNS서버에 요청할 경우 도메인 네임에대한 IP주소를 가져 올 때

다음장 ..!
[Ex 2-2 데이터베이스 연동](../ex02)