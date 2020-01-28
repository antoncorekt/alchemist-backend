package dev.ako.gmb.infra.jwt.impl;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.JWTCreator.Builder;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import dev.ako.gmb.infra.jwt.api.JwtData;
import dev.ako.gmb.infra.jwt.api.JwtService;
import org.springframework.stereotype.Service;

/**
 * @author Anton Kozlovskyi
 * @date 28 Jan 2020
 */
@Service
public class JwtSimpleService implements JwtService{

    public <T extends JwtData> String createJWT(T data){

        final Algorithm algorithmHS = Algorithm.HMAC256("Secret");

        Builder jwtBuilder = JWT.create();

        data.toClaims().forEach(jwtBuilder::withClaim);

        return jwtBuilder.sign(algorithmHS);
    }

    public DecodedJWT decodeToken(String jwtToken){
        DecodedJWT jwt = JWT.decode(jwtToken);

        return jwt;
    }

}
