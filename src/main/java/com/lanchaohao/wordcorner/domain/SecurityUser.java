//package com.lanchaohao.wordcorner.domain;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import java.util.ArrayList;
//import java.util.Collection;
//
//
//public class SecurityUser extends Users implements UserDetails {
//    public SecurityUser(Users suser) {
//        if (suser != null) {
//            this.setId(suser.getId());
//            this.setUsername(suser.getUsername());
//            this.setEmail(suser.getEmail());
//            this.setPassword(suser.getPassword());
//            this.setUsertype(suser.getUsertype());
//        }
//
//    }
//    @Override
//    public Collection<GrantedAuthority> getAuthorities() {
//
//        Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
//        String auth = "ROLE_ADMIN";
//        int utype = this.getUsertype();
//        if(utype==2){
//            auth = "ROLE_USER";
//        }
//        if(utype==3){
//            auth = "ROLE_TEACHER";
//        }
//        SimpleGrantedAuthority authority = new SimpleGrantedAuthority(auth);
//        authorities.add(authority);
//        return authorities;
//
//    }
//
//    @Override
//    public String getPassword() {
//        return super.getPassword();
//
//    }
//
//    @Override
//    public String getUsername() {
//        return super.getUsername();
//
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
//}