package dev.ako.gmb.alchemist.core.dao.repositories;

import dev.ako.gmb.alchemist.core.dao.documents.Account;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author Anton Kozlovskyi
 * @date 17 Jan 2020
 */
public interface AccountCrudRepository extends ReactiveCrudRepository<Account, String> {

    Flux<Account> findAllByName(String name);

}
