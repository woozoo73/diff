# Spring profile 별로 다른 css 파일 적용하기

## dev 프로파일인 경우
    * `application-dev.yml` 파일의 `site.thema` 설정값 `blue`에 따라... `/css/blue.css` 파일이 적용됩니다.
## 기타
    * `application.yml` 파일의 `site.thema` 설정값 `default`에 따라... `/css/blue.css` 파일이 적용됩니다.

## application.yml

```yml
spring:
  mvc:
    view:
      prefix: /WEB-INF/jsp/
      suffix: .jsp
site:
  thema: default
```

## application-dev.yml

```yml
site:
  thema: blue
```

## Index 페이지 접속

* http://localhost:8080/index

* index.jsp

```html
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<spring:eval expression="@environment.getProperty('site.thema')" var="thema" />
<html>
<head>
    <link rel="stylesheet" href="/css/${thema}.css">
</head>
<body>
    <div>Index</div>
</body>
</html>
```
