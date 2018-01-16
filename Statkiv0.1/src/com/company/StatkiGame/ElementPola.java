package com.company.StatkiGame;

public class ElementPola {

    private StatusPola status;

    public ElementPola() {
        status = StatusPola.PUSTE;
    }

    public StatusPola getStatus() {
        return status;
    }

    public void setStatus(StatusPola status) {
        this.status = status;
    }
}
