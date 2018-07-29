package com.constantine.simplebidder;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

@RestController
@RequestMapping("/")
public class BidController {


    @RequestMapping(
            value = "/getBid/{id}",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE
    )
    public @ResponseBody
    ResponseEntity<String> getBid(@PathVariable("id") int id, @RequestBody BidRequest bidRequest) {
        switch (id) {
            case 1:
                return ResponseEntity.ok(readResourceToString("bidder1Response.json"));
            case 2:
                return ResponseEntity.ok(readResourceToString("bidder2Response.json"));
            case 3:
                return ResponseEntity.ok(readResourceToString("bidder3Response.json"));
            default:
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    private String readResourceToString(String name) {
        try {
            URI uri = Objects.requireNonNull(this.getClass().getClassLoader().getResource(name)).toURI();
            Path path = Paths.get(uri);
            return Files.readAllLines(path).stream().reduce("", String::concat);
        } catch (Exception error) {
            throw new RuntimeException(error);
        }
    }



}
