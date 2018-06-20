# Spring-Error-Pages-Demo
This Example Explain How Spring Handle Custom Error Pages Like 404 and 500.
***************************
Static Pages Path
***************************

/demo/src/main/resources/public/error/404.html

/demo/src/main/resources/public/error/500.html

********************************
Dynamic Page Path

/demo/src/main/webapp/WEB-INF/views/error.jsp

**************************
*****Explaination********
**************************

First It will Search for Error Pages under /src/main/resources/public/error/
if not Found it will Search /src/main/webapp/WEB-INF/views/error.jsp
if not found it will show default whitelabel error page.
