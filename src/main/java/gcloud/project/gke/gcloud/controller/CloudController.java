package gcloud.project.gke.gcloud.controller;

import gcloud.project.gke.gcloud.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/cloud")
public class CloudController {

    @GetMapping("/get-user")
    public ResponseEntity<User> getUser() {
        User user = new User();
        user.setNome("John Doe");
        user.setIdade(30);
        log.info("User: {}", user);
        return ResponseEntity.ok(user);
    }
}
