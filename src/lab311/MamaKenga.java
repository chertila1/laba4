package lab311;

public class MamaKenga {
    protected String name = "Мама Кенга";

    public String message() {
        return child.forest();
    }
    class Child {
        protected String name = "Крошка Ру";

        public String forest() {
            return "в Лесу: " + MamaKenga.this.name + " и " + name;
        }
    }
    Child child = new Child();

}
