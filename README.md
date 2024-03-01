# Microserviço de notificação
O MS Notification é responsável por receber e armazenar notificações de alterações de cadastro de usuário e eventos de login por meio de mensagens recebidas.
## Tecnologias utilizadas
- Java JDK 17

### Dependências
- Spring Boot 3
- Spring Web
- Spring Validation
- Spring DevTools
- ModelMapper
- Lombok
- RabbitMQ
- Banco de dados MongoDB

Exemplo de Payload
json
```json
{
  "email": "maria@email.com",
  "event": "LOGIN",
  "date": "ISO-8601 DATE"
}
````
## Funcionalidade
Após receber o payload do MS User por mensageria via RabbitMQ, o MS Notification armazena esse JSON exclusivamente em seu próprio banco de dados MongoDB.
## Eventos Possíveis

- **CREATE:** Criação de um novo usuário.
- **UPDATE:** Atualização das informações de um usuário (exceto senha).
- **LOGIN:** Login ou autenticação de um usuário.
- **UPDATE_PASSWORD:** Atualização da senha de um usuário.

Esses são os eventos possíveis que podem ser registrados pelo microserviço de notificação. Cada evento representa uma ação específica realizada pelos usuários e é armazenado para fins de registro e auditoria.
