package com.learninglogs.dao;

import java.sql.*;
import java.util.ArrayList;

import com.learninglogs.interfaces.TopicDAOInterface;
import com.learninglogs.model.Topic;
import com.learninglogs.util.DatabaseConnection;

public class TopicDAO implements TopicDAOInterface {

    // TODO: Insert a new topic into the database
    // - Get database connection
    // - Prepare INSERT statement with name
    // - Execute update
    // - Retrieve generated ID and set it to Topic object
    // - Return true if successful
    @Override
    public boolean insertTopic(Topic topic) {
        String query = "INSERT INTO topics(name) VALUES (?)";
    	try {
			Connection conn = DatabaseConnection.getConnection();
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, topic.getName());
			int rows = ps.executeUpdate();
			if(rows > 0)
			{
				return true;
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return false;
    }

    // TODO: Fetch all topics from the database
    // - Get database connection
    // - Execute SELECT * FROM topics
    // - Convert each ResultSet row into Topic object
    // - Store in ArrayList and return
    @Override
    public ArrayList<Topic> fetchAllTopics() {
        String query = "SELECT * from topics";
    	ArrayList<Topic> topics = new ArrayList<>();
    	try {
			Connection conn = DatabaseConnection.getConnection();
			PreparedStatement ps = conn.prepareStatement(query);
			ResultSet topicSet = ps.executeQuery();
			while(topicSet.next())
			{
				Topic topic = new Topic(topicSet.getString("name"));
				topics.add(topic);
			}
			
			return topics;
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return topics;
    }
}
