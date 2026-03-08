package com.learninglogs.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;

import com.learninglogs.model.Entry;
import com.learninglogs.interfaces.EntryDAOInterface;
import com.learninglogs.util.DatabaseConnection;

public class EntryDAO implements EntryDAOInterface {

    // TODO: Insert a new entry into the database
    // - Get database connection
    // - Prepare INSERT SQL statement
    // - Set topic_id and text parameters
    // - Execute update and return true if successful
   

    // TODO: Fetch all entries from the database
    // - Get database connection
    // - Execute query to get all entries
    // - Convert ResultSet rows into Entry objects
    // - Store them in ArrayList and return
    

    // TODO: Fetch entries by topic name
    // - Join entries and topics tables
    // - Filter using topic name
    // - Convert ResultSet into Entry objects
    // - Store in HashMap<id, Entry> and return
     
}
