public class Usuario {
    String username;
    String email;
    String password;

   /* Sobrescreve o método toString() para retornar uma representação em texto
   do objeto, exibindo os valores dos atributos username, email e password. */
    public String toString() {
        return "{username: " + username + ", email: " + email + ", password: " + password + "}";
    }

    @Override // Sobrescreve o método hashCode() para gerar um código hash baseado no atributo username.
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((username == null) ? 0 : username.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Usuario other = (Usuario) obj;
        if (username == null) {
            if (other.username != null)
                return false;
        } else if (!username.equals(other.username))
            return false;
        return true;
    }

     
}
