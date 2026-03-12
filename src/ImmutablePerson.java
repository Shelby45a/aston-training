final class ImmutablePerson {

    private final String name;
    private final int age;
    private final MutableData data;

    ImmutablePerson(String name, int age, MutableData data) {

        this.name = name;
        this.age = age;
        this.data = new MutableData(data.value);
    }

    MutableData getData() {
        return new MutableData(data.value);
    }
}