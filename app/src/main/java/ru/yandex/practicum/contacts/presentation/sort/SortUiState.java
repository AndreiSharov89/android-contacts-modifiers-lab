package ru.yandex.practicum.contacts.presentation.sort;

// класс UiState должен иметь package-private доступ
class SortUiState {

    // сделайте поля isApplyEnable и newSelectedSortType приватными
    private boolean isApplyEnable = false;
    private String newSelectedSortType = null;

    // реализуйте get и set методы для обоих полей
    public boolean getIsApplyEnable() {
        return this.isApplyEnable;
    }

    public String getNewSelectedSortType() {
        return this.newSelectedSortType;
    }

    public void setIsApplyEnable(boolean flag) {
        this.isApplyEnable = flag;
    }

    public void setNewSelectedSortType(String type) {
        this.newSelectedSortType = type;
    }
}
