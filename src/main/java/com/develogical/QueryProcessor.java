package com.develogical;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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

    if (query.toLowerCase().contains("is the largest")) {
      String[] tokens = query.replace("?","").replace(",","").split(" ");
      List<Integer> sortedlist = Arrays.asList(Integer.valueOf(tokens[8]),
              Integer.valueOf(tokens[9]), Integer.valueOf(tokens[10]));
      // sort list in natural order
      Collections.sort(sortedlist);
      return sortedlist.get(sortedlist.size()-1).toString();
    }

    return "";
  }
}
