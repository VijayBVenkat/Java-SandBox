package org.vijay.designPatterns.builder.example4;

public class Cat {
    private String name;
    private String color;
    private String gender;
    private boolean isVaccinated;

    public Cat(CatBuilder catBuilder) {
        this.name = catBuilder.name;
        this.color = catBuilder.color;
        this.gender = catBuilder.gender;
        this.isVaccinated = catBuilder.isVaccinated;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", gender='" + gender + '\'' +
                ", isVaccinated=" + isVaccinated +
                '}';
    }

    public static class CatBuilder {

        String name;
        String color;
        String gender;
        boolean isVaccinated;

        public CatBuilder setName(String name) {
            this.name = name;
            return this;
        }
        public CatBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public CatBuilder setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public CatBuilder setVaccinated(boolean isVaccinated) {
            this.isVaccinated = isVaccinated;
            return this;
        }
        public Cat buildCat() {
            return new Cat(this);
        }
    }
}
