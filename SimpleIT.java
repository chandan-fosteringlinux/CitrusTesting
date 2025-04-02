package com.citrus.myproject;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static com.consol.citrus.actions.EchoAction.Builder.echo;
import com.consol.citrus.annotations.CitrusTest;
import com.consol.citrus.junit.jupiter.CitrusExtension;
import com.example.LoggingService;

@ExtendWith(CitrusExtension.class)
public class SimpleIT {

    LoggingService obj = new LoggingService();

    @Test
    @CitrusTest
    public void test() {
        System.out.println("---------hello citrus!");
    }


    @Test
    @CitrusTest
    public void testLogService(){
        System.out.println("------------------before the log called from sysout");

        obj.logs("########################sending the log message");

        System.out.println("--------------------after logs from sysout");
    }
}


// package com.citrus.myproject;

// import com.consol.citrus.annotations.CitrusTest;
// import com.consol.citrus.junit.jupiter.CitrusExtension;
// import com.example.LoggingService;
// import org.junit.jupiter.api.Test;
// import org.junit.jupiter.api.extension.ExtendWith;
// import static com.consol.citrus.actions.EchoAction.Builder.echo;

// @ExtendWith(CitrusExtension.class)
// public class SimpleIT {

//     LoggingService obj = new LoggingService();

//     @Test
//     @CitrusTest
//     public void test(TestRunner runner) {
//         runner.run(echo("---------hello citrus!"));
//     }

//     @Test
//     @CitrusTest
//     public void testLogService(TestRunner runner) {
//         runner.run(echo("before the log called"));
//         System.out.println("------------------before the log called from sysout");
        
//         obj.logs("########################sending the log message");
        
//         runner.run(echo("after logs"));
//         System.out.println("--------------------after logs from sysout");
//     }
// }

