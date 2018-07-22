package com.example.uaa.web;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Igor Rybak
 * @since 21-Jul-2018
 */
@RestController
public class UserInfoController {
  @GetMapping("/api/profile")
  public String getProfile() {
    return SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
  }

/*
  @GetMapping("/user")
  public Map<String, String> getUserInfo(Principal principal){
    if (principal instanceof OAuth2Authentication) {
       return (Map<String, String>) ((OAuth2Authentication) principal).getDetails();
    }
    return null;
  }
*/
}
