1)Create repository and structure
2)Create layers(service, controller, repository, entity, dto)
3)Add dependency jpa , postgresql, connect in properties
4)Create entity : User, Product, Storage, Category
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
