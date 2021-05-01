package co.edu.sena.demo2242753.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//recibir datos del formulario

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double salary;
        double health;
        double pension;
        int transport=106454;
        double salary1;
        double salaryT;
        int arl=0;
        double subDes;


        String nombres=request.getParameter("nombres") ;
        String apellidos=request.getParameter("apellidos");
        String documento=request.getParameter("documento");
        int dias_trabajados=Integer.parseInt("dias_trabajados");
        double sueldo_mensual=Double.parseDouble("sueldo_mensual");

        salary= (sueldo_mensual /30)* dias_trabajados;
        salary1=salary+transport;
        health=(salary*0.04)/100;
        pension=(salary*0.04)/100;
        subDes=health+pension;
        salaryT=salary1-subDes;


        response.setContentType("text/html;charset=UTF-8");
        try(PrintWriter out= response.getWriter()){
            out.println("<title> pagina de respuesta </title>");
            out.println("<h1>Bienvenido,estos son los datos del empleado "+nombres+" <h1>");
            out.println("Nombres:"+ nombres);
            out.println("Apellidos:"+ apellidos);
            out.println("Documento:"+ documento);
            out.println("Días trabajados:"+ dias_trabajados);
            out.println("Sueldo  mensual:"+ sueldo_mensual);
            out.println("<h3>Estos son los devengos de los empleados <h3>");
            out.println("Sueldo a pagar:"+ salary);
            out.println("Subsidio de transporte:"+ transport);
            out.println("Subtotal Devengos:"+ salary1);
            out.println("<h3>Estos son los descuentos del empleado <h3>");
            out.println("Salud:"+ health);
            out.println("Pensión:"+ pension);
            out.println("ARL:"+ arl);
            out.println("Subtotal de descuentos:"+ subDes);
            out.println("Valor neto a pagar:"+ salaryT);


        }

        }
    }

