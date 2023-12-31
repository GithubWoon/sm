<%--
  Created by IntelliJ IDEA.
  User: LG
  Date: 2023-10-02
  Time: 오후 5:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>로그인</title>
    <style>
        fieldset{
            border-radius: 10px;
            text-align: center;
            width: fit-content;
            margin-left: auto;
            margin-right: auto;
        }
        h2,input{
            text-align: center;
        }
        ul {
            list-style-type:none;
            padding-inline-start :0;
            display:flex; /* 가로 정렬을 위해 flex 속성 추가 */
            flex-direction :column; /* 세로 방향으로 정렬 */

        }

        li {
            margin-bottom :10px ;
            display:flex;/* 가로 정렬을 위해 flex 속성 추가 */

        }

        label.title {
            width :40%;/* label의 너비 설정*/
            text-align:left;/* 텍스트를 오른쪽으로 정렬*/

        }

        input[type='text']{
            width :60%;/* input의 너비 설정*/
            text-align:left;/* 텍스트를 왼쪽으로 정렬*/
        }
        input[type='password']{
            width :60%;/* input의 너비 설정*/
            text-align:left;/* 텍스트를 왼쪽으로 정렬*/
        }

        input[type="submit"]{
            margin: 10px;
            padding: 10px 20px;
            border: none;
            background-color: beige;
            color: black;
            border-radius: 10px;
            cursor: pointer;
            font-size: 17px;
        }
        input[type="submit"]:hover{
            background-color: lightgreen;
            color: black;
        }
    </style>
</head>
<body>
    <form action="/login/authenticate" method="post">
        <fieldset>
            <h1>SHOPPING MALL</h1>
            <ul>
                <li>
                    <label for="ID" class="title">ID</label>
                    <input type="text" id="ID" name="id">
                </li>
                <li>
                    <%--안됫던 이유, 파라미터하고 변수달라서, named을 pw가 아닌PW로 했기 때문에 그냥 소문자로 하자--%>
                    <label for="PW" class="title">PW</label>
                    <input type="password" id="PW" name="pw">
                </li>
            </ul>
            <input type="submit" value="로그인">
        </fieldset>
    </form>
    <script>
        // 서버에서 전달받은 메시지를 읽어와서 알림창을 표시합니다.
        var message = "<%= request.getAttribute("message") %>";
        if (typeof message === 'string' && message !== "" && message !== "null") {
            alert(message);
        }
    </script>
</body>
</html>
