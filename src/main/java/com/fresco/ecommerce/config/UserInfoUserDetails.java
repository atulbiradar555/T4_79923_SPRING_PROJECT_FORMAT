package com.fresco.ecommerce.config;

import com.fresco.ecommerce.models.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;


import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class UserInfoUserDetails implements UserDetails {

    @Autowired
    private UserInfo userInfo;

    private String username;
    private String password;
    private List<GrantedAuthority> authorities;

    // Constructor to initialize from UserInfo
    public UserInfoUserDetails(UserInfo userInfo) {
        this.username = userInfo.getUsername();   // Assuming 'name' is username
        this.password = userInfo.getPassword();
        // Convert role into authority
        this.authorities = Collections.singletonList(new SimpleGrantedAuthority(userInfo.getRoles()));
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }


}
//    @Autowired
//    private UserInfo userInfo;
//
//    public UserInfo getUserInfo() {
//        return userInfo;
//    }}
//
//    private String name;
//
//    private String password;
//
//    @Override
//    private List<GratedAuthority> authorities;
//
//    public UserInfoUserDetails(UserInfo userInfo){
//
//    }
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return null;
//    }
//
//
//    @Override
//    public String getPassword() {
//        return null;}
//    @Override
//    public String getUsername() {return null;}
//    @Override
//    public boolean isAccountNonExpired() {return true;}
//    @Override
//    public boolean isAccountNonLocked(){return true;}
//    @Override
//    public boolean isCredentialsNonExpired() { return true;}
//
//    @Override
//    public boolean isEnabled(){return true;}

