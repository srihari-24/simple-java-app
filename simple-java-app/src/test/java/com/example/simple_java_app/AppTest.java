package com.example.simple_java_app;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class AppTest {
@Test
public void testGetGreeting() {
assertEquals("Hello, CI/CD World!", App.getGreeting());
}
}