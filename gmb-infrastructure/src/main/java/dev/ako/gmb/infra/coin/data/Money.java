package dev.ako.gmb.infra.coin.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Anton Kozlovskyi
 * @date 30 Jan 2020
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Money {

    private String currency;
    private long value;

}
