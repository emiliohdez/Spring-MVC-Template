# Spring MVC Project Template
This is a basic skeleton of an MVC project built with the Spring Java Framework :computer:, the classes and files contained are a mini sample that aims to show the data flow through the layers of the template.

**First**, you can take a look to the dependencies of this template in the `pom.xml` file. This project just contains the dependencies needed to run a basic web application that could maybe accept files upload, but if you need something like interacting with other database like MongoDB or an specific library, you'll have to add it to file.

About configurations included
---

This project contains the configuration for mapping action requests to the Servlets in the `controllers` package :package: (Line 19, `dispatcher-servlet.xml`).

```xml
<context:component-scan base-package="mvcbase.controllers" />
```

As an example, this package contains the `PublicController.java` servlet with one method mapped to a GET request and other mapped to a POST request.

The views :eyes: are contained in the `web/WEB-INF/views/` directory and must be **JSP** files, as you can see in `dispatcher-servlet.xml`, too. I recommend you to use the **JSTL** for scripting :ok_hand:.

The resources are mapped to the `web/resources/` directory, where we can place our **CSS**, **JavaScript** files, **Fonts** and so on :thumbsup:.



For more information about this example and how it can be applied with a Model layer, you can visit this blog post: 

http://emiliohdez.com/extras/blog/2020_custom_mvc_with_spring.html

 :v:

License
----

MIT
