
#  Ex3-1 서블릿 포워드

*서블릿에서 다른 서블릿이나 JSP로 요청을 전달하는 역할*
 - [ ] redirect 방법 
 - httpServletResponse 객체의 sendRedirect를 이용
 - 웹브라우저에 재요청하는 방식
 - sendRedirect("**URL**")
 - [ ] Refresh 방법
 - httpServletResponse 객체의 addHeader를 이용
 - 웹브라우저에 재요청하는 방식
 - response.addHeader("Refresh",경과시간(**SEC**);URL="**서블릿 or jsp**" 
 - [ ] location 방법
 - javascript location 객체의 href속성 이용
 - javascript 에서 재요청 하는 방식
 - location.href="**요청할 서블릿 or JSP**"
 - [ ]  dispatch 방법
 - 일반적인 forwarding 기능을 지칭
 - 서블릿이 직접 요청하는 방법
 - RequesetDispatcher 클래스의 forward 이용
 - RequesetDispatcher rd = request.getRequesetDispatcher("**포워드할 서블릿 or JSP**");
 - dis.forward(request,response);
|Statement|


|redirect|
|--|--|
   |클라이언트의 웹 브라우저에서 첫 번째 서블릿에 요청|
   |sendRedirect()를 이용하여 두번째 서블릿을 웹브라우저에 통해 요청|
   |sendRedirect 메서드가 지정한 두 번재 서블릿을 다시 요청|
   |response.sendRedirect("**URL**");|

|refresh|
|--|--|
   |클라이언트의 웹 브라우저에서 첫번째 서블릿에 요청|
   |첫 번째 서블릿은 addHeader를 통해 두번째 서블릿을 웹브라우저를 통하여 요청|
   |웹 브라우저는 addHeader가 지정한 두 번째 서블릿을 재요청|
   |response.sendRedirect("**URL**");|


|dispatch|
|--|--|
   |웹브라우저를 거치지 않고 서버에서 포워딩이 진행|
   |클라이언트의 웹 브라우저 에서 첫 번째 서블릿에 요청|
   |첫번 째 서블릿은 RequestDispatcher를 이용해 두번 째 서블릿으로 포워드|
||


다음장 ..!
[Ex 3-2 Dispatcher 포워딩](../ex02)