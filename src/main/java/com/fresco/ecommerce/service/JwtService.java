package com.fresco.ecommerce.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Date;
import java.util.Map;

@Service
public class JwtService {

    public static final String SECRET "5367566859783373367639792F423F4528482840625165546857605471347L";


    public static final long JWT_TOKEN_VALIDITY = 900000;


    public String extractUsername(String token) {

        return null;

    }

    public Date extractExpiration(String token) {
        return null;
    }


    public <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {


        return null;
    }


    private Claims extractAllClaims(String token) {
        return null;
    }


    private Boolean isTokenExpired(String token) {
        return null;
    }


    public Boolean validateToken(String token, UserDetails userDetails) {
        return null;
    }


    public String generateToken(String userName) {
        return null;
    }

    private String createToken(Map<String, Object> claims, String userName) { return null; }

    private Key getSignKey(){return null;}
}
