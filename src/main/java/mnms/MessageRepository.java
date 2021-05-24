package mnms;

import io.micronaut.context.annotation.Executable;
// import io.micronaut.data.annotation.*;
import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.repository.CrudRepository;

@JdbcRepository(dialect = Dialect.POSTGRES)
interface MessageRepository extends CrudRepository<Message, Long> {
    @Executable
    Message find(String name);
}