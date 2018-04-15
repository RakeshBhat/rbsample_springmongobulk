//package com.rbsample.springmongobulk.config;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Profile;
//import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
//import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
//
//import com.mongodb.MongoClient;
//import com.mongodb.MongoClientURI;
//
//@Configuration
//@EnableMongoRepositories(basePackages = "com.rbsample.springmongobulk")
//@Profile("default")
//public class MongoConfig extends AbstractMongoConfiguration {
//
//    @Value("${mongo.db.uri}")
//    private String mongoDbUri;
//    @Value("${mongo.db.database}")
//    private String mongoDbDatabaseName;
//
//    @Override
//    protected String getDatabaseName() {
//        return mongoDbDatabaseName;
//    }
//
//    @Override
//    public MongoClient mongoClient() {
//        return new MongoClient(new MongoClientURI(mongoDbUri));
//    }
//}