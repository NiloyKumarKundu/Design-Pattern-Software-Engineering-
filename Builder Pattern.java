public class Meal {
    private String appetizer;
    private String mainDish;
    private String salad;
    private String desert;
    private String drink;

    private Meal(Builder builder) {
        this.appetizer = builder.appetizer;
        this.desert = builder.desert;
        this.drink = builder.drink;
        this.mainDish = builder.mainDish;
        this.salad = builder.salad;
    }


    public static Builder builder() {
        return new Builder();
    }


    public static class Builder {
        private String appetizer;
        private String mainDish;
        private String salad;
        private String desert;
        private String drink;

        public Builder mainDish(String mainDish) {
            this.mainDish = mainDish;
            return this;
        }

        public Builder salad(String salad) {
            this.salad = salad;
            return this;
        }

        public Builder desert(String desert) {
            this.desert = desert;
            return this;
        }

        public Builder drink(String drink) {
            this.drink = drink;
            return this;
        }

        public Builder appetizer(String appetizer) {
            this.appetizer = appetizer;
            return this;
        }

        public Meal build() {
            return new Meal(this);
        }
    }

    public static void main(String[] args) {
        Builder b = builder().salad("This salad is too good.")
                .desert("I love to eat desert.")
                .drink("I am drinking water.")
                .appetizer("I don't know that is appetizer.")
                .mainDish("Rice is our main dish.");
        
        System.out.println(b.drink);
        System.out.println(b.desert);
        System.out.println(b.salad);
        System.out.println(b.appetizer);
        System.out.println(b.mainDish);
    }
}

