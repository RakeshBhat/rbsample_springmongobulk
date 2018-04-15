#Description

This project covers:
- Inserting bulk documents into mongodb collection
= using spring-data repository saveAll method.

#Services
- POST - http://localhost:8090/product
- GET -  http://localhost:8090/product/123456781

#Mongo Client commands

```sh
> mongo
MongoDB shell version v3.6.3
> show dbs
admin   0.000GB
config  0.000GB
local   0.000GB
> use rbproductdb
switched to db rbproductdb
> show dbs
admin        0.000GB
config       0.000GB
local        0.000GB
rbproductdb  0.000GB
> db
rbproductdb
> show collections
product
> db.product.find().pretty()
{
        "_id" : NumberLong(123456789),
        "name" : "books",
        "price" : 200,
        "category" : 1,
        "_class" : "com.rbsample.springmongobulk.document.Product"
}
{
        "_id" : NumberLong(123456780),
        "name" : "cups",
        "price" : 20,
        "category" : 4,
        "_class" : "com.rbsample.springmongobulk.document.Product"
}
{
        "_id" : NumberLong(123456781),
        "name" : "shoe",
        "price" : 300,
        "category" : 7,
        "_class" : "com.rbsample.springmongobulk.document.Product"
}
>

```

#Resources
- [mongodb](https://docs.mongodb.com/manual/core/bulk-write-operations/)
- [baeldung](http://www.baeldung.com/spring-data-mongodb-tutorial)
- [tutorialspoint](https://www.tutorialspoint.com/mongodb/index.htm)
- https://www.djamware.com/post/59b606e280aca768e4d2b13b/spring-boot-mvc-data-and-mongodb-crud-java-web-application
- https://docs.spring.io/spring-data/mongodb/docs/1.2.0.RELEASE/reference/html/mongo.repositories.html
- https://stackoverflow.com/questions/45672290/spring-data-mongodb-bulk-save-continue-on-error