# Todo Application

Este é um projeto simples de gerenciamento de tarefas desenvolvido com **Java**, **Spring Boot**, **Mysql** e **Thymeleaf**. Ele permite criar, visualizar, editar, alternar o status (completo/incompleto) e excluir tarefas.

## Funcionalidades

- **Adicionar Tarefa**: Insira o título de uma nova tarefa e adicione-a à lista.
- **Listar Tarefas**: Visualize todas as tarefas cadastradas.
- **Editar Tarefa**: Altere o título de uma tarefa existente.
- **Alternar Status**: Marque uma tarefa como completa ou incompleta.
- **Excluir Tarefa**: Remova uma tarefa da lista.

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3**
- **Thymeleaf** (para renderização de templates HTML)
- **H2 Database** (banco de dados em memória)
- **Bootstrap 5** (para estilização)

## Como Executar o Projeto

1. **Clone o repositório**:
   ```bash
   git clone <URL_DO_REPOSITORIO>
   cd todo
2. **Configure o ambiente**:
   Certifique-se de que você possui o JDK 17 ou superior instalado.
3. **Execute a aplicação**:
   ```bash
   ./mvnw spring-boot:run
### Estrutura do Projeto
**src/main/java**
- **Models**: Contém a classe **Task**, que representa a entidade de tarefa.
- **repository**: Visualize todas as tarefas cadastradas.
- **services**: Altere o título de uma tarefa existente.
- **controller**: Marque uma tarefa como completa ou incompleta.
- **Excluir Tarefa**: Remova uma tarefa da lista.

**src/main/resources/templates**
- **Mtasks.html**: Página principal para listar e gerenciar tarefas.
