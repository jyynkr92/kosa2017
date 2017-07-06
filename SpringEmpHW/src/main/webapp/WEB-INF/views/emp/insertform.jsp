<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>사원등록</h1>
<form action="insert" method="POST">
사원번호 : <input type="integer" name="employeeId"><br>
이름 : <input type="text" name="firstName"><br>
성 : <input type="text" name="lastName"><br>
이메일 : <input type="text" name="email"><br>
핸드폰 : <input type="text" name="phoneNumber"><br>
입사일 : <input type="Date" name="hireDate"><br>
직무번호 : <input type="text" name="jobId"><br>
연봉 : <input type="Double" name="salary"><br>
보너스 : <input type="Double" name="commissionPct"><br>
매니저번호 : <input type="integer" name="managerId"><br>
부서번호 : <input type="integer" name="departmentId"><br>

<!-- 비밀번호 확인 -->
<input type="submit" value="저장">
<input type="reset" value="취소">

</form>

</body>
</html>