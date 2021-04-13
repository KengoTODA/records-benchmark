package jp.skypencil.java;

record RecordWith1IntHardcode(int value) {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RecordWith1IntHardcode that = (RecordWith1IntHardcode) o;

        return value == that.value;
    }

    @Override
    public int hashCode() {
        return value;
    }
}
