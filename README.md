Exemplos-selenium
Projeto contendo exemplos de uso do framework selenium para automatiza��o de testes de Login.
� necess�rio ter instalado o Java jdk, qualquer IDEA, exemplo eclipse, Intellij etc..
e o chromedriver

Primeiro vamos criar um projeto do tipo Maven
Em seguida vai em pom.xml inclui a depend�ncia do Junit e Selenium, podem ser encontradas no site mavenrepository,com
Ap�s incluir as dependecias, vou no meu pacote java e vou criar uma nova classe. Em seguida vou come�ar criando as anota��es @before @After e @test
Ap�s a cria��o das anota��es criaremos uma vari�vel string para passar a URL, criamos tamb�m um objeto do selenium do tipo webDriver.
Na anota��o @before vou passar a URL que quero acessar
em seguida e vamos passar o caminho do nosso chromedriver
vamos criar uma Inst�ncia do chromedriver e vamos tamb�m maximizar a tela
Antes de passar pra anota��o teste, acesse a pagina no Google, vai nos campos e clique em inspecionar,  procure os nomes usados nos campos por exemplo �PASSWORD�, pois vamos precisar dessas anota��es para apontar no c�digo da anota��o teste.
Ap�s conseguir essas informa��es na anota��o @Test acessamos a url atrav�s do driver.get(url), que declaramos l� em cima apontando a url que precisamos,
Usando a findElements, tanto para username, quanto para o password e para o bot�o de login, ficaria mais ou menos assim

driver.findElement(By.id("user-name")).sendKeys("standard_user");
driver.findElement(By.id("password")).sendKeys("secret_sauce");
driver.findElement(By.id("login-button")).click();

e no @ after, apontamos apenas para finalizar, exemplo �driver.quit� 
e em seguida testamos.. Vamos em Run e esperamos, vai retornar essa mensagem 

Starting ChromeDriver 91.0.4472.101 (af52a90bf87030dd1523486a1cd3ae25c5d76c9b-refs/branch-heads/4472@{#1462}) on port 8943
Only local connections are allowed.
Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
ChromeDriver was started successfully

E em seguida o chrome abre com o site. Acessa o login com o usu�rio e senha que colocamos.
E assim o teste de login est� conclu�do com sucesso.

