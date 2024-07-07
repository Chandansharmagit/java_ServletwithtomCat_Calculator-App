
package org.example.java_servletchandan;

import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-chandan")
public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String num1 = request.getParameter("num1");
        String num2 = request.getParameter("num2");
        String num3 = request.getParameter("btn");
        //getting the arithemetic operators


        int names = Integer.parseInt(num1);
        int names2 = Integer.parseInt(num2);
        int sum = 0;

        switch (num3) {
            case "1":
                 sum = names + names2;
                request.setAttribute("sum ", sum);
                response.sendRedirect("calculator.jsp?sum="+sum);
                break;
            case "2":
                 sum = names - names2;
                request.setAttribute("sum", sum);
                response.sendRedirect("calculator.jsp?sum="+sum);
                break;
            case "3":
                sum = names * names2;
                request.setAttribute("sum",sum);
                response.sendRedirect("calculator.jsp?sum="+sum);
                break;
            case "4":

                if(names != 0){
                    sum = names / names2;
                    request.setAttribute("sum",sum);
                    response.sendRedirect("calculator.jsp?sum="+sum);
                }else{
                    request.setAttribute("error", "Cannot divide by zero");
                }


                break;

            default:
                System.out.println("invalid inputs");
                break;
        }




      //  response.getWriter().append("the sum value is : ").append(String.valueOf(sum));


    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String name = request.getParameter("num1");

        System.out.println(name);

        request.setAttribute("name", name); // Set the name as a request attribute

        // Forward the request to result.jsp
        request.getRequestDispatcher("/hello-chandan").forward(request, response);
    }

    public void destroy() {
    }
}
