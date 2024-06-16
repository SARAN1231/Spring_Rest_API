package com.saran.REST_API;

import jakarta.websocket.server.PathParam;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {

    @GetMapping("/")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String sayhello() {
        return "Hello from First Controller";
    }


    @PostMapping("/post")
    public String post( @RequestBody Order order) {
        return "Req accepted" + order.toString();
    }

    @PostMapping("/post-record")
    public String postrecords( @RequestBody OrderRecord orderRecord) {
        return "Req accepted" + orderRecord.toString();
    }

//http://localhost:8080/hello/saran
    @GetMapping("/hello/{user-name}")
    public String pathvar( @PathVariable("user-name") String userName) {
        return "Hello from First Controller and my val = " + userName;
    }
// http://localhost:8080/hello?user-name=saran&initial=P
    @GetMapping("/hello")
    public String paramvar(
            @RequestParam("user-name") String userName,
            @RequestParam("initial") String initial
            ) {
        return "Hello from First Controller and my val = " + userName + initial;
    }

}
