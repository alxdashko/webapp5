package ua.leksstudio.webapp.model;

/**
 * Created by alxdashko on 15.11.2016.
 */
public enum ContactType {
    PHONE("Тел."),
    HOME_PHONE("Домашний"),
    SKYPE("Skype"),
    EMAIL("Почта");

    private String title;

    ContactType(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
