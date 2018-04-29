#Description

This project covers:
- Inserting bulk documents into mongodb collection
= using spring-data repository saveAll method.
- Usage of MongoTemplate
- Usage of Mongo Query
- Usage of Query DSL
- Usage of Index's

#Services
- POST - http://localhost:8090/product
- GET -  http://localhost:8090/product/id/123456781
- GET -  http://localhost:8090/product/category/7
- GET -  http://localhost:8090/product/costly/100

#Mongo Server Commands

```sh
> mongod --config c:\mongodb\db\mongod.cfg
>

```
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

#Indexed Fields
##Text Index
-Command to start mongo in full text search
mongod --setParameter textSearchEnabled=true


#Errors
- Searching with TextIndex
= Invalid parameter index! You seem to have declare too little query method parameters

#Resources
- [mongodb](https://docs.mongodb.com/manual/core/bulk-write-operations/)
- [baeldung](http://www.baeldung.com/spring-data-mongodb-tutorial)
- [baeldung](http://www.baeldung.com/queries-in-spring-data-mongodb)
- [tutorialspoint](https://www.tutorialspoint.com/mongodb/index.htm)
- https://www.djamware.com/post/59b606e280aca768e4d2b13b/spring-boot-mvc-data-and-mongodb-crud-java-web-application
- https://docs.spring.io/spring-data/mongodb/docs/1.2.0.RELEASE/reference/html/mongo.repositories.html
- https://stackoverflow.com/questions/45672290/spring-data-mongodb-bulk-save-continue-on-error
- Index
= http://www.baeldung.com/spring-data-mongodb-index-annotations-converter
= https://docs.spring.io/spring-data/mongodb/docs/current/api/org/springframework/data/mongodb/core/index/Indexed.html
= https://docs.mongodb.com/manual/core/index-text/