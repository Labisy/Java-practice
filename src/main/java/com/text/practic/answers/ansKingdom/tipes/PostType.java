package com.text.practic.answers.ansKingdom.tipes;

public enum PostType {
    NOT_A_MEMBER("Не состоит"),
    RECRUIT("Рекрут"),
    ADEPT("Адепт"),
    MASTER("Мастер"),
    HEAD("Глава")
    ;
    private final String post;

    PostType(String post) {
        this.post = post;
    }

    public String getPost() {
        return post;
    }
}
