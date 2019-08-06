package com.udacity.lsolier;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ListExampleTest {

  @Test
  public void test1() {

    List<String> demo = Arrays.asList("bcd", "abc", "cde");

    List<String>[] example = ListExample.groupString(demo);

    for (List<String> oneList: example) {
      System.out.println(oneList);
    }

    Assert.assertNotNull(example);
  }

  @Test
  public void test2() {

    List<String> demo = Arrays.asList("abc", "bcd", "bbb", "ace", "snb", "aaaa", "bbbbb", "eeee");

    List<String>[] example = ListExample.groupString(demo);

    for (List<String> oneList: example) {
      System.out.println(oneList);
    }

    Assert.assertNotNull(example);
  }

}
