package dev.ako.gmb.infra.jwt.impl;

import com.auth0.jwt.interfaces.DecodedJWT;
import dev.ako.gmb.infra.jwt.api.JwtData;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class JwtSimpleServiceUnitTest {

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    static class TestData implements JwtData {
        String name;
        int age;

        @Override
        public Map<String, String> toClaims() {
            return Map.of("name", name, "age", ""+age);
        }
    }

    @Test
    void createJWT() throws NoSuchFieldException {
        JwtSimpleService jwtSimpleService = new JwtSimpleService("secret_key");

        String jwtToken = jwtSimpleService.createJWT(TestData.builder()
                .name("test_name")
                .age(5)
                .build());

        DecodedJWT decodedJWT = jwtSimpleService.decodeToken(jwtToken);

        assertEquals("test_name", decodedJWT.getClaim("name").asString());
        assertEquals("5", decodedJWT.getClaim("age").asString());
    }

    @Test
    void decodeToken() {
    }
}