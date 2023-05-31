package com.develogical;

public class QueryProcessor {

  public String process(String query) {

    System.out.println("Received query:" + query);

    if (query.toLowerCase().contains("shakespeare")) {
      return "William Shakespeare (26 April 1564 - 23 April 1616) was an "
          + "English poet, playwright, and actor, widely regarded as the greatest "
          + "writer in the English language and the world's pre-eminent dramatist.";
    }

    if (query.toLowerCase().contains("what is your name?")) {
      return "Back Row Again";
    }

    if (query.toLowerCase().contains("plus ")) {
      String[] tokens = query.replace("?","").split(" ");
        int sum = Integer.parseInt(tokens[2]) + Integer.parseInt(tokens[4]);
      return Integer.toString(sum);
    }

    return "";
  }
}
