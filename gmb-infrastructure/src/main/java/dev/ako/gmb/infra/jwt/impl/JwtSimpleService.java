package dev.ako.gmb.infra.jwt.impl;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.JWTCreator.Builder;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import dev.ako.gmb.infra.jwt.api.JwtData;
import dev.ako.gmb.infra.jwt.api.JwtService;
import lombok.Data;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Anton Kozlovskyi
 * @date 28 Jan 2020
 */
@Log4j2
@Service
public class JwtSimpleService implements JwtService{

    private final String secretKey;

    public JwtSimpleService( @Value("${auth.secret}") String secretKey) {
        this.secretKey = secretKey;
    }

    public <T extends JwtData> String createJWT(T data){
        final Algorithm algorithmHS = Algorithm.HMAC256(secretKey);

        final Builder jwtBuilder = JWT.create();
        final Map<String, String> toClaims = data.toClaims();
        toClaims.forEach(jwtBuilder::withClaim);

        final String jtwToken = jwtBuilder.sign(algorithmHS);
        log.debug("Create jtwToken " + jtwToken + " from claims " + toClaims.toString());

        return jwtBuilder.sign(algorithmHS);
    }

    public DecodedJWT decodeToken(String jwtToken){
        final DecodedJWT jwt = JWT.decode(jwtToken);
        log.debug("jwtToken " + jwtToken + " decoded successful " +
                jwt.getClaims().entrySet().
                stream()
                .map(x->x.getKey()+":"+x.getValue().asString())
                .collect(Collectors.joining("|")));
        return jwt;
    }

}
