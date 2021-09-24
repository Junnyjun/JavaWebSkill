  

# Ex6-1  File 업로드

**Commons.io & commons.fileupload  추가**

|method|function|
|--|--|
|SetRepository|파일을 저장할 디렉터리 설정|
|setSizeThreadhold|최대 업로드 가능한 파일 크기 설정|
|||
|parserequest|전송된 매개변수를 List 객체로 얻습니다|
|getItemItreator|전송된 매개변수를 Iterator 타입으로 얻는다|
  
  ***
  **JQuery**

|선택자 종류|표현식 |
|--|--|
|All selector|$(*) : 모든 DOM을 선택|
|ID selector|$("#id") : 해당되는 id를 가진 dom 선택|
|Element selector|$(".className") : CSS중 해당되는 클래스를 가지는 DOM|

**Ajax**
*페이지 이동없이 데이터 처리가 가능 ( 비동기 통신)*

    $.ajax({
	    type : "post & get",
	    async : "true & false",
	    url : "요청할 URL",
	    data : {서버로 전송할 데이터}.
	    dataType : " 서버에서 전송받을 데이터 형식",
	    success : { 응답시 처리 (성공시) },
	    error : function(xhr,status,error){ 오류 발생시},
	    complete: function(data,textStatus){ 작업 완료 후 처리}
	 });

|attribute|destription|
|--|--|
|type|통신 타입 설정|
|url |요청할 url|
|async|비동기 식으로 처리할 지 여부 처리|
|data|서버에 요청할 때 보낼 요청 매개변수 설정|
|dataType|응답 받을 데이터 타입 설정|
|success |응답시 처리 (성공시)|
|error|오류 발생시|

 
다음장 ..!
[Ex 6-2 MVC2 ](../ex02)