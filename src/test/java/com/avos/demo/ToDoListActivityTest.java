package com.avos.demo;

import android.app.Activity;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static org.junit.Assert.assertTrue;

@RunWith(RobolectricTestRunner.class)
public class ToDoListActivityTest {

  @org.junit.Test
  public void titleIsCorrect() throws Exception {
    Activity activity = Robolectric.setupActivity(ToDoListActivity.class);
    System.out.println("title="+activity.getTitle().toString());
    assertTrue(activity.getTitle().toString().equals("Deckard"));
  }
  @org.junit.Test
  public void titleIsCorrectError() throws Exception {
    Activity activity = Robolectric.setupActivity(ToDoListActivity.class);
    assertTrue(activity.getTitle().toString().equals("Deckard1"));
  }
  @org.junit.Test
  public void CreateTodoIsCorrectError() throws Exception {
    Activity activity = Robolectric.setupActivity(CreateTodo.class);
    
    
    assertTrue(activity.getTitle().toString().equals("Deckard1"));
  }
}