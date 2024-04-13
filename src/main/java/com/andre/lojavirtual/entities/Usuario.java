package com.andre.lojavirtual.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serial;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "usuario")
@PrimaryKeyJoinColumn(name = "id")
public class Usuario implements UserDetails {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String login;

    private String senha;

    @Temporal(TemporalType.DATE)
    private Date dataAtualSenha;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinTable(name="usuario_acesso",
            joinColumns = @JoinColumn(name="usuario_id",unique = false, foreignKey = @ForeignKey(name = "usuario_fk",
                    value = ConstraintMode.CONSTRAINT)),
            inverseJoinColumns = @JoinColumn(name="acesso_id")
    )
    private List<Acesso> acessos;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.acessos;
    }

    @Override
    public String getPassword() {
        return this.senha;
    }

    @Override
    public String getUsername() {
        return this.login;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
