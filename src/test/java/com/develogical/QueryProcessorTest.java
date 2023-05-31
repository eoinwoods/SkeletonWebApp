package com.develogical;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class QueryProcessorTest {

  QueryProcessor queryProcessor = new QueryProcessor();

  @Test
  public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
    assertThat(queryProcessor.process("test"), is(""));
  }

  @Test
  public void knowsAboutShakespeare() throws Exception {
    assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
  }

  @Test
  public void knowsYourName() throws Exception {
    assertThat(queryProcessor.process("What is your name?"), containsString("Back Row Again"));
  }

  @Test
  public void canAddTwoNumbers() throws Exception {
    assertThat(queryProcessor.process("what is 1 plus 2?"), containsString("3"));
  }
  //Which of the following numbers is the largest: 56, 86, 87?
  @Test
  public void canFindLargestNumber()
   throws Exception {
    assertThat(queryProcessor.process("Which of the following numbers is the largest: 56, 86, 87?"), containsString("87"));
  }
}
