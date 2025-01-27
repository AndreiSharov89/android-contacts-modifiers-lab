package ru.yandex.practicum.contacts.presentation.filter;

import java.util.Collections;
import java.util.Set;

import ru.yandex.practicum.contacts.model.ContactType;

class FilterContactUiState {
    private boolean isApplyEnable = false;
    private Set<ContactType> newSelectedContactTypes = Collections.emptySet();

    public boolean getIsApplyEnable() {
        return this.isApplyEnable;
    }

    public Set<ContactType> getNewSelectedContactTypes() {
        return this.newSelectedContactTypes;
    }

    public void setIsApplyEnable(boolean flag) {
        this.isApplyEnable = flag;
    }

    public void setNewSelectedContactTypes(Set<ContactType> type) {
        this.newSelectedContactTypes = type;
    }
}
