SPRINT 1 :
1)Create repository and structure //1, 2 , 3
2)Create layers(service, controller, repository, entity, dto) //1,2,3
3)Add dependency jpa , postgresql, connect in properties // 1, 2, 3
4)Create entity : User, Product, Storage, Category // 1, 2, 3
5)Dto, repository, service, controller - create, getAll, getById
6)schema.sql, data.sql


7)Handle exception(CommonExceptionHandler)
8)Validation - create
9)Code format
10)Add swagger
11)Unit test(create, getAll, getById) for service layer
----------------------------------------------------------------
1,2,3 - TL
m1 - User(entity,dto, repository, service, controller)
m2 - Product(entity,dto, repository, service, controller)
m3 - Category(entity,dto, repository, service, controller)
m4 - Storage(entity,dto, repository, service, controller)

m1 - 11 - Product
m2 - Category
m3 - Storage
m4 - User


----------------------------------------------------------------
SPRINT 2 :
1) Product - edit, delete
2) Category - edit, delete
3) User - edit, delete
4) Favorites(entity,dto, repository, service, controller) - getAll, add
5) Filter - GET /products (getAll) - category, minPrice, maxPrice, discount, sort
6) Relationship :@One-To-Many
7) Unit test(create, getAll, getById) for service layer
8) Add LB


SPRINT 3 :
1) Cart(id, user_id)
2) CartItem : (id, product_id, quantity, cart_id)
3) Order(Created, Paid, Cancelled, Completed)
4) OrderItems

User -> Cart -> CartItem
User -> Order-> OrderItems

Product -> CartItem
Create order  -> Order - > cartItem -> OrderItems

5)Payment(user_id, amount, date, order_id)
