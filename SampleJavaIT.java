// package com.citrus.myproject;

// import org.testng.annotations.Test;

// import static com.consol.citrus.actions.EchoAction.Builder.echo;
// import com.consol.citrus.annotations.CitrusTest;
// import com.consol.citrus.testng.spring.TestNGCitrusSpringSupport;

// /**
//  * This is a sample Java DSL Citrus integration test.
//  *
//  * @author Citrus
//  */
// @Test
// public class SampleJavaIT extends TestNGCitrusSpringSupport {

//     @CitrusTest
//     public void echoToday() {
//         variable("now", "citrus:currentDate()");

//         run(echo("Today is: ${now}"));
//     }

//     @CitrusTest(name = "SampleJavaTest.sayHello")
//     public void sayHello() {
//         run(echo("Hello Citrus!"));
//     }
// }
