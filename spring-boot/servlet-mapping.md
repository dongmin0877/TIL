# Servlet mapping

Servlet mapping controls how you access a servlet.

Following codes show servlet mapping.

```html
<servlet>
  <servlet-name>servlet Ex</servlet-name>
  <servlet-class>com.servlet.Servlet Ex</servlet-class>
</servlet>

<!-- mapping -->
<servlet-mapping>
  <servlet-name>servlet Ex</servlet-name>
  <url-pattern>/se</url-pattern>
</servlet-mapping>
```

## annotation

We can use annotaion also.

```java
@WevServlet("/se")
public class servletEx extends HttpServlet {
  ...
}
```