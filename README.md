spring mvc sample code
----------------------
    spring STS IDE
    maven build
    tomcat 8.5 server
    
	 Configure: 
	  - web.xml for dispatcher servlet
	  - WEB-INF/config/servlet-config.xml for spring beans
	  - Bean "InternalResourceViewResolver" with suffix and prefix to resolve views
	  - HelloController and RequestMapping to respond on /greetings
	  - hello.jsp to render model "greeting"
	  - Sample code runs at: http://localhost:8080/samplespringmvc/greetings
	 
	 User Input:
	  - capture user form input using ModelAttribute
       - example at customer.jsp & CustomerController.java @ http://localhost:8080/samplespringmvc/customers
      
      Restful API:
       - http://localhost:8080/samplespringmvc/samples
       - wired SampleService
       - return json response
       
  