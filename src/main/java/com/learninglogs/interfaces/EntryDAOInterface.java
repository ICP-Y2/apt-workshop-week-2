package com.learninglogs.interfaces;

import java.util.ArrayList;
import java.util.HashMap;

import com.learninglogs.model.Entry;

public interface EntryDAOInterface {
    // Enter learning entry (TODO): Insert entry into database
    boolean insertEntry(Entry entry);

    // Enter learning entry (TODO): Fetch all entries for a topic
    ArrayList<Entry> fetchAllEntries(); 
    
    // Enter learning entry (TODO - Bonus): Fetch entries by topic
    // Return map of topic id and Entry object for a given topic ID
    HashMap<Integer, Entry> fetchEntriesByTopic(String topic);
}
