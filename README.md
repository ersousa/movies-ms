<h1 align="center">Movies-ms</h1>

<h4 align="center">Status: Desenvolvimento</h4>

<p align="center">API de um sistema de filmes</p>

<div align="center">
É uma aplicação web planejada pela equipe (Davi Lima, Ederson Sousa, Sâmila Milena, Roberta Caroline, Marcio Filadelfo, Bruno Pires).
Desenvolvimento comtempla o CRUD e conexão com banco de dados.

<p align="justify">O sistema contém filmes cadastrados, onde será possivel listar todos os filmes, buscar por apenas um e também trazer de forma aleátoria um por vez.</p>
</div>

<div align="center">
<h2>Como subir o ambiente:</h2>
<p>Banco de dados configurado na porta 8080</p>
<p>URL: http://localhost:8080/h2-console</p>
<p>Driver Class: org.h2.Driver</p>
<p>JDBC URL: jdbc:h2:mem:testdb</p>
<p>User Name:: sa</p>
<p>Password: sa</p>
<br>
<h2>Para testar funcionalidades da API:</h2>
<p>Swagger configurado na porta 8080</p>
<p>URL : localhost:8080/swagger-ui/index.html</p>
<p>/movies : Lista todos os filmes</p>
<p>/movies/{id} : Trás o filme conforme solicitado, obs: o id é o campo imdbId, que você poderá consultar o valor após listar todos.</p>
<p>/movies/random : Trás filmes por imdbId aleátorio</p>

<div align="center">

## Tecnologias usadas:


<table>
  <tr>
    <td>Java</td>
    <td>SpringBoot</td>
    <td>H2</td>
  </tr>
  <tr>
    <td>11</td>
    <td>3.0.3</td>
  </tr>
</table>

#### *Utilitários*

   Editor:  **[SpringBoot](https://docs.spring.io/spring-boot/docs/1.5.16.RELEASE/reference/html/using-boot-devtools.html)**
   Teste de API:  **[Postman](https://www.postman.com/)** , **[Swagger](http://localhost:8080/swagger-ui/index.html)**

 
![Java Badge](https://img.shields.io/badge/Java-%23ED8B00.svg?&style=plastic&logo=java&logoColor=white?logoWidth=40)
![Spring Badge](https://img.shields.io/badge/Spring%20-%236DB33F.svg?&style=plastic&logo=spring&logoColor=white)
 
</div>
