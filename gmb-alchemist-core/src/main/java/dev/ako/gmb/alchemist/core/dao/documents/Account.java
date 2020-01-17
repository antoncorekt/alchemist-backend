package dev.ako.gmb.alchemist.core.dao.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Anton Kozlovskyi
 * @date 17 Jan 2020
 */
@Document
@Data
public class Account {

    @Id
    private String id;
    private String name;
}
