## workshop-springboot3-jpa

-----

# Verificação Estática

**AtLeastOneConstructor**

- A classe OrderItemPK deve ter pelo menos un construtor criado dentro dele

-----

# Testes Unitários

-----

### Classe: **CategoryTest**

### Teste: `testGetSetId`

### Objetivo

Verificar se o método `setId` da classe `Category` configura corretamente o identificador (`id`) da categoria.

### Plano de Teste

1.  **Configuração Inicial**
    -   Criar uma instância da classe `Category`.
2.  **Execução do Teste**
    -   Chamar o método `setId` com o valor `1L`.
3.  **Verificação da Saída Esperada**
    -   Verificar se o valor retornado pelo método `getId` é igual a `1L`.

### Resultado Esperado

O método `setId` deve configurar corretamente o identificador da categoria, e o método `getId` deve retornar o valor configurado.

----------

### Teste: `testGetSetName`

### Objetivo

Verificar se o método `setName` da classe `Category` configura corretamente o nome da categoria.

### Plano de Teste

1.  **Configuração Inicial**
    -   Criar uma instância da classe `Category`.
2.  **Execução do Teste**
    -   Chamar o método `setName` com o valor "Category Name".
3.  **Verificação da Saída Esperada**
    -   Verificar se o valor retornado pelo método `getName` é igual a "Category Name".

### Resultado Esperado

O método `setName` deve configurar corretamente o nome da categoria, e o método `getName` deve retornar o valor configurado.

----------

### Teste: `testGetSetProducts`

### Objetivo

Verificar se o método `setProducts` da classe `Category` configura corretamente a lista de produtos associada à categoria.

### Plano de Teste

1.  **Configuração Inicial**
    -   Criar uma instância da classe `Category`.
    -   Criar uma lista de produtos mockados (`product1` e `product2`).
2.  **Execução do Teste**
    -   Chamar o método `setProducts` com a lista de produtos.
3.  **Verificação da Saída Esperada**
    -   Verificar se a lista de produtos retornada pelo método `getProducts` é igual à lista de produtos configurada.

### Resultado Esperado

O método `setProducts` deve configurar corretamente a lista de produtos associada à categoria, e o método `getProducts` deve retornar a lista configurada.

----------

### Classe: **OrderItemPKTest**

### Teste: `testGetSetOrder`

### Objetivo

Verificar se o método `setOrder` da classe `OrderItemPK` configura corretamente o pedido associado.

### Plano de Teste

1.  **Configuração Inicial**
    -   Criar uma instância da classe `OrderItemPK`.
    -   Criar um pedido mockado (`order`).
2.  **Execução do Teste**
    -   Chamar o método `setOrder` com o pedido criado.
3.  **Verificação da Saída Esperada**
    -   Verificar se o pedido retornado pelo método `getOrder` é igual ao pedido configurado.

### Resultado Esperado

O método `setOrder` deve configurar corretamente o pedido associado à chave composta, e o método `getOrder` deve retornar o pedido configurado.

----------

### Teste: `testGetSetProduct`

### Objetivo

Verificar se o método `setProduct` da classe `OrderItemPK` configura corretamente o produto associado.

### Plano de Teste

1.  **Configuração Inicial**
    -   Criar uma instância da classe `OrderItemPK`.
    -   Criar um produto mockado (`product`).
2.  **Execução do Teste**
    -   Chamar o método `setProduct` com o produto criado.
3.  **Verificação da Saída Esperada**
    -   Verificar se o produto retornado pelo método `getProduct` é igual ao produto configurado.

### Resultado Esperado

O método `setProduct` deve configurar corretamente o produto associado à chave composta, e o método `getProduct` deve retornar o produto configurado.

--------

### Classe: **OrderItemTest**


### Teste: `testGetSetOrder`

### Objetivo

Verificar se o método `setOrder` da classe `OrderItem` configura corretamente o pedido associado.

### Plano de Teste

1.  **Configuração Inicial**
    -   Criar uma instância da classe `OrderItem`.
    -   Criar um pedido (`order`).
2.  **Execução do Teste**
    -   Chamar o método `setOrder` com o pedido criado.
3.  **Verificação da Saída Esperada**
    -   Verificar se o pedido retornado pelo método `getOrder` é igual ao pedido configurado.

### Resultado Esperado

O método `setOrder` deve configurar corretamente o pedido associado ao item do pedido, e o método `getOrder` deve retornar o pedido configurado.

----------

### Teste: `testGetSetProduct`

### Objetivo

Verificar se o método `setProduct` da classe `OrderItem` configura corretamente o produto associado.

### Plano de Teste

1.  **Configuração Inicial**
    -   Criar uma instância da classe `OrderItem`.
    -   Criar um produto (`product`).
2.  **Execução do Teste**
    -   Chamar o método `setProduct` com o produto criado.
3.  **Verificação da Saída Esperada**
    -   Verificar se o produto retornado pelo método `getProduct` é igual ao produto configurado.

### Resultado Esperado

O método `setProduct` deve configurar corretamente o produto associado ao item do pedido, e o método `getProduct` deve retornar o produto configurado.

----------

### Teste: `testGetSetQuantity`

### Objetivo

Verificar se o método `setQuantity` da classe `OrderItem` configura corretamente a quantidade.

### Plano de Teste

1.  **Configuração Inicial**
    -   Criar uma instância da classe `OrderItem`.
2.  **Execução do Teste**
    -   Chamar o método `setQuantity` com o valor `3`.
3.  **Verificação da Saída Esperada**
    -   Verificar se o valor retornado pelo método `getQuantity` é igual a `3`.

### Resultado Esperado

O método `setQuantity` deve configurar corretamente a quantidade do item do pedido, e o método `getQuantity` deve retornar o valor configurado.

----------

### Teste: `testGetSetPrice`

### Objetivo

Verificar se o método `setPrice` da classe `OrderItem` configura corretamente o preço unitário.

### Plano de Teste

1.  **Configuração Inicial**
    -   Criar uma instância da classe `OrderItem`.
2.  **Execução do Teste**
    -   Chamar o método `setPrice` com o valor `15.99`.
3.  **Verificação da Saída Esperada**
    -   Verificar se o valor retornado pelo método `getPrice` é igual a `15.99`.

### Resultado Esperado

O método `setPrice` deve configurar corretamente o preço unitário do item do pedido, e o método `getPrice` deve retornar o valor configurado.

----------

### Teste: `testGetSubtotal`

### Objetivo

Verificar se o método `getSubtotal` da classe `OrderItem` calcula corretamente o subtotal.

### Plano de Teste

1.  **Configuração Inicial**
    -   Criar uma instância da classe `OrderItem`.
    -   Configurar a quantidade para `2`.
    -   Configurar o preço unitário para `10.50`.
2.  **Execução do Teste**
    -   Chamar o método `getSubtotal`.
3.  **Verificação da Saída Esperada**
    -   Verificar se o valor retornado é igual a `21.00`.

### Resultado Esperado

O método `getSubtotal` deve calcular corretamente o subtotal com base na quantidade e no preço unitário configurados. O valor retornado deve ser igual a `21.00`.

----------

### Classe: **OrderTest**


### Teste: `testGetSetId`

### Objetivo

Verificar se o método `setId` da classe `Order` configura corretamente o ID do pedido.

### Plano de Teste

1.  **Configuração Inicial**
    -   Criar uma instância da classe `Order`.
2.  **Execução do Teste**
    -   Chamar o método `setId` com o valor `1L`.
3.  **Verificação da Saída Esperada**
    -   Verificar se o valor retornado pelo método `getId` é igual a `1L`.

### Resultado Esperado

O método `setId` deve configurar corretamente o ID do pedido, e o método `getId` deve retornar o valor configurado.

----------

### Teste: `testGetSetMoment`

### Objetivo

Verificar se o método `setMoment` da classe `Order` configura corretamente o momento do pedido.

### Plano de Teste

1.  **Configuração Inicial**
    -   Criar uma instância da classe `Order`.
    -   Criar um objeto `Instant` representando o momento atual (`moment`).
2.  **Execução do Teste**
    -   Chamar o método `setMoment` com o objeto `Instant` criado.
3.  **Verificação da Saída Esperada**
    -   Verificar se o valor retornado pelo método `getMoment` é igual ao objeto `Instant` configurado.

### Resultado Esperado

O método `setMoment` deve configurar corretamente o momento do pedido, e o método `getMoment` deve retornar o valor configurado.

----------

### Teste: `testGetSetOrderStatus`

### Objetivo

Verificar se o método `setOrderStatus` da classe `Order` configura corretamente o status do pedido.

### Plano de Teste

1.  **Configuração Inicial**
    -   Criar uma instância da classe `Order`.
    -   Criar um objeto `OrderStatus` representando o status `SHIPPED`.
2.  **Execução do Teste**
    -   Chamar o método `setOrderStatus` com o objeto `OrderStatus` criado.
3.  **Verificação da Saída Esperada**
    -   Verificar se o valor retornado pelo método `getOrderStatus` é igual ao objeto `OrderStatus` configurado.

### Resultado Esperado

O método `setOrderStatus` deve configurar corretamente o status do pedido, e o método `getOrderStatus` deve retornar o valor configurado.

----------

### Teste: `testGetSetClient`

### Objetivo

Verificar se o método `setClient` da classe `Order` configura corretamente o cliente associado ao pedido.

### Plano de Teste

1.  **Configuração Inicial**
    -   Criar uma instância da classe `Order`.
    -   Criar um cliente (`client`) simulado usando o `mock` do `User`.
2.  **Execução do Teste**
    -   Chamar o método `setClient` com o cliente criado.
3.  **Verificação da Saída Esperada**
    -   Verificar se o cliente retornado pelo método `getClient` é igual ao cliente configurado.

### Resultado Esperado

O método `setClient` deve configurar corretamente o cliente associado ao pedido, e o método `getClient` deve retornar o cliente configurado.

----------

### Teste: `testGetSetPayment`

### Objetivo

Verificar se o método `setPayment` da classe `Order` configura corretamente o pagamento associado ao pedido.

### Plano de Teste

1.  **Configuração Inicial**
    -   Criar uma instância da classe `Order`.
    -   Criar um pagamento (`payment`) simulado usando o `mock` do `Payment`.
2.  **Execução do Teste**
    -   Chamar o método `setPayment` com o pagamento criado.
3.  **Verificação da Saída Esperada**
    -   Verificar se o pagamento retornado pelo método `getPayment` é igual ao pagamento configurado.

### Resultado Esperado

O método `setPayment` deve configurar corretamente o pagamento associado ao pedido, e o método `getPayment` deve retornar o pagamento configurado.

----------

### Teste: `testGetSetItems`

### Objetivo

Verificar se o método `setItems` da classe `Order` configura corretamente os itens associados ao pedido.

### Plano de Teste

1.  **Configuração Inicial**
    -   Criar uma instância da classe `Order`.
    -   Criar dois itens (`item1` e `item2`) simulados usando o `mock` do `OrderItem`.
    -   Criar um conjunto de itens (`items`) contendo os itens criados.
2.  **Execução do Teste**
    -   Chamar o método `setItems` com o conjunto de itens criado.
3.  **Verificação da Saída Esperada**
    -   Verificar se o conjunto de itens retornado pelo método `getItems` é igual ao conjunto de itens configurado.

### Resultado Esperado

O método `setItems` deve configurar corretamente os itens associados ao pedido, e o método `getItems` deve retornar o conjunto de itens configurado.

----------

### Teste: `testGetTotal`

### Objetivo

Verificar se o método `getTotal` da classe `Order` calcula corretamente o valor total do pedido.

### Plano de Teste

1.  **Configuração Inicial**
    -   Criar uma instância da classe `Order`.
    -   Criar dois itens (`item1` e `item2`) simulados usando o `mock` do `OrderItem`.
    -   Configurar os valores de subtotal para `25.0` e `35.0` para os itens, respectivamente.
2.  **Execução do Teste**
    -   Chamar o método `getTotal`.
3.  **Verificação da Saída Esperada**
    -   Verificar se o valor retornado é igual a `60.0`.

### Resultado Esperado

O método `getTotal` deve calcular corretamente o valor total do pedido com base nos subtotais dos itens. O valor retornado deve ser igual a `60.0`.

---------

### Classe: **PaymentTest**


###  Teste: `testGetSetId`

### Objetivo

Verificar se o método `setId` da classe `Payment` configura corretamente o ID do pagamento.

### Plano de Teste

1.  **Configuração Inicial**
    -   Criar uma instância da classe `Payment`.
2.  **Execução do Teste**
    -   Chamar o método `setId` com o valor `1L`.
3.  **Verificação da Saída Esperada**
    -   Verificar se o valor retornado pelo método `getId` é igual a `1L`.

### Resultado Esperado

O método `setId` deve configurar corretamente o ID do pagamento, e o método `getId` deve retornar o valor configurado.

----------

### Teste: `testGetSetMoment`

### Objetivo

Verificar se o método `setMoment` da classe `Payment` configura corretamente o momento do pagamento.

### Plano de Teste

1.  **Configuração Inicial**
    -   Criar uma instância da classe `Payment`.
    -   Criar um objeto `Instant` representando o momento atual (`moment`).
2.  **Execução do Teste**
    -   Chamar o método `setMoment` com o objeto `Instant` criado.
3.  **Verificação da Saída Esperada**
    -   Verificar se o valor retornado pelo método `getMoment` é igual ao objeto `Instant` configurado.

### Resultado Esperado

O método `setMoment` deve configurar corretamente o momento do pagamento, e o método `getMoment` deve retornar o valor configurado.

----------

### Teste: `testGetSetOrder`

### Objetivo

Verificar se o método `setOrder` da classe `Payment` configura corretamente o pedido associado ao pagamento.

### Plano de Teste

1.  **Configuração Inicial**
    -   Criar uma instância da classe `Payment`.
    -   Criar um pedido (`order`) simulado usando o `mock` do `Order`.
2.  **Execução do Teste**
    -   Chamar o método `setOrder` com o pedido criado.
3.  **Verificação da Saída Esperada**
    -   Verificar se o pedido retornado pelo método `getOrder` é igual ao pedido configurado.

### Resultado Esperado

O método `setOrder` deve configurar corretamente o pedido associado ao pagamento, e o método `getOrder` deve retornar o pedido configurado.

----------

### Classe: **ProductTest**



###   Teste: `testGetSetId`

### Objetivo

Verificar se o método `setId` da classe `Product` configura corretamente o ID do produto.

### Plano de Teste

1.  **Configuração Inicial**
    -   Criar uma instância da classe `Product`.
2.  **Execução do Teste**
    -   Chamar o método `setId` com o valor `1L`.
3.  **Verificação da Saída Esperada**
    -   Verificar se o valor retornado pelo método `getId` é igual a `1L`.

### Resultado Esperado

O método `setId` deve configurar corretamente o ID do produto, e o método `getId` deve retornar o valor configurado.

----------

### Teste: `testGetSetName`

### Objetivo

Verificar se o método `setName` da classe `Product` configura corretamente o nome do produto.

### Plano de Teste

1.  **Configuração Inicial**
    -   Criar uma instância da classe `Product`.
2.  **Execução do Teste**
    -   Chamar o método `setName` com o valor `"Product Name"`.
3.  **Verificação da Saída Esperada**
    -   Verificar se o valor retornado pelo método `getName` é igual a `"Product Name"`.

### Resultado Esperado

O método `setName` deve configurar corretamente o nome do produto, e o método `getName` deve retornar o valor configurado.

----------

### Teste: `testGetSetDescription`

### Objetivo

Verificar se o método `setDescription` da classe `Product` configura corretamente a descrição do produto.

### Plano de Teste

1.  **Configuração Inicial**
    -   Criar uma instância da classe `Product`.
2.  **Execução do Teste**
    -   Chamar o método `setDescription` com o valor `"Product Description"`.
3.  **Verificação da Saída Esperada**
    -   Verificar se o valor retornado pelo método `getDescription` é igual a `"Product Description"`.

### Resultado Esperado

O método `setDescription` deve configurar corretamente a descrição do produto, e o método `getDescription` deve retornar o valor configurado.

----------

### Teste: `testGetSetPrice`

### Objetivo

Verificar se o método `setPrice` da classe `Product` configura corretamente o preço do produto.

### Plano de Teste

1.  **Configuração Inicial**
    -   Criar uma instância da classe `Product`.
2.  **Execução do Teste**
    -   Chamar o método `setPrice` com o valor `19.99`.
3.  **Verificação da Saída Esperada**
    -   Verificar se o valor retornado pelo método `getPrice` é igual a `19.99`.

### Resultado Esperado

O método `setPrice` deve configurar corretamente o preço do produto, e o método `getPrice` deve retornar o valor configurado.

----------

### Teste: `testGetSetImgUrl`

### Objetivo

Verificar se o método `setImgUrl` da classe `Product` configura corretamente a URL da imagem do produto.

### Plano de Teste

1.  **Configuração Inicial**
    -   Criar uma instância da classe `Product`.
2.  **Execução do Teste**
    -   Chamar o método `setImgUrl` com o valor `"http://example.com/image.jpg"`.
3.  **Verificação da Saída Esperada**
    -   Verificar se o valor retornado pelo método `getImgUrl` é igual a `"http://example.com/image.jpg"`.

### Resultado Esperado

O método `setImgUrl` deve configurar corretamente a URL da imagem do produto, e o método `getImgUrl` deve retornar o valor configurado.

----------

### Teste: `testGetSetCategories`

### Objetivo

Verificar se o método `setCategories` da classe `Product` configura corretamente as categorias do produto.

### Plano de Teste

1.  **Configuração Inicial**
    -   Criar uma instância da classe `Product`.
    -   Criar um conjunto (`categories`) simulado de categorias usando `mock` do `Category`.
2.  **Execução do Teste**
    -   Chamar o método `setCategories` com o conjunto de categorias criado.
3.  **Verificação da Saída Esperada**
    -   Verificar se o conjunto retornado pelo método `getCategories` é igual ao conjunto de categorias configurado.

### Resultado Esperado

O método `setCategories` deve configurar corretamente as categorias do produto, e o método `getCategories` deve retornar o conjunto configurado.

----------

### Teste: `testGetOrders`

### Objetivo

Verificar se o método `getOrders` da classe `Product` retorna corretamente a lista de pedidos associados aos itens do produto.

### Plano de Teste

1.  **Configuração Inicial**
    -   Criar uma instância da classe `Product`.
    -   Criar dois itens de pedido (`orderItem1` e `orderItem2`) simulados usando `mock` do `OrderItem`.
    -   Criar dois pedidos (`order1` e `order2`) simulados usando `mock` do `Order`.
2.  **Execução do Teste**
    -   Configurar os itens de pedido para retornar os pedidos criados quando o método `getOrder` é chamado.
    -   Chamar o método `setItems` com o conjunto de itens de pedido criado.
3.  **Verificação da Saída Esperada**
    -   Verificar se a lista de pedidos retornada pelo método `getOrders` contém os pedidos configurados.

### Resultado Esperado

O método `getOrders` deve retornar corretamente a lista de pedidos associados aos itens do produto.

-------

### Classe: **UserTest**


###   Teste: `testGetSetId`

### Objetivo

Verificar se o método `setId` da classe `User` configura corretamente o ID do usuário.

### Plano de Teste

1.  **Configuração Inicial**
    -   Criar uma instância da classe `User`.
2.  **Execução do Teste**
    -   Chamar o método `setId` com o valor `1L`.
3.  **Verificação da Saída Esperada**
    -   Verificar se o valor retornado pelo método `getId` é igual a `1L`.

### Resultado Esperado

O método `setId` deve configurar corretamente o ID do usuário, e o método `getId` deve retornar o valor configurado.

----------

### Teste: `testGetSetName`

### Objetivo

Verificar se o método `setName` da classe `User` configura corretamente o nome do usuário.

### Plano de Teste

1.  **Configuração Inicial**
    -   Criar uma instância da classe `User`.
2.  **Execução do Teste**
    -   Chamar o método `setName` com o valor `"John Doe"`.
3.  **Verificação da Saída Esperada**
    -   Verificar se o valor retornado pelo método `getName` é igual a `"John Doe"`.

### Resultado Esperado

O método `setName` deve configurar corretamente o nome do usuário, e o método `getName` deve retornar o valor configurado.

----------

### Teste: `testGetSetEmail`

### Objetivo

Verificar se o método `setEmail` da classe `User` configura corretamente o e-mail do usuário.

### Plano de Teste

1.  **Configuração Inicial**
    -   Criar uma instância da classe `User`.
2.  **Execução do Teste**
    -   Chamar o método `setEmail` com o valor `"john.doe@example.com"`.
3.  **Verificação da Saída Esperada**
    -   Verificar se o valor retornado pelo método `getEmail` é igual a `"john.doe@example.com"`.

### Resultado Esperado

O método `setEmail` deve configurar corretamente o e-mail do usuário, e o método `getEmail` deve retornar o valor configurado.

----------

### Teste: `testGetSetPhone`

### Objetivo

Verificar se o método `setPhone` da classe `User` configura corretamente o telefone do usuário.

### Plano de Teste

1.  **Configuração Inicial**
    -   Criar uma instância da classe `User`.
2.  **Execução do Teste**
    -   Chamar o método `setPhone` com o valor `"123-456-7890"`.
3.  **Verificação da Saída Esperada**
    -   Verificar se o valor retornado pelo método `getPhone` é igual a `"123-456-7890"`.

### Resultado Esperado

O método `setPhone` deve configurar corretamente o telefone do usuário, e o método `getPhone` deve retornar o valor configurado.

----------

### Teste: `testGetSetPassword`

### Objetivo

Verificar se o método `setPassword` da classe `User` configura corretamente a senha do usuário.

### Plano de Teste

1.  **Configuração Inicial**
    -   Criar uma instância da classe `User`.
2.  **Execução do Teste**
    -   Chamar o método `setPassword` com o valor `"password123"`.
3.  **Verificação da Saída Esperada**
    -   Verificar se o valor retornado pelo método `getPassword` é igual a `"password123"`.

### Resultado Esperado

O método `setPassword` deve configurar corretamente a senha do usuário, e o método `getPassword` deve retornar o valor configurado.

----------

### Teste: `testGetSetOrders`

### Objetivo

Verificar se o método `setOrders` da classe `User` configura corretamente a lista de pedidos do usuário.

### Plano de Teste

1.  **Configuração Inicial**
    -   Criar uma instância da classe `User`.
    -   Criar dois pedidos (`order1` e `order2`) simulados usando `mock` do `Order`.
    -   Criar uma lista (`orders`) simulada de pedidos contendo `order1` e `order2`.
2.  **Execução do Teste**
    -   Chamar o método `setOrders` com a lista de pedidos criada.
3.  **Verificação da Saída Esperada**
    -   Verificar se a lista de pedidos retornada pelo método `getOrders` é igual à lista de pedidos configurada.

### Resultado Esperado

O método `setOrders` deve configurar corretamente a lista de pedidos do usuário, e o método `getOrders` deve retornar a lista configurada.

----------

### Classe: **CategoryResourceTest**

### Teste: `testFindAll`

### Objetivo

Verificar se o método `findAll` da classe `CategoryResource` retorna corretamente a lista de categorias esperada.

### Plano de Teste

1.  **Configuração Inicial**

    -   Criar uma instância da classe `CategoryService` utilizando um mock.
    -   Definir uma lista de categorias esperadas.

2.  **Execução do Teste**

    -   Criar uma instância da classe `CategoryResource` com o mock injetado.
    -   Chamar o método `findAll` da instância de `CategoryResource`.

3.  **Verificação da Saída Esperada**

    -   Comparar a lista retornada pelo método `findAll` com a lista de categorias esperada.


    assertEquals(expectedCategories, responseEntity.getBody());

### Resultado Esperado

O método `findAll` deve retornar a lista de categorias configurada no mock, e a comparação deve ser bem-sucedida.

----------

### Teste: `testFindById`

### Objetivo

Verificar se o método `findById` da classe `CategoryResource` retorna corretamente a categoria esperada.

### Plano de Teste

1.  **Configuração Inicial**

    -   Criar uma instância da classe `CategoryService` utilizando um mock.
    -   Definir um ID de categoria e uma categoria esperada.

2.  **Execução do Teste**

    -   Criar uma instância da classe `CategoryResource` com o mock injetado.

3.  **Verificação da Saída Esperada**

    -   Comparar a categoria retornada pelo método `findById` com a categoria esperada.


    assertEquals(expectedCategory, responseEntity.getBody());

### Resultado Esperado

O método `findById` deve retornar a categoria configurada no mock, e a comparação deve ser bem-sucedida.

-------

### Classe: **OrderResourceTest**


###   Teste: `testFindAll`

#### Objetivo

Verificar se o método `findAll` da classe `OrderResource` retorna corretamente a lista de pedidos esperada.

#### Plano de Teste

1.  **Configuração Inicial**

    -   Criar uma instância da classe `OrderService` utilizando um mock.
    -   Definir uma lista de pedidos esperada.

2.  **Execução do Teste**

    -   Criar uma instância da classe `OrderResource` com o mock injetado.
    -   Chamar o método `findAll` da instância de `OrderResource`.

3.  **Verificação da Saída Esperada**

    -   Verificar se o status code retornado é `HttpStatus.OK`.


    assertEquals(HttpStatus.OK, response.getStatusCode());

#### Resultado Esperado

O método `findAll` deve retornar a lista de pedidos configurada no mock, o status code deve ser `HttpStatus.OK`, e o método `findAll` do `orderService` deve ser chamado exatamente uma vez.

----------

### Teste: `testFindById`

#### Objetivo

Verificar se o método `findById` da classe `OrderResource` retorna corretamente o pedido esperado.

#### Plano de Teste

1.  **Configuração Inicial**

    -   Criar uma instância da classe `OrderService` utilizando um mock.
    -   Definir um ID de pedido e um pedido esperado.

2.  **Execução do Teste**

    -   Criar uma instância da classe `OrderResource` com o mock injetado.
    -   Chamar o método `findById` da instância de `OrderResource`.

3.  **Verificação da Saída Esperada**

    -   Verificar se o status code retornado é `HttpStatus.OK`.
    -   Comparar o pedido retornado pelo método `findById` com o pedido esperado.
    -   Verificar se o método `findById` do `orderService` foi chamado exatamente uma vez.


    verify(orderService, times(1)).findById(orderId);


#### Resultado Esperado

O método `findById` deve retornar o pedido configurado no mock, o status code deve ser `HttpStatus.OK`, e o método `findById` do `orderService` deve ser chamado exatamente uma vez.

--------

### Classe: **ProductResourceTest**


### Teste: `testFindAll`

#### Objetivo

Verificar se o método `findAll` da classe `ProductResource` retorna corretamente a lista de produtos esperada.

#### Plano de Teste

1.  **Configuração Inicial**

    -   Criar uma instância da classe `ProductService` utilizando um mock.
    -   Definir uma lista de produtos esperada.

2.  **Execução do Teste**

    -   Criar uma instância da classe `ProductResource` com o mock injetado.
    -   Chamar o método `findAll` da instância de `ProductResource`.

3.  **Verificação da Saída Esperada**

    -   Verificar se o status code retornado é `HttpStatus.OK`.
    -   Comparar a lista retornada pelo método `findAll` com a lista de produtos esperada.
   
   
    assertEquals(mockProductList, response.getBody());


#### Resultado Esperado

O método `findAll` deve retornar a lista de produtos configurada no mock, e o status code deve ser `HttpStatus.OK`.

----------

### Teste: `testFindById`

#### Objetivo

Verificar se o método `findById` da classe `ProductResource` retorna corretamente o produto esperado.

#### Plano de Teste

1.  **Configuração Inicial**

    -   Criar uma instância da classe `ProductService` utilizando um mock.
    -   Definir um ID de produto e um produto esperado.

2.  **Execução do Teste**

    -   Criar uma instância da classe `ProductResource` com o mock injetado.
    -   Chamar o método `findById` da instância de `ProductResource`.

3.  **Verificação da Saída Esperada**

    -   Verificar se o status code retornado é `HttpStatus.OK`.
    -   Comparar o produto retornado pelo método `findById` com o produto esperado.
   
   
    assertEquals(mockProduct, response.getBody());


#### Resultado Esperado

O método `findById` deve retornar o produto configurado no mock, e o status code deve ser `HttpStatus.OK`.

-------

### Classe: **UserResourceTest**


### Teste: `testFindAll`

#### Objetivo

Verificar se o método `findAll` da classe `UserResource` retorna corretamente a lista de usuários esperada.

#### Plano de Teste

1.  **Configuração Inicial**

    -   Criar uma lista de usuários.
    -   Criar uma instância da classe `UserService` utilizando um mock.

2.  **Execução do Teste**

    -   Criar uma instância da classe `UserResource` com o mock injetado.
    -   Chamar o método `findAll` da instância de `UserResource`.

3.  **Verificação da Saída Esperada**

    -   Verificar se o status code retornado é `HttpStatus.OK`.
    -   Comparar a lista retornada pelo método `findAll` com a lista de usuários esperada.


    assertEquals(users, response.getBody());


#### Resultado Esperado

O método `findAll` deve retornar a lista de usuários configurada, e o status code deve ser `HttpStatus.OK`.

----------

### Teste: `testFindById`

#### Objetivo

Verificar se o método `findById` da classe `UserResource` retorna corretamente o usuário esperado.

#### Plano de Teste

1.  **Configuração Inicial**

    -   Definir um ID de usuário e um usuário.
    -   Criar uma instância da classe `UserService` utilizando um mock.

2.  **Execução do Teste**

    -   Criar uma instância da classe `UserResource` com o mock injetado.
    -   Chamar o método `findById` da instância de `UserResource`.

3.  **Verificação da Saída Esperada**

    -   Verificar se o status code retornado é `HttpStatus.OK`.
    -   Comparar o usuário retornado pelo método `findById` com o usuário esperado.

    assertEquals(user, response.getBody());


#### Resultado Esperado

O método `findById` deve retornar o usuário configurado no mock, e o status code deve ser `HttpStatus.OK`.

----------

### Teste: `testDelete`

#### Objetivo

Verificar se o método `delete` da classe `UserResource` retorna corretamente o status code `HttpStatus.NO_CONTENT` e chama o método `delete` do `UserService` uma vez.

#### Plano de Teste

1.  **Configuração Inicial**

    -   Definir um ID de usuário.
    -   Criar uma instância da classe `UserService` utilizando um mock.

2.  **Execução do Teste**

    -   Criar uma instância da classe `UserResource` com o mock injetado.
    -   Chamar o método `delete` da instância de `UserResource`.

3.  **Verificação da Saída Esperada**

    -   Verificar se o status code retornado é `HttpStatus.NO_CONTENT`.
    -   Verificar se o método `delete` do `userService` foi chamado exatamente uma vez.


    verify(userService, times(1)).delete(userId); 


#### Resultado Esperado

O método `delete` deve retornar o status code `HttpStatus.NO_CONTENT` e o método `delete` do `userService` deve ser chamado exatamente uma vez.

----------

### Teste: `testUpdate`

#### Objetivo

Verificar se o método `update` da classe `UserResource` retorna corretamente o usuário atualizado e o status code `HttpStatus.OK`.

#### Plano de Teste

1.  **Configuração Inicial**

    -   Definir um ID de usuário, um usuário atualizado e um usuário configurado no mock.
    -   Criar uma instância da classe `UserService` utilizando um mock.

2.  **Execução do Teste**

    -   Criar uma instância da classe `UserResource` com o mock injetado.
    -   Chamar o método `update` da instância de `UserResource`.

3.  **Verificação da Saída Esperada**

    -   Verificar se o status code retornado é `HttpStatus.OK`.
    -   Comparar o usuário retornado pelo método `update` com o usuário configurado no mock.


    assertEquals(userServiceResponse, response.getBody());


#### Resultado Esperado

O método `update` deve retornar o usuário atualizado configurado no mock e o status code `HttpStatus.OK`.


-------

# Autor

#### Gilberto Fredes

https://github.com/Gilberto491
