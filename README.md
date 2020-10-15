# flow-task

## 개발환경
- IntelliJ
- Spring boot 2.3.4
- oracle jdk 1.8
- maven

### dependency
- Spring Web
- Lombok
- Spring Data Jpa
- H2 Database
- Thymeleaf


## 추가 고려 사항
1. 커스텀 확장자가 비어있는 경우
2. 커스텀 확장자가 중복 되는 경우
3. 커스텀 확장자가 고정 확장자에 존재하는 경우

## Table schema

### DefaultExtension Table
|column|type|constraint|
|-------|-------|-------|
|id |int | primary key|
|name | string | unique key|
|blocked | boolean| not null |



### CustomExtension Table
|column|type|constraint|
|-------|-------|-------|
|name | string | primary key|


### Front-end
```http
http://localhost:/
```
