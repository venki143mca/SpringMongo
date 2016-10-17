package com.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.spring.model.Employee;


//import org.springframework.context.support.GenericXmlApplicationContext;

public class SpringMongoApp {

    private static ApplicationContext ctx;

	public static void main(String[] args) {

	ctx = new GenericXmlApplicationContext("SpringConfig.xml");

	// For Annotation
	/*ApplicationContext ctx =
             new AnnotationConfigApplicationContext(SpringMongoConfig.class);*/
	MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");

	Employee emp = new Employee(1,"mkyong", "password123");

	// save
	//mongoOperation.save(emp);


	Query findUserQuery = new Query();
	findUserQuery.addCriteria(Criteria.where("_id").is(1));
	Employee userA1 = mongoOperation.findOne(findUserQuery, Employee.class, "Employee");
	System.out.println(userA1);

	/*// query to search user
	Query searchUserQuery = new Query(Criteria.where("username").is("mkyong"));

	// find the saved user again.
	User savedUser = mongoOperation.findOne(searchUserQuery, User.class);
	System.out.println("2. find - savedUser : " + savedUser);

	// update password
	mongoOperation.updateFirst(searchUserQuery,
                         Update.update("password", "new password"),User.class);

	// find the updated user object
	User updatedUser = mongoOperation.findOne(searchUserQuery, User.class);

	System.out.println("3. updatedUser : " + updatedUser);

	// delete
	mongoOperation.remove(searchUserQuery, User.class);

	// List, it should be empty now.
	List<User> listUser = mongoOperation.findAll(User.class);
	System.out.println("4. Number of user = " + listUser.size());*/

    }

}