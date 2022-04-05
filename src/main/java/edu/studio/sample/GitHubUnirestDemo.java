package edu.studio.sample;

import kong.unirest.Unirest;

public class GitHubUnirestDemo {

    private final static String GitHubGetIssuesURL = "https://api.github.com/repos/CSC8545-Spring2022-Org/maven-lab-csc8545-s22-Sadgunsai23/issues";

    public static void main(String[] args) {
        String getAllIssuesResponse = Unirest.get(GitHubGetIssuesURL).header("Authorization", "Bearer " + args[0])
                .asString().getBody();

        System.out.println("Retrived Issues: " + getAllIssuesResponse);
    }

}
