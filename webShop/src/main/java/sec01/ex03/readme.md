
#  Ex1-3 데이터 전송하기

GET & POST 전송 방식 

 - [ ] GET ?
 - URL주소에 데이터를 붙여 전송
 - [ ] POST ?
 - 데이터를 숨겨서 전송

|Get 방식|
|--|--|
|URL 뒤에 name = value 형태로 전송된다.|
|여러개의 데이터는 &로 구분| 
|보안이 취약|
|전송할 수 있는 데이터는 최대 255자|
|기본 전송방식 이며 사용이 쉽다|
|웹 브라우저에 직접 입력 가능|

|Post 방식|
|--|--|
|Tcp/ip 프로토콜 데이터에 body영역에 숨겨 진 채 전송|
|보안에 유리|
|데이터 용량이 넉넉하다|
|속도가 느리다|



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
*java script*

    <script  type="text/javascript">
    function  fn_validate() {
    var  frmLogin = document.frmLogin;
    var  user_id = frmLogin.user_id.value;
    var  user_pw = frmLogin.user_pw.value;
    if ((user_id.length == 0 || user_id == "") 
    ||(user_pw.length == 0 || user_pw == "")) {
    alert("required id & pw");
    } else {
    frmLogin.method = "post";
    frmLogin.action = "login5";
    frmLogin.submit();
    }
    }
    </script>


다음장 ..!
[Ex 2-1 비즈니스 로직 처리](../../sec02/ex01)