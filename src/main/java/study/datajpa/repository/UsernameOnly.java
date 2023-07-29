package study.datajpa.repository;

import lombok.Value;

public interface UsernameOnly {
//    @Value("#{target.username + ' ' + target.age + ' ' + target.team.name}")
    String getUsername();
}
