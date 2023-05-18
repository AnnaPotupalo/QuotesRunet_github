package ry.synA.quotes.models;

import javax.persistence.*;

@Entity
@Table(name = "\"Chats\"")
public class Chat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "\"chatId\"", nullable = false)
    private Long chatId;

    @Column(name = "\"lastId\"", nullable = false)
    private Integer lastId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getChatId() {
        return chatId;
    }

    public void setChatId(Long chatId) {
        this.chatId = chatId;
    }

    public Integer getLastId() {
        return lastId;
    }

    public void setLastId(Integer lastID) {
        this.lastId = lastID;
    }

}