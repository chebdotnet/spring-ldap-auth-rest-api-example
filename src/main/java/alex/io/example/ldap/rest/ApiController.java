package alex.io.example.ldap.rest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;
import static org.springframework.http.HttpStatus.ACCEPTED;

@RestController
public class ApiController {

    @GetMapping(value = "/api/data", produces = "application/json")
    @ResponseStatus(code = ACCEPTED)
    public List<String> index() {
        return asList("dummy item 1", "dummy item 2", "dummy item 3");
    }

}
