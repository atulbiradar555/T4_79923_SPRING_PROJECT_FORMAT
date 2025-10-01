package com.fresco.ecommerce.config;

import com.fresco.ecommerce.repository.UserInfoRepository;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserInfoUserDetailsService implements UserDetailsService {


    private UserInfoRepository userRepo;

    @Override
    public UserInfoUserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
