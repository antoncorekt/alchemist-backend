package dev.ako.gmb.infra.jwt.api;

import java.util.Map;

/**
 * @author Anton Kozlovskyi
 * @date 28 Jan 2020
 */
public interface JwtData {

    Map<String, String> toClaims();

}
