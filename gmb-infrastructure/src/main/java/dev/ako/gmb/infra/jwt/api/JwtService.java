package dev.ako.gmb.infra.jwt.api;

import com.auth0.jwt.interfaces.DecodedJWT;

/**
 * @author Anton Kozlovskyi
 * @date 28 Jan 2020
 */
public interface JwtService {

    DecodedJWT decodeToken(String jwtToken);
    <T extends JwtData> String createJWT(T data);

}
