<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
    <title>Calculator | HTML CSS JS</title>
</head>

<body>
<div class="wrapper">


    <form action="hello-chandan">
        <section class="screen">
            <%=request.getParameter("sum")%>
        </section>
        <section>
            <label>
                <input type="text" name="num1" placeholder="Enter the value ">
            </label>
            <label>
                <input type="text" name="num2" placeholder="Enter the value ">
            </label>
            <div class="calculator">
                <button name="btn" value="1" id="add">+</button>
                <button name="btn" value="2" id="subtract">-</button>
                <button name="btn" value="3" id="multiply">×</button>
                <button name="btn" value="4" id="divide">÷</button>
            </div>
            <button type="submit">submit</button>


        </section>
    </form>
</div>


</body>

</html>