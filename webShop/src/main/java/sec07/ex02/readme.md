

  

# Ex7-2 MultiFile
*스프링의 CommonsMultipartResolver 클래스를 이용하여 여러 개의 파일을 업로드 가능*

|속성| 설명|
|--|--|
|maxUploadSize|최대 업로드가 가능한 파일의 크기를 설정|
|maxInMemorySize|디스크에 임시 파일을 생성하기 전 메모리에 보관할 수 있는 최대 바이트 크기를 설정|
|defaultEncoding|전달되는 매개변수의 인코딩 설정|

    <beans:bean  id="multipartResolver"  
    class="org.springframework.web.multipart.commons.CommonsMultipartResolver">
	    <beans:property  name="maxUploadSize"  value="52428800"  />	
	    <beans:property  name="maxInMemorySize"  value="1000000"  />
	    <beans:property  name="defaultEncoding"  value="utf-8"  />
	    </beans:bean>	
	

  
#  인터셉터
*브라우저 요청이 있을 때 요청 메서드 호출 전 후에 개발자가 원하는 기능 수행*

|메서드 | 기능|
|--|--|
|preHandle|컨트롤러 실행전 호출|
|postHandle|컨트롤러 실행후 Servlet이 View로 보내기전 호출|
|afterCompletion|뷰까지 수행하고 나서 호출|

다음장 ..!
[Ex 7-3 Spring Rest API](../ex03)


