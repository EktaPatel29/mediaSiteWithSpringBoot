//package com.example.media.Service;
//
//  import org.springframework.beans.factory.annotation.Autowired; import
//  org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder; import
//  org.springframework.stereotype.Service;
//  
//  import com.example.media.Repository.UserRepository;
//  
//  @Service public class UserServiceImpl implements UserService{
//  
//  @Autowired UserRepository userRepository;
//  
//  @Override public String getHashPassword(String password) {
//  BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(); String
//  hashedPassword = passwordEncoder.encode(password);
//  
//  System.out.println(hashedPassword); return hashedPassword; }
//  
//  }
// 