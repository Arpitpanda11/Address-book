

import java.util.List;
import java.util.Optional;

import io.github.julianjupiter.addressbook.domain.Contact;

public interface ContactService {

    List<Contact> findAll();

    Optional<Contact> findById(long id);

    void save(Contact contact);

    void update(Contact contact);

    void delete(long id);

}
