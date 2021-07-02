Exemplos-selenium
Projeto contendo exemplos de uso do framework selenium para automatização de testes de Login.
É necessário ter instalado o Java jdk, qualquer IDEA, exemplo eclipse, Intellij etc..
e o chromedriver

Primeiro vamos criar um projeto do tipo Maven
Em seguida vai em pom.xml inclui a dependência do Junit e Selenium, podem ser encontradas no site mavenrepository,com
Após incluir as dependecias, vou no meu pacote java e vou criar uma nova classe. Em seguida vou começar criando as anotações @before @After e @test
Após a criação das anotações criaremos uma variável string para passar a URL, criamos também um objeto do selenium do tipo webDriver.
Na anotação @before vou passar a URL que quero acessar
em seguida e vamos passar o caminho do nosso chromedriver
vamos criar uma Instância do chromedriver e vamos também maximizar a tela
Antes de passar pra anotação teste, acesse a pagina no Google, vai nos campos e clique em inspecionar,  procure os nomes usados nos campos por exemplo “PASSWORD”, pois vamos precisar dessas anotações para apontar no código da anotação teste.
Após conseguir essas informações na anotação @Test acessamos a url através do driver.get(url), que declaramos lá em cima apontando a url que precisamos,
Usando a findElements, tanto para username, quanto para o password e para o botão de login, ficaria mais ou menos assim

driver.findElement(By.id("user-name")).sendKeys("standard_user");
driver.findElement(By.id("password")).sendKeys("secret_sauce");
driver.findElement(By.id("login-button")).click();

e no @ after, apontamos apenas para finalizar, exemplo “driver.quit” 
e em seguida testamos.. Vamos em Run e esperamos, vai retornar essa mensagem 

Starting ChromeDriver 91.0.4472.101 (af52a90bf87030dd1523486a1cd3ae25c5d76c9b-refs/branch-heads/4472@{#1462}) on port 8943
Only local connections are allowed.
Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
ChromeDriver was started successfully

E em seguida o chrome abre com o site. Acessa o login com o usuário e senha que colocamos.
E assim o teste de login está concluído com sucesso.

