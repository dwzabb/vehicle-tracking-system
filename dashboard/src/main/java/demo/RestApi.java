package demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApi {

    @Value("${stomp.url}")
    private String stompUrl;

    @RequestMapping("/clientConfig")
    @ResponseBody
    public String config() throws Exception {
        return stompUrl;
    }

}
