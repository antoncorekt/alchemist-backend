package dev.ako.gmb.infra.game.entity;

import dev.ako.gmb.infra.auth.entity.UserAccount;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Anton Kozlovskyi
 * @date 30 Jan 2020
 */
@Document
@Data
public class GameProcess {

    @Id
    private String id;

    private UserAccount userAccount;
}
