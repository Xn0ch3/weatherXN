package ConsitiGroup.weather.configs.JWT;

import ConsitiGroup.weather.models.Client;
import ConsitiGroup.weather.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService{
    @Autowired
    private ClientRepository clientRepository;

    @Override //Aca sobreescribiremos este metodo para que sea como nosotros queramos
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Client client = clientRepository.findByEmail(username); //Se le pasa un email y devuelve un client

        if (client == null){
            throw new UsernameNotFoundException(username);
        }

        User.UserBuilder builder = org.springframework.security.core.userdetails.User.withUsername(username); // Fully qualify the Spring Security Client
        builder.password(client.getPassword()); // Use the custom client’s password
        builder.roles("CLIENT"); // Assign role

        return builder.build();
    }
}
