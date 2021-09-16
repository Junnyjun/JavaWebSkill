
#  Ex1.1 서블릿 계층 구조 

servlet & servletconfig 인터페이스를 구현하여 제공

 - [ ] doDelete(HttpServletRequest req, HttpServletResponse resp)
 - Delete 요청을 수행 
  - [ ] doGet(HttpServletRequest req, HttpServletResponse resp)
 - doGet요청을 수행 
  - [ ] doHead(HttpServletRequest req, HttpServletResponse resp)
 - doHead요청을 수행 
  - [ ] doPost(HttpServletRequest req, HttpServletResponse resp)
 - doPost요청을 수행 

|메서드명|기능  |
|--|--|
|protect service|request를 public service 전달받아 doXXX 메서드를 호출 |
|public service|클라이언트의 request를 protect service 전달합니다 |


**생명주기** 
|생명주기 단계|메서드 특징 |
|--|--|
|초기화|init() ||

 - 서블릿 요청 시 맨 처음 한번 만 호출 됩니다
 - 초기화 작업을 주로 수행 합니다.

|      |       |
|--|--|
|작업 수행 |do get() & do post() |
- 서블릿 요청 시 매번 호출 됩니다
 - 클라이언트가 요청하는 작업을 수행 

|      |       |
|--|--|
|종료|destroy()|
-  서블릿이 기능을 수행 하고 메모리에서 소멸될 때 호출
 - 서블릿의 마무리 작업을 주로 수행

|      |       |
|--|--|

다음장 ..!
[Ex 1-2 서블릿 기초](../ex02) 