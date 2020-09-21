package javabasics;

import java.util.Arrays;

public class Newsfeed {

    String[] topics = {"Opinion", "Tech", "Science", "Health"};
    int[] views = {0, 0, 0, 0};

    public Newsfeed(){

    }

    public String[] getTopics(){
        return topics;
    }

    public String getTopTopic(){

    }

    public void viewTopic(int topicIndex){

    }

    public static void main(String[] args){
        Newsfeed sampleFeed = new Newsfeed();

        System.out.println("The top topic is "+ sampleFeed.getTopTopic());

        sampleFeed.viewTopic(1);
        sampleFeed.viewTopic(1);
        sampleFeed.viewTopic(3);
        sampleFeed.viewTopic(2);
        sampleFeed.viewTopic(2);
        sampleFeed.viewTopic(1);

        System.out.println("The " + sampleFeed.topics[1] + " topic has been viewed " + sampleFeed.views[1] + " times!");
    }
}