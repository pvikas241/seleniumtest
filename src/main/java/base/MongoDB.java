package base;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class MongoDB {

	public static void main(String[] args) {
        MongoClient mongoClient = new MongoClient();
        DB db = mongoClient.getDB("USER");
        DBCollection coll = db.getCollection("Login_otp");
        
        
    }
}
