## 👩🏻‍💻 팀원 소개

<table>
    <tr align="center">
              <td style="min-width: 200px;">
            <a href="https://github.com/hayounSong">
              <img src="https://github.com/hayounSong.png" width="100">
              <br />
              <b>송하윤 (hayounSong)</b>
            </a>
                       <br/>
              Server
        </td>
        <td style="min-width: 200px;">
            <a href="https://github.com/sss4920">
              <img src="https://github.com/sss4920.png" width="100">
              <br />
              <b>김수현(sss4920)</b>
            </a> 
            <br/>
       
 Server
    </tr>

</table>

협업 노션: https://www.notion.so/go-sopt/CDS-TEAM_5-SERVER-cae33108857144779c36a0ae0be313fd?pvs=4

## 📱 롯데 시네마 리디자인 프로젝트

### 🧐 현재 상영중인 영화 리스트 API
현재 상영중인 영화들의 정보에 대한 API 제공

### 🍓 상영중인 영화의 세부 정보 API
현재 상영중인 영화의 세부정보에 대한 API 제공

### 💊 영화관 지역 리스트 및 상영 가능 영화관 API
롯데 시네마가 위치한 지역 리스트와, 현재 상영 가능한 롯데 시네마 목록을 제공합니다.

### 🩺 세부 영화 상영 스케줄에 대한 API
예약 날짜, 관람하려는 상영관에 따른 영화 상영 스케줄 API 제공

<br />

![image](https://github.com/GOSOPT-CDS-TEAM-APP5/Server/assets/39684920/5738b936-98bf-4c01-90fa-dc707e93b700)

<hr/>
<br />


## 🛠 기술 스택


### 🖥 Backend

|역할|종류|
|-|-|
|Framework|<img alt="RED" src ="https://img.shields.io/badge/SPRING-6DB33F.svg?&style=for-the-badge&logo=Spring&logoColor=white"/> <img alt="RED" src ="https://img.shields.io/badge/SPRING Boot-6DB33F.svg?&style=for-the-badge&logo=SpringBoot&logoColor=white"/>|
|Database|<img alt="RED" src ="https://img.shields.io/badge/Mysql-003545.svg?&style=for-the-badge&logo=Mysql&logoColor=white"/>|
|Database Service|<img alt="RED" src ="https://img.shields.io/badge/Amazon Rds-527FFF.svg?&style=for-the-badge&logo=AmazonRds&logoColor=white"/>|
|Programming Language|<img alt="RED" src ="https://img.shields.io/badge/JAVA-004027.svg?&style=for-the-badge&logo=Jameson&logoColor=white"/>|
|API|![REST](https://img.shields.io/badge/Rest-4B3263?style=for-the-badge&logo=rest&logoColor=white)                                     
|Version Control|![Git](https://img.shields.io/badge/git-%23F05033.svg?style=for-the-badge&logo=git&logoColor=white) ![GitHub](https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white) |
|CI/CD|![Jenkins](https://img.shields.io/badge/Jenkins-%D24939.svg?style=for-the-badge&logo=Jenkins&logoColor=white)|
<br />


### 🖥 Common
|역할|종류|
|-|-|
|협업 관리|<img alt="RED" src ="https://img.shields.io/badge/Notion-000000.svg?&style=for-the-badge&logo=Notion&logoColor=white"/> |
|디자인|<img alt="RED" src ="https://img.shields.io/badge/Figma-F24E1E.svg?&style=for-the-badge&logo=Figma&logoColor=white"/>|

<br />


## 📂 폴더 구조
```

├── 📂.github

├── 📂 main
	├── 🗂️ resources
		├── 📕 application.yml


	├── 📂 controller(컨트롤러 파일)
		├── 🗂️ dto
		 ├──🗂️ request
		 ├──🗂️ response
			
	├── 📂 domain(엔티티 파일)

	├── 📂 infrastructure(레포지토리 폴더)
	
	├── 📂 service(서비스 파일)
	
	├── 📂 exception(Exception enum, Exception class 파일)
		├── 🗂️ model
		
	├── 📂 common(공용 클래스 관리)
		├──🗂️ advice
		├──🗂️ dto
```


# Code Convention

---

1. File Naming
- 파일 이름 및 클래스, 인터페이스 이름: **파스칼 케이스(Pascal Case)**

```java
public class ControllerExceptionAdvice {
```

1. Entity에서 사용되는 속성값들은 ? **카멜 케이스**(**camel Case)**

```java
private String email;
```

1. 내부에서 사용되는 함수 및 기타 사용: **카멜 케이스(camelCase)**

```java
public ApiResponse createEmail(@RequestBody @Valid final BoardRequestDto request) {
```

1. 엔티티 생성자 관리는 **Builder Pattern 사용**

```java
@Builder
```

### **인터페이스 이름에 명사/형용사 사용 [interface-noun-adj]**

인터페이스(interface)의 이름은 명사/명사절로 혹은 형용사/형용사절로 짓는다.

```java
// Good Exemples
public interface RowMapper {
public interface AutoClosable {
```

### **클래스 이름에 명사 사용 [class-noun]**

클래스 이름은 명사나 명사절로 짓는다.

### **메서드 이름은 동사/전치사로 시작 [method-verb-preposition]**

메서드명은 기본적으로 동사로 시작한다.

✔️ 다른 타입으로 전환하는 메서드나 빌더 패턴을 구현한 클래스의 메서드에서는 전치사를 쓸 수 있다.

```java
- 동사사용 : renderHtml()
- 전환메서드의 전치사 : toString()
- Builder 패턴 적용한 클래스의 메서드의 전치사 : withUserId(String id)
```

### 🍑 **상수**

### **상수는 대문자와 언더스코어로 구성[constant_uppercase]**

"static final"로 선언되어 있는 필드일 때 상수로 간주한다.

상수 이름은 대문자로 작성하며, 복합어는 언더스코어'_'를 사용하여 단어를 구분한다.

```java
public final int UNLIMITED = -1;
public final String POSTAL_CODE_EXPRESSION = “POST”;
```

### **변수**

### **변수에 소문자 카멜표기법 적용 [var-lower-camelcase]**

상수가 아닌 클래스의 멤버변수/지역변수/메서드 파라미터에는 소문자 카멜표기법(Lower camel case)을 사용한다.

```java
private boolean authorized;
private int accessToken;
```

### **임시 변수 외에는 1 글자 이름 사용 금지 [avoid-1-char-var]**

메서드 블럭 범위 이상의 생명 주기를 가지는 변수에는 1글자로 된 이름을 쓰지 않는다.

**반복문의 인덱스나 람다 표현식의 파라미터 등 짧은 범위의 임시 변수**에는 관례적으로 1글자 변수명을 사용할 수 있다.

```java
HtmlParser parser = new HtmlParser();
```

# API NEEDS

---

### 1. 영화 무비 차트 API(메인 홈 뷰)

제목,예매율, 별점, 연령제한, 개봉 예정작, D-Day, 개봉여부

### 2. 영화 상세 정보

제목, 장르,개봉날,시간,평점,예매율,~~누적 관객수~~, 시놉시스

### 3. 영화관 목록(지역)

영화관 목록

### 4. 영화관 지역 목록 세부

영화관 세부 지역 목록

### 5. 영화관 세부 정보(영화 정보)

제목,장르, 개봉일, 시간

### 6. 영화관 세부 정보(시간 정보)
