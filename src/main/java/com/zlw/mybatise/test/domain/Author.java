package com.zlw.mybatise.test.domain;

/**
 * @Title
 * @Package com.zlw.mybatise.test.domain
 * @Description:
 * @Author zlw
 * @Date 2015/12/30
 * @Version v1.0
 */
public class Author {

    private Integer id;
    private String username;
    private String password;
    private String email;
    private String bio;
    private String favouriteSection;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getFavouriteSection() {
        return favouriteSection;
    }

    public void setFavouriteSection(String favouriteSection) {
        this.favouriteSection = favouriteSection;
    }
}
