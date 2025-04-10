<%-- 
    Document   : cadastrarFuncionario
    Created on : 10 de abr. de 2025, 20:24:48
    Author     : kaique.psilva12
--%>

<%@page import="com.mycompany.avaliacao01web.resources.CRUD"%>
<%@page import="com.mycompany.avaliacao01web.resources.Funcionario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro de funcionario</title>
    </head>
    <body>
        <%
            Funcionario funcionario = new Funcionario();

            funcionario.setNome(request.getParameter("nome"));
            funcionario.setFunção(request.getParameter("funcao"));
            funcionario.setIdade(Integer.parseInt(request.getParameter("idade")));
            funcionario.setSalario(Double.parseDouble(request.getParameter("salario")));
            
            CRUD crud = new CRUD();
            crud.InserirFuncionario(funcionario);
            out.println("Funcionario cadastrado no sistema");
         %>
    </body>
</html>
